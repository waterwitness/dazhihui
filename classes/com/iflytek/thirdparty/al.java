package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.TextUnderstanderListener;

public class al
  extends z
{
  public al(Context paramContext)
  {
    super(paramContext);
  }
  
  public int a(String paramString, TextUnderstanderListener paramTextUnderstanderListener)
  {
    try
    {
      if (TextUtils.isEmpty(getParameter("asr_sch"))) {
        setParameter("asr_sch", "1");
      }
      if (TextUtils.isEmpty(getParameter("nlp_version"))) {
        setParameter("nlp_version", "2.0");
      }
      if (TextUtils.isEmpty(getParameter("result_type"))) {
        setParameter("result_type", "json");
      }
      if (d()) {
        return 21005;
      }
      this.d = new B(this.a, this.b, a("textunderstand"));
      paramTextUnderstanderListener = new al.a(this, paramTextUnderstanderListener);
      ((B)this.d).a(new z.a(this, paramTextUnderstanderListener), paramString);
      return 0;
    }
    catch (SpeechError paramString)
    {
      int i = paramString.getErrorCode();
      X.a(paramString);
      return i;
    }
    catch (Throwable paramString)
    {
      X.a(paramString);
    }
    return 20999;
  }
  
  public void cancel(boolean paramBoolean)
  {
    super.cancel(paramBoolean);
  }
  
  public boolean destroy()
  {
    return super.destroy();
  }
  
  public boolean e()
  {
    return d();
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */