package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class fb
  implements View.OnClickListener
{
  fb(eu parameu) {}
  
  public void onClick(View paramView)
  {
    if ((eu.n(this.a) != null) && (eu.n(this.a).isShowing())) {
      eu.n(this.a).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */