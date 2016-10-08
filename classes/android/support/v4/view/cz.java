package android.support.v4.view;

import android.view.animation.Interpolator;

final class cz
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * (paramFloat * paramFloat * paramFloat * paramFloat) + 1.0F;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */