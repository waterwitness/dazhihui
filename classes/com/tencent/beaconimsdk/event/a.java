package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
  implements g
{
  private Context a;
  private boolean b = false;
  private Object c = new Object();
  private Object d = new Object();
  private Object e = new Object();
  private List<h> f;
  private long g = 60000L;
  private Runnable h = new a.1(this);
  private Runnable i = new a.2(this);
  private Runnable j = new a.3();
  
  public a(Context paramContext)
  {
    this.a = paramContext;
    this.f = new ArrayList(25);
  }
  
  public static h a(Context paramContext, String paramString, Map<String, String> paramMap)
  {
    return a(paramContext, paramString, true, 0L, 0L, paramMap, false);
  }
  
  public static h a(Context paramContext, String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    if (paramString == null) {
      return null;
    }
    com.tencent.beaconimsdk.a.c localc = com.tencent.beaconimsdk.a.c.m();
    if (localc == null)
    {
      com.tencent.beaconimsdk.c.a.d("  CommonInfo or DeviceInfo have not been Created return null!", new Object[0]);
      return null;
    }
    String str1 = UserAction.getUserID();
    long l1 = localc.h();
    long l2 = new Date().getTime();
    String str2 = localc.g();
    Object localObject2 = com.tencent.beaconimsdk.a.e.n(paramContext);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "null";
    }
    localObject2 = new HashMap();
    if (UserAction.a != null) {
      ((Map)localObject2).putAll(UserAction.a);
    }
    if (paramMap != null) {
      ((Map)localObject2).putAll(paramMap);
    }
    ((Map)localObject2).put("A1", str1);
    ((Map)localObject2).put("QQ", UserAction.getQQ());
    ((Map)localObject2).put("A19", localObject1);
    ((Map)localObject2).put("A28", str2);
    ((Map)localObject2).put("A25", String.valueOf(paramBoolean1));
    ((Map)localObject2).put("A26", String.valueOf(paramLong1));
    ((Map)localObject2).put("A27", String.valueOf(paramLong2));
    ((Map)localObject2).put("A2", localc.i());
    paramMap = c.a(paramContext);
    ((Map)localObject2).put("A4", paramMap.c());
    ((Map)localObject2).put("A6", paramMap.b());
    ((Map)localObject2).put("A7", paramMap.d());
    ((Map)localObject2).put("A3", paramMap.f());
    ((Map)localObject2).put("A23", paramMap.e());
    ((Map)localObject2).put("A31", paramMap.g());
    ((Map)localObject2).put("A67", com.tencent.beaconimsdk.a.a.i(paramContext));
    ((Map)localObject2).put("A76", com.tencent.beaconimsdk.a.a.a());
    ((Map)localObject2).put("A95", com.tencent.beaconimsdk.a.a.e(paramContext));
    paramContext = new h();
    paramContext.b(paramString);
    paramContext.b(l1 + l2);
    paramContext.a("UA");
    paramContext.a((Map)localObject2);
    paramContext.a(paramBoolean2);
    return paramContext;
  }
  
  public static com.tencent.beaconimsdk.b.b.a b(h paramh)
  {
    if ((paramh == null) || (!"UA".equals(paramh.b()))) {
      return null;
    }
    Map localMap = paramh.e();
    if (localMap == null) {
      return null;
    }
    try
    {
      com.tencent.beaconimsdk.b.b.a locala = new com.tencent.beaconimsdk.b.b.a();
      locala.a = ((String)localMap.get("A19"));
      locala.c = paramh.d();
      locala.h = paramh.c();
      locala.b = ((String)localMap.get("A28"));
      locala.f = Long.parseLong((String)localMap.get("A26"));
      locala.d = Boolean.parseBoolean((String)localMap.get("A25"));
      locala.e = Long.parseLong((String)localMap.get("A27"));
      locala.g = com.tencent.beaconimsdk.a.e.a(localMap);
      return locala;
    }
    catch (Throwable paramh)
    {
      com.tencent.beaconimsdk.c.a.a(paramh);
      com.tencent.beaconimsdk.c.a.d(paramh.getMessage(), new Object[0]);
    }
    return null;
  }
  
  /* Error */
  private List<h> b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 66	com/tencent/beaconimsdk/event/a:f	Ljava/util/List;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 66	com/tencent/beaconimsdk/event/a:f	Ljava/util/List;
    //   13: invokeinterface 296 1 0
    //   18: ifle +12 -> 30
    //   21: aload_0
    //   22: invokespecial 299	com/tencent/beaconimsdk/event/a:d	()Z
    //   25: istore_2
    //   26: iload_2
    //   27: ifne +9 -> 36
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: new 61	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 300	java/util/ArrayList:<init>	()V
    //   43: astore_1
    //   44: aload_1
    //   45: aload_0
    //   46: getfield 66	com/tencent/beaconimsdk/event/a:f	Ljava/util/List;
    //   49: invokeinterface 304 2 0
    //   54: pop
    //   55: aload_0
    //   56: getfield 66	com/tencent/beaconimsdk/event/a:f	Ljava/util/List;
    //   59: invokeinterface 307 1 0
    //   64: new 133	java/lang/StringBuilder
    //   67: dup
    //   68: ldc_w 309
    //   71: invokespecial 311	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokeinterface 296 1 0
    //   80: invokevirtual 314	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   83: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 316	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: goto -61 -> 32
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	a
    //   31	44	1	localObject1	Object
    //   96	4	1	localObject2	Object
    //   25	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	26	96	finally
    //   36	93	96	finally
  }
  
  private void c()
  {
    synchronized (this.e)
    {
      if (!d())
      {
        com.tencent.beaconimsdk.c.a.c(" err su 1R", new Object[0]);
        return;
      }
      List localList = b();
      if ((localList != null) && (localList.size() > 0)) {
        com.tencent.beaconimsdk.a.e.a(this.a, localList);
      }
      return;
    }
  }
  
  private boolean d()
  {
    try
    {
      boolean bool = this.b;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void a()
  {
    boolean bool = false;
    int k = 0;
    for (;;)
    {
      synchronized (this.d)
      {
        if (!d())
        {
          com.tencent.beaconimsdk.c.a.c(" err su 1R", new Object[0]);
          return;
        }
        Object localObject2 = b();
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          localObject2 = com.tencent.beaconimsdk.a.e.a(this.a, (List)localObject2);
          com.tencent.beaconimsdk.upload.g localg = com.tencent.beaconimsdk.upload.g.a(this.a);
          if (localObject2 != null)
          {
            long l2 = j.d().g().e();
            long l1 = l2;
            if (com.tencent.beaconimsdk.a.e.l(this.a))
            {
              com.tencent.beaconimsdk.c.a.e(" onwifi, so half mSZ " + l2, new Object[0]);
              l1 = l2 / 2L;
            }
            int m = com.tencent.beaconimsdk.a.e.j(this.a);
            com.tencent.beaconimsdk.c.a.b("countCommomRecordNum: " + m, new Object[0]);
            if (m >= l1) {
              k = 1;
            }
            if ((k != 0) && (localg.a()))
            {
              this.j.run();
              com.tencent.beaconimsdk.c.a.e(" common max up", new Object[0]);
            }
          }
          return;
        }
      }
      e locale = j.d().g();
      if (locale != null) {
        bool = locale.g();
      }
      if (bool)
      {
        this.j.run();
        com.tencent.beaconimsdk.c.a.e(" common polling up", new Object[0]);
      }
    }
  }
  
  /* Error */
  public final void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	com/tencent/beaconimsdk/event/a:b	Z
    //   6: iload_1
    //   7: if_icmpeq +50 -> 57
    //   10: iload_1
    //   11: ifeq +49 -> 60
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 30	com/tencent/beaconimsdk/event/a:b	Z
    //   19: aload_0
    //   20: invokestatic 336	com/tencent/beaconimsdk/event/j:d	()Lcom/tencent/beaconimsdk/event/j;
    //   23: invokevirtual 339	com/tencent/beaconimsdk/event/j:g	()Lcom/tencent/beaconimsdk/event/e;
    //   26: invokevirtual 376	com/tencent/beaconimsdk/event/e:d	()I
    //   29: sipush 1000
    //   32: imul
    //   33: i2l
    //   34: putfield 40	com/tencent/beaconimsdk/event/a:g	J
    //   37: invokestatic 381	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   40: bipush 102
    //   42: aload_0
    //   43: getfield 47	com/tencent/beaconimsdk/event/a:h	Ljava/lang/Runnable;
    //   46: aload_0
    //   47: getfield 40	com/tencent/beaconimsdk/event/a:g	J
    //   50: aload_0
    //   51: getfield 40	com/tencent/beaconimsdk/event/a:g	J
    //   54: invokevirtual 384	com/tencent/beaconimsdk/a/b:a	(ILjava/lang/Runnable;JJ)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: invokestatic 381	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   63: bipush 102
    //   65: invokevirtual 386	com/tencent/beaconimsdk/a/b:a	(I)V
    //   68: invokestatic 381	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   71: bipush 112
    //   73: invokevirtual 386	com/tencent/beaconimsdk/a/b:a	(I)V
    //   76: aload_0
    //   77: iconst_1
    //   78: invokevirtual 388	com/tencent/beaconimsdk/event/a:b	(Z)V
    //   81: aload_0
    //   82: iload_1
    //   83: putfield 30	com/tencent/beaconimsdk/event/a:b	Z
    //   86: goto -29 -> 57
    //   89: astore_2
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_2
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	a
    //   0	94	1	paramBoolean	boolean
    //   89	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	89	finally
    //   14	57	89	finally
    //   60	86	89	finally
  }
  
  public final boolean a(h paramh)
  {
    Object localObject2 = this.c;
    if (paramh == null) {
      localObject1 = "null";
    }
    try
    {
      for (;;)
      {
        com.tencent.beaconimsdk.c.a.f(" BF eN:%s   isRT:%b ", new Object[] { localObject1, Boolean.valueOf(false) });
        if ((this.a != null) && (paramh != null) && (this.b)) {
          break;
        }
        com.tencent.beaconimsdk.c.a.d(" err BF 1R", new Object[0]);
        return false;
        localObject1 = paramh.d();
      }
      if (!d())
      {
        com.tencent.beaconimsdk.c.a.d(" CommonProcess processUA return false, isEnable is false !", new Object[0]);
        return false;
      }
    }
    finally {}
    Object localObject1 = j.d().g();
    int k = ((e)localObject1).c();
    this.g = (((e)localObject1).d() * 1000);
    int m = this.f.size();
    if (m >= k)
    {
      com.tencent.beaconimsdk.c.a.f(" BF mN!", new Object[0]);
      b.a().a(this.h);
      b.a().a(102, this.h, this.g, this.g);
    }
    this.f.add(paramh);
    if (this.f.size() >= k) {
      com.tencent.beaconimsdk.c.a.c(" err BF 3R! list size:" + m, new Object[0]);
    }
    com.tencent.beaconimsdk.c.a.a("CommonprocessUA:true!", new Object[0]);
    return true;
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 418
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 354	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: iload_1
    //   13: ifeq +10 -> 23
    //   16: aload_0
    //   17: invokespecial 230	com/tencent/beaconimsdk/event/a:c	()V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 381	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   26: aload_0
    //   27: getfield 52	com/tencent/beaconimsdk/event/a:i	Ljava/lang/Runnable;
    //   30: invokevirtual 407	com/tencent/beaconimsdk/a/b:a	(Ljava/lang/Runnable;)V
    //   33: goto -13 -> 20
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	a
    //   0	41	1	paramBoolean	boolean
    //   36	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	36	finally
    //   16	20	36	finally
    //   23	33	36	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */