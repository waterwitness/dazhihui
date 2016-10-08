package com.android.dazhihui.ui.screen;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ViewFlipper;

class r
  implements ViewTreeObserver.OnPreDrawListener
{
  r(InitScreen paramInitScreen) {}
  
  public boolean onPreDraw()
  {
    this.a.a();
    InitScreen.b(this.a).getViewTreeObserver().removeOnPreDrawListener(InitScreen.a(this.a));
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */