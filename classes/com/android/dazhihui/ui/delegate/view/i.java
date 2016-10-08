package com.android.dazhihui.ui.delegate.view;

import android.view.View;
import android.view.View.OnClickListener;

class i
  implements View.OnClickListener
{
  i(TradeHeader paramTradeHeader) {}
  
  public void onClick(View paramView)
  {
    if (TradeHeader.b(this.a) != null) {
      TradeHeader.b(this.a).a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */