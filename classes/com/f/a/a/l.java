package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.SplashActivity;

public class l
  extends Handler
{
  public l(SplashActivity paramSplashActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    this.a.showInitDialog(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */