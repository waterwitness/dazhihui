package com.android.dazhihui.ui.screen.moneybox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.w;

class g
  implements View.OnClickListener
{
  g(FundHome paramFundHome) {}
  
  public void onClick(View paramView)
  {
    if (paramView == this.a.a) {
      if (ae.d != null)
      {
        paramView = new Bundle();
        paramView.putString("nexturl", ae.d);
        Intent localIntent = new Intent();
        localIntent.setClass(this.a, BrowserActivity.class);
        localIntent.putExtras(paramView);
        this.a.startActivity(localIntent);
      }
    }
    do
    {
      return;
      if (paramView == this.a.e)
      {
        if (o.r()) {
          this.a.a(FundRedemption.class);
        }
        for (;;)
        {
          n.a("", 1167);
          return;
          if (this.a.a(2))
          {
            ae.l = 2;
            o.a(this.a);
          }
        }
      }
    } while (paramView != this.a.f);
    if (w.a().l()) {
      this.a.b();
    }
    for (;;)
    {
      n.a("", 1166);
      return;
      paramView = new Intent(this.a, LoginMainScreen.class);
      paramView.putExtra("screenType", 1);
      this.a.startActivity(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */