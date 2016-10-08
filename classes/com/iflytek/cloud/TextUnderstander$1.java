package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class TextUnderstander$1
  extends Handler
{
  TextUnderstander$1(TextUnderstander paramTextUnderstander, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (TextUnderstander.a(this.a) == null) {
      return;
    }
    TextUnderstander.a(this.a).onInit(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstander$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */