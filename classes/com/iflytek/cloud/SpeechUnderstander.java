package com.iflytek.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.msc.MSC;
import com.iflytek.speech.SpeechUnderstanderAidl;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.ak;
import com.iflytek.thirdparty.y;
import com.iflytek.thirdparty.y.a;

public class SpeechUnderstander
  extends y
{
  protected static SpeechUnderstander a = null;
  private ak c = null;
  private SpeechUnderstanderAidl d = null;
  private SpeechUnderstander.a e = null;
  private InitListener f = null;
  private Handler g = new SpeechUnderstander.1(this, Looper.getMainLooper());
  
  protected SpeechUnderstander(Context paramContext, InitListener paramInitListener)
  {
    this.f = paramInitListener;
    if (MSC.isLoaded()) {
      this.c = new ak(paramContext);
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a)) {
      this.d = new SpeechUnderstanderAidl(paramContext.getApplicationContext(), paramInitListener);
    }
    while (paramInitListener == null) {
      return;
    }
    Message.obtain(this.g, 0, 0, 0, null).sendToTarget();
  }
  
  public static SpeechUnderstander createUnderstander(Context paramContext, InitListener paramInitListener)
  {
    try
    {
      if (a == null) {
        a = new SpeechUnderstander(paramContext, paramInitListener);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static SpeechUnderstander getUnderstander()
  {
    return a;
  }
  
  protected void a(Context paramContext)
  {
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a))
    {
      if ((this.d != null) && (!this.d.isAvailable()))
      {
        this.d.destory();
        this.d = null;
      }
      this.d = new SpeechUnderstanderAidl(paramContext.getApplicationContext(), this.f);
    }
    while ((this.f == null) || (this.d == null)) {
      return;
    }
    this.d.destory();
    this.d = null;
  }
  
  public void cancel()
  {
    if ((this.c != null) && (this.c.a()))
    {
      this.c.a(false);
      return;
    }
    if ((this.d != null) && (this.d.isUnderstanding()))
    {
      this.d.cancel(SpeechUnderstander.a.a(this.e));
      return;
    }
    X.b("SpeechUnderstander cancel failed, is not running");
  }
  
  public boolean destroy()
  {
    boolean bool = true;
    if (this.d != null)
    {
      this.d.destory();
      this.d = null;
    }
    if (this.c != null) {
      bool = this.c.c();
    }
    if (bool) {
      a = null;
    }
    return bool;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isUnderstanding()
  {
    if ((this.c != null) && (this.c.a())) {}
    while ((this.d != null) && (this.d.isUnderstanding())) {
      return true;
    }
    return false;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    y.a locala = a("nlu", this.d);
    X.a("start engine mode = " + locala.toString());
    if (locala == y.a.b) {
      if (this.d != null) {}
    }
    while (this.c == null)
    {
      return 21001;
      this.d.setParameter("params", null);
      this.d.setParameter("params", this.b.toString());
      this.e = new SpeechUnderstander.a(this, paramSpeechUnderstanderListener);
      return this.d.startUnderstanding(SpeechUnderstander.a.a(this.e));
    }
    this.c.a(this.b);
    return this.c.a(paramSpeechUnderstanderListener);
  }
  
  public void stopUnderstanding()
  {
    if ((this.c != null) && (this.c.a()))
    {
      this.c.b();
      return;
    }
    if ((this.d != null) && (this.d.isUnderstanding()))
    {
      this.d.stopUnderstanding(SpeechUnderstander.a.a(this.e));
      return;
    }
    X.a("SpeechUnderstander stopUnderstanding, is not understanding");
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.a())) {
      return this.c.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    if ((this.d != null) && (this.d.isUnderstanding())) {
      return this.d.writeAudio(paramArrayOfByte, paramInt1, paramInt2);
    }
    X.a("SpeechUnderstander writeAudio, is not understanding");
    return 21004;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */