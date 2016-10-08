package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.AccountActivity;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;

public class ci
  implements View.OnClickListener
{
  public ci(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, AccountActivity.class);
    paramView.addFlags(67108864);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */