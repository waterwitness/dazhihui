package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.speech.aidl.ISpeechUnderstander;
import com.iflytek.thirdparty.X;

public class SpeechUnderstanderAidl
  extends SpeechModuleAidl<ISpeechUnderstander>
{
  public SpeechUnderstanderAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.speechunderstand");
  }
  
  public int cancel(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).cancel(paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      X.a(paramSpeechUnderstanderListener);
      return 21004;
    }
    catch (Exception paramSpeechUnderstanderListener)
    {
      for (;;)
      {
        paramSpeechUnderstanderListener.printStackTrace();
      }
    }
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isUnderstanding()
  {
    for (;;)
    {
      try
      {
        if (this.mService != null)
        {
          bool = ((ISpeechUnderstander)this.mService).isUnderstanding();
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        X.a(localRemoteException);
        return false;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return false;
      }
      boolean bool = false;
    }
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).startUnderstanding(getIntent(), paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      X.a(paramSpeechUnderstanderListener);
      return 21004;
    }
    catch (Exception paramSpeechUnderstanderListener)
    {
      for (;;)
      {
        paramSpeechUnderstanderListener.printStackTrace();
      }
    }
  }
  
  public int stopUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).stopUnderstanding(paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      X.a(paramSpeechUnderstanderListener);
      return 21004;
    }
    catch (Exception paramSpeechUnderstanderListener)
    {
      for (;;)
      {
        paramSpeechUnderstanderListener.printStackTrace();
      }
    }
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (SpeechUtility.getUtility().getServiceVersion() < 44) {
      return 20018;
    }
    if (this.mService == null) {
      return 21003;
    }
    try
    {
      Intent localIntent = getIntent();
      ((ISpeechUnderstander)this.mService).writeAudio(localIntent, paramArrayOfByte, paramInt1, paramInt2);
      return 0;
    }
    catch (RemoteException paramArrayOfByte)
    {
      X.a(paramArrayOfByte);
      return 0;
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechUnderstanderAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */