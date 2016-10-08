package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.List;

class ev
  implements AdapterView.OnItemClickListener
{
  ev(IndexStockChartBottomWidget paramIndexStockChartBottomWidget) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (IndexStockChartBottomWidget.g(this.a).getVisibility() != 0)
    {
      this.a.a(IndexStockChartBottomWidget.h(this.a).u().getCode(), IndexStockChartBottomWidget.h(this.a).y());
      n.a(IndexStockChartBottomWidget.h(this.a).u().getCode(), 20304);
      IndexStockChartBottomWidget.i(this.a).setVisibility(0);
      IndexStockChartBottomWidget.g(this.a).startAnimation(IndexStockChartBottomWidget.j(this.a));
      IndexStockChartBottomWidget.g(this.a).setVisibility(0);
      IndexStockChartBottomWidget.k(this.a).setImageResource(2130838245);
      IndexStockChartBottomWidget.l(this.a).getSelectedItemPosition();
      if (IndexStockChartBottomWidget.m(this.a).size() != 0) {
        IndexStockChartBottomWidget.m(this.a).size();
      }
      IndexStockChartBottomWidget.n(this.a);
      return;
    }
    this.a.d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */