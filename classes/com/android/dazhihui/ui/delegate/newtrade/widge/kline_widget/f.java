package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.delegate.newtrade.TradeDetialScreen;

class f
  extends Handler
{
  f(KlineView paramKlineView) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == 0) {
      KlineView.a(this.a).b(true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */