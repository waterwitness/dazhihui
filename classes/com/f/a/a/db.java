package com.f.a.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;

public class db
  implements View.OnClickListener
{
  public db(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public void onClick(View paramView)
  {
    bs.a(BankCardInfoActivity.f(this.a).getText().toString(), "", 5, this.a, this.a, BankCardInfoActivity.e(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */