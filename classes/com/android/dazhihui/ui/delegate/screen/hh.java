package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class hh
  implements DatePickerDialog.OnDateSetListener
{
  hh(TransferMenuNew paramTransferMenuNew) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    TransferMenuNew.h(this.a, paramInt1);
    TransferMenuNew.i(this.a, paramInt2 + 1);
    TransferMenuNew.j(this.a, paramInt3);
    TransferMenuNew.s(this.a).setText(new StringBuilder().append(TransferMenuNew.r(this.a)).append("-").append(TransferMenuNew.q(this.a)).append("-").append(TransferMenuNew.p(this.a)));
    TransferMenuNew.b(this.a, TransferMenuNew.r(this.a) * 10000 + TransferMenuNew.q(this.a) * 100 + TransferMenuNew.p(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */