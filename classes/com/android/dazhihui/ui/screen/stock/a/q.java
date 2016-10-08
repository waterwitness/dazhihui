package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.OptionListActivity;
import java.util.ArrayList;
import java.util.HashMap;

class q
  implements AdapterView.OnItemClickListener
{
  q(l paraml) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ArrayList)this.a.C.get(Integer.valueOf(this.a.j.length));
    if ((paramView != null) && (paramView.size() > paramInt) && (paramInt >= 0))
    {
      if ("SH510050".equals(((MarketStockVo)paramView.get(paramInt)).getStockCode()))
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putString("BUNDLE_OPTION_TITLE", "上证50ETF期权");
        paramAdapterView.putInt("option_type", 20296);
        paramAdapterView.putInt("option_bs_type", 2);
        paramAdapterView.putParcelable("stock_vo", new StockVo(((MarketStockVo)paramView.get(paramInt)).getStockName(), ((MarketStockVo)paramView.get(paramInt)).getStockCode(), 10, false));
        paramView = new Intent(this.a.getActivity(), OptionListActivity.class);
        paramView.putExtras(paramAdapterView);
        this.a.startActivity(paramView);
      }
    }
    else {
      return;
    }
    paramAdapterView = new StockVo(((MarketStockVo)paramView.get(paramInt)).getStockName(), ((MarketStockVo)paramView.get(paramInt)).getStockCode(), ((MarketStockVo)paramView.get(paramInt)).getType(), ((MarketStockVo)paramView.get(paramInt)).isLoanable());
    paramView = new Bundle();
    paramView.putParcelable("stock_vo", paramAdapterView);
    r.a(this.a.getActivity(), paramAdapterView, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */