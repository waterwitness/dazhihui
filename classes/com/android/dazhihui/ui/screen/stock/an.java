package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class an
  implements DialogInterface.OnCancelListener
{
  an(BulletScreen paramBulletScreen) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (paramDialogInterface != null) {
      paramDialogInterface.dismiss();
    }
    BulletScreen.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */