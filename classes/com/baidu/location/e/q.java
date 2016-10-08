package com.baidu.location.e;

import android.os.Handler;
import com.baidu.location.b.l;
import com.baidu.location.c.i;

class q
  implements Runnable
{
  private q(n paramn) {}
  
  public void run()
  {
    if (!n.a(this.a)) {
      return;
    }
    if ((n.b(this.a)) && (e.a().e()) && (i.a().d())) {
      new ak(this).start();
    }
    if ((n.b(this.a)) && (e.a().e())) {
      com.baidu.location.b.q.a().d();
    }
    if ((n.b(this.a)) && (n.a(this.a)))
    {
      this.a.a.postDelayed(this, l.N);
      n.a(this.a, true);
      return;
    }
    n.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */