package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class db
  implements b
{
  db(cq paramcq) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (cq.c(this.a) != null) {
      cq.c(this.a).b();
    }
    this.a.loadMoreData();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */