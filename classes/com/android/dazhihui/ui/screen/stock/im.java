package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.stock.a.l;

class im
  implements AdapterView.OnItemClickListener
{
  im(MarketListScreenActivity paramMarketListScreenActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MarketListScreenActivity.a(this.a).setCurrentChild(paramInt);
    MarketListScreenActivity.b(this.a).a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */