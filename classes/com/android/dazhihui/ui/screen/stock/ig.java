package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class ig
  implements lz
{
  ig(MarketListScreen paramMarketListScreen) {}
  
  public void a()
  {
    if (MarketListScreen.a(this.a)) {
      this.a.a(false);
    }
    for (;;)
    {
      MarketListScreen.c(this.a);
      return;
      this.a.b(0, false);
    }
  }
  
  public void a(int paramInt)
  {
    if (!MarketListScreen.a(this.a))
    {
      this.a.b(paramInt, false);
      return;
    }
    MarketListScreen.b(this.a).d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */