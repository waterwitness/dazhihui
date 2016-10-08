package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class SpeechSynthesizer$a$2
  extends Handler
{
  SpeechSynthesizer$a$2(SpeechSynthesizer.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (SpeechSynthesizer.a.a(this.a) == null) {}
    do
    {
      return;
      int i;
      switch (paramMessage.what)
      {
      default: 
        return;
      case 1: 
        SpeechSynthesizer.a.a(this.a).onSpeakBegin();
        return;
      case 2: 
        paramMessage = (Bundle)paramMessage.obj;
        i = paramMessage.getInt("percent");
        int j = paramMessage.getInt("begpos");
        int k = paramMessage.getInt("endpos");
        paramMessage = paramMessage.getString("spellinfo");
        SpeechSynthesizer.a.a(this.a).onBufferProgress(i, j, k, paramMessage);
        return;
      case 3: 
        SpeechSynthesizer.a.a(this.a).onSpeakPaused();
        return;
      case 4: 
        SpeechSynthesizer.a.a(this.a).onSpeakResumed();
        return;
      case 5: 
        i = ((Integer)paramMessage.obj).intValue();
        SpeechSynthesizer.a.a(this.a).onSpeakProgress(paramMessage.arg1, paramMessage.arg2, i);
        return;
      case 6: 
        SpeechSynthesizer.a.a(this.a).onCompleted((SpeechError)paramMessage.obj);
        return;
      }
      paramMessage = (Message)paramMessage.obj;
    } while (paramMessage == null);
    SpeechSynthesizer.a.a(this.a).onEvent(paramMessage.what, paramMessage.arg1, paramMessage.arg2, (Bundle)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechSynthesizer$a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */