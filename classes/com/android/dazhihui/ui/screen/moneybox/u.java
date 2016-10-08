package com.android.dazhihui.ui.screen.moneybox;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class u
  implements View.OnClickListener
{
  u(FundRedemption paramFundRedemption, int paramInt, ah paramah) {}
  
  public void onClick(View paramView)
  {
    switch (this.a)
    {
    }
    for (;;)
    {
      this.b.dismiss();
      return;
      try
      {
        this.c.c();
        this.c.i.setText("");
      }
      catch (Exception paramView)
      {
        for (;;)
        {
          paramView.printStackTrace();
          this.c.a(this.c, "提示", "赎回数据出错！", "确定", 1);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */