package com.iflytek.thirdparty;

import android.content.Context;
import com.iflytek.cloud.IdentityListener;
import com.iflytek.cloud.SpeechError;

public class af
  extends z
{
  private boolean f = false;
  
  public af(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(IdentityListener paramIdentityListener)
  {
    synchronized (this.c)
    {
      try
      {
        this.f = this.b.a("request_audio_focus", true);
        if ((this.d != null) && (this.d.t())) {
          this.d.b(this.b.a("mfv_interrupt_error", false));
        }
        this.d = new u(this.a, this.b, a("mfv"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((u)this.d).a(new af.a(this, paramIdentityListener));
        i = 0;
      }
      catch (SpeechError paramIdentityListener)
      {
        for (;;)
        {
          i = paramIdentityListener.getErrorCode();
          X.a(paramIdentityListener);
        }
      }
      catch (Throwable paramIdentityListener)
      {
        for (;;)
        {
          X.a(paramIdentityListener);
          int i = 20999;
        }
      }
      return i;
    }
  }
  
  public int a(String paramString1, String paramString2, String paramString3, IdentityListener paramIdentityListener)
  {
    setParameter("sst", paramString2);
    int j = a(paramIdentityListener);
    int i = j;
    if (j == 0)
    {
      i = a(paramString1, paramString3, null, 0, 0);
      c(paramString1);
    }
    return i;
  }
  
  public int a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    synchronized (this.c)
    {
      if (this.d == null)
      {
        X.b("writeAudio error, no active session.");
        return 21004;
      }
      if (paramInt2 < 0)
      {
        X.b("writeAudio error, length < 0.");
        return 10109;
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length < paramInt2 + paramInt1))
    {
      X.b("writeAudio error, buffer length < offset + length.");
      return 10109;
    }
    ((u)this.d).a(paramString1, paramString2, paramArrayOfByte, paramInt1, paramInt2);
    return 0;
  }
  
  public void b(String paramString)
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((u)this.d).k().a(paramString);
      }
      return;
    }
  }
  
  public void c(String paramString)
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((u)this.d).a(paramString, true);
      }
      return;
    }
  }
  
  public void cancel(boolean paramBoolean)
  {
    N.b(this.a, Boolean.valueOf(this.f), null);
    super.cancel(paramBoolean);
  }
  
  public boolean e()
  {
    return d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */