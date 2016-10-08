package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class cw
  implements DialogInterface.OnClickListener
{
  public cw(PayActivity paramPayActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent(this.a, BankCardInfoActivity.class);
    paramDialogInterface.setFlags(67108864);
    paramDialogInterface.putExtra("isQuickPayBind", true);
    this.a.a().changeSubActivity(paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */