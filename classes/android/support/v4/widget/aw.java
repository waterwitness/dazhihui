package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class aw
  implements Animation.AnimationListener
{
  aw(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (SwipeRefreshLayout.a(this.a))
    {
      SwipeRefreshLayout.b(this.a).setAlpha(255);
      SwipeRefreshLayout.b(this.a).start();
      if ((SwipeRefreshLayout.c(this.a)) && (SwipeRefreshLayout.d(this.a) != null)) {
        SwipeRefreshLayout.d(this.a).a();
      }
    }
    for (;;)
    {
      SwipeRefreshLayout.b(this.a, SwipeRefreshLayout.e(this.a).getTop());
      return;
      SwipeRefreshLayout.b(this.a).stop();
      SwipeRefreshLayout.e(this.a).setVisibility(8);
      SwipeRefreshLayout.a(this.a, 255);
      if (SwipeRefreshLayout.f(this.a)) {
        SwipeRefreshLayout.a(this.a, 0.0F);
      } else {
        SwipeRefreshLayout.a(this.a, this.a.b - SwipeRefreshLayout.g(this.a), true);
      }
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */