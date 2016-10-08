package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.EvaluatorListener;
import com.iflytek.cloud.EvaluatorResult;
import com.iflytek.cloud.SpeechError;

final class ah$a
  implements EvaluatorListener
{
  private EvaluatorListener b = null;
  private Handler c = new ah.a.1(this, Looper.getMainLooper());
  
  public ah$a(ah paramah, EvaluatorListener paramEvaluatorListener)
  {
    this.b = paramEvaluatorListener;
  }
  
  protected void a()
  {
    String str = ah.a(this.a).v().e("ise_audio_path");
    if ((!TextUtils.isEmpty(str)) && (M.a(((j)ah.b(this.a)).d(), str))) {
      M.a(ah.c(this.a).v().b("audio_format", null), str, ah.e(this.a).v().a("sample_rate", ah.d(this.a).q));
    }
    N.b(ah.f(this.a), Boolean.valueOf(ah.g(this.a)), null);
  }
  
  public void onBeginOfSpeech()
  {
    X.a("onBeginOfSpeech");
    Message localMessage = this.c.obtainMessage(2, 0, 0, null);
    this.c.sendMessage(localMessage);
  }
  
  public void onEndOfSpeech()
  {
    Message localMessage = this.c.obtainMessage(3, 0, 0, null);
    this.c.sendMessage(localMessage);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    a();
    paramSpeechError = this.c.obtainMessage(0, paramSpeechError);
    this.c.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    Message.obtain(this.c, 6, localMessage).sendToTarget();
  }
  
  public void onResult(EvaluatorResult paramEvaluatorResult, boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean) {
      a();
    }
    Handler localHandler = this.c;
    if (paramBoolean == true) {}
    for (;;)
    {
      paramEvaluatorResult = localHandler.obtainMessage(4, i, 0, paramEvaluatorResult);
      this.c.sendMessage(paramEvaluatorResult);
      return;
      i = 0;
    }
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.c.obtainMessage(1, paramInt, 0, paramArrayOfByte);
    this.c.sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ah$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */