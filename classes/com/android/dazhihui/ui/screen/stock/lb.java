package com.android.dazhihui.ui.screen.stock;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

class lb
  implements View.OnTouchListener
{
  lb(kz paramkz) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.a.n.setVisibility(8);
      this.a.a(Boolean.valueOf(true), this.a.k);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */