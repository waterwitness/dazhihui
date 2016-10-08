package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
public class ContentLengthOutputStream
  extends OutputStream
{
  private boolean closed = false;
  private final long contentLength;
  private final SessionOutputBuffer out;
  private long total = 0L;
  
  public ContentLengthOutputStream(SessionOutputBuffer paramSessionOutputBuffer, long paramLong)
  {
    this.out = ((SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session output buffer"));
    this.contentLength = Args.notNegative(paramLong, "Content length");
  }
  
  public void close()
  {
    if (!this.closed)
    {
      this.closed = true;
      this.out.flush();
    }
  }
  
  public void flush()
  {
    this.out.flush();
  }
  
  public void write(int paramInt)
  {
    if (this.closed) {
      throw new IOException("Attempted write to closed stream.");
    }
    if (this.total < this.contentLength)
    {
      this.out.write(paramInt);
      this.total += 1L;
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.closed) {
      throw new IOException("Attempted write to closed stream.");
    }
    if (this.total < this.contentLength)
    {
      long l = this.contentLength - this.total;
      int i = paramInt2;
      if (paramInt2 > l) {
        i = (int)l;
      }
      this.out.write(paramArrayOfByte, paramInt1, i);
      this.total += i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\ContentLengthOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */