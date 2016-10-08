package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class a
  implements View.OnClickListener
{
  a(OfferRepurchaseEntrust paramOfferRepurchaseEntrust) {}
  
  public void onClick(View paramView)
  {
    if (OfferRepurchaseEntrust.a(this.a).getText().toString().equals(""))
    {
      this.a.c("请输入委托数量");
      return;
    }
    OfferRepurchaseEntrust.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */