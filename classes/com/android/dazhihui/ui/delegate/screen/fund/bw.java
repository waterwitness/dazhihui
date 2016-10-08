package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bw
  implements DialogInterface.OnClickListener
{
  bw(FundTransfer paramFundTransfer) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FundTransfer.c(this.a, "1");
    FundTransfer.k(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */