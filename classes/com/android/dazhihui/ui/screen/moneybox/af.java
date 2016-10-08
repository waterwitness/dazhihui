package com.android.dazhihui.ui.screen.moneybox;

import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.a.d;

final class af
  implements i
{
  public void handleResponse(h paramh, j paramj)
  {
    paramh = ((g)paramj).a();
    if (paramh != null)
    {
      paramj = d.a();
      paramj.a("FUNDSJSON_IMG", paramh);
      paramj.g();
      ae.e = true;
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */