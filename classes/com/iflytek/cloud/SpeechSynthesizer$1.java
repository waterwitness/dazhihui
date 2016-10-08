package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechSynthesizer$1
  extends Handler
{
  SpeechSynthesizer$1(SpeechSynthesizer paramSpeechSynthesizer, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (this.a.a == null) {
      return;
    }
    this.a.a.onInit(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechSynthesizer$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */