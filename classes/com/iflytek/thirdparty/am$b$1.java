package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.WakeuperResult;

class am$b$1
  extends Handler
{
  am$b$1(am.b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (am.b.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      am.b.a(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      if (!(am.b.a(this.a) instanceof am.b))
      {
        am.b.a(this.a).onBeginOfSpeech();
        continue;
        am.b.a(this.a).onResult((WakeuperResult)paramMessage.obj);
        continue;
        am.b.a(this.a).onVolumeChanged(paramMessage.arg1);
        continue;
        Message localMessage = (Message)paramMessage.obj;
        if (localMessage != null) {
          am.b.a(this.a).onEvent(localMessage.what, localMessage.arg1, localMessage.arg2, (Bundle)localMessage.obj);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */