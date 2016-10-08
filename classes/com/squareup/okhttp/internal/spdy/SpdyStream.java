package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public final class SpdyStream
{
  public static final int WINDOW_UPDATE_THRESHOLD = 32768;
  private final SpdyConnection connection;
  private ErrorCode errorCode = null;
  private final int id;
  private final SpdyStream.SpdyDataInputStream in = new SpdyStream.SpdyDataInputStream(this, null);
  private final SpdyStream.SpdyDataOutputStream out = new SpdyStream.SpdyDataOutputStream(this, null);
  private final int priority;
  private long readTimeoutMillis = 0L;
  private final List<String> requestHeaders;
  private List<String> responseHeaders;
  private int writeWindowSize;
  
  static
  {
    if (!SpdyStream.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  SpdyStream(int paramInt1, SpdyConnection paramSpdyConnection, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, List<String> paramList, Settings paramSettings)
  {
    if (paramSpdyConnection == null) {
      throw new NullPointerException("connection == null");
    }
    if (paramList == null) {
      throw new NullPointerException("requestHeaders == null");
    }
    this.id = paramInt1;
    this.connection = paramSpdyConnection;
    SpdyStream.SpdyDataInputStream.access$1(this.in, paramBoolean2);
    SpdyStream.SpdyDataOutputStream.access$1(this.out, paramBoolean1);
    this.priority = paramInt2;
    this.requestHeaders = paramList;
    setSettings(paramSettings);
  }
  
  private void cancelStreamIfNecessary()
  {
    assert (!Thread.holdsLock(this));
    for (;;)
    {
      try
      {
        boolean bool;
        if ((!SpdyStream.SpdyDataInputStream.access$2(this.in)) && (SpdyStream.SpdyDataInputStream.access$3(this.in)))
        {
          if (SpdyStream.SpdyDataOutputStream.access$2(this.out)) {
            break label112;
          }
          if (SpdyStream.SpdyDataOutputStream.access$3(this.out))
          {
            break label112;
            bool = isOpen();
            if (i == 0) {
              break label95;
            }
            close(ErrorCode.CANCEL);
            return;
          }
        }
        i = 0;
        continue;
        if (bool) {
          continue;
        }
      }
      finally {}
      label95:
      this.connection.removeStream(this.id);
      return;
      label112:
      int i = 1;
    }
  }
  
  private boolean closeInternal(ErrorCode paramErrorCode)
  {
    assert (!Thread.holdsLock(this));
    try
    {
      if (this.errorCode != null) {
        return false;
      }
      if ((SpdyStream.SpdyDataInputStream.access$2(this.in)) && (SpdyStream.SpdyDataOutputStream.access$2(this.out))) {
        return false;
      }
    }
    finally {}
    this.errorCode = paramErrorCode;
    notifyAll();
    this.connection.removeStream(this.id);
    return true;
  }
  
  private void setSettings(Settings paramSettings)
  {
    int i = 65536;
    assert (Thread.holdsLock(this.connection));
    if (paramSettings != null) {
      i = paramSettings.getInitialWindowSize(65536);
    }
    this.writeWindowSize = i;
  }
  
  public void close(ErrorCode paramErrorCode)
  {
    if (!closeInternal(paramErrorCode)) {
      return;
    }
    this.connection.writeSynReset(this.id, paramErrorCode);
  }
  
  public void closeLater(ErrorCode paramErrorCode)
  {
    if (!closeInternal(paramErrorCode)) {
      return;
    }
    this.connection.writeSynResetLater(this.id, paramErrorCode);
  }
  
  public SpdyConnection getConnection()
  {
    return this.connection;
  }
  
  public ErrorCode getErrorCode()
  {
    try
    {
      ErrorCode localErrorCode = this.errorCode;
      return localErrorCode;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public InputStream getInputStream()
  {
    return this.in;
  }
  
  public OutputStream getOutputStream()
  {
    try
    {
      if ((this.responseHeaders == null) && (!isLocallyInitiated())) {
        throw new IllegalStateException("reply before requesting the output stream");
      }
    }
    finally {}
    return this.out;
  }
  
  int getPriority()
  {
    return this.priority;
  }
  
  public long getReadTimeoutMillis()
  {
    return this.readTimeoutMillis;
  }
  
  public List<String> getRequestHeaders()
  {
    return this.requestHeaders;
  }
  
  public List<String> getResponseHeaders()
  {
    for (;;)
    {
      try
      {
        if (this.readTimeoutMillis == 0L) {
          break label177;
        }
        l2 = System.nanoTime() / 1000000L;
        l1 = this.readTimeoutMillis;
        try
        {
          if ((this.responseHeaders != null) || (this.errorCode != null))
          {
            if (this.responseHeaders == null) {
              break label150;
            }
            List localList = this.responseHeaders;
            return localList;
          }
          if (this.readTimeoutMillis == 0L)
          {
            wait();
            continue;
            InterruptedIOException localInterruptedIOException;
            localObject = finally;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedIOException = new InterruptedIOException();
          localInterruptedIOException.initCause(localInterruptedException);
          throw localInterruptedIOException;
        }
        if (l1 <= 0L) {
          break label123;
        }
      }
      finally {}
      wait(l1);
      long l1 = this.readTimeoutMillis + l2 - System.nanoTime() / 1000000L;
      continue;
      label123:
      throw new SocketTimeoutException("Read response header timeout. readTimeoutMillis: " + this.readTimeoutMillis);
      label150:
      throw new IOException("stream was reset: " + this.errorCode);
      label177:
      long l2 = 0L;
      l1 = 0L;
    }
  }
  
  public boolean isLocallyInitiated()
  {
    if (this.id % 2 == 1) {}
    for (int i = 1; this.connection.client == i; i = 0) {
      return true;
    }
    return false;
  }
  
  /* Error */
  public boolean isOpen()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 59	com/squareup/okhttp/internal/spdy/SpdyStream:errorCode	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 50	com/squareup/okhttp/internal/spdy/SpdyStream:in	Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;
    //   21: invokestatic 118	com/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream:access$2	(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z
    //   24: ifne +13 -> 37
    //   27: aload_0
    //   28: getfield 50	com/squareup/okhttp/internal/spdy/SpdyStream:in	Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;
    //   31: invokestatic 120	com/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream:access$3	(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataInputStream;)Z
    //   34: ifeq +32 -> 66
    //   37: aload_0
    //   38: getfield 57	com/squareup/okhttp/internal/spdy/SpdyStream:out	Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    //   41: invokestatic 123	com/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream:access$2	(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z
    //   44: ifne +13 -> 57
    //   47: aload_0
    //   48: getfield 57	com/squareup/okhttp/internal/spdy/SpdyStream:out	Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    //   51: invokestatic 125	com/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream:access$3	(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z
    //   54: ifeq +12 -> 66
    //   57: aload_0
    //   58: getfield 175	com/squareup/okhttp/internal/spdy/SpdyStream:responseHeaders	Ljava/util/List;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnonnull -50 -> 13
    //   66: iconst_1
    //   67: istore_2
    //   68: goto -55 -> 13
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	SpdyStream
    //   8	55	1	localObject1	Object
    //   71	4	1	localObject2	Object
    //   1	67	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	9	71	finally
    //   17	37	71	finally
    //   37	57	71	finally
    //   57	62	71	finally
  }
  
  void receiveData(InputStream paramInputStream, int paramInt)
  {
    assert (!Thread.holdsLock(this));
    this.in.receive(paramInputStream, paramInt);
  }
  
  void receiveFin()
  {
    assert (!Thread.holdsLock(this));
    try
    {
      SpdyStream.SpdyDataInputStream.access$1(this.in, true);
      boolean bool = isOpen();
      notifyAll();
      if (!bool) {
        this.connection.removeStream(this.id);
      }
      return;
    }
    finally {}
  }
  
  void receiveHeaders(List<String> paramList, HeadersMode paramHeadersMode)
  {
    assert (!Thread.holdsLock(this));
    Object localObject = null;
    boolean bool = true;
    label97:
    do
    {
      for (;;)
      {
        try
        {
          if (this.responseHeaders == null)
          {
            if (paramHeadersMode.failIfHeadersAbsent())
            {
              paramList = ErrorCode.PROTOCOL_ERROR;
              if (paramList == null) {
                break;
              }
              closeLater(paramList);
              return;
            }
            this.responseHeaders = paramList;
            bool = isOpen();
            notifyAll();
            paramList = (List<String>)localObject;
            continue;
          }
          if (!paramHeadersMode.failIfHeadersPresent()) {
            break label97;
          }
        }
        finally {}
        paramList = ErrorCode.STREAM_IN_USE;
        continue;
        paramHeadersMode = new ArrayList();
        paramHeadersMode.addAll(this.responseHeaders);
        paramHeadersMode.addAll(paramList);
        this.responseHeaders = paramHeadersMode;
        paramList = (List<String>)localObject;
      }
    } while (bool);
    this.connection.removeStream(this.id);
  }
  
  void receiveRstStream(ErrorCode paramErrorCode)
  {
    try
    {
      if (this.errorCode == null)
      {
        this.errorCode = paramErrorCode;
        notifyAll();
      }
      return;
    }
    finally
    {
      paramErrorCode = finally;
      throw paramErrorCode;
    }
  }
  
  void receiveSettings(Settings paramSettings)
  {
    assert (Thread.holdsLock(this));
    setSettings(paramSettings);
    notifyAll();
  }
  
  void receiveWindowUpdate(int paramInt)
  {
    try
    {
      SpdyStream.SpdyDataOutputStream localSpdyDataOutputStream = this.out;
      SpdyStream.SpdyDataOutputStream.access$5(localSpdyDataOutputStream, SpdyStream.SpdyDataOutputStream.access$4(localSpdyDataOutputStream) - paramInt);
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void reply(List<String> paramList, boolean paramBoolean)
  {
    boolean bool = true;
    assert (!Thread.holdsLock(this));
    if (paramList == null) {
      try
      {
        throw new NullPointerException("responseHeaders == null");
      }
      finally {}
    }
    if (isLocallyInitiated()) {
      throw new IllegalStateException("cannot reply to a locally initiated stream");
    }
    if (this.responseHeaders != null) {
      throw new IllegalStateException("reply already sent");
    }
    this.responseHeaders = paramList;
    if (!paramBoolean) {
      SpdyStream.SpdyDataOutputStream.access$1(this.out, true);
    }
    for (paramBoolean = bool;; paramBoolean = false)
    {
      this.connection.writeSynReply(this.id, paramBoolean, paramList);
      return;
    }
  }
  
  public void setReadTimeout(long paramLong)
  {
    this.readTimeoutMillis = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */