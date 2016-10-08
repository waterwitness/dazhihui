package com.android.dazhihui.ui.widget.flip;

class c
  implements Runnable
{
  c(ViewFlow paramViewFlow) {}
  
  public void run()
  {
    this.a.scrollTo(0, 0);
    ViewFlow.a(this.a, 0);
    if (ViewFlow.g(this.a) != null) {
      ViewFlow.g(this.a).a(null, ViewFlow.c(this.a));
    }
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */