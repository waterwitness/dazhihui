package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class bn
  implements DatePickerDialog.OnDateSetListener
{
  bn(HKQuery paramHKQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    HKQuery.b(this.a, paramInt1);
    HKQuery.c(this.a, paramInt2 + 1);
    HKQuery.d(this.a, paramInt3);
    HKQuery.v(this.a).setText(new StringBuilder().append(HKQuery.n(this.a)).append("-").append(HKQuery.o(this.a)).append("-").append(HKQuery.p(this.a)));
    HKQuery.a(this.a, HKQuery.n(this.a) * 10000 + HKQuery.o(this.a) * 100 + HKQuery.p(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */