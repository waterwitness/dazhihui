package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.msc.MSC;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.ag;
import com.iflytek.thirdparty.y;

public class SpeakerVerifier
  extends y
{
  private static SpeakerVerifier a = null;
  private ag c = null;
  
  protected SpeakerVerifier(Context paramContext, InitListener paramInitListener)
  {
    if (MSC.isLoaded()) {
      this.c = new ag(paramContext);
    }
  }
  
  public static SpeakerVerifier createVerifier(Context paramContext, InitListener paramInitListener)
  {
    if (a == null) {
      a = new SpeakerVerifier(paramContext, paramInitListener);
    }
    return a;
  }
  
  public static SpeakerVerifier getVerifier()
  {
    return a;
  }
  
  public void cancel()
  {
    if ((this.c != null) && (this.c.f())) {
      this.c.cancel(false);
    }
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
    return bool;
  }
  
  public String generatePassword(int paramInt)
  {
    if (this.c != null) {
      return this.c.a(paramInt);
    }
    X.b("SpeakerVerifier getPasswordList failed, is not running");
    return null;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public void getPasswordList(SpeechListener paramSpeechListener)
  {
    if (this.c != null)
    {
      this.c.setParameter("params", null);
      this.b.a("subject", "ivp", true);
      this.b.a("rse", "gb2312", false);
      this.c.setParameter(this.b);
      this.c.a(paramSpeechListener);
      return;
    }
    X.b("SpeakerVerifier getPasswordList failed, is not running");
  }
  
  public boolean isListening()
  {
    return (this.c != null) && (this.c.f());
  }
  
  public int sendRequest(String paramString1, String paramString2, SpeechListener paramSpeechListener)
  {
    if (this.c.setParameter(this.b)) {
      return this.c.a(paramString1, paramString2, paramSpeechListener);
    }
    return 20012;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startListening(VerifierListener paramVerifierListener)
  {
    if (this.c == null) {
      return 21001;
    }
    this.c.setParameter(this.b);
    return this.c.a(paramVerifierListener);
  }
  
  public void stopListening()
  {
    if ((this.c != null) && (this.c.f()))
    {
      this.c.e();
      return;
    }
    X.b("SpeakerVerifier stopListening failed, is not running");
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.f())) {
      return this.c.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    X.b("SpeakerVerifier writeAudio failed, is not running");
    return 21004;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeakerVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */