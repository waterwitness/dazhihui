package android.support.v4.view;

import android.view.MotionEvent;

class aq
{
  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getPointerCount();
  }
  
  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.findPointerIndex(paramInt);
  }
  
  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getPointerId(paramInt);
  }
  
  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getX(paramInt);
  }
  
  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getY(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */