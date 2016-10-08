package com.iflytek.speech.aidl;

import android.os.IInterface;
import com.iflytek.speech.VerifierListener;

public abstract interface ISpeakerVerifier
  extends IInterface
{
  public abstract void endSpeak();
  
  public abstract String getParameter(String paramString);
  
  public abstract int register(String paramString1, String paramString2, VerifierListener paramVerifierListener);
  
  public abstract int setParameter(String paramString1, String paramString2);
  
  public abstract void stopSpeak();
  
  public abstract int verify(String paramString1, String paramString2, VerifierListener paramVerifierListener);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeakerVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */