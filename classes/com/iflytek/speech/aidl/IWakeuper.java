package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IInterface;
import com.iflytek.speech.WakeuperListener;

public abstract interface IWakeuper
  extends IInterface
{
  public abstract void cancel(WakeuperListener paramWakeuperListener);
  
  public abstract void destroy();
  
  public abstract boolean isListening();
  
  public abstract void startListening(Intent paramIntent, WakeuperListener paramWakeuperListener);
  
  public abstract void stopListening(WakeuperListener paramWakeuperListener);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\IWakeuper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */