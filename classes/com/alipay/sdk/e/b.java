package com.alipay.sdk.e;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class b
{
  static b a;
  final DefaultHttpClient b;
  
  private b(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    this.b = new DefaultHttpClient(paramClientConnectionManager, paramHttpParams);
  }
  
  private b(HttpParams paramHttpParams)
  {
    this.b = new DefaultHttpClient(paramHttpParams);
  }
  
  public static b a()
  {
    BasicHttpParams localBasicHttpParams;
    if (a == null)
    {
      localBasicHttpParams = new BasicHttpParams();
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams, true);
      localBasicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
      ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 50);
      ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(30));
      ConnManagerParams.setTimeout(localBasicHttpParams, 1000L);
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 20000);
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, 30000);
      HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 16384);
      HttpProtocolParams.setUseExpectContinue(localBasicHttpParams, false);
      HttpClientParams.setRedirecting(localBasicHttpParams, true);
      HttpClientParams.setAuthenticating(localBasicHttpParams, false);
      HttpProtocolParams.setUserAgent(localBasicHttpParams, "msp");
    }
    try
    {
      Object localObject = SSLSocketFactory.getSocketFactory();
      ((SSLSocketFactory)localObject).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
      localObject = new Scheme("https", (SocketFactory)localObject, 443);
      Scheme localScheme = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register((Scheme)localObject);
      localSchemeRegistry.register(localScheme);
      a = new b(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
      return a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a = new b(localBasicHttpParams);
      }
    }
  }
  
  public final HttpResponse a(HttpUriRequest paramHttpUriRequest)
  {
    try
    {
      paramHttpUriRequest = this.b.execute(paramHttpUriRequest);
      return paramHttpUriRequest;
    }
    catch (Exception paramHttpUriRequest)
    {
      throw paramHttpUriRequest;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */