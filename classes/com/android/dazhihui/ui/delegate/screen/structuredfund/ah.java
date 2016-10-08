package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class ah
  implements DatePickerDialog.OnDateSetListener
{
  ah(StructuredFundQuery paramStructuredFundQuery) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    StructuredFundQuery.f(this.a, paramInt1);
    StructuredFundQuery.g(this.a, paramInt2 + 1);
    StructuredFundQuery.h(this.a, paramInt3);
    StructuredFundQuery.m(this.a).setText(new StringBuilder().append(StructuredFundQuery.h(this.a)).append("-").append(StructuredFundQuery.i(this.a)).append("-").append(StructuredFundQuery.j(this.a)));
    StructuredFundQuery.b(this.a, StructuredFundQuery.h(this.a) * 10000 + StructuredFundQuery.i(this.a) * 100 + StructuredFundQuery.j(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */