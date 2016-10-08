package com.android.dazhihui.d;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.avsdk.pay.PayResult;
import java.util.Map;

class g
  extends Handler
{
  g(e parame) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    paramMessage = new PayResult((String)paramMessage.obj);
    paramMessage.getResult();
    paramMessage = paramMessage.getResultStatus();
    if (TextUtils.equals(paramMessage, "9000")) {
      if (e.d(this.a) != null) {
        e.d(this.a).a();
      }
    }
    while (e.b().containsKey(paramMessage))
    {
      this.a.b((String)e.b().get(paramMessage));
      return;
      if (e.d(this.a) != null) {
        e.d(this.a).b();
      }
    }
    this.a.b("其它错误，支付失败");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */