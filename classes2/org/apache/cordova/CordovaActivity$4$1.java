package org.apache.cordova;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class CordovaActivity$4$1
  implements DialogInterface.OnClickListener
{
  CordovaActivity$4$1(CordovaActivity.4 param4, boolean paramBoolean, CordovaActivity paramCordovaActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    if (this.val$exit) {
      this.val$me.endActivity();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaActivity$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */