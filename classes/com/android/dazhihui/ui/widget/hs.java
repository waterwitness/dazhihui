package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class hs
  extends Handler
{
  hs(MinuteTradeVolumeView paramMinuteTradeVolumeView) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if ((paramMessage.what == 1) && (MinuteTradeVolumeView.a(this.a) != null)) {
      MinuteTradeVolumeView.a(this.a).a(-1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */