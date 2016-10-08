package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class BasicHttpEntityEnclosingRequest
  extends BasicHttpRequest
  implements HttpEntityEnclosingRequest
{
  private HttpEntity entity;
  
  public BasicHttpEntityEnclosingRequest(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public BasicHttpEntityEnclosingRequest(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    super(paramString1, paramString2, paramProtocolVersion);
  }
  
  public BasicHttpEntityEnclosingRequest(RequestLine paramRequestLine)
  {
    super(paramRequestLine);
  }
  
  public boolean expectContinue()
  {
    Header localHeader = getFirstHeader("Expect");
    return (localHeader != null) && ("100-continue".equalsIgnoreCase(localHeader.getValue()));
  }
  
  public HttpEntity getEntity()
  {
    return this.entity;
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\message\BasicHttpEntityEnclosingRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */