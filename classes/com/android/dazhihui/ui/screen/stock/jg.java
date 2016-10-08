package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class jg
  implements DialogInterface.OnClickListener
{
  jg(MessageWarnScreen paramMessageWarnScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (MessageWarnScreen.a(this.a) != null)
    {
      this.a.a(MessageWarnScreen.a(this.a));
      MessageWarnScreen.a(this.a, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */