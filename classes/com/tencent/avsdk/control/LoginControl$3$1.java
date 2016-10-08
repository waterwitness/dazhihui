package com.tencent.avsdk.control;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.avsdk.activity.IlvbAccountRechargeScreen;

class LoginControl$3$1
  implements DialogInterface.OnClickListener
{
  LoginControl$3$1(LoginControl.3 param3) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LoginControl.access$100(this.this$1.this$0).startActivityForResult(new Intent(LoginControl.access$100(this.this$1.this$0), IlvbAccountRechargeScreen.class), 100);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$3$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */