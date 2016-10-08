package org.apache.cordova;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.webkit.JsPromptResult;
import android.widget.EditText;

class CordovaChromeClient$8
  implements DialogInterface.OnClickListener
{
  CordovaChromeClient$8(CordovaChromeClient paramCordovaChromeClient, EditText paramEditText, JsPromptResult paramJsPromptResult) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.val$input.getText().toString();
    this.val$res.confirm(paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaChromeClient$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */