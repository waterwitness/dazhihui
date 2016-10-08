package com.android.thinkive.framework.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.thinkive.framework.view.RoundedCornerTextView;

class DigitalKeyboard$1
  implements View.OnTouchListener
{
  DigitalKeyboard$1(DigitalKeyboard paramDigitalKeyboard) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      DigitalKeyboard.access$0(this.this$0, (RoundedCornerTextView)paramView, true);
    }
    for (;;)
    {
      if (1 == paramMotionEvent.getAction()) {
        this.this$0.onClick(paramView);
      }
      return true;
      if (2 != paramMotionEvent.getAction()) {
        DigitalKeyboard.access$0(this.this$0, (RoundedCornerTextView)paramView, false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\DigitalKeyboard$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */