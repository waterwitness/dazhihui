package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class bo
  implements DatePickerDialog.OnDateSetListener
{
  bo(HKQuery paramHKQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    HKQuery.e(this.a, paramInt1);
    HKQuery.f(this.a, paramInt2 + 1);
    HKQuery.g(this.a, paramInt3);
    HKQuery.w(this.a).setText(new StringBuilder().append(HKQuery.r(this.a)).append("-").append(HKQuery.s(this.a)).append("-").append(HKQuery.t(this.a)));
    HKQuery.b(this.a, HKQuery.r(this.a) * 10000 + HKQuery.s(this.a) * 100 + HKQuery.t(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */