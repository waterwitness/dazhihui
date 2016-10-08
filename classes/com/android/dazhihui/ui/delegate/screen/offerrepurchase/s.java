package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class s
  implements View.OnClickListener
{
  s(OfferRepurchaseQuirys paramOfferRepurchaseQuirys) {}
  
  public void onClick(View paramView)
  {
    if ((OfferRepurchaseQuirys.d(this.a).getText().toString().length() == 0) || (OfferRepurchaseQuirys.e(this.a).getText().toString().length() == 0))
    {
      this.a.b(0);
      return;
    }
    if ((OfferRepurchaseQuirys.d(this.a).getText().toString().length() != 8) || (OfferRepurchaseQuirys.e(this.a).getText().toString().length() != 8))
    {
      this.a.b(1);
      return;
    }
    if (OfferRepurchaseQuirys.d(this.a).getText().toString().compareTo(OfferRepurchaseQuirys.e(this.a).getText().toString()) > 0)
    {
      this.a.b(2);
      return;
    }
    OfferRepurchaseQuirys.f(this.a);
    OfferRepurchaseQuirys.g(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */