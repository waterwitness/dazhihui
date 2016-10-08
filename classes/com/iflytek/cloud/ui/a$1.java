package com.iflytek.cloud.ui;

import android.os.Bundle;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.thirdparty.ar;

class a$1
  implements RecognizerListener
{
  a$1(a parama) {}
  
  public void onBeginOfSpeech() {}
  
  public void onEndOfSpeech()
  {
    a.c(this.a);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    if ((paramSpeechError == null) || (!a.e(this.a))) {
      this.a.f();
    }
    for (;;)
    {
      if (a.d(this.a) != null) {
        a.d(this.a).onError(paramSpeechError);
      }
      return;
      a.a(this.a, paramSpeechError);
    }
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle) {}
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.f();
    }
    if (a.d(this.a) != null) {
      a.d(this.a).onResult(paramRecognizerResult, paramBoolean);
    }
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    if ((a.a(this.a) == 1) && (a.b(this.a) != null))
    {
      paramInt = (paramInt + 2) / 5;
      a.b(this.a).a(paramInt);
      a.b(this.a).invalidate();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\ui\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */