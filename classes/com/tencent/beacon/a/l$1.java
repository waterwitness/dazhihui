package com.tencent.beacon.a;

import com.tencent.beacon.e.b;
import com.tencent.beacon.event.p;

final class l$1
  implements Runnable
{
  l$1(l paraml) {}
  
  public final void run()
  {
    b.b(" db events to up on screen_on", new Object[0]);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\l$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */