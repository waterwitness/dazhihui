package com.android.dazhihui.ui.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.g;

class j
  extends Handler
{
  j(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (g.a().o()) {
      g.a().f();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */