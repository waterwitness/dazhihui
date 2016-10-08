package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.android.dazhihui.dzh.dzh;

class bb
  implements DialogInterface.OnClickListener
{
  bb(CrashErrorActivity paramCrashErrorActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(this.a, dzh.class);
    this.a.startActivity(paramDialogInterface);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */