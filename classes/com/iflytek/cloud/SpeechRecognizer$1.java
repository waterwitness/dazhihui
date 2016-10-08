package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechRecognizer$1
  extends Handler
{
  SpeechRecognizer$1(SpeechRecognizer paramSpeechRecognizer, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (SpeechRecognizer.a(this.a) == null) {
      return;
    }
    SpeechRecognizer.a(this.a).onInit(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */