package com.android.dazhihui.ui.screen.stock;

import android.support.v4.app.FragmentActivity;
import com.android.dazhihui.ui.widget.lh;
import com.android.dazhihui.ui.widget.stockchart.KChartContainer;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.av;
import com.android.dazhihui.ui.widget.stockchart.s;

class uw
  implements lh
{
  uw(uv paramuv) {}
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      uv.a(this.a).a(av.a);
      return;
    case 1: 
      uv.a(this.a).a(av.b);
      uv.a(this.a).getKChartContainer().a(s.g, false);
      return;
    case 2: 
      uv.a(this.a).a(av.b);
      uv.a(this.a).getKChartContainer().a(s.h, false);
      return;
    case 3: 
      uv.a(this.a).a(av.b);
      uv.a(this.a).getKChartContainer().a(s.i, false);
      return;
    case 4: 
      this.a.a();
      return;
    }
    this.a.getActivity().setRequestedOrientation(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */