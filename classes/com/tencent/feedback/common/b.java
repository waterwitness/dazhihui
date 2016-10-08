package com.tencent.feedback.common;

import java.util.concurrent.ScheduledExecutorService;

public abstract class b
{
  public static boolean a = true;
  private static b b;
  
  public static b a(ScheduledExecutorService paramScheduledExecutorService)
  {
    return new b.a(paramScheduledExecutorService);
  }
  
  public static void a(b paramb)
  {
    try
    {
      e.a("rqdp{  AsyncTaskHandlerAbs setInstance} " + paramb, new Object[0]);
      if ((b != null) && (b != paramb)) {
        b.a();
      }
      b = paramb;
      e.a("rqdp{  AsyncTaskHandlerAbs setInstance end}", new Object[0]);
      return;
    }
    finally {}
  }
  
  public static b b()
  {
    try
    {
      if (b == null) {
        b = new b.a();
      }
      b localb = b;
      return localb;
    }
    finally {}
  }
  
  public abstract boolean a();
  
  public abstract boolean a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2);
  
  public abstract boolean a(int paramInt, boolean paramBoolean);
  
  public abstract boolean a(Runnable paramRunnable);
  
  public abstract boolean a(Runnable paramRunnable, long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */