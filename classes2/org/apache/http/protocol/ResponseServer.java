package org.apache.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ResponseServer
  implements HttpResponseInterceptor
{
  private final String originServer;
  
  public ResponseServer()
  {
    this(null);
  }
  
  public ResponseServer(String paramString)
  {
    this.originServer = paramString;
  }
  
  public void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    if ((!paramHttpResponse.containsHeader("Server")) && (this.originServer != null)) {
      paramHttpResponse.addHeader("Server", this.originServer);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\ResponseServer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */