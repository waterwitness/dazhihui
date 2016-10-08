package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;
import com.unionpay.upomp.lthj.plugin.ui.UserProtocolActivity;

public class af
  implements View.OnClickListener
{
  public af(PayActivity paramPayActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, UserProtocolActivity.class);
    paramView.addFlags(67108864);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */