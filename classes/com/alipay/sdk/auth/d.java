package com.alipay.sdk.auth;

import android.webkit.WebView;

final class d
  implements Runnable
{
  d(AuthActivity paramAuthActivity, String paramString) {}
  
  public final void run()
  {
    try
    {
      AuthActivity.h(this.b).loadUrl("javascript:" + this.a);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */