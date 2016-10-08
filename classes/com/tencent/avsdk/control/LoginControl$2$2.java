package com.tencent.avsdk.control;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;

class LoginControl$2$2
  implements DialogInterface.OnClickListener
{
  LoginControl$2$2(LoginControl.2 param2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(LoginControl.access$100(this.this$1.this$0), LoginMainScreen.class);
    paramDialogInterface.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    LoginControl.access$100(this.this$1.this$0).startActivity(paramDialogInterface);
    LoginControl.access$000(this.this$1.this$0).destroy();
    LoginControl.access$100(this.this$1.this$0).finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$2$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */