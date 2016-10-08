package com.tencent.avsdk.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import com.android.dazhihui.ui.widget.adv.GifView;

class CarAnimation$1
  implements Animation.AnimationListener
{
  CarAnimation$1(CarAnimation paramCarAnimation, String paramString, Runnable paramRunnable) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.this$0.carView.setBackgroundResource(2130837627);
    paramAnimation = new TranslateAnimation(2, 1.0F, 2, -1.0F, 2, 0.2F, 2, 0.5F);
    paramAnimation.setDuration(2500L);
    paramAnimation.setFillAfter(false);
    paramAnimation.setAnimationListener(new CarAnimation.1.1(this));
    this.this$0.startAnimation(paramAnimation);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\CarAnimation$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */