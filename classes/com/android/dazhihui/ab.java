package com.android.dazhihui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;

class ab
  extends Handler
{
  ab(w paramw, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
    case 0: 
      do
      {
        return;
        w.a(this.a).removeMessages(0);
        w.a(this.a).sendEmptyMessageDelayed(0, 300000L);
      } while ((!com.android.dazhihui.a.g.a().o()) || (!com.android.dazhihui.a.g.a().u()));
      g.a().ar();
      g.a().as();
      w.b(this.a);
      return;
    case 1: 
      SelfSelectedStockManager.getInstance().syncSelfStockByLoginSuccess();
      return;
    }
    if (paramMessage.arg1 == 1) {}
    for (;;)
    {
      this.a.c(bool);
      return;
      bool = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */