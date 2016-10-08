package com.android.dazhihui.ui.delegate.screen;

import android.text.Editable;
import android.text.TextWatcher;

class gm
  implements TextWatcher
{
  gm(TradeOutsideScreen paramTradeOutsideScreen) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.a(paramCharSequence.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */