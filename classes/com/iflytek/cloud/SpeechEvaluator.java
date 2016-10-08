package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.msc.MSC;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.ah;
import com.iflytek.thirdparty.y;

public class SpeechEvaluator
  extends y
{
  private static SpeechEvaluator a = null;
  private ah c = null;
  
  protected SpeechEvaluator(Context paramContext, InitListener paramInitListener)
  {
    if (MSC.isLoaded()) {
      this.c = new ah(paramContext);
    }
    if (paramInitListener != null) {}
  }
  
  public static SpeechEvaluator createEvaluator(Context paramContext, InitListener paramInitListener)
  {
    if (a == null) {
      a = new SpeechEvaluator(paramContext, null);
    }
    return a;
  }
  
  public static SpeechEvaluator getEvaluator()
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
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isEvaluating()
  {
    return (this.c != null) && (this.c.f());
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startEvaluating(String paramString1, String paramString2, EvaluatorListener paramEvaluatorListener)
  {
    if (this.c == null) {
      return 21001;
    }
    this.c.setParameter(this.b);
    return this.c.a(paramString1, paramString2, paramEvaluatorListener);
  }
  
  public int startEvaluating(byte[] paramArrayOfByte, String paramString, EvaluatorListener paramEvaluatorListener)
  {
    if (this.c == null) {
      return 21001;
    }
    this.c.setParameter(this.b);
    return this.c.a(paramArrayOfByte, paramString, paramEvaluatorListener);
  }
  
  public void stopEvaluating()
  {
    if ((this.c != null) && (this.c.f()))
    {
      this.c.e();
      return;
    }
    X.b("SpeechEvaluator stopEvaluating failed, is not running");
  }
  
  public boolean writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.c != null) && (this.c.f())) {
      return this.c.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    X.b("SpeechEvaluator writeAudio failed, is not running");
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechEvaluator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */