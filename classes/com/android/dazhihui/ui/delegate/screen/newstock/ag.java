package com.android.dazhihui.ui.delegate.screen.newstock;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class ag
  implements DatePickerDialog.OnDateSetListener
{
  ag(ad paramad) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    ad.c(this.a, paramInt1);
    ad.d(this.a, paramInt2 + 1);
    ad.e(this.a, paramInt3);
    ad.n(this.a).setText(new StringBuilder().append(ad.f(this.a)).append("-").append(ad.g(this.a)).append("-").append(ad.h(this.a)));
    ad.a(this.a, ad.f(this.a) * 10000 + ad.g(this.a) * 100 + ad.h(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */