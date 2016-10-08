package com.android.dazhihui.ui.widget;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;

class mx
  implements View.OnTouchListener
{
  private PointF b = new PointF();
  
  private mx(TouchImageView paramTouchImageView) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    TouchImageView.g(this.a).onTouchEvent(paramMotionEvent);
    TouchImageView.h(this.a).onTouchEvent(paramMotionEvent);
    PointF localPointF = new PointF(paramMotionEvent.getX(), paramMotionEvent.getY());
    if ((TouchImageView.c(this.a) == mz.a) || (TouchImageView.c(this.a) == mz.b) || (TouchImageView.c(this.a) == mz.d)) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      this.a.setImageMatrix(TouchImageView.m(this.a));
      if (TouchImageView.o(this.a) != null) {
        TouchImageView.o(this.a).onTouch(paramView, paramMotionEvent);
      }
      if (TouchImageView.p(this.a) != null) {
        TouchImageView.p(this.a).a();
      }
      return true;
      this.b.set(localPointF);
      if (TouchImageView.b(this.a) != null) {
        TouchImageView.b(this.a).a();
      }
      TouchImageView.a(this.a, mz.b);
      continue;
      if (TouchImageView.c(this.a) == mz.b)
      {
        float f3 = localPointF.x;
        float f4 = this.b.x;
        float f1 = localPointF.y;
        float f2 = this.b.y;
        f3 = TouchImageView.a(this.a, f3 - f4, TouchImageView.i(this.a), TouchImageView.j(this.a));
        f1 = TouchImageView.a(this.a, f1 - f2, TouchImageView.k(this.a), TouchImageView.l(this.a));
        TouchImageView.m(this.a).postTranslate(f3, f1);
        TouchImageView.n(this.a);
        this.b.set(localPointF.x, localPointF.y);
        continue;
        TouchImageView.a(this.a, mz.a);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */