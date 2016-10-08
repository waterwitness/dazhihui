package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Immutable
public class RequestUserAgent
  implements HttpRequestInterceptor
{
  private final String userAgent;
  
  public RequestUserAgent()
  {
    this(null);
  }
  
  public RequestUserAgent(String paramString)
  {
    this.userAgent = paramString;
  }
  
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    if (!paramHttpRequest.containsHeader("User-Agent"))
    {
      paramHttpContext = null;
      Object localObject = paramHttpRequest.getParams();
      if (localObject != null) {
        paramHttpContext = (String)((HttpParams)localObject).getParameter("http.useragent");
      }
      localObject = paramHttpContext;
      if (paramHttpContext == null) {
        localObject = this.userAgent;
      }
      if (localObject != null) {
        paramHttpRequest.addHeader("User-Agent", (String)localObject);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\RequestUserAgent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */