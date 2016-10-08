package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

class n$a$1
  extends Handler
{
  n$a$1(n.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (n.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      n.a.a(this.a).onEvent(paramMessage.arg1, (Bundle)paramMessage.obj);
      return;
    case 1: 
      n.a.a(this.a).onBufferReceived((byte[])paramMessage.obj);
      return;
    }
    n.a.a(this.a).onCompleted((SpeechError)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\n$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */