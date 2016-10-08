package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;

class bh
  implements View.OnClickListener
{
  bh(DropDownEditTextView paramDropDownEditTextView) {}
  
  public void onClick(View paramView)
  {
    ((InputMethodManager)DropDownEditTextView.a(this.a).getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    if (DropDownEditTextView.b(this.a).getCount() > 0)
    {
      if ((DropDownEditTextView.c(this.a) != null) && (DropDownEditTextView.c(this.a).isShowing())) {
        DropDownEditTextView.c(this.a).dismiss();
      }
    }
    else {
      return;
    }
    if (this.a.e != null) {
      this.a.a.sendEmptyMessage(1);
    }
    DropDownEditTextView.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */