package com.tencent.connect.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

class BaseApi$TempRequestListener$1
  extends Handler
{
  BaseApi$TempRequestListener$1(BaseApi.TempRequestListener paramTempRequestListener, Looper paramLooper, BaseApi paramBaseApi)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      BaseApi.TempRequestListener.access$000(this.this$1).onComplete(paramMessage.obj);
      return;
    }
    BaseApi.TempRequestListener.access$000(this.this$1).onError(new UiError(paramMessage.what, (String)paramMessage.obj, null));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\BaseApi$TempRequestListener$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */