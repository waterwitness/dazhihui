package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.widget.StickyScrollView;
import com.android.dazhihui.ui.widget.dzhrefresh.StickyRefreshScrollView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.n;

class tk
  implements n<StickyScrollView>
{
  tk(ti paramti) {}
  
  public void a(PullToRefreshBase<StickyScrollView> paramPullToRefreshBase)
  {
    if (ti.g(this.a) != null) {
      ti.g(this.a).d();
    }
    if (m.a().J() != null)
    {
      ti.h(this.a);
      return;
    }
    ti.i(this.a);
  }
  
  public void b(PullToRefreshBase<StickyScrollView> paramPullToRefreshBase)
  {
    if (ti.g(this.a) != null) {
      ti.g(this.a).d();
    }
    this.a.loadMoreData();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */