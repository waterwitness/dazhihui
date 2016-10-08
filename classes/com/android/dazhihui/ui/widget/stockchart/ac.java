package com.android.dazhihui.ui.widget.stockchart;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;

class ac
  implements AdapterView.OnItemClickListener
{
  ac(MinChartContainer paramMinChartContainer) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MinChartContainer.c(this.a).dismiss();
    MinChartContainer.d(this.a).setVisibility(0);
    MinChartContainer.e(this.a).setVisibility(0);
    if (paramInt == 0)
    {
      MinChartContainer.f(this.a).setMode(ak.b);
      MinChartContainer.d(this.a).setVisibility(8);
      MinChartContainer.e(this.a).setVisibility(8);
    }
    for (;;)
    {
      MinChartContainer.g(this.a).setText(this.a.getResources().getStringArray(2131361865)[paramInt]);
      return;
      if (paramInt == 1)
      {
        MinChartContainer.f(this.a).setMode(ak.a);
        MinChartContainer.d(this.a).setVisibility(8);
        MinChartContainer.e(this.a).setVisibility(8);
      }
      else if (paramInt == 2)
      {
        MinChartContainer.f(this.a).setMode(ak.c);
        MinChartContainer.d(this.a).setVisibility(8);
        MinChartContainer.e(this.a).setVisibility(8);
      }
      else if (paramInt == 3)
      {
        MinChartContainer.f(this.a).setMode(ak.d);
        MinChartContainer.d(this.a).setVisibility(0);
        MinChartContainer.e(this.a).setVisibility(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */