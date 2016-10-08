package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class la
  extends Handler
{
  la(StockChartViewflow paramStockChartViewflow) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == StockChartViewflow.b) {
      this.a.f();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */