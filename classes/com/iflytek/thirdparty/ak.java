package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechUnderstanderListener;

public class ak
{
  protected static ak a = null;
  private ai b = null;
  
  public ak(Context paramContext)
  {
    this.b = new ai(paramContext);
  }
  
  public int a(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    paramSpeechUnderstanderListener = new ak.a(this, paramSpeechUnderstanderListener);
    if (TextUtils.isEmpty(this.b.getParameter("asr_sch"))) {
      this.b.setParameter("asr_sch", "1");
    }
    if (TextUtils.isEmpty(this.b.getParameter("nlp_version"))) {
      this.b.setParameter("nlp_version", "2.0");
    }
    if (TextUtils.isEmpty(this.b.getParameter("result_type"))) {
      this.b.setParameter("result_type", "json");
    }
    this.b.a(paramSpeechUnderstanderListener);
    return 0;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.b.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.b.cancel(paramBoolean);
  }
  
  public boolean a()
  {
    return this.b.f();
  }
  
  public boolean a(aa paramaa)
  {
    return this.b.setParameter(paramaa);
  }
  
  public void b()
  {
    this.b.e();
  }
  
  public boolean c()
  {
    boolean bool = this.b.destroy();
    if (bool) {
      a = null;
    }
    return bool;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */