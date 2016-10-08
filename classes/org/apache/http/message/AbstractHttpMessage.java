package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@NotThreadSafe
public abstract class AbstractHttpMessage
  implements HttpMessage
{
  protected HeaderGroup headergroup = new HeaderGroup();
  @Deprecated
  protected HttpParams params;
  
  protected AbstractHttpMessage()
  {
    this(null);
  }
  
  @Deprecated
  protected AbstractHttpMessage(HttpParams paramHttpParams)
  {
    this.params = paramHttpParams;
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Header name");
    this.headergroup.addHeader(new BasicHeader(paramString1, paramString2));
  }
  
  public void addHeader(Header paramHeader)
  {
    this.headergroup.addHeader(paramHeader);
  }
  
  public boolean containsHeader(String paramString)
  {
    return this.headergroup.containsHeader(paramString);
  }
  
  public Header[] getAllHeaders()
  {
    return this.headergroup.getAllHeaders();
  }
  
  public Header getFirstHeader(String paramString)
  {
    return this.headergroup.getFirstHeader(paramString);
  }
  
  public Header[] getHeaders(String paramString)
  {
    return this.headergroup.getHeaders(paramString);
  }
  
  public Header getLastHeader(String paramString)
  {
    return this.headergroup.getLastHeader(paramString);
  }
  
  @Deprecated
  public HttpParams getParams()
  {
    if (this.params == null) {
      this.params = new BasicHttpParams();
    }
    return this.params;
  }
  
  public HeaderIterator headerIterator()
  {
    return this.headergroup.iterator();
  }
  
  public HeaderIterator headerIterator(String paramString)
  {
    return this.headergroup.iterator(paramString);
  }
  
  public void removeHeader(Header paramHeader)
  {
    this.headergroup.removeHeader(paramHeader);
  }
  
  public void removeHeaders(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      HeaderIterator localHeaderIterator = this.headergroup.iterator();
      while (localHeaderIterator.hasNext()) {
        if (paramString.equalsIgnoreCase(localHeaderIterator.nextHeader().getName())) {
          localHeaderIterator.remove();
        }
      }
    }
  }
  
  public void setHeader(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Header name");
    this.headergroup.updateHeader(new BasicHeader(paramString1, paramString2));
  }
  
  public void setHeader(Header paramHeader)
  {
    this.headergroup.updateHeader(paramHeader);
  }
  
  public void setHeaders(Header[] paramArrayOfHeader)
  {
    this.headergroup.setHeaders(paramArrayOfHeader);
  }
  
  @Deprecated
  public void setParams(HttpParams paramHttpParams)
  {
    this.params = ((HttpParams)Args.notNull(paramHttpParams, "HTTP parameters"));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\message\AbstractHttpMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */