package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

class z$a$1
  extends Handler
{
  z$a$1(z.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (z.a.a(this.a) == null) {
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
      z.a.a(this.a).onEvent(paramMessage.arg1, (Bundle)paramMessage.obj);
      continue;
      z.a.a(this.a).onBufferReceived((byte[])paramMessage.obj);
      continue;
      z.a.a(this.a).onCompleted((SpeechError)paramMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\z$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */