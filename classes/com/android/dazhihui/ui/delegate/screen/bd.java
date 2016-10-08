package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bd
  implements DialogInterface.OnClickListener
{
  bd(EntrustNew paramEntrustNew) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    EntrustNew.f(this.a, "0");
    EntrustNew.g(this.a, "1");
    this.a.f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */