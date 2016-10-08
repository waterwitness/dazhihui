package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class z
  implements Animation.AnimationListener
{
  z(x paramx, ab paramab) {}
  
  public void onAnimationEnd(Animation paramAnimation) {}
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    this.a.l();
    this.a.b();
    this.a.b(this.a.i());
    if (this.b.a)
    {
      this.b.a = false;
      paramAnimation.setDuration(1332L);
      this.a.a(false);
      return;
    }
    x.a(this.b, (x.a(this.b) + 1.0F) % 5.0F);
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    x.a(this.b, 0.0F);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */