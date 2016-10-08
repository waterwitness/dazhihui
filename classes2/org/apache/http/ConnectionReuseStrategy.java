package org.apache.http;

import org.apache.http.protocol.HttpContext;

public abstract interface ConnectionReuseStrategy
{
  public abstract boolean keepAlive(HttpResponse paramHttpResponse, HttpContext paramHttpContext);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\ConnectionReuseStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */