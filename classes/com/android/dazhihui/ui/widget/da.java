package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class da
  implements Animation.AnimationListener
{
  da(DzhMainHeader paramDzhMainHeader, View paramView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setVisibility(8);
    DzhMainHeader.d(this.b);
    this.a.clearAnimation();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */