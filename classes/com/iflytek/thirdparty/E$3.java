package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SynthesizerListener;

class E$3
  extends Handler
{
  E$3(E paramE, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      if (E.a(this.a) == null) {
        return;
      }
      switch (paramMessage.what)
      {
      case 1: 
        X.a("tts-onSpeakBegin");
        E.a(this.a).onSpeakBegin();
        return;
      }
    }
    catch (Exception paramMessage)
    {
      X.b("SpeakSession mUiHandler error:" + paramMessage);
      return;
    }
    paramMessage = (Bundle)paramMessage.obj;
    int i = paramMessage.getInt("percent");
    int j = paramMessage.getInt("begpos");
    int k = paramMessage.getInt("endpos");
    paramMessage = paramMessage.getString("spellinfo");
    if (E.a(this.a) != null)
    {
      X.a("tts-onBufferProgress");
      E.a(this.a).onBufferProgress(i, j, k, paramMessage);
      return;
      X.a("tts-onSpeakPaused");
      E.a(this.a).onSpeakPaused();
      return;
      X.a("tts-onSpeakResumed");
      E.a(this.a).onSpeakResumed();
      return;
      i = ((Integer)paramMessage.obj).intValue();
      if (E.a(this.a) != null)
      {
        X.a("tts-onSpeakProgress");
        E.a(this.a).onSpeakProgress(paramMessage.arg1, paramMessage.arg2, i);
        return;
        X.a("tts-onCompleted");
        E.a(this.a).onCompleted((SpeechError)paramMessage.obj);
        return;
        E.a(this.a).onEvent(20001, 0, 0, (Bundle)paramMessage.obj);
      }
    }
    return;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\E$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */