package com.android.dazhihui.ui.screen.stock;

import android.widget.TextView;

class jo
  implements Runnable
{
  jo(MobileVerifyScreen paramMobileVerifyScreen) {}
  
  public void run()
  {
    MobileVerifyScreen.a(this.a);
    MobileVerifyScreen.c(this.a).setText("等待重试(" + MobileVerifyScreen.b(this.a) + ")");
    if (MobileVerifyScreen.b(this.a) != 0)
    {
      MobileVerifyScreen.c(this.a).postDelayed(this, 1000L);
      return;
    }
    MobileVerifyScreen.c(this.a).setText("获取验证码");
    MobileVerifyScreen.c(this.a).setClickable(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */