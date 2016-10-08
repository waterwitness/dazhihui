package com.f.a.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;

public class bj
  implements View.OnClickListener
{
  public bj(HomeActivity paramHomeActivity) {}
  
  public void onClick(View paramView)
  {
    bs.a(HomeActivity.c(this.a).getText().toString(), "", 6, this.a, this.a, HomeActivity.d(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */