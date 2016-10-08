package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class u
  implements DatePickerDialog.OnDateSetListener
{
  u(DailyEarningDetail paramDailyEarningDetail) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    DailyEarningDetail.e(this.a, paramInt1);
    DailyEarningDetail.f(this.a, paramInt2 + 1);
    DailyEarningDetail.g(this.a, paramInt3);
    DailyEarningDetail.j(this.a).setText(new StringBuilder().append(DailyEarningDetail.i(this.a)).append("-").append(DailyEarningDetail.h(this.a)).append("-").append(DailyEarningDetail.g(this.a)));
    DailyEarningDetail.b(this.a, DailyEarningDetail.i(this.a) * 10000 + DailyEarningDetail.h(this.a) * 100 + DailyEarningDetail.g(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */