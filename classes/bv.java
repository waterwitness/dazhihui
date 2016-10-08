import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;

public final class bv
  implements GestureDetector.OnDoubleTapListener
{
  private bx a;
  
  public bv(bx parambx)
  {
    this.a = parambx;
  }
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {
      return false;
    }
    try
    {
      float f1 = this.a.g();
      float f2 = paramMotionEvent.getX();
      float f3 = paramMotionEvent.getY();
      if (f1 < this.a.e())
      {
        this.a.a(this.a.e(), f2, f3, true);
        return true;
      }
      if ((f1 >= this.a.e()) && (f1 < this.a.f()))
      {
        this.a.a(this.a.f(), f2, f3, true);
        return true;
      }
      this.a.a(this.a.d(), f2, f3, true);
      return true;
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent) {}
    return true;
  }
  
  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {}
    do
    {
      return false;
      this.a.c();
      if (this.a.i() != null)
      {
        RectF localRectF = this.a.b();
        if (localRectF != null)
        {
          if (localRectF.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
          {
            float f = localRectF.left;
            localRectF.width();
            f = localRectF.top;
            localRectF.height();
            this.a.i();
            return true;
          }
          this.a.i();
        }
      }
    } while (this.a.j() == null);
    this.a.j();
    paramMotionEvent.getX();
    paramMotionEvent.getY();
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */