package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

class y
  extends Animation
{
  y(x paramx, ab paramab) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.a)
    {
      x.a(this.b, paramFloat, this.a);
      return;
    }
    float f1 = x.a(this.b, this.a);
    float f2 = this.a.g();
    float f4 = this.a.f();
    float f3 = this.a.k();
    x.b(this.b, paramFloat, this.a);
    if (paramFloat <= 0.5F)
    {
      float f5 = paramFloat / 0.5F;
      f5 = x.a().getInterpolation(f5);
      this.a.b(f4 + f5 * (0.8F - f1));
    }
    if (paramFloat > 0.5F)
    {
      f4 = (paramFloat - 0.5F) / 0.5F;
      f4 = x.a().getInterpolation(f4);
      this.a.c((0.8F - f1) * f4 + f2);
    }
    this.a.d(0.25F * paramFloat + f3);
    f1 = x.a(this.b) / 5.0F;
    this.b.c(216.0F * paramFloat + 1080.0F * f1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */