package com.payeco.android.plugin;

import android.os.Handler;
import android.os.Message;

final class n
  extends Handler
{
  public n(PayecoPayResultActivity paramPayecoPayResultActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      PayecoPayResultActivity.a(this.R);
      return;
    }
    PayecoPayResultActivity.b(this.R);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */