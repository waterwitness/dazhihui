package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.InputStream;
import java.net.CacheRequest;
import java.net.ProtocolException;

class HttpTransport$FixedLengthInputStream
  extends AbstractHttpInputStream
{
  private long bytesRemaining;
  
  public HttpTransport$FixedLengthInputStream(InputStream paramInputStream, CacheRequest paramCacheRequest, HttpEngine paramHttpEngine, long paramLong)
  {
    super(paramInputStream, paramHttpEngine, paramCacheRequest);
    this.bytesRemaining = paramLong;
    if (this.bytesRemaining == 0L) {
      endOfInput();
    }
  }
  
  public int available()
  {
    checkNotClosed();
    if (this.bytesRemaining == 0L) {
      return 0;
    }
    return (int)Math.min(this.in.available(), this.bytesRemaining);
  }
  
  public void close()
  {
    if (this.closed) {
      return;
    }
    if ((this.bytesRemaining != 0L) && (!HttpTransport.access$0(this.httpEngine, this))) {
      unexpectedEndOfInput();
    }
    this.closed = true;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
    checkNotClosed();
    if (this.bytesRemaining == 0L) {
      return -1;
    }
    paramInt2 = this.in.read(paramArrayOfByte, paramInt1, (int)Math.min(paramInt2, this.bytesRemaining));
    if (paramInt2 == -1)
    {
      unexpectedEndOfInput();
      throw new ProtocolException("unexpected end of stream");
    }
    this.bytesRemaining -= paramInt2;
    cacheWrite(paramArrayOfByte, paramInt1, paramInt2);
    if (this.bytesRemaining == 0L) {
      endOfInput();
    }
    return paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpTransport$FixedLengthInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */