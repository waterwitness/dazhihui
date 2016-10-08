package com.android.dazhihui.ui.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

class ed
  implements Animation.AnimationListener
{
  ed(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    HotVideoViewFlow.e(this.a).clearAnimation();
    HotVideoViewFlow.e(this.a).setVisibility(8);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    HotVideoViewFlow.e(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */