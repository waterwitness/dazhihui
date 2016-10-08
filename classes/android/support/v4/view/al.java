package android.support.v4.view;

import android.view.MotionEvent;

class al
  implements ap
{
  public int a(MotionEvent paramMotionEvent)
  {
    return 1;
  }
  
  public int a(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    return -1;
  }
  
  public int b(MotionEvent paramMotionEvent)
  {
    return 0;
  }
  
  public int b(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float c(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getX();
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float d(MotionEvent paramMotionEvent, int paramInt)
  {
    if (paramInt == 0) {
      return paramMotionEvent.getY();
    }
    throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
  }
  
  public float e(MotionEvent paramMotionEvent, int paramInt)
  {
    return 0.0F;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */