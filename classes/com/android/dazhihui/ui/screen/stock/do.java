package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import com.android.dazhihui.ui.widget.hh;

class do
  implements hh
{
  do(FundStockChartScreen paramFundStockChartScreen) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("name", FundStockChartScreen.b(this.a));
    localBundle.putString("code", FundStockChartScreen.a(this.a));
    localBundle.putBoolean("is_currency", FundStockChartScreen.c(this.a));
    switch (paramInt2)
    {
    default: 
      return;
    case 0: 
      FundStockChartScreen.a(this.a, dt.class, localBundle);
      return;
    case 1: 
      FundStockChartScreen.a(this.a, ds.class, localBundle);
      return;
    case 2: 
      FundStockChartScreen.a(this.a, di.class, localBundle);
      return;
    case 3: 
      FundStockChartScreen.a(this.a, dk.class, localBundle);
      return;
    }
    FundStockChartScreen.a(this.a, dq.class, localBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */