package com.android.dazhihui.ui.delegate.screen.ggt;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class z
  implements DatePickerDialog.OnDateSetListener
{
  z(GgtQuiry paramGgtQuiry) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    GgtQuiry.g(this.a, paramInt1);
    GgtQuiry.h(this.a, paramInt2);
    GgtQuiry.i(this.a, paramInt3);
    GgtQuiry.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */