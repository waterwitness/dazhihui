package com.android.dazhihui.ui.widget.stockchart;

import android.widget.PopupWindow.OnDismissListener;

class ah
  implements PopupWindow.OnDismissListener
{
  ah(MinChartDetailSwitchView paramMinChartDetailSwitchView) {}
  
  public void onDismiss()
  {
    MinChartDetailSwitchView.a(this.a, -1);
    this.a.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */