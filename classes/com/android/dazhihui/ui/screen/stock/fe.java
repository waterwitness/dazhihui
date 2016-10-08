package com.android.dazhihui.ui.screen.stock;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

class fe
  implements Animation.AnimationListener
{
  fe(eu parameu) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    eu.b(this.a, false);
    eu.q(this.a).setVisibility(0);
    eu.r(this.a).setVisibility(8);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    eu.b(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */