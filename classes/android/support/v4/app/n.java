package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class n
  implements ViewTreeObserver.OnPreDrawListener
{
  n(k paramk, View paramView, p paramp, int paramInt, Object paramObject) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    k.a(this.e, this.b, this.c, this.d);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */