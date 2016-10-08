package com.d.a.c.d;

import com.d.a.c.av;
import com.d.a.c.s;
import java.util.Iterator;
import java.util.List;

class ao
  extends com.d.a.b.n<av, List<k>>
{
  ao(ai paramai, com.d.a.c.n paramn) {}
  
  protected void a(List<k> paramList)
  {
    av localav = new av();
    paramList = paramList.iterator();
    for (;;)
    {
      if (!paramList.hasNext())
      {
        paramList = localav.d(k.a.a()).split(" ", 2);
        this.b.f.a(Integer.parseInt(paramList[0]));
        if (paramList.length == 2) {
          this.b.f.b(paramList[1]);
        }
        this.b.f.a(localav.d(k.g.a()));
        this.b.f.a(localav);
        b(localav);
        return;
      }
      k localk = (k)paramList.next();
      localav.b(localk.h.a(), localk.i.a());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */