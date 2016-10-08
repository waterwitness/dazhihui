package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.screen.stock.MainScreen;

class eg
  extends Handler
{
  eg(dy paramdy) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 222) {
      ((MainScreen)this.a.getActivity()).a(1073741824, null, 0, 0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */