package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class b
  implements Interpolator
{
  private final float[] a;
  private final float b;
  
  public b(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
    this.b = (1.0F / (this.a.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    int i = Math.min((int)((this.a.length - 1) * paramFloat), this.a.length - 2);
    paramFloat = (paramFloat - i * this.b) / this.b;
    float f = this.a[i];
    return (this.a[(i + 1)] - this.a[i]) * paramFloat + f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */