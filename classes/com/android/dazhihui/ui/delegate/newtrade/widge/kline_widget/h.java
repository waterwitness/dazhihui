package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import com.android.dazhihui.ui.delegate.newtrade.TradeDetialScreen;
import com.android.dazhihui.ui.model.stock.StockVo;

class h
  implements Runnable
{
  private boolean b = false;
  
  h(KlineView paramKlineView) {}
  
  public void run()
  {
    int j = 50;
    KlineView.a(this.a, 0);
    KlineView.a(this.a, KlineView.a(this.a).a());
    int i;
    if (KlineView.b(this.a) != null)
    {
      int k = KlineView.b(this.a).getKLineOffset();
      i = k;
      if (k > 0)
      {
        i = k - 1;
        this.a.setKLineOffset(i);
      }
      if (i <= 50) {
        break label128;
      }
      this.a.a = false;
    }
    for (;;)
    {
      this.a.setMoveViewVisibility(0);
      this.a.j();
      i = j;
      if (this.b) {
        i = 100;
      }
      this.a.postDelayed(KlineView.e(this.a), i);
      return;
      label128:
      if (!this.b)
      {
        this.b = true;
        KlineView.a(this.a).b(false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */