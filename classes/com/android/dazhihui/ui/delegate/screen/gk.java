package com.android.dazhihui.ui.delegate.screen;

import android.app.Dialog;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class gk
  extends s
{
  gk(TradeOutsideScreen paramTradeOutsideScreen, i parami)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    this.a.getLoadingDialog().dismiss();
    TradeOutsideScreen.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */