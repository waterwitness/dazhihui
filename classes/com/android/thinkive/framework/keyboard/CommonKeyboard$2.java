package com.android.thinkive.framework.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;

class CommonKeyboard$2
  implements View.OnTouchListener
{
  CommonKeyboard$2(CommonKeyboard paramCommonKeyboard, RoundedCornerImageView paramRoundedCornerImageView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.val$view.setRoundedCornerBgColor(CommonKeyboard.sColorSelectedKeyBg);
      this.val$view.setImageResource(ResourceUtil.getResourceID(CommonKeyboard.access$0(this.this$0), "drawable", "btn_keyboard_delete_small_white"));
    }
    for (;;)
    {
      if (1 == paramMotionEvent.getAction()) {
        this.this$0.onClick(paramView);
      }
      return true;
      if (2 != paramMotionEvent.getAction())
      {
        this.val$view.setImageResource(ResourceUtil.getResourceID(CommonKeyboard.access$0(this.this$0), "drawable", CommonKeyboard.sResNameDeleteSmall));
        this.val$view.setRoundedCornerBgColor(CommonKeyboard.sColorDefaultFuncKeyBg);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\CommonKeyboard$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */