package com.android.dazhihui.receiver;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class a
  extends Handler
{
  a(NetworkConnectivityReceiver paramNetworkConnectivityReceiver, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    NetworkConnectivityReceiver.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\receiver\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */