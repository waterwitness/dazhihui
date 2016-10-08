package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.delegate.b.o;

class dm
  implements AdapterView.OnItemClickListener
{
  dm(FundStockChartScreen paramFundStockChartScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new Bundle();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      o.a(this.a, 1, FundStockChartScreen.a(this.a), null, 11);
      return;
    }
    o.a(this.a, 1, FundStockChartScreen.a(this.a), null, 13);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */