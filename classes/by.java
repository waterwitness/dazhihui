import android.support.v4.view.ak;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;

final class by
  extends GestureDetector.SimpleOnGestureListener
{
  by(bx parambx) {}
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((bx.c(this.a) == null) || (this.a.g() > 1.0F)) {}
    while ((ak.c(paramMotionEvent1) > bx.c) || (ak.c(paramMotionEvent2) > bx.c)) {
      return false;
    }
    bx.c(this.a);
    return true;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if (bx.b(this.a) != null) {
      bx.b(this.a).onLongClick(this.a.c());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */