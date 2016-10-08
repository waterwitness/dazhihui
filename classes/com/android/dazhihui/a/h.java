package com.android.dazhihui.a;

import com.android.dazhihui.a.b.m;
import com.android.dazhihui.w;
import java.util.Iterator;
import java.util.List;

class h
  extends x
{
  h(g paramg) {}
  
  protected void a(m paramm)
  {
    synchronized (g.a(this.a))
    {
      this.a.d(paramm);
      byte[] arrayOfByte = paramm.n();
      g.b(this.a).a(arrayOfByte);
      g.c(this.a).c(arrayOfByte.length);
      paramm.a(true);
      return;
    }
  }
  
  protected boolean a()
  {
    return (this.a.u()) && (super.a());
  }
  
  protected boolean b(m paramm)
  {
    paramm = paramm.s();
    if (paramm.size() == 0) {
      return true;
    }
    paramm = paramm.iterator();
    while (paramm.hasNext()) {
      if (((com.android.dazhihui.a.b.x)paramm.next()).a() == 2206) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */