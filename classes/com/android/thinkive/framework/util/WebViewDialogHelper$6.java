package com.android.thinkive.framework.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class WebViewDialogHelper$6
  implements DialogInterface.OnCancelListener
{
  WebViewDialogHelper$6(WebViewDialogHelper paramWebViewDialogHelper, WebViewDialogHelper.Result paramResult) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.val$result.gotResult(false, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\WebViewDialogHelper$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */