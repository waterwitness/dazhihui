import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;

@TargetApi(5)
public class cf
  extends ci
{
  private int h = -1;
  private int i = 0;
  
  public cf(Context paramContext)
  {
    super(paramContext);
  }
  
  final float a(MotionEvent paramMotionEvent)
  {
    try
    {
      float f = paramMotionEvent.getX(this.i);
      return f;
    }
    catch (Exception localException) {}
    return paramMotionEvent.getX();
  }
  
  final float b(MotionEvent paramMotionEvent)
  {
    try
    {
      float f = paramMotionEvent.getY(this.i);
      return f;
    }
    catch (Exception localException) {}
    return paramMotionEvent.getY();
  }
  
  public boolean c(MotionEvent paramMotionEvent)
  {
    int k = 0;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    do
    {
      for (;;)
      {
        j = k;
        if (this.h != -1) {
          j = this.h;
        }
        this.i = paramMotionEvent.findPointerIndex(j);
        try
        {
          boolean bool = super.c(paramMotionEvent);
          return bool;
        }
        catch (IllegalArgumentException paramMotionEvent) {}
        this.h = paramMotionEvent.getPointerId(0);
        continue;
        this.h = -1;
      }
      j = paramMotionEvent.getAction();
      int m = Build.VERSION.SDK_INT;
      j = (j & 0xFF00) >> 8;
    } while (paramMotionEvent.getPointerId(j) != this.h);
    if (j == 0) {}
    for (int j = 1;; j = 0)
    {
      this.h = paramMotionEvent.getPointerId(j);
      this.b = paramMotionEvent.getX(j);
      this.c = paramMotionEvent.getY(j);
      break;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */