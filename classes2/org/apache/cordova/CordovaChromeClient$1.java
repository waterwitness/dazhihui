package org.apache.cordova;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

class CordovaChromeClient$1
  implements DialogInterface.OnClickListener
{
  CordovaChromeClient$1(CordovaChromeClient paramCordovaChromeClient, JsResult paramJsResult) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.val$result.confirm();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaChromeClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */