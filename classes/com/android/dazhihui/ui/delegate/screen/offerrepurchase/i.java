package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class i
  implements lz
{
  i(OfferRepurchaseQuirys paramOfferRepurchaseQuirys) {}
  
  public void a()
  {
    OfferRepurchaseQuirys.a(this.a, 20);
    OfferRepurchaseQuirys.b(this.a, 0);
    this.a.a(OfferRepurchaseQuirys.b(this.a), false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      OfferRepurchaseQuirys.a(this.a).d();
      return;
    }
    OfferRepurchaseQuirys.a(this.a, 10);
    OfferRepurchaseQuirys.b(this.a, paramInt);
    this.a.a(OfferRepurchaseQuirys.b(this.a), false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */