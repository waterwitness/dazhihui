package com.tencent.feedback.common;

import android.content.Context;
import com.tencent.feedback.proguard.o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
{
  private static c F = null;
  private Map<String, PlugInInfo> A = null;
  private boolean B = true;
  private String C = null;
  private List<o> D;
  private Boolean E = null;
  private final Context a;
  private final String b;
  private final byte c;
  private final String d;
  private String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private String k = "10000";
  private String l = "unknown";
  private long m = 0L;
  private String n = "";
  private String o = null;
  private String p = null;
  private String q = null;
  private String r = null;
  private String s = null;
  private String t = null;
  private String u = null;
  private long v = -1L;
  private long w = -1L;
  private long x = -1L;
  private String y = null;
  private String z = null;
  
  private c(Context paramContext)
  {
    e.e("rqdp{  init cominfo}", new Object[0]);
    Object localObject;
    if (paramContext == null) {
      localObject = paramContext;
    }
    for (;;)
    {
      this.a = ((Context)localObject);
      d.a(this.a);
      this.c = 1;
      this.d = a.b(paramContext);
      this.e = a.c(paramContext);
      this.f = "com.tencent.feedback";
      this.g = "1.9.2";
      this.h = d.m();
      this.i = d.a();
      this.j = ("Android " + d.b() + ",level " + d.c());
      this.b = (this.i + ";" + this.j);
      return;
      Context localContext = paramContext.getApplicationContext();
      localObject = localContext;
      if (localContext == null) {
        localObject = paramContext;
      }
    }
  }
  
  private boolean D()
  {
    try
    {
      boolean bool = this.B;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static c a(Context paramContext)
  {
    try
    {
      if (F == null) {
        F = new c(paramContext);
      }
      paramContext = F;
      return paramContext;
    }
    finally {}
  }
  
  private void b(boolean paramBoolean)
  {
    try
    {
      this.B = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final List<o> A()
  {
    try
    {
      List localList = this.D;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String B()
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
  
  public final boolean C()
  {
    try
    {
      if (this.E == null) {
        this.E = Boolean.valueOf(h.a().b());
      }
      boolean bool = this.E.booleanValue();
      return bool;
    }
    finally {}
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.m = paramLong;
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
    String str = paramString;
    if (paramString == null) {
      str = "10000";
    }
    try
    {
      this.k = str;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void a(List<o> paramList)
  {
    try
    {
      this.D = paramList;
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.E = Boolean.valueOf(paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = true;
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        if (this.A == null) {
          this.A = new HashMap();
        }
        this.A.put(paramString1, new PlugInInfo(paramString1, paramString2, paramString3));
        e.a("add %s %s %s", new Object[] { paramString1, paramString2, paramString3 });
      }
      finally {}
    }
  }
  
  public final byte b()
  {
    return 1;
  }
  
  public final void b(String paramString)
  {
    try
    {
      this.n = paramString;
      if (paramString != null) {
        b(false);
      }
      return;
    }
    finally {}
  }
  
  public final String c()
  {
    return this.d;
  }
  
  public final void c(String paramString)
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
  
  public final String d()
  {
    return this.f;
  }
  
  public final void d(String paramString)
  {
    try
    {
      this.q = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String e()
  {
    return this.g;
  }
  
  public final void e(String paramString)
  {
    try
    {
      this.r = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String f()
  {
    return this.h;
  }
  
  /* Error */
  public final void f(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_0
    //   7: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +6 -> 18
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   22: aload_1
    //   23: invokeinterface 235 2 0
    //   28: pop
    //   29: goto -14 -> 15
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	c
    //   0	37	1	paramString	String
    //   10	2	2	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   6	11	32	finally
    //   18	29	32	finally
  }
  
  public final String g()
  {
    return this.j;
  }
  
  public final void g(String paramString)
  {
    this.C = paramString;
  }
  
  public final String h()
  {
    try
    {
      String str = this.k;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void h(String paramString)
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
  
  public final String i()
  {
    try
    {
      String str = this.n;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
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
  
  public final long k()
  {
    try
    {
      long l1 = this.m;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String l()
  {
    try
    {
      if (this.o == null) {
        this.o = a.d(this.a);
      }
      String str = this.o;
      return str;
    }
    finally {}
  }
  
  public final String m()
  {
    try
    {
      if (this.q == null) {
        this.q = a.g(this.a);
      }
      String str = this.q;
      return str;
    }
    finally {}
  }
  
  /* Error */
  public final boolean n()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/tencent/feedback/common/c:q	Ljava/lang/String;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	c
    //   6	2	1	str	String
    //   22	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final String o()
  {
    try
    {
      if (this.r == null)
      {
        this.r = a.a(this.a);
        if ((this.r == null) || (this.r.equals(""))) {
          this.r = this.d;
        }
      }
      String str = this.r;
      return str;
    }
    finally {}
  }
  
  /* Error */
  public final String p()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 250	com/tencent/feedback/common/c:D	()Z
    //   6: ifne +10 -> 16
    //   9: ldc 67
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: getfield 73	com/tencent/feedback/common/c:p	Ljava/lang/String;
    //   20: ifnonnull +22 -> 42
    //   23: aload_0
    //   24: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   27: invokestatic 117	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   30: pop
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   36: invokestatic 251	com/tencent/feedback/common/d:b	(Landroid/content/Context;)Ljava/lang/String;
    //   39: putfield 73	com/tencent/feedback/common/c:p	Ljava/lang/String;
    //   42: aload_0
    //   43: getfield 73	com/tencent/feedback/common/c:p	Ljava/lang/String;
    //   46: astore_1
    //   47: goto -35 -> 12
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	c
    //   11	36	1	str	String
    //   50	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	50	finally
    //   16	42	50	finally
    //   42	47	50	finally
  }
  
  /* Error */
  public final String q()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 250	com/tencent/feedback/common/c:D	()Z
    //   6: ifne +10 -> 16
    //   9: ldc 67
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: getfield 79	com/tencent/feedback/common/c:s	Ljava/lang/String;
    //   20: ifnonnull +22 -> 42
    //   23: aload_0
    //   24: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   27: invokestatic 117	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   30: pop
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   36: invokestatic 253	com/tencent/feedback/common/d:e	(Landroid/content/Context;)Ljava/lang/String;
    //   39: putfield 79	com/tencent/feedback/common/c:s	Ljava/lang/String;
    //   42: aload_0
    //   43: getfield 79	com/tencent/feedback/common/c:s	Ljava/lang/String;
    //   46: astore_1
    //   47: goto -35 -> 12
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	c
    //   11	36	1	str	String
    //   50	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	50	finally
    //   16	42	50	finally
    //   42	47	50	finally
  }
  
  /* Error */
  public final String r()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 250	com/tencent/feedback/common/c:D	()Z
    //   6: ifne +10 -> 16
    //   9: ldc 67
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: getfield 81	com/tencent/feedback/common/c:t	Ljava/lang/String;
    //   20: ifnonnull +22 -> 42
    //   23: aload_0
    //   24: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   27: invokestatic 117	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   30: pop
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   36: invokestatic 254	com/tencent/feedback/common/d:c	(Landroid/content/Context;)Ljava/lang/String;
    //   39: putfield 81	com/tencent/feedback/common/c:t	Ljava/lang/String;
    //   42: aload_0
    //   43: getfield 81	com/tencent/feedback/common/c:t	Ljava/lang/String;
    //   46: astore_1
    //   47: goto -35 -> 12
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	c
    //   11	36	1	str	String
    //   50	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	50	finally
    //   16	42	50	finally
    //   42	47	50	finally
  }
  
  /* Error */
  public final String s()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 250	com/tencent/feedback/common/c:D	()Z
    //   6: ifne +10 -> 16
    //   9: ldc 67
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: getfield 83	com/tencent/feedback/common/c:u	Ljava/lang/String;
    //   20: ifnonnull +22 -> 42
    //   23: aload_0
    //   24: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   27: invokestatic 117	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   30: pop
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 112	com/tencent/feedback/common/c:a	Landroid/content/Context;
    //   36: invokestatic 255	com/tencent/feedback/common/d:d	(Landroid/content/Context;)Ljava/lang/String;
    //   39: putfield 83	com/tencent/feedback/common/c:u	Ljava/lang/String;
    //   42: aload_0
    //   43: getfield 83	com/tencent/feedback/common/c:u	Ljava/lang/String;
    //   46: astore_1
    //   47: goto -35 -> 12
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	c
    //   11	36	1	str	String
    //   50	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	50	finally
    //   16	42	50	finally
    //   42	47	50	finally
  }
  
  public final long t()
  {
    try
    {
      if (this.v <= 0L)
      {
        d.a(this.a);
        this.v = d.f();
      }
      long l1 = this.v;
      return l1;
    }
    finally {}
  }
  
  public final long u()
  {
    try
    {
      if (this.w <= 0L)
      {
        d.a(this.a);
        this.w = d.h();
      }
      long l1 = this.w;
      return l1;
    }
    finally {}
  }
  
  public final long v()
  {
    try
    {
      if (this.x <= 0L) {
        this.x = d.a(this.a).j();
      }
      long l1 = this.x;
      return l1;
    }
    finally {}
  }
  
  public final String w()
  {
    try
    {
      if (this.y == null)
      {
        d.a(this.a);
        this.y = d.d();
      }
      String str = this.y;
      return str;
    }
    finally {}
  }
  
  public final String x()
  {
    try
    {
      if (this.z == null)
      {
        d.a(this.a);
        this.z = com.tencent.feedback.proguard.a.b("ro.board.platform");
      }
      String str = this.z;
      return str;
    }
    finally {}
  }
  
  /* Error */
  public final Map<String, PlugInInfo> y()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   6: ifnull +17 -> 23
    //   9: aload_0
    //   10: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   13: invokeinterface 275 1 0
    //   18: istore_2
    //   19: iload_2
    //   20: ifgt +9 -> 29
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: areturn
    //   29: new 212	java/util/HashMap
    //   32: dup
    //   33: aload_0
    //   34: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   37: invokeinterface 275 1 0
    //   42: invokespecial 278	java/util/HashMap:<init>	(I)V
    //   45: astore_1
    //   46: aload_1
    //   47: aload_0
    //   48: getfield 97	com/tencent/feedback/common/c:A	Ljava/util/Map;
    //   51: invokeinterface 282 2 0
    //   56: goto -31 -> 25
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	c
    //   24	23	1	localObject1	Object
    //   59	4	1	localObject2	Object
    //   18	2	2	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	19	59	finally
    //   29	56	59	finally
  }
  
  public final String z()
  {
    if (this.C == null)
    {
      d.a(this.a);
      this.C = d.l();
    }
    return this.C;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */