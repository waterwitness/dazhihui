package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;

class jn
  implements br
{
  jn(MobileVerifyScreen paramMobileVerifyScreen, String paramString1, String paramString2) {}
  
  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Intent localIntent = new Intent(this.c, FingerprintLoginScreen.class);
      localIntent.putExtra("imei", paramString2);
      localIntent.putExtra("mac", paramString1);
      localIntent.putExtra("noskip", true);
      localIntent.putExtra("mobile", this.a);
      localIntent.putExtra("verify_code", this.b);
      this.c.startActivity(localIntent);
      return;
    }
    this.c.showShortToast("抱歉,你的设备不支持指纹登录!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */