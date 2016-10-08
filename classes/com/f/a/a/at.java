package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.AccountActivity;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class at
  implements View.OnClickListener
{
  public at(AccountActivity paramAccountActivity) {}
  
  public void onClick(View paramView)
  {
    z.a("AccountActivity", "back to pay");
    paramView = new Intent(this.a, PayActivity.class);
    paramView.addFlags(67108864);
    paramView.putExtra("isAcount", true);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */