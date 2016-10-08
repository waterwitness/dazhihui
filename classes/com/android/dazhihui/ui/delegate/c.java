package com.android.dazhihui.ui.delegate;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.g;

class c
  extends Handler
{
  c(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (g.a().o()) {
      g.a().e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */