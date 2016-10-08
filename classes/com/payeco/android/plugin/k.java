package com.payeco.android.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class k
  implements DialogInterface.OnClickListener
{
  k(PayecoPayResultActivity paramPayecoPayResultActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    PayecoPayResultActivity.c(this.R);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */