package com.android.dazhihui;

import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import java.util.Iterator;
import java.util.List;

class r
  implements i
{
  r(o paramo, u paramu) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    if (o.b(this.b) < o.c(this.b))
    {
      o.a(this.b, o.b(this.b) + 1);
      o.a(this.b, this.a);
      this.b.d = false;
    }
    for (;;)
    {
      return;
      o.a(this.b, 1);
      this.b.d = false;
      paramh = this.b.c.iterator();
      while (paramh.hasNext()) {
        ((u)paramh.next()).a(true, "");
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (o.b(this.b) < o.c(this.b))
    {
      o.a(this.b, o.b(this.b) + 1);
      o.a(this.b, this.a);
      this.b.d = false;
    }
    for (;;)
    {
      return;
      o.a(this.b, 1);
      this.b.d = false;
      paramh = this.b.c.iterator();
      while (paramh.hasNext()) {
        ((u)paramh.next()).a(true, "");
      }
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (o.b(this.b) < o.c(this.b))
    {
      o.a(this.b, o.b(this.b) + 1);
      this.b.d = false;
      o.a(this.b, this.a);
    }
    for (;;)
    {
      return;
      o.a(this.b, 1);
      this.b.d = false;
      paramh = this.b.c.iterator();
      while (paramh.hasNext()) {
        ((u)paramh.next()).a(true, "");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */