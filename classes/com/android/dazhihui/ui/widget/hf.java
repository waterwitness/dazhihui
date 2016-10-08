package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class hf
  extends Handler
{
  hf(MarqueeView paramMarqueeView) {}
  
  public void handleMessage(Message paramMessage)
  {
    MarqueeView.a(this.a);
    sendEmptyMessageDelayed(0, 10L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */