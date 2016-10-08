package com.d.a;

import android.os.Build.VERSION;
import android.util.Log;
import com.d.a.a.g;
import com.d.a.b.a;
import com.d.a.b.f;
import com.d.a.b.l;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class q
{
  static q a;
  static final WeakHashMap<Thread, q> d;
  private static ExecutorService h;
  String b;
  PriorityQueue<ad> c = new PriorityQueue(1, ae.a);
  Thread e;
  private bl g;
  
  static
  {
    boolean bool;
    if (!q.class.desiredAssertionStatus()) {
      bool = true;
    }
    for (;;)
    {
      f = bool;
      try
      {
        if (Build.VERSION.SDK_INT <= 8)
        {
          System.setProperty("java.net.preferIPv4Stack", "true");
          System.setProperty("java.net.preferIPv6Addresses", "false");
        }
        a = new q();
        h = d();
        d = new WeakHashMap();
        return;
        bool = false;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    }
  }
  
  public q()
  {
    this(null);
  }
  
  public q(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "AsyncServer";
    }
    this.b = str;
  }
  
  private static long a(q paramq, PriorityQueue<ad> paramPriorityQueue)
  {
    long l1 = Long.MAX_VALUE;
    for (;;)
    {
      long l2;
      try
      {
        long l3 = System.currentTimeMillis();
        l2 = l1;
        if (paramPriorityQueue.size() <= 0) {
          break label82;
        }
        localad = (ad)paramPriorityQueue.remove();
        if (localad.b <= l3)
        {
          if (localad == null) {
            return l1;
          }
        }
        else
        {
          l2 = localad.b - l3;
          paramPriorityQueue.add(localad);
        }
      }
      finally {}
      localad.a.run();
      break;
      label82:
      l1 = l2;
      ad localad = null;
    }
  }
  
  public static q a()
  {
    return a;
  }
  
  private static void a(bl parambl)
  {
    h.execute(new r(parambl));
  }
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 131	com/d/a/q:g	Lcom/d/a/bl;
    //   9: ifnull +67 -> 76
    //   12: ldc -101
    //   14: ldc -99
    //   16: invokestatic 163	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   19: pop
    //   20: getstatic 34	com/d/a/q:f	Z
    //   23: ifne +26 -> 49
    //   26: invokestatic 169	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   29: aload_0
    //   30: getfield 171	com/d/a/q:e	Ljava/lang/Thread;
    //   33: if_acmpeq +16 -> 49
    //   36: new 173	java/lang/AssertionError
    //   39: dup
    //   40: invokespecial 174	java/lang/AssertionError:<init>	()V
    //   43: athrow
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    //   49: iconst_1
    //   50: istore 4
    //   52: aload_0
    //   53: getfield 131	com/d/a/q:g	Lcom/d/a/bl;
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 86	com/d/a/q:c	Ljava/util/PriorityQueue;
    //   61: astore_3
    //   62: aload_0
    //   63: monitorexit
    //   64: iload 4
    //   66: ifeq +135 -> 201
    //   69: aload_0
    //   70: aload_2
    //   71: aload_3
    //   72: invokestatic 176	com/d/a/q:c	(Lcom/d/a/q;Lcom/d/a/bl;Ljava/util/PriorityQueue;)V
    //   75: return
    //   76: new 178	com/d/a/bl
    //   79: dup
    //   80: invokestatic 184	java/nio/channels/spi/SelectorProvider:provider	()Ljava/nio/channels/spi/SelectorProvider;
    //   83: invokevirtual 188	java/nio/channels/spi/SelectorProvider:openSelector	()Ljava/nio/channels/spi/AbstractSelector;
    //   86: invokespecial 191	com/d/a/bl:<init>	(Ljava/nio/channels/Selector;)V
    //   89: astore_2
    //   90: aload_0
    //   91: aload_2
    //   92: putfield 131	com/d/a/q:g	Lcom/d/a/bl;
    //   95: aload_0
    //   96: getfield 86	com/d/a/q:c	Ljava/util/PriorityQueue;
    //   99: astore_3
    //   100: iload_1
    //   101: ifeq +56 -> 157
    //   104: aload_0
    //   105: new 193	com/d/a/s
    //   108: dup
    //   109: aload_0
    //   110: aload_0
    //   111: getfield 90	com/d/a/q:b	Ljava/lang/String;
    //   114: aload_2
    //   115: aload_3
    //   116: invokespecial 196	com/d/a/s:<init>	(Lcom/d/a/q;Ljava/lang/String;Lcom/d/a/bl;Ljava/util/PriorityQueue;)V
    //   119: putfield 171	com/d/a/q:e	Ljava/lang/Thread;
    //   122: aload_0
    //   123: invokespecial 198	com/d/a/q:e	()Z
    //   126: istore 5
    //   128: iload 5
    //   130: ifne +37 -> 167
    //   133: aload_0
    //   134: getfield 131	com/d/a/q:g	Lcom/d/a/bl;
    //   137: invokevirtual 200	com/d/a/bl:f	()V
    //   140: aload_0
    //   141: aconst_null
    //   142: putfield 131	com/d/a/q:g	Lcom/d/a/bl;
    //   145: aload_0
    //   146: aconst_null
    //   147: putfield 171	com/d/a/q:e	Ljava/lang/Thread;
    //   150: aload_0
    //   151: monitorexit
    //   152: return
    //   153: astore_2
    //   154: aload_0
    //   155: monitorexit
    //   156: return
    //   157: aload_0
    //   158: invokestatic 169	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   161: putfield 171	com/d/a/q:e	Ljava/lang/Thread;
    //   164: goto -42 -> 122
    //   167: iload_1
    //   168: ifeq -106 -> 62
    //   171: aload_0
    //   172: getfield 171	com/d/a/q:e	Ljava/lang/Thread;
    //   175: invokevirtual 203	java/lang/Thread:start	()V
    //   178: aload_0
    //   179: monitorexit
    //   180: return
    //   181: astore_3
    //   182: ldc -101
    //   184: ldc -51
    //   186: aload_3
    //   187: invokestatic 208	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   190: pop
    //   191: aload_2
    //   192: invokevirtual 211	com/d/a/bl:a	()Ljava/nio/channels/Selector;
    //   195: invokevirtual 216	java/nio/channels/Selector:close	()V
    //   198: return
    //   199: astore_2
    //   200: return
    //   201: aload_0
    //   202: aload_2
    //   203: aload_3
    //   204: invokestatic 146	com/d/a/q:b	(Lcom/d/a/q;Lcom/d/a/bl;Ljava/util/PriorityQueue;)V
    //   207: return
    //   208: astore_2
    //   209: goto -69 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	q
    //   0	212	1	paramBoolean	boolean
    //   44	4	2	localObject	Object
    //   56	59	2	localbl	bl
    //   153	39	2	localIOException	IOException
    //   199	4	2	localException1	Exception
    //   208	1	2	localException2	Exception
    //   61	55	3	localPriorityQueue	PriorityQueue
    //   181	23	3	localaa	aa
    //   1	64	4	i	int
    //   126	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	44	44	finally
    //   45	47	44	finally
    //   52	62	44	finally
    //   62	64	44	finally
    //   76	100	44	finally
    //   104	122	44	finally
    //   122	128	44	finally
    //   133	140	44	finally
    //   140	152	44	finally
    //   154	156	44	finally
    //   157	164	44	finally
    //   171	180	44	finally
    //   76	100	153	java/io/IOException
    //   69	75	181	com/d/a/aa
    //   191	198	199	java/lang/Exception
    //   133	140	208	java/lang/Exception
  }
  
  private ab b(InetSocketAddress paramInetSocketAddress, com.d.a.a.c paramc)
  {
    ab localab = new ab(this, null);
    if ((!f) && (paramInetSocketAddress.isUnresolved())) {
      throw new AssertionError();
    }
    a(new u(this, localab, paramc, paramInetSocketAddress));
    return localab;
  }
  
  private static void b(bl parambl)
  {
    try
    {
      parambl = parambl.d().iterator();
      for (;;)
      {
        if (!parambl.hasNext()) {
          return;
        }
        SelectionKey localSelectionKey = (SelectionKey)parambl.next();
        com.d.a.d.c.a(new Closeable[] { localSelectionKey.channel() });
        try
        {
          localSelectionKey.cancel();
        }
        catch (Exception localException) {}
      }
      return;
    }
    catch (Exception parambl) {}
  }
  
  private static void b(q arg0, bl parambl, PriorityQueue<ad> paramPriorityQueue)
  {
    try
    {
      for (;;)
      {
        c(???, parambl, paramPriorityQueue);
        try
        {
          if ((parambl.g()) && ((parambl.d().size() > 0) || (paramPriorityQueue.size() > 0))) {}
        }
        finally {}
      }
    }
    catch (aa localaa)
    {
      for (;;)
      {
        Log.i("NIO", "Selector exception, shutting down", localaa);
        try
        {
          parambl.a().close();
        }
        catch (Exception localException) {}
      }
      c(parambl);
      if (???.g == parambl)
      {
        ???.c = new PriorityQueue(1, ae.a);
        ???.g = null;
        ???.e = null;
      }
      synchronized (d)
      {
        d.remove(Thread.currentThread());
        return;
      }
    }
  }
  
  private static void c(bl parambl)
  {
    b(parambl);
    try
    {
      parambl.f();
      return;
    }
    catch (Exception parambl) {}
  }
  
  private static void c(q paramq, bl parambl, PriorityQueue<ad> paramPriorityQueue)
  {
    int j = 1;
    long l = a(paramq, paramPriorityQueue);
    for (;;)
    {
      Iterator localIterator;
      try
      {
        try
        {
          if (parambl.b() != 0) {
            break label505;
          }
          i = j;
          if (parambl.d().size() == 0)
          {
            i = j;
            if (l == Long.MAX_VALUE) {
              return;
            }
          }
          if (i != 0)
          {
            if (l == Long.MAX_VALUE) {
              parambl.c();
            }
          }
          else
          {
            Set localSet = parambl.e();
            localIterator = localSet.iterator();
            if (localIterator.hasNext()) {
              break label128;
            }
            localSet.clear();
            return;
          }
        }
        finally {}
        parambl.a(l);
      }
      catch (Exception paramq)
      {
        throw new aa(paramq);
      }
      continue;
      label128:
      Object localObject1 = (SelectionKey)localIterator.next();
      Object localObject2;
      label246:
      label505:
      try
      {
        if (((SelectionKey)localObject1).isAcceptable()) {
          paramPriorityQueue = (ServerSocketChannel)((SelectionKey)localObject1).channel();
        }
        try
        {
          paramPriorityQueue = paramPriorityQueue.accept();
          if (paramPriorityQueue == null) {
            continue;
          }
        }
        catch (IOException paramPriorityQueue)
        {
          for (;;)
          {
            c localc;
            paramPriorityQueue = null;
            PriorityQueue<ad> localPriorityQueue1 = null;
          }
        }
        try
        {
          paramPriorityQueue.configureBlocking(false);
          localObject2 = paramPriorityQueue.register(parambl.a(), 1);
          try
          {
            localObject1 = (g)((SelectionKey)localObject1).attachment();
            localc = new c();
            localc.a(paramPriorityQueue, (InetSocketAddress)paramPriorityQueue.socket().getRemoteSocketAddress());
            localc.a(paramq, (SelectionKey)localObject2);
            ((SelectionKey)localObject2).attach(localc);
            ((g)localObject1).a(localc);
          }
          catch (IOException localIOException1)
          {
            localPriorityQueue1 = paramPriorityQueue;
            paramPriorityQueue = (PriorityQueue<ad>)localObject2;
          }
        }
        catch (IOException localIOException2)
        {
          localObject2 = null;
          PriorityQueue<ad> localPriorityQueue2 = paramPriorityQueue;
          paramPriorityQueue = (PriorityQueue<ad>)localObject2;
          break label246;
        }
        com.d.a.d.c.a(new Closeable[] { localPriorityQueue1 });
        if (paramPriorityQueue == null) {
          continue;
        }
        paramPriorityQueue.cancel();
        continue;
        if (localPriorityQueue1.isReadable())
        {
          paramq.a(((c)localPriorityQueue1.attachment()).c());
          continue;
        }
        if (localPriorityQueue1.isWritable())
        {
          ((c)localPriorityQueue1.attachment()).b();
          continue;
        }
        if (localPriorityQueue1.isConnectable())
        {
          paramPriorityQueue = (ab)localPriorityQueue1.attachment();
          localObject2 = (SocketChannel)localPriorityQueue1.channel();
          localPriorityQueue1.interestOps(1);
          try
          {
            ((SocketChannel)localObject2).finishConnect();
            localc = new c();
            localc.a(paramq, localPriorityQueue1);
            localc.a((SocketChannel)localObject2, (InetSocketAddress)((SocketChannel)localObject2).socket().getRemoteSocketAddress());
            localPriorityQueue1.attach(localc);
            try
            {
              if (!paramPriorityQueue.b(localc)) {
                continue;
              }
              paramPriorityQueue.b.a(null, localc);
            }
            catch (Exception paramPriorityQueue)
            {
              throw new RuntimeException(paramPriorityQueue);
            }
            if (!paramPriorityQueue.a(localIOException3)) {
              continue;
            }
          }
          catch (IOException localIOException3)
          {
            localPriorityQueue1.cancel();
            com.d.a.d.c.a(new Closeable[] { localObject2 });
          }
          paramPriorityQueue.b.a(localIOException3, null);
          continue;
        }
        Log.i("NIO", "wtf");
        throw new RuntimeException("Unknown key state.");
      }
      catch (CancelledKeyException paramPriorityQueue) {}
      int i = 0;
    }
  }
  
  private static ExecutorService d()
  {
    ac localac = new ac("AsyncServer-worker-");
    return new ThreadPoolExecutor(1, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), localac);
  }
  
  private boolean e()
  {
    synchronized (d)
    {
      if ((q)d.get(this.e) != null) {
        return false;
      }
      d.put(this.e, this);
      return true;
    }
  }
  
  public a a(String paramString, int paramInt, com.d.a.a.c paramc)
  {
    return a(InetSocketAddress.createUnresolved(paramString, paramInt), paramc);
  }
  
  public a a(InetSocketAddress paramInetSocketAddress, com.d.a.a.c paramc)
  {
    if (!paramInetSocketAddress.isUnresolved()) {
      return b(paramInetSocketAddress, paramc);
    }
    l locall = new l();
    f localf = b(paramInetSocketAddress.getHostName());
    locall.c(localf);
    localf.a(new v(this, paramc, locall, paramInetSocketAddress));
    return locall;
  }
  
  public f<InetAddress[]> a(String paramString)
  {
    l locall = new l();
    h.execute(new w(this, paramString, locall));
    return locall;
  }
  
  public Object a(Runnable paramRunnable)
  {
    return a(paramRunnable, 0L);
  }
  
  public Object a(Runnable paramRunnable, long paramLong)
  {
    if (paramLong != 0L) {}
    for (;;)
    {
      try
      {
        paramLong = System.currentTimeMillis() + paramLong;
        PriorityQueue localPriorityQueue = this.c;
        paramRunnable = new ad(paramRunnable, paramLong);
        localPriorityQueue.add(paramRunnable);
        if (this.g == null) {
          a(true);
        }
        if (!c()) {
          a(this.g);
        }
        return paramRunnable;
      }
      finally {}
      paramLong = this.c.size();
    }
  }
  
  protected void a(int paramInt) {}
  
  public void a(Object paramObject)
  {
    try
    {
      this.c.remove(paramObject);
      return;
    }
    finally {}
  }
  
  public f<InetAddress> b(String paramString)
  {
    return (f)a(paramString).b(new z(this));
  }
  
  public Thread b()
  {
    return this.e;
  }
  
  protected void b(int paramInt) {}
  
  public void b(Runnable paramRunnable)
  {
    if (Thread.currentThread() == this.e)
    {
      a(paramRunnable);
      a(this, this.c);
      return;
    }
    Semaphore localSemaphore = new Semaphore(0);
    a(new t(this, paramRunnable, localSemaphore));
    try
    {
      localSemaphore.acquire();
      return;
    }
    catch (InterruptedException paramRunnable)
    {
      Log.e("NIO", "run", paramRunnable);
    }
  }
  
  public boolean c()
  {
    return this.e == Thread.currentThread();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */