package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;

class jy
  extends Handler
{
  jy(ju paramju) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 111) {
      ju.e(this.a).setVisibility(0);
    }
    do
    {
      return;
      if (paramMessage.what == 333)
      {
        this.a.a(2);
        return;
      }
    } while (paramMessage.what != 222);
    ju.f(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */