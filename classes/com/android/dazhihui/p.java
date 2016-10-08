package com.android.dazhihui;

import android.os.Handler;
import java.util.List;

class p
  implements b
{
  p(o paramo) {}
  
  public void loginStatusChange(c paramc)
  {
    if (paramc == c.b)
    {
      if (!o.a(this.a).l()) {
        break label29;
      }
      o.a(this.a, null);
    }
    label29:
    do
    {
      return;
      int i = 0;
      while (i < o.d().size())
      {
        ((v)o.d().get(i)).a("NoToken");
        i += 1;
      }
    } while (this.a.a == null);
    this.a.a.removeCallbacks(this.a.e);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */