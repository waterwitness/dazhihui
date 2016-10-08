package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class k
  implements DatePickerDialog.OnDateSetListener
{
  k(OfferRepurchaseQuirys paramOfferRepurchaseQuirys) {}
  
  public void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    OfferRepurchaseQuirys.d(this.a, paramInt1);
    OfferRepurchaseQuirys.e(this.a, paramInt2);
    OfferRepurchaseQuirys.f(this.a, paramInt3);
    OfferRepurchaseQuirys.j(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */