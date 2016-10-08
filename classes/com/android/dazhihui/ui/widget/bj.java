package com.android.dazhihui.ui.widget;

import android.widget.EditText;

class bj
  implements Runnable
{
  bj(DropDownEditTextView paramDropDownEditTextView) {}
  
  public void run()
  {
    if (DropDownEditTextView.f(this.a).getVisibility() != 0) {
      DropDownEditTextView.f(this.a).setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */