package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@NotThreadSafe
public class BufferedHttpEntity
  extends HttpEntityWrapper
{
  private final byte[] buffer;
  
  public BufferedHttpEntity(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
    if ((!paramHttpEntity.isRepeatable()) || (paramHttpEntity.getContentLength() < 0L))
    {
      this.buffer = EntityUtils.toByteArray(paramHttpEntity);
      return;
    }
    this.buffer = null;
  }
  
  public InputStream getContent()
  {
    if (this.buffer != null) {
      return new ByteArrayInputStream(this.buffer);
    }
    return super.getContent();
  }
  
  public long getContentLength()
  {
    if (this.buffer != null) {
      return this.buffer.length;
    }
    return super.getContentLength();
  }
  
  public boolean isChunked()
  {
    return (this.buffer == null) && (super.isChunked());
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return (this.buffer == null) && (super.isStreaming());
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    if (this.buffer != null)
    {
      paramOutputStream.write(this.buffer);
      return;
    }
    super.writeTo(paramOutputStream);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\BufferedHttpEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */