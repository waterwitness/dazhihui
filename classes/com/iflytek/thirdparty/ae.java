package com.iflytek.thirdparty;

import android.content.Context;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechUtility;

public class ae
  extends y
{
  P.a a = new ae.1(this);
  private String c = "http://openapi.openspeech.cn/webapi/wfr.do";
  private String d = "pver=1.0";
  private Context e = null;
  private P f = null;
  private RequestListener g;
  
  public ae(Context paramContext, aa paramaa)
  {
    this.b = paramaa;
    this.e = paramContext;
    this.f = new P();
  }
  
  public int a(byte[] paramArrayOfByte, RequestListener paramRequestListener)
  {
    try
    {
      this.g = paramRequestListener;
      if (SpeechUtility.getUtility() == null) {
        return 10111;
      }
      paramRequestListener = ac.c(this.e, this.b);
      this.f.b(this.b.a("timeout", 20000));
      this.f.a(1);
      this.f.a(this.c, this.d, paramArrayOfByte, paramRequestListener);
      this.f.a(this.a);
      Y.a("LastDataFlag", null);
      return 0;
    }
    catch (Exception paramArrayOfByte) {}
    return 20999;
  }
  
  public void a()
  {
    this.f.a();
    this.f = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */