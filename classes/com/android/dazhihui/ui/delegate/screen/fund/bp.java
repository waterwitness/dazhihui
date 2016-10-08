package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.ui.delegate.screen.xc.trade.DailyEarningsCanYu;

class bp
  implements DialogInterface.OnClickListener
{
  bp(FundOpenForm paramFundOpenForm) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (FundOpenForm.d(this.a)) {
      com.android.dazhihui.ui.delegate.screen.otc.OtcEntrust.f = true;
    }
    if (FundOpenForm.e(this.a)) {
      com.android.dazhihui.ui.delegate.screen.setplan.SetPlanEntrust.f = true;
    }
    if (FundOpenForm.f(this.a))
    {
      paramDialogInterface = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("kaihu", "success");
      paramDialogInterface.putExtras(localBundle);
      paramDialogInterface.setClass(this.a, DailyEarningsCanYu.class);
      this.a.startActivity(paramDialogInterface);
    }
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */