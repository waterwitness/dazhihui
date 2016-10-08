package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.OptionListActivity;

class ai
  implements AdapterView.OnItemClickListener
{
  ai(af paramaf) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Bundle();
    paramAdapterView.putString("BUNDLE_OPTION_TITLE", "上证50ETF期权");
    paramAdapterView.putInt("option_type", 20296);
    paramAdapterView.putInt("option_bs_type", 2);
    paramAdapterView.putParcelable("stock_vo", new StockVo(af.f()[0], af.g()[0], 10, false));
    paramView = new Intent(this.a.getActivity(), OptionListActivity.class);
    paramView.putExtras(paramAdapterView);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */