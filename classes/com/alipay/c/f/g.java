package com.alipay.c.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class g
{
  /* Error */
  public static String a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 8
    //   6: new 10	java/lang/StringBuilder
    //   9: dup
    //   10: ldc 12
    //   12: invokespecial 16	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: invokevirtual 24	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: ldc 26
    //   24: invokestatic 31	com/alipay/d/a/a/d/c:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   27: astore_0
    //   28: aload_0
    //   29: invokestatic 36	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   32: ifeq +11 -> 43
    //   35: ldc 26
    //   37: astore_0
    //   38: ldc 2
    //   40: monitorexit
    //   41: aload_0
    //   42: areturn
    //   43: invokestatic 40	com/alipay/d/a/a/a/a/c:a	()Ljava/lang/String;
    //   46: aload_0
    //   47: invokestatic 44	com/alipay/d/a/a/a/a/c:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   50: astore_1
    //   51: aload_1
    //   52: astore_0
    //   53: aload_1
    //   54: invokestatic 36	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   57: ifeq -19 -> 38
    //   60: ldc 26
    //   62: astore_0
    //   63: goto -25 -> 38
    //   66: astore_0
    //   67: ldc 2
    //   69: monitorexit
    //   70: aload_0
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	paramContext	Context
    //   0	72	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   3	35	66	finally
    //   43	51	66	finally
    //   53	60	66	finally
  }
  
  public static void a() {}
  
  public static void a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("openapi_file_pri", 0).edit();
      if (paramContext != null)
      {
        paramContext.clear();
        paramContext.commit();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 8
    //   6: iconst_0
    //   7: invokevirtual 53	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   10: invokeinterface 59 1 0
    //   15: astore_0
    //   16: aload_0
    //   17: ifnull +40 -> 57
    //   20: aload_0
    //   21: new 10	java/lang/StringBuilder
    //   24: dup
    //   25: ldc 12
    //   27: invokespecial 16	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 24	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 40	com/alipay/d/a/a/a/a/c:a	()Ljava/lang/String;
    //   40: aload_2
    //   41: invokestatic 73	com/alipay/d/a/a/a/a/c:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: invokeinterface 77 3 0
    //   49: pop
    //   50: aload_0
    //   51: invokeinterface 68 1 0
    //   56: pop
    //   57: ldc 2
    //   59: monitorexit
    //   60: return
    //   61: astore_0
    //   62: ldc 2
    //   64: monitorexit
    //   65: aload_0
    //   66: athrow
    //   67: astore_0
    //   68: goto -11 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramContext	Context
    //   0	71	1	paramString1	String
    //   0	71	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   3	16	61	finally
    //   20	57	61	finally
    //   3	16	67	java/lang/Throwable
    //   20	57	67	java/lang/Throwable
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */