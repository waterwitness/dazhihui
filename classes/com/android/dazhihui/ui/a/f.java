package com.android.dazhihui.ui.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.g;

class f
  extends Handler
{
  f(e parame, Looper paramLooper)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */