package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.f;
import com.tencent.beacon.a.h;
import com.tencent.beacon.e.c;
import com.tencent.beacon.upload.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b
  implements j
{
  private Context a;
  private boolean b = false;
  private Object c = new Object();
  private Object d = new Object();
  private List<k> e;
  private long f = 60000L;
  private Runnable g = new b.1(this);
  private Runnable h = new b.2(this);
  
  public b(Context paramContext)
  {
    this.a = paramContext;
    this.e = new ArrayList(25);
  }
  
  public static k a(Context paramContext, String paramString, boolean paramBoolean, long paramLong1, long paramLong2, Map<String, String> paramMap)
  {
    return a(paramContext, paramString, paramBoolean, paramLong1, paramLong2, paramMap, false);
  }
  
  public static k a(Context paramContext, String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    if (paramString == null) {
      return null;
    }
    f localf = f.m();
    if (localf == null)
    {
      com.tencent.beacon.e.b.d("  CommonInfo have not been Created return null!", new Object[0]);
      return null;
    }
    String str1 = UserAction.getUserID();
    long l1 = localf.h();
    long l2 = new Date().getTime();
    String str2 = localf.g();
    Object localObject2 = c.c(paramContext);
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
    ((Map)localObject2).put("A19", (String)localObject1);
    ((Map)localObject2).put("A28", str2);
    ((Map)localObject2).put("A25", paramBoolean1);
    ((Map)localObject2).put("A26", paramLong1);
    ((Map)localObject2).put("A27", paramLong2);
    ((Map)localObject2).put("A2", localf.i());
    paramMap = e.a(paramContext);
    ((Map)localObject2).put("A4", paramMap.c());
    ((Map)localObject2).put("A6", paramMap.b());
    ((Map)localObject2).put("A7", paramMap.d());
    ((Map)localObject2).put("A3", com.tencent.beacon.b.a.a(paramContext).a());
    ((Map)localObject2).put("A23", paramMap.e());
    com.tencent.beacon.e.b.d("ChannelID: %s", new Object[] { paramMap.e() });
    ((Map)localObject2).put("A67", com.tencent.beacon.a.b.i(paramContext));
    ((Map)localObject2).put("A76", com.tencent.beacon.a.b.a());
    paramContext = new k();
    paramContext.b(paramString);
    paramContext.b(l1 + l2);
    paramContext.a("UA");
    paramContext.a((Map)localObject2);
    paramContext.c(1L);
    paramContext.c(paramBoolean2);
    int i = 0;
    if (paramLong1 >= 1200000L) {
      i = 1;
    }
    int j = i;
    if (paramLong2 >= 50000000L) {
      j = i + 1;
    }
    if (j > 0)
    {
      paramContext.d(j);
      paramContext.b(true);
      return paramContext;
    }
    paramContext.d(0L);
    paramContext.b(false);
    return paramContext;
  }
  
  public static com.tencent.beacon.c.d.b b(k paramk)
  {
    if ((paramk == null) || (!"IP".equals(paramk.b()))) {
      return null;
    }
    Map localMap = paramk.e();
    if (localMap == null) {
      return null;
    }
    try
    {
      com.tencent.beacon.c.d.b localb = new com.tencent.beacon.c.d.b();
      localb.a = ((String)localMap.get("A19"));
      String str = (String)localMap.get("A26");
      Object localObject = str;
      if (str == null) {
        localObject = "-1";
      }
      localb.e = Long.parseLong((String)localObject);
      localObject = paramk.d().split(":");
      localb.c = localObject[0];
      localb.d = Integer.parseInt(localObject[1]);
      localb.b = ((String)localMap.get("A28"));
      localb.f = paramk.c();
      paramk = new HashMap();
      paramk.put("A33", localMap.get("A33"));
      paramk.put("A3", localMap.get("A3"));
      paramk.put("A20", localMap.get("A20"));
      paramk.put("A74", localMap.get("A74"));
      if (localMap.get("test") != null) {
        paramk.put("test", "Y");
      }
      localb.g = h.a(paramk);
      return localb;
    }
    catch (Throwable paramk)
    {
      paramk.printStackTrace();
      com.tencent.beacon.e.b.d(paramk.getMessage(), new Object[0]);
    }
    return null;
  }
  
  /* Error */
  private List<k> b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 57	com/tencent/beacon/event/b:e	Ljava/util/List;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 57	com/tencent/beacon/event/b:e	Ljava/util/List;
    //   13: invokeinterface 313 1 0
    //   18: ifle +12 -> 30
    //   21: aload_0
    //   22: invokespecial 316	com/tencent/beacon/event/b:c	()Z
    //   25: istore_2
    //   26: iload_2
    //   27: ifne +9 -> 36
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: new 52	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 317	java/util/ArrayList:<init>	()V
    //   43: astore_1
    //   44: aload_1
    //   45: aload_0
    //   46: getfield 57	com/tencent/beacon/event/b:e	Ljava/util/List;
    //   49: invokeinterface 321 2 0
    //   54: pop
    //   55: aload_0
    //   56: getfield 57	com/tencent/beacon/event/b:e	Ljava/util/List;
    //   59: invokeinterface 324 1 0
    //   64: new 117	java/lang/StringBuilder
    //   67: dup
    //   68: ldc_w 326
    //   71: invokespecial 328	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokeinterface 313 1 0
    //   80: invokevirtual 331	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   83: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 333	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: goto -61 -> 32
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	b
    //   31	44	1	localObject1	Object
    //   96	4	1	localObject2	Object
    //   25	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	26	96	finally
    //   36	93	96	finally
  }
  
  public static com.tencent.beacon.c.d.a c(k paramk)
  {
    if ((paramk == null) || (!"DN".equals(paramk.b()))) {
      return null;
    }
    Map localMap = paramk.e();
    if (localMap == null) {
      return null;
    }
    try
    {
      com.tencent.beacon.c.d.a locala = new com.tencent.beacon.c.d.a();
      locala.a = ((String)localMap.get("A19"));
      locala.c = paramk.d();
      locala.j = ((String)localMap.get("A34"));
      locala.d = Long.parseLong((String)localMap.get("A35"));
      locala.f = Long.parseLong((String)localMap.get("A36"));
      locala.g = Long.parseLong((String)localMap.get("A37"));
      locala.h = Long.parseLong((String)localMap.get("A38"));
      locala.b = ((String)localMap.get("A28"));
      locala.i = ((String)localMap.get("A39"));
      locala.e = Long.parseLong((String)localMap.get("A40"));
      locala.k = paramk.c();
      paramk = new HashMap();
      paramk.put("A33", localMap.get("A33"));
      paramk.put("A3", localMap.get("A3"));
      paramk.put("A20", localMap.get("A20"));
      paramk.put("A74", localMap.get("A74"));
      if (localMap.get("test") != null) {
        paramk.put("test", "Y");
      }
      locala.l = h.a(paramk);
      return locala;
    }
    catch (Throwable paramk)
    {
      paramk.printStackTrace();
      com.tencent.beacon.e.b.d(paramk.getMessage(), new Object[0]);
    }
    return null;
  }
  
  private boolean c()
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
  
  public static com.tencent.beacon.c.d.d d(k paramk)
  {
    if ((paramk == null) || (!"HO".equals(paramk.b()))) {
      return null;
    }
    Map localMap = paramk.e();
    if (localMap == null) {
      return null;
    }
    try
    {
      com.tencent.beacon.c.d.d locald = new com.tencent.beacon.c.d.d();
      locald.a = ((String)localMap.get("A19"));
      String[] arrayOfString = ((String)localMap.get("hostip")).split(":");
      locald.m = Integer.parseInt(arrayOfString[1]);
      locald.b = ((String)localMap.get("A28"));
      locald.c = ((String)localMap.get("A34"));
      locald.k = arrayOfString[0];
      locald.l = paramk.d();
      locald.d = Long.parseLong((String)localMap.get("A35"));
      locald.e = Long.parseLong((String)localMap.get("A40"));
      locald.f = Long.parseLong((String)localMap.get("A36"));
      locald.g = Long.parseLong((String)localMap.get("A37"));
      locald.h = Long.parseLong((String)localMap.get("A38"));
      locald.j = paramk.c();
      locald.i = ((String)localMap.get("A39"));
      paramk = new HashMap();
      paramk.put("A33", localMap.get("A33"));
      paramk.put("A3", localMap.get("A3"));
      paramk.put("A20", localMap.get("A20"));
      paramk.put("A74", localMap.get("A74"));
      locald.n = h.a(paramk);
      return locald;
    }
    catch (Throwable paramk)
    {
      paramk.printStackTrace();
      com.tencent.beacon.e.b.d(paramk.getMessage(), new Object[0]);
    }
    return null;
  }
  
  public static com.tencent.beacon.c.b.a e(k paramk)
  {
    if ((paramk == null) || (!"UA".equals(paramk.b()))) {
      return null;
    }
    Map localMap = paramk.e();
    if (localMap == null) {
      return null;
    }
    try
    {
      com.tencent.beacon.c.b.a locala = new com.tencent.beacon.c.b.a();
      locala.a = ((String)localMap.get("A19"));
      locala.c = paramk.d();
      locala.h = paramk.c();
      locala.b = ((String)localMap.get("A28"));
      locala.f = Long.parseLong((String)localMap.get("A26"));
      locala.d = Boolean.parseBoolean((String)localMap.get("A25"));
      locala.e = Long.parseLong((String)localMap.get("A27"));
      if (paramk.h()) {
        localMap.put("C9", paramk.i());
      }
      if (paramk.f()) {
        localMap.put("C3", paramk.g());
      }
      locala.g = h.a(localMap);
      if (paramk.f()) {}
      for (int i = 1;; i = 0)
      {
        locala.i = i;
        com.tencent.beacon.e.b.b("new event record:\neventName:%s\neventResult:%b\neventValue:%s", new Object[] { locala.c, Boolean.valueOf(locala.d), locala.g });
        return locala;
      }
      return null;
    }
    catch (Throwable paramk)
    {
      paramk.printStackTrace();
      com.tencent.beacon.e.b.d(paramk.getMessage(), new Object[0]);
    }
  }
  
  protected final void a()
  {
    boolean bool = false;
    int i = 0;
    for (;;)
    {
      synchronized (this.d)
      {
        if (!c())
        {
          com.tencent.beacon.e.b.c(" err su 1R", new Object[0]);
          return;
        }
        Object localObject2 = b();
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          localObject2 = h.a(this.a, (List)localObject2);
          i locali = i.a(this.a);
          if (localObject2 != null)
          {
            long l2 = p.d().i().e();
            long l1 = l2;
            if (c.a(this.a))
            {
              com.tencent.beacon.e.b.e(" onwifi, so half mSZ " + l2, new Object[0]);
              l1 = l2 / 2L;
            }
            int j = h.s(this.a);
            com.tencent.beacon.e.b.b("countCommomRecordNum: " + j, new Object[0]);
            if (j >= l1) {
              i = 1;
            }
            if ((i != 0) && (locali.a()) && (locali.b()))
            {
              this.h.run();
              com.tencent.beacon.e.b.e(" common max up", new Object[0]);
            }
          }
          return;
        }
      }
      g localg = p.d().i();
      if (localg != null) {
        bool = localg.v();
      }
      if (bool)
      {
        this.h.run();
        com.tencent.beacon.e.b.e(" common polling up", new Object[0]);
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
    //   3: getfield 28	com/tencent/beacon/event/b:b	Z
    //   6: iload_1
    //   7: if_icmpeq +50 -> 57
    //   10: iload_1
    //   11: ifeq +49 -> 60
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 28	com/tencent/beacon/event/b:b	Z
    //   19: aload_0
    //   20: invokestatic 461	com/tencent/beacon/event/p:d	()Lcom/tencent/beacon/event/p;
    //   23: invokevirtual 464	com/tencent/beacon/event/p:i	()Lcom/tencent/beacon/event/g;
    //   26: invokevirtual 501	com/tencent/beacon/event/g:d	()I
    //   29: sipush 1000
    //   32: imul
    //   33: i2l
    //   34: putfield 36	com/tencent/beacon/event/b:f	J
    //   37: invokestatic 506	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   40: bipush 102
    //   42: aload_0
    //   43: getfield 43	com/tencent/beacon/event/b:g	Ljava/lang/Runnable;
    //   46: aload_0
    //   47: getfield 36	com/tencent/beacon/event/b:f	J
    //   50: aload_0
    //   51: getfield 36	com/tencent/beacon/event/b:f	J
    //   54: invokevirtual 509	com/tencent/beacon/a/e:a	(ILjava/lang/Runnable;JJ)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: invokestatic 506	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   63: bipush 102
    //   65: iconst_1
    //   66: invokevirtual 512	com/tencent/beacon/a/e:a	(IZ)V
    //   69: invokestatic 506	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   72: bipush 112
    //   74: iconst_1
    //   75: invokevirtual 512	com/tencent/beacon/a/e:a	(IZ)V
    //   78: aload_0
    //   79: invokevirtual 514	com/tencent/beacon/event/b:a	()V
    //   82: aload_0
    //   83: iload_1
    //   84: putfield 28	com/tencent/beacon/event/b:b	Z
    //   87: goto -30 -> 57
    //   90: astore_2
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_2
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	b
    //   0	95	1	paramBoolean	boolean
    //   90	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	90	finally
    //   14	57	90	finally
    //   60	87	90	finally
  }
  
  public final boolean a(k paramk)
  {
    Object localObject2 = this.c;
    if (paramk == null) {
      localObject1 = "null";
    }
    for (;;)
    {
      boolean bool;
      if (paramk == null) {
        bool = false;
      }
      try
      {
        for (;;)
        {
          com.tencent.beacon.e.b.f(" BF eN:%s   isRT:%b  isCR:%b", new Object[] { localObject1, Boolean.valueOf(false), Boolean.valueOf(bool) });
          if ((this.a != null) && (paramk != null) && (this.b)) {
            break label99;
          }
          com.tencent.beacon.e.b.d(" err BF 1R", new Object[0]);
          return false;
          localObject1 = paramk.d();
          break;
          bool = paramk.f();
        }
        label99:
        if (!c())
        {
          com.tencent.beacon.e.b.d(" CommonProcess processUA return false, isEnable is false !", new Object[0]);
          return false;
        }
      }
      finally {}
    }
    Object localObject1 = p.d().i();
    int i = ((g)localObject1).c();
    this.f = (((g)localObject1).d() * 1000);
    int j = this.e.size();
    if (j >= i)
    {
      com.tencent.beacon.e.b.f(" BF mN!", new Object[0]);
      com.tencent.beacon.a.e.a().a(this.g);
      com.tencent.beacon.a.e.a().a(102, this.g, this.f, this.f);
    }
    this.e.add(paramk);
    if (this.e.size() >= i) {
      com.tencent.beacon.e.b.c(" err BF 3R! list size:" + j, new Object[0]);
    }
    p.d().c.a();
    com.tencent.beacon.e.b.a("CommonprocessUA:true!", new Object[0]);
    return true;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, long paramLong1, long paramLong2, d... paramVarArgs)
  {
    Object localObject;
    int j;
    int i;
    try
    {
      com.tencent.beacon.e.b.e(" onUAC %s", new Object[] { paramString });
      d locald = null;
      if ((paramString == null) || (this.a == null)) {
        if (" err 1R " + this.a == null)
        {
          paramString = "context";
          com.tencent.beacon.e.b.e(paramString, new Object[0]);
        }
      }
      for (paramBoolean = false;; paramBoolean = false)
      {
        return paramBoolean;
        paramString = "en";
        break;
        Iterator localIterator = this.e.iterator();
        do
        {
          localObject = locald;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = (k)localIterator.next();
        } while ((!((k)localObject).f()) || (!((k)localObject).d().equals(paramString)));
        if (localObject != null) {
          break label474;
        }
        com.tencent.beacon.e.b.e(" onUAC add new", new Object[0]);
        localObject = new HashMap();
        if ((paramVarArgs != null) && (paramVarArgs.length > 0))
        {
          j = paramVarArgs.length;
          i = 0;
          while (i < j)
          {
            locald = paramVarArgs[i];
            ((Map)localObject).put(locald.a, Long.toString(locald.b));
            i += 1;
          }
        }
        paramString = a(this.a, paramString, paramBoolean, paramLong1, paramLong2, (Map)localObject, false);
        if (paramString != null) {
          break label247;
        }
      }
      label247:
      paramVarArgs = paramString.e();
      paramVarArgs.put("C1", Long.toString(paramString.c()));
      paramVarArgs.put("C2", Long.toString(1L));
      if (paramBoolean)
      {
        paramVarArgs.put("C4", Long.toString(paramLong1));
        paramVarArgs.put("C5", Long.toString(paramLong2));
        paramVarArgs.put("C6", Long.toString(0L));
        paramVarArgs.put("C7", Long.toString(0L));
        paramVarArgs.put("C8", Long.toString(0L));
      }
      for (;;)
      {
        paramString.a(true);
        com.tencent.beacon.e.b.b(" add record, return!", new Object[0]);
        paramBoolean = a(paramString);
        break;
        paramVarArgs.put("C4", Long.toString(0L));
        paramVarArgs.put("C5", Long.toString(0L));
        paramVarArgs.put("C6", Long.toString(1L));
        paramVarArgs.put("C7", Long.toString(paramLong1));
        paramVarArgs.put("C8", Long.toString(paramLong2));
      }
      com.tencent.beacon.e.b.e(" onUAC up O", new Object[0]);
    }
    finally {}
    label474:
    ((k)localObject).c(((k)localObject).g() + 1L);
    if (paramLong1 >= 1200000L)
    {
      ((k)localObject).b(true);
      ((k)localObject).d(((k)localObject).i() + 1L);
    }
    if (paramLong2 >= 50000000L)
    {
      ((k)localObject).b(true);
      ((k)localObject).d(((k)localObject).i() + 1L);
    }
    paramString = ((k)localObject).e();
    if (paramString == null)
    {
      com.tencent.beacon.e.b.c(" err ? ep==null: %s", new Object[] { ((k)localObject).d() });
      paramString = new HashMap();
      ((k)localObject).a(paramString);
    }
    for (;;)
    {
      paramString.put("C1", Long.toString(new Date().getTime()));
      h.a(paramString, "A26", paramLong1);
      h.a(paramString, "A27", paramLong2);
      h.a(paramString, "C2", 1L);
      if (paramBoolean)
      {
        h.a(paramString, "C4", paramLong1);
        h.a(paramString, "C5", paramLong2);
      }
      while ((paramVarArgs != null) && (paramVarArgs.length > 0))
      {
        j = paramVarArgs.length;
        i = 0;
        while (i < j)
        {
          localObject = paramVarArgs[i];
          h.a(paramString, ((d)localObject).a, ((d)localObject).b);
          i += 1;
        }
        h.a(paramString, "C6", 1L);
        h.a(paramString, "C7", paramLong1);
        h.a(paramString, "C8", paramLong2);
      }
      paramBoolean = true;
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */