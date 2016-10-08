package com.android.dazhihui.ui.delegate.screen.ggt;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class y
  implements DatePickerDialog.OnDateSetListener
{
  y(GgtQuiry paramGgtQuiry) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    GgtQuiry.d(this.a, paramInt1);
    GgtQuiry.e(this.a, paramInt2);
    GgtQuiry.f(this.a, paramInt3);
    GgtQuiry.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */