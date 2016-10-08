package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class ca
  implements DatePickerDialog.OnDateSetListener
{
  ca(EntrustTable_history paramEntrustTable_history) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    EntrustTable_history.c(this.a, paramInt1);
    EntrustTable_history.d(this.a, paramInt2);
    EntrustTable_history.e(this.a, paramInt3);
    EntrustTable_history.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */