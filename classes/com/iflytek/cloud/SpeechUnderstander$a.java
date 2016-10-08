package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class SpeechUnderstander$a
  implements SpeechUnderstanderListener
{
  private SpeechUnderstanderListener b = null;
  private com.iflytek.speech.SpeechUnderstanderListener c = null;
  private Handler d = new SpeechUnderstander.a.2(this, Looper.getMainLooper());
  
  public SpeechUnderstander$a(SpeechUnderstander paramSpeechUnderstander, SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    this.b = paramSpeechUnderstanderListener;
    this.c = new SpeechUnderstander.a.1(this, paramSpeechUnderstander);
  }
  
  public void onBeginOfSpeech()
  {
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
  
  public void onResult(UnderstanderResult paramUnderstanderResult)
  {
    paramUnderstanderResult = this.d.obtainMessage(4, paramUnderstanderResult);
    this.d.sendMessage(paramUnderstanderResult);
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.d.obtainMessage(1, paramInt, 0, paramArrayOfByte);
    this.d.sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUnderstander$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */