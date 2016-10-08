package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ap
  implements DialogInterface.OnClickListener
{
  ap(BulletScreen paramBulletScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null) {
      paramDialogInterface.dismiss();
    }
    BulletScreen.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */