package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.EvaluatorListener;
import com.iflytek.cloud.EvaluatorResult;
import com.iflytek.cloud.SpeechError;

class ah$a$1
  extends Handler
{
  ah$a$1(ah.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    if (ah.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      ah.a.a(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      ah.a.a(this.a).onVolumeChanged(paramMessage.arg1, (byte[])paramMessage.obj);
      continue;
      ah.a.a(this.a).onBeginOfSpeech();
      continue;
      ah.a.a(this.a).onEndOfSpeech();
      continue;
      Object localObject = ah.a.a(this.a);
      EvaluatorResult localEvaluatorResult = (EvaluatorResult)paramMessage.obj;
      if (paramMessage.arg1 == 1) {}
      for (;;)
      {
        ((EvaluatorListener)localObject).onResult(localEvaluatorResult, bool);
        break;
        bool = false;
      }
      localObject = (Message)paramMessage.obj;
      ah.a.a(this.a).onEvent(((Message)localObject).what, ((Message)localObject).arg1, ((Message)localObject).arg2, (Bundle)((Message)localObject).obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ah$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */