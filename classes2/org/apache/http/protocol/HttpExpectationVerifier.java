package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

public abstract interface HttpExpectationVerifier
{
  public abstract void verify(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\HttpExpectationVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */