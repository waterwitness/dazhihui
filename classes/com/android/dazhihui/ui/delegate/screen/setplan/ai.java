package com.android.dazhihui.ui.delegate.screen.setplan;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class ai
  implements DatePickerDialog.OnDateSetListener
{
  ai(SetPlanQuery paramSetPlanQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    SetPlanQuery.g(this.a, paramInt1);
    SetPlanQuery.h(this.a, paramInt2);
    SetPlanQuery.i(this.a, paramInt3);
    SetPlanQuery.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */