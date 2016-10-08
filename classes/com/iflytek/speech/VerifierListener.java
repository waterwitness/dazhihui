package com.iflytek.speech;

import android.os.IInterface;

public abstract interface VerifierListener
  extends IInterface
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onCancel();
  
  public abstract void onEnd(VerifierResult paramVerifierResult, int paramInt);
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(int paramInt);
  
  public abstract void onRegister(VerifierResult paramVerifierResult);
  
  public abstract void onVolumeChanged(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\VerifierListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */