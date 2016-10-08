package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.model.stock.MarketVo;

class ik
  implements AdapterView.OnItemClickListener
{
  ik(MarketListScreen paramMarketListScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MarketListScreen.g(this.a).setCurrentChild(paramInt);
    MarketListScreen.h(this.a);
    this.a.init(null);
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */