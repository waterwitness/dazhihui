package com.android.dazhihui.ui.screen;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;

class af
  implements c
{
  af(StockAllNewsActivity paramStockAllNewsActivity) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (StockAllNewsActivity.a(this.a) != null) {
      StockAllNewsActivity.a(this.a).a(true);
    }
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */