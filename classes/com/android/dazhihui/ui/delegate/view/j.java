package com.android.dazhihui.ui.delegate.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class j
  implements View.OnClickListener
{
  j(TradeHeader paramTradeHeader) {}
  
  public void onClick(View paramView)
  {
    if (TradeHeader.c(this.a) != null) {
      TradeHeader.c(this.a).a(true, null, null, null);
    }
    if (TradeHeader.d(this.a).isShowing()) {
      TradeHeader.d(this.a).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */