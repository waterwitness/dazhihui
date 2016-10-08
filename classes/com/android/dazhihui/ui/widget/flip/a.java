package com.android.dazhihui.ui.widget.flip;

import android.os.Handler;
import android.os.Message;
import android.widget.Adapter;

class a
  extends Handler
{
  a(ViewFlow paramViewFlow) {}
  
  public void handleMessage(Message paramMessage)
  {
    if ((ViewFlow.a(this.a) != null) && (ViewFlow.a(this.a).getCount() > 1))
    {
      this.a.a(true);
      if (ViewFlow.b(this.a) == null) {
        break label100;
      }
      if ((ViewFlow.c(this.a) != -1) && (ViewFlow.c(this.a) < ViewFlow.b(this.a).length)) {
        sendMessageDelayed(obtainMessage(0), ViewFlow.b(this.a)[ViewFlow.c(this.a)]);
      }
    }
    return;
    label100:
    sendMessageDelayed(obtainMessage(0), ViewFlow.d(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */