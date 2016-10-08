package com.android.dazhihui.ui.delegate.screen.newstock;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class ah
  implements DatePickerDialog.OnDateSetListener
{
  ah(ad paramad) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    ad.f(this.a, paramInt1);
    ad.g(this.a, paramInt2 + 1);
    ad.h(this.a, paramInt3);
    ad.o(this.a).setText(new StringBuilder().append(ad.j(this.a)).append("-").append(ad.k(this.a)).append("-").append(ad.l(this.a)));
    ad.b(this.a, ad.j(this.a) * 10000 + ad.k(this.a) * 100 + ad.l(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */