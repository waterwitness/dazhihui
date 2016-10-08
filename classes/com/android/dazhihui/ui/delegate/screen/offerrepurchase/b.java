package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

class b
  implements CompoundButton.OnCheckedChangeListener
{
  b(OfferRepurchaseEntrust paramOfferRepurchaseEntrust) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (OfferRepurchaseEntrust.c(this.a) != null)
    {
      if (paramBoolean)
      {
        OfferRepurchaseEntrust.c(this.a).setClickable(true);
        OfferRepurchaseEntrust.c(this.a).setOnClickListener(this.a.a);
      }
    }
    else {
      return;
    }
    OfferRepurchaseEntrust.c(this.a).setClickable(false);
    OfferRepurchaseEntrust.c(this.a).setEnabled(false);
    OfferRepurchaseEntrust.c(this.a).setOnClickListener(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */