package com.tencent.avsdk.control;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class LoginControl$1
  implements DialogInterface.OnClickListener
{
  LoginControl$1(LoginControl paramLoginControl) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LoginControl.access$000(this.this$0).destroy();
    LoginControl.access$100(this.this$0).finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */