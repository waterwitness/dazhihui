package com.alipay.b.b.a.a;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public final class v
  implements f
{
  private static v b = null;
  private static final ThreadFactory i = new x();
  Context a;
  private ThreadPoolExecutor c;
  private i d;
  private long e;
  private long f;
  private long g;
  private int h;
  
  private v(Context paramContext)
  {
    this.a = paramContext;
    this.d = i.a("android");
    this.c = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
    try
    {
      this.c.allowCoreThreadTimeOut(true);
      CookieSyncManager.createInstance(this.a);
      CookieManager.getInstance().setAcceptCookie(true);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public static final v a(Context paramContext)
  {
    if (b != null) {
      return b;
    }
    return b(paramContext);
  }
  
  /* Error */
  private static final v b(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 26	com/alipay/b/b/a/a/v:b	Lcom/alipay/b/b/a/a/v;
    //   6: ifnull +12 -> 18
    //   9: getstatic 26	com/alipay/b/b/a/a/v:b	Lcom/alipay/b/b/a/a/v;
    //   12: astore_0
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: new 2	com/alipay/b/b/a/a/v
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 96	com/alipay/b/b/a/a/v:<init>	(Landroid/content/Context;)V
    //   26: astore_0
    //   27: aload_0
    //   28: putstatic 26	com/alipay/b/b/a/a/v:b	Lcom/alipay/b/b/a/a/v;
    //   31: goto -18 -> 13
    //   34: astore_0
    //   35: ldc 2
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	13	34	finally
    //   18	31	34	finally
  }
  
  public final i a()
  {
    return this.d;
  }
  
  public final Future<ae> a(ad paramad)
  {
    long l2 = 0L;
    String str;
    int j;
    long l3;
    long l4;
    long l1;
    if (ac.a(this.a))
    {
      str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
      j = this.c.getActiveCount();
      l3 = this.c.getCompletedTaskCount();
      l4 = this.c.getTaskCount();
      if (this.g != 0L) {
        break label209;
      }
      l1 = 0L;
      if (this.h != 0) {
        break label230;
      }
    }
    for (;;)
    {
      String.format(str, new Object[] { Integer.valueOf(j), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h) });
      paramad = new aa(this, (y)paramad);
      paramad = new w(this, paramad, paramad);
      this.c.execute(paramad);
      return paramad;
      label209:
      l1 = this.e * 1000L / this.g >> 10;
      break;
      label230:
      l2 = this.f / this.h;
    }
  }
  
  public final void a(long paramLong)
  {
    this.e += paramLong;
  }
  
  public final void b(long paramLong)
  {
    this.f += paramLong;
    this.h += 1;
  }
  
  public final void c(long paramLong)
  {
    this.g += paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */