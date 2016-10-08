package com.android.thinkive.framework.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

class WebViewDialogHelper$7
  implements DialogInterface.OnKeyListener
{
  WebViewDialogHelper$7(WebViewDialogHelper paramWebViewDialogHelper, WebViewDialogHelper.Result paramResult) {}
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      this.val$result.gotResult(false, null);
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\WebViewDialogHelper$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */