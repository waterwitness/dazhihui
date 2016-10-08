package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class ct
  implements View.OnClickListener
{
  public ct(PayActivity paramPayActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, HomeActivity.class);
    paramView.addFlags(67108864);
    this.a.a().changeSubActivity(paramView);
    ef.a().b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */