package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.model.stock.MarketManager;

class hx
  extends Handler
{
  hx(hw paramhw) {}
  
  public void handleMessage(Message paramMessage)
  {
    MarketManager.get().sendMarketType();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */