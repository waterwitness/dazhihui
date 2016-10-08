package com.android.thinkive.framework.network.http;

import android.text.TextUtils;
import com.android.thinkive.framework.cache.Cache.Entry;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.network.CacheType;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.storage.IStorage;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.android.thinkive.framework.util.DataSignHelper;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Request.Priority;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonRequest
  extends Request<JSONObject>
{
  protected static String DEFAULT_CHARSET = "utf-8";
  protected static final int GZIP_RESPONSE_BODY_HEADER = 8075;
  protected static final String SET_COOKIE_KEY = "Set-Cookie";
  protected static final int TIMEOUT = 60000;
  protected String COOKIE_KEY = "Cookie";
  private Response.Listener<JSONObject> mListener;
  private final JSONObject mParam;
  private RequestBean mRequestBean;
  private String mRequestKey;
  private RetryPolicy mRetryPolicy;
  private String mUrl;
  
  public JsonRequest(String paramString, int paramInt, JSONObject paramJSONObject, RequestBean paramRequestBean, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    this(paramString, paramInt, paramJSONObject, paramListener, paramErrorListener);
    this.mRequestBean = paramRequestBean;
  }
  
  public JsonRequest(String paramString, int paramInt, JSONObject paramJSONObject, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    super(paramInt, paramString, paramErrorListener);
    this.mUrl = paramString;
    this.mListener = paramListener;
    this.mParam = paramJSONObject;
    this.COOKIE_KEY = FormatUtil.formatUrlToKey(paramString);
    Log.d("request COOKIE_KEY = " + this.COOKIE_KEY);
    this.mRetryPolicy = new DefaultRetryPolicy(60000, 1, 1.0F);
    setRetryPolicy(this.mRetryPolicy);
    setShouldCache(false);
  }
  
  @Deprecated
  public JsonRequest(String paramString, JSONObject paramJSONObject, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    this(paramString, 1, paramJSONObject, paramListener, paramErrorListener);
  }
  
  private String getRealString(NetworkResponse paramNetworkResponse)
  {
    int i = 1;
    Object localObject = paramNetworkResponse.data;
    int j = localObject[0];
    j = localObject[1];
    StringBuilder localStringBuilder;
    if (getShort((byte[])localObject) == 8075)
    {
      localStringBuilder = new StringBuilder();
      if (i == 0) {}
    }
    else
    {
      for (;;)
      {
        try
        {
          localObject = new GZIPInputStream(new ByteArrayInputStream((byte[])localObject));
          localBufferedReader = new BufferedReader(new InputStreamReader((InputStream)localObject), 1024);
          paramNetworkResponse = localBufferedReader.readLine();
          if (paramNetworkResponse != null) {
            continue;
          }
          ((InputStream)localObject).close();
          localBufferedReader.close();
        }
        catch (Exception paramNetworkResponse)
        {
          BufferedReader localBufferedReader;
          paramNetworkResponse.printStackTrace();
          continue;
        }
        return localStringBuilder.toString();
        i = 0;
        break;
        localStringBuilder.append(paramNetworkResponse);
        paramNetworkResponse = localBufferedReader.readLine();
      }
    }
    paramNetworkResponse = new String((byte[])localObject, HttpHeaderParser.parseCharset(paramNetworkResponse.headers, DEFAULT_CHARSET));
    return paramNetworkResponse;
  }
  
  private int getShort(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] << 8 | paramArrayOfByte[1] & 0xFF;
  }
  
  private void saveDataCache(NetworkResponse paramNetworkResponse)
  {
    Cache.Entry localEntry;
    if ((this.mRequestBean != null) && (this.mRequestBean.shouldCache()))
    {
      localEntry = new Cache.Entry();
      localEntry.data = paramNetworkResponse.data;
      localEntry.ttl = (this.mRequestBean.getCacheTimeout() + System.currentTimeMillis());
      paramNetworkResponse = NetWorkService.getInstance().buildCacheKey(this.mUrl, this.mRequestBean.getParam());
      if ((this.mRequestBean.getCacheType() != CacheType.DISK) && (this.mRequestBean.getCacheType() != CacheType.DISKANDUPDATE) && (this.mRequestBean.getCacheType() != CacheType.DISK_W)) {
        break label121;
      }
      NetWorkService.getInstance().putCache(paramNetworkResponse, localEntry, this.mRequestBean.getCacheType());
    }
    label121:
    while ((this.mRequestBean.getCacheType() != CacheType.MEMORY) && (this.mRequestBean.getCacheType() != CacheType.MEMORYANDUPDATE) && (this.mRequestBean.getCacheType() != CacheType.MEMORY_W)) {
      return;
    }
    NetWorkService.getInstance().putCache(paramNetworkResponse, localEntry, this.mRequestBean.getCacheType());
  }
  
  public void addSessionCookie(Map<String, String> paramMap)
  {
    String str = new MemoryStorage().loadData(this.COOKIE_KEY);
    if (!TextUtils.isEmpty(str))
    {
      Log.d("add session fullcookie to header: " + str);
      paramMap.put("Cookie", str);
    }
  }
  
  public void deliverError(VolleyError paramVolleyError)
  {
    super.deliverError(paramVolleyError);
    if (!TextUtils.isEmpty(this.mRequestKey)) {
      HttpService.getInstance().removeRequestToList(this.mRequestKey);
    }
  }
  
  protected void deliverResponse(JSONObject paramJSONObject)
  {
    if (this.mListener != null)
    {
      if (this.mRequestBean != null)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.mRequestBean.getStartTime();
        Object localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = ((SimpleDateFormat)localObject).format(new Date(l2));
        localObject = ((SimpleDateFormat)localObject).format(new Date(l1));
        Log.e("http请求 = " + this.mRequestBean.getParam() + " 结束！" + " 请求开始时间:" + str + " 当前时间:" + (String)localObject + " ms" + " 总耗时:" + (l1 - l2));
      }
      this.mListener.onResponse(paramJSONObject);
    }
    if (!TextUtils.isEmpty(this.mRequestKey)) {
      HttpService.getInstance().removeRequestToList(this.mRequestKey);
    }
  }
  
  public Map<String, String> getHeaders()
  {
    Object localObject1 = super.getHeaders();
    if ((localObject1 == null) || (((Map)localObject1).equals(Collections.emptyMap()))) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      addSessionCookie((Map)localObject1);
      Object localObject2;
      if ((this.mRequestBean != null) && (this.mRequestBean.getHeader() != null))
      {
        localObject2 = this.mRequestBean.getHeader().entrySet().iterator();
        if (((Iterator)localObject2).hasNext()) {}
      }
      else
      {
        localObject2 = ConfigManager.getInstance().getSystemConfigValue("charset");
        if (!TextUtils.isEmpty((CharSequence)localObject2)) {
          break label213;
        }
        ((Map)localObject1).put("charset", DEFAULT_CHARSET);
        label106:
        localObject2 = ((Map)localObject1).keySet().iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject2).hasNext())
        {
          return (Map<String, String>)localObject1;
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          ((Map)localObject1).put((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
          Log.d("put additional http request header; key = " + (String)((Map.Entry)localObject3).getKey() + " value = " + (String)((Map.Entry)localObject3).getValue());
          break;
          label213:
          ((Map)localObject1).put("charset", localObject2);
          break label106;
        }
        Object localObject3 = (String)((Iterator)localObject2).next();
        String str = (String)((Map)localObject1).get(localObject3);
        Log.d("http headers key = " + (String)localObject3 + "; value = " + str);
      }
    }
  }
  
  protected Map<String, String> getParams()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.mParam.keys();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if ((this.mRequestBean == null) || (!this.mRequestBean.isShouldSign())) {
          break;
        }
        return DataSignHelper.generateSignDataMap(localHashMap);
      }
      String str = (String)localIterator.next();
      try
      {
        localHashMap.put(str, URLEncoder.encode(this.mParam.getString(str), "utf-8"));
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    return localHashMap;
  }
  
  public Request.Priority getPriority()
  {
    if (this.mRequestBean != null) {
      return this.mRequestBean.getPriority();
    }
    return super.getPriority();
  }
  
  protected Response<JSONObject> parseNetworkResponse(NetworkResponse paramNetworkResponse)
  {
    saveSessionCookie(paramNetworkResponse.headers);
    try
    {
      String str = getRealString(paramNetworkResponse);
      saveDataCache(paramNetworkResponse);
      paramNetworkResponse = Response.success(new JSONObject(str), HttpHeaderParser.parseCacheHeaders(paramNetworkResponse));
      return paramNetworkResponse;
    }
    catch (JSONException paramNetworkResponse)
    {
      paramNetworkResponse.printStackTrace();
    }
    return Response.error(new ParseError(paramNetworkResponse));
  }
  
  public void saveSessionCookie(Map<String, String> paramMap)
  {
    String str;
    Object localObject2;
    Object localObject1;
    int i;
    if (paramMap.containsKey("Set-Cookie"))
    {
      str = (String)paramMap.get("Set-Cookie");
      localObject2 = str.split(";");
      localObject1 = (LinkedHashMap)HttpService.sCookieMap.get(this.COOKIE_KEY);
      paramMap = (Map<String, String>)localObject1;
      if (localObject1 == null) {
        paramMap = new LinkedHashMap();
      }
      i = 0;
      if (i < localObject2.length) {
        break label170;
      }
      HttpService.sCookieMap.put(this.COOKIE_KEY, paramMap);
      paramMap = paramMap.entrySet().iterator();
      localObject1 = new StringBuilder();
    }
    for (;;)
    {
      if (!paramMap.hasNext())
      {
        paramMap = ((StringBuilder)localObject1).substring(0, ((StringBuilder)localObject1).length() - 1);
        Log.d("save http header fullcookie = " + paramMap + " cookie = " + str);
        new MemoryStorage().saveData(this.COOKIE_KEY, paramMap);
        return;
        label170:
        localObject1 = localObject2[i].split("=");
        if (localObject1.length >= 2) {
          paramMap.put(localObject1[0], localObject1[1]);
        }
        for (;;)
        {
          i += 1;
          break;
          paramMap.put(localObject1[0], null);
        }
      }
      Object localObject3 = (Map.Entry)paramMap.next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      if (localObject3 == null) {
        ((StringBuilder)localObject1).append((String)localObject2).append(";");
      } else {
        ((StringBuilder)localObject1).append((String)localObject2).append("=").append((String)localObject3).append(";");
      }
    }
  }
  
  public void setRequestKey(String paramString)
  {
    this.mRequestKey = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\JsonRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */