package com.android.dazhihui.ui.widget;

import android.view.View;
import java.lang.ref.WeakReference;

class dw
  implements Runnable
{
  dw(dv paramdv) {}
  
  public void run()
  {
    if (dv.a(this.a).get() == null) {
      return;
    }
    GoldAnimation.f((GoldAnimation)dv.a(this.a).get()).clearAnimation();
    GoldAnimation.b((GoldAnimation)dv.a(this.a).get()).clearAnimation();
    GoldAnimation.d((GoldAnimation)dv.a(this.a).get()).clearAnimation();
    GoldAnimation.f((GoldAnimation)dv.a(this.a).get()).setVisibility(8);
    GoldAnimation.b((GoldAnimation)dv.a(this.a).get()).setVisibility(8);
    GoldAnimation.d((GoldAnimation)dv.a(this.a).get()).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */