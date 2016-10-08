package com.baidu.location.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.location.e.u;
import com.baidu.location.f;

public class b
  extends Handler
{
  public b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (f.f == true) {
      switch (paramMessage.what)
      {
      }
    }
    for (;;)
    {
      if (paramMessage.what == 1) {
        a.a(this.a);
      }
      if (paramMessage.what == 0) {
        a.b(this.a);
      }
      super.handleMessage(paramMessage);
      return;
      a.a(this.a, paramMessage);
      continue;
      a.b(this.a, paramMessage);
      continue;
      a.c(this.a, paramMessage);
      continue;
      u.b().b(paramMessage);
      continue;
      u.b().j();
      continue;
      u.b().h();
      continue;
      try
      {
        paramMessage.getData();
      }
      catch (Exception localException) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */