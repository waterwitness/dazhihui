package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.android.dazhihui.ui.delegate.screen.trade.AccountPass;

class bc
  implements DialogInterface.OnClickListener
{
  bc(bb parambb) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Bundle();
    paramDialogInterface.putInt("type", 4369);
    this.a.a(AccountPass.class, paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */