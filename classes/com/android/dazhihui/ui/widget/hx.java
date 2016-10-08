package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;

class hx
  implements View.OnClickListener
{
  hx(hv paramhv) {}
  
  public void onClick(View paramView)
  {
    hv.a(this.a).dismiss();
    if (hv.d(this.a) == null) {
      return;
    }
    paramView = (TextView)hv.d(this.a).getTag(2131558470);
    if ((paramView != null) && (paramView.isSelected()))
    {
      this.a.a("已赞");
      return;
    }
    hv.b(this.a).a(hv.e(this.a), true, hv.c(this.a), null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */