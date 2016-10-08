package com.android.dazhihui.ui.screen.moneybox;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

class y
  implements View.OnClickListener
{
  y(FundSubscription paramFundSubscription) {}
  
  public void onClick(View paramView)
  {
    if (paramView == this.a.i)
    {
      this.a.i.setBackgroundResource(2130838442);
      this.a.j.setBackgroundResource(2130838443);
      FundSubscription.a(this.a, FundSubscription.b(this.a));
    }
    while (paramView != this.a.j) {
      return;
    }
    this.a.i.setBackgroundResource(2130838443);
    this.a.j.setBackgroundResource(2130838442);
    FundSubscription.a(this.a, FundSubscription.b(this.a) / 2.0D);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */