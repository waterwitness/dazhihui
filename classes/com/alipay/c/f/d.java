package com.alipay.c.f;

import android.content.Context;
import org.json.JSONObject;

public final class d
{
  private static c a(String paramString)
  {
    try
    {
      if (!com.alipay.d.a.a.a.a.a(paramString))
      {
        paramString = new JSONObject(paramString);
        paramString = new c(paramString.optString("apdid"), paramString.optString("deviceInfoHash"), paramString.optString("timestamp"), paramString.optString("tid"), paramString.optString("utdid"));
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      com.alipay.c.c.a.a(paramString);
    }
    return null;
  }
  
  public static void a() {}
  
  public static void a(Context paramContext)
  {
    try
    {
      com.alipay.c.h.a.a(paramContext, "vkeyid_profiles_v4", "key_deviceid_v4", "");
      com.alipay.c.h.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static void a(Context paramContext, c paramc)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("apdid", paramc.a());
      localJSONObject.put("deviceInfoHash", paramc.b());
      localJSONObject.put("timestamp", paramc.c());
      localJSONObject.put("tid", paramc.d());
      localJSONObject.put("utdid", paramc.e());
      paramc = localJSONObject.toString();
      com.alipay.c.h.a.a(paramContext, "vkeyid_profiles_v4", "key_deviceid_v4", paramc);
      com.alipay.c.h.a.a("wxcasxx_v4", "key_wxcasxx_v4", paramc);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        com.alipay.c.c.a.a(paramContext);
      }
    }
    finally {}
  }
  
  /* Error */
  public static c b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 59
    //   5: ldc 61
    //   7: invokestatic 93	com/alipay/c/h/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_0
    //   11: aload_0
    //   12: invokestatic 13	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   15: istore_1
    //   16: iload_1
    //   17: ifeq +10 -> 27
    //   20: aconst_null
    //   21: astore_0
    //   22: ldc 2
    //   24: monitorexit
    //   25: aload_0
    //   26: areturn
    //   27: aload_0
    //   28: invokestatic 95	com/alipay/c/f/d:a	(Ljava/lang/String;)Lcom/alipay/c/f/c;
    //   31: astore_0
    //   32: goto -10 -> 22
    //   35: astore_0
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	22	0	localObject1	Object
    //   35	5	0	localObject2	Object
    //   15	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	16	35	finally
    //   27	32	35	finally
  }
  
  public static c b(Context paramContext)
  {
    try
    {
      String str = com.alipay.c.h.a.a(paramContext, "vkeyid_profiles_v4", "key_deviceid_v4");
      paramContext = str;
      if (com.alipay.d.a.a.a.a.a(str)) {
        paramContext = com.alipay.c.h.a.a("wxcasxx_v4", "key_wxcasxx_v4");
      }
      paramContext = a(paramContext);
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public static c c(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 48
    //   6: ldc 50
    //   8: invokestatic 99	com/alipay/c/h/a:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_0
    //   12: aload_0
    //   13: invokestatic 13	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   16: istore_1
    //   17: iload_1
    //   18: ifeq +10 -> 28
    //   21: aconst_null
    //   22: astore_0
    //   23: ldc 2
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: aload_0
    //   29: invokestatic 95	com/alipay/c/f/d:a	(Ljava/lang/String;)Lcom/alipay/c/f/c;
    //   32: astore_0
    //   33: goto -10 -> 23
    //   36: astore_0
    //   37: ldc 2
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	paramContext	Context
    //   16	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	17	36	finally
    //   28	33	36	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */