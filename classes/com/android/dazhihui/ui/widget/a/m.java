package com.android.dazhihui.ui.widget.a;

import java.util.concurrent.Callable;

class m
  implements Callable<Void>
{
  m(l paraml) {}
  
  public Void a()
  {
    synchronized (this.a)
    {
      if (l.a(this.a) == null) {
        return null;
      }
      l.b(this.a);
      if (l.c(this.a))
      {
        l.d(this.a);
        l.a(this.a, 0);
      }
      return null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */