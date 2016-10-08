package com.android.dazhihui.ui.screen.moneybox;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import java.util.ArrayList;

class q
  implements View.OnClickListener
{
  q(FundRedemption paramFundRedemption) {}
  
  public void onClick(View paramView)
  {
    if (paramView == this.a.m)
    {
      this.a.m.setBackgroundResource(2130838442);
      this.a.n.setBackgroundResource(2130838443);
      if ((this.a.t != null) && (this.a.t.size() > 0)) {
        FundRedemption.a(this.a, Double.parseDouble((String)this.a.t.get(FundRedemption.a(this.a))));
      }
    }
    do
    {
      do
      {
        return;
      } while (paramView != this.a.n);
      this.a.m.setBackgroundResource(2130838443);
      this.a.n.setBackgroundResource(2130838442);
    } while ((this.a.t == null) || (this.a.t.size() <= 0));
    FundRedemption.a(this.a, Double.parseDouble((String)this.a.t.get(FundRedemption.a(this.a))) / 2.0D);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */