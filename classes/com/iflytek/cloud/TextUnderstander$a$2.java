package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class TextUnderstander$a$2
  extends Handler
{
  TextUnderstander$a$2(TextUnderstander.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (TextUnderstander.a.c(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      TextUnderstander.a.c(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      TextUnderstander.a.c(this.a).onResult((UnderstanderResult)paramMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstander$a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */