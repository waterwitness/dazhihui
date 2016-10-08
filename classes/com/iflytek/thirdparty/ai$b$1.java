package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.SpeechError;

class ai$b$1
  extends Handler
{
  ai$b$1(ai.b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (ai.b.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      ai.b.a(this.a).onLexiconUpdated(null, (SpeechError)paramMessage.obj);
      continue;
      ai.b.a(this.a).onLexiconUpdated((String)paramMessage.obj, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */