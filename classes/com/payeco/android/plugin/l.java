package com.payeco.android.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class l
  implements DialogInterface.OnClickListener
{
  l(PayecoPayResultActivity paramPayecoPayResultActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    PayecoPayResultActivity.d(this.R);
    PayecoPayResultActivity.e(this.R);
    PayecoPayResultActivity.f(this.R);
    PayecoPayResultActivity.g(this.R);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */