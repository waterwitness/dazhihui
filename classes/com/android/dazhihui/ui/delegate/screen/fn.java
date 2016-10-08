package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;

class fn
  implements View.OnClickListener
{
  fn(fi paramfi) {}
  
  public void onClick(View paramView)
  {
    if (fi.m(this.a)) {
      fi.b(this.a, Integer.parseInt(fi.n(this.a).getText().toString()));
    }
    for (;;)
    {
      fi.o(this.a);
      fi.p(this.a).dismiss();
      return;
      fi.b(this.a, Integer.parseInt(fi.n(this.a).getText().toString()) * 24 * 60);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */