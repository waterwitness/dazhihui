package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.widget.TextView;

class cr
  implements Runnable
{
  cr(MobileLogin paramMobileLogin) {}
  
  public void run()
  {
    if (MobileLogin.d(this.a) > 0)
    {
      MobileLogin.e(this.a).setBackgroundResource(2130837590);
      MobileLogin.e(this.a).setTextColor(-5658199);
      MobileLogin.e(this.a).setText("请稍候" + MobileLogin.d(this.a) / 1000 + "'");
      MobileLogin.e(this.a).setEnabled(false);
      MobileLogin.g(this.a).postDelayed(this, MobileLogin.f(this.a));
      MobileLogin.a(this.a, MobileLogin.d(this.a) - MobileLogin.f(this.a));
      return;
    }
    this.a.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */