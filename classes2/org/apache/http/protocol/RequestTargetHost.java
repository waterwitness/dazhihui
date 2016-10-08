package org.apache.http.protocol;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class RequestTargetHost
  implements HttpRequestInterceptor
{
  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject = HttpCoreContext.adapt(paramHttpContext);
    ProtocolVersion localProtocolVersion = paramHttpRequest.getRequestLine().getProtocolVersion();
    if ((paramHttpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) && (localProtocolVersion.lessEquals(HttpVersion.HTTP_1_0))) {
      break label55;
    }
    label55:
    while (paramHttpRequest.containsHeader("Host")) {
      return;
    }
    paramHttpContext = ((HttpCoreContext)localObject).getTargetHost();
    if (paramHttpContext == null)
    {
      localObject = ((HttpCoreContext)localObject).getConnection();
      if (!(localObject instanceof HttpInetConnection)) {
        break label172;
      }
      InetAddress localInetAddress = ((HttpInetConnection)localObject).getRemoteAddress();
      int i = ((HttpInetConnection)localObject).getRemotePort();
      if (localInetAddress == null) {
        break label172;
      }
      paramHttpContext = new HttpHost(localInetAddress.getHostName(), i);
    }
    label172:
    for (;;)
    {
      localObject = paramHttpContext;
      if (paramHttpContext == null)
      {
        if (localProtocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
          break;
        }
        throw new ProtocolException("Target host missing");
        localObject = paramHttpContext;
      }
      paramHttpRequest.addHeader("Host", ((HttpHost)localObject).toHostString());
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\protocol\RequestTargetHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */