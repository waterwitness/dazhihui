package com.android.dazhihui.ui.screen.stock;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

class rp
  implements TextWatcher
{
  rp(SearchStockScreen paramSearchStockScreen) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    Log.w(SearchStockScreen.e(this.a), "afterTextChanged");
    SearchStockScreen.a(this.a, true);
    SearchStockScreen.a(this.a, System.currentTimeMillis());
    Log.w(SearchStockScreen.e(this.a), "mLastSearchTime = " + SearchStockScreen.f(this.a));
    this.a.c();
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Log.w(SearchStockScreen.e(this.a), "beforeTextChanged");
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Log.w(SearchStockScreen.e(this.a), "onTextChanged");
    if (paramCharSequence.length() > 0) {
      SearchStockScreen.a(this.a, 1);
    }
    for (;;)
    {
      SearchStockScreen.a(this.a, false);
      SearchStockScreen.a(this.a, paramCharSequence);
      return;
      SearchStockScreen.a(this.a, 0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */