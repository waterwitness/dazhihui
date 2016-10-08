package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class ki
  extends Handler
{
  ki(ScrollButton paramScrollButton) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      this.a.invalidate();
      return;
    case 1: 
      ScrollButton.a(this.a, 0);
      return;
    }
    ScrollButton.a(this.a, 1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */