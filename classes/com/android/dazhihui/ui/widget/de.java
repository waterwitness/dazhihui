package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhLoading;

class de
  implements Runnable
{
  de(DzhRefreshLayout paramDzhRefreshLayout) {}
  
  public void run()
  {
    DzhRefreshLayout.a(this.a);
    DzhRefreshLayout.b(this.a);
    if (DzhRefreshLayout.c(this.a).getVisibility() == 0) {}
    DzhRefreshLayout.d(this.a).b();
    DzhRefreshLayout.d(this.a).a(0);
    DzhRefreshLayout.c(this.a).setVisibility(8);
    DzhRefreshLayout.e(this.a).findViewById(2131560228).setVisibility(0);
    DzhRefreshLayout.e(this.a).findViewById(2131560229).setVisibility(8);
    DzhRefreshLayout.e(this.a).setVisibility(8);
    DzhRefreshLayout.c(this.a).offsetTopAndBottom(-DzhRefreshLayout.c(this.a).getTop() - DzhRefreshLayout.f(this.a));
    DzhRefreshLayout.g(this.a).offsetTopAndBottom(-DzhRefreshLayout.g(this.a).getTop());
    DzhRefreshLayout.e(this.a).offsetTopAndBottom(DzhRefreshLayout.h(this.a) - DzhRefreshLayout.e(this.a).getBottom() + DzhRefreshLayout.i(this.a));
    DzhRefreshLayout.k(this.a).setText(DzhRefreshLayout.j(this.a)[0]);
    DzhRefreshLayout.m(this.a).setText(DzhRefreshLayout.l(this.a)[0]);
    DzhRefreshLayout.a(this.a, 0);
    DzhRefreshLayout.b(this.a, 0);
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */