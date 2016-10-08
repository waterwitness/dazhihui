package com.android.thinkive.framework.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.thinkive.framework.util.ResourceUtil;
import com.android.thinkive.framework.view.RoundedCornerImageView;

class MerchandiseKeyboard$2
  implements View.OnTouchListener
{
  MerchandiseKeyboard$2(MerchandiseKeyboard paramMerchandiseKeyboard, RoundedCornerImageView paramRoundedCornerImageView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.val$view.setRoundedCornerBgColor(MerchandiseKeyboard.sColorSelectedKeyBg);
      this.val$view.setImageResource(ResourceUtil.getResourceID(MerchandiseKeyboard.access$0(this.this$0), "drawable", "btn_keyboard_delete_small_white"));
    }
    for (;;)
    {
      if (1 == paramMotionEvent.getAction()) {
        this.this$0.onClick(paramView);
      }
      return true;
      if (2 != paramMotionEvent.getAction())
      {
        this.val$view.setImageResource(ResourceUtil.getResourceID(MerchandiseKeyboard.access$0(this.this$0), "drawable", MerchandiseKeyboard.sResNameDeleteSmall));
        this.val$view.setRoundedCornerBgColor(MerchandiseKeyboard.sColorDefaultFuncKeyBg);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\MerchandiseKeyboard$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */