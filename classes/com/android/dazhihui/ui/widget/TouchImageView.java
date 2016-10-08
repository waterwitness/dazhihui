package com.android.dazhihui.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.ScaleGestureDetector;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class TouchImageView
  extends ImageView
{
  private View.OnTouchListener A = null;
  private mw B = null;
  private float a;
  private Matrix b;
  private Matrix c;
  private mz d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float[] i;
  private Context j;
  private mu k;
  private ImageView.ScaleType l;
  private boolean m;
  private boolean n;
  private na o;
  private int p;
  private int q;
  private int r;
  private int s;
  private float t;
  private float u;
  private float v;
  private float w;
  private ScaleGestureDetector x;
  private GestureDetector y;
  private GestureDetector.OnDoubleTapListener z = null;
  
  public TouchImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    case 1073741824: 
    default: 
      return paramInt2;
    case -2147483648: 
      return Math.min(paramInt3, paramInt2);
    }
    return paramInt3;
  }
  
  private PointF a(float paramFloat1, float paramFloat2)
  {
    this.b.getValues(this.i);
    float f2 = getDrawable().getIntrinsicWidth();
    float f1 = getDrawable().getIntrinsicHeight();
    paramFloat1 /= f2;
    paramFloat2 /= f1;
    f1 = this.i[2];
    f2 = getImageWidth();
    float f3 = this.i[5];
    return new PointF(paramFloat1 * f2 + f1, paramFloat2 * getImageHeight() + f3);
  }
  
  private PointF a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    this.b.getValues(this.i);
    float f4 = getDrawable().getIntrinsicWidth();
    float f3 = getDrawable().getIntrinsicHeight();
    float f1 = this.i[2];
    float f2 = this.i[5];
    f1 = (paramFloat1 - f1) * f4 / getImageWidth();
    f2 = (paramFloat2 - f2) * f3 / getImageHeight();
    paramFloat2 = f2;
    paramFloat1 = f1;
    if (paramBoolean)
    {
      paramFloat1 = Math.min(Math.max(f1, 0.0F), f4);
      paramFloat2 = Math.min(Math.max(f2, 0.0F), f3);
    }
    return new PointF(paramFloat1, paramFloat2);
  }
  
  private void a(double paramDouble, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f2;
    float f1;
    float f3;
    if (paramBoolean)
    {
      f2 = this.g;
      f1 = this.h;
      f3 = this.a;
      this.a = ((float)(this.a * paramDouble));
      if (this.a <= f1) {
        break label93;
      }
      this.a = f1;
      paramDouble = f1 / f3;
    }
    for (;;)
    {
      this.b.postScale((float)paramDouble, (float)paramDouble, paramFloat1, paramFloat2);
      e();
      return;
      f2 = this.e;
      f1 = this.f;
      break;
      label93:
      if (this.a < f2)
      {
        this.a = f2;
        paramDouble = f2 / f3;
      }
    }
  }
  
  private void a(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramFloat3 < paramInt3)
    {
      this.i[paramInt1] = ((paramInt3 - paramInt4 * this.i[0]) * 0.5F);
      return;
    }
    if (paramFloat1 > 0.0F)
    {
      this.i[paramInt1] = (-((paramFloat3 - paramInt3) * 0.5F));
      return;
    }
    paramFloat1 = (Math.abs(paramFloat1) + paramInt2 * 0.5F) / paramFloat2;
    this.i[paramInt1] = (-(paramFloat1 * paramFloat3 - paramInt3 * 0.5F));
  }
  
  private void a(Context paramContext)
  {
    super.setClickable(true);
    this.j = paramContext;
    this.x = new ScaleGestureDetector(paramContext, new my(this, null));
    this.y = new GestureDetector(paramContext, new mv(this, null));
    this.b = new Matrix();
    this.c = new Matrix();
    this.i = new float[9];
    this.a = 1.0F;
    if (this.l == null) {
      this.l = ImageView.ScaleType.FIT_CENTER;
    }
    this.e = 1.0F;
    this.f = 3.0F;
    this.g = (0.75F * this.e);
    this.h = (1.25F * this.f);
    setImageMatrix(this.b);
    setScaleType(ImageView.ScaleType.MATRIX);
    setState(mz.a);
    this.n = false;
    super.setOnTouchListener(new mx(this, null));
  }
  
  @TargetApi(15)
  private void a(Runnable paramRunnable)
  {
    postDelayed(paramRunnable, 16L);
  }
  
  private float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 0.0F;
    if (paramFloat3 <= paramFloat2)
    {
      paramFloat2 -= paramFloat3;
      paramFloat3 = 0.0F;
      if (paramFloat1 >= paramFloat3) {
        break label37;
      }
      paramFloat3 = -paramFloat1 + paramFloat3;
    }
    label37:
    do
    {
      return paramFloat3;
      paramFloat3 = paramFloat2 - paramFloat3;
      paramFloat2 = 0.0F;
      break;
      paramFloat3 = f1;
    } while (paramFloat1 <= paramFloat2);
    return -paramFloat1 + paramFloat2;
  }
  
  private float c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat3 <= paramFloat2) {
      paramFloat1 = 0.0F;
    }
    return paramFloat1;
  }
  
  private void c()
  {
    if ((this.b != null) && (this.q != 0) && (this.p != 0))
    {
      this.b.getValues(this.i);
      this.c.setValues(this.i);
      this.w = this.u;
      this.v = this.t;
      this.s = this.q;
      this.r = this.p;
    }
  }
  
  private void d()
  {
    this.b.getValues(this.i);
    float f2 = this.i[2];
    float f1 = this.i[5];
    f2 = b(f2, this.p, getImageWidth());
    f1 = b(f1, this.q, getImageHeight());
    if ((f2 != 0.0F) || (f1 != 0.0F)) {
      this.b.postTranslate(f2, f1);
    }
  }
  
  private void e()
  {
    d();
    this.b.getValues(this.i);
    if (getImageWidth() < this.p) {
      this.i[2] = ((this.p - getImageWidth()) / 2.0F);
    }
    if (getImageHeight() < this.q) {
      this.i[5] = ((this.q - getImageHeight()) / 2.0F);
    }
    this.b.setValues(this.i);
  }
  
  private void f()
  {
    Drawable localDrawable = getDrawable();
    if ((localDrawable == null) || (localDrawable.getIntrinsicWidth() == 0) || (localDrawable.getIntrinsicHeight() == 0)) {}
    while ((this.b == null) || (this.c == null)) {
      return;
    }
    int i1 = localDrawable.getIntrinsicWidth();
    int i2 = localDrawable.getIntrinsicHeight();
    float f4 = this.p / i1;
    float f5 = this.q / i2;
    float f1 = f5;
    float f2 = f4;
    float f6 = f5;
    float f3 = f4;
    switch (mr.a[this.l.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
    case 1: 
      f1 = 1.0F;
      f2 = 1.0F;
    case 5: 
      f3 = this.p - i1 * f2;
      f4 = this.q - i2 * f1;
      this.t = (this.p - f3);
      this.u = (this.q - f4);
      if ((!a()) && (!this.m))
      {
        this.b.setScale(f2, f1);
        this.b.postTranslate(f3 / 2.0F, f4 / 2.0F);
        this.a = 1.0F;
      }
      break;
    }
    for (;;)
    {
      d();
      setImageMatrix(this.b);
      return;
      f1 = Math.max(f4, f5);
      f2 = f1;
      break;
      f6 = Math.min(1.0F, Math.min(f4, f5));
      f3 = f6;
      f1 = Math.min(f3, f6);
      f2 = f1;
      break;
      if ((this.v == 0.0F) || (this.w == 0.0F)) {
        c();
      }
      this.c.getValues(this.i);
      this.i[0] = (this.t / i1 * this.a);
      this.i[4] = (this.u / i2 * this.a);
      f1 = this.i[2];
      f2 = this.i[5];
      f3 = this.v;
      a(2, f1, this.a * f3, getImageWidth(), this.r, this.p, i1);
      a(5, f2, this.w * this.a, getImageHeight(), this.s, this.q, i2);
      this.b.setValues(this.i);
    }
  }
  
  private float getImageHeight()
  {
    return this.u * this.a;
  }
  
  private float getImageWidth()
  {
    return this.t * this.a;
  }
  
  private void setState(mz parammz)
  {
    this.d = parammz;
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a(paramFloat1, paramFloat2, paramFloat3, this.l);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, ImageView.ScaleType paramScaleType)
  {
    if (!this.n)
    {
      this.o = new na(this, paramFloat1, paramFloat2, paramFloat3, paramScaleType);
      return;
    }
    if (paramScaleType != this.l) {
      setScaleType(paramScaleType);
    }
    b();
    a(paramFloat1, this.p / 2, this.q / 2, true);
    this.b.getValues(this.i);
    this.i[2] = (-(getImageWidth() * paramFloat2 - this.p * 0.5F));
    this.i[5] = (-(getImageHeight() * paramFloat3 - this.q * 0.5F));
    this.b.setValues(this.i);
    d();
    setImageMatrix(this.b);
  }
  
  public boolean a()
  {
    return this.a != 1.0F;
  }
  
  public void b()
  {
    this.a = 1.0F;
    f();
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    this.b.getValues(this.i);
    float f1 = this.i[2];
    if (getImageWidth() < this.p) {}
    while (((f1 >= -1.0F) && (paramInt < 0)) || ((Math.abs(f1) + this.p + 1.0F >= getImageWidth()) && (paramInt > 0))) {
      return false;
    }
    return true;
  }
  
  public float getCurrentZoom()
  {
    return this.a;
  }
  
  public float getMaxZoom()
  {
    return this.f;
  }
  
  public float getMinZoom()
  {
    return this.e;
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return this.l;
  }
  
  public PointF getScrollPosition()
  {
    Object localObject = getDrawable();
    if (localObject == null) {
      return null;
    }
    int i1 = ((Drawable)localObject).getIntrinsicWidth();
    int i2 = ((Drawable)localObject).getIntrinsicHeight();
    localObject = a(this.p / 2, this.q / 2, true);
    ((PointF)localObject).x /= i1;
    ((PointF)localObject).y /= i2;
    return (PointF)localObject;
  }
  
  public RectF getZoomedRect()
  {
    if (this.l == ImageView.ScaleType.FIT_XY) {
      throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }
    PointF localPointF1 = a(0.0F, 0.0F, true);
    PointF localPointF2 = a(this.p, this.q, true);
    float f1 = getDrawable().getIntrinsicWidth();
    float f2 = getDrawable().getIntrinsicHeight();
    return new RectF(localPointF1.x / f1, localPointF1.y / f2, localPointF2.x / f1, localPointF2.y / f2);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    c();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.n = true;
    this.m = true;
    if (this.o != null)
    {
      a(this.o.a, this.o.b, this.o.c, this.o.d);
      this.o = null;
    }
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = getDrawable();
    if ((localDrawable == null) || (localDrawable.getIntrinsicWidth() == 0) || (localDrawable.getIntrinsicHeight() == 0))
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int i1 = localDrawable.getIntrinsicWidth();
    int i2 = localDrawable.getIntrinsicHeight();
    int i3 = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    this.p = a(paramInt1, i3, i1);
    this.q = a(paramInt2, i4, i2);
    setMeasuredDimension(this.p, this.q);
    f();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.a = paramParcelable.getFloat("saveScale");
      this.i = paramParcelable.getFloatArray("matrix");
      this.c.setValues(this.i);
      this.w = paramParcelable.getFloat("matchViewHeight");
      this.v = paramParcelable.getFloat("matchViewWidth");
      this.s = paramParcelable.getInt("viewHeight");
      this.r = paramParcelable.getInt("viewWidth");
      this.m = paramParcelable.getBoolean("imageRendered");
      super.onRestoreInstanceState(paramParcelable.getParcelable("instanceState"));
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("instanceState", super.onSaveInstanceState());
    localBundle.putFloat("saveScale", this.a);
    localBundle.putFloat("matchViewHeight", this.u);
    localBundle.putFloat("matchViewWidth", this.t);
    localBundle.putInt("viewWidth", this.p);
    localBundle.putInt("viewHeight", this.q);
    this.b.getValues(this.i);
    localBundle.putFloatArray("matrix", this.i);
    localBundle.putBoolean("imageRendered", this.m);
    return localBundle;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    c();
    f();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    c();
    f();
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    c();
    f();
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    c();
    f();
  }
  
  public void setMaxZoom(float paramFloat)
  {
    this.f = paramFloat;
    this.h = (1.25F * this.f);
  }
  
  public void setMinZoom(float paramFloat)
  {
    this.e = paramFloat;
    this.g = (0.75F * this.e);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.z = paramOnDoubleTapListener;
  }
  
  public void setOnTouchImageViewListener(mw parammw)
  {
    this.B = parammw;
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.A = paramOnTouchListener;
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if ((paramScaleType == ImageView.ScaleType.FIT_START) || (paramScaleType == ImageView.ScaleType.FIT_END)) {
      throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
    }
    if (paramScaleType == ImageView.ScaleType.MATRIX) {
      super.setScaleType(ImageView.ScaleType.MATRIX);
    }
    do
    {
      return;
      this.l = paramScaleType;
    } while (!this.n);
    setZoom(this);
  }
  
  public void setZoom(float paramFloat)
  {
    a(paramFloat, 0.5F, 0.5F);
  }
  
  public void setZoom(TouchImageView paramTouchImageView)
  {
    PointF localPointF = paramTouchImageView.getScrollPosition();
    a(paramTouchImageView.getCurrentZoom(), localPointF.x, localPointF.y, paramTouchImageView.getScaleType());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TouchImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */