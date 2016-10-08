package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;

final class SpdyStream$SpdyDataOutputStream
  extends OutputStream
{
  private final byte[] buffer = new byte[' '];
  private boolean closed;
  private boolean finished;
  private int pos = 0;
  private int unacknowledgedBytes = 0;
  
  static
  {
    if (!SpdyStream.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  private SpdyStream$SpdyDataOutputStream(SpdyStream paramSpdyStream) {}
  
  private void checkNotClosed()
  {
    synchronized (this.this$0)
    {
      if (this.closed) {
        throw new IOException("stream closed");
      }
    }
    if (this.finished) {
      throw new IOException("stream finished");
    }
    if (SpdyStream.access$3(this.this$0) != null) {
      throw new IOException("stream was reset: " + SpdyStream.access$3(this.this$0));
    }
  }
  
  private void waitUntilWritable(int paramInt, boolean paramBoolean)
  {
    do
    {
      try
      {
        if (this.unacknowledgedBytes + paramInt < SpdyStream.access$6(this.this$0)) {
          return;
        }
        this.this$0.wait();
        if ((!paramBoolean) && (this.closed)) {
          throw new IOException("stream closed");
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        throw new InterruptedIOException();
      }
      if (this.finished) {
        throw new IOException("stream finished");
      }
    } while (SpdyStream.access$3(this.this$0) == null);
    throw new IOException("stream was reset: " + SpdyStream.access$3(this.this$0));
  }
  
  private void writeFrame(boolean paramBoolean)
  {
    assert (!Thread.holdsLock(this.this$0));
    int i = this.pos;
    synchronized (this.this$0)
    {
      waitUntilWritable(i, paramBoolean);
      this.unacknowledgedBytes = (i + this.unacknowledgedBytes);
      SpdyStream.access$0(this.this$0).writeData(SpdyStream.access$1(this.this$0), paramBoolean, this.buffer, 0, this.pos);
      this.pos = 0;
      return;
    }
  }
  
  public void close()
  {
    assert (!Thread.holdsLock(this.this$0));
    synchronized (this.this$0)
    {
      if (this.closed) {
        return;
      }
      this.closed = true;
      if (!SpdyStream.access$5(this.this$0).finished) {
        writeFrame(true);
      }
      SpdyStream.access$0(this.this$0).flush();
      SpdyStream.access$4(this.this$0);
      return;
    }
  }
  
  public void flush()
  {
    assert (!Thread.holdsLock(this.this$0));
    checkNotClosed();
    if (this.pos > 0)
    {
      writeFrame(false);
      SpdyStream.access$0(this.this$0).flush();
    }
  }
  
  public void write(int paramInt)
  {
    Util.writeSingleByte(this, paramInt);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    assert (!Thread.holdsLock(this.this$0));
    Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
    checkNotClosed();
    for (;;)
    {
      if (paramInt2 <= 0) {
        return;
      }
      if (this.pos == this.buffer.length) {
        writeFrame(false);
      }
      int i = Math.min(paramInt2, this.buffer.length - this.pos);
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.pos, i);
      this.pos += i;
      paramInt1 += i;
      paramInt2 -= i;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyStream$SpdyDataOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */