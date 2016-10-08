package com.android.dazhihui.ui.widget.flip;

import android.widget.Adapter;

class k
  implements Runnable
{
  k(j paramj) {}
  
  public void run()
  {
    ViewUpFlow.c(this.a.a);
    if (ViewUpFlow.a(this.a.a).getCount() == 0) {
      this.a.a.a();
    }
    for (;;)
    {
      if (ViewUpFlow.e(this.a.a) != null)
      {
        ViewUpFlow.e(this.a.a).requestLayout();
        ViewUpFlow.e(this.a.a).invalidate();
      }
      return;
      if (ViewUpFlow.a(this.a.a).getCount() == 1)
      {
        this.a.a.setSelection(ViewUpFlow.d(this.a.a));
      }
      else
      {
        this.a.a.setSelection(ViewUpFlow.d(this.a.a));
        if (this.a.a.a) {
          this.a.a.a(ViewUpFlow.b(this.a.a));
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */