package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.cloud.util.FileDownloadListener;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.am;
import com.iflytek.thirdparty.y;

public class VoiceWakeuper
  extends y
{
  private static VoiceWakeuper a = null;
  private am c = null;
  
  private VoiceWakeuper(Context paramContext, InitListener paramInitListener)
  {
    this.c = new am(paramContext);
  }
  
  public static VoiceWakeuper createWakeuper(Context paramContext, InitListener paramInitListener)
  {
    try
    {
      if (a == null) {
        a = new VoiceWakeuper(paramContext, paramInitListener);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static VoiceWakeuper getWakeuper()
  {
    return a;
  }
  
  public void cancel()
  {
    this.c.cancel(false);
  }
  
  public boolean destroy()
  {
    boolean bool = true;
    if (this.c != null) {
      bool = this.c.destroy();
    }
    if (bool) {
      a = null;
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if (localSpeechUtility != null)
    {
      X.a("Destory ivw engine.");
      localSpeechUtility.setParameter("engine_destroy", "ivw");
    }
    return bool;
  }
  
  public int downloadResource(String paramString1, String paramString2, String paramString3, FileDownloadListener paramFileDownloadListener)
  {
    return this.c.a(paramString1, paramString2, paramString3, true, paramFileDownloadListener);
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isListening()
  {
    return this.c.f();
  }
  
  public int queryResource(String paramString, RequestListener paramRequestListener)
  {
    return this.c.a(paramString, true, paramRequestListener);
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startListening(WakeuperListener paramWakeuperListener)
  {
    this.c.setParameter("params", null);
    this.c.setParameter(this.b);
    return this.c.a(paramWakeuperListener);
  }
  
  public void stopListening()
  {
    this.c.e();
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.f())) {
      return this.c.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    X.b("VoiceWakeup writeAudio failed, is not running");
    return 21004;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\VoiceWakeuper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */