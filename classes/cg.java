import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

@TargetApi(8)
public final class cg
  extends cf
{
  private ScaleGestureDetector h = new ScaleGestureDetector(paramContext, new ch(this));
  
  public cg(Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean a()
  {
    return this.h.isInProgress();
  }
  
  public final boolean c(MotionEvent paramMotionEvent)
  {
    try
    {
      this.h.onTouchEvent(paramMotionEvent);
      boolean bool = super.c(paramMotionEvent);
      return bool;
    }
    catch (IllegalArgumentException paramMotionEvent) {}
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */