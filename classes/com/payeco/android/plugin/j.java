package com.payeco.android.plugin;

import android.os.Handler;
import android.os.Message;

final class j
  extends Handler
{
  j(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      PayecoOrderDetailActivity.a(this.J);
      return;
    case 1: 
      PayecoOrderDetailActivity.b(this.J);
      return;
    case 2: 
      PayecoOrderDetailActivity.c(this.J);
      return;
    case 3: 
      PayecoOrderDetailActivity.c(this.J);
      return;
    }
    PayecoOrderDetailActivity.d(this.J);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */