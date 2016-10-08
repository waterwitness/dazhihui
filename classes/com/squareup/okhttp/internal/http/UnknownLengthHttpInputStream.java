package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.InputStream;
import java.net.CacheRequest;

final class UnknownLengthHttpInputStream
  extends AbstractHttpInputStream
{
  private boolean inputExhausted;
  
  UnknownLengthHttpInputStream(InputStream paramInputStream, CacheRequest paramCacheRequest, HttpEngine paramHttpEngine)
  {
    super(paramInputStream, paramHttpEngine, paramCacheRequest);
  }
  
  public int available()
  {
    checkNotClosed();
    if (this.in == null) {
      return 0;
    }
    return this.in.available();
  }
  
  public void close()
  {
    if (this.closed) {}
    do
    {
      return;
      this.closed = true;
    } while (this.inputExhausted);
    unexpectedEndOfInput();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
    checkNotClosed();
    if ((this.in == null) || (this.inputExhausted)) {
      return -1;
    }
    paramInt2 = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt2 == -1)
    {
      this.inputExhausted = true;
      endOfInput();
      return -1;
    }
    cacheWrite(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\UnknownLengthHttpInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */