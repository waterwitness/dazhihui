package com.iflytek.cloud.util;

import com.iflytek.cloud.SpeechError;

public abstract interface FileDownloadListener
{
  public abstract void onCompleted(String paramString, SpeechError paramSpeechError);
  
  public abstract void onProgress(int paramInt);
  
  public abstract void onStart();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\FileDownloadListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */