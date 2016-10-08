package com.iflytek.thirdparty;

import android.content.Context;
import com.iflytek.cloud.EvaluatorListener;
import com.iflytek.cloud.SpeechError;

public class ah
  extends z
{
  private boolean f = false;
  
  public ah(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(String paramString1, String paramString2, EvaluatorListener paramEvaluatorListener)
  {
    synchronized (this.c)
    {
      try
      {
        this.f = this.b.a("request_audio_focus", true);
        if ((this.d != null) && (this.d.t())) {
          this.d.b(this.b.a("ise_interrupt_error", false));
        }
        this.d = new j(this.a, this.b, a("eva"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((j)this.d).a(paramString1, paramString2, new ah.a(this, paramEvaluatorListener));
        i = 0;
      }
      catch (SpeechError paramString1)
      {
        for (;;)
        {
          i = paramString1.getErrorCode();
          X.a(paramString1);
        }
      }
      catch (Throwable paramString1)
      {
        for (;;)
        {
          X.a(paramString1);
          int i = 20999;
        }
      }
      return i;
    }
  }
  
  public int a(byte[] paramArrayOfByte, String paramString, EvaluatorListener paramEvaluatorListener)
  {
    synchronized (this.c)
    {
      try
      {
        this.f = this.b.a("request_audio_focus", true);
        if ((this.d != null) && (this.d.t())) {
          this.d.b(this.b.a("ise_interrupt_error", false));
        }
        this.d = new j(this.a, this.b, a("eva"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((j)this.d).a(paramArrayOfByte, paramString, new ah.a(this, paramEvaluatorListener));
        i = 0;
      }
      catch (SpeechError paramArrayOfByte)
      {
        for (;;)
        {
          i = paramArrayOfByte.getErrorCode();
          X.a(paramArrayOfByte);
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        for (;;)
        {
          X.a(paramArrayOfByte);
          int i = 20999;
        }
      }
      return i;
    }
  }
  
  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (this.c)
    {
      if (this.d == null)
      {
        X.a("writeAudio error, no active session.");
        return false;
      }
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        X.a("writeAudio error,buffer is null.");
        return false;
      }
    }
    if (paramArrayOfByte.length < paramInt2 + paramInt1)
    {
      X.a("writeAudio error,buffer length < length.");
      return false;
    }
    ((j)this.d).onRecordBuffer(paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  protected boolean b_()
  {
    return super.b_();
  }
  
  public void cancel(boolean paramBoolean)
  {
    super.cancel(paramBoolean);
  }
  
  public void e()
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((j)this.d).a(true);
      }
      return;
    }
  }
  
  public boolean f()
  {
    return d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */