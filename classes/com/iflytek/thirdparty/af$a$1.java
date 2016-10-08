package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.IdentityListener;
import com.iflytek.cloud.IdentityResult;
import com.iflytek.cloud.SpeechError;

class af$a$1
  extends Handler
{
  af$a$1(af.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (af.a.a(this.a) == null) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      af.a.a(this.a).onError((SpeechError)paramMessage.obj);
      continue;
      Object localObject = af.a.a(this.a);
      IdentityResult localIdentityResult = (IdentityResult)paramMessage.obj;
      if (paramMessage.arg1 == 1) {}
      for (boolean bool = true;; bool = false)
      {
        ((IdentityListener)localObject).onResult(localIdentityResult, bool);
        if (!af.a.b(this.a))
        {
          this.a.a.b("ui_frs");
          af.a.a(this.a, true);
        }
        if (1 != paramMessage.arg1) {
          break;
        }
        this.a.a.b("ui_lrs");
        break;
      }
      localObject = (Message)paramMessage.obj;
      af.a.a(this.a).onEvent(((Message)localObject).what, ((Message)localObject).arg1, ((Message)localObject).arg2, (Bundle)((Message)localObject).obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\af$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */