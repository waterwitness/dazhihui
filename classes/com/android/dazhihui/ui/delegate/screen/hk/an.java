package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Handler;
import android.os.Message;

class an
  extends Handler
{
  an(HKEntrust paramHKEntrust) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      this.a.d();
      return;
    }
    this.a.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */