package com.android.dazhihui.ui.widget.a;

import android.os.Handler;
import android.os.Message;

class g
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    f localf = (f)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      a.c(localf.a, localf.b[0]);
      return;
    }
    localf.a.b(localf.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */