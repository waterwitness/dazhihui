package com.android.dazhihui.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.b.o;

class f
  extends Handler
{
  f(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      b.a(this.a, (o)paramMessage.obj);
      return;
    }
    b.b(this.a, (o)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */