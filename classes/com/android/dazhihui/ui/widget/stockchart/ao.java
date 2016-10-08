package com.android.dazhihui.ui.widget.stockchart;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.ui.widget.MinuteTradeCtrl;

class ao
  implements View.OnClickListener
{
  ao(MinuteChartChildView paramMinuteChartChildView) {}
  
  public void onClick(View paramView)
  {
    paramView = new LinearLayout.LayoutParams(-1, -2);
    if (MinuteChartChildView.a(this.a))
    {
      paramView.height = MinuteChartChildView.b(this.a);
      MinuteChartChildView.a(this.a, false);
      this.a.b.setLine(4);
    }
    for (;;)
    {
      this.a.b.setLayoutParams(paramView);
      this.a.b.requestLayout();
      this.a.b.getParent().requestLayout();
      return;
      paramView.height = (MinuteChartChildView.b(this.a) * 3);
      MinuteChartChildView.a(this.a, true);
      this.a.b.setLine(12);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */