package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechUnderstander$a$2
  extends Handler
{
  SpeechUnderstander$a$2(SpeechUnderstander.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (SpeechUnderstander.a.c(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      SpeechUnderstander.a.c(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      SpeechUnderstander.a.c(this.a).onVolumeChanged(paramMessage.arg1, (byte[])paramMessage.obj);
      continue;
      SpeechUnderstander.a.c(this.a).onBeginOfSpeech();
      continue;
      SpeechUnderstander.a.c(this.a).onEndOfSpeech();
      continue;
      SpeechUnderstander.a.c(this.a).onResult((UnderstanderResult)paramMessage.obj);
      continue;
      Message localMessage = (Message)paramMessage.obj;
      SpeechUnderstander.a.c(this.a).onEvent(localMessage.what, localMessage.arg1, localMessage.arg2, (Bundle)localMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUnderstander$a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */