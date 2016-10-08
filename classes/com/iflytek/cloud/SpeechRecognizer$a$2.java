package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechRecognizer$a$2
  extends Handler
{
  SpeechRecognizer$a$2(SpeechRecognizer.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    if (SpeechRecognizer.a.b(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      SpeechRecognizer.a.b(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      SpeechRecognizer.a.b(this.a).onVolumeChanged(paramMessage.arg1, (byte[])paramMessage.obj);
      continue;
      SpeechRecognizer.a.b(this.a).onBeginOfSpeech();
      continue;
      SpeechRecognizer.a.b(this.a).onEndOfSpeech();
      continue;
      Object localObject = SpeechRecognizer.a.b(this.a);
      RecognizerResult localRecognizerResult = (RecognizerResult)paramMessage.obj;
      if (paramMessage.arg1 == 1) {}
      for (;;)
      {
        ((RecognizerListener)localObject).onResult(localRecognizerResult, bool);
        break;
        bool = false;
      }
      localObject = (Message)paramMessage.obj;
      SpeechRecognizer.a.b(this.a).onEvent(((Message)localObject).what, ((Message)localObject).arg1, ((Message)localObject).arg2, (Bundle)((Message)localObject).obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer$a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */