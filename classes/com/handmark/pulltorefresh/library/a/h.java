package com.handmark.pulltorefresh.library.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.handmark.pulltorefresh.library.ag;
import com.handmark.pulltorefresh.library.ak;
import com.handmark.pulltorefresh.library.j;
import com.handmark.pulltorefresh.library.p;

public class h
  extends f
{
  private final Animation l;
  private final Matrix m;
  private float n;
  private float o;
  private final boolean p;
  
  public h(Context paramContext, j paramj, p paramp, TypedArray paramTypedArray)
  {
    super(paramContext, paramj, paramp, paramTypedArray);
    this.p = paramTypedArray.getBoolean(ak.PullToRefresh_ptrRotateDrawableWhilePulling, true);
    this.c.setScaleType(ImageView.ScaleType.MATRIX);
    this.m = new Matrix();
    this.c.setImageMatrix(this.m);
    this.l = new RotateAnimation(0.0F, 720.0F, 1, 0.5F, 1, 0.5F);
    this.l.setInterpolator(a);
    this.l.setDuration(1200L);
    this.l.setRepeatCount(-1);
    this.l.setRepeatMode(1);
  }
  
  private void k()
  {
    if (this.m != null)
    {
      this.m.reset();
      this.c.setImageMatrix(this.m);
    }
  }
  
  protected void a() {}
  
  protected void a(float paramFloat)
  {
    if (this.p) {}
    for (paramFloat = 90.0F * paramFloat;; paramFloat = Math.max(0.0F, Math.min(180.0F, 360.0F * paramFloat - 180.0F)))
    {
      this.m.setRotate(paramFloat, this.n, this.o);
      this.c.setImageMatrix(this.m);
      return;
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      this.n = Math.round(paramDrawable.getIntrinsicWidth() / 2.0F);
      this.o = Math.round(paramDrawable.getIntrinsicHeight() / 2.0F);
    }
  }
  
  protected void b()
  {
    this.c.startAnimation(this.l);
  }
  
  protected void c() {}
  
  protected void d()
  {
    this.c.clearAnimation();
    k();
  }
  
  protected int getDefaultDrawableResId()
  {
    return ag.default_ptr_rotate;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */