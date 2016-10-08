package com.android.dazhihui.ui.widget;

import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;

class ec
  implements Runnable
{
  ec(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void run()
  {
    this.a.setVisibility(0);
    HotVideoViewFlow.c(this.a).notifyDataSetChanged();
    this.a.getItemHeight();
    this.a.a(this.a.getScrollX(), 0 - this.a.getScrollX(), HotVideoViewFlow.d(this.a) * 3);
    HotVideoViewFlow.a(this.a, false);
    HotVideoViewFlow.b(this.a, true);
    this.a.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */