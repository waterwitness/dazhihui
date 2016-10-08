package com.android.dazhihui.ui.widget.dzhrefresh;

class e
  implements Runnable
{
  e(DzhLoading paramDzhLoading) {}
  
  public void run()
  {
    if (DzhLoading.a(this.a) == 100) {
      DzhLoading.a(this.a, 0);
    }
    DzhLoading.a(this.a, DzhLoading.a(this.a) + 20);
    this.a.a(DzhLoading.a(this.a));
    this.a.postDelayed(this, DzhLoading.b(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */