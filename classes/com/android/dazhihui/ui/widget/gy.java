package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;

class gy
  implements View.OnClickListener
{
  gy(LabelMenu paramLabelMenu) {}
  
  public void onClick(View paramView)
  {
    if (LabelMenu.a(this.a) != 0) {
      LabelMenu.a(this.a, 0);
    }
    for (;;)
    {
      this.a.a();
      if (LabelMenu.b(this.a) != null) {
        LabelMenu.b(this.a).a(LabelMenu.a(this.a));
      }
      return;
      LabelMenu.a(this.a, 1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */