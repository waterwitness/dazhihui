package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class v
  implements View.OnClickListener
{
  v(FundAtone paramFundAtone) {}
  
  public void onClick(View paramView)
  {
    paramView = FundAtone.e(this.a).getText().toString();
    String str = FundAtone.f(this.a).getText().toString();
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
    paramView = String.format(this.a.getString(2131165481), new Object[] { FundAtone.e(this.a).getText().toString(), FundAtone.b(this.a).getText().toString(), FundAtone.f(this.a).getText().toString() });
    new AlertDialog.Builder(this.a).setTitle("赎回提示").setMessage(paramView).setPositiveButton("确认", new x(this)).setNegativeButton("取消", new w(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */