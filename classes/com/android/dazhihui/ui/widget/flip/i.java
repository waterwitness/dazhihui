package com.android.dazhihui.ui.widget.flip;

class i
  implements Runnable
{
  i(ViewUpFlow paramViewUpFlow) {}
  
  public void run()
  {
    this.a.scrollTo(0, 0);
    ViewUpFlow.a(this.a, 0);
    if (ViewUpFlow.f(this.a) != null) {
      ViewUpFlow.f(this.a).a(null, ViewUpFlow.d(this.a));
    }
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */