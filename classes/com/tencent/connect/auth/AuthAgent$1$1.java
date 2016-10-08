package com.tencent.connect.auth;

import android.app.Activity;

class AuthAgent$1$1
  implements Runnable
{
  AuthAgent$1$1(AuthAgent.1 param1, Activity paramActivity) {}
  
  public void run()
  {
    AuthDialog localAuthDialog = new AuthDialog(this.a, "action_login", this.b.a, this.b.b, AuthAgent.f(this.b.c));
    if ((this.a != null) && (!this.a.isFinishing())) {
      localAuthDialog.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */