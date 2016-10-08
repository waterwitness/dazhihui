package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.service.u;
import com.android.dazhihui.ui.model.stock.HotVideoVo;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;

class vm
  implements u
{
  vm(uv paramuv) {}
  
  public void a(HotVideoVo paramHotVideoVo)
  {
    if (uv.a(this.a) != null) {
      uv.a(this.a).postDelayed(new vn(this, paramHotVideoVo), 200L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */