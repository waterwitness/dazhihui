package com.android.dazhihui.ui.screen.stock;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ei
  implements View.OnTouchListener
{
  ei(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      this.a.b(2);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */