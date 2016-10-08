package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class RequestConnControl
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    if (paramHttpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {}
    while (paramHttpRequest.containsHeader("Connection")) {
      return;
    }
    paramHttpRequest.addHeader("Connection", "Keep-Alive");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\RequestConnControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */