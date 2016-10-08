package com.iflytek.speech;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.InitListener;

class SpeechModuleAidl$2
  extends Handler
{
  SpeechModuleAidl$2(SpeechModuleAidl paramSpeechModuleAidl, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (SpeechModuleAidl.access$100(this.this$0) == null) {
      return;
    }
    SpeechModuleAidl.access$100(this.this$0).onInit(paramMessage.what);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechModuleAidl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */