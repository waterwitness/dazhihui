package com.android.thinkive.framework.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;

class WebViewDialogHelper$8
  implements DialogInterface.OnClickListener
{
  WebViewDialogHelper$8(WebViewDialogHelper paramWebViewDialogHelper, EditText paramEditText, WebViewDialogHelper.Result paramResult) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.val$input.getText().toString();
    this.val$result.gotResult(true, paramDialogInterface);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\WebViewDialogHelper$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */