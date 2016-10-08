package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bd
  implements DialogInterface.OnClickListener
{
  bd(FundMutualAIPOpen paramFundMutualAIPOpen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FundMutualAIPOpen.a(this.a, "1");
    FundMutualAIPOpen.k(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */