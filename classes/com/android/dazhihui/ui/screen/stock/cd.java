package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;

class cd
  implements c
{
  cd(bs parambs) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (bs.f(this.a) != null) {
      bs.f(this.a).a(true);
    }
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */