package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.stockchart.StockChartHeaderTitleView;

class va
  implements AdapterView.OnItemClickListener
{
  va(uv paramuv, View paramView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0)
    {
      paramAdapterView = uv.e(this.b).getCode();
      paramView = uv.e(this.b).getName();
      if (m.a().b().exitSelfStock(paramAdapterView))
      {
        m.a().b().removeSelfStock(paramAdapterView);
        ((StockChartHeaderTitleView)this.a).a();
        uv.c(this.b).dismiss();
      }
    }
    do
    {
      return;
      m.a().b().addSelfStock(paramAdapterView, paramView);
      break;
      if (paramInt == 1)
      {
        n.a(uv.e(this.b).getCode(), 1414);
        this.b.g();
        uv.c(this.b).dismiss();
        return;
      }
      if (paramInt == 2)
      {
        uv.c(this.b).dismiss();
        this.b.i();
        return;
      }
      if (paramInt == 3)
      {
        uv.a(this.b, uv.e(this.b).getName(), uv.e(this.b));
        n.a(uv.e(this.b).getCode(), 1385);
        uv.c(this.b).dismiss();
        return;
      }
    } while (paramInt != 4);
    paramView = d.a();
    paramAdapterView = "BLACK_SKIN";
    if (uv.k(this.b) == y.a)
    {
      g.a().a(y.b);
      paramView.a("dzh_look_face", 1);
      paramView.g();
      uv.a(this.b, y.b);
    }
    for (;;)
    {
      this.b.changeLookFace(uv.l(this.b));
      uv.c(this.b).dismiss();
      n.a(paramAdapterView, 20116);
      return;
      g.a().a(y.a);
      paramView.a("dzh_look_face", 0);
      paramView.g();
      uv.b(this.b, y.a);
      paramAdapterView = "WHITE_SKIN";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */