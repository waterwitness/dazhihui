package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import com.android.dazhihui.ui.delegate.newtrade.TradeDetialScreen;
import com.android.dazhihui.ui.model.stock.StockVo;

class g
  implements Runnable
{
  g(KlineView paramKlineView) {}
  
  public void run()
  {
    KlineView.a(this.a, KlineView.a(this.a).a());
    if ((KlineView.b(this.a) != null) && (KlineView.b(this.a).getKData() != null))
    {
      int i = KlineView.b(this.a).getKLineOffset();
      if (i >= 0)
      {
        if (KlineView.c(this.a) + i > KlineView.b(this.a).getKData().length) {
          break label163;
        }
        KlineView.a(this.a, KlineView.c(this.a) - 1);
        if (KlineView.c(this.a) + i < KlineView.b(this.a).getKData().length) {
          this.a.setKLineOffset(i + 1);
        }
      }
    }
    for (;;)
    {
      this.a.setMoveViewVisibility(0);
      this.a.j();
      this.a.postDelayed(KlineView.d(this.a), 50L);
      return;
      label163:
      KlineView.a(this.a, KlineView.b(this.a).getKData().length - 1);
      this.a.setKLineOffset(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */