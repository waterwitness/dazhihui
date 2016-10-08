package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;

final class ai$c
  implements RecognizerListener
{
  private RecognizerListener b = null;
  private boolean c = false;
  private Handler d = new ai.c.1(this, Looper.getMainLooper());
  
  public ai$c(ai paramai, RecognizerListener paramRecognizerListener)
  {
    this.b = paramRecognizerListener;
  }
  
  protected void a()
  {
    String str = ai.a(this.a).v().e("asr_audio_path");
    if ((!TextUtils.isEmpty(str)) && (M.a(((l)ai.b(this.a)).b(), str))) {
      M.a(ai.c(this.a).v().b("audio_format", null), str, ai.e(this.a).v().a("sample_rate", ai.d(this.a).q));
    }
    N.b(ai.f(this.a), Boolean.valueOf(ai.g(this.a)), null);
  }
  
  public void onBeginOfSpeech()
  {
    X.a("onBeginOfSpeech");
    Message localMessage = this.d.obtainMessage(2, 0, 0, null);
    this.d.sendMessage(localMessage);
  }
  
  public void onEndOfSpeech()
  {
    Message localMessage = this.d.obtainMessage(3, 0, 0, null);
    this.d.sendMessage(localMessage);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    a();
    paramSpeechError = this.d.obtainMessage(0, paramSpeechError);
    this.d.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    paramBundle = this.d.obtainMessage(6, 0, 0, localMessage);
    this.d.sendMessage(paramBundle);
  }
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean) {
      a();
    }
    Handler localHandler = this.d;
    if (paramBoolean == true) {}
    for (;;)
    {
      paramRecognizerResult = localHandler.obtainMessage(4, i, 0, paramRecognizerResult);
      this.d.sendMessage(paramRecognizerResult);
      return;
      i = 0;
    }
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.d.obtainMessage(1, paramInt, 0, paramArrayOfByte);
    this.d.sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */