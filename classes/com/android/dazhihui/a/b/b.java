package com.android.dazhihui.a.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.g;

class b
  extends Handler
{
  b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if ((!a.a(this.a)) && (this.a.e != null)) {
      switch (paramMessage.what)
      {
      }
    }
    for (;;)
    {
      if (a.b(this.a) != null) {
        a.b(this.a).a(paramMessage.what);
      }
      return;
      removeMessages(1);
      removeMessages(2);
      this.a.a(paramMessage.what, paramMessage.obj);
      this.a.e.handleTimeout(this.a);
      a.a(this.a, true);
      if (this.a.a) {
        g.a().c(this.a);
      }
      g.a().b(this.a);
      continue;
      removeMessages(0);
      removeMessages(2);
      this.a.a(paramMessage.what, paramMessage.obj);
      this.a.e.netException(this.a, (Exception)paramMessage.obj);
      a.a(this.a, true);
      g.a().b(this.a);
      continue;
      removeMessages(1);
      removeMessages(0);
      if (this.a.a(paramMessage.what, paramMessage.obj)) {
        this.a.e.netException(this.a, new Exception("Server Exception"));
      } else {
        this.a.e.handleResponse(this.a, (j)paramMessage.obj);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */