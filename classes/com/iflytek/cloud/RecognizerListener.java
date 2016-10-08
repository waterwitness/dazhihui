package com.iflytek.cloud;

import android.os.Bundle;

public abstract interface RecognizerListener
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(SpeechError paramSpeechError);
  
  public abstract void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle);
  
  public abstract void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean);
  
  public abstract void onVolumeChanged(int paramInt, byte[] paramArrayOfByte);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\RecognizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */