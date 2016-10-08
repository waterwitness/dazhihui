package com.android.dazhihui.ui.delegate.screen.setplan;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class ah
  implements DatePickerDialog.OnDateSetListener
{
  ah(SetPlanQuery paramSetPlanQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    SetPlanQuery.d(this.a, paramInt1);
    SetPlanQuery.e(this.a, paramInt2);
    SetPlanQuery.f(this.a, paramInt3);
    SetPlanQuery.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */