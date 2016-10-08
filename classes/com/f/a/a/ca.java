package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;

class ca
  extends Handler
{
  ca(br parambr) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (br.b(this.a) != null) {
      br.b(this.a).errorCallBack(paramMessage);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */