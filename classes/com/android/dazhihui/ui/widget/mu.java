package com.android.dazhihui.ui.widget;

import android.graphics.Matrix;

class mu
  implements Runnable
{
  ms a;
  int b;
  int c;
  
  mu(TouchImageView paramTouchImageView, int paramInt1, int paramInt2)
  {
    TouchImageView.a(paramTouchImageView, mz.d);
    this.a = new ms(paramTouchImageView, TouchImageView.r(paramTouchImageView));
    TouchImageView.m(paramTouchImageView).getValues(TouchImageView.s(paramTouchImageView));
    int i = (int)TouchImageView.s(paramTouchImageView)[2];
    int j = (int)TouchImageView.s(paramTouchImageView)[5];
    int k;
    int m;
    int n;
    int i1;
    if (TouchImageView.j(paramTouchImageView) > TouchImageView.i(paramTouchImageView))
    {
      k = TouchImageView.i(paramTouchImageView) - (int)TouchImageView.j(paramTouchImageView);
      m = 0;
      if (TouchImageView.l(paramTouchImageView) <= TouchImageView.k(paramTouchImageView)) {
        break label162;
      }
      n = TouchImageView.k(paramTouchImageView) - (int)TouchImageView.l(paramTouchImageView);
      i1 = 0;
    }
    for (;;)
    {
      this.a.a(i, j, paramInt1, paramInt2, k, m, n, i1);
      this.b = i;
      this.c = j;
      return;
      m = i;
      k = i;
      break;
      label162:
      i1 = j;
      n = j;
    }
  }
  
  public void a()
  {
    if (this.a != null)
    {
      TouchImageView.a(this.d, mz.a);
      this.a.a(true);
    }
  }
  
  public void run()
  {
    if (TouchImageView.p(this.d) != null) {
      TouchImageView.p(this.d).a();
    }
    if (this.a.a()) {
      this.a = null;
    }
    while (!this.a.b()) {
      return;
    }
    int i = this.a.c();
    int j = this.a.d();
    int k = this.b;
    int m = this.c;
    this.b = i;
    this.c = j;
    TouchImageView.m(this.d).postTranslate(i - k, j - m);
    TouchImageView.n(this.d);
    this.d.setImageMatrix(TouchImageView.m(this.d));
    TouchImageView.a(this.d, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */