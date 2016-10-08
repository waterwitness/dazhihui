import android.view.animation.Interpolator;
import android.widget.ImageView;

final class bz
  implements Runnable
{
  private final float a;
  private final float b;
  private final long c;
  private final float d;
  private final float e;
  
  public bz(bx parambx, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a = paramFloat3;
    this.b = paramFloat4;
    this.c = System.currentTimeMillis();
    this.d = paramFloat1;
    this.e = paramFloat2;
  }
  
  public final void run()
  {
    ImageView localImageView = this.f.c();
    if (localImageView == null) {}
    float f1;
    do
    {
      return;
      f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.c) * 1.0F / this.f.b);
      f1 = bx.a.getInterpolation(f1);
      float f2 = (this.d + (this.e - this.d) * f1) / this.f.g();
      this.f.a(f2, this.a, this.b);
    } while (f1 >= 1.0F);
    bq.a(localImageView, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */