package com.android.dazhihui.ui.widget;

import android.os.Handler;

class el
  implements Runnable
{
  el(IndexBottomWidget paramIndexBottomWidget) {}
  
  public void run()
  {
    if (IndexBottomWidget.a(this.a))
    {
      IndexBottomWidget.b(this.a);
      if (IndexBottomWidget.c(this.a) < IndexBottomWidget.d(this.a))
      {
        IndexBottomWidget.f(this.a).removeCallbacks(IndexBottomWidget.e(this.a));
        IndexBottomWidget.f(this.a).postDelayed(this, 5000L);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */