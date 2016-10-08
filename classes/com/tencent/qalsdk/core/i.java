package com.tencent.qalsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import qalsdk.av;

public class i
{
  static final String b = "MSF.C.NetConnTag";
  j a;
  private volatile Handler c;
  
  public i(j paramj)
  {
    this.a = paramj;
  }
  
  public Runnable a(int paramInt, long paramLong)
  {
    i.a locala = new i.a(this, paramInt);
    this.c.postDelayed(locala, paramLong);
    return locala;
  }
  
  public Runnable a(ToServiceMsg paramToServiceMsg, long paramLong)
  {
    i.b localb = new i.b(this, paramToServiceMsg);
    if (paramToServiceMsg != null) {
      this.c.postDelayed(localb, paramLong);
    }
    return localb;
  }
  
  public Runnable a(av paramav, long paramLong)
  {
    if (paramav != null)
    {
      paramav = new i.c(this, paramav);
      this.c.postDelayed(paramav, paramLong);
      return paramav;
    }
    return null;
  }
  
  public void a()
  {
    HandlerThread localHandlerThread = new HandlerThread("MsfCoreTimeoutChecker", 5);
    localHandlerThread.start();
    this.c = new Handler(localHandlerThread.getLooper());
  }
  
  public void a(Runnable paramRunnable)
  {
    this.c.removeCallbacks(paramRunnable);
  }
  
  public Handler b()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */