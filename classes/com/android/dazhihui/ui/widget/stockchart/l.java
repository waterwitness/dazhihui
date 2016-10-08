package com.android.dazhihui.ui.widget.stockchart;

import com.android.dazhihui.ui.model.stock.StockVo;

class l
  implements Runnable
{
  private boolean b = false;
  
  l(KChartContainer paramKChartContainer) {}
  
  public void run()
  {
    int j = 50;
    KChartContainer.a(this.a, 0);
    KChartContainer.a(this.a, KChartContainer.a(this.a).getDataModel());
    int i;
    if (KChartContainer.c(this.a) != null)
    {
      int k = KChartContainer.c(this.a).getKLineOffset();
      i = k;
      if (k > 0)
      {
        i = k - 1;
        this.a.setKLineOffset(i);
      }
      if (i <= 50) {
        break label128;
      }
      this.a.h = false;
    }
    for (;;)
    {
      this.a.setMoveViewVisibility(0);
      this.a.t();
      i = j;
      if (this.b) {
        i = 100;
      }
      this.a.postDelayed(KChartContainer.f(this.a), i);
      return;
      label128:
      if (!this.b)
      {
        this.b = true;
        KChartContainer.a(this.a).a(false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */