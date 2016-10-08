package com.android.dazhihui.ui.screen;

import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class ag
  implements b
{
  ag(StockAllNewsActivity paramStockAllNewsActivity) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (StockAllNewsActivity.a(this.a) != null) {
      StockAllNewsActivity.a(this.a).b();
    }
    if (StockAllNewsActivity.b(this.a) == null) {
      return;
    }
    if ((StockAllNewsActivity.b(this.a).getLastPage() != null) && (!StockAllNewsActivity.b(this.a).getLastPage().equals(StockAllNewsActivity.b(this.a).getCurPage())))
    {
      paramBaseRefreshView = StockAllNewsActivity.b(this.a).getNextPage();
      StockAllNewsActivity.a(this.a, paramBaseRefreshView);
      return;
    }
    StockAllNewsActivity.a(this.a).setLastPage(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */