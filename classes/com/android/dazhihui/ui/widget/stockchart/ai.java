package com.android.dazhihui.ui.widget.stockchart;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.delegate.b.o;

class ai
  implements View.OnClickListener
{
  ai(MinChartDetailSwitchView paramMinChartDetailSwitchView, String paramString1, String paramString2) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131560365) {
      o.a(this.c.getRootView().getContext(), 1, this.a, this.b, 0);
    }
    for (;;)
    {
      MinChartDetailSwitchView.e(this.c).dismiss();
      return;
      if (paramView.getId() == 2131560367) {
        o.a(this.c.getRootView().getContext(), 1, this.a, this.b, 1);
      } else if (paramView.getId() == 2131560089) {
        o.a(this.c.getRootView().getContext(), 1, this.a, this.b, 2);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */