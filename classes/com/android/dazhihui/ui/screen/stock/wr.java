package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.ui.delegate.screen.fund.FundCompanyTable;
import com.android.dazhihui.ui.delegate.screen.fund.FundOpenForm;

class wr
  implements DialogInterface.OnClickListener
{
  wr(TipActivity paramTipActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent();
    Bundle localBundle;
    if ((TipActivity.b(this.a)) || (TipActivity.c(this.a)))
    {
      localBundle = this.a.getIntent().getExtras();
      paramDialogInterface.setClass(this.a, FundOpenForm.class);
      paramDialogInterface.putExtras(localBundle);
      this.a.startActivity(paramDialogInterface);
    }
    for (;;)
    {
      this.a.finish();
      return;
      if (TipActivity.d(this.a))
      {
        localBundle = this.a.getIntent().getExtras();
        localBundle.putString("cname", "深市TA");
        localBundle.putBoolean("isXcPt", true);
        paramDialogInterface.setClass(this.a, FundOpenForm.class);
        paramDialogInterface.putExtras(localBundle);
        this.a.startActivity(paramDialogInterface);
      }
      else if (TipActivity.e(this.a))
      {
        localBundle = this.a.getIntent().getExtras();
        localBundle.putString("cid", TipActivity.f(this.a));
        localBundle.putString("cname", TipActivity.g(this.a));
        paramDialogInterface.setClass(this.a, FundOpenForm.class);
        paramDialogInterface.putExtras(localBundle);
        this.a.startActivity(paramDialogInterface);
      }
      else
      {
        paramDialogInterface.setClass(this.a, FundCompanyTable.class);
        this.a.startActivity(paramDialogInterface);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */