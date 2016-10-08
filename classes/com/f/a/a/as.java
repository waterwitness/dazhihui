package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.AccountActivity;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;

public class as
  implements View.OnClickListener
{
  public as(AccountActivity paramAccountActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, BankCardInfoActivity.class);
    paramView.addFlags(67108864);
    paramView.putExtra("isBind", true);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */