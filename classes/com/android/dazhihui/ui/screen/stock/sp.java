package com.android.dazhihui.ui.screen.stock;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

class sp
  implements Animation.AnimationListener
{
  sp(sk paramsk) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    sk.c(this.a, false);
    sk.n(this.a).setVisibility(0);
    sk.o(this.a).setVisibility(8);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    sk.c(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */