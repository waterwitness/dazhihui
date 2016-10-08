package com.iflytek.thirdparty;

import android.content.Context;
import com.iflytek.cloud.DataDownloader;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.VerifierListener;
import java.util.Random;

public class ag
  extends z
{
  private boolean f = false;
  
  public ag(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(VerifierListener paramVerifierListener)
  {
    synchronized (this.c)
    {
      try
      {
        this.f = this.b.a("request_audio_focus", true);
        if ((this.d != null) && (this.d.t())) {
          this.d.b(this.b.a("isv_interrupt_error", false));
        }
        this.d = new o(this.a, this.b, a("verify"));
        N.a(this.a, Boolean.valueOf(this.f), null);
        ((o)this.d).a(new ag.a(this, paramVerifierListener));
        i = 0;
      }
      catch (SpeechError paramVerifierListener)
      {
        for (;;)
        {
          i = paramVerifierListener.getErrorCode();
          X.a(paramVerifierListener);
        }
      }
      catch (Throwable paramVerifierListener)
      {
        for (;;)
        {
          X.a(paramVerifierListener);
          int i = 20999;
        }
      }
      return i;
    }
  }
  
  public int a(String paramString1, String paramString2, SpeechListener paramSpeechListener)
  {
    int i = 0;
    synchronized (this.c)
    {
      try
      {
        this.b.a("cmd", paramString1);
        this.b.a("auth_id", paramString2);
        new n(this.a, a("manager")).a(this.b, new n.a(paramSpeechListener));
        return i;
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
          i = 20999;
        }
      }
    }
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
    if (((o)this.d).k() != -1) {
      return 10106;
    }
    ((o)this.d).onRecordBuffer(paramArrayOfByte, paramInt1, paramInt2);
    return 0;
  }
  
  public String a(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Random localRandom = new Random();
    String str = "023456789".charAt(localRandom.nextInt("023456789".length())) + "";
    localStringBuffer.append(str);
    int i = 0;
    while (i < paramInt - 1)
    {
      Boolean localBoolean = Boolean.valueOf(false);
      while (!localBoolean.booleanValue())
      {
        str = "023456789".charAt(localRandom.nextInt("023456789".length())) + "";
        if (localStringBuffer.indexOf(str) >= 0) {
          localBoolean = Boolean.valueOf(false);
        } else if (Integer.parseInt(localStringBuffer.charAt(localStringBuffer.length() - 1) + "") * Integer.parseInt(str) == 10) {
          localBoolean = Boolean.valueOf(false);
        } else {
          localBoolean = Boolean.valueOf(true);
        }
      }
      localStringBuffer.append(str);
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public void a(SpeechListener paramSpeechListener)
  {
    DataDownloader localDataDownloader = new DataDownloader(this.a);
    localDataDownloader.setParameter(this.b);
    localDataDownloader.downloadData(paramSpeechListener);
  }
  
  public void e()
  {
    synchronized (this.c)
    {
      if (this.d != null) {
        ((o)this.d).a();
      }
      return;
    }
  }
  
  public boolean f()
  {
    return d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */