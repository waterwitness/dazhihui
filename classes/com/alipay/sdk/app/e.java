package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.SslErrorHandler;

final class e
  implements DialogInterface.OnClickListener
{
  e(d paramd) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    c.a(this.a.b, true);
    this.a.a.proceed();
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\app\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */