package com.iflytek.thirdparty;

import android.content.Context;
import android.os.HandlerThread;

public abstract class z
  extends y
{
  protected Context a = null;
  protected Object c = new Object();
  protected volatile v d = null;
  protected volatile HandlerThread e = null;
  
  protected z(Context paramContext)
  {
    if (paramContext != null)
    {
      H.a(paramContext.getApplicationContext());
      this.a = paramContext.getApplicationContext();
      try
      {
        b();
        return;
      }
      catch (Exception paramContext)
      {
        X.a(paramContext);
        return;
      }
    }
    this.a = null;
  }
  
  protected HandlerThread a(String paramString)
  {
    this.e = new HandlerThread(paramString);
    this.e.start();
    return this.e;
  }
  
  protected void b() {}
  
  protected boolean b_()
  {
    if ((this.e != null) && (this.e.isAlive()))
    {
      HandlerThread localHandlerThread = this.e;
      this.e = null;
      localHandlerThread.interrupt();
    }
    return true;
  }
  
  protected String c()
  {
    return getClass().toString();
  }
  
  public void cancel(boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.b(paramBoolean);
    }
  }
  
  protected boolean d()
  {
    return (this.d != null) && (this.d.t());
  }
  
  public boolean destroy()
  {
    synchronized (this.c)
    {
      if (d())
      {
        this.d.b(false);
        return false;
      }
      boolean bool = b_();
      X.c(c() + "destory =" + bool);
      return bool;
    }
  }
  
  protected void finalize()
  {
    X.a(c() + " finalize called");
    super.finalize();
  }
  
  public int getSampleRate()
  {
    return this.b.a("sample_rate", 16000);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */