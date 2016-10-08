package com.android.dazhihui.ui.screen.stock;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

class ku
  implements View.OnTouchListener
{
  ku(ju paramju) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.a.d.setVisibility(8);
      this.a.a(Boolean.valueOf(true), this.a.c);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */