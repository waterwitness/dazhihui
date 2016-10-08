package com.alipay.c.f;

import android.content.Context;
import com.alipay.c.c.a;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static String a = "";
  private static String b = "";
  private static String c = "";
  private static String d = "";
  private static String e = "";
  private static Map<String, String> f = new HashMap();
  
  /* Error */
  public static String a(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 38	java/lang/StringBuilder
    //   6: dup
    //   7: ldc 40
    //   9: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: astore_0
    //   20: getstatic 34	com/alipay/c/f/i:f	Ljava/util/Map;
    //   23: aload_0
    //   24: invokeinterface 57 2 0
    //   29: ifeq +30 -> 59
    //   32: getstatic 34	com/alipay/c/f/i:f	Ljava/util/Map;
    //   35: aload_0
    //   36: invokeinterface 61 2 0
    //   41: checkcast 63	java/lang/String
    //   44: astore_0
    //   45: aload_0
    //   46: invokestatic 68	com/alipay/d/a/a/a/a:b	(Ljava/lang/String;)Z
    //   49: istore_1
    //   50: iload_1
    //   51: ifeq +8 -> 59
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload_0
    //   58: areturn
    //   59: ldc 17
    //   61: astore_0
    //   62: goto -8 -> 54
    //   65: astore_0
    //   66: ldc 2
    //   68: monitorexit
    //   69: aload_0
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramString	String
    //   49	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	50	65	finally
  }
  
  public static void a() {}
  
  public static void a(b paramb)
  {
    if (paramb != null) {}
    try
    {
      a = paramb.a();
      b = paramb.b();
      c = paramb.c();
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public static void a(c paramc)
  {
    if (paramc != null) {}
    try
    {
      a = paramc.a();
      b = paramc.b();
      d = paramc.d();
      e = paramc.e();
      c = paramc.c();
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = "apdidTokenCache" + paramString1;
      if (f.containsKey(paramString1)) {
        f.remove(paramString1);
      }
      f.put(paramString1, paramString2);
      return;
    }
    finally {}
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      long l = Math.abs(System.currentTimeMillis() - h.c(paramContext, paramString));
      if (l >= 86400000L) {
        break label38;
      }
      bool = true;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        a.a(paramContext);
        label38:
        boolean bool = false;
      }
    }
    finally {}
    return bool;
  }
  
  public static String b()
  {
    try
    {
      String str = a;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void b(String paramString)
  {
    a = paramString;
  }
  
  public static String c()
  {
    try
    {
      String str = b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void c(String paramString)
  {
    b = paramString;
  }
  
  public static String d()
  {
    try
    {
      String str = d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void d(String paramString)
  {
    c = paramString;
  }
  
  public static String e()
  {
    try
    {
      String str = e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void e(String paramString)
  {
    d = paramString;
  }
  
  public static String f()
  {
    try
    {
      String str = c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void f(String paramString)
  {
    e = paramString;
  }
  
  public static c g()
  {
    try
    {
      c localc = new c(a, b, c, d, e);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void h()
  {
    f.clear();
    a = "";
    b = "";
    d = "";
    e = "";
    c = "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */