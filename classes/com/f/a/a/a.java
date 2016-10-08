package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.AboutActivity;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;

public class a
  implements View.OnClickListener
{
  public a(AboutActivity paramAboutActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, HomeActivity.class);
    this.a.a().changeSubActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */