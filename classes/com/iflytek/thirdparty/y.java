package com.iflytek.thirdparty;

import android.text.TextUtils;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.msc.MSC;
import com.iflytek.speech.ISpeechModule;

public abstract class y
{
  protected aa b = new aa();
  
  protected y.a a(String paramString, ISpeechModule paramISpeechModule)
  {
    paramString = getParameter("engine_mode");
    if ("msc".equals(paramString)) {
      return y.a.a;
    }
    if ("plus".equals(paramString)) {
      return y.a.b;
    }
    paramString = SpeechUtility.getUtility();
    if (paramString == null) {
      return y.a.a;
    }
    if (paramString.getEngineMode() != y.a.c) {
      return paramString.getEngineMode();
    }
    if (!MSC.isLoaded()) {
      return y.a.b;
    }
    paramString = getParameter("engine_type");
    if ("local".equals(paramString)) {
      return y.a.b;
    }
    if ("mix".equals(paramString))
    {
      if ((paramISpeechModule == null) || (!paramISpeechModule.isAvailable())) {
        return y.a.a;
      }
      return y.a.b;
    }
    return y.a.a;
  }
  
  public String getParameter(String paramString)
  {
    if ("params".equals(paramString)) {
      return this.b.toString();
    }
    return this.b.e(paramString);
  }
  
  public boolean setParameter(aa paramaa)
  {
    this.b = paramaa.b();
    return true;
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return false;
    }
    if (paramString1.equals("params"))
    {
      if (TextUtils.isEmpty(paramString2))
      {
        this.b.a();
        return true;
      }
      this.b.b(paramString2);
      return true;
    }
    if (TextUtils.isEmpty(paramString2)) {
      return this.b.c(paramString1).booleanValue();
    }
    this.b.a(paramString1, paramString2);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */