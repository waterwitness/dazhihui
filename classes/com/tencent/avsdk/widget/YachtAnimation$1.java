package com.tencent.avsdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;

class YachtAnimation$1
  extends AnimatorListenerAdapter
{
  YachtAnimation$1(YachtAnimation paramYachtAnimation) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.this$0.setVisibility(8);
    this.this$0.animationDrawable.stop();
    this.this$0.heart_arrow.setVisibility(8);
    this.this$0.youlun.setVisibility(8);
    this.this$0.fireworks_bg.setVisibility(8);
    this.this$0.fireworks.setVisibility(8);
    this.this$0.water2.setVisibility(8);
    this.this$0.water1.clearAnimation();
    this.this$0.water2.clearAnimation();
    this.this$0.water1.setVisibility(8);
    this.this$0.isShowAnimation = false;
    if (YachtAnimation.access$000(this.this$0) != null) {
      YachtAnimation.access$000(this.this$0).run();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\YachtAnimation$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */