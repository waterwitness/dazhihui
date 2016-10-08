package com.tencent.beaconimsdk.a;

import android.content.Context;

public final class c
{
  private static c m = null;
  private Context a = null;
  private String b = "";
  private String c = "";
  private byte d = -1;
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private long j = 0L;
  private String k = "";
  private String l = "";
  
  /* Error */
  public static void a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull +198 -> 202
    //   7: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   10: ifnonnull +13 -> 23
    //   13: new 2	com/tencent/beaconimsdk/a/c
    //   16: dup
    //   17: invokespecial 58	com/tencent/beaconimsdk/a/c:<init>	()V
    //   20: putstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   23: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   26: astore_1
    //   27: aload_1
    //   28: monitorenter
    //   29: ldc 60
    //   31: iconst_0
    //   32: anewarray 4	java/lang/Object
    //   35: invokestatic 65	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   41: aload_0
    //   42: putfield 32	com/tencent/beaconimsdk/a/c:a	Landroid/content/Context;
    //   45: aload_0
    //   46: invokestatic 70	com/tencent/beaconimsdk/a/e:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/e;
    //   49: pop
    //   50: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   53: invokestatic 73	com/tencent/beaconimsdk/a/e:a	()Ljava/lang/String;
    //   56: putfield 36	com/tencent/beaconimsdk/a/c:b	Ljava/lang/String;
    //   59: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   62: astore_2
    //   63: new 75	java/lang/StringBuffer
    //   66: dup
    //   67: invokespecial 76	java/lang/StringBuffer:<init>	()V
    //   70: astore_3
    //   71: aload_3
    //   72: ldc 78
    //   74: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   77: pop
    //   78: aload_3
    //   79: invokestatic 84	com/tencent/beaconimsdk/a/e:b	()Ljava/lang/String;
    //   82: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   85: pop
    //   86: aload_3
    //   87: ldc 86
    //   89: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   92: pop
    //   93: aload_3
    //   94: invokestatic 88	com/tencent/beaconimsdk/a/e:c	()Ljava/lang/String;
    //   97: invokevirtual 82	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   100: pop
    //   101: aload_2
    //   102: aload_3
    //   103: invokevirtual 91	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   106: putfield 38	com/tencent/beaconimsdk/a/c:c	Ljava/lang/String;
    //   109: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   112: invokespecial 94	com/tencent/beaconimsdk/a/c:n	()V
    //   115: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   118: aload_0
    //   119: invokestatic 99	com/tencent/beaconimsdk/a/a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   122: invokespecial 102	com/tencent/beaconimsdk/a/c:c	(Ljava/lang/String;)V
    //   125: getstatic 104	com/tencent/beaconimsdk/a/a:a	Ljava/lang/String;
    //   128: ifnull +12 -> 140
    //   131: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   134: getstatic 104	com/tencent/beaconimsdk/a/a:a	Ljava/lang/String;
    //   137: invokevirtual 106	com/tencent/beaconimsdk/a/c:a	(Ljava/lang/String;)V
    //   140: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   143: ldc 108
    //   145: invokespecial 110	com/tencent/beaconimsdk/a/c:d	(Ljava/lang/String;)V
    //   148: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   151: ldc 112
    //   153: invokespecial 114	com/tencent/beaconimsdk/a/c:e	(Ljava/lang/String;)V
    //   156: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   159: ldc 116
    //   161: invokevirtual 118	com/tencent/beaconimsdk/a/c:b	(Ljava/lang/String;)V
    //   164: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   167: aload_0
    //   168: invokestatic 120	com/tencent/beaconimsdk/a/e:b	(Landroid/content/Context;)Ljava/lang/String;
    //   171: invokespecial 122	com/tencent/beaconimsdk/a/c:f	(Ljava/lang/String;)V
    //   174: invokestatic 127	com/tencent/beaconimsdk/event/UserAction:getAppkey	()Ljava/lang/String;
    //   177: ifnull +29 -> 206
    //   180: ldc 34
    //   182: invokestatic 127	com/tencent/beaconimsdk/event/UserAction:getAppkey	()Ljava/lang/String;
    //   185: invokevirtual 133	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   188: ifne +18 -> 206
    //   191: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   194: invokestatic 127	com/tencent/beaconimsdk/event/UserAction:getAppkey	()Ljava/lang/String;
    //   197: invokespecial 135	com/tencent/beaconimsdk/a/c:g	(Ljava/lang/String;)V
    //   200: aload_1
    //   201: monitorexit
    //   202: ldc 2
    //   204: monitorexit
    //   205: return
    //   206: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   209: getstatic 26	com/tencent/beaconimsdk/a/c:m	Lcom/tencent/beaconimsdk/a/c;
    //   212: invokespecial 138	com/tencent/beaconimsdk/a/c:o	()Ljava/lang/String;
    //   215: invokespecial 135	com/tencent/beaconimsdk/a/c:g	(Ljava/lang/String;)V
    //   218: goto -18 -> 200
    //   221: astore_0
    //   222: aload_1
    //   223: monitorexit
    //   224: aload_0
    //   225: athrow
    //   226: astore_0
    //   227: ldc 2
    //   229: monitorexit
    //   230: aload_0
    //   231: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	paramContext	Context
    //   62	40	2	localc2	c
    //   70	33	3	localStringBuffer	StringBuffer
    // Exception table:
    //   from	to	target	type
    //   29	140	221	finally
    //   140	200	221	finally
    //   200	202	221	finally
    //   206	218	221	finally
    //   7	23	226	finally
    //   23	29	226	finally
    //   222	226	226	finally
  }
  
  private void c(String paramString)
  {
    try
    {
      this.e = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void d(String paramString)
  {
    try
    {
      this.g = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void e(String paramString)
  {
    try
    {
      this.h = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  private void f(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 34
    //   4: aload_1
    //   5: invokevirtual 133	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifne +14 -> 24
    //   13: aload_0
    //   14: getfield 32	com/tencent/beaconimsdk/a/c:a	Landroid/content/Context;
    //   17: ldc -114
    //   19: aload_1
    //   20: invokestatic 145	com/tencent/beaconimsdk/a/a:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   23: pop
    //   24: aload_0
    //   25: aload_1
    //   26: putfield 54	com/tencent/beaconimsdk/a/c:k	Ljava/lang/String;
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: astore_2
    //   38: goto -14 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	c
    //   0	41	1	paramString	String
    //   37	1	2	localException	Exception
    //   8	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	9	32	finally
    //   13	24	32	finally
    //   24	29	32	finally
    //   13	24	37	java/lang/Exception
  }
  
  private void g(String paramString)
  {
    try
    {
      this.l = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static c m()
  {
    try
    {
      c localc = m;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void n()
  {
    try
    {
      this.d = 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private String o()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.j = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.f = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final void b(String paramString)
  {
    try
    {
      this.i = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final byte c()
  {
    try
    {
      byte b1 = this.d;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String d()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String f()
  {
    try
    {
      String str = this.h;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String g()
  {
    try
    {
      String str = this.i;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long h()
  {
    try
    {
      long l1 = this.j;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final String i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 34
    //   4: aload_0
    //   5: getfield 54	com/tencent/beaconimsdk/a/c:k	Ljava/lang/String;
    //   8: invokevirtual 133	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +18 -> 31
    //   16: aload_0
    //   17: aload_0
    //   18: getfield 32	com/tencent/beaconimsdk/a/c:a	Landroid/content/Context;
    //   21: ldc -114
    //   23: ldc 34
    //   25: invokestatic 152	com/tencent/beaconimsdk/a/a:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: putfield 54	com/tencent/beaconimsdk/a/c:k	Ljava/lang/String;
    //   31: aload_0
    //   32: getfield 54	com/tencent/beaconimsdk/a/c:k	Ljava/lang/String;
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_1
    //   46: goto -15 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	c
    //   35	4	1	str	String
    //   40	4	1	localObject	Object
    //   45	1	1	localException	Exception
    //   11	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	12	40	finally
    //   16	31	40	finally
    //   31	36	40	finally
    //   16	31	45	java/lang/Exception
  }
  
  public final String j()
  {
    try
    {
      String str = this.l;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void k() {}
  
  public final Context l()
  {
    try
    {
      Context localContext = this.a;
      return localContext;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */