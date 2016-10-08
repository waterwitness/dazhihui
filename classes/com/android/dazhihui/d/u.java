package com.android.dazhihui.d;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

final class u
  implements View.OnClickListener
{
  u(PopupWindow paramPopupWindow) {}
  
  public void onClick(View paramView)
  {
    if ((this.a != null) && (this.a.isShowing())) {
      this.a.dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */