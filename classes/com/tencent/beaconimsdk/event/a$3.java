package com.tencent.beaconimsdk.event;

import com.tencent.beaconimsdk.c.a;

final class a$3
  implements Runnable
{
  public final void run()
  {
    a.f(" db events to up", new Object[0]);
    try
    {
      j.d(false);
      return;
    }
    catch (Throwable localThrowable)
    {
      a.a(localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\a$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */