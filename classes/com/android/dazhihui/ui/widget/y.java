package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;

class y
  implements View.OnClickListener
{
  y(o paramo) {}
  
  public void onClick(View paramView)
  {
    o.a(this.a).dismiss();
    if (o.d(this.a) == null) {
      return;
    }
    paramView = (TextView)o.d(this.a).getTag(2131558470);
    if ((paramView != null) && (paramView.isSelected()))
    {
      this.a.a("已赞");
      return;
    }
    o.b(this.a).a(o.e(this.a), true, o.c(this.a), null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */