package com.alipay.b.b.a.a;

import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

final class m
  extends DefaultHttpClient
{
  m(i parami, ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    super(paramClientConnectionManager, paramHttpParams);
  }
  
  protected final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy()
  {
    return new o(this);
  }
  
  protected final HttpContext createHttpContext()
  {
    BasicHttpContext localBasicHttpContext = new BasicHttpContext();
    localBasicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
    localBasicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
    localBasicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
    return localBasicHttpContext;
  }
  
  protected final BasicHttpProcessor createHttpProcessor()
  {
    BasicHttpProcessor localBasicHttpProcessor = super.createHttpProcessor();
    localBasicHttpProcessor.addRequestInterceptor(i.a());
    localBasicHttpProcessor.addRequestInterceptor(new j(this.a, (byte)0));
    return localBasicHttpProcessor;
  }
  
  protected final RedirectHandler createRedirectHandler()
  {
    return new n(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */