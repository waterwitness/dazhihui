package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.b;
import com.tencent.beaconimsdk.c.a;
import com.tencent.beaconimsdk.upload.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i
  implements g
{
  private boolean a = false;
  private List<h> b;
  private Context c;
  private Runnable d = new i.1(this);
  private Runnable e = new i.2(this);
  
  public i(Context paramContext)
  {
    this.c = paramContext;
    this.b = Collections.synchronizedList(new ArrayList(25));
  }
  
  /* Error */
  private List<h> b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	com/tencent/beaconimsdk/event/i:b	Ljava/util/List;
    //   6: ifnull +24 -> 30
    //   9: aload_0
    //   10: getfield 50	com/tencent/beaconimsdk/event/i:b	Ljava/util/List;
    //   13: invokeinterface 60 1 0
    //   18: ifle +12 -> 30
    //   21: aload_0
    //   22: invokespecial 63	com/tencent/beaconimsdk/event/i:c	()Z
    //   25: istore_2
    //   26: iload_2
    //   27: ifne +9 -> 36
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: areturn
    //   36: new 39	java/util/ArrayList
    //   39: dup
    //   40: invokespecial 64	java/util/ArrayList:<init>	()V
    //   43: astore_1
    //   44: aload_1
    //   45: aload_0
    //   46: getfield 50	com/tencent/beaconimsdk/event/i:b	Ljava/util/List;
    //   49: invokeinterface 68 2 0
    //   54: pop
    //   55: aload_0
    //   56: getfield 50	com/tencent/beaconimsdk/event/i:b	Ljava/util/List;
    //   59: invokeinterface 71 1 0
    //   64: new 73	java/lang/StringBuilder
    //   67: dup
    //   68: ldc 75
    //   70: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   73: aload_1
    //   74: invokeinterface 60 1 0
    //   79: invokevirtual 82	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   82: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 91	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: goto -60 -> 32
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	i
    //   31	43	1	localObject1	Object
    //   95	4	1	localObject2	Object
    //   25	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	26	95	finally
    //   36	92	95	finally
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
  
  private void d()
  {
    List localList = b();
    if ((localList != null) && (localList.size() > 0))
    {
      a.f(" dsb real events 2 db" + localList.size(), new Object[0]);
      com.tencent.beaconimsdk.a.e.a(this.c, localList);
    }
  }
  
  protected final void a()
  {
    if (!c()) {
      a.c(" err su 1R", new Object[0]);
    }
    List localList;
    do
    {
      return;
      localList = b();
    } while ((localList == null) || (localList.size() <= 0));
    f localf = j.d().f();
    if ((!com.tencent.beaconimsdk.a.e.m(this.c)) || (localf == null))
    {
      a.f(" dsu real events 2 db" + localList.size(), new Object[0]);
      com.tencent.beaconimsdk.a.e.a(this.c, localList);
      return;
    }
    a.f(" dsu real events 2 up " + localList.size(), new Object[0]);
    localf.a(new i.a(this.c, localList));
  }
  
  /* Error */
  public final void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	com/tencent/beaconimsdk/event/i:a	Z
    //   6: iload_1
    //   7: if_icmpeq +43 -> 50
    //   10: iload_1
    //   11: ifeq +42 -> 53
    //   14: aload_0
    //   15: iload_1
    //   16: putfield 23	com/tencent/beaconimsdk/event/i:a	Z
    //   19: invokestatic 114	com/tencent/beaconimsdk/event/j:d	()Lcom/tencent/beaconimsdk/event/j;
    //   22: invokevirtual 140	com/tencent/beaconimsdk/event/j:g	()Lcom/tencent/beaconimsdk/event/e;
    //   25: invokevirtual 144	com/tencent/beaconimsdk/event/e:b	()I
    //   28: sipush 1000
    //   31: imul
    //   32: i2l
    //   33: lstore_3
    //   34: invokestatic 149	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   37: bipush 103
    //   39: aload_0
    //   40: getfield 30	com/tencent/beaconimsdk/event/i:d	Ljava/lang/Runnable;
    //   43: ldc2_w 150
    //   46: lload_3
    //   47: invokevirtual 154	com/tencent/beaconimsdk/a/b:a	(ILjava/lang/Runnable;JJ)V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: invokestatic 149	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   56: bipush 103
    //   58: invokevirtual 156	com/tencent/beaconimsdk/a/b:a	(I)V
    //   61: aload_0
    //   62: iconst_1
    //   63: invokevirtual 158	com/tencent/beaconimsdk/event/i:b	(Z)V
    //   66: aload_0
    //   67: iload_1
    //   68: putfield 23	com/tencent/beaconimsdk/event/i:a	Z
    //   71: goto -21 -> 50
    //   74: astore_2
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_2
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	i
    //   0	79	1	paramBoolean	boolean
    //   74	4	2	localObject	Object
    //   33	14	3	l	long
    // Exception table:
    //   from	to	target	type
    //   2	10	74	finally
    //   14	50	74	finally
    //   53	71	74	finally
  }
  
  public final boolean a(h paramh)
  {
    boolean bool = false;
    Object localObject;
    if (paramh == null) {
      localObject = "null";
    }
    for (;;)
    {
      try
      {
        a.f(" BF eN:%s   isRT:%b", new Object[] { localObject, Boolean.valueOf(true) });
        if ((this.c == null) || (paramh == null))
        {
          a.c("processUA return false, context is null or bean is null !", new Object[0]);
          return bool;
          localObject = paramh.d();
          continue;
        }
        if (!c())
        {
          a.c("processUA return false, isEnable is false !", new Object[0]);
          continue;
        }
        localObject = j.d().g();
      }
      finally {}
      int i = ((e)localObject).a();
      long l = ((e)localObject).b() * 1000;
      if ((this.b.size() >= i) || (paramh.f()))
      {
        a.f(" BF mN!", new Object[0]);
        b.a().a(this.d);
        b.a().a(103, this.d, l, l);
      }
      this.b.add(paramh);
      if (this.b.size() >= i) {
        a.c(" err BF 3R! num:" + this.b.size(), new Object[0]);
      }
      if ("rqd_applaunched".equals(paramh.d())) {
        b.a().a(this.d);
      }
      a.a("processUA:true!", new Object[0]);
      bool = true;
    }
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -51
    //   4: iconst_0
    //   5: anewarray 4	java/lang/Object
    //   8: invokestatic 207	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   11: iload_1
    //   12: ifeq +10 -> 22
    //   15: aload_0
    //   16: invokespecial 53	com/tencent/beaconimsdk/event/i:d	()V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: invokestatic 149	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   25: aload_0
    //   26: getfield 35	com/tencent/beaconimsdk/event/i:e	Ljava/lang/Runnable;
    //   29: invokevirtual 186	com/tencent/beaconimsdk/a/b:a	(Ljava/lang/Runnable;)V
    //   32: goto -13 -> 19
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	i
    //   0	40	1	paramBoolean	boolean
    //   35	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	35	finally
    //   15	19	35	finally
    //   22	32	35	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */