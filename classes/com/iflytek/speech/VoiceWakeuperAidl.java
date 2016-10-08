package com.iflytek.speech;

import android.content.Context;
import android.os.RemoteException;
import com.iflytek.cloud.InitListener;
import com.iflytek.speech.aidl.IWakeuper;
import com.iflytek.thirdparty.X;

public class VoiceWakeuperAidl
  extends SpeechModuleAidl<IWakeuper>
{
  public static final String ARG_RES_PROVIDER_AUTHORITY = "content_provider_name";
  public static final String ARG_RES_TYPE = "engine_res_type";
  public static final String IVP_RES_ID = "ivp_res_id";
  public static final String IVP_USER_NAME = "ivp_user_name";
  public static final String IVW_AND_IVP = "ivw_and_ivp";
  public static final String IVW_FILES = "ivw_files";
  public static final String IVW_THRESHOLD = "ivw_threshold";
  public static final String IVW_WORD_ID = "ivw_word_id";
  public static final String PARAMS_SEPARATE = ";";
  public static final String PROVIDER_NAME = "com.iflytek.speech.SharedProvider";
  public static final int RES_FROM_ASSETS = 257;
  public static final int RES_FROM_CLIENT = 259;
  public static final int RES_SPECIFIED = 258;
  public static final String WAKEUP_RESULT_ID = "wakeup_result_id";
  public static final String WAKEUP_RESULT_SCORE = "wakeup_result_Score";
  
  public VoiceWakeuperAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.wakeup");
  }
  
  public int cancel(WakeuperListener paramWakeuperListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramWakeuperListener == null) {
      return 20012;
    }
    try
    {
      ((IWakeuper)this.mService).cancel(paramWakeuperListener);
      return 0;
    }
    catch (RemoteException paramWakeuperListener)
    {
      X.a(paramWakeuperListener);
      return 21004;
    }
    catch (Exception paramWakeuperListener)
    {
      for (;;)
      {
        paramWakeuperListener.printStackTrace();
      }
    }
  }
  
  public boolean destroy()
  {
    if (this.mService == null) {
      return false;
    }
    try
    {
      ((IWakeuper)this.mService).destroy();
      return super.destory();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        X.a(localRemoteException);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isListening()
  {
    try
    {
      boolean bool = ((IWakeuper)this.mService).isListening();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      X.a(localRemoteException);
      return false;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startListening(WakeuperListener paramWakeuperListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramWakeuperListener == null) {
      return 20012;
    }
    try
    {
      ((IWakeuper)this.mService).startListening(getIntent(), paramWakeuperListener);
      return 0;
    }
    catch (RemoteException paramWakeuperListener)
    {
      X.a(paramWakeuperListener);
      return 21004;
    }
    catch (Exception paramWakeuperListener)
    {
      for (;;)
      {
        paramWakeuperListener.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\VoiceWakeuperAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */