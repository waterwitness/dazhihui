package com.android.dazhihui.ui.delegate.screen.electronsign;

import android.view.View;
import android.view.View.OnClickListener;

class a
  implements View.OnClickListener
{
  a(CashBaoElectronSign paramCashBaoElectronSign) {}
  
  public void onClick(View paramView)
  {
    if (!CashBaoElectronSign.a(this.a))
    {
      this.a.c("\t\t请仔细阅读并接受相关条款");
      return;
    }
    CashBaoElectronSign.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\electronsign\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */