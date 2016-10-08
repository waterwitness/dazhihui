package com.iflytek.cloud;

import android.os.Bundle;

public abstract interface SynthesizerListener
{
  public abstract void onBufferProgress(int paramInt1, int paramInt2, int paramInt3, String paramString);
  
  public abstract void onCompleted(SpeechError paramSpeechError);
  
  public abstract void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle);
  
  public abstract void onSpeakBegin();
  
  public abstract void onSpeakPaused();
  
  public abstract void onSpeakProgress(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onSpeakResumed();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SynthesizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */