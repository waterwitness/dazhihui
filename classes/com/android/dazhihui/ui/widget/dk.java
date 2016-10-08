package com.android.dazhihui.ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class dk
  implements View.OnTouchListener
{
  dk(EmojiInputView paramEmojiInputView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      this.a.setBbsMenuGroupStatus(2);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */