package com.iflytek.speech;

import android.content.Intent;

public abstract interface ISpeechModule
{
  public abstract boolean destory();
  
  public abstract Intent getIntent();
  
  public abstract String getParameter(String paramString);
  
  public abstract boolean isAvailable();
  
  public abstract int setParameter(String paramString1, String paramString2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\ISpeechModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */