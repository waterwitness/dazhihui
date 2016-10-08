import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class ci
{
  protected cj a;
  float b;
  float c;
  final float d;
  final float e;
  VelocityTracker f;
  boolean g;
  
  public ci(Context paramContext)
  {
    paramContext = ViewConfiguration.get(paramContext);
    this.e = paramContext.getScaledMinimumFlingVelocity();
    this.d = paramContext.getScaledTouchSlop();
  }
  
  float a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getX();
  }
  
  public void a(cj paramcj)
  {
    this.a = paramcj;
  }
  
  public boolean a()
  {
    return false;
  }
  
  float b(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getY();
  }
  
  public boolean b()
  {
    return this.g;
  }
  
  public boolean c(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      float f1;
      float f2;
      do
      {
        do
        {
          float f3;
          float f4;
          do
          {
            return true;
            this.f = VelocityTracker.obtain();
            if (this.f != null) {
              this.f.addMovement(paramMotionEvent);
            }
            for (;;)
            {
              this.b = a(paramMotionEvent);
              this.c = b(paramMotionEvent);
              this.g = false;
              return true;
              ck.a().b("CupcakeGestureDetector", "Velocity tracker is null");
            }
            f1 = a(paramMotionEvent);
            f2 = b(paramMotionEvent);
            f3 = f1 - this.b;
            f4 = f2 - this.c;
            if (!this.g)
            {
              if (Math.sqrt(f3 * f3 + f4 * f4) >= this.d) {
                bool = true;
              }
              this.g = bool;
            }
          } while (!this.g);
          this.a.a(f3, f4);
          this.b = f1;
          this.c = f2;
        } while (this.f == null);
        this.f.addMovement(paramMotionEvent);
        return true;
      } while (this.f == null);
      this.f.recycle();
      this.f = null;
      return true;
      if ((this.g) && (this.f != null))
      {
        this.b = a(paramMotionEvent);
        this.c = b(paramMotionEvent);
        this.f.addMovement(paramMotionEvent);
        this.f.computeCurrentVelocity(1000);
        f1 = this.f.getXVelocity();
        f2 = this.f.getYVelocity();
        if (Math.max(Math.abs(f1), Math.abs(f2)) >= this.e) {
          this.a.a(this.b, this.c, -f1, -f2);
        }
      }
    } while (this.f == null);
    this.f.recycle();
    this.f = null;
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */