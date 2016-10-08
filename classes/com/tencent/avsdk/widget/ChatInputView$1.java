package com.tencent.avsdk.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class ChatInputView$1
  implements View.OnKeyListener
{
  ChatInputView$1(ChatInputView paramChatInputView) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 0) && (paramInt == 66))
    {
      this.this$0.onSend();
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ChatInputView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */