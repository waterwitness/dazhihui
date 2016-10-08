package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;

class ky
  implements c
{
  ky(ju paramju) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (ju.c(this.a) != null) {
      ju.c(this.a).a(true);
    }
    this.a.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */