package com.baidu.location;

import android.os.Message;
import java.util.ArrayList;

class j
  implements Runnable
{
  private j(h paramh) {}
  
  public void run()
  {
    synchronized (h.h(this.a))
    {
      h.b(this.a, false);
      if ((h.a(this.a) == null) || (h.d(this.a) == null)) {
        return;
      }
      if ((h.i(this.a) == null) || (h.i(this.a).size() < 1)) {
        return;
      }
    }
    if (h.j(this.a))
    {
      if (h.k(this.a) == null) {
        h.a(this.a, new j(this.a));
      }
      h.c(this.a).postDelayed(h.k(this.a), h.f(this.a).d);
      return;
    }
    h.c(this.a).obtainMessage(4).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */