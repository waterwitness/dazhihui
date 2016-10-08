package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.TextView;
import com.android.dazhihui.dzh.dzh;

class bc
  implements DialogInterface.OnClickListener
{
  bc(CrashErrorActivity paramCrashErrorActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (TextView)this.a.a.findViewById(16908299);
    ((ClipboardManager)this.a.getSystemService("clipboard")).setText(paramDialogInterface.getText());
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(this.a, dzh.class);
    this.a.startActivity(paramDialogInterface);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */