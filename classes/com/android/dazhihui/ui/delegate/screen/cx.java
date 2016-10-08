package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.widget.TextView;

class cx
  implements Runnable
{
  cx(MobileLoginHS paramMobileLoginHS) {}
  
  public void run()
  {
    if (MobileLoginHS.c(this.a) > 0)
    {
      MobileLoginHS.d(this.a).setBackgroundResource(2130837590);
      MobileLoginHS.d(this.a).setTextColor(-5658199);
      MobileLoginHS.d(this.a).setText("请稍候" + MobileLoginHS.c(this.a) / 1000 + "'");
      MobileLoginHS.d(this.a).setEnabled(false);
      MobileLoginHS.f(this.a).postDelayed(this, MobileLoginHS.e(this.a));
      MobileLoginHS.a(this.a, MobileLoginHS.c(this.a) - MobileLoginHS.e(this.a));
      return;
    }
    this.a.f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */