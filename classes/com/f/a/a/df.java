package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class df
  implements View.OnClickListener
{
  public df(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public void onClick(View paramView)
  {
    if (BankCardInfoActivity.a(this.a))
    {
      paramView = new Intent(this.a, PayActivity.class);
      paramView.addFlags(67108864);
      paramView.putExtra("isAcount", true);
      this.a.a().changeSubActivity(paramView);
    }
    for (;;)
    {
      ef.a().b();
      return;
      BankCardInfoActivity.b(this.a);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */