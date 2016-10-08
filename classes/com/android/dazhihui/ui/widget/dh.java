package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;

class dh
  extends Handler
{
  dh(EmojiInputView paramEmojiInputView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 111) {
      EmojiInputView.a(this.a).setVisibility(0);
    }
    do
    {
      return;
      if (paramMessage.what == 333)
      {
        this.a.setBbsMenuGroupStatus(2);
        return;
      }
    } while (paramMessage.what != 222);
    EmojiInputView.b(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */