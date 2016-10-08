package com.tencent.connect.share;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.utils.AsynLoadImgBack;

final class a$1
  extends Handler
{
  a$1(Looper paramLooper, AsynLoadImgBack paramAsynLoadImgBack)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    case 101: 
      paramMessage = (String)paramMessage.obj;
      this.a.saved(0, paramMessage);
      return;
    }
    int i = paramMessage.arg1;
    this.a.saved(i, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */