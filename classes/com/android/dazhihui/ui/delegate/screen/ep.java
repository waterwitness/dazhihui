package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.android.dazhihui.ui.widget.DropDownEditTextView2;
import com.android.dazhihui.ui.widget.gn;

class ep
  implements View.OnFocusChangeListener
{
  ep(dy paramdy) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      dy.y(this.a).a(dy.l(this.a).getMEditText());
      dy.y(this.a).b();
      dy.y(this.a).a(new eq(this));
      return;
    }
    dy.y(this.a).c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */