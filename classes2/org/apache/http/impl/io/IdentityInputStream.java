package org.apache.http.impl.io;

import java.io.InputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
public class IdentityInputStream
  extends InputStream
{
  private boolean closed = false;
  private final SessionInputBuffer in;
  
  public IdentityInputStream(SessionInputBuffer paramSessionInputBuffer)
  {
    this.in = ((SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer"));
  }
  
  public int available()
  {
    if ((this.in instanceof BufferInfo)) {
      return ((BufferInfo)this.in).length();
    }
    return 0;
  }
  
  public void close()
  {
    this.closed = true;
  }
  
  public int read()
  {
    if (this.closed) {
      return -1;
    }
    return this.in.read();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.closed) {
      return -1;
    }
    return this.in.read(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\IdentityInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */