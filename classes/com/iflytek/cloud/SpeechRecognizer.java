package com.iflytek.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.msc.MSC;
import com.iflytek.speech.SpeechRecognizerAidl;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.ai;
import com.iflytek.thirdparty.y;
import com.iflytek.thirdparty.y.a;

public final class SpeechRecognizer
  extends y
{
  private static SpeechRecognizer a = null;
  private ai c = null;
  private SpeechRecognizerAidl d = null;
  private SpeechRecognizer.a e = null;
  private InitListener f = null;
  private Handler g = new SpeechRecognizer.1(this, Looper.getMainLooper());
  
  protected SpeechRecognizer(Context paramContext, InitListener paramInitListener)
  {
    this.f = paramInitListener;
    if (MSC.isLoaded()) {
      this.c = new ai(paramContext);
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a)) {
      this.d = new SpeechRecognizerAidl(paramContext.getApplicationContext(), paramInitListener);
    }
    while (paramInitListener == null) {
      return;
    }
    Message.obtain(this.g, 0, 0, 0, null).sendToTarget();
  }
  
  public static SpeechRecognizer createRecognizer(Context paramContext, InitListener paramInitListener)
  {
    try
    {
      if (a == null) {
        a = new SpeechRecognizer(paramContext, paramInitListener);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static SpeechRecognizer getRecognizer()
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
      this.d = new SpeechRecognizerAidl(paramContext.getApplicationContext(), this.f);
    }
    while ((this.f == null) || (this.d == null)) {
      return;
    }
    this.d.destory();
    this.d = null;
  }
  
  public int buildGrammar(String paramString1, String paramString2, GrammarListener paramGrammarListener)
  {
    y.a locala = a("asr", this.d);
    X.a("start engine mode = " + locala.toString());
    if (locala == y.a.b) {
      if (this.d != null) {}
    }
    while (this.c == null)
    {
      return 21001;
      this.d.setParameter("params", null);
      this.d.setParameter("params", this.b.toString());
      paramGrammarListener = new SpeechRecognizer.2(this, paramGrammarListener);
      return this.d.buildGrammar(paramString1, paramString2, paramGrammarListener);
    }
    this.c.setParameter(this.b);
    return this.c.a(paramString1, paramString2, paramGrammarListener);
  }
  
  public void cancel()
  {
    if ((this.c != null) && (this.c.f())) {
      this.c.cancel(false);
    }
    do
    {
      return;
      if ((this.d == null) || (!this.d.isListening())) {
        break;
      }
    } while (this.e == null);
    this.d.cancel(SpeechRecognizer.a.c(this.e));
    return;
    X.b("SpeechRecognizer cancel failed, is not running");
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
      bool = this.c.destroy();
    }
    if (bool) {
      a = null;
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if (localSpeechUtility != null)
    {
      X.a("Destory asr engine.");
      localSpeechUtility.setParameter("engine_destroy", "asr");
    }
    return bool;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isListening()
  {
    if ((this.c != null) && (this.c.f())) {}
    while ((this.d != null) && (this.d.isListening())) {
      return true;
    }
    return false;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startListening(RecognizerListener paramRecognizerListener)
  {
    y.a locala = a("asr", this.d);
    X.a("start engine mode = " + locala.toString());
    if (locala == y.a.b) {
      if (this.d != null) {}
    }
    while (this.c == null)
    {
      return 21001;
      this.d.setParameter("params", null);
      this.d.setParameter("params", this.b.toString());
      this.e = new SpeechRecognizer.a(this, paramRecognizerListener);
      return this.d.startListening(SpeechRecognizer.a.c(this.e));
    }
    this.c.setParameter(this.b);
    return this.c.a(paramRecognizerListener);
  }
  
  public void stopListening()
  {
    if ((this.c != null) && (this.c.f())) {
      this.c.e();
    }
    do
    {
      return;
      if ((this.d == null) || (!this.d.isListening())) {
        break;
      }
    } while (this.e == null);
    this.d.stopListening(SpeechRecognizer.a.c(this.e));
    return;
    X.b("SpeechRecognizer stopListening failed, is not running");
  }
  
  public int updateLexicon(String paramString1, String paramString2, LexiconListener paramLexiconListener)
  {
    y.a locala = a("asr", this.d);
    X.a("start engine mode = " + locala.toString());
    if (locala == y.a.b) {
      if (this.d != null) {}
    }
    while (this.c == null)
    {
      return 21001;
      this.d.setParameter("params", null);
      this.d.setParameter("params", this.b.toString());
      paramLexiconListener = new SpeechRecognizer.3(this, paramLexiconListener);
      return this.d.updateLexicon(paramString1, paramString2, paramLexiconListener);
    }
    this.c.setParameter(this.b);
    return this.c.a(paramString1, paramString2, paramLexiconListener);
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.f())) {
      return this.c.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    if ((this.d != null) && (this.d.isListening())) {
      return this.d.writeAudio(paramArrayOfByte, paramInt1, paramInt2);
    }
    X.b("SpeechRecognizer writeAudio failed, is not running");
    return 21004;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */