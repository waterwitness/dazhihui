package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class hw
  implements View.OnClickListener
{
  hw(hv paramhv) {}
  
  public void onClick(View paramView)
  {
    hv.a(this.a).dismiss();
    if (hv.b(this.a) != null) {
      hv.b(this.a).a(hv.c(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */