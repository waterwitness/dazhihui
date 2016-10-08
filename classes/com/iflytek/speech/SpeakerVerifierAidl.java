package com.iflytek.speech;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.iflytek.cloud.InitListener;
import com.iflytek.speech.aidl.ISpeakerVerifier;
import com.iflytek.thirdparty.X;

public class SpeakerVerifierAidl
  extends SpeechModuleAidl<ISpeakerVerifier>
{
  public static String IVP_PARAM_CONSISTTHRESHOLD = "consistThreshold";
  public static String IVP_PARAM_DTW_CHECK_THRESHOLD = "checkThreshold";
  public static String IVP_SENTENCE_CNT;
  public static String USER_NAME = "name";
  public static String VID;
  private final String TAG = "SpeakerVerifier";
  
  static
  {
    IVP_SENTENCE_CNT = "count";
    VID = "vid";
  }
  
  public SpeakerVerifierAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.speakerverify");
  }
  
  public void endSpeak()
  {
    try
    {
      Log.d("SpeakerVerifier", "SpeakerVerifier | endSpeak");
      ((ISpeakerVerifier)this.mService).endSpeak();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      X.a(localRemoteException);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public String getParameter(String paramString)
  {
    return null;
  }
  
  public int getPasswordList(Context paramContext, SpeakerVerifierAidl.DownloadListener paramDownloadListener, String paramString)
  {
    return 0;
  }
  
  public int identify(String paramString1, String paramString2, VerifierListener paramVerifierListener)
  {
    return 0;
  }
  
  public int register(String paramString1, String paramString2, VerifierListener paramVerifierListener)
  {
    Log.d("SpeakerVerifier", "SpeakerVerifier | register");
    if (this.mService == null) {
      return 21003;
    }
    if (paramVerifierListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeakerVerifier)this.mService).register(paramString1, paramString2, paramVerifierListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      X.a(paramString1);
      return 21004;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return 0;
  }
  
  public void stopSpeak()
  {
    try
    {
      Log.d("SpeakerVerifier", "SpeakerVerifier | stopSpeak");
      ((ISpeakerVerifier)this.mService).stopSpeak();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      X.a(localRemoteException);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public int verify(String paramString1, String paramString2, VerifierListener paramVerifierListener)
  {
    Log.d("SpeakerVerifier", "SpeakerVerifier | verify");
    if (this.mService == null) {
      return 21003;
    }
    if (paramVerifierListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeakerVerifier)this.mService).verify(paramString1, paramString2, paramVerifierListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      X.a(paramString1);
      return 21004;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeakerVerifierAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */