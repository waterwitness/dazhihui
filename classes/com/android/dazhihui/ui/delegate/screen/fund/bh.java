package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class bh
  implements View.OnClickListener
{
  bh(FundMutualAIPOpen paramFundMutualAIPOpen) {}
  
  public void onClick(View paramView)
  {
    paramView = FundMutualAIPOpen.c(this.a).getText().toString();
    String str = FundMutualAIPOpen.d(this.a).getText().toString();
    if ((paramView.length() == 0) || (str.length() == 0))
    {
      this.a.c("基金代码和定投金额都必须填写");
      return;
    }
    if (paramView.length() < 6)
    {
      this.a.c("基金代码必须为6位数");
      return;
    }
    FundMutualAIPOpen.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */