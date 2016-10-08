package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class aa
  extends bf
{
  private final float a = a(paramContext.getResources().getDisplayMetrics());
  protected final LinearInterpolator b = new LinearInterpolator();
  protected final DecelerateInterpolator c = new DecelerateInterpolator();
  protected PointF d;
  protected int e = 0;
  protected int f = 0;
  
  public aa(Context paramContext) {}
  
  private int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    paramInt2 = i;
    if (paramInt1 * i <= 0) {
      paramInt2 = 0;
    }
    return paramInt2;
  }
  
  protected float a(DisplayMetrics paramDisplayMetrics)
  {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    switch (paramInt5)
    {
    default: 
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1: 
      paramInt1 = paramInt3 - paramInt1;
    }
    do
    {
      do
      {
        return paramInt1;
        return paramInt4 - paramInt2;
        paramInt3 -= paramInt1;
        paramInt1 = paramInt3;
      } while (paramInt3 > 0);
      paramInt2 = paramInt4 - paramInt2;
      paramInt1 = paramInt2;
    } while (paramInt2 < 0);
    return 0;
  }
  
  public int a(View paramView, int paramInt)
  {
    aw localaw = e();
    if (!localaw.e()) {
      return 0;
    }
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return a(localaw.h(paramView) - localLayoutParams.topMargin, localaw.j(paramView) + localLayoutParams.bottomMargin, localaw.v(), localaw.t() - localaw.x(), paramInt);
  }
  
  public abstract PointF a(int paramInt);
  
  protected void a() {}
  
  protected void a(int paramInt1, int paramInt2, bh parambh, bg parambg)
  {
    if (j() == 0) {
      f();
    }
    do
    {
      return;
      this.e = a(this.e, paramInt1);
      this.f = a(this.f, paramInt2);
    } while ((this.e != 0) || (this.f != 0));
    a(parambg);
  }
  
  protected void a(bg parambg)
  {
    PointF localPointF = a(i());
    if ((localPointF == null) || ((localPointF.x == 0.0F) && (localPointF.y == 0.0F)))
    {
      Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
      parambg.a(i());
      f();
      return;
    }
    a(localPointF);
    this.d = localPointF;
    this.e = ((int)(localPointF.x * 10000.0F));
    this.f = ((int)(localPointF.y * 10000.0F));
    int i = c(10000);
    parambg.a((int)(this.e * 1.2F), (int)(this.f * 1.2F), (int)(i * 1.2F), this.b);
  }
  
  protected void a(View paramView, bh parambh, bg parambg)
  {
    int i = b(paramView, c());
    int j = a(paramView, d());
    int k = b((int)Math.sqrt(i * i + j * j));
    if (k > 0) {
      parambg.a(-i, -j, k, this.c);
    }
  }
  
  protected int b(int paramInt)
  {
    return (int)Math.ceil(c(paramInt) / 0.3356D);
  }
  
  public int b(View paramView, int paramInt)
  {
    aw localaw = e();
    if (!localaw.d()) {
      return 0;
    }
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return a(localaw.g(paramView) - localLayoutParams.leftMargin, localaw.i(paramView) + localLayoutParams.rightMargin, localaw.u(), localaw.s() - localaw.w(), paramInt);
  }
  
  protected void b()
  {
    this.f = 0;
    this.e = 0;
    this.d = null;
  }
  
  protected int c()
  {
    if ((this.d == null) || (this.d.x == 0.0F)) {
      return 0;
    }
    if (this.d.x > 0.0F) {
      return 1;
    }
    return -1;
  }
  
  protected int c(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.a);
  }
  
  protected int d()
  {
    if ((this.d == null) || (this.d.y == 0.0F)) {
      return 0;
    }
    if (this.d.y > 0.0F) {
      return 1;
    }
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */