package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ba
  implements Animation.AnimationListener
{
  ba(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (!SwipeRefreshLayout.f(this.a)) {
      SwipeRefreshLayout.a(this.a, null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */