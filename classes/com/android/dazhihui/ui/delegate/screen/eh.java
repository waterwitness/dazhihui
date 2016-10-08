package com.android.dazhihui.ui.delegate.screen;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.gn;

class eh
  implements View.OnTouchListener
{
  eh(dy paramdy) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    dy.y(this.a).b();
    dy.y(this.a).a(dy.w(this.a));
    dy.w(this.a).requestFocus();
    dy.y(this.a).a(paramMotionEvent.getX());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */