package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

public abstract interface HttpRequestHandler
{
  public abstract void handle(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\HttpRequestHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */