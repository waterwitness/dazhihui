package com.android.dazhihui.ui.delegate.screen.otc;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class ai
  implements DatePickerDialog.OnDateSetListener
{
  ai(OtcQuery paramOtcQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    OtcQuery.g(this.a, paramInt1);
    OtcQuery.h(this.a, paramInt2);
    OtcQuery.i(this.a, paramInt3);
    OtcQuery.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */