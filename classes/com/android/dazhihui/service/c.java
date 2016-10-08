package com.android.dazhihui.service;

import android.os.Message;

class c
  implements Runnable
{
  c(DzhPushService paramDzhPushService) {}
  
  public void run()
  {
    Message localMessage = this.a.S.obtainMessage();
    localMessage.what = DzhPushService.l;
    this.a.S.sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */