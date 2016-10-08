package com.android.dazhihui.a;

import android.content.Context;
import android.net.Proxy;
import android.text.TextUtils;
import com.android.dazhihui.jni.DzhNative;
import com.android.dazhihui.jni.DzhNative.IDispatchReceive;

public abstract class c
  implements DzhNative.IDispatchReceive, Runnable
{
  private Context a;
  private String b;
  private int c;
  private String d = null;
  private int e = -1;
  private int f = -1;
  private int g = 0;
  private volatile int h = 0;
  private Thread i = null;
  private boolean j = false;
  
  public c(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private boolean d()
  {
    this.h = 1;
    b(this.h);
    int k = DzhNative.getInstance().createConnection(this.b, this.c, this.d, this.e, this.g);
    if ((this.i != null) && (Thread.currentThread().equals(this.i)))
    {
      if (k >= 0)
      {
        this.f = k;
        DzhNative.getInstance().registDispatchReceive(this, this.f);
        this.h = 2;
        b(this.h);
        return true;
      }
      this.h = 0;
      b(this.h);
      return false;
    }
    DzhNative.getInstance().closeConnection(k);
    return false;
  }
  
  private void e()
  {
    try
    {
      this.j = false;
      notifyAll();
      if ((this.i != null) && (this.i.isAlive()))
      {
        this.i.join(500L);
        if (this.i != null) {
          this.i.interrupt();
        }
      }
      this.i = null;
      return;
    }
    finally {}
  }
  
  private void f()
  {
    if (this.f != Integer.MIN_VALUE)
    {
      DzhNative.getInstance().closeConnection(this.f);
      this.h = 0;
      this.f = -1;
    }
  }
  
  public void a()
  {
    f();
    Object localObject1;
    if (g.b)
    {
      this.d = System.getProperty("http.proxyHost");
      localObject1 = System.getProperty("http.proxyPort");
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.e = Integer.parseInt((String)localObject1);
        label40:
        localObject1 = g.a().r();
        r localr = g.a().s();
        if ((TextUtils.isEmpty(this.d)) || (this.e == -1)) {
          break label180;
        }
        if (((localObject1 != w.c) || (localr != r.a)) && (localObject1 != w.b)) {
          break label161;
        }
        this.g = 1;
      }
    }
    for (;;)
    {
      this.f = -1;
      if (this.i != null) {
        break label199;
      }
      this.i = new Thread(this);
      this.i.start();
      return;
      localObject1 = "-1";
      break;
      this.d = Proxy.getHost(this.a);
      this.e = Proxy.getPort(this.a);
      break label40;
      label161:
      this.d = "";
      this.e = 0;
      this.g = 0;
      continue;
      label180:
      this.d = "";
      this.e = 0;
      this.g = 0;
    }
    try
    {
      label199:
      notify();
      return;
    }
    finally {}
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    DzhNative.getInstance().send(paramArrayOfByte, this.f);
  }
  
  public void b()
  {
    f();
    try
    {
      e();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
  
  public abstract void b(int paramInt);
  
  public int c()
  {
    return this.h;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 190	android/os/Process:setThreadPriority	(I)V
    //   5: aload_0
    //   6: iconst_1
    //   7: putfield 42	com/android/dazhihui/a/c:j	Z
    //   10: aload_0
    //   11: getfield 42	com/android/dazhihui/a/c:j	Z
    //   14: ifeq +10 -> 24
    //   17: aload_0
    //   18: invokespecial 192	com/android/dazhihui/a/c:d	()Z
    //   21: ifeq +14 -> 35
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 42	com/android/dazhihui/a/c:j	Z
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 40	com/android/dazhihui/a/c:i	Ljava/lang/Thread;
    //   34: return
    //   35: aload_0
    //   36: monitorenter
    //   37: aload_0
    //   38: invokevirtual 195	java/lang/Object:wait	()V
    //   41: aload_0
    //   42: monitorexit
    //   43: goto -33 -> 10
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    //   51: astore_1
    //   52: aload_1
    //   53: invokevirtual 183	java/lang/InterruptedException:printStackTrace	()V
    //   56: goto -15 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	c
    //   46	4	1	localObject	Object
    //   51	2	1	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   37	41	46	finally
    //   41	43	46	finally
    //   47	49	46	finally
    //   52	56	46	finally
    //   37	41	51	java/lang/InterruptedException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */