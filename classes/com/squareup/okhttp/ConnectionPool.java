package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConnectionPool
{
  private static final long DEFAULT_KEEP_ALIVE_DURATION_MS = 300000L;
  private static final int MAX_CONNECTIONS_TO_CLEANUP = 2;
  private static final ConnectionPool systemDefault;
  private final LinkedList<Connection> connections = new LinkedList();
  private final Callable<Void> connectionsCleanupCallable = new ConnectionPool.1(this);
  private final ExecutorService executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.daemonThreadFactory("OkHttp ConnectionPool"));
  private final long keepAliveDurationNs;
  private final int maxIdleConnections;
  
  static
  {
    String str1 = System.getProperty("http.keepAlive");
    String str2 = System.getProperty("http.keepAliveDuration");
    String str3 = System.getProperty("http.maxConnections");
    if (str2 != null) {}
    for (long l = Long.parseLong(str2); (str1 != null) && (!Boolean.parseBoolean(str1)); l = 300000L)
    {
      systemDefault = new ConnectionPool(0, l);
      return;
    }
    if (str3 != null)
    {
      systemDefault = new ConnectionPool(Integer.parseInt(str3), l);
      return;
    }
    systemDefault = new ConnectionPool(5, l);
  }
  
  public ConnectionPool(int paramInt, long paramLong)
  {
    this.maxIdleConnections = paramInt;
    this.keepAliveDurationNs = (paramLong * 1000L * 1000L);
  }
  
  public static ConnectionPool getDefault()
  {
    return systemDefault;
  }
  
  private void waitForCleanupCallableToRun()
  {
    try
    {
      this.executorService.submit(new ConnectionPool.2(this)).get();
      return;
    }
    catch (Exception localException)
    {
      throw new AssertionError();
    }
  }
  
  public void evictAll()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = new ArrayList(this.connections);
        this.connections.clear();
        localObject1 = ((List)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          return;
        }
      }
      finally {}
      Util.closeQuietly((Connection)((Iterator)localObject2).next());
    }
  }
  
  /* Error */
  public Connection get(Address paramAddress)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   6: aload_0
    //   7: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   10: invokevirtual 174	java/util/LinkedList:size	()I
    //   13: invokevirtual 178	java/util/LinkedList:listIterator	(I)Ljava/util/ListIterator;
    //   16: astore 4
    //   18: aload 4
    //   20: invokeinterface 183 1 0
    //   25: ifne +42 -> 67
    //   28: aconst_null
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull +18 -> 49
    //   34: aload_2
    //   35: invokevirtual 186	com/squareup/okhttp/Connection:isSpdy	()Z
    //   38: ifeq +11 -> 49
    //   41: aload_0
    //   42: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   45: aload_2
    //   46: invokevirtual 190	java/util/LinkedList:addFirst	(Ljava/lang/Object;)V
    //   49: aload_0
    //   50: getfield 95	com/squareup/okhttp/ConnectionPool:executorService	Ljava/util/concurrent/ExecutorService;
    //   53: aload_0
    //   54: getfield 102	com/squareup/okhttp/ConnectionPool:connectionsCleanupCallable	Ljava/util/concurrent/Callable;
    //   57: invokeinterface 193 2 0
    //   62: pop
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_2
    //   66: areturn
    //   67: aload 4
    //   69: invokeinterface 196 1 0
    //   74: checkcast 163	com/squareup/okhttp/Connection
    //   77: astore_3
    //   78: aload_3
    //   79: invokevirtual 200	com/squareup/okhttp/Connection:getRoute	()Lcom/squareup/okhttp/Route;
    //   82: invokevirtual 206	com/squareup/okhttp/Route:getAddress	()Lcom/squareup/okhttp/Address;
    //   85: aload_1
    //   86: invokevirtual 212	com/squareup/okhttp/Address:equals	(Ljava/lang/Object;)Z
    //   89: ifeq -71 -> 18
    //   92: aload_3
    //   93: invokevirtual 215	com/squareup/okhttp/Connection:isAlive	()Z
    //   96: ifeq -78 -> 18
    //   99: invokestatic 219	java/lang/System:nanoTime	()J
    //   102: aload_3
    //   103: invokevirtual 222	com/squareup/okhttp/Connection:getIdleStartTimeNs	()J
    //   106: lsub
    //   107: aload_0
    //   108: getfield 108	com/squareup/okhttp/ConnectionPool:keepAliveDurationNs	J
    //   111: lcmp
    //   112: ifge -94 -> 18
    //   115: aload 4
    //   117: invokeinterface 225 1 0
    //   122: aload_3
    //   123: invokevirtual 186	com/squareup/okhttp/Connection:isSpdy	()Z
    //   126: istore 5
    //   128: aload_3
    //   129: astore_2
    //   130: iload 5
    //   132: ifne -102 -> 30
    //   135: invokestatic 230	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   138: aload_3
    //   139: invokevirtual 234	com/squareup/okhttp/Connection:getSocket	()Ljava/net/Socket;
    //   142: invokevirtual 238	com/squareup/okhttp/internal/Platform:tagSocket	(Ljava/net/Socket;)V
    //   145: aload_3
    //   146: astore_2
    //   147: goto -117 -> 30
    //   150: astore_2
    //   151: aload_3
    //   152: invokestatic 167	com/squareup/okhttp/internal/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   155: invokestatic 230	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   158: new 240	java/lang/StringBuilder
    //   161: dup
    //   162: ldc -14
    //   164: invokespecial 245	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_2
    //   168: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokevirtual 256	com/squareup/okhttp/internal/Platform:logW	(Ljava/lang/String;)V
    //   177: goto -159 -> 18
    //   180: astore_1
    //   181: aload_0
    //   182: monitorexit
    //   183: aload_1
    //   184: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	ConnectionPool
    //   0	185	1	paramAddress	Address
    //   29	118	2	localObject	Object
    //   150	18	2	localSocketException	java.net.SocketException
    //   77	75	3	localConnection	Connection
    //   16	100	4	localListIterator	java.util.ListIterator
    //   126	5	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   135	145	150	java/net/SocketException
    //   2	18	180	finally
    //   18	28	180	finally
    //   34	49	180	finally
    //   49	63	180	finally
    //   67	128	180	finally
    //   135	145	180	finally
    //   151	177	180	finally
  }
  
  public int getConnectionCount()
  {
    try
    {
      int i = this.connections.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  List<Connection> getConnections()
  {
    waitForCleanupCallableToRun();
    try
    {
      ArrayList localArrayList = new ArrayList(this.connections);
      return localArrayList;
    }
    finally {}
  }
  
  /* Error */
  public int getHttpConnectionCount()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   6: invokevirtual 265	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   9: astore_1
    //   10: iconst_0
    //   11: istore_2
    //   12: aload_1
    //   13: invokeinterface 158 1 0
    //   18: istore_3
    //   19: iload_3
    //   20: ifne +7 -> 27
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_2
    //   26: ireturn
    //   27: aload_1
    //   28: invokeinterface 161 1 0
    //   33: checkcast 163	com/squareup/okhttp/Connection
    //   36: invokevirtual 186	com/squareup/okhttp/Connection:isSpdy	()Z
    //   39: istore_3
    //   40: iload_3
    //   41: ifne -29 -> 12
    //   44: iload_2
    //   45: iconst_1
    //   46: iadd
    //   47: istore_2
    //   48: goto -36 -> 12
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	ConnectionPool
    //   9	19	1	localIterator	Iterator
    //   51	4	1	localObject	Object
    //   11	37	2	i	int
    //   18	23	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	10	51	finally
    //   12	19	51	finally
    //   27	40	51	finally
  }
  
  /* Error */
  public int getSpdyConnectionCount()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   6: invokevirtual 265	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   9: astore_1
    //   10: iconst_0
    //   11: istore_2
    //   12: aload_1
    //   13: invokeinterface 158 1 0
    //   18: istore_3
    //   19: iload_3
    //   20: ifne +7 -> 27
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_2
    //   26: ireturn
    //   27: aload_1
    //   28: invokeinterface 161 1 0
    //   33: checkcast 163	com/squareup/okhttp/Connection
    //   36: invokevirtual 186	com/squareup/okhttp/Connection:isSpdy	()Z
    //   39: istore_3
    //   40: iload_3
    //   41: ifeq -29 -> 12
    //   44: iload_2
    //   45: iconst_1
    //   46: iadd
    //   47: istore_2
    //   48: goto -36 -> 12
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	ConnectionPool
    //   9	19	1	localIterator	Iterator
    //   51	4	1	localObject	Object
    //   11	37	2	i	int
    //   18	23	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	10	51	finally
    //   12	19	51	finally
    //   27	40	51	finally
  }
  
  public void maybeShare(Connection paramConnection)
  {
    this.executorService.submit(this.connectionsCleanupCallable);
    if (!paramConnection.isSpdy()) {}
    while (!paramConnection.isAlive()) {
      return;
    }
    try
    {
      this.connections.addFirst(paramConnection);
      return;
    }
    finally {}
  }
  
  /* Error */
  public void recycle(Connection paramConnection)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 186	com/squareup/okhttp/Connection:isSpdy	()Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: invokevirtual 215	com/squareup/okhttp/Connection:isAlive	()Z
    //   12: ifne +8 -> 20
    //   15: aload_1
    //   16: invokestatic 167	com/squareup/okhttp/internal/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   19: return
    //   20: invokestatic 230	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   23: aload_1
    //   24: invokevirtual 234	com/squareup/okhttp/Connection:getSocket	()Ljava/net/Socket;
    //   27: invokevirtual 272	com/squareup/okhttp/internal/Platform:untagSocket	(Ljava/net/Socket;)V
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: getfield 69	com/squareup/okhttp/ConnectionPool:connections	Ljava/util/LinkedList;
    //   36: aload_1
    //   37: invokevirtual 190	java/util/LinkedList:addFirst	(Ljava/lang/Object;)V
    //   40: aload_1
    //   41: invokevirtual 275	com/squareup/okhttp/Connection:resetIdleStartTime	()V
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_0
    //   47: getfield 95	com/squareup/okhttp/ConnectionPool:executorService	Ljava/util/concurrent/ExecutorService;
    //   50: aload_0
    //   51: getfield 102	com/squareup/okhttp/ConnectionPool:connectionsCleanupCallable	Ljava/util/concurrent/Callable;
    //   54: invokeinterface 193 2 0
    //   59: pop
    //   60: return
    //   61: astore_2
    //   62: invokestatic 230	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   65: new 240	java/lang/StringBuilder
    //   68: dup
    //   69: ldc_w 277
    //   72: invokespecial 245	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload_2
    //   76: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokevirtual 256	com/squareup/okhttp/internal/Platform:logW	(Ljava/lang/String;)V
    //   85: aload_1
    //   86: invokestatic 167	com/squareup/okhttp/internal/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   89: return
    //   90: astore_1
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_1
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	ConnectionPool
    //   0	95	1	paramConnection	Connection
    //   61	15	2	localSocketException	java.net.SocketException
    // Exception table:
    //   from	to	target	type
    //   20	30	61	java/net/SocketException
    //   32	46	90	finally
    //   91	93	90	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\ConnectionPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */