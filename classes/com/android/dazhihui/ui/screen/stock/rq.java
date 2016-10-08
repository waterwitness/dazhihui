package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.WarningItem;
import java.util.List;

class rq
  implements AdapterView.OnItemClickListener
{
  rq(SearchStockScreen paramSearchStockScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (SearchStockScreen.g(this.a) == 3)
    {
      com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalSettingActivity.i = SearchStockScreen.h(this.a)[paramInt];
      com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalSettingActivity.j = SearchStockScreen.i(this.a)[paramInt];
      com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalSettingActivity.k = SearchStockScreen.j(this.a)[paramInt];
      this.a.finish();
    }
    do
    {
      do
      {
        return;
      } while (!SearchStockScreen.k(this.a));
      if (SearchStockScreen.l(this.a) == 0)
      {
        if ((SearchStockScreen.m(this.a) != null) && (paramInt < SearchStockScreen.m(this.a).length) && (SearchStockScreen.m(this.a)[paramInt].startsWith("BI")))
        {
          paramView = new MarketVo(SearchStockScreen.i(this.a)[paramInt], false, false, -1);
          paramAdapterView = new Bundle();
          paramAdapterView.putString("code", SearchStockScreen.m(this.a)[paramInt]);
          paramAdapterView.putParcelable("market_vo", paramView);
          paramView = new Intent();
          paramView.putExtras(paramAdapterView);
          paramView.setClass(this.a, PlateListScreen.class);
          this.a.startActivity(paramView);
          this.a.finish();
          return;
        }
        this.a.a(paramInt);
        return;
      }
      if (SearchStockScreen.l(this.a) == 1)
      {
        paramAdapterView = new Bundle();
        int i = n.r(SearchStockScreen.h(this.a)[paramInt]);
        if (i >= 0)
        {
          paramAdapterView.putInt("screenId", 8002);
          SearchStockScreen.a(this.a, (WarningItem)SearchStockScreen.n(this.a).get(i));
        }
        for (;;)
        {
          paramAdapterView.putString("name", SearchStockScreen.i(this.a)[paramInt]);
          paramAdapterView.putString("code", SearchStockScreen.h(this.a)[paramInt]);
          this.a.startActivity(AddWarningActivity.class, paramAdapterView);
          this.a.finish();
          return;
          paramAdapterView.putInt("screenId", 8001);
        }
      }
      if (SearchStockScreen.l(this.a) == 2)
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putString("name", SearchStockScreen.i(this.a)[paramInt]);
        paramAdapterView.putString("code", SearchStockScreen.h(this.a)[paramInt]);
        paramAdapterView.putString("type", String.valueOf(SearchStockScreen.j(this.a)[paramInt]));
        this.a.finish();
        return;
      }
    } while (SearchStockScreen.l(this.a) != 3);
    if (SearchStockScreen.g(this.a) == 1)
    {
      SearchStockScreen.o(this.a).a("LEFT_INDEX_CODE", SearchStockScreen.h(this.a)[paramInt]);
      SearchStockScreen.o(this.a).a("LEFT_INDEX_NAME", SearchStockScreen.i(this.a)[paramInt]);
      SearchStockScreen.o(this.a).a("LEFT_INDEX_TYPE", SearchStockScreen.j(this.a)[paramInt]);
      SearchStockScreen.o(this.a).g();
    }
    for (;;)
    {
      this.a.finish();
      return;
      if (SearchStockScreen.g(this.a) == 2)
      {
        SearchStockScreen.o(this.a).a("RIGHT_INDEX_CODE", SearchStockScreen.h(this.a)[paramInt]);
        SearchStockScreen.o(this.a).a("RIGHT_INDEX_NAME", SearchStockScreen.i(this.a)[paramInt]);
        SearchStockScreen.o(this.a).a("RIGHT_INDEX_TYPE", SearchStockScreen.j(this.a)[paramInt]);
        SearchStockScreen.o(this.a).g();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */