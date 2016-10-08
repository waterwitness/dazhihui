package com.android.dazhihui.ui.delegate.screen;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.gn;

class fz
  implements View.OnTouchListener
{
  fz(fi paramfi) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    fi.l(this.a).b();
    fi.l(this.a).a(fi.j(this.a));
    fi.j(this.a).requestFocus();
    fi.l(this.a).a(paramMotionEvent.getX());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */