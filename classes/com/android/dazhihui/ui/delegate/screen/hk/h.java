package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class h
  implements View.OnClickListener
{
  h(DropDownTextView paramDropDownTextView) {}
  
  public void onClick(View paramView)
  {
    if (DropDownTextView.a(this.a).getCount() > 0)
    {
      if ((DropDownTextView.b(this.a) != null) && (DropDownTextView.b(this.a).isShowing())) {
        DropDownTextView.b(this.a).dismiss();
      }
    }
    else {
      return;
    }
    DropDownTextView.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */