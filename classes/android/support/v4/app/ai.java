package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

class ai
  extends aj
{
  ai(af paramaf, View paramView, Animation paramAnimation, Fragment paramFragment)
  {
    super(paramView, paramAnimation);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    if (this.a.mAnimatingAway != null)
    {
      this.a.mAnimatingAway = null;
      this.b.a(this.a, this.a.mStateAfterAnimating, 0, 0, false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */