package com.tencent.beaconimsdk.event;

import com.tencent.beaconimsdk.c.a;

final class UserAction$1
  implements Runnable
{
  public final void run()
  {
    a.b(" db events to up on app call", new Object[0]);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\UserAction$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */