package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.VerifierListener;
import com.iflytek.cloud.VerifierResult;

class ag$a$1
  extends Handler
{
  ag$a$1(ag.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (ag.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      ag.a.a(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      ag.a.a(this.a).onResult((VerifierResult)paramMessage.obj);
      continue;
      ag.a.a(this.a).onVolumeChanged(paramMessage.arg1, (byte[])paramMessage.obj);
      continue;
      ag.a.a(this.a).onBeginOfSpeech();
      continue;
      ag.a.a(this.a).onEndOfSpeech();
      continue;
      Message localMessage = (Message)paramMessage.obj;
      ag.a.a(this.a).onEvent(localMessage.what, localMessage.arg1, localMessage.arg2, (Bundle)localMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ag$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */