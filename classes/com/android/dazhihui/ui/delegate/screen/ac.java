package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ac
  implements DialogInterface.OnClickListener
{
  ac(DelegateBaseActivity paramDelegateBaseActivity, boolean paramBoolean) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a) {
      this.b.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */