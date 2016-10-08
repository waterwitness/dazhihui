package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;

class gr
  implements br
{
  gr(LoginMainScreen paramLoginMainScreen) {}
  
  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Intent localIntent = new Intent(this.a, FingerprintLoginScreen.class);
      localIntent.putExtra("imei", paramString2);
      localIntent.putExtra("mac", paramString1);
      localIntent.putExtra("noskip", true);
      this.a.startActivity(localIntent);
      return;
    }
    this.a.showShortToast("抱歉,你的设备不支持指纹登录!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */