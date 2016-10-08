package com.android.dazhihui.ui.screen.moneybox;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;

class ac
  implements View.OnClickListener
{
  ac(FundSubscription paramFundSubscription, int paramInt, ah paramah) {}
  
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
        this.c.d();
        this.c.n.setText("");
      }
      catch (Exception paramView)
      {
        for (;;)
        {
          paramView.printStackTrace();
          this.c.a(this.c, "提示", "申购数据出错！", "确定", 1);
        }
      }
      FundSubscription.b(this.c, ae.h[ae.i].b[ae.j][5]);
      continue;
      this.c.i.setText("");
      this.c.j.setText("");
      this.c.b();
      continue;
      this.c.g.sendEmptyMessage(1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */