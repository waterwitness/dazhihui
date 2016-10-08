package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class j
  implements DatePickerDialog.OnDateSetListener
{
  j(OfferRepurchaseQuirys paramOfferRepurchaseQuirys) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    OfferRepurchaseQuirys.g(this.a, paramInt1);
    OfferRepurchaseQuirys.h(this.a, paramInt2);
    OfferRepurchaseQuirys.i(this.a, paramInt3);
    OfferRepurchaseQuirys.i(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */