package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;

class rs
  implements View.OnClickListener
{
  rs(SearchStockScreen paramSearchStockScreen) {}
  
  public void onClick(View paramView)
  {
    try
    {
      SearchStockScreen.p(this.a);
      return;
    }
    catch (Exception paramView)
    {
      this.a.showShortToast(2131166013);
      paramView.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */