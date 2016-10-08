package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class bv
  implements DialogInterface.OnClickListener
{
  bv(HKSetting paramHKSetting, String[] paramArrayOfString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    HKSetting.b(this.b).setText(this.a[paramInt]);
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */