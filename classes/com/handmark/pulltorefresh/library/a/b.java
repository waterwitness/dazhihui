package com.handmark.pulltorefresh.library.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.handmark.pulltorefresh.library.ag;
import com.handmark.pulltorefresh.library.j;
import com.handmark.pulltorefresh.library.p;

@SuppressLint({"ViewConstructor"})
public class b
  extends f
{
  private final Animation l;
  private final Animation m;
  
  public b(Context paramContext, j paramj, p paramp, TypedArray paramTypedArray)
  {
    super(paramContext, paramj, paramp, paramTypedArray);
    if (paramj == j.b) {}
    for (int i = 65356;; i = 180)
    {
      this.l = new RotateAnimation(0.0F, i, 1, 0.5F, 1, 0.5F);
      this.l.setInterpolator(a);
      this.l.setDuration(150L);
      this.l.setFillAfter(true);
      this.m = new RotateAnimation(i, 0.0F, 1, 0.5F, 1, 0.5F);
      this.m.setInterpolator(a);
      this.m.setDuration(150L);
      this.m.setFillAfter(true);
      return;
    }
  }
  
  private float getDrawableRotationAngle()
  {
    switch (c.a[this.g.ordinal()])
    {
    }
    do
    {
      return 0.0F;
      if (this.h == p.b) {
        return 90.0F;
      }
      return 180.0F;
    } while (this.h != p.b);
    return 270.0F;
  }
  
  protected void a()
  {
    if (this.l == this.c.getAnimation()) {
      this.c.startAnimation(this.m);
    }
  }
  
  protected void a(float paramFloat) {}
  
  protected void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicHeight();
      int j = paramDrawable.getIntrinsicWidth();
      paramDrawable = this.c.getLayoutParams();
      int k = Math.max(i, j);
      paramDrawable.height = k;
      paramDrawable.width = k;
      this.c.requestLayout();
      this.c.setScaleType(ImageView.ScaleType.MATRIX);
      Matrix localMatrix = new Matrix();
      localMatrix.postTranslate((paramDrawable.width - j) / 2.0F, (paramDrawable.height - i) / 2.0F);
      localMatrix.postRotate(getDrawableRotationAngle(), paramDrawable.width / 2.0F, paramDrawable.height / 2.0F);
      this.c.setImageMatrix(localMatrix);
    }
  }
  
  protected void b()
  {
    this.c.clearAnimation();
    this.c.setVisibility(4);
    this.d.setVisibility(0);
  }
  
  protected void c()
  {
    this.c.startAnimation(this.l);
  }
  
  protected void d()
  {
    this.c.clearAnimation();
    this.d.setVisibility(8);
    this.c.setVisibility(0);
  }
  
  protected int getDefaultDrawableResId()
  {
    return ag.default_ptr_flip;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */