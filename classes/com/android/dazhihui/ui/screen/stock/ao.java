package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

class ao
  implements DialogInterface.OnKeyListener
{
  ao(BulletScreen paramBulletScreen) {}
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 0) && (paramInt == 84))
    {
      if (paramDialogInterface != null) {
        paramDialogInterface.dismiss();
      }
      BulletScreen.a(this.a, false);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */