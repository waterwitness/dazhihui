package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;

class it
  implements View.OnClickListener
{
  it(io paramio) {}
  
  public void onClick(View paramView)
  {
    io.a(this.a).dismiss();
    if (io.d(this.a) == null) {
      return;
    }
    paramView = (TextView)io.d(this.a).getTag(2131558470);
    if ((paramView != null) && (paramView.isSelected()))
    {
      this.a.a("已赞");
      return;
    }
    io.b(this.a).a(io.e(this.a), true, io.c(this.a), null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\it.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */