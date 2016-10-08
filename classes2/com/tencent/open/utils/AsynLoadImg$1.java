package com.tencent.open.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.a.f;

class AsynLoadImg$1
  extends Handler
{
  AsynLoadImg$1(AsynLoadImg paramAsynLoadImg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    f.a("AsynLoadImg", "handleMessage:" + paramMessage.arg1);
    if (paramMessage.arg1 == 0)
    {
      AsynLoadImg.a(this.a).saved(paramMessage.arg1, (String)paramMessage.obj);
      return;
    }
    AsynLoadImg.a(this.a).saved(paramMessage.arg1, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\AsynLoadImg$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */