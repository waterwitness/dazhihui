package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

@NotThreadSafe
public class ContentLengthInputStream
  extends InputStream
{
  private static final int BUFFER_SIZE = 2048;
  private boolean closed = false;
  private final long contentLength;
  private SessionInputBuffer in = null;
  private long pos = 0L;
  
  public ContentLengthInputStream(SessionInputBuffer paramSessionInputBuffer, long paramLong)
  {
    this.in = ((SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer"));
    this.contentLength = Args.notNegative(paramLong, "Content length");
  }
  
  public int available()
  {
    if ((this.in instanceof BufferInfo)) {
      return Math.min(((BufferInfo)this.in).length(), (int)(this.contentLength - this.pos));
    }
    return 0;
  }
  
  public void close()
  {
    if (!this.closed) {}
    try
    {
      if (this.pos < this.contentLength)
      {
        byte[] arrayOfByte = new byte['ࠀ'];
        int i;
        do
        {
          i = read(arrayOfByte);
        } while (i >= 0);
      }
      return;
    }
    finally
    {
      this.closed = true;
    }
  }
  
  public int read()
  {
    if (this.closed) {
      throw new IOException("Attempted read from closed stream.");
    }
    if (this.pos >= this.contentLength) {
      return -1;
    }
    int i = this.in.read();
    if (i == -1)
    {
      if (this.pos < this.contentLength) {
        throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
      }
    }
    else {
      this.pos += 1L;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.closed) {
      throw new IOException("Attempted read from closed stream.");
    }
    if (this.pos >= this.contentLength) {
      return -1;
    }
    int i = paramInt2;
    if (this.pos + paramInt2 > this.contentLength) {
      i = (int)(this.contentLength - this.pos);
    }
    paramInt1 = this.in.read(paramArrayOfByte, paramInt1, i);
    if ((paramInt1 == -1) && (this.pos < this.contentLength)) {
      throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
    }
    if (paramInt1 > 0) {
      this.pos += paramInt1;
    }
    return paramInt1;
  }
  
  public long skip(long paramLong)
  {
    if (paramLong <= 0L) {
      return 0L;
    }
    byte[] arrayOfByte = new byte['ࠀ'];
    paramLong = Math.min(paramLong, this.contentLength - this.pos);
    long l = 0L;
    for (;;)
    {
      int i;
      if (paramLong > 0L)
      {
        i = read(arrayOfByte, 0, (int)Math.min(2048L, paramLong));
        if (i != -1) {}
      }
      else
      {
        return l;
      }
      l += i;
      paramLong -= i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\impl\io\ContentLengthInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */