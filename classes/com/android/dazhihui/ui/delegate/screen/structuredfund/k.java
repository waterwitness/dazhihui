package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k
  implements DialogInterface.OnClickListener
{
  k(i parami) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(i.C(this.a));
    i.b(this.a, String.valueOf(paramInt + 1));
    i.c(this.a, "1");
    i.B(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */