package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
public class IdentityOutputStream
  extends OutputStream
{
  private boolean closed = false;
  private final SessionOutputBuffer out;
  
  public IdentityOutputStream(SessionOutputBuffer paramSessionOutputBuffer)
  {
    this.out = ((SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session output buffer"));
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
    this.out.write(paramInt);
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
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\IdentityOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */