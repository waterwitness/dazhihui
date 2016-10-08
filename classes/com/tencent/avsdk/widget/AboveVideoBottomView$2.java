package com.tencent.avsdk.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

class AboveVideoBottomView$2
  implements Animation.AnimationListener
{
  AboveVideoBottomView$2(AboveVideoBottomView paramAboveVideoBottomView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = new RotateAnimation(-10.0F, 10.0F, 1, 0.5F, 1, 1.0F);
    paramAnimation.setDuration(90L);
    paramAnimation.setRepeatMode(2);
    paramAnimation.setRepeatCount(10);
    paramAnimation.setFillAfter(true);
    paramAnimation.setAnimationListener(new AboveVideoBottomView.2.1(this));
    AboveVideoBottomView.access$100(this.this$0).startAnimation(paramAnimation);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */