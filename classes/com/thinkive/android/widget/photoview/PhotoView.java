package com.thinkive.android.widget.photoview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import bw;
import bx;
import cb;
import cc;
import cd;
import ce;

public class PhotoView
  extends ImageView
  implements bw
{
  private bx a;
  private ImageView.ScaleType b;
  
  public PhotoView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setScaleType(ImageView.ScaleType.MATRIX);
    a();
  }
  
  private void a()
  {
    if ((this.a == null) || (this.a.c() == null)) {
      this.a = new bx(this);
    }
    if (this.b != null)
    {
      setScaleType(this.b);
      this.b = null;
    }
  }
  
  public ImageView.ScaleType getScaleType()
  {
    return this.a.h();
  }
  
  protected void onAttachedToWindow()
  {
    a();
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    this.a.a();
    super.onDetachedFromWindow();
  }
  
  public void setAllowParentInterceptOnEdge(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    if (this.a != null) {
      this.a.k();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
    if (this.a != null) {
      this.a.k();
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    if (this.a != null) {
      this.a.k();
    }
  }
  
  @Deprecated
  public void setMaxScale(float paramFloat)
  {
    setMaximumScale(paramFloat);
  }
  
  public void setMaximumScale(float paramFloat)
  {
    this.a.e(paramFloat);
  }
  
  public void setMediumScale(float paramFloat)
  {
    this.a.d(paramFloat);
  }
  
  @Deprecated
  public void setMidScale(float paramFloat)
  {
    setMediumScale(paramFloat);
  }
  
  @Deprecated
  public void setMinScale(float paramFloat)
  {
    setMinimumScale(paramFloat);
  }
  
  public void setMinimumScale(float paramFloat)
  {
    this.a.c(paramFloat);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.a.a(paramOnDoubleTapListener);
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.a.a(paramOnLongClickListener);
  }
  
  public void setOnMatrixChangeListener(cb paramcb)
  {
    this.a.a(paramcb);
  }
  
  public void setOnPhotoTapListener(cc paramcc)
  {
    this.a.a(paramcc);
  }
  
  public void setOnScaleChangeListener(cd paramcd)
  {
    this.a.a(paramcd);
  }
  
  public void setOnSingleFlingListener(ce paramce)
  {
    this.a.a(paramce);
  }
  
  public void setOnViewTapListener$2357ba04(cd paramcd)
  {
    this.a.b(paramcd);
  }
  
  public void setPhotoViewRotation(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public void setRotationBy(float paramFloat)
  {
    this.a.b(paramFloat);
  }
  
  public void setRotationTo(float paramFloat)
  {
    this.a.a(paramFloat);
  }
  
  public void setScale(float paramFloat)
  {
    this.a.f(paramFloat);
  }
  
  public void setScale(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    this.a.a(paramFloat1, paramFloat2, paramFloat3, paramBoolean);
  }
  
  public void setScale(float paramFloat, boolean paramBoolean)
  {
    this.a.a(paramFloat, paramBoolean);
  }
  
  public void setScaleLevels(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a.b(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (this.a != null)
    {
      this.a.a(paramScaleType);
      return;
    }
    this.b = paramScaleType;
  }
  
  public void setZoomTransitionDuration(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void setZoomable(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\widget\photoview\PhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */