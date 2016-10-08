package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechError;

class am$c$1
  extends Handler
{
  am$c$1(am.c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (am.c.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      am.c.a(this.a).onEvent(paramMessage.arg1, (Bundle)paramMessage.obj);
      continue;
      am.c.a(this.a).onBufferReceived((byte[])paramMessage.obj);
      continue;
      am.c.a(this.a).onCompleted((SpeechError)paramMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */