package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ai
  implements View.OnClickListener
{
  ai(FundDividend paramFundDividend) {}
  
  public void onClick(View paramView)
  {
    paramView = FundDividend.b(this.a).getText().toString();
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
    paramView = String.format(this.a.getString(2131165482), new Object[] { FundDividend.b(this.a).getText().toString(), FundDividend.c(this.a).getText().toString(), FundDividend.d(this.a)[FundDividend.e(this.a).getSelectedItemPosition()] });
    new AlertDialog.Builder(this.a).setTitle("分红方式提示").setMessage(paramView).setPositiveButton("确认", new ak(this)).setNegativeButton("取消", new aj(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */