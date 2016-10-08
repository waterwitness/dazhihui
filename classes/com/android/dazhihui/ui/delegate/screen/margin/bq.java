package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class bq
  implements DatePickerDialog.OnDateSetListener
{
  bq(MarginQuery paramMarginQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    MarginQuery.c(this.a, paramInt1);
    MarginQuery.d(this.a, paramInt2 + 1);
    MarginQuery.e(this.a, paramInt3);
    MarginQuery.o(this.a).setText(new StringBuilder().append(MarginQuery.g(this.a)).append("-").append(MarginQuery.h(this.a)).append("-").append(MarginQuery.i(this.a)));
    MarginQuery.b(this.a, MarginQuery.g(this.a) * 10000 + MarginQuery.h(this.a) * 100 + MarginQuery.i(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */