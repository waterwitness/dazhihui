package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.widget.stockchart.FastDealMenu;
import com.android.dazhihui.ui.widget.stockchart.FastDealsView;
import com.android.dazhihui.ui.widget.stockchart.MinChartContainer;
import com.android.dazhihui.ui.widget.stockchart.MinChartDetailSwitchView;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.f;

class vj
  implements View.OnClickListener
{
  vj(uv paramuv, f paramf) {}
  
  public void onClick(View paramView)
  {
    if (this.a == f.a)
    {
      ah.a().a(uv.d(this.b).getDealPrice(), uv.d(this.b).getDealCount(), 0, uv.e(this.b).getCode().substring(2, uv.e(this.b).getCode().length()));
      this.b.a(uv.d(this.b).getDealPrice(), 0);
    }
    for (;;)
    {
      uv.c(this.b).dismiss();
      uv.d(this.b).c();
      uv.d(this.b).setVisibility(8);
      uv.d(this.b).setKeyViewVisibility(8);
      uv.f(this.b).setVisibility(8);
      uv.a(this.b).getMinChartContainer().getDetailSwitchView().setEnableChange(true);
      return;
      ah.a().a(uv.d(this.b).getDealPrice(), uv.d(this.b).getDealCount(), 1, uv.e(this.b).getCode().substring(2, uv.e(this.b).getCode().length()));
      this.b.a(uv.d(this.b).getDealPrice(), 1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */