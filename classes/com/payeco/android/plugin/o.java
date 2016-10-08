package com.payeco.android.plugin;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class o
  implements DialogInterface.OnClickListener
{
  o(PayecoPluginApplication paramPayecoPluginApplication, Context paramContext, Intent paramIntent) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    PayecoPluginApplication.a(this.X, this.Y, this.Z);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */