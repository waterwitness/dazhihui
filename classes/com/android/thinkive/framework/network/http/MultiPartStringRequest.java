package com.android.thinkive.framework.network.http;

import android.text.TextUtils;
import com.android.thinkive.framework.storage.IStorage;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.entity.mime.content.FileBody;
import org.json.JSONException;
import org.json.JSONObject;

public class MultiPartStringRequest
  extends Request<JSONObject>
  implements MultiPartRequest
{
  protected static final String SET_COOKIE_KEY = "Set-Cookie";
  protected String COOKIE_KEY = "Cookie";
  private Map<String, FileBody> fileUploads = new HashMap();
  private final Response.Listener<JSONObject> mListener;
  private final ProgressEntity.ProgressListener mProgressListener;
  private String mUrl;
  private Map<String, String> stringUploads = new HashMap();
  
  public MultiPartStringRequest(String paramString, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    super(1, paramString, paramErrorListener);
    this.mUrl = paramString;
    this.COOKIE_KEY = FormatUtil.formatUrlToKey(paramString);
    Log.d("request COOKIE_KEY = " + this.COOKIE_KEY);
    this.mListener = paramListener;
    this.mProgressListener = null;
  }
  
  public MultiPartStringRequest(String paramString, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener, ProgressEntity.ProgressListener paramProgressListener)
  {
    super(1, paramString, paramErrorListener);
    this.mUrl = paramString;
    this.mListener = paramListener;
    this.COOKIE_KEY = FormatUtil.formatUrlToKey(paramString);
    Log.d("request COOKIE_KEY = " + this.COOKIE_KEY);
    this.mProgressListener = paramProgressListener;
  }
  
  public void addFileUpload(String paramString, FileBody paramFileBody)
  {
    this.fileUploads.put(paramString, paramFileBody);
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
  
  public void addStringUpload(String paramString1, String paramString2)
  {
    this.stringUploads.put(paramString1, paramString2);
  }
  
  protected void deliverResponse(JSONObject paramJSONObject)
  {
    if (this.mListener != null) {
      this.mListener.onResponse(paramJSONObject);
    }
  }
  
  public String getBodyContentType()
  {
    return null;
  }
  
  public Map<String, FileBody> getFileUploads()
  {
    return this.fileUploads;
  }
  
  public Map<String, String> getHeaders()
  {
    Map localMap = super.getHeaders();
    Object localObject;
    if (localMap != null)
    {
      localObject = localMap;
      if (!localMap.equals(Collections.emptyMap())) {}
    }
    else
    {
      localObject = new HashMap();
    }
    addSessionCookie((Map)localObject);
    return (Map<String, String>)localObject;
  }
  
  public ProgressEntity.ProgressListener getProgressListener()
  {
    return this.mProgressListener;
  }
  
  public Map<String, String> getStringUploads()
  {
    return this.stringUploads;
  }
  
  protected Response<JSONObject> parseNetworkResponse(NetworkResponse paramNetworkResponse)
  {
    saveSessionCookie(paramNetworkResponse.headers);
    try
    {
      str1 = new String(paramNetworkResponse.data, HttpHeaderParser.parseCharset(paramNetworkResponse.headers));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        try
        {
          String str1;
          paramNetworkResponse = Response.success(new JSONObject(str1), HttpHeaderParser.parseCacheHeaders(paramNetworkResponse));
          return paramNetworkResponse;
        }
        catch (JSONException paramNetworkResponse)
        {
          String str2;
          paramNetworkResponse.printStackTrace();
        }
        localUnsupportedEncodingException = localUnsupportedEncodingException;
        str2 = new String(paramNetworkResponse.data);
      }
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
        break label167;
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
        Log.d("save http header fullcookie = " + paramMap + " ### cookie = " + str);
        new MemoryStorage().saveData(this.COOKIE_KEY, paramMap);
        return;
        label167:
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
  
  public void setFileUploads(Map<String, FileBody> paramMap)
  {
    this.fileUploads = paramMap;
  }
  
  public void setStringUploads(Map<String, String> paramMap)
  {
    this.stringUploads = paramMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\MultiPartStringRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */