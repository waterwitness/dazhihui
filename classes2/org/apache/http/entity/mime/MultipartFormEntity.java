package org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class MultipartFormEntity
  implements HttpEntity
{
  private final long contentLength;
  private final Header contentType;
  private final AbstractMultipartForm multipart;
  
  MultipartFormEntity(AbstractMultipartForm paramAbstractMultipartForm, String paramString, long paramLong)
  {
    this.multipart = paramAbstractMultipartForm;
    this.contentType = new BasicHeader("Content-Type", paramString);
    this.contentLength = paramLong;
  }
  
  public void consumeContent()
  {
    if (isStreaming()) {
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
    }
  }
  
  public InputStream getContent()
  {
    throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
  }
  
  public Header getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    return this.contentLength;
  }
  
  public Header getContentType()
  {
    return this.contentType;
  }
  
  AbstractMultipartForm getMultipart()
  {
    return this.multipart;
  }
  
  public boolean isChunked()
  {
    return !isRepeatable();
  }
  
  public boolean isRepeatable()
  {
    return this.contentLength != -1L;
  }
  
  public boolean isStreaming()
  {
    return !isRepeatable();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.multipart.writeTo(paramOutputStream);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\mime\MultipartFormEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */