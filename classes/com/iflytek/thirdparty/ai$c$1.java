package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;

class ai$c$1
  extends Handler
{
  ai$c$1(ai.c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (ai.c.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      ai.c.a(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      ai.c.a(this.a).onVolumeChanged(paramMessage.arg1, (byte[])paramMessage.obj);
      continue;
      ai.c.a(this.a).onBeginOfSpeech();
      continue;
      ai.c.a(this.a).onEndOfSpeech();
      continue;
      Object localObject = ai.c.a(this.a);
      RecognizerResult localRecognizerResult = (RecognizerResult)paramMessage.obj;
      if (paramMessage.arg1 == 1) {}
      for (boolean bool = true;; bool = false)
      {
        ((RecognizerListener)localObject).onResult(localRecognizerResult, bool);
        if (!ai.c.b(this.a))
        {
          this.a.a.b("ui_frs");
          ai.c.a(this.a, true);
        }
        if (1 != paramMessage.arg1) {
          break;
        }
        this.a.a.b("ui_lrs");
        break;
      }
      localObject = (Message)paramMessage.obj;
      ai.c.a(this.a).onEvent(((Message)localObject).what, ((Message)localObject).arg1, ((Message)localObject).arg2, (Bundle)((Message)localObject).obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */