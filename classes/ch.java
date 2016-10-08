import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

final class ch
  implements ScaleGestureDetector.OnScaleGestureListener
{
  ch(cg paramcg) {}
  
  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f = paramScaleGestureDetector.getScaleFactor();
    if ((Float.isNaN(f)) || (Float.isInfinite(f))) {
      return false;
    }
    this.a.a.a(f, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    return true;
  }
  
  public final boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }
  
  public final void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */