package com.tencent.beacon.a;

import com.tencent.beacon.e.b;
import com.tencent.beacon.event.p;

final class g$2
  implements Runnable
{
  g$2(g paramg) {}
  
  public final void run()
  {
    b.b(" db events to up on netConnectChange", new Object[0]);
    try
    {
      p.c(true);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\g$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */