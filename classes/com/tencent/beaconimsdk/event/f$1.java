package com.tencent.beaconimsdk.event;

import com.tencent.beaconimsdk.c.a;

final class f$1
  implements Runnable
{
  f$1(f paramf) {}
  
  public final void run()
  {
    try
    {
      this.a.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      a.a(localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\f$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */