package com.iflytek.speech;

import android.os.Bundle;
import android.os.IInterface;

public abstract interface SynthesizerListener
  extends IInterface
{
  public abstract void onBufferProgress(int paramInt1, int paramInt2, int paramInt3, String paramString);
  
  public abstract void onCompleted(int paramInt);
  
  public abstract void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle);
  
  public abstract void onSpeakBegin();
  
  public abstract void onSpeakPaused();
  
  public abstract void onSpeakProgress(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onSpeakResumed();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */