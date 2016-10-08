package com.android.dazhihui.ui.widget.flip;

import android.widget.Adapter;

class e
  implements Runnable
{
  e(d paramd) {}
  
  public void run()
  {
    ViewFlow.e(this.a.a);
    if (ViewFlow.a(this.a.a).getCount() == 0) {
      this.a.a.b();
    }
    for (;;)
    {
      if (ViewFlow.f(this.a.a) != null)
      {
        ViewFlow.f(this.a.a).requestLayout();
        ViewFlow.f(this.a.a).invalidate();
      }
      return;
      if (ViewFlow.a(this.a.a).getCount() == 1)
      {
        this.a.a.setSelection(ViewFlow.c(this.a.a));
      }
      else
      {
        this.a.a.setSelection(ViewFlow.c(this.a.a));
        if (this.a.a.a) {
          if (ViewFlow.b(this.a.a) != null) {
            this.a.a.a(ViewFlow.b(this.a.a));
          } else {
            this.a.a.a(ViewFlow.d(this.a.a));
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */