package com.tencent.avsdk.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

class AboveVideoBottomView$2$1
  implements Animation.AnimationListener
{
  AboveVideoBottomView$2$1(AboveVideoBottomView.2 param2) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = new RotateAnimation(10.0F, 0.0F, 1, 0.5F, 1, 1.0F);
    paramAnimation.setDuration(60L);
    paramAnimation.setFillAfter(false);
    AboveVideoBottomView.access$100(this.this$1.this$0).startAnimation(paramAnimation);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$2$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */