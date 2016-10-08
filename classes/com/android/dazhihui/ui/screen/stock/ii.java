package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.widget.lw;

class ii
  implements lw
{
  ii(MarketListScreen paramMarketListScreen) {}
  
  public void a()
  {
    if (MarketManager.isHKLimit(MarketListScreen.d(this.a))) {
      MarketListScreen.a(this.a, "免费港股行情根据交易所规定只能展示前 20 只。");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */