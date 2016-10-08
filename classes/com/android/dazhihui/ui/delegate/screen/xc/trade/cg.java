package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.android.dazhihui.ui.delegate.b.o;

class cg
  implements AbsListView.OnScrollListener
{
  cg(TradeQuery paramTradeQuery) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (paramAbsListView.getLastVisiblePosition() + 1 < TradeQuery.e(this.a).b())) {
        TradeQuery.a(this.a, false);
      }
      if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (TradeQuery.f(this.a)))
      {
        if (!o.m()) {
          break label82;
        }
        TradeQuery.b(this.a, false);
      }
    }
    return;
    label82:
    TradeQuery.c(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */