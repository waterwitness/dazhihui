package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class bi
  implements DatePickerDialog.OnDateSetListener
{
  bi(FundMutualAIPOpen paramFundMutualAIPOpen) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    FundMutualAIPOpen.a(this.a, paramInt1);
    FundMutualAIPOpen.b(this.a, paramInt2);
    FundMutualAIPOpen.c(this.a, paramInt3);
    FundMutualAIPOpen.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */