package com.android.dazhihui.ui.delegate.screen.otc;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class ah
  implements DatePickerDialog.OnDateSetListener
{
  ah(OtcQuery paramOtcQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    OtcQuery.d(this.a, paramInt1);
    OtcQuery.e(this.a, paramInt2);
    OtcQuery.f(this.a, paramInt3);
    OtcQuery.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */