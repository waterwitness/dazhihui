package com.alipay.sdk.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.SslErrorHandler;

final class g
  implements DialogInterface.OnClickListener
{
  g(f paramf) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AuthActivity.a(this.a.b.a, true);
    this.a.a.proceed();
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\auth\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */