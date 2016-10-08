package com.android.dazhihui.ui.delegate.screen.setplan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.android.dazhihui.ui.screen.stock.TipActivity;

class k
  implements DialogInterface.OnClickListener
{
  k(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Bundle();
    paramDialogInterface.putInt("type", 6);
    paramDialogInterface.putString("cid", SetPlanEntrust.p(this.a));
    paramDialogInterface.putString("cname", SetPlanEntrust.q(this.a));
    paramDialogInterface.putBoolean("setPlan", true);
    this.a.startActivity(TipActivity.class, paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */