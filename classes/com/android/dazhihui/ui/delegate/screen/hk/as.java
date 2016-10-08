package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.gr;

class as
  implements View.OnTouchListener
{
  as(HKEntrust paramHKEntrust) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    HKEntrust.t(this.a).b();
    HKEntrust.r(this.a).requestFocus();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */