package com.android.dazhihui.ui.delegate.screen.newstock;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class k
  implements View.OnTouchListener
{
  k(j paramj, int paramInt) {}
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1) {
      j.a(this.b, this.a);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */