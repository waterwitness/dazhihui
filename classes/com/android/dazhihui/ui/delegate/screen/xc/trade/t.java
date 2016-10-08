package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class t
  implements DatePickerDialog.OnDateSetListener
{
  t(DailyEarningDetail paramDailyEarningDetail) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    DailyEarningDetail.b(this.a, paramInt1);
    DailyEarningDetail.c(this.a, paramInt2 + 1);
    DailyEarningDetail.d(this.a, paramInt3);
    DailyEarningDetail.f(this.a).setText(new StringBuilder().append(DailyEarningDetail.e(this.a)).append("-").append(DailyEarningDetail.d(this.a)).append("-").append(DailyEarningDetail.c(this.a)));
    DailyEarningDetail.a(this.a, DailyEarningDetail.e(this.a) * 10000 + DailyEarningDetail.d(this.a) * 100 + DailyEarningDetail.c(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */