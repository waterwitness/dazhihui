package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicHttpRequest
  extends AbstractHttpMessage
  implements HttpRequest
{
  private final String method;
  private RequestLine requestline;
  private final String uri;
  
  public BasicHttpRequest(String paramString1, String paramString2)
  {
    this.method = ((String)Args.notNull(paramString1, "Method name"));
    this.uri = ((String)Args.notNull(paramString2, "Request URI"));
    this.requestline = null;
  }
  
  public BasicHttpRequest(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    this(new BasicRequestLine(paramString1, paramString2, paramProtocolVersion));
  }
  
  public BasicHttpRequest(RequestLine paramRequestLine)
  {
    this.requestline = ((RequestLine)Args.notNull(paramRequestLine, "Request line"));
    this.method = paramRequestLine.getMethod();
    this.uri = paramRequestLine.getUri();
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return getRequestLine().getProtocolVersion();
  }
  
  public RequestLine getRequestLine()
  {
    if (this.requestline == null) {
      this.requestline = new BasicRequestLine(this.method, this.uri, HttpVersion.HTTP_1_1);
    }
    return this.requestline;
  }
  
  public String toString()
  {
    return this.method + " " + this.uri + " " + this.headergroup;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */