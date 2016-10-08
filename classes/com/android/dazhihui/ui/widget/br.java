package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;

class br
  implements View.OnClickListener
{
  br(DropDownEditTextView2 paramDropDownEditTextView2) {}
  
  public void onClick(View paramView)
  {
    ((InputMethodManager)DropDownEditTextView2.a(this.a).getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    if (DropDownEditTextView2.b(this.a).getCount() > 0)
    {
      if ((DropDownEditTextView2.c(this.a) != null) && (DropDownEditTextView2.c(this.a).isShowing())) {
        DropDownEditTextView2.c(this.a).dismiss();
      }
    }
    else {
      return;
    }
    if (this.a.e != null) {
      this.a.a.sendEmptyMessage(1);
    }
    DropDownEditTextView2.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */