package com.android.dazhihui.ui.widget.flip;

import android.os.Handler;
import android.os.Message;
import android.widget.Adapter;

class g
  extends Handler
{
  g(ViewUpFlow paramViewUpFlow) {}
  
  public void handleMessage(Message paramMessage)
  {
    if ((ViewUpFlow.a(this.a) != null) && (ViewUpFlow.a(this.a).getCount() > 1))
    {
      this.a.a(true);
      sendMessageDelayed(obtainMessage(0), ViewUpFlow.b(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */