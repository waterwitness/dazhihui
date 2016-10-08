package com.android.dazhihui.ui.widget.stockchart;

class am
  implements Runnable
{
  am(MinStockChartBaseView paramMinStockChartBaseView) {}
  
  public void run()
  {
    this.a.a.setMoveViewVisibility(8);
    this.a.c = -1;
    this.a.postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */