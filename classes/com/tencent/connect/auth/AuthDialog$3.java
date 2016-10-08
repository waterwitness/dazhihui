package com.tencent.connect.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.open.web.security.JniInterface;

class AuthDialog$3
  implements DialogInterface.OnDismissListener
{
  AuthDialog$3(AuthDialog paramAuthDialog) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    try
    {
      JniInterface.clearAllPWD();
      return;
    }
    catch (Exception paramDialogInterface) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */