package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.view.View;
import android.widget.Scroller;
import com.android.dazhihui.ui.widget.stockchart.StockChartPager;

public class u
  extends View
{
  private Scroller a;
  private StockChartPager b;
  private int c;
  
  public u(Context paramContext, StockChartPager paramStockChartPager)
  {
    super(paramContext);
    this.b = paramStockChartPager;
    b();
  }
  
  private void b()
  {
    this.a = new Scroller(getContext());
  }
  
  public void a()
  {
    if (!this.a.isFinished()) {
      this.a.abortAnimation();
    }
    invalidate();
  }
  
  public void a(int paramInt)
  {
    if (!this.a.isFinished()) {
      this.a.abortAnimation();
    }
    scrollTo(0, 0);
    invalidate();
    this.c = 0;
    this.a.fling(0, 0, 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    invalidate();
  }
  
  public void computeScroll()
  {
    int i;
    if (this.a.computeScrollOffset())
    {
      i = this.a.getCurrY() - this.c;
      if (((i <= 0) || (!this.b.isScrollTop()) || (this.b.getHeaderHidden() != -this.b.getHeaderHeight())) && (this.b.getHeaderHidden() == -this.b.getHeaderHeight())) {
        break label164;
      }
      int j = i + this.b.getHeaderHidden();
      i = j;
      if (j > 0) {
        i = 0;
      }
      j = i;
      if (i < -this.b.getHeaderHeight()) {
        j = -this.b.getHeaderHeight();
      }
      this.b.moveHeader(j - this.b.getHeaderHidden());
    }
    for (;;)
    {
      this.c = this.a.getCurrY();
      scrollTo(this.a.getCurrX(), this.a.getCurrY());
      invalidate();
      return;
      label164:
      this.b.moveContent(-i);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */