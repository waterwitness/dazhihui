package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class wz
  implements DialogInterface.OnClickListener
{
  wz(TipActivity paramTipActivity, int paramInt) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a == 5)
    {
      paramDialogInterface = new Bundle();
      Intent localIntent = new Intent();
      localIntent.setClass(this.b, MainScreen.class);
      localIntent.putExtras(paramDialogInterface);
      localIntent.setFlags(67108864);
      this.b.startActivity(localIntent);
    }
    for (;;)
    {
      this.b.finish();
      return;
      if ((this.a == 10) || (this.a == 11) || (this.a == 7) || (this.a == 25) || (this.a == 27) || (this.a != 33)) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */