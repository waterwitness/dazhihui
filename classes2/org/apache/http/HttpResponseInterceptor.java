package org.apache.http;

import org.apache.http.protocol.HttpContext;

public abstract interface HttpResponseInterceptor
{
  public abstract void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpResponseInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */