package com.android.thinkive.framework.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.thinkive.framework.view.RoundedCornerTextView;

class EnglishKeyboard$3
  implements View.OnTouchListener
{
  EnglishKeyboard$3(EnglishKeyboard paramEnglishKeyboard, int paramInt, RoundedCornerTextView paramRoundedCornerTextView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      if ((this.val$tag < 0) || (32 == this.val$tag)) {
        EnglishKeyboard.access$1(this.this$0, (RoundedCornerTextView)paramView, true);
      }
    }
    for (;;)
    {
      if (1 == paramMotionEvent.getAction()) {
        this.this$0.onClick(paramView);
      }
      return true;
      EnglishKeyboard.access$2(this.this$0).setText(this.val$text.getText().toString());
      EnglishKeyboard.access$3(this.this$0, paramView);
      continue;
      if (2 != paramMotionEvent.getAction()) {
        if ((this.val$tag < 0) || (32 == this.val$tag)) {
          EnglishKeyboard.access$1(this.this$0, (RoundedCornerTextView)paramView, false);
        } else {
          EnglishKeyboard.access$4(this.this$0);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\EnglishKeyboard$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */