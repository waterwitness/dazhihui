package com.tencent.qalsdk.core;

import com.tencent.qalsdk.config.NativeConfigStore;

public class l
{
  static NativeConfigStore a = null;
  private static String b = "MSF.C.MsfStore";
  
  public static NativeConfigStore a()
  {
    return a;
  }
  
  public String a(String paramString)
  {
    return null;
  }
  
  public void a(String paramString1, String paramString2) {}
  
  /* Error */
  public boolean a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: new 28	com/tencent/qalsdk/config/NativeConfigStore
    //   7: dup
    //   8: aload_1
    //   9: invokespecial 31	com/tencent/qalsdk/config/NativeConfigStore:<init>	(Landroid/content/Context;)V
    //   12: putstatic 12	com/tencent/qalsdk/core/l:a	Lcom/tencent/qalsdk/config/NativeConfigStore;
    //   15: aload_1
    //   16: invokestatic 36	com/tencent/qalsdk/core/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   19: astore_2
    //   20: aload_2
    //   21: ifnonnull +32 -> 53
    //   24: invokestatic 42	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   27: ifeq +12 -> 39
    //   30: getstatic 16	com/tencent/qalsdk/core/l:b	Ljava/lang/String;
    //   33: iconst_2
    //   34: ldc 44
    //   36: invokestatic 48	com/tencent/qalsdk/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   39: getstatic 12	com/tencent/qalsdk/core/l:a	Lcom/tencent/qalsdk/config/NativeConfigStore;
    //   42: getfield 52	com/tencent/qalsdk/config/NativeConfigStore:loadSaveRootSucc	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   45: iconst_0
    //   46: invokevirtual 58	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   49: aload_0
    //   50: monitorexit
    //   51: iload_3
    //   52: ireturn
    //   53: getstatic 12	com/tencent/qalsdk/core/l:a	Lcom/tencent/qalsdk/config/NativeConfigStore;
    //   56: aload_2
    //   57: invokevirtual 62	com/tencent/qalsdk/config/NativeConfigStore:setSaveRootPath	(Ljava/lang/String;)V
    //   60: getstatic 12	com/tencent/qalsdk/core/l:a	Lcom/tencent/qalsdk/config/NativeConfigStore;
    //   63: aload_1
    //   64: iconst_0
    //   65: invokevirtual 66	com/tencent/qalsdk/config/NativeConfigStore:loadConfig	(Landroid/content/Context;Z)V
    //   68: iconst_1
    //   69: istore_3
    //   70: goto -21 -> 49
    //   73: astore_1
    //   74: getstatic 16	com/tencent/qalsdk/core/l:b	Ljava/lang/String;
    //   77: iconst_1
    //   78: new 68	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 69	java/lang/StringBuilder:<init>	()V
    //   85: ldc 71
    //   87: invokevirtual 75	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload_1
    //   91: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: aload_1
    //   98: invokestatic 86	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   101: goto -52 -> 49
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	l
    //   0	109	1	paramContext	android.content.Context
    //   19	38	2	str	String
    //   1	69	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   53	68	73	java/lang/Throwable
    //   4	20	104	finally
    //   24	39	104	finally
    //   39	49	104	finally
    //   53	68	104	finally
    //   74	101	104	finally
  }
  
  public String[] b(String paramString)
  {
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */