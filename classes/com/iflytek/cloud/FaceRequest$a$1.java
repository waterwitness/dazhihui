package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.thirdparty.X;

class FaceRequest$a$1
  extends Handler
{
  FaceRequest$a$1(FaceRequest.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (FaceRequest.a.a(this.a) == null) {
      return;
    }
    X.a("SpeechListener onMsg = " + paramMessage.what);
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      FaceRequest.a.a(this.a).onEvent(paramMessage.arg1, (Bundle)paramMessage.obj);
      continue;
      FaceRequest.a.a(this.a).onBufferReceived((byte[])paramMessage.obj);
      continue;
      FaceRequest.a.a(this.a).onCompleted((SpeechError)paramMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\FaceRequest$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */