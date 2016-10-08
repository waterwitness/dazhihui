package com.alipay.d.a.a.c.b;

import android.content.Context;
import com.alipay.d.a.a.c.a.c;

public final class b
  implements a
{
  private static a a = null;
  private static com.alipay.d.a.a.c.a b = null;
  
  public static a a(Context paramContext, String paramString)
  {
    Object localObject = null;
    if (paramContext == null) {
      return null;
    }
    if (a == null) {
      if (paramContext != null) {
        break label38;
      }
    }
    label38:
    for (paramContext = (Context)localObject;; paramContext = com.alipay.d.a.a.c.b.a(paramContext, paramString))
    {
      b = paramContext;
      a = new b();
      return a;
    }
  }
  
  public final com.alipay.d.a.a.c.a.b a(c paramc)
  {
    Object localObject = new com.alipay.g.a.a.b.a.a();
    ((com.alipay.g.a.a.b.a.a)localObject).a = paramc.a();
    ((com.alipay.g.a.a.b.a.a)localObject).b = paramc.b();
    ((com.alipay.g.a.a.b.a.a)localObject).c = paramc.c();
    ((com.alipay.g.a.a.b.a.a)localObject).d = paramc.d();
    ((com.alipay.g.a.a.b.a.a)localObject).e = paramc.e();
    ((com.alipay.g.a.a.b.a.a)localObject).f = paramc.f();
    ((com.alipay.g.a.a.b.a.a)localObject).g = paramc.g();
    ((com.alipay.g.a.a.b.a.a)localObject).h = paramc.h();
    ((com.alipay.g.a.a.b.a.a)localObject).i = paramc.i();
    paramc = b.a((com.alipay.g.a.a.b.a.a)localObject);
    localObject = new com.alipay.d.a.a.c.a.b();
    if (paramc == null) {
      paramc = null;
    }
    String str;
    do
    {
      do
      {
        return paramc;
        ((com.alipay.d.a.a.c.a.b)localObject).a = paramc.a;
        ((com.alipay.d.a.a.c.a.b)localObject).b = paramc.b;
        ((com.alipay.d.a.a.c.a.b)localObject).c = paramc.c;
        ((com.alipay.d.a.a.c.a.b)localObject).d = paramc.d;
        ((com.alipay.d.a.a.c.a.b)localObject).e = paramc.e;
        ((com.alipay.d.a.a.c.a.b)localObject).f = paramc.f;
        ((com.alipay.d.a.a.c.a.b)localObject).g = paramc.g;
        ((com.alipay.d.a.a.c.a.b)localObject).i = paramc.i;
        str = paramc.h;
        ((com.alipay.d.a.a.c.a.b)localObject).h = "0";
        ((com.alipay.d.a.a.c.a.b)localObject).j = "0";
        paramc = (c)localObject;
      } while (!com.alipay.d.a.a.a.a.b(str));
      paramc = (c)localObject;
    } while (str.length() <= 0);
    ((com.alipay.d.a.a.c.a.b)localObject).h = str.charAt(0);
    return (com.alipay.d.a.a.c.a.b)localObject;
  }
  
  public final boolean a(String paramString)
  {
    return b.a(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */