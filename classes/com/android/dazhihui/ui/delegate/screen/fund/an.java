package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class an
  implements View.OnClickListener
{
  an(FundEntrust paramFundEntrust) {}
  
  public void onClick(View paramView)
  {
    paramView = FundEntrust.j(this.a).getText().toString();
    String str = FundEntrust.k(this.a).getText().toString();
    if ((paramView.length() == 0) || (str.length() == 0))
    {
      this.a.b(0);
      return;
    }
    if (paramView.length() != 6)
    {
      this.a.b(1);
      return;
    }
    if (FundEntrust.l(this.a) == 0) {
      str = String.format(this.a.getString(2131165484), new Object[] { FundEntrust.j(this.a).getText().toString(), FundEntrust.c(this.a).getText().toString(), FundEntrust.k(this.a).getText().toString() });
    }
    for (paramView = "认购提示";; paramView = "申购提示")
    {
      new AlertDialog.Builder(this.a).setTitle(paramView).setMessage(str).setPositiveButton("确定", new ap(this)).setNegativeButton("取消", new ao(this)).show();
      return;
      str = String.format(this.a.getString(2131165485), new Object[] { FundEntrust.j(this.a).getText().toString(), FundEntrust.c(this.a).getText().toString(), FundEntrust.k(this.a).getText().toString() });
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */