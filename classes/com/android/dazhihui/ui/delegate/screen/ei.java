package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.android.dazhihui.ui.widget.gn;

class ei
  implements View.OnFocusChangeListener
{
  ei(dy paramdy) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      dy.y(this.a).a(dy.w(this.a));
      dy.y(this.a).b();
      dy.y(this.a).a(new ej(this));
      return;
    }
    dy.y(this.a).c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */