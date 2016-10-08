package com.android.dazhihui.ui.delegate.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.android.dazhihui.DzhApplication;
import java.util.Iterator;
import java.util.List;

public class k
  implements Runnable
{
  private static k c = null;
  com.android.dazhihui.c.a.a a;
  int b = 0;
  private long d;
  private long e;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private final Context j;
  private int k = 10;
  
  private k(Context paramContext)
  {
    this.j = paramContext.getApplicationContext();
    this.a = new com.android.dazhihui.c.a.a(this.j);
  }
  
  public static k a(Context paramContext)
  {
    if (c == null) {
      c = new k(paramContext);
    }
    return c;
  }
  
  public static void d()
  {
    if (c != null) {
      c.g = false;
    }
  }
  
  private boolean f()
  {
    if (b(this.j)) {
      if (!this.f) {
        this.e = System.currentTimeMillis();
      }
    }
    for (this.f = true; (this.f) && (System.currentTimeMillis() - this.e > 1800000); this.f = false)
    {
      Log.e("trade", "isBackgroundTimeout():true");
      return true;
      this.e = System.currentTimeMillis();
    }
    Log.e("trade", "isBackgroundTimeout():false");
    return false;
  }
  
  public void a()
  {
    this.h = false;
    this.i = false;
    ((DzhApplication)this.j).h().post(new l(this));
  }
  
  public boolean b()
  {
    return this.i;
  }
  
  public boolean b(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if (localRunningAppProcessInfo.processName.equals(paramContext.getPackageName()))
      {
        if (localRunningAppProcessInfo.importance != 100)
        {
          com.android.dazhihui.ui.delegate.a.a().a(true);
          return true;
        }
        return false;
      }
    }
    return false;
  }
  
  public void c()
  {
    if ((o.u) || (o.l()) || (o.m())) {}
    do
    {
      do
      {
        return;
      } while (!o.r());
      this.h = false;
      this.i = false;
      this.f = false;
      this.d = System.currentTimeMillis();
    } while (this.g);
    this.g = true;
    new Thread(this).start();
  }
  
  public void e()
  {
    if (this.h) {
      a();
    }
    while (!this.i) {
      return;
    }
    com.android.dazhihui.ui.delegate.a.a().b(false);
    Log.e("trade", "handleTrade():backgroundTimeout");
  }
  
  public void run()
  {
    for (;;)
    {
      if (this.g) {
        if (com.android.dazhihui.c.a.a.L != 0) {
          break label141;
        }
      }
      label141:
      for (this.k = 10;; this.k = com.android.dazhihui.c.a.a.L)
      {
        if ((this.b >= 10) && (o.o))
        {
          this.b = 0;
          this.i = f();
          if (this.i)
          {
            Log.e("trade", "run():backgroundTimeout");
            o.t();
            o.o = false;
          }
        }
        this.b += 1;
        if ((System.currentTimeMillis() - this.d) / 60L / 1000L <= this.k) {
          break;
        }
        d();
        o.t();
        o.o = false;
        com.android.dazhihui.ui.delegate.a.a().d();
        this.h = true;
        if (!b(this.j)) {
          a();
        }
        return;
      }
      try
      {
        Thread.sleep(1000L);
      }
      catch (Throwable localThrowable) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */