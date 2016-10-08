package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

class fd
  implements Animation.AnimationListener
{
  fd(eu parameu) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    eu.b(this.a, false);
    eu.a(this.a).sendEmptyMessageDelayed(0, 2000L);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    eu.b(this.a, true);
    eu.q(this.a).setVisibility(8);
    eu.r(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */