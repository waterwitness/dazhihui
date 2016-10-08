package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;
import android.view.View;

class ko
  extends Handler
{
  ko(km paramkm) {}
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (km.c(this.a) != null) && (this.a.b != null) && (this.a.b.isPressed()))
    {
      km.c(this.a).a();
      this.a.c.sendEmptyMessageDelayed(1, 100L);
      return;
    }
    this.a.c.removeMessages(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */