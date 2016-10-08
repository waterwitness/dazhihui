package com.android.dazhihui.ui.delegate.screen.electronsign;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import java.util.HashSet;

class d
  implements DialogInterface.OnMultiChoiceClickListener
{
  d(CashBaoElectronSign paramCashBaoElectronSign, String[] paramArrayOfString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      CashBaoElectronSign.d(this.b).add(this.a[paramInt]);
      return;
    }
    CashBaoElectronSign.d(this.b).remove(this.a[paramInt]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\electronsign\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */