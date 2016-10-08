package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SynthesizerListener;

class E$4
  extends Handler
{
  E$4(E paramE, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      if (E.j(this.a) == null) {
        return;
      }
      switch (paramMessage.what)
      {
      case 2: 
        paramMessage = (Bundle)paramMessage.obj;
        int i = paramMessage.getInt("percent");
        int j = paramMessage.getInt("begpos");
        int k = paramMessage.getInt("endpos");
        paramMessage = paramMessage.getString("spellinfo");
        E.j(this.a).onBufferProgress(i, j, k, paramMessage);
        return;
      }
    }
    catch (Exception paramMessage)
    {
      X.b("SpeakSession mUiHandler error:" + paramMessage);
      return;
    }
    E.j(this.a).onCompleted((SpeechError)paramMessage.obj);
    return;
    paramMessage = (Message)paramMessage.obj;
    if (paramMessage != null) {
      E.j(this.a).onEvent(paramMessage.what, paramMessage.arg1, paramMessage.arg2, (Bundle)paramMessage.obj);
    }
    return;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\E$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */