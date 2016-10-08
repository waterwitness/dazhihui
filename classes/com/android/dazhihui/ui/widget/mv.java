package com.android.dazhihui.ui.widget;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class mv
  extends GestureDetector.SimpleOnGestureListener
{
  private mv(TouchImageView paramTouchImageView) {}
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (TouchImageView.a(this.a) != null) {}
    for (boolean bool = TouchImageView.a(this.a).onDoubleTap(paramMotionEvent);; bool = false)
    {
      if (TouchImageView.c(this.a) == mz.a) {
        if (TouchImageView.d(this.a) != TouchImageView.e(this.a)) {
          break label97;
        }
      }
      label97:
      for (float f = TouchImageView.f(this.a);; f = TouchImageView.e(this.a))
      {
        paramMotionEvent = new mt(this.a, f, paramMotionEvent.getX(), paramMotionEvent.getY(), false);
        TouchImageView.a(this.a, paramMotionEvent);
        bool = true;
        return bool;
      }
    }
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    if (TouchImageView.a(this.a) != null) {
      return TouchImageView.a(this.a).onDoubleTapEvent(paramMotionEvent);
    }
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (TouchImageView.b(this.a) != null) {
      TouchImageView.b(this.a).a();
    }
    TouchImageView.a(this.a, new mu(this.a, (int)paramFloat1, (int)paramFloat2));
    TouchImageView.a(this.a, TouchImageView.b(this.a));
    return super.onFling(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    this.a.performLongClick();
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (TouchImageView.a(this.a) != null) {
      return TouchImageView.a(this.a).onSingleTapConfirmed(paramMotionEvent);
    }
    return this.a.performClick();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */