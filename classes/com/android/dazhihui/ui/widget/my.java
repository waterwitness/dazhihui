package com.android.dazhihui.ui.widget;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

class my
  extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
  private my(TouchImageView paramTouchImageView) {}
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    TouchImageView.a(this.a, paramScaleGestureDetector.getScaleFactor(), paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY(), true);
    if (TouchImageView.p(this.a) != null) {
      TouchImageView.p(this.a).a();
    }
    return true;
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    TouchImageView.a(this.a, mz.c);
    return true;
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    super.onScaleEnd(paramScaleGestureDetector);
    TouchImageView.a(this.a, mz.a);
    int i = 0;
    float f = TouchImageView.d(this.a);
    if (TouchImageView.d(this.a) > TouchImageView.f(this.a))
    {
      f = TouchImageView.f(this.a);
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        paramScaleGestureDetector = new mt(this.a, f, TouchImageView.i(this.a) / 2, TouchImageView.k(this.a) / 2, true);
        TouchImageView.a(this.a, paramScaleGestureDetector);
      }
      return;
      if (TouchImageView.d(this.a) < TouchImageView.e(this.a))
      {
        f = TouchImageView.e(this.a);
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */