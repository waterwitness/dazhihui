package com.iflytek.cloud;

public abstract interface TextUnderstanderListener
{
  public abstract void onError(SpeechError paramSpeechError);
  
  public abstract void onResult(UnderstanderResult paramUnderstanderResult);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstanderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */