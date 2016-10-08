package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class vz
  implements DialogInterface.OnClickListener
{
  vz(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SystemSetingScreen.a();
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */