package com.tencent.beaconimsdk.a;

import com.tencent.beaconimsdk.c.a;
import com.tencent.beaconimsdk.event.j;

final class d$1
  implements Runnable
{
  public final void run()
  {
    a.b(" db events to up on netConnectChange", new Object[0]);
    try
    {
      j.d(true);
      return;
    }
    catch (Throwable localThrowable)
    {
      a.a(localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */