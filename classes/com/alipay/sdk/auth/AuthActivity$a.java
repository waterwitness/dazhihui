package com.alipay.sdk.auth;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

final class AuthActivity$a
  extends WebChromeClient
{
  private AuthActivity$a(AuthActivity paramAuthActivity) {}
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str2 = paramConsoleMessage.message();
    if (TextUtils.isEmpty(str2)) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    String str1 = null;
    if (str2.startsWith("h5container.message: ")) {
      str1 = str2.replaceFirst("h5container.message: ", "");
    }
    if (TextUtils.isEmpty(str1)) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    AuthActivity.b(this.a, str1);
    return super.onConsoleMessage(paramConsoleMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\AuthActivity$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */