package com.iflytek.speech;

import android.os.IInterface;

public abstract interface SynthesizeToUrlListener
  extends IInterface
{
  public abstract void onSynthesizeCompleted(String paramString, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizeToUrlListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */