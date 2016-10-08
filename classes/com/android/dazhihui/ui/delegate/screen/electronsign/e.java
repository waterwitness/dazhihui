package com.android.dazhihui.ui.delegate.screen.electronsign;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashSet;

class e
  implements DialogInterface.OnClickListener
{
  e(CashBaoElectronSign paramCashBaoElectronSign) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (CashBaoElectronSign.d(this.a).isEmpty())
    {
      this.a.c("请选择帐号");
      return;
    }
    CashBaoElectronSign.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\electronsign\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */