package com.android.dazhihui.a.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.g;

public abstract class a
  implements h
{
  private static long h = 7000L;
  protected boolean a = false;
  protected long b = 0L;
  protected long c = 0L;
  protected boolean d;
  protected i e;
  protected d f = d.a;
  protected Handler g = new b(this, Looper.getMainLooper());
  private s i = null;
  private Object j;
  private Object k;
  private boolean l;
  private c m;
  
  public static void a() {}
  
  public void a(int paramInt)
  {
    this.g.removeMessages(paramInt);
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(Message paramMessage)
  {
    l();
    this.g.sendMessage(paramMessage);
  }
  
  public void a(c paramc)
  {
    this.m = paramc;
  }
  
  public void a(i parami)
  {
    this.e = parami;
  }
  
  public void a(s params)
  {
    this.i = params;
  }
  
  public void a(Object paramObject)
  {
    this.k = paramObject;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    if (paramBoolean) {
      k();
    }
  }
  
  protected boolean a(int paramInt, Object paramObject)
  {
    return false;
  }
  
  public boolean a(Message paramMessage, long paramLong)
  {
    this.b = System.currentTimeMillis();
    this.g.removeMessages(paramMessage.what);
    return this.g.sendMessageDelayed(paramMessage, paramLong);
  }
  
  public void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public long c()
  {
    if (this.c == 0L) {
      return h;
    }
    return this.c;
  }
  
  public void c(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public long d()
  {
    return this.b;
  }
  
  public d e()
  {
    return this.f;
  }
  
  public void f()
  {
    g.a().b(this);
  }
  
  public s g()
  {
    return this.i;
  }
  
  public void h()
  {
    if (this.i != null) {
      this.i.invokeNextHandle();
    }
  }
  
  public Object i()
  {
    return this.j;
  }
  
  public Object j()
  {
    return this.k;
  }
  
  protected void k() {}
  
  public abstract void l();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */