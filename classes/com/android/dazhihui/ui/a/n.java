package com.android.dazhihui.ui.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class n
  extends Handler
{
  n(m paramm, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    case 1: 
    default: 
      return;
    case 0: 
      m.a(this.a).removeMessages(0);
      m.a(this.a).sendEmptyMessageDelayed(0, 1200000L);
      this.a.G();
      return;
    }
    this.a.F();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */