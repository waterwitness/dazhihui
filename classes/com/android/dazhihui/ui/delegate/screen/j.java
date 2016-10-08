package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class j
  implements DatePickerDialog.OnDateSetListener
{
  j(BargainTable_history paramBargainTable_history) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    BargainTable_history.f(this.a, paramInt1);
    BargainTable_history.g(this.a, paramInt2);
    BargainTable_history.h(this.a, paramInt3);
    BargainTable_history.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */