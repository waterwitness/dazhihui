package com.android.dazhihui.ui.widget;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.adv.AdvertUpPullLayout;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhLoading;

class kq
  implements Runnable
{
  kq(SelfStockRefreshLayout paramSelfStockRefreshLayout) {}
  
  public void run()
  {
    int j = SelfStockRefreshLayout.a(this.a);
    int k = SelfStockRefreshLayout.b(this.a);
    if (SelfStockRefreshLayout.c(this.a).getVisibility() == 0) {}
    for (int i = 1;; i = 0)
    {
      SelfStockRefreshLayout.d(this.a).b();
      SelfStockRefreshLayout.d(this.a).a(0);
      SelfStockRefreshLayout.c(this.a).setVisibility(8);
      SelfStockRefreshLayout.e(this.a).findViewById(2131560228).setVisibility(0);
      SelfStockRefreshLayout.e(this.a).findViewById(2131560229).setVisibility(8);
      SelfStockRefreshLayout.e(this.a).setVisibility(8);
      SelfStockRefreshLayout.c(this.a).offsetTopAndBottom(-SelfStockRefreshLayout.c(this.a).getTop() - SelfStockRefreshLayout.f(this.a));
      SelfStockRefreshLayout.g(this.a).offsetTopAndBottom(-SelfStockRefreshLayout.g(this.a).getTop());
      SelfStockRefreshLayout.e(this.a).offsetTopAndBottom(SelfStockRefreshLayout.h(this.a) - SelfStockRefreshLayout.e(this.a).getBottom() + SelfStockRefreshLayout.i(this.a));
      SelfStockRefreshLayout.k(this.a).setText(SelfStockRefreshLayout.j(this.a)[0]);
      SelfStockRefreshLayout.m(this.a).setText(SelfStockRefreshLayout.l(this.a)[0]);
      SelfStockRefreshLayout.a(this.a, 0);
      SelfStockRefreshLayout.b(this.a, 0);
      this.a.invalidate();
      if ((k == 7) && (i != 0) && (SelfStockRefreshLayout.n(this.a) != null) && (Math.abs(j) >= AdvertUpPullLayout.a))
      {
        SelfStockRefreshLayout.n(this.a).a();
        Log.i("GUH", "下拉刷新后触发更新下拉内容，会切换下条资讯");
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */