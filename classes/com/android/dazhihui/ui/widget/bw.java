package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import java.util.ArrayList;

class bw
  implements View.OnClickListener
{
  bw(bv parambv, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if (this.b.a.d != null) {
      this.b.a.d.a((String)DropDownEditTextView2.e(this.b.a).get(this.a));
    }
    if ((DropDownEditTextView2.c(this.b.a) != null) && (DropDownEditTextView2.c(this.b.a).isShowing())) {
      DropDownEditTextView2.c(this.b.a).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */