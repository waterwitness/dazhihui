package com.iflytek.thirdparty;

import android.content.Context;
import android.util.Log;

public final class d
  extends Thread
{
  private Context a;
  private String b = "";
  private int c;
  private String d = "";
  private String e = "";
  
  d(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.c = paramInt;
  }
  
  d(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    this.a = paramContext;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  public final void run()
  {
    try
    {
      switch (this.c)
      {
      case 6: 
        b.g(this.a);
        return;
      }
    }
    catch (Exception localException)
    {
      Log.e("MobileAgent", "Exception occurred when recording usage.");
      localException.printStackTrace();
      return;
    }
    b.a(this.a, this.b);
    return;
    b.e(this.a, this.b, this.d);
    return;
    b.b(this.a, this.b);
    return;
    b.c(this.a, null);
    return;
    String str1 = h.h(this.a);
    String str2 = h.i(this.a);
    if ((str1 == null) || (str1.length() == 0))
    {
      Log.e("UploadThread", "unexpected empty appkey");
      return;
    }
    if ((str2 == null) || (str2.length() == 0)) {
      Log.e("UploadThread", "unexpected empty channelId");
    }
    b.a(this.a, true);
    return;
    b.a(this.a, false);
    return;
    b.b(this.a, this.d, this.e);
    return;
    b.f(this.a, this.d);
    return;
    b.c(this.a, this.d, this.e);
    return;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */