package com.tencent.avsdk.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.android.dazhihui.ui.widget.adv.GifView;

class CarAnimation$1$1
  implements Animation.AnimationListener
{
  CarAnimation$1$1(CarAnimation.1 param1) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (CarAnimation.access$000(this.this$1.this$0) == 1) {
      this.this$1.this$0.start(this.this$1.val$xx, this.this$1.val$runnable);
    }
    do
    {
      return;
      this.this$1.this$0.carView.setBackgroundResource(2130837626);
      CarAnimation.access$102(this.this$1.this$0, false);
      CarAnimation.access$002(this.this$1.this$0, 0);
      this.this$1.this$0.setVisibility(8);
      this.this$1.this$0.clearAnimation();
    } while (this.this$1.val$runnable == null);
    this.this$1.val$runnable.run();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\CarAnimation$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */