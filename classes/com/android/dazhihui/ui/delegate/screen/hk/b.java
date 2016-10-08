package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class b
  implements View.OnClickListener
{
  b(DropDownCurrencyView paramDropDownCurrencyView) {}
  
  public void onClick(View paramView)
  {
    if (DropDownCurrencyView.a(this.a).getCount() > 0)
    {
      if ((DropDownCurrencyView.b(this.a) != null) && (DropDownCurrencyView.b(this.a).isShowing())) {
        DropDownCurrencyView.b(this.a).dismiss();
      }
    }
    else {
      return;
    }
    DropDownCurrencyView.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */