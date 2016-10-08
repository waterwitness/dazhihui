package com.iflytek.cloud.record;

import com.iflytek.cloud.SpeechError;

public abstract interface PcmRecorder$PcmRecordListener
{
  public abstract void onError(SpeechError paramSpeechError);
  
  public abstract void onRecordBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void onRecordReleased();
  
  public abstract void onRecordStarted(boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\PcmRecorder$PcmRecordListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */