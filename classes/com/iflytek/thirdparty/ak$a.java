package com.iflytek.thirdparty;

import android.os.Bundle;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUnderstanderListener;
import com.iflytek.cloud.UnderstanderResult;

class ak$a
  implements RecognizerListener
{
  private final SpeechUnderstanderListener b;
  
  public ak$a(ak paramak, SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    this.b = paramSpeechUnderstanderListener;
  }
  
  public void onBeginOfSpeech()
  {
    if (this.b != null) {
      this.b.onBeginOfSpeech();
    }
  }
  
  public void onEndOfSpeech()
  {
    if (this.b != null) {
      this.b.onEndOfSpeech();
    }
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    if ((this.b != null) && (paramSpeechError != null)) {
      this.b.onError(paramSpeechError);
    }
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    if (this.b != null) {
      this.b.onEvent(paramInt1, paramInt2, paramInt3, paramBundle);
    }
  }
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.onResult(new UnderstanderResult(paramRecognizerResult.getResultString()));
    }
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    if (this.b != null) {
      this.b.onVolumeChanged(paramInt, paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ak$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */