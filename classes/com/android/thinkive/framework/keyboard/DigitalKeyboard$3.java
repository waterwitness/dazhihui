package com.android.thinkive.framework.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;

class DigitalKeyboard$3
  implements View.OnTouchListener
{
  DigitalKeyboard$3(DigitalKeyboard paramDigitalKeyboard, RoundedCornerImageView paramRoundedCornerImageView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.val$view.setRoundedCornerBgColor(DigitalKeyboard.sColorSelectedKeyBg);
      this.val$view.setImageResource(ResourceUtil.getResourceID(DigitalKeyboard.access$1(this.this$0), "drawable", "btn_keyboard_delete_big_white"));
    }
    for (;;)
    {
      if (1 == paramMotionEvent.getAction()) {
        this.this$0.onClick(paramView);
      }
      return true;
      if (2 != paramMotionEvent.getAction())
      {
        this.val$view.setImageResource(ResourceUtil.getResourceID(DigitalKeyboard.access$1(this.this$0), "drawable", DigitalKeyboard.sResNameDeleteBig));
        this.val$view.setRoundedCornerBgColor(DigitalKeyboard.sColorDefaultFuncKeyBg);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\DigitalKeyboard$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */