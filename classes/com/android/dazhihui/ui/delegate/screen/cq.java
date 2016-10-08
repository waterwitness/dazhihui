package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class cq
  implements View.OnClickListener
{
  cq(MobileLogin paramMobileLogin) {}
  
  public void onClick(View paramView)
  {
    if (!MobileLogin.c(this.a)) {
      Toast.makeText(this.a.getApplicationContext(), "网络不给力请重试！", 1).show();
    }
    this.a.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */