package com.android.dazhihui.ui.widget;

class lb
  implements Runnable
{
  lb(StockChartViewflow paramStockChartViewflow) {}
  
  public void run()
  {
    StockChartViewflow.a(this.a, this.a.getWidth());
    this.a.scrollTo(-StockChartViewflow.a(this.a), 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */