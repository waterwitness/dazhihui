package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.e;
import com.tencent.beacon.d.a;
import com.tencent.beacon.e.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
  implements j
{
  private boolean a = false;
  private List<k> b;
  private Context c;
  private Runnable d = new l.1(this);
  
  public l(Context paramContext)
  {
    this.c = paramContext;
    this.b = Collections.synchronizedList(new ArrayList(25));
  }
  
  private boolean c()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final List<k> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   13: invokeinterface 53 1 0
    //   18: ifle +12 -> 30
    //   21: aload_0
    //   22: invokespecial 55	com/tencent/beacon/event/l:c	()Z
    //   25: istore_2
    //   26: iload_2
    //   27: ifne +9 -> 36
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: new 33	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 56	java/util/ArrayList:<init>	()V
    //   43: astore_1
    //   44: aload_1
    //   45: aload_0
    //   46: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   49: invokeinterface 60 2 0
    //   54: pop
    //   55: aload_0
    //   56: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   59: invokeinterface 63 1 0
    //   64: new 65	java/lang/StringBuilder
    //   67: dup
    //   68: ldc 67
    //   70: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: aload_1
    //   74: invokeinterface 53 1 0
    //   79: invokevirtual 74	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   82: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 83	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: goto -60 -> 32
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	l
    //   31	43	1	localObject1	Object
    //   95	4	1	localObject2	Object
    //   25	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	26	95	finally
    //   36	92	95	finally
  }
  
  /* Error */
  public final void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/tencent/beacon/event/l:a	Z
    //   6: iload_1
    //   7: if_icmpeq +43 -> 50
    //   10: iload_1
    //   11: ifeq +42 -> 53
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 22	com/tencent/beacon/event/l:a	Z
    //   19: invokestatic 91	com/tencent/beacon/event/p:d	()Lcom/tencent/beacon/event/p;
    //   22: invokevirtual 95	com/tencent/beacon/event/p:i	()Lcom/tencent/beacon/event/g;
    //   25: invokevirtual 99	com/tencent/beacon/event/g:b	()I
    //   28: sipush 1000
    //   31: imul
    //   32: i2l
    //   33: lstore_3
    //   34: invokestatic 104	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   37: bipush 103
    //   39: aload_0
    //   40: getfield 29	com/tencent/beacon/event/l:d	Ljava/lang/Runnable;
    //   43: ldc2_w 105
    //   46: lload_3
    //   47: invokevirtual 109	com/tencent/beacon/a/e:a	(ILjava/lang/Runnable;JJ)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: invokestatic 104	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   56: bipush 103
    //   58: iconst_1
    //   59: invokevirtual 112	com/tencent/beacon/a/e:a	(IZ)V
    //   62: aload_0
    //   63: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   66: ifnull +27 -> 93
    //   69: aload_0
    //   70: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   73: invokeinterface 53 1 0
    //   78: ifle +15 -> 93
    //   81: aload_0
    //   82: getfield 31	com/tencent/beacon/event/l:c	Landroid/content/Context;
    //   85: aload_0
    //   86: getfield 44	com/tencent/beacon/event/l:b	Ljava/util/List;
    //   89: invokestatic 117	com/tencent/beacon/a/h:a	(Landroid/content/Context;Ljava/util/List;)[Ljava/lang/Long;
    //   92: pop
    //   93: aload_0
    //   94: iload_1
    //   95: putfield 22	com/tencent/beacon/event/l:a	Z
    //   98: goto -48 -> 50
    //   101: astore_2
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_2
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	l
    //   0	106	1	paramBoolean	boolean
    //   101	4	2	localObject	Object
    //   33	14	3	l	long
    // Exception table:
    //   from	to	target	type
    //   2	10	101	finally
    //   14	50	101	finally
    //   53	93	101	finally
    //   93	98	101	finally
  }
  
  public final boolean a(k paramk)
  {
    boolean bool = false;
    Object localObject1;
    Object localObject2;
    if (paramk == null)
    {
      localObject1 = "null";
      if (paramk != null) {
        break label76;
      }
      localObject2 = "null";
    }
    for (;;)
    {
      try
      {
        com.tencent.beacon.e.b.f(" BF eN:%s   isRT:%b  isCR:%b", new Object[] { localObject1, Boolean.valueOf(true), localObject2 });
        if ((this.c == null) || (paramk == null))
        {
          com.tencent.beacon.e.b.c("processUA return false, context is null or bean is null !", new Object[0]);
          return bool;
          localObject1 = paramk.d();
          break;
          label76:
          localObject2 = Boolean.valueOf(paramk.f());
          continue;
        }
        if (!c())
        {
          com.tencent.beacon.e.b.c("processUA return false, isEnable is false !", new Object[0]);
          continue;
        }
        localObject1 = p.d().i();
      }
      finally {}
      int i = ((g)localObject1).a();
      long l = ((g)localObject1).b() * 1000;
      if ((this.b.size() >= i) || (paramk.j()))
      {
        com.tencent.beacon.e.b.f(" BF mN!", new Object[0]);
        e.a().a(this.d);
        e.a().a(103, this.d, l, l);
      }
      this.b.add(paramk);
      if (this.b.size() >= i) {
        com.tencent.beacon.e.b.c(" err BF 3R! num:" + this.b.size(), new Object[0]);
      }
      if ("rqd_applaunched".equals(paramk.d())) {
        e.a().a(this.d);
      }
      p.d().c.b();
      com.tencent.beacon.e.b.a("processUA:true!", new Object[0]);
      bool = true;
    }
  }
  
  public final boolean a(String paramString, boolean paramBoolean, long paramLong1, long paramLong2, d... paramVarArgs)
  {
    Object localObject;
    int j;
    int i;
    try
    {
      com.tencent.beacon.e.b.e(" onUAC  %s RT", new Object[] { paramString });
      d locald = null;
      if ((paramString == null) || (this.c == null)) {
        if (" err 1R " + this.c == null)
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
        Iterator localIterator = this.b.iterator();
        do
        {
          localObject = locald;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = (k)localIterator.next();
        } while ((!((k)localObject).f()) || (!((k)localObject).d().equals(paramString)));
        if (localObject != null) {
          break label446;
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
        paramString = b.a(this.c, paramString, paramBoolean, paramLong1, paramLong2, (Map)localObject);
        if (paramString != null) {
          break label241;
        }
      }
      label241:
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
    label446:
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
      com.tencent.beacon.e.b.c(" err ? ep==null} %s", new Object[] { ((k)localObject).d() });
      paramString = new HashMap();
      ((k)localObject).a(paramString);
    }
    for (;;)
    {
      paramString.put("C1", Long.toString(new Date().getTime()));
      com.tencent.beacon.a.h.a(paramString, "A26", paramLong1);
      com.tencent.beacon.a.h.a(paramString, "A27", paramLong2);
      com.tencent.beacon.a.h.a(paramString, "C2", 1L);
      if (paramBoolean)
      {
        com.tencent.beacon.a.h.a(paramString, "C4", paramLong1);
        com.tencent.beacon.a.h.a(paramString, "C5", paramLong2);
      }
      while ((paramVarArgs != null) && (paramVarArgs.length > 0))
      {
        j = paramVarArgs.length;
        i = 0;
        while (i < j)
        {
          localObject = paramVarArgs[i];
          com.tencent.beacon.a.h.a(paramString, ((d)localObject).a, ((d)localObject).b);
          i += 1;
        }
        com.tencent.beacon.a.h.a(paramString, "C6", 1L);
        com.tencent.beacon.a.h.a(paramString, "C7", paramLong1);
        com.tencent.beacon.a.h.a(paramString, "C8", paramLong2);
      }
      paramBoolean = true;
      break;
    }
  }
  
  protected final void b()
  {
    if (!c()) {
      com.tencent.beacon.e.b.c(" err su 1R", new Object[0]);
    }
    List localList;
    do
    {
      return;
      localList = a();
    } while ((localList == null) || (localList.size() <= 0));
    com.tencent.beacon.upload.h localh = p.d().h();
    if ((!c.b(this.c)) || (localh == null))
    {
      com.tencent.beacon.e.b.f(" dsu real events 2 db" + localList.size(), new Object[0]);
      com.tencent.beacon.a.h.a(this.c, localList);
      return;
    }
    com.tencent.beacon.e.b.f(" dsu real events 2 up " + localList.size(), new Object[0]);
    localh.a(new l.a(this.c, localList));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */