package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bc
  implements DialogInterface.OnClickListener
{
  bc(FundMutualAIPOpen paramFundMutualAIPOpen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FundMutualAIPOpen.a(this.a, "0");
    FundMutualAIPOpen.j(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */