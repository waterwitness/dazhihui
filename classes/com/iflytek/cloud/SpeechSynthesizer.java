package com.iflytek.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.msc.MSC;
import com.iflytek.speech.SpeechSynthesizerAidl;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.aj;
import com.iflytek.thirdparty.y;
import com.iflytek.thirdparty.y.a;

public class SpeechSynthesizer
  extends y
{
  private static SpeechSynthesizer c = null;
  InitListener a = null;
  private aj d = null;
  private SpeechSynthesizerAidl e = null;
  private SpeechSynthesizer.a f = null;
  private Handler g = new SpeechSynthesizer.1(this, Looper.getMainLooper());
  
  protected SpeechSynthesizer(Context paramContext, InitListener paramInitListener)
  {
    this.a = paramInitListener;
    if (MSC.isLoaded()) {
      this.d = new aj(paramContext);
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a))
    {
      this.e = new SpeechSynthesizerAidl(paramContext.getApplicationContext(), paramInitListener);
      return;
    }
    Message.obtain(this.g, 0, 0, 0, null).sendToTarget();
  }
  
  public static SpeechSynthesizer createSynthesizer(Context paramContext, InitListener paramInitListener)
  {
    if (c == null) {
      c = new SpeechSynthesizer(paramContext, paramInitListener);
    }
    return c;
  }
  
  public static SpeechSynthesizer getSynthesizer()
  {
    return c;
  }
  
  protected void a(Context paramContext)
  {
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a))
    {
      if ((this.e != null) && (!this.e.isAvailable()))
      {
        this.e.destory();
        this.e = null;
      }
      this.e = new SpeechSynthesizerAidl(paramContext.getApplicationContext(), this.a);
    }
    while ((this.a == null) || (this.e == null)) {
      return;
    }
    this.e.destory();
    this.e = null;
  }
  
  public boolean destroy()
  {
    boolean bool = true;
    if (this.e != null) {
      this.e.destory();
    }
    if (this.d != null) {
      bool = this.d.destroy();
    }
    if (bool) {
      c = null;
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if (localSpeechUtility != null)
    {
      X.a("Destory tts engine.");
      localSpeechUtility.setParameter("engine_destroy", "tts");
    }
    return bool;
  }
  
  public String getParameter(String paramString)
  {
    if (("local_speakers".equals(paramString)) && (this.e != null)) {
      return this.e.getParameter(paramString);
    }
    if ("tts_play_state".equals(paramString))
    {
      if ((a("tts", this.e) == y.a.b) && (this.e != null)) {
        return this.e.getParameter(paramString);
      }
      if (this.d != null) {
        return "" + this.d.h();
      }
    }
    return super.getParameter(paramString);
  }
  
  public boolean isSpeaking()
  {
    if ((this.d != null) && (this.d.g())) {}
    while ((this.e != null) && (this.e.isSpeaking())) {
      return true;
    }
    return false;
  }
  
  public void pauseSpeaking()
  {
    if ((this.d != null) && (this.d.g())) {
      this.d.e();
    }
    while ((this.e == null) || (!this.e.isSpeaking()) || (this.f == null)) {
      return;
    }
    this.e.pauseSpeaking(SpeechSynthesizer.a.c(this.f));
  }
  
  public void resumeSpeaking()
  {
    if ((this.d != null) && (this.d.g())) {
      this.d.f();
    }
    while ((this.e == null) || (!this.e.isSpeaking()) || (this.f == null)) {
      return;
    }
    this.e.resumeSpeaking(SpeechSynthesizer.a.c(this.f));
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startSpeaking(String paramString, SynthesizerListener paramSynthesizerListener)
  {
    if (a("tts", this.e) == y.a.b) {
      if (this.e != null) {}
    }
    while (this.d == null)
    {
      return 21001;
      this.e.setParameter("params", null);
      this.e.setParameter("params", this.b.toString());
      this.b.c("next_text");
      this.f = new SpeechSynthesizer.a(this, paramSynthesizerListener);
      return this.e.startSpeaking(paramString, SpeechSynthesizer.a.c(this.f));
    }
    this.d.setParameter(this.b);
    this.b.c("next_text");
    return this.d.a(paramString, paramSynthesizerListener);
  }
  
  public void stopSpeaking()
  {
    if ((this.d != null) && (this.d.g())) {
      this.d.a(false);
    }
    while ((this.e == null) || (!this.e.isSpeaking()) || (this.f == null)) {
      return;
    }
    this.e.stopSpeaking(SpeechSynthesizer.a.c(this.f));
  }
  
  public int synthesizeToUri(String paramString1, String paramString2, SynthesizerListener paramSynthesizerListener)
  {
    if (a("tts", this.e) == y.a.b) {
      if (this.e != null) {}
    }
    while (this.d == null)
    {
      return 21001;
      this.e.setParameter("params", null);
      this.e.setParameter("params", this.b.toString());
      this.e.setParameter("tts_audio_uri", paramString2);
      this.f = new SpeechSynthesizer.a(this, paramSynthesizerListener);
      return this.e.synthesizeToUrl(paramString1, SpeechSynthesizer.a.c(this.f));
    }
    this.d.setParameter(this.b);
    return this.d.a(paramString1, paramString2, paramSynthesizerListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechSynthesizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */