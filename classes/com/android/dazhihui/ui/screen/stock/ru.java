package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ListView;

class ru
  extends Handler
{
  public ru(SearchStockScreen paramSearchStockScreen, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      if (SearchStockScreen.q(this.a) == null)
      {
        SearchStockScreen.a(this.a, new rv(this.a, SearchStockScreen.r(this.a), SearchStockScreen.i(this.a), SearchStockScreen.s(this.a), SearchStockScreen.h(this.a), SearchStockScreen.j(this.a)));
        SearchStockScreen.t(this.a).setAdapter(SearchStockScreen.q(this.a));
      }
      for (;;)
      {
        SearchStockScreen.c(this.a, true);
        return;
        SearchStockScreen.q(this.a).a(SearchStockScreen.r(this.a), SearchStockScreen.i(this.a), SearchStockScreen.s(this.a), SearchStockScreen.h(this.a), SearchStockScreen.j(this.a));
      }
    }
    SearchStockScreen.c(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */