package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class ed
  implements View.OnClickListener
{
  ed(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void onClick(View paramView)
  {
    GUHDetailBZTJ.l(this.a).dismiss();
    this.a.a(paramView.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */