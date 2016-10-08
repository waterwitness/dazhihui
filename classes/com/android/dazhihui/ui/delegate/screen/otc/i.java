package com.android.dazhihui.ui.delegate.screen.otc;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.android.dazhihui.ui.screen.stock.TipActivity;

class i
  implements DialogInterface.OnClickListener
{
  i(OtcEntrust paramOtcEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Bundle();
    paramDialogInterface.putInt("type", 6);
    paramDialogInterface.putString("cid", OtcEntrust.l(this.a));
    paramDialogInterface.putString("cname", OtcEntrust.m(this.a));
    paramDialogInterface.putBoolean("otc", true);
    this.a.startActivity(TipActivity.class, paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */