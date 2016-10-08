package com.android.dazhihui.ui.widget.stockchart;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.p;

class aa
  implements p
{
  aa(MinChartContainer paramMinChartContainer) {}
  
  public void onStateChanged(int paramInt)
  {
    if ((paramInt == 1) && (this.a.getResources().getConfiguration().orientation != 1))
    {
      this.a.b.setVisibility(8);
      this.a.b.setTag(Boolean.valueOf(true));
    }
    if (paramInt == 2)
    {
      if (MinChartContainer.a(this.a).getHolder().w != null) {
        MinChartContainer.a(this.a).getHolder().w.setVisibility(8);
      }
      if (MinChartContainer.a(this.a).getHolder().x != null) {
        MinChartContainer.a(this.a).getHolder().x.setVisibility(8);
      }
      if (MinChartContainer.a(this.a).getHolder().v != null) {
        MinChartContainer.a(this.a).getHolder().v.setVisibility(8);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */