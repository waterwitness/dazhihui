package com.android.dazhihui.ui.delegate.screen.newstock;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;

class ai
  implements View.OnClickListener
{
  ai(ad paramad) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558777: 
      ad.e(this.a);
      ad.a(this.a, true);
      return;
    case 2131558775: 
      ad.f(this.a);
      ad.g(this.a);
      ad.h(this.a);
      new DatePickerDialog(this.a.getActivity(), ad.i(this.a), ad.f(this.a), ad.g(this.a) - 1, ad.h(this.a)).show();
      return;
    }
    ad.j(this.a);
    ad.k(this.a);
    ad.l(this.a);
    new DatePickerDialog(this.a.getActivity(), ad.m(this.a), ad.j(this.a), ad.k(this.a) - 1, ad.l(this.a)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */