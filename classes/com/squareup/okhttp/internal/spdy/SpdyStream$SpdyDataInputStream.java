package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

final class SpdyStream$SpdyDataInputStream
  extends InputStream
{
  private final byte[] buffer = new byte[65536];
  private boolean closed;
  private boolean finished;
  private int limit;
  private int pos = -1;
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
  
  private SpdyStream$SpdyDataInputStream(SpdyStream paramSpdyStream) {}
  
  private void checkNotClosed()
  {
    if (this.closed) {
      throw new IOException("stream closed");
    }
    if (SpdyStream.access$3(this.this$0) != null) {
      throw new IOException("stream was reset: " + SpdyStream.access$3(this.this$0));
    }
  }
  
  private void waitUntilReadable()
  {
    long l2;
    long l1;
    if (SpdyStream.access$2(this.this$0) != 0L)
    {
      l2 = System.nanoTime() / 1000000L;
      l1 = SpdyStream.access$2(this.this$0);
    }
    for (;;)
    {
      try
      {
        if ((this.pos != -1) || (this.finished) || (this.closed)) {
          break;
        }
        if (SpdyStream.access$3(this.this$0) != null) {
          return;
        }
        if (SpdyStream.access$2(this.this$0) == 0L)
        {
          this.this$0.wait();
          continue;
        }
        if (l1 <= 0L) {
          break label129;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        throw new InterruptedIOException();
      }
      this.this$0.wait(l1);
      l1 = SpdyStream.access$2(this.this$0) + l2 - System.nanoTime() / 1000000L;
      continue;
      label129:
      throw new SocketTimeoutException();
      l1 = 0L;
      l2 = 0L;
    }
  }
  
  public int available()
  {
    synchronized (this.this$0)
    {
      checkNotClosed();
      if (this.pos == -1) {
        return 0;
      }
      if (this.limit > this.pos)
      {
        i = this.limit;
        j = this.pos;
        return i - j;
      }
    }
    int i = this.limit;
    int j = this.buffer.length;
    int k = this.pos;
    return i + (j - k);
  }
  
  public void close()
  {
    synchronized (this.this$0)
    {
      this.closed = true;
      this.this$0.notifyAll();
      SpdyStream.access$4(this.this$0);
      return;
    }
  }
  
  public int read()
  {
    return Util.readSingleByte(this);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      synchronized (this.this$0)
      {
        Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
        waitUntilReadable();
        checkNotClosed();
        if (this.pos == -1) {
          return -1;
        }
        if (this.limit <= this.pos)
        {
          i = Math.min(paramInt2, this.buffer.length - this.pos);
          System.arraycopy(this.buffer, this.pos, paramArrayOfByte, paramInt1, i);
          this.pos += i;
          int j = i + 0;
          i = j;
          if (this.pos == this.buffer.length)
          {
            this.pos = 0;
            i = j;
          }
          j = i;
          if (i < paramInt2)
          {
            paramInt2 = Math.min(this.limit - this.pos, paramInt2 - i);
            System.arraycopy(this.buffer, this.pos, paramArrayOfByte, paramInt1 + i, paramInt2);
            this.pos += paramInt2;
            j = i + paramInt2;
          }
          this.unacknowledgedBytes += j;
          if (this.unacknowledgedBytes >= 32768)
          {
            SpdyStream.access$0(this.this$0).writeWindowUpdateLater(SpdyStream.access$1(this.this$0), this.unacknowledgedBytes);
            this.unacknowledgedBytes = 0;
          }
          if (this.pos == this.limit)
          {
            this.pos = -1;
            this.limit = 0;
          }
          return j;
        }
      }
      int i = 0;
    }
  }
  
  void receive(InputStream arg1, int paramInt)
  {
    int k = 0;
    assert (!Thread.holdsLock(this.this$0));
    if (paramInt == 0) {
      return;
    }
    boolean bool;
    int i1;
    int n;
    int m;
    synchronized (this.this$0)
    {
      bool = this.finished;
      i1 = this.pos;
      n = this.limit;
      m = this.limit;
      if (paramInt > this.buffer.length - available())
      {
        i = 1;
        if (i != 0)
        {
          Util.skipByReading(???, paramInt);
          this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
        }
      }
      else
      {
        i = 0;
      }
    }
    if (bool)
    {
      Util.skipByReading(???, paramInt);
      return;
    }
    int j = m;
    int i = paramInt;
    if (i1 < m)
    {
      i = Math.min(paramInt, this.buffer.length - m);
      Util.readFully(???, this.buffer, m, i);
      m += i;
      paramInt -= i;
      j = m;
      i = paramInt;
      if (m == this.buffer.length) {
        i = paramInt;
      }
    }
    for (paramInt = k;; paramInt = j)
    {
      j = paramInt;
      if (i > 0)
      {
        Util.readFully(???, this.buffer, paramInt, i);
        j = paramInt + i;
      }
      synchronized (this.this$0)
      {
        this.limit = j;
        if (this.pos == -1)
        {
          this.pos = n;
          this.this$0.notifyAll();
        }
        return;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyStream$SpdyDataInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */