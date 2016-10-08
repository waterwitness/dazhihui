package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.iflytek.speech.RecognizerListener.Stub;

class SpeechRecognizer$a$1
  extends RecognizerListener.Stub
{
  SpeechRecognizer$a$1(SpeechRecognizer.a parama, SpeechRecognizer paramSpeechRecognizer) {}
  
  public void onBeginOfSpeech()
  {
    Message localMessage = SpeechRecognizer.a.a(this.b).obtainMessage(2);
    SpeechRecognizer.a.a(this.b).sendMessage(localMessage);
  }
  
  public void onEndOfSpeech()
  {
    Message localMessage = SpeechRecognizer.a.a(this.b).obtainMessage(3);
    SpeechRecognizer.a.a(this.b).sendMessage(localMessage);
  }
  
  public void onError(int paramInt)
  {
    Message localMessage = SpeechRecognizer.a.a(this.b).obtainMessage(0, new SpeechError(paramInt));
    SpeechRecognizer.a.a(this.b).sendMessage(localMessage);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    paramBundle = SpeechRecognizer.a.a(this.b).obtainMessage(6, 0, 0, localMessage);
    SpeechRecognizer.a.a(this.b).sendMessage(paramBundle);
  }
  
  public void onResult(com.iflytek.speech.RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    int i = 1;
    Handler localHandler = SpeechRecognizer.a.a(this.b);
    if (paramBoolean == true) {}
    for (;;)
    {
      paramRecognizerResult = localHandler.obtainMessage(4, i, 0, new RecognizerResult(paramRecognizerResult.getResultString()));
      SpeechRecognizer.a.a(this.b).sendMessage(paramRecognizerResult);
      return;
      i = 0;
    }
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = SpeechRecognizer.a.a(this.b).obtainMessage(1, paramInt, 0, paramArrayOfByte);
    SpeechRecognizer.a.a(this.b).sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */