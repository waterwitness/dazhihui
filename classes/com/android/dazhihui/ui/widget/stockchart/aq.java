package com.android.dazhihui.ui.widget.stockchart;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MinuteMenuVo;
import com.android.dazhihui.ui.screen.stock.at;
import com.android.dazhihui.ui.screen.stock.cn;
import com.android.dazhihui.ui.screen.stock.dh;
import com.android.dazhihui.ui.screen.stock.of;
import com.android.dazhihui.ui.screen.stock.oh;
import java.util.List;

class aq
  implements AdapterView.OnItemClickListener
{
  aq(StockChartContainer paramStockChartContainer, int paramInt, String paramString1, String paramString2) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    StockChartContainer.a(this.d).dismiss();
    paramAdapterView = (MinuteMenuVo)StockChartContainer.b(this.d).get(paramInt);
    paramView = new Bundle();
    StockChartContainer.a(this.d, av.f);
    if (paramAdapterView.isIfDeafaule())
    {
      if ((this.a != 1) && (this.a != 16)) {
        break label286;
      }
      this.d.n.setVisibility(8);
      ((RelativeLayout.LayoutParams)StockChartContainer.c(this.d).getLayoutParams()).topMargin = 0;
      if (paramInt != 0) {
        break label164;
      }
      paramView.putString("name", this.b);
      paramView.putString("code", this.c);
      paramView.putInt("type", this.a);
      n.a(this.c, 1141);
      this.d.a(of.class, paramView, 500);
    }
    for (;;)
    {
      this.d.k();
      return;
      label164:
      if (paramInt == 1)
      {
        paramView.putString("name", this.b);
        paramView.putString("code", this.c);
        paramView.putInt("type", this.a);
        n.a(this.c, 1251);
        this.d.a(dh.class, paramView, 500);
      }
      else if (paramInt == 2)
      {
        paramView.putString("name", this.b);
        paramView.putString("code", this.c);
        paramView.putInt("type", this.a);
        n.a(this.c, 1140);
        this.d.a(cn.class, paramView, 500);
        continue;
        label286:
        if (this.a == 0) {
          if (paramInt == 0)
          {
            paramView.putString("name", this.b);
            paramView.putString("code", this.c);
            paramView.putInt("type", this.a);
            paramView.putInt("requestType", 1);
            this.d.a(oh.class, paramView, 500);
            n.a(this.c, 1423);
          }
          else if (paramInt == 1)
          {
            paramView.putString("name", this.b);
            paramView.putString("code", this.c);
            paramView.putInt("type", this.a);
            n.a(this.c, 1421);
            this.d.a(at.class, paramView, 500);
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */