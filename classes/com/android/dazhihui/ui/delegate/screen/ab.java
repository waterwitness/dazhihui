package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ab
  implements DialogInterface.OnCancelListener
{
  ab(DelegateBaseActivity paramDelegateBaseActivity, boolean paramBoolean) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.a) {
      this.b.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */