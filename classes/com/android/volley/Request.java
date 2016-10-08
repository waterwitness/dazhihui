package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class Request<T>
  implements Comparable<Request<T>>
{
  private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
  private Cache.Entry mCacheEntry;
  private boolean mCanceled;
  private final int mDefaultTrafficStatsTag;
  private final Response.ErrorListener mErrorListener;
  private final VolleyLog.MarkerLog mEventLog;
  private final int mMethod;
  private RequestQueue mRequestQueue;
  private boolean mResponseDelivered;
  private RetryPolicy mRetryPolicy;
  private Integer mSequence;
  private boolean mShouldCache;
  private Object mTag;
  private final String mUrl;
  
  public Request(int paramInt, String paramString, Response.ErrorListener paramErrorListener)
  {
    if (VolleyLog.MarkerLog.ENABLED) {}
    for (VolleyLog.MarkerLog localMarkerLog = new VolleyLog.MarkerLog();; localMarkerLog = null)
    {
      this.mEventLog = localMarkerLog;
      this.mShouldCache = true;
      this.mCanceled = false;
      this.mResponseDelivered = false;
      this.mCacheEntry = null;
      this.mMethod = paramInt;
      this.mUrl = paramString;
      this.mErrorListener = paramErrorListener;
      setRetryPolicy(new DefaultRetryPolicy());
      this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(paramString);
      return;
    }
  }
  
  @Deprecated
  public Request(String paramString, Response.ErrorListener paramErrorListener)
  {
    this(-1, paramString, paramErrorListener);
  }
  
  /* Error */
  private byte[] encodeParameters(Map<String, String> paramMap, String paramString)
  {
    // Byte code:
    //   0: new 87	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   7: astore_3
    //   8: aload_1
    //   9: invokeinterface 94 1 0
    //   14: invokeinterface 100 1 0
    //   19: astore_1
    //   20: aload_1
    //   21: invokeinterface 106 1 0
    //   26: ifne +12 -> 38
    //   29: aload_3
    //   30: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: aload_2
    //   34: invokevirtual 116	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   37: areturn
    //   38: aload_1
    //   39: invokeinterface 120 1 0
    //   44: checkcast 122	java/util/Map$Entry
    //   47: astore 4
    //   49: aload_3
    //   50: aload 4
    //   52: invokeinterface 125 1 0
    //   57: checkcast 112	java/lang/String
    //   60: aload_2
    //   61: invokestatic 131	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   64: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: bipush 61
    //   71: invokevirtual 138	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_3
    //   76: aload 4
    //   78: invokeinterface 141 1 0
    //   83: checkcast 112	java/lang/String
    //   86: aload_2
    //   87: invokestatic 131	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   90: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_3
    //   95: bipush 38
    //   97: invokevirtual 138	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: goto -81 -> 20
    //   104: astore_1
    //   105: new 143	java/lang/RuntimeException
    //   108: dup
    //   109: new 87	java/lang/StringBuilder
    //   112: dup
    //   113: ldc -111
    //   115: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload_2
    //   119: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: aload_1
    //   126: invokespecial 151	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	Request
    //   0	130	1	paramMap	Map<String, String>
    //   0	130	2	paramString	String
    //   7	88	3	localStringBuilder	StringBuilder
    //   47	30	4	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   8	20	104	java/io/UnsupportedEncodingException
    //   20	38	104	java/io/UnsupportedEncodingException
    //   38	101	104	java/io/UnsupportedEncodingException
  }
  
  private static int findDefaultTrafficStatsTag(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = Uri.parse(paramString);
      if (paramString != null)
      {
        paramString = paramString.getHost();
        if (paramString != null) {
          return paramString.hashCode();
        }
      }
    }
    return 0;
  }
  
  public void addMarker(String paramString)
  {
    if (VolleyLog.MarkerLog.ENABLED) {
      this.mEventLog.add(paramString, Thread.currentThread().getId());
    }
  }
  
  public void cancel()
  {
    this.mCanceled = true;
  }
  
  public int compareTo(Request<T> paramRequest)
  {
    Request.Priority localPriority1 = getPriority();
    Request.Priority localPriority2 = paramRequest.getPriority();
    if (localPriority1 == localPriority2) {
      return this.mSequence.intValue() - paramRequest.mSequence.intValue();
    }
    return localPriority2.ordinal() - localPriority1.ordinal();
  }
  
  public void deliverError(VolleyError paramVolleyError)
  {
    if (this.mErrorListener != null) {
      this.mErrorListener.onErrorResponse(paramVolleyError);
    }
  }
  
  protected abstract void deliverResponse(T paramT);
  
  void finish(String paramString)
  {
    if (this.mRequestQueue != null) {
      this.mRequestQueue.finish(this);
    }
    long l;
    if (VolleyLog.MarkerLog.ENABLED)
    {
      l = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        new Handler(Looper.getMainLooper()).post(new Request.1(this, paramString, l));
      }
    }
    else
    {
      return;
    }
    this.mEventLog.add(paramString, l);
    this.mEventLog.finish(toString());
  }
  
  public byte[] getBody()
  {
    Map localMap = getParams();
    if ((localMap != null) && (localMap.size() > 0)) {
      return encodeParameters(localMap, getParamsEncoding());
    }
    return null;
  }
  
  public String getBodyContentType()
  {
    return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
  }
  
  public Cache.Entry getCacheEntry()
  {
    return this.mCacheEntry;
  }
  
  public String getCacheKey()
  {
    return getUrl();
  }
  
  public Response.ErrorListener getErrorListener()
  {
    return this.mErrorListener;
  }
  
  public Map<String, String> getHeaders()
  {
    return Collections.emptyMap();
  }
  
  public int getMethod()
  {
    return this.mMethod;
  }
  
  protected Map<String, String> getParams()
  {
    return null;
  }
  
  protected String getParamsEncoding()
  {
    return "UTF-8";
  }
  
  @Deprecated
  public byte[] getPostBody()
  {
    Map localMap = getPostParams();
    if ((localMap != null) && (localMap.size() > 0)) {
      return encodeParameters(localMap, getPostParamsEncoding());
    }
    return null;
  }
  
  @Deprecated
  public String getPostBodyContentType()
  {
    return getBodyContentType();
  }
  
  @Deprecated
  protected Map<String, String> getPostParams()
  {
    return getParams();
  }
  
  @Deprecated
  protected String getPostParamsEncoding()
  {
    return getParamsEncoding();
  }
  
  public Request.Priority getPriority()
  {
    return Request.Priority.NORMAL;
  }
  
  public RetryPolicy getRetryPolicy()
  {
    return this.mRetryPolicy;
  }
  
  public final int getSequence()
  {
    if (this.mSequence == null) {
      throw new IllegalStateException("getSequence called before setSequence");
    }
    return this.mSequence.intValue();
  }
  
  public Object getTag()
  {
    return this.mTag;
  }
  
  public final int getTimeoutMs()
  {
    return this.mRetryPolicy.getCurrentTimeout();
  }
  
  public int getTrafficStatsTag()
  {
    return this.mDefaultTrafficStatsTag;
  }
  
  public String getUrl()
  {
    return this.mUrl;
  }
  
  public boolean hasHadResponseDelivered()
  {
    return this.mResponseDelivered;
  }
  
  public boolean isCanceled()
  {
    return this.mCanceled;
  }
  
  public void markDelivered()
  {
    this.mResponseDelivered = true;
  }
  
  protected VolleyError parseNetworkError(VolleyError paramVolleyError)
  {
    return paramVolleyError;
  }
  
  protected abstract Response<T> parseNetworkResponse(NetworkResponse paramNetworkResponse);
  
  public Request<?> setCacheEntry(Cache.Entry paramEntry)
  {
    this.mCacheEntry = paramEntry;
    return this;
  }
  
  public Request<?> setRequestQueue(RequestQueue paramRequestQueue)
  {
    this.mRequestQueue = paramRequestQueue;
    return this;
  }
  
  public Request<?> setRetryPolicy(RetryPolicy paramRetryPolicy)
  {
    this.mRetryPolicy = paramRetryPolicy;
    return this;
  }
  
  public final Request<?> setSequence(int paramInt)
  {
    this.mSequence = Integer.valueOf(paramInt);
    return this;
  }
  
  public final Request<?> setShouldCache(boolean paramBoolean)
  {
    this.mShouldCache = paramBoolean;
    return this;
  }
  
  public Request<?> setTag(Object paramObject)
  {
    this.mTag = paramObject;
    return this;
  }
  
  public final boolean shouldCache()
  {
    return this.mShouldCache;
  }
  
  public String toString()
  {
    String str2 = "0x" + Integer.toHexString(getTrafficStatsTag());
    if (this.mCanceled) {}
    for (String str1 = "[X] ";; str1 = "[ ] ") {
      return str1 + getUrl() + " " + str2 + " " + getPriority() + " " + this.mSequence;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */