package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class cb
  implements DatePickerDialog.OnDateSetListener
{
  cb(EntrustTable_history paramEntrustTable_history) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    EntrustTable_history.f(this.a, paramInt1);
    EntrustTable_history.g(this.a, paramInt2);
    EntrustTable_history.h(this.a, paramInt3);
    EntrustTable_history.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */