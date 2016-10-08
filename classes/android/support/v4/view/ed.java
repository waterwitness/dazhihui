package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ed
  extends AnimatorListenerAdapter
{
  ed(eg parameg, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a.c(this.b);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.b(this.b);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.a.a(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */