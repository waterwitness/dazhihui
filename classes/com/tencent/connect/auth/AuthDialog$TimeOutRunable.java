package com.tencent.connect.auth;

import com.tencent.open.a.f;
import com.tencent.tauth.UiError;

class AuthDialog$TimeOutRunable
  implements Runnable
{
  String a = "";
  
  public AuthDialog$TimeOutRunable(AuthDialog paramAuthDialog, String paramString)
  {
    this.a = paramString;
  }
  
  public void run()
  {
    f.a("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.a + " | mRetryUrl: " + AuthDialog.i(this.b));
    if (this.a.equals(AuthDialog.i(this.b)))
    {
      AuthDialog.f(this.b).onError(new UiError(9002, "请求页面超时，请稍后重试！", AuthDialog.i(this.b)));
      this.b.dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog$TimeOutRunable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */