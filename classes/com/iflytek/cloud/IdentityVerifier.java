package com.iflytek.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.msc.MSC;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.af;
import com.iflytek.thirdparty.y;

public final class IdentityVerifier
  extends y
{
  private static IdentityVerifier a = null;
  private af c = null;
  private InitListener d = null;
  private Handler e = new IdentityVerifier.1(this, Looper.getMainLooper());
  
  protected IdentityVerifier(Context paramContext, InitListener paramInitListener)
  {
    this.d = paramInitListener;
    if (MSC.isLoaded()) {
      this.c = new af(paramContext);
    }
    if (paramInitListener != null) {
      Message.obtain(this.e, 0, 0, 0, null).sendToTarget();
    }
  }
  
  public static IdentityVerifier createVerifier(Context paramContext, InitListener paramInitListener)
  {
    try
    {
      if (a == null) {
        a = new IdentityVerifier(paramContext, paramInitListener);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static IdentityVerifier getVerifier()
  {
    return a;
  }
  
  public void cancel()
  {
    if ((this.c != null) && (this.c.e()))
    {
      this.c.cancel(false);
      return;
    }
    X.b("IdentityVerifier cancel failed, is not running");
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
  
  public int execute(String paramString1, String paramString2, String paramString3, IdentityListener paramIdentityListener)
  {
    if (this.c != null)
    {
      if (this.c.setParameter(this.b)) {
        return this.c.a(paramString1, paramString2, paramString3, paramIdentityListener);
      }
      return 20012;
    }
    X.b("IdentityVerifier execute failed, is not running");
    return 21001;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isWorking()
  {
    return (this.c != null) && (this.c.e());
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startWorking(IdentityListener paramIdentityListener)
  {
    if (this.c == null) {
      return 21001;
    }
    this.c.setParameter(this.b);
    return this.c.a(paramIdentityListener);
  }
  
  public void stopWrite(String paramString)
  {
    if ((this.c != null) && (this.c.e()))
    {
      this.c.c(paramString);
      return;
    }
    X.b("IdentityVerifier stopListening failed, is not running");
  }
  
  public int writeData(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.e())) {
      return this.c.a(paramString1, paramString2, paramArrayOfByte, paramInt1, paramInt2);
    }
    X.b("IdentityVerifier writeAudio failed, is not running");
    return 21004;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\IdentityVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */