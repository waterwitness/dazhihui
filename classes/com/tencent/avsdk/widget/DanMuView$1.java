package com.tencent.avsdk.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class DanMuView$1
  implements Animation.AnimationListener
{
  DanMuView$1(DanMuView paramDanMuView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.this$0.setVisibility(4);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.this$0.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\DanMuView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */