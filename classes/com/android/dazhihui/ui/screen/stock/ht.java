package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.CheckBox;

class ht
  implements DialogInterface.OnCancelListener
{
  ht(MainScreen paramMainScreen, CheckBox paramCheckBox) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    MainScreen.b(this.b, this.a.isChecked());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */