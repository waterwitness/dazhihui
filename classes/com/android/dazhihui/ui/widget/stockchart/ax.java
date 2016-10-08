package com.android.dazhihui.ui.widget.stockchart;

class ax
  implements Runnable
{
  ax(StockChartPager paramStockChartPager) {}
  
  public void run()
  {
    StockChartPager.a(this.a, 0);
    if (StockChartPager.a(this.a))
    {
      if (StockChartPager.b(this.a) != null) {
        StockChartPager.b(this.a).a(StockChartPager.c(this.a));
      }
      StockChartPager.a(this.a, false);
      if (StockChartPager.d(this.a))
      {
        if (StockChartPager.h() != null) {
          StockChartPager.h().f();
        }
        StockChartPager.b(this.a, false);
      }
      if (StockChartPager.e(this.a))
      {
        if (StockChartPager.i() != null) {
          StockChartPager.i().f();
        }
        StockChartPager.c(this.a, false);
      }
    }
    this.a.requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */