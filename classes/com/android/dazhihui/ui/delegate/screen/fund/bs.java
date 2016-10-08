package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class bs
  implements View.OnClickListener
{
  bs(FundTransfer paramFundTransfer) {}
  
  public void onClick(View paramView)
  {
    paramView = FundTransfer.h(this.a).getText().toString();
    String str1 = FundTransfer.i(this.a).getText().toString();
    String str2 = FundTransfer.j(this.a).getText().toString();
    if (paramView.length() == 0)
    {
      this.a.b(0);
      return;
    }
    if (paramView.length() != 6)
    {
      this.a.b(1);
      return;
    }
    if (str1.length() == 0)
    {
      this.a.b(2);
      return;
    }
    if (str1.length() != 6)
    {
      this.a.b(3);
      return;
    }
    if (str2.length() == 0)
    {
      this.a.b(4);
      return;
    }
    paramView = String.format(this.a.getString(2131165486), new Object[] { FundTransfer.h(this.a).getText().toString(), FundTransfer.d(this.a).getText().toString(), FundTransfer.i(this.a).getText().toString(), FundTransfer.g(this.a).getText().toString(), FundTransfer.j(this.a).getText().toString() });
    new AlertDialog.Builder(this.a).setTitle("基金转换提示").setMessage(paramView).setPositiveButton("确认", new bu(this)).setNegativeButton("取消", new bt(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */