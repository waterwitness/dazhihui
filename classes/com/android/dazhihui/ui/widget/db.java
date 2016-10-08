package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

class db
  implements Animation.AnimationListener
{
  db(DzhMainHeader paramDzhMainHeader, View paramView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setVisibility(0);
    this.a.clearAnimation();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    DzhMainHeader.e(this.b).setVisibility(8);
    this.a.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */