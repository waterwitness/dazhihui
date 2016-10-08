package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.TunnelRequest;
import com.squareup.okhttp.internal.Util;
import java.net.CacheResponse;
import java.net.SecureCacheResponse;
import java.net.URL;
import javax.net.ssl.SSLSocket;

public final class HttpsEngine
  extends HttpEngine
{
  private SSLSocket sslSocket;
  
  public HttpsEngine(OkHttpClient paramOkHttpClient, Policy paramPolicy, String paramString, RawHeaders paramRawHeaders, Connection paramConnection, RetryableOutputStream paramRetryableOutputStream)
  {
    super(paramOkHttpClient, paramPolicy, paramString, paramRawHeaders, paramConnection, paramRetryableOutputStream);
    if (paramConnection != null) {}
    for (paramOkHttpClient = (SSLSocket)paramConnection.getSocket();; paramOkHttpClient = null)
    {
      this.sslSocket = paramOkHttpClient;
      return;
    }
  }
  
  protected boolean acceptCacheResponseType(CacheResponse paramCacheResponse)
  {
    return paramCacheResponse instanceof SecureCacheResponse;
  }
  
  protected void connected(Connection paramConnection)
  {
    this.sslSocket = ((SSLSocket)paramConnection.getSocket());
    super.connected(paramConnection);
  }
  
  public SSLSocket getSslSocket()
  {
    return this.sslSocket;
  }
  
  protected TunnelRequest getTunnelConfig()
  {
    Object localObject2 = this.requestHeaders.getUserAgent();
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = getDefaultUserAgent();
    }
    localObject2 = this.policy.getURL();
    return new TunnelRequest(((URL)localObject2).getHost(), Util.getEffectivePort((URL)localObject2), (String)localObject1, this.requestHeaders.getProxyAuthorization());
  }
  
  protected boolean includeAuthorityInRequestLine()
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */