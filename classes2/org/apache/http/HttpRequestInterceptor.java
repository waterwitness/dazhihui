package org.apache.http;

import org.apache.http.protocol.HttpContext;

public abstract interface HttpRequestInterceptor
{
  public abstract void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpRequestInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */