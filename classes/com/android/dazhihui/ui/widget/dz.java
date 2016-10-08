package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class dz
  extends Handler
{
  dz(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == HotVideoViewFlow.b) {
      this.a.d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */