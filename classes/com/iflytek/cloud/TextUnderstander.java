package com.iflytek.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.msc.MSC;
import com.iflytek.speech.TextUnderstanderAidl;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.aa;
import com.iflytek.thirdparty.al;
import com.iflytek.thirdparty.y;
import com.iflytek.thirdparty.y.a;

public class TextUnderstander
  extends y
{
  private static TextUnderstander d = null;
  private al a = null;
  private TextUnderstanderAidl c = null;
  private TextUnderstander.a e = null;
  private InitListener f = null;
  private Handler g = new TextUnderstander.1(this, Looper.getMainLooper());
  
  protected TextUnderstander(Context paramContext, InitListener paramInitListener)
  {
    this.f = paramInitListener;
    if (MSC.isLoaded()) {
      this.a = new al(paramContext);
    }
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a)) {
      this.c = new TextUnderstanderAidl(paramContext.getApplicationContext(), paramInitListener);
    }
    while (paramInitListener == null) {
      return;
    }
    Message.obtain(this.g, 0, 0, 0, null).sendToTarget();
  }
  
  public static TextUnderstander createTextUnderstander(Context paramContext, InitListener paramInitListener)
  {
    try
    {
      if (d == null) {
        d = new TextUnderstander(paramContext, paramInitListener);
      }
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  public static TextUnderstander getTextUnderstander()
  {
    return d;
  }
  
  protected void a(Context paramContext)
  {
    SpeechUtility localSpeechUtility = SpeechUtility.getUtility();
    if ((localSpeechUtility != null) && (localSpeechUtility.a()) && (localSpeechUtility.getEngineMode() != y.a.a))
    {
      if ((this.c != null) && (!this.c.isAvailable()))
      {
        this.c.destory();
        this.c = null;
      }
      this.c = new TextUnderstanderAidl(paramContext.getApplicationContext(), this.f);
    }
    while ((this.f == null) || (this.c == null)) {
      return;
    }
    this.c.destory();
    this.c = null;
  }
  
  public void cancel()
  {
    if (this.a != null)
    {
      this.a.cancel(false);
      return;
    }
    if (this.c != null)
    {
      this.c.cancel(TextUnderstander.a.a(this.e));
      return;
    }
    X.b("TextUnderstander cancel failed, is not running");
  }
  
  public boolean destroy()
  {
    boolean bool = true;
    if (this.c != null)
    {
      this.c.destory();
      this.c = null;
    }
    if (this.a != null) {
      bool = this.a.destroy();
    }
    if (bool) {
      d = null;
    }
    return bool;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isUnderstanding()
  {
    if ((this.a != null) && (this.a.e())) {}
    while ((this.c != null) && (this.c.isUnderstanding())) {
      return true;
    }
    return false;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int understandText(String paramString, TextUnderstanderListener paramTextUnderstanderListener)
  {
    y.a locala = a("nlu", this.c);
    X.a("start engine mode = " + locala.toString());
    if (locala == y.a.b) {
      if (this.c != null) {}
    }
    while (this.a == null)
    {
      return 21001;
      this.c.setParameter("params", null);
      this.c.setParameter("params", this.b.toString());
      this.e = new TextUnderstander.a(this, paramTextUnderstanderListener);
      return this.c.understandText(paramString, TextUnderstander.a.a(this.e));
    }
    this.a.setParameter(this.b);
    return this.a.a(paramString, paramTextUnderstanderListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */