package com.iflytek.speech;

import android.os.IInterface;

public abstract interface WakeuperListener
  extends IInterface
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(int paramInt);
  
  public abstract void onResult(WakeuperResult paramWakeuperResult);
  
  public abstract void onVolumeChanged(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\WakeuperListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */