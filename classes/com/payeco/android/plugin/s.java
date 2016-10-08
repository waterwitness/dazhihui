package com.payeco.android.plugin;

import android.os.Handler;
import android.os.Message;

final class s
  extends Handler
{
  public s(PayecoPluginLoadingActivity paramPayecoPluginLoadingActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      PayecoPluginLoadingActivity.a(this.ac);
      return;
    }
    PayecoPluginLoadingActivity.b(this.ac);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */