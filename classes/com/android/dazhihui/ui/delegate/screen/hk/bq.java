package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;

class bq
  implements View.OnClickListener
{
  bq(HKQuery paramHKQuery) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558777: 
      HKQuery.j(this.a);
      if (HKQuery.a(this.a) == 15058)
      {
        if (bk.A == null)
        {
          HKQuery.k(this.a);
          return;
        }
        paramView = HKQuery.l(this.a);
        if (HKQuery.l(this.a).getSelectedItemPosition() < 0) {}
        for (int i = 0;; i = HKQuery.l(this.a).getSelectedItemPosition())
        {
          bk.a(paramView, i);
          HKQuery.l(this.a).setOnItemChangeListener(HKQuery.m(this.a));
          HKQuery.a(this.a, true);
          return;
        }
      }
      HKQuery.a(this.a, true);
      return;
    case 2131558775: 
      HKQuery.n(this.a);
      HKQuery.o(this.a);
      HKQuery.p(this.a);
      new DatePickerDialog(this.a, HKQuery.q(this.a), HKQuery.n(this.a), HKQuery.o(this.a) - 1, HKQuery.p(this.a)).show();
      return;
    }
    HKQuery.r(this.a);
    HKQuery.s(this.a);
    HKQuery.t(this.a);
    new DatePickerDialog(this.a, HKQuery.u(this.a), HKQuery.r(this.a), HKQuery.s(this.a) - 1, HKQuery.t(this.a)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */