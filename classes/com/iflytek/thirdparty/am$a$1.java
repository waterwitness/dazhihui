package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.util.FileDownloadListener;

class am$a$1
  extends Handler
{
  am$a$1(am.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (am.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      am.a.a(this.a).onCompleted((String)paramMessage.obj, null);
      continue;
      am.a.a(this.a).onCompleted(null, (SpeechError)paramMessage.obj);
      continue;
      am.a.a(this.a).onStart();
      continue;
      am.a.a(this.a).onProgress(paramMessage.arg1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */