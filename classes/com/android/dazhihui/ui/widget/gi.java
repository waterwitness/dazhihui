package com.android.dazhihui.ui.widget;

class gi
  implements Runnable
{
  gi(IndexWidget paramIndexWidget) {}
  
  public void run()
  {
    this.a.removeCallbacks(IndexWidget.b(this.a));
    IndexWidget.c(this.a);
    if (IndexWidget.d(this.a) > IndexWidget.a().length) {
      IndexWidget.a(this.a, 0);
    }
    IndexWidget.e(this.a);
    this.a.postDelayed(IndexWidget.b(this.a), 5000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */