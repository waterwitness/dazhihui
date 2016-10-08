package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.widget.PullDownView;

class ot
  extends Handler
{
  ot(ProfitExpectedScreen paramProfitExpectedScreen) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (ProfitExpectedScreen.a(this.a) != null) {
      ProfitExpectedScreen.a(this.a).a(paramMessage.what);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */