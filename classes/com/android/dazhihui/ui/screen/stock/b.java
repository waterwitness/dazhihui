package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

class b
  implements DialogInterface.OnClickListener
{
  b(AboutActivity paramAboutActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Bundle();
    paramDialogInterface.putInt("screenId", 2);
    paramDialogInterface.putString("title", this.a.getString(2131165551));
    this.a.startActivity(BulletScreen.class, paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */