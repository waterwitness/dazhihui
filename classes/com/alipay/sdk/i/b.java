package com.alipay.sdk.i;

import android.content.Context;
import android.text.TextUtils;

public final class b
{
  private static b c;
  public String a;
  public String b;
  
  public static b a()
  {
    try
    {
      if (c == null)
      {
        c = new b();
        localObject1 = com.alipay.sdk.h.b.a().a;
        a locala = new a((Context)localObject1);
        String str2 = com.alipay.sdk.j.a.a((Context)localObject1).a();
        String str3 = com.alipay.sdk.j.a.a((Context)localObject1).b();
        c.a = locala.a(str2, str3);
        c.b = locala.b(str2, str3);
        if (TextUtils.isEmpty(c.b))
        {
          b localb = c;
          String str1 = Long.toHexString(System.currentTimeMillis());
          localObject1 = str1;
          if (str1.length() > 10) {
            localObject1 = str1.substring(str1.length() - 10);
          }
          localb.b = ((String)localObject1);
        }
        locala.a(str2, str3, c.a, c.b);
      }
      Object localObject1 = c;
      return (b)localObject1;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */