package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class aa
  implements Drawable.Callback
{
  aa(x paramx) {}
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    this.a.invalidateSelf();
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    this.a.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    this.a.unscheduleSelf(paramRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */