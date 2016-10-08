package com.android.dazhihui.ui.delegate.screen.otc;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class g
  implements DialogInterface.OnClickListener
{
  g(OtcEntrust paramOtcEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (OtcEntrust.a(this.a) == 16387)
    {
      OtcEntrust.b(this.a);
      return;
    }
    OtcEntrust.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */