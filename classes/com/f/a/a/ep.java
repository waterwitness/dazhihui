package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;
import com.unionpay.upomp.lthj.plugin.ui.SupportCardActivity;

public class ep
  implements View.OnClickListener
{
  public ep(SupportCardActivity paramSupportCardActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, HomeActivity.class);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */