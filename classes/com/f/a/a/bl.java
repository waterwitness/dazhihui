package com.f.a.a;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;
import com.unionpay.upomp.lthj.plugin.ui.SupportCardActivity;

public class bl
  implements View.OnClickListener
{
  public bl(HomeActivity paramHomeActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, SupportCardActivity.class);
    paramView.putExtra("tranType", "1");
    paramView.addFlags(67108864);
    this.a.a().changeSubActivity(paramView);
    ef.a().b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */