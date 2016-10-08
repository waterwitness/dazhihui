package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class SpdyConnection
  implements Closeable
{
  private static final ExecutorService executor;
  final boolean client;
  private final FrameReader frameReader;
  private final FrameWriter frameWriter;
  private final IncomingStreamHandler handler;
  private final String hostName;
  private long idleStartTimeNs = System.nanoTime();
  private int lastGoodStreamId;
  private int nextPingId;
  private int nextStreamId;
  private Map<Integer, Ping> pings;
  Settings settings;
  private boolean shutdown;
  private final Map<Integer, SpdyStream> streams = new HashMap();
  final Variant variant;
  
  static
  {
    if (!SpdyConnection.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.daemonThreadFactory("OkHttp SpdyConnection"));
      return;
    }
  }
  
  private SpdyConnection(SpdyConnection.Builder paramBuilder)
  {
    this.variant = SpdyConnection.Builder.access$0(paramBuilder);
    this.client = SpdyConnection.Builder.access$1(paramBuilder);
    this.handler = SpdyConnection.Builder.access$2(paramBuilder);
    this.frameReader = this.variant.newReader(SpdyConnection.Builder.access$3(paramBuilder), this.client);
    this.frameWriter = this.variant.newWriter(SpdyConnection.Builder.access$4(paramBuilder), this.client);
    if (SpdyConnection.Builder.access$1(paramBuilder))
    {
      i = 1;
      this.nextStreamId = i;
      if (!SpdyConnection.Builder.access$1(paramBuilder)) {
        break label170;
      }
    }
    label170:
    for (int i = j;; i = 2)
    {
      this.nextPingId = i;
      this.hostName = SpdyConnection.Builder.access$5(paramBuilder);
      new Thread(new SpdyConnection.Reader(this, null), "Spdy Reader " + this.hostName).start();
      return;
      i = 2;
      break;
    }
  }
  
  private void close(ErrorCode paramErrorCode1, ErrorCode paramErrorCode2)
  {
    assert (!Thread.holdsLock(this));
    try
    {
      shutdown(paramErrorCode1);
      paramErrorCode1 = null;
    }
    catch (IOException paramErrorCode1)
    {
      for (;;) {}
    }
    for (;;)
    {
      SpdyStream[] arrayOfSpdyStream;
      Ping[] arrayOfPing;
      Object localObject;
      int i;
      try
      {
        if (this.streams.isEmpty()) {
          break label289;
        }
        arrayOfSpdyStream = (SpdyStream[])this.streams.values().toArray(new SpdyStream[this.streams.size()]);
        this.streams.clear();
        setIdle(false);
        if (this.pings == null) {
          break label283;
        }
        arrayOfPing = (Ping[])this.pings.values().toArray(new Ping[this.pings.size()]);
        this.pings = null;
        localObject = paramErrorCode1;
        int j;
        if (arrayOfSpdyStream != null)
        {
          j = arrayOfSpdyStream.length;
          i = 0;
          if (i >= j) {
            localObject = paramErrorCode1;
          }
        }
        else if (arrayOfPing != null)
        {
          j = arrayOfPing.length;
          i = 0;
          if (i < j) {
            break label251;
          }
        }
      }
      finally {}
      try
      {
        this.frameReader.close();
        paramErrorCode1 = (ErrorCode)localObject;
      }
      catch (IOException paramErrorCode1)
      {
        label251:
        continue;
      }
      try
      {
        this.frameWriter.close();
        paramErrorCode2 = paramErrorCode1;
      }
      catch (IOException paramErrorCode2)
      {
        if (paramErrorCode1 == null) {
          continue;
        }
        paramErrorCode2 = paramErrorCode1;
        continue;
      }
      if (paramErrorCode2 != null)
      {
        throw paramErrorCode2;
        localObject = arrayOfSpdyStream[i];
        try
        {
          ((SpdyStream)localObject).close(paramErrorCode2);
          localObject = paramErrorCode1;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            localObject = paramErrorCode1;
            if (paramErrorCode1 != null) {
              localObject = localIOException;
            }
          }
        }
        i += 1;
        paramErrorCode1 = (ErrorCode)localObject;
        continue;
        arrayOfPing[i].cancel();
        i += 1;
      }
      else
      {
        return;
        label283:
        arrayOfPing = null;
        continue;
        label289:
        arrayOfSpdyStream = null;
      }
    }
  }
  
  private SpdyStream getStream(int paramInt)
  {
    try
    {
      SpdyStream localSpdyStream = (SpdyStream)this.streams.get(Integer.valueOf(paramInt));
      return localSpdyStream;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private Ping removePing(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 263	com/squareup/okhttp/internal/spdy/SpdyConnection:pings	Ljava/util/Map;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 263	com/squareup/okhttp/internal/spdy/SpdyConnection:pings	Ljava/util/Map;
    //   13: iload_1
    //   14: invokestatic 285	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   17: invokeinterface 292 2 0
    //   22: checkcast 265	com/squareup/okhttp/internal/spdy/Ping
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: areturn
    //   30: aconst_null
    //   31: astore_2
    //   32: goto -6 -> 26
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	SpdyConnection
    //   0	40	1	paramInt	int
    //   25	7	2	localPing	Ping
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	35	finally
  }
  
  private void setIdle(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        l = System.nanoTime();
        this.idleStartTimeNs = l;
        return;
      }
      finally {}
      long l = Long.MAX_VALUE;
    }
  }
  
  private void writePing(boolean paramBoolean, int paramInt1, int paramInt2, Ping paramPing)
  {
    FrameWriter localFrameWriter = this.frameWriter;
    if (paramPing != null) {}
    try
    {
      paramPing.send();
      this.frameWriter.ping(paramBoolean, paramInt1, paramInt2);
      return;
    }
    finally {}
  }
  
  private void writePingLater(boolean paramBoolean, int paramInt1, int paramInt2, Ping paramPing)
  {
    executor.submit(new SpdyConnection.3(this, "OkHttp SPDY Writer %s ping %08x%08x", new Object[] { this.hostName, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }, paramBoolean, paramInt1, paramInt2, paramPing));
  }
  
  public void close()
  {
    close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
  }
  
  public void flush()
  {
    this.frameWriter.flush();
  }
  
  public long getIdleStartTimeNs()
  {
    try
    {
      long l = this.idleStartTimeNs;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isIdle()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 90	com/squareup/okhttp/internal/spdy/SpdyConnection:idleStartTimeNs	J
    //   6: lstore_2
    //   7: lload_2
    //   8: ldc2_w 293
    //   11: lcmp
    //   12: ifeq +11 -> 23
    //   15: iconst_1
    //   16: istore 4
    //   18: aload_0
    //   19: monitorexit
    //   20: iload 4
    //   22: ireturn
    //   23: iconst_0
    //   24: istore 4
    //   26: goto -8 -> 18
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	SpdyConnection
    //   29	4	1	localObject	Object
    //   6	2	2	l	long
    //   16	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
  }
  
  public SpdyStream newStream(List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      paramBoolean1 = false;
      if (!paramBoolean2) {
        break label57;
      }
    }
    label57:
    for (paramBoolean2 = false;; paramBoolean2 = true)
    {
      synchronized (this.frameWriter)
      {
        try
        {
          if (!this.shutdown) {
            break label62;
          }
          throw new IOException("shutdown");
        }
        finally {}
      }
      paramBoolean1 = true;
      break;
    }
    label62:
    int i = this.nextStreamId;
    this.nextStreamId += 2;
    SpdyStream localSpdyStream = new SpdyStream(i, this, paramBoolean1, paramBoolean2, 0, paramList, this.settings);
    if (localSpdyStream.isOpen())
    {
      this.streams.put(Integer.valueOf(i), localSpdyStream);
      setIdle(false);
    }
    this.frameWriter.synStream(paramBoolean1, paramBoolean2, i, 0, 0, 0, paramList);
    return localSpdyStream;
  }
  
  public void noop()
  {
    this.frameWriter.noop();
  }
  
  public int openStreamCount()
  {
    try
    {
      int i = this.streams.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Ping ping()
  {
    Ping localPing = new Ping();
    try
    {
      if (this.shutdown) {
        throw new IOException("shutdown");
      }
    }
    finally {}
    int i = this.nextPingId;
    this.nextPingId += 2;
    if (this.pings == null) {
      this.pings = new HashMap();
    }
    this.pings.put(Integer.valueOf(i), localObject);
    writePing(false, i, 1330343787, (Ping)localObject);
    return (Ping)localObject;
  }
  
  public void readConnectionHeader()
  {
    this.frameReader.readConnectionHeader();
  }
  
  SpdyStream removeStream(int paramInt)
  {
    try
    {
      SpdyStream localSpdyStream = (SpdyStream)this.streams.remove(Integer.valueOf(paramInt));
      if ((localSpdyStream != null) && (this.streams.isEmpty())) {
        setIdle(true);
      }
      return localSpdyStream;
    }
    finally {}
  }
  
  public void sendConnectionHeader()
  {
    this.frameWriter.connectionHeader();
    this.frameWriter.settings(new Settings());
  }
  
  public void shutdown(ErrorCode paramErrorCode)
  {
    int i;
    synchronized (this.frameWriter) {}
  }
  
  public void writeData(int paramInt1, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    this.frameWriter.data(paramBoolean, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  void writeSynReply(int paramInt, boolean paramBoolean, List<String> paramList)
  {
    this.frameWriter.synReply(paramBoolean, paramInt, paramList);
  }
  
  void writeSynReset(int paramInt, ErrorCode paramErrorCode)
  {
    this.frameWriter.rstStream(paramInt, paramErrorCode);
  }
  
  void writeSynResetLater(int paramInt, ErrorCode paramErrorCode)
  {
    executor.submit(new SpdyConnection.1(this, "OkHttp SPDY Writer %s stream %d", new Object[] { this.hostName, Integer.valueOf(paramInt) }, paramInt, paramErrorCode));
  }
  
  void writeWindowUpdate(int paramInt1, int paramInt2)
  {
    this.frameWriter.windowUpdate(paramInt1, paramInt2);
  }
  
  void writeWindowUpdateLater(int paramInt1, int paramInt2)
  {
    executor.submit(new SpdyConnection.2(this, "OkHttp SPDY Writer %s stream %d", new Object[] { this.hostName, Integer.valueOf(paramInt1) }, paramInt1, paramInt2));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */