package com.iflytek.speech;

import android.os.IInterface;

public abstract interface LexiconListener
  extends IInterface
{
  public abstract void onLexiconUpdated(String paramString, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\LexiconListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */