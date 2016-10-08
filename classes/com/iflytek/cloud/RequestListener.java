package com.iflytek.cloud;

import android.os.Bundle;

public abstract interface RequestListener
{
  public abstract void onBufferReceived(byte[] paramArrayOfByte);
  
  public abstract void onCompleted(SpeechError paramSpeechError);
  
  public abstract void onEvent(int paramInt, Bundle paramBundle);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\RequestListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */