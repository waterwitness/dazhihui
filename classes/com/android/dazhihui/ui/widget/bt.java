package com.android.dazhihui.ui.widget;

import android.widget.EditText;

class bt
  implements Runnable
{
  bt(DropDownEditTextView2 paramDropDownEditTextView2) {}
  
  public void run()
  {
    if (DropDownEditTextView2.f(this.a).getVisibility() != 0) {
      DropDownEditTextView2.f(this.a).setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */