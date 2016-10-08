package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class p
  implements View.OnClickListener
{
  p(OfferRepurchaseQuirys paramOfferRepurchaseQuirys) {}
  
  public void onClick(View paramView)
  {
    OfferRepurchaseQuirys.c(this.a).setVisibility(8);
    paramView = this.a.getSharedPreferences("data1", 0).edit();
    paramView.putBoolean("tip1", false);
    paramView.commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */