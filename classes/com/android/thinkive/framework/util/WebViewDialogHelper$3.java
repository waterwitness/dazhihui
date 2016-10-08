package com.android.thinkive.framework.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

class WebViewDialogHelper$3
  implements DialogInterface.OnKeyListener
{
  WebViewDialogHelper$3(WebViewDialogHelper paramWebViewDialogHelper, WebViewDialogHelper.Result paramResult) {}
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 4)
    {
      this.val$result.gotResult(true, null);
      bool = false;
    }
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\WebViewDialogHelper$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */