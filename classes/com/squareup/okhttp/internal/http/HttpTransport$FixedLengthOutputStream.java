package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.OutputStream;
import java.net.ProtocolException;

final class HttpTransport$FixedLengthOutputStream
  extends AbstractOutputStream
{
  private long bytesRemaining;
  private final OutputStream socketOut;
  
  private HttpTransport$FixedLengthOutputStream(OutputStream paramOutputStream, long paramLong)
  {
    this.socketOut = paramOutputStream;
    this.bytesRemaining = paramLong;
  }
  
  public void close()
  {
    if (this.closed) {}
    do
    {
      return;
      this.closed = true;
    } while (this.bytesRemaining <= 0L);
    throw new ProtocolException("unexpected end of stream");
  }
  
  public void flush()
  {
    if (this.closed) {
      return;
    }
    this.socketOut.flush();
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    checkNotClosed();
    Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
    if (paramInt2 > this.bytesRemaining) {
      throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + paramInt2);
    }
    this.socketOut.write(paramArrayOfByte, paramInt1, paramInt2);
    this.bytesRemaining -= paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpTransport$FixedLengthOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */