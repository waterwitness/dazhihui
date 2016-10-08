package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

class so
  implements Animation.AnimationListener
{
  so(sk paramsk) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    sk.c(this.a, false);
    sk.b(this.a).sendEmptyMessageDelayed(0, 2000L);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    sk.c(this.a, true);
    sk.n(this.a).setVisibility(8);
    sk.o(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */