package com.android.dazhihui.ui.delegate.screen.xc.trade;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;
import java.util.ArrayList;

class r
  implements c
{
  r(DailyEarningDetail paramDailyEarningDetail) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (DailyEarningDetail.a(this.a) != null) {
      DailyEarningDetail.a(this.a).a(true);
    }
    DailyEarningDetail.b(this.a).clear();
    DailyEarningDetail.a(this.a, false);
    this.a.a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */