package com.tencent.beacon.event;

import com.tencent.beacon.e.b;

final class UserAction$1
  implements Runnable
{
  public final void run()
  {
    b.b(" db events to up on app call", new Object[0]);
    try
    {
      p.c(false);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\UserAction$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */