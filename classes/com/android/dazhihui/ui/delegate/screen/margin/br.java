package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class br
  implements DatePickerDialog.OnDateSetListener
{
  br(MarginQuery paramMarginQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    MarginQuery.f(this.a, paramInt1);
    MarginQuery.g(this.a, paramInt2 + 1);
    MarginQuery.h(this.a, paramInt3);
    MarginQuery.p(this.a).setText(new StringBuilder().append(MarginQuery.k(this.a)).append("-").append(MarginQuery.l(this.a)).append("-").append(MarginQuery.m(this.a)));
    MarginQuery.c(this.a, MarginQuery.k(this.a) * 10000 + MarginQuery.l(this.a) * 100 + MarginQuery.m(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */