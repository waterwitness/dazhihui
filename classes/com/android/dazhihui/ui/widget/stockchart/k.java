package com.android.dazhihui.ui.widget.stockchart;

import com.android.dazhihui.ui.model.stock.StockVo;

class k
  implements Runnable
{
  k(KChartContainer paramKChartContainer) {}
  
  public void run()
  {
    KChartContainer.a(this.a, KChartContainer.a(this.a).getDataModel());
    if ((KChartContainer.c(this.a) != null) && (KChartContainer.c(this.a).getKData() != null))
    {
      int i = KChartContainer.c(this.a).getKLineOffset();
      if (i >= 0)
      {
        if (KChartContainer.d(this.a) + i > KChartContainer.c(this.a).getKData().length) {
          break label163;
        }
        KChartContainer.a(this.a, KChartContainer.d(this.a) - 1);
        if (KChartContainer.d(this.a) + i < KChartContainer.c(this.a).getKData().length) {
          this.a.setKLineOffset(i + 1);
        }
      }
    }
    for (;;)
    {
      this.a.setMoveViewVisibility(0);
      this.a.t();
      this.a.postDelayed(KChartContainer.e(this.a), 50L);
      return;
      label163:
      KChartContainer.a(this.a, KChartContainer.c(this.a).getKData().length - 1);
      this.a.setKLineOffset(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */