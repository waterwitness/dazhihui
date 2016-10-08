package com.android.thinkive.framework.network.http;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.AddressConfigBean;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.config.RequestQueueBean;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.util.Log;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.entity.mime.content.FileBody;
import org.json.JSONObject;

public class HttpService
{
  private static final String TAG = "thinkive";
  public static final int TIMEOUT = 15000;
  public static HashMap<String, LinkedHashMap<String, String>> sCookieMap = new HashMap();
  private static HttpService sInstance;
  private ArrayList<String> mHttpRequestList = new ArrayList();
  private RequestQueue mRequestQueue;
  
  private void addRequest(Request paramRequest)
  {
    ThinkiveInitializer.getInstance().addToRequestQueue(paramRequest);
  }
  
  private void addRequest(Request paramRequest, String paramString)
  {
    ThinkiveInitializer.getInstance().addToRequestQueue(paramRequest, paramString);
  }
  
  private void addRequest(Request paramRequest, String paramString1, String paramString2)
  {
    ThinkiveInitializer.getInstance().addToRequestQueue(paramRequest, paramString1, paramString2);
  }
  
  private String buildGetRequestUrlFormat(String paramString, HashMap<String, String> paramHashMap)
  {
    paramHashMap = paramHashMap.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    for (;;)
    {
      if (!paramHashMap.hasNext()) {
        return localStringBuilder.substring(0, localStringBuilder.length() - 1);
      }
      Object localObject = (Map.Entry)paramHashMap.next();
      paramString = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      localStringBuilder.append(paramString).append("=").append((String)localObject).append("&");
    }
  }
  
  private void configUrlRequest(RequestBean paramRequestBean, ResponseListener<JSONObject> paramResponseListener)
  {
    int j = 1;
    JsonResponseListener localJsonResponseListener = new JsonResponseListener(paramResponseListener);
    JsonErrorResponseListener localJsonErrorResponseListener = new JsonErrorResponseListener(paramResponseListener);
    paramResponseListener = paramRequestBean.getParam();
    Object localObject1 = paramResponseListener;
    if (paramResponseListener == null) {
      localObject1 = new HashMap();
    }
    Object localObject2 = new JSONObject((Map)localObject1);
    paramResponseListener = paramRequestBean.getUrlName();
    AddressConfigBean localAddressConfigBean = ConfigManager.getInstance().getAddressConfigBean(paramResponseListener);
    String str1 = localAddressConfigBean.getPriorityValue();
    paramResponseListener = str1;
    if (!TextUtils.isEmpty(str1))
    {
      paramResponseListener = str1;
      if (!str1.substring(str1.length() - 1, str1.length()).equals("?")) {
        paramResponseListener = str1 + "?";
      }
    }
    str1 = NetWorkService.getInstance().buildCacheKey(paramResponseListener, (HashMap)localObject1);
    if (isRequestLaunched(str1))
    {
      Log.w("http request = " + str1 + " has launched,return!!!");
      return;
    }
    addRequestToList(str1);
    String str2 = localAddressConfigBean.getMethod();
    int i;
    if (str2.toLowerCase().equals("post"))
    {
      i = 1;
      localObject1 = localObject2;
    }
    for (;;)
    {
      localObject1 = new JsonRequest(paramResponseListener, i, (JSONObject)localObject1, paramRequestBean, localJsonResponseListener, localJsonErrorResponseListener);
      ((JsonRequest)localObject1).setRequestKey(str1);
      int k = localAddressConfigBean.getTimeout();
      i = k;
      if (k == -1) {
        i = 15000;
      }
      k = localAddressConfigBean.getRetry();
      if (k == -1) {}
      for (;;)
      {
        ((JsonRequest)localObject1).setRetryPolicy(new DefaultRetryPolicy(i, j, 1.0F));
        localObject2 = getNewQueueName(paramResponseListener);
        Log.d("requestQueueName = " + (String)localObject2);
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          paramResponseListener = "thinkive";
          if (!TextUtils.isEmpty(paramRequestBean.getTag())) {
            paramResponseListener = paramRequestBean.getTag();
          }
          addRequest((Request)localObject1, paramResponseListener, (String)localObject2);
          return;
          if (!str2.toLowerCase().equals("get")) {
            break label427;
          }
          i = 0;
          paramResponseListener = buildGetRequestUrlFormat(paramResponseListener, (HashMap)localObject1);
          Log.d("get request url = " + paramResponseListener);
          localObject1 = null;
          break;
        }
        if (!TextUtils.isEmpty(paramRequestBean.getTag()))
        {
          addRequest((Request)localObject1, paramRequestBean.getTag());
          return;
        }
        addRequest((Request)localObject1);
        return;
        j = k;
      }
      label427:
      i = 1;
      localObject1 = localObject2;
    }
  }
  
  public static HttpService getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new HttpService();
      }
      HttpService localHttpService = sInstance;
      return localHttpService;
    }
    finally {}
  }
  
  private String getNewQueueName(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = ConfigManager.getInstance().getRequestQueueConfig();
    if (((ArrayList)localObject3).size() > 0)
    {
      localObject3 = ((ArrayList)localObject3).iterator();
      localObject1 = localObject2;
      if (((Iterator)localObject3).hasNext()) {}
    }
    else
    {
      return (String)localObject1;
    }
    RequestQueueBean localRequestQueueBean = (RequestQueueBean)((Iterator)localObject3).next();
    localObject2 = Uri.parse(paramString);
    String str = ((Uri)localObject2).getHost();
    int j = ((Uri)localObject2).getPort();
    int i = j;
    if (j < 0) {
      i = 80;
    }
    str = str + ":" + i;
    Iterator localIterator = localRequestQueueBean.getKey().iterator();
    localObject2 = localObject1;
    for (;;)
    {
      localObject1 = localObject2;
      if (!localIterator.hasNext()) {
        break;
      }
      if (str.equals((String)localIterator.next())) {
        localObject2 = localRequestQueueBean.getName();
      }
    }
  }
  
  private void specifyUrlRequest(HttpRequestBean paramHttpRequestBean, ResponseListener<JSONObject> paramResponseListener)
  {
    int j = 1;
    JsonResponseListener localJsonResponseListener = new JsonResponseListener(paramResponseListener);
    JsonErrorResponseListener localJsonErrorResponseListener = new JsonErrorResponseListener(paramResponseListener);
    Object localObject = paramHttpRequestBean.getParam();
    paramResponseListener = (ResponseListener<JSONObject>)localObject;
    if (localObject == null) {
      paramResponseListener = new HashMap();
    }
    localObject = new JSONObject(paramResponseListener);
    String str1 = paramHttpRequestBean.getUrlAddress();
    String str2 = NetWorkService.getInstance().buildCacheKey(str1, paramResponseListener);
    if (isRequestLaunched(str2))
    {
      Log.w("http request = " + str2 + " has launched,return!!!");
      return;
    }
    addRequestToList(str2);
    RequestMethod localRequestMethod = paramHttpRequestBean.getRequestMethod();
    int i;
    if (localRequestMethod == RequestMethod.POST)
    {
      i = 1;
      paramResponseListener = str1;
    }
    for (;;)
    {
      localObject = new JsonRequest(paramResponseListener, i, (JSONObject)localObject, paramHttpRequestBean, localJsonResponseListener, localJsonErrorResponseListener);
      ((JsonRequest)localObject).setRequestKey(str2);
      int k = paramHttpRequestBean.getTimeOut();
      i = k;
      if (k == -1) {
        i = 15000;
      }
      k = paramHttpRequestBean.getReTryCount();
      if (k == -1) {}
      for (;;)
      {
        ((JsonRequest)localObject).setRetryPolicy(new DefaultRetryPolicy(i, j, 1.0F));
        str1 = getNewQueueName(paramResponseListener);
        Log.d("requestQueueName = " + str1);
        if (!TextUtils.isEmpty(str1))
        {
          paramResponseListener = "thinkive";
          if (!TextUtils.isEmpty(paramHttpRequestBean.getTag())) {
            paramResponseListener = paramHttpRequestBean.getTag();
          }
          addRequest((Request)localObject, paramResponseListener, str1);
          return;
          if (localRequestMethod != RequestMethod.GET) {
            break label340;
          }
          i = 0;
          paramResponseListener = buildGetRequestUrlFormat(str1, paramResponseListener);
          Log.d("get request url = " + paramResponseListener);
          localObject = null;
          break;
        }
        if (!TextUtils.isEmpty(paramHttpRequestBean.getTag()))
        {
          addRequest((Request)localObject, paramHttpRequestBean.getTag());
          return;
        }
        addRequest((Request)localObject);
        return;
        j = k;
      }
      label340:
      i = 1;
      paramResponseListener = str1;
    }
  }
  
  protected void addRequestToList(String paramString)
  {
    try
    {
      if (!this.mHttpRequestList.contains(paramString)) {
        this.mHttpRequestList.add(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void gzipJsonRequest(String paramString, HashMap<String, String> paramHashMap, ResponseListener<JSONObject> paramResponseListener)
  {
    int j = 1;
    JsonResponseListener localJsonResponseListener = new JsonResponseListener(paramResponseListener);
    JsonErrorResponseListener localJsonErrorResponseListener = new JsonErrorResponseListener(paramResponseListener);
    paramResponseListener = new JSONObject(paramHashMap);
    AddressConfigBean localAddressConfigBean = ConfigManager.getInstance().getAddressConfigBean(paramString);
    paramString = localAddressConfigBean.getPriorityValue();
    String str = localAddressConfigBean.getMethod();
    int i;
    if (str.toLowerCase().equals("post"))
    {
      i = 1;
      paramHashMap = paramResponseListener;
    }
    for (;;)
    {
      paramString = new GzipJsonRequest(paramString, i, paramHashMap, localJsonResponseListener, localJsonErrorResponseListener);
      int k = localAddressConfigBean.getTimeout();
      i = k;
      if (k == -1) {
        i = 15000;
      }
      k = localAddressConfigBean.getRetry();
      if (k == -1) {}
      for (;;)
      {
        paramString.setRetryPolicy(new DefaultRetryPolicy(i, j, 1.0F));
        addRequest(paramString);
        return;
        if (!str.toLowerCase().equals("get")) {
          break label200;
        }
        i = 0;
        paramString = buildGetRequestUrlFormat(paramString, paramHashMap);
        Log.d("get request url = " + paramString);
        paramHashMap = null;
        break;
        j = k;
      }
      label200:
      i = 1;
      paramHashMap = paramResponseListener;
    }
  }
  
  protected boolean isRequestLaunched(String paramString)
  {
    try
    {
      boolean bool = this.mHttpRequestList.contains(paramString);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void jsonRequest(RequestBean paramRequestBean, ResponseListener<JSONObject> paramResponseListener)
  {
    if ((paramRequestBean instanceof HttpRequestBean))
    {
      specifyUrlRequest((HttpRequestBean)paramRequestBean, paramResponseListener);
      return;
    }
    configUrlRequest(paramRequestBean, paramResponseListener);
  }
  
  @Deprecated
  public void jsonRequest(String paramString, HashMap<String, String> paramHashMap, int paramInt1, int paramInt2, ResponseListener<JSONObject> paramResponseListener)
  {
    int j = 1;
    JsonResponseListener localJsonResponseListener = new JsonResponseListener(paramResponseListener);
    paramResponseListener = new JsonErrorResponseListener(paramResponseListener);
    paramString = new JsonRequest(paramString, 1, new JSONObject(paramHashMap), localJsonResponseListener, paramResponseListener);
    int i = paramInt1;
    if (paramInt1 <= 0) {
      i = 15000;
    }
    if (paramInt2 <= 0) {}
    for (paramInt1 = j;; paramInt1 = paramInt2)
    {
      paramString.setRetryPolicy(new DefaultRetryPolicy(i, paramInt1, 1.0F));
      addRequest(paramString);
      return;
    }
  }
  
  @Deprecated
  public void jsonRequest(String paramString, HashMap<String, String> paramHashMap, ResponseListener<JSONObject> paramResponseListener)
  {
    RequestBean localRequestBean = new RequestBean();
    localRequestBean.setUrlName(paramString);
    localRequestBean.setParam(paramHashMap);
    jsonRequest(localRequestBean, paramResponseListener);
  }
  
  public void multiPartRequest(String paramString1, String paramString2, HashMap<String, FileBody> paramHashMap, HashMap<String, String> paramHashMap1, int paramInt1, int paramInt2, ResponseListener<JSONObject> paramResponseListener, ProgressEntity.ProgressListener paramProgressListener)
  {
    paramString1 = new MultiPartStringRequest(paramString1, new JsonResponseListener(paramResponseListener), new JsonErrorResponseListener(paramResponseListener), paramProgressListener);
    paramString1.setFileUploads(paramHashMap);
    paramString1.setStringUploads(paramHashMap1);
    int i = paramInt1;
    if (paramInt1 <= 0) {
      i = 15000;
    }
    paramInt1 = paramInt2;
    if (paramInt2 <= 0) {
      paramInt1 = 1;
    }
    paramString1.setRetryPolicy(new DefaultRetryPolicy(i, paramInt1, 1.0F));
    addRequest(paramString1, paramString2);
  }
  
  public void multiPartRequest(String paramString, HashMap<String, FileBody> paramHashMap, HashMap<String, String> paramHashMap1, int paramInt1, int paramInt2, ResponseListener<JSONObject> paramResponseListener)
  {
    paramString = new MultiPartStringRequest(paramString, new JsonResponseListener(paramResponseListener), new JsonErrorResponseListener(paramResponseListener));
    paramString.setFileUploads(paramHashMap);
    paramString.setStringUploads(paramHashMap1);
    int i = paramInt1;
    if (paramInt1 <= 0) {
      i = 15000;
    }
    paramInt1 = paramInt2;
    if (paramInt2 <= 0) {
      paramInt1 = 1;
    }
    paramString.setRetryPolicy(new DefaultRetryPolicy(i, paramInt1, 1.0F));
    addRequest(paramString);
  }
  
  public void multiPartRequest(String paramString, HashMap<String, FileBody> paramHashMap, HashMap<String, String> paramHashMap1, int paramInt1, int paramInt2, ResponseListener<JSONObject> paramResponseListener, ProgressEntity.ProgressListener paramProgressListener)
  {
    multiPartRequest(paramString, "thinkive", paramHashMap, paramHashMap1, paramInt1, paramInt2, paramResponseListener, paramProgressListener);
  }
  
  public void release()
  {
    if (this.mRequestQueue != null) {
      this.mRequestQueue.cancelAll("TAG");
    }
    this.mHttpRequestList.clear();
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  protected void removeRequestToList(String paramString)
  {
    try
    {
      Log.e("remove requeset key = " + paramString);
      this.mHttpRequestList.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\HttpService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */