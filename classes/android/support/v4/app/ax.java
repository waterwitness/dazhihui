package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class ax
  extends Transition.EpicenterCallback
{
  private Rect b;
  
  ax(az paramaz) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.b == null) && (this.a.a != null)) {
      this.b = au.b(this.a.a);
    }
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */