package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.speech.aidl.ISpeechSynthesizer;
import com.iflytek.thirdparty.X;

public class SpeechSynthesizerAidl
  extends SpeechModuleAidl<ISpeechSynthesizer>
{
  public SpeechSynthesizerAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.synthesize");
  }
  
  public boolean destory()
  {
    this.mService = null;
    return super.destory();
  }
  
  public String getParameter(String paramString)
  {
    Object localObject = null;
    if (paramString.equals("local_speakers")) {
      try
      {
        if (SpeechUtility.getUtility() == null) {
          return null;
        }
        int i = SpeechUtility.getUtility().getServiceVersion();
        paramString = (String)localObject;
        if (i < 44) {
          return paramString;
        }
        if (i >= 10000)
        {
          paramString = (String)localObject;
          if (i < 10013) {
            return paramString;
          }
        }
        paramString = ((ISpeechSynthesizer)this.mService).getLocalSpeakerList();
        return paramString;
      }
      catch (RemoteException paramString)
      {
        X.a(paramString);
        return "20999";
      }
    }
    paramString = super.getParameter(paramString);
    return paramString;
  }
  
  public boolean isSpeaking()
  {
    for (;;)
    {
      try
      {
        if (this.mService != null)
        {
          bool = ((ISpeechSynthesizer)this.mService).isSpeaking();
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
  
  public int pauseSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).pauseSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      X.a(paramSynthesizerListener);
      return 21004;
    }
    catch (Exception paramSynthesizerListener)
    {
      for (;;)
      {
        paramSynthesizerListener.printStackTrace();
      }
    }
  }
  
  public int resumeSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).resumeSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      X.a(paramSynthesizerListener);
      return 21004;
    }
    catch (Exception paramSynthesizerListener)
    {
      for (;;)
      {
        paramSynthesizerListener.printStackTrace();
      }
    }
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startSpeaking(String paramString, SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      int i = ((ISpeechSynthesizer)this.mService).startSpeaking(localIntent, paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramString)
    {
      X.a(paramString);
      return 21004;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public int stopSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).stopSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      X.a(paramSynthesizerListener);
      return 21004;
    }
    catch (Exception paramSynthesizerListener)
    {
      for (;;)
      {
        paramSynthesizerListener.printStackTrace();
      }
    }
  }
  
  public int synthesizeToUrl(String paramString, SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      int i = ((ISpeechSynthesizer)this.mService).synthesizeToUrl(localIntent, paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramString)
    {
      X.a(paramString);
      return 21004;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechSynthesizerAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */