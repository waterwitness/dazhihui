package android.support.v4.widget;

import android.view.animation.Interpolator;

final class bg
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */