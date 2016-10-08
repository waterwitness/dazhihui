package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class kz
  extends Handler
{
  kz(StockChartViewPage paramStockChartViewPage) {}
  
  public void handleMessage(Message paramMessage)
  {
    StockChartViewPage.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */