package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class cg
  implements b
{
  cg(bs parambs) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (bs.f(this.a) != null) {
      bs.f(this.a).b();
    }
    this.a.loadMoreData();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */