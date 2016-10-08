package com.android.dazhihui.d;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.app.b;

class f
  implements Runnable
{
  f(e parame, String paramString) {}
  
  public void run()
  {
    String str = new b(e.a(this.b)).a(this.a, true);
    Message localMessage = new Message();
    localMessage.what = e.b(this.b);
    localMessage.obj = str;
    e.c(this.b).sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */