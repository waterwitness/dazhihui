package com.android.dazhihui.ui.screen.moneybox;

import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.screen.BaseActivity;

class d
  implements i
{
  d(FundHome paramFundHome, BaseActivity paramBaseActivity) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    paramh = ((g)paramj).a();
    if (paramh != null)
    {
      paramj = new String(paramh);
      paramh = com.android.dazhihui.c.a.d.a();
      paramj = ae.a(paramj, paramh, this.a);
      if (paramj != null) {
        paramh.a("FUNDSJSON", paramj);
      }
      paramh.g();
      this.b.a();
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */