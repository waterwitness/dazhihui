package com.android.dazhihui.ui.screen.moneybox;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.widget.EditText;
import java.util.ArrayList;

class s
  implements DialogInterface.OnClickListener
{
  s(FundRedemption paramFundRedemption) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    FundRedemption.a(this.a, paramInt);
    this.a.h.setText(FundRedemption.b(this.a)[paramInt]);
    FundRedemption.b(this.a, Double.parseDouble((String)this.a.t.get(paramInt)));
    this.a.g.sendEmptyMessage(0);
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */