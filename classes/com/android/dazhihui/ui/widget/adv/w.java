package com.android.dazhihui.ui.widget.adv;

import android.os.Handler;
import android.os.Message;

class w
  extends Handler
{
  w(GifView paramGifView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 100)
    {
      this.a.invalidate();
      return;
    }
    this.a.requestLayout();
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */