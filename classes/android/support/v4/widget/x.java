package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.b.a;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

class x
  extends Drawable
  implements Animatable
{
  private static final Interpolator b = new LinearInterpolator();
  private static final Interpolator c = new a();
  boolean a;
  private final int[] d = { -16777216 };
  private final ArrayList<Animation> e = new ArrayList();
  private final ab f;
  private float g;
  private Resources h;
  private View i;
  private Animation j;
  private float k;
  private double l;
  private double m;
  private final Drawable.Callback n = new aa(this);
  
  public x(Context paramContext, View paramView)
  {
    this.i = paramView;
    this.h = paramContext.getResources();
    this.f = new ab(this.n);
    this.f.a(this.d);
    a(1);
    b();
  }
  
  private float a(ab paramab)
  {
    return (float)Math.toRadians(paramab.d() / (6.283185307179586D * paramab.j()));
  }
  
  private int a(float paramFloat, int paramInt1, int paramInt2)
  {
    int i3 = Integer.valueOf(paramInt1).intValue();
    paramInt1 = i3 >> 24 & 0xFF;
    int i1 = i3 >> 16 & 0xFF;
    int i2 = i3 >> 8 & 0xFF;
    i3 &= 0xFF;
    paramInt2 = Integer.valueOf(paramInt2).intValue();
    int i4 = (int)(((paramInt2 >> 24 & 0xFF) - paramInt1) * paramFloat);
    int i5 = (int)(((paramInt2 >> 16 & 0xFF) - i1) * paramFloat);
    int i6 = (int)(((paramInt2 >> 8 & 0xFF) - i2) * paramFloat);
    return i3 + (int)(((paramInt2 & 0xFF) - i3) * paramFloat) | paramInt1 + i4 << 24 | i1 + i5 << 16 | i6 + i2 << 8;
  }
  
  private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float paramFloat1, float paramFloat2)
  {
    ab localab = this.f;
    float f1 = this.h.getDisplayMetrics().density;
    this.l = (f1 * paramDouble1);
    this.m = (f1 * paramDouble2);
    localab.a((float)paramDouble4 * f1);
    localab.a(f1 * paramDouble3);
    localab.c(0);
    localab.a(paramFloat1 * f1, f1 * paramFloat2);
    localab.a((int)this.l, (int)this.m);
  }
  
  private void a(float paramFloat, ab paramab)
  {
    if (paramFloat > 0.75F) {
      paramab.b(a((paramFloat - 0.75F) / 0.25F, paramab.h(), paramab.a()));
    }
  }
  
  private void b()
  {
    ab localab = this.f;
    y localy = new y(this, localab);
    localy.setRepeatCount(-1);
    localy.setRepeatMode(1);
    localy.setInterpolator(b);
    localy.setAnimationListener(new z(this, localab));
    this.j = localy;
  }
  
  private void b(float paramFloat, ab paramab)
  {
    a(paramFloat, paramab);
    float f1 = (float)(Math.floor(paramab.k() / 0.8F) + 1.0D);
    float f2 = a(paramab);
    float f3 = paramab.f();
    paramab.b((paramab.g() - f2 - paramab.f()) * paramFloat + f3);
    paramab.c(paramab.g());
    f2 = paramab.k();
    paramab.d((f1 - paramab.k()) * paramFloat + f2);
  }
  
  public void a(float paramFloat)
  {
    this.f.e(paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.f.b(paramFloat1);
    this.f.c(paramFloat2);
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      a(56.0D, 56.0D, 12.5D, 3.0D, 12.0F, 6.0F);
      return;
    }
    a(40.0D, 40.0D, 8.75D, 2.5D, 10.0F, 5.0F);
  }
  
  public void a(boolean paramBoolean)
  {
    this.f.a(paramBoolean);
  }
  
  public void a(int... paramVarArgs)
  {
    this.f.a(paramVarArgs);
    this.f.c(0);
  }
  
  public void b(float paramFloat)
  {
    this.f.d(paramFloat);
  }
  
  public void b(int paramInt)
  {
    this.f.a(paramInt);
  }
  
  void c(float paramFloat)
  {
    this.g = paramFloat;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.g, localRect.exactCenterX(), localRect.exactCenterY());
    this.f.a(paramCanvas, localRect);
    paramCanvas.restoreToCount(i1);
  }
  
  public int getAlpha()
  {
    return this.f.c();
  }
  
  public int getIntrinsicHeight()
  {
    return (int)this.m;
  }
  
  public int getIntrinsicWidth()
  {
    return (int)this.l;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean isRunning()
  {
    ArrayList localArrayList = this.e;
    int i2 = localArrayList.size();
    int i1 = 0;
    while (i1 < i2)
    {
      Animation localAnimation = (Animation)localArrayList.get(i1);
      if ((localAnimation.hasStarted()) && (!localAnimation.hasEnded())) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  public void setAlpha(int paramInt)
  {
    this.f.d(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.f.a(paramColorFilter);
  }
  
  public void start()
  {
    this.j.reset();
    this.f.l();
    if (this.f.i() != this.f.e())
    {
      this.a = true;
      this.j.setDuration(666L);
      this.i.startAnimation(this.j);
      return;
    }
    this.f.c(0);
    this.f.m();
    this.j.setDuration(1332L);
    this.i.startAnimation(this.j);
  }
  
  public void stop()
  {
    this.i.clearAnimation();
    c(0.0F);
    this.f.a(false);
    this.f.c(0);
    this.f.m();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */