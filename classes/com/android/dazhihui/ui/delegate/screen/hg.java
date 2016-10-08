package com.android.dazhihui.ui.delegate.screen;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;

class hg
  implements DatePickerDialog.OnDateSetListener
{
  hg(TransferMenuNew paramTransferMenuNew) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    TransferMenuNew.e(this.a, paramInt1);
    TransferMenuNew.f(this.a, paramInt2 + 1);
    TransferMenuNew.g(this.a, paramInt3);
    TransferMenuNew.o(this.a).setText(new StringBuilder().append(TransferMenuNew.n(this.a)).append("-").append(TransferMenuNew.m(this.a)).append("-").append(TransferMenuNew.l(this.a)));
    TransferMenuNew.a(this.a, TransferMenuNew.n(this.a) * 10000 + TransferMenuNew.m(this.a) * 100 + TransferMenuNew.l(this.a) + "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */