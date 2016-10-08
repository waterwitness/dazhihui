package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkHttpClient;
import java.net.HttpURLConnection;
import java.net.SecureCacheResponse;
import java.net.URL;

final class HttpsURLConnectionImpl$HttpUrlConnectionDelegate
  extends HttpURLConnectionImpl
{
  private HttpsURLConnectionImpl$HttpUrlConnectionDelegate(HttpsURLConnectionImpl paramHttpsURLConnectionImpl, URL paramURL, OkHttpClient paramOkHttpClient)
  {
    super(paramURL, paramOkHttpClient);
  }
  
  public HttpURLConnection getHttpConnectionToCache()
  {
    return this.this$0;
  }
  
  public SecureCacheResponse getSecureCacheResponse()
  {
    if ((this.httpEngine instanceof HttpsEngine)) {
      return (SecureCacheResponse)this.httpEngine.getCacheResponse();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpsURLConnectionImpl$HttpUrlConnectionDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */