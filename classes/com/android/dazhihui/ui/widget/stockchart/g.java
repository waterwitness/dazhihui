package com.android.dazhihui.ui.widget.stockchart;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.adv.p;

class g
  implements p
{
  g(KChartContainer paramKChartContainer) {}
  
  public void onStateChanged(int paramInt)
  {
    if ((paramInt == 1) && (this.a.getResources().getConfiguration().orientation != 1))
    {
      this.a.f.setVisibility(8);
      this.a.f.setTag(Boolean.valueOf(true));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */