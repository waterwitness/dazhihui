package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.BasicHeader;

@NotThreadSafe
public abstract class AbstractHttpEntity
  implements HttpEntity
{
  protected static final int OUTPUT_BUFFER_SIZE = 4096;
  protected boolean chunked;
  protected Header contentEncoding;
  protected Header contentType;
  
  @Deprecated
  public void consumeContent() {}
  
  public Header getContentEncoding()
  {
    return this.contentEncoding;
  }
  
  public Header getContentType()
  {
    return this.contentType;
  }
  
  public boolean isChunked()
  {
    return this.chunked;
  }
  
  public void setChunked(boolean paramBoolean)
  {
    this.chunked = paramBoolean;
  }
  
  public void setContentEncoding(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null) {
      localBasicHeader = new BasicHeader("Content-Encoding", paramString);
    }
    setContentEncoding(localBasicHeader);
  }
  
  public void setContentEncoding(Header paramHeader)
  {
    this.contentEncoding = paramHeader;
  }
  
  public void setContentType(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null) {
      localBasicHeader = new BasicHeader("Content-Type", paramString);
    }
    setContentType(localBasicHeader);
  }
  
  public void setContentType(Header paramHeader)
  {
    this.contentType = paramHeader;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\entity\AbstractHttpEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */