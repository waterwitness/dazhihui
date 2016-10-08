package com.android.dazhihui.ui.delegate.screen.xc.trade;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;
import java.util.ArrayList;

class s
  implements b
{
  s(DailyEarningDetail paramDailyEarningDetail) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (DailyEarningDetail.a(this.a) != null) {
      DailyEarningDetail.a(this.a).b();
    }
    if (this.a.b >= DailyEarningDetail.b(this.a).size())
    {
      DailyEarningDetail.a(this.a, true);
      DailyEarningDetail.a(this.a, DailyEarningDetail.b(this.a).size());
      this.a.a(true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */