package com.tencent.beaconimsdk.event;

import com.tencent.beaconimsdk.c.a;

final class i$1
  implements Runnable
{
  i$1(i parami) {}
  
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\i$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */