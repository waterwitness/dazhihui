package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IInterface;
import com.iflytek.speech.TextUnderstanderListener;

public abstract interface ITextUnderstander
  extends IInterface
{
  public abstract void cancel(TextUnderstanderListener paramTextUnderstanderListener);
  
  public abstract boolean isUnderstanding();
  
  public abstract void understandText(Intent paramIntent, TextUnderstanderListener paramTextUnderstanderListener);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ITextUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */