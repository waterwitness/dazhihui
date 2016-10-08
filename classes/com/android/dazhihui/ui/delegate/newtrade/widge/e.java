package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.os.Handler;
import android.os.Message;

class e
  extends Handler
{
  e(CaptialTrendChart paramCaptialTrendChart) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (CaptialTrendChart.a(this.a))
    {
    default: 
      if (5 == paramMessage.what)
      {
        CaptialTrendChart.c(this.a, -1);
        CaptialTrendChart.d(this.a, -1);
      }
      break;
    }
    for (;;)
    {
      this.a.invalidate();
      return;
      CaptialTrendChart.a(this.a, 1);
      CaptialTrendChart.b(this.a, 20);
      break;
      CaptialTrendChart.a(this.a, 1);
      CaptialTrendChart.b(this.a, 20);
      break;
      CaptialTrendChart.a(this.a, 2);
      CaptialTrendChart.b(this.a, 20);
      break;
      CaptialTrendChart.a(this.a, 6);
      CaptialTrendChart.b(this.a, 20);
      break;
      CaptialTrendChart.a(this.a, 12);
      CaptialTrendChart.b(this.a, 10);
      break;
      if (6 == paramMessage.what) {
        CaptialTrendChart.a(this.a, false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */