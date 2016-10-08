package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class g
  implements DatePickerDialog.OnDateSetListener
{
  g(AbstractQuirys paramAbstractQuirys) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    AbstractQuirys.g(this.a, paramInt1);
    AbstractQuirys.h(this.a, paramInt2);
    AbstractQuirys.i(this.a, paramInt3);
    AbstractQuirys.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */