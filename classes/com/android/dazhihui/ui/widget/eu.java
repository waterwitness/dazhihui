package com.android.dazhihui.ui.widget;

import android.os.Handler;

class eu
  implements Runnable
{
  eu(IndexStockChartBottomWidget paramIndexStockChartBottomWidget) {}
  
  public void run()
  {
    if (IndexStockChartBottomWidget.a(this.a))
    {
      IndexStockChartBottomWidget.b(this.a);
      if (IndexStockChartBottomWidget.c(this.a) < IndexStockChartBottomWidget.d(this.a))
      {
        IndexStockChartBottomWidget.f(this.a).removeCallbacks(IndexStockChartBottomWidget.e(this.a));
        IndexStockChartBottomWidget.f(this.a).postDelayed(this, 5000L);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */