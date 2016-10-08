package com.android.dazhihui.ui.widget;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;

class mt
  implements Runnable
{
  private long b;
  private float c;
  private float d;
  private float e;
  private float f;
  private boolean g;
  private AccelerateDecelerateInterpolator h = new AccelerateDecelerateInterpolator();
  private PointF i;
  private PointF j;
  
  mt(TouchImageView paramTouchImageView, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    TouchImageView.a(paramTouchImageView, mz.e);
    this.b = System.currentTimeMillis();
    this.c = TouchImageView.d(paramTouchImageView);
    this.d = paramFloat1;
    this.g = paramBoolean;
    PointF localPointF = TouchImageView.a(paramTouchImageView, paramFloat2, paramFloat3, false);
    this.e = localPointF.x;
    this.f = localPointF.y;
    this.i = TouchImageView.a(paramTouchImageView, this.e, this.f);
    this.j = new PointF(TouchImageView.i(paramTouchImageView) / 2, TouchImageView.k(paramTouchImageView) / 2);
  }
  
  private float a()
  {
    float f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.b) / 500.0F);
    return this.h.getInterpolation(f1);
  }
  
  private void a(float paramFloat)
  {
    float f1 = this.i.x;
    float f2 = this.j.x;
    float f3 = this.i.x;
    float f4 = this.i.y;
    float f5 = this.j.y;
    float f6 = this.i.y;
    PointF localPointF = TouchImageView.a(this.a, this.e, this.f);
    TouchImageView.m(this.a).postTranslate(f1 + (f2 - f3) * paramFloat - localPointF.x, f4 + (f5 - f6) * paramFloat - localPointF.y);
  }
  
  private double b(float paramFloat)
  {
    return (this.c + (this.d - this.c) * paramFloat) / TouchImageView.d(this.a);
  }
  
  public void run()
  {
    float f1 = a();
    double d1 = b(f1);
    TouchImageView.a(this.a, d1, this.e, this.f, this.g);
    a(f1);
    TouchImageView.q(this.a);
    this.a.setImageMatrix(TouchImageView.m(this.a));
    if (TouchImageView.p(this.a) != null) {
      TouchImageView.p(this.a).a();
    }
    if (f1 < 1.0F)
    {
      TouchImageView.a(this.a, this);
      return;
    }
    TouchImageView.a(this.a, mz.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */