package com.tencent.connect.share;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.utils.AsynLoadImgBack;

final class a$3
  extends Handler
{
  a$3(Looper paramLooper, AsynLoadImgBack paramAsynLoadImgBack)
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
    }
    paramMessage = paramMessage.getData().getStringArrayList("images");
    this.a.batchSaved(0, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\a$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */