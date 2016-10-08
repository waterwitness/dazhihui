package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class aj
  implements Animation.AnimationListener
{
  private Animation.AnimationListener a = null;
  private boolean b = false;
  private View c = null;
  
  public aj(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    this.c = paramView;
  }
  
  public aj(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
  {
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    this.a = paramAnimationListener;
    this.c = paramView;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if ((this.c != null) && (this.b)) {
      this.c.post(new al(this));
    }
    if (this.a != null) {
      this.a.onAnimationEnd(paramAnimation);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    if (this.a != null) {
      this.a.onAnimationRepeat(paramAnimation);
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (this.c != null)
    {
      this.b = af.a(this.c, paramAnimation);
      if (this.b) {
        this.c.post(new ak(this));
      }
    }
    if (this.a != null) {
      this.a.onAnimationStart(paramAnimation);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */