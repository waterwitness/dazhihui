package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.VerifierListener;
import com.iflytek.cloud.VerifierResult;

final class ag$a
  implements VerifierListener
{
  private VerifierListener b = null;
  private Handler c = new ag.a.1(this, Looper.getMainLooper());
  
  public ag$a(ag paramag, VerifierListener paramVerifierListener)
  {
    this.b = paramVerifierListener;
  }
  
  protected void a()
  {
    String str = ag.a(this.a).v().e("isv_audio_path");
    if ((!TextUtils.isEmpty(str)) && (M.a(((o)ag.b(this.a)).j(), str))) {
      M.a(ag.c(this.a).v().b("audio_format", null), str, ag.e(this.a).v().a("sample_rate", ag.d(this.a).q));
    }
    N.b(ag.f(this.a), Boolean.valueOf(ag.g(this.a)), null);
  }
  
  public void onBeginOfSpeech()
  {
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
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    Message.obtain(this.c, 5, localMessage).sendToTarget();
  }
  
  public void onResult(VerifierResult paramVerifierResult)
  {
    a();
    paramVerifierResult = this.c.obtainMessage(4, paramVerifierResult);
    this.c.sendMessage(paramVerifierResult);
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.c.obtainMessage(1, paramInt, 0, paramArrayOfByte);
    this.c.sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ag$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */