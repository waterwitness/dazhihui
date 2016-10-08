package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.iflytek.speech.SpeechUnderstanderListener.Stub;

class SpeechUnderstander$a$1
  extends SpeechUnderstanderListener.Stub
{
  SpeechUnderstander$a$1(SpeechUnderstander.a parama, SpeechUnderstander paramSpeechUnderstander) {}
  
  public void onBeginOfSpeech()
  {
    Message localMessage = SpeechUnderstander.a.b(this.b).obtainMessage(2);
    SpeechUnderstander.a.b(this.b).sendMessage(localMessage);
  }
  
  public void onEndOfSpeech()
  {
    Message localMessage = SpeechUnderstander.a.b(this.b).obtainMessage(3);
    SpeechUnderstander.a.b(this.b).sendMessage(localMessage);
  }
  
  public void onError(int paramInt)
  {
    Message localMessage = SpeechUnderstander.a.b(this.b).obtainMessage(0, new SpeechError(paramInt));
    SpeechUnderstander.a.b(this.b).sendMessage(localMessage);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    paramBundle = SpeechUnderstander.a.b(this.b).obtainMessage(6, 0, 0, localMessage);
    SpeechUnderstander.a.b(this.b).sendMessage(paramBundle);
  }
  
  public void onResult(com.iflytek.speech.UnderstanderResult paramUnderstanderResult)
  {
    paramUnderstanderResult = SpeechUnderstander.a.b(this.b).obtainMessage(4, new UnderstanderResult(paramUnderstanderResult.getResultString()));
    SpeechUnderstander.a.b(this.b).sendMessage(paramUnderstanderResult);
  }
  
  public void onVolumeChanged(int paramInt, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = SpeechUnderstander.a.b(this.b).obtainMessage(1, paramInt, 0, paramArrayOfByte);
    SpeechUnderstander.a.b(this.b).sendMessage(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUnderstander$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */