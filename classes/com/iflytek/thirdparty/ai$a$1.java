package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.SpeechError;

class ai$a$1
  extends Handler
{
  ai$a$1(ai.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (ai.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      ai.a.a(this.a).onBuildFinish(null, (SpeechError)paramMessage.obj);
      continue;
      ai.a.a(this.a).onBuildFinish((String)paramMessage.obj, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */