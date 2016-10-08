package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.SpeechError;

public class ai
  extends z
{
  private boolean f = false;
  
  public ai(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(RecognizerListener paramRecognizerListener)
  {
    synchronized (this.c)
    {
      try
      {
        this.f = this.b.a("request_audio_focus", true);
        if ((this.d != null) && (this.d.t())) {
          this.d.b(this.b.a("asr_interrupt_error", false));
        }
        if (!g()) {
          break label128;
        }
        this.d = new m(this.a, this.b, a("iat"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((l)this.d).a(new ai.c(this, paramRecognizerListener));
        i = 0;
      }
      catch (SpeechError paramRecognizerListener)
      {
        for (;;)
        {
          i = paramRecognizerListener.getErrorCode();
          X.a(paramRecognizerListener);
        }
      }
      catch (Throwable paramRecognizerListener)
      {
        for (;;)
        {
          label128:
          X.a(paramRecognizerListener);
          int i = 20999;
        }
      }
      return i;
      this.d = new l(this.a, this.b, a("iat"));
    }
  }
  
  public int a(String paramString1, String paramString2, GrammarListener paramGrammarListener)
  {
    int j = 20012;
    int i;
    if (TextUtils.isEmpty(paramString2)) {
      i = 20009;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (TextUtils.isEmpty(paramString1));
      i = j;
    } while (paramGrammarListener == null);
    new k().a(paramString1, paramString2, new ai.a(this, paramGrammarListener), this.b);
    return 0;
  }
  
  public int a(String paramString1, String paramString2, LexiconListener paramLexiconListener)
  {
    int j = 20012;
    int i;
    if (TextUtils.isEmpty(paramString2)) {
      i = 20009;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (TextUtils.isEmpty(paramString1));
      i = j;
    } while (paramLexiconListener == null);
    k localk = new k();
    this.b.a("subject", "uup", false);
    String str2 = getParameter("lexicon_type");
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = paramString1;
    }
    this.b.a("data_type", str1, false);
    localk.a(paramString1, paramString2, new ai.b(this, paramLexiconListener), this.b);
    return 0;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (this.c)
    {
      if (this.d == null)
      {
        X.a("writeAudio error, no active session.");
        return 21004;
      }
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        X.a("writeAudio error,buffer is null.");
        return 10109;
      }
    }
    if (paramArrayOfByte.length < paramInt2 + paramInt1)
    {
      X.a("writeAudio error,buffer length < length.");
      return 10109;
    }
    if (((l)this.d).a() != -1) {
      return 10106;
    }
    ((l)this.d).onRecordBuffer(paramArrayOfByte, paramInt1, paramInt2);
    return 0;
  }
  
  public void b(String paramString)
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((l)this.d).n().a(paramString);
      }
      return;
    }
  }
  
  public void cancel(boolean paramBoolean)
  {
    N.b(this.a, Boolean.valueOf(this.f), null);
    super.cancel(paramBoolean);
  }
  
  public void e()
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((l)this.d).a(true);
      }
      return;
    }
  }
  
  public boolean f()
  {
    return d();
  }
  
  protected boolean g()
  {
    if (TextUtils.isEmpty(this.b.e("bos_dispose"))) {
      return "meta".equalsIgnoreCase(this.b.e("vad_engine"));
    }
    return this.b.a("bos_dispose", false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */