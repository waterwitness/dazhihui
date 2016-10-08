package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechUnderstander$1
  extends Handler
{
  SpeechUnderstander$1(SpeechUnderstander paramSpeechUnderstander, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (SpeechUnderstander.a(this.a) == null) {
      return;
    }
    SpeechUnderstander.a(this.a).onInit(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUnderstander$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */