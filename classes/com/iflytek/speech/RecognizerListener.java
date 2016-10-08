package com.iflytek.speech;

import android.os.Bundle;
import android.os.IInterface;

public abstract interface RecognizerListener
  extends IInterface
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(int paramInt);
  
  public abstract void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle);
  
  public abstract void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean);
  
  public abstract void onVolumeChanged(int paramInt, byte[] paramArrayOfByte);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\RecognizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */