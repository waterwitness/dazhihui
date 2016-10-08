package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class ByteArrayEntity
  extends AbstractHttpEntity
  implements Cloneable
{
  private final byte[] b;
  @Deprecated
  protected final byte[] content;
  private final int len;
  private final int off;
  
  public ByteArrayEntity(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, null);
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(paramArrayOfByte, paramInt1, paramInt2, null);
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, int paramInt1, int paramInt2, ContentType paramContentType)
  {
    Args.notNull(paramArrayOfByte, "Source byte array");
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfByte.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length)) {
      throw new IndexOutOfBoundsException("off: " + paramInt1 + " len: " + paramInt2 + " b.length: " + paramArrayOfByte.length);
    }
    this.content = paramArrayOfByte;
    this.b = paramArrayOfByte;
    this.off = paramInt1;
    this.len = paramInt2;
    if (paramContentType != null) {
      setContentType(paramContentType.toString());
    }
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, ContentType paramContentType)
  {
    Args.notNull(paramArrayOfByte, "Source byte array");
    this.content = paramArrayOfByte;
    this.b = paramArrayOfByte;
    this.off = 0;
    this.len = this.b.length;
    if (paramContentType != null) {
      setContentType(paramContentType.toString());
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    return new ByteArrayInputStream(this.b, this.off, this.len);
  }
  
  public long getContentLength()
  {
    return this.len;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    paramOutputStream.write(this.b, this.off, this.len);
    paramOutputStream.flush();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\entity\ByteArrayEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */