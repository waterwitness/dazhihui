package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

class du
  implements Runnable
{
  WeakReference<View> a;
  dr b;
  
  private du(dt paramdt, dr paramdr, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramdr;
  }
  
  public void run()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      dt.a(this.c, this.b, localView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */