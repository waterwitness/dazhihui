package android.support.v4.app;

import android.support.v4.c.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

class m
  implements ViewTreeObserver.OnPreDrawListener
{
  m(k paramk, View paramView, Object paramObject, ArrayList paramArrayList, p paramp, boolean paramBoolean, Fragment paramFragment1, Fragment paramFragment2) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      au.a(this.b, this.c);
      this.c.clear();
      a locala = k.a(this.h, this.d, this.e, this.f);
      au.a(this.b, this.d.d, locala, this.c);
      k.a(this.h, locala, this.d);
      k.a(this.h, this.d, this.f, this.g, this.e, locala);
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */