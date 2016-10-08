package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.WakeuperListener;
import com.iflytek.cloud.WakeuperResult;

final class am$b
  implements WakeuperListener
{
  private WakeuperListener b = null;
  private Handler c = new am.b.1(this, Looper.getMainLooper());
  
  public am$b(am paramam, WakeuperListener paramWakeuperListener)
  {
    this.b = paramWakeuperListener;
  }
  
  protected void a()
  {
    N.b(am.g(this.a), Boolean.valueOf(am.h(this.a)), null);
  }
  
  public void onBeginOfSpeech()
  {
    X.a("onBeginOfSpeech");
    Message localMessage = this.c.obtainMessage(2, 0, 0, null);
    this.c.sendMessage(localMessage);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    X.b("error:" + paramSpeechError.getErrorCode());
    if (!am.f(this.a))
    {
      am.a(this.a, true);
      return;
    }
    a();
    paramSpeechError = this.c.obtainMessage(0, paramSpeechError);
    this.c.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    paramBundle = this.c.obtainMessage(6, 0, 0, localMessage);
    this.c.sendMessage(paramBundle);
  }
  
  public void onResult(WakeuperResult paramWakeuperResult)
  {
    if (!am.e(this.a).a("keep_alive", true)) {
      a();
    }
    paramWakeuperResult = this.c.obtainMessage(4, 1, 0, paramWakeuperResult);
    this.c.sendMessage(paramWakeuperResult);
  }
  
  public void onVolumeChanged(int paramInt)
  {
    X.a("onVolumeChanged");
    Message localMessage = this.c.obtainMessage(5, paramInt, 0, null);
    this.c.sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\am$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */