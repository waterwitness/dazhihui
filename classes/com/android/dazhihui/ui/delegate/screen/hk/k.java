package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import java.util.ArrayList;

class k
  implements View.OnClickListener
{
  k(j paramj, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if (this.b.a.c != null) {
      this.b.a.c.a((String)DropDownTextView.d(this.b.a).get(this.a));
    }
    if ((DropDownTextView.b(this.b.a) != null) && (DropDownTextView.b(this.b.a).isShowing())) {
      DropDownTextView.b(this.b.a).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */