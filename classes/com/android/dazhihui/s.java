package com.android.dazhihui;

import android.os.Handler;
import com.android.dazhihui.a.b.i;
import java.util.Iterator;
import java.util.List;

class s
  extends com.android.dazhihui.a.b.s
{
  s(o paramo, i parami)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    String str = o.a(this.a).o();
    Iterator localIterator = this.a.c.iterator();
    while (localIterator.hasNext()) {
      ((u)localIterator.next()).a(false, str);
    }
    int i = 0;
    while (i < o.d().size())
    {
      ((v)o.d().get(i)).a(str);
      i += 1;
    }
    if (this.a.a == null) {
      this.a.a = new Handler();
    }
    for (;;)
    {
      this.a.a.postDelayed(this.a.e, 85680000L);
      this.a.c.clear();
      this.a.d = false;
      o.a(this.a, 1);
      return;
      this.a.a.removeCallbacks(this.a.e);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */