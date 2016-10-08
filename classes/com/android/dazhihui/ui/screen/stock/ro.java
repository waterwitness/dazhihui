package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ro
  implements View.OnClickListener
{
  ro(SearchStockScreen paramSearchStockScreen) {}
  
  public void onClick(View paramView)
  {
    SearchStockScreen.a(this.a, "");
    SearchStockScreen.d(this.a).setText(SearchStockScreen.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */