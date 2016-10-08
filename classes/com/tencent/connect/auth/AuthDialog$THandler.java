package com.tencent.connect.auth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AuthDialog$THandler
  extends Handler
{
  private AuthDialog.OnTimeListener b;
  
  public AuthDialog$THandler(AuthDialog paramAuthDialog, AuthDialog.OnTimeListener paramOnTimeListener, Looper paramLooper)
  {
    super(paramLooper);
    this.b = paramOnTimeListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      AuthDialog.OnTimeListener.a(this.b, (String)paramMessage.obj);
      return;
    case 2: 
      this.b.onCancel();
      return;
    }
    AuthDialog.a(AuthDialog.a(this.a), (String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog$THandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */