package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class ag
  implements DatePickerDialog.OnDateSetListener
{
  ag(StructuredFundQuery paramStructuredFundQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    StructuredFundQuery.c(this.a, paramInt1);
    StructuredFundQuery.d(this.a, paramInt2 + 1);
    StructuredFundQuery.e(this.a, paramInt3);
    StructuredFundQuery.l(this.a).setText(new StringBuilder().append(StructuredFundQuery.d(this.a)).append("-").append(StructuredFundQuery.e(this.a)).append("-").append(StructuredFundQuery.f(this.a)));
    StructuredFundQuery.a(this.a, StructuredFundQuery.d(this.a) * 10000 + StructuredFundQuery.e(this.a) * 100 + StructuredFundQuery.f(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */