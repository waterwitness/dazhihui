package com.tencent.beaconimsdk.event;

import android.content.Context;
import com.tencent.beaconimsdk.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class i$a
  extends com.tencent.beaconimsdk.upload.a
{
  private List<h> e = null;
  private Context f;
  private Long[] g = null;
  private boolean h = false;
  
  public i$a(Context paramContext, List<h> paramList)
  {
    super(paramContext, 1, 2);
    this.e = paramList;
    this.f = paramContext;
    this.e.size();
    if ((this.e.size() == 1) && ("rqd_heartbeat".equals(((h)this.e.get(0)).d()))) {
      this.h = true;
    }
    this.d = e.b(paramContext, 2);
    com.tencent.beaconimsdk.c.a.a("real rid:%s", new Object[] { this.d });
  }
  
  private static com.tencent.beaconimsdk.b.a.b a(int paramInt, List<h> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {}
    for (;;)
    {
      return null;
      try
      {
        com.tencent.beaconimsdk.c.a.b(" current size:" + paramList.size(), new Object[0]);
        paramList = a(paramList);
        if (paramList != null)
        {
          paramList = paramList.a();
          if (paramList != null)
          {
            paramList = a(paramInt, paramList);
            return paramList;
          }
        }
      }
      catch (Throwable paramList)
      {
        com.tencent.beaconimsdk.c.a.a(paramList);
        com.tencent.beaconimsdk.c.a.d(" RealTimeRecordUploadDatas.encode2EventRecordPackage error}", new Object[0]);
      }
    }
    return null;
  }
  
  private static com.tencent.beaconimsdk.b.b.b a(List<h> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      return null;
    }
    com.tencent.beaconimsdk.b.b.b localb;
    try
    {
      localb = new com.tencent.beaconimsdk.b.b.b();
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        com.tencent.beaconimsdk.b.b.a locala = a.b((h)paramList.next());
        if (locala != null) {
          localArrayList.add(locala);
        }
      }
      localb.a = localArrayList;
    }
    catch (Throwable paramList)
    {
      com.tencent.beaconimsdk.c.a.a(paramList);
      return null;
    }
    com.tencent.beaconimsdk.c.a.b(" RealTimeRecordUploadDatas.encode2EventRecordPackage() end}", new Object[0]);
    return localb;
  }
  
  /* Error */
  public final com.tencent.beaconimsdk.b.a.b a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -109
    //   4: iconst_0
    //   5: anewarray 63	java/lang/Object
    //   8: invokestatic 91	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   11: aload_0
    //   12: getfield 20	com/tencent/beaconimsdk/event/i$a:e	Ljava/util/List;
    //   15: ifnull +17 -> 32
    //   18: aload_0
    //   19: getfield 20	com/tencent/beaconimsdk/event/i$a:e	Ljava/util/List;
    //   22: invokeinterface 32 1 0
    //   27: istore_3
    //   28: iload_3
    //   29: ifgt +9 -> 38
    //   32: aconst_null
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: aload_0
    //   39: getfield 26	com/tencent/beaconimsdk/event/i$a:f	Landroid/content/Context;
    //   42: astore_1
    //   43: aload_0
    //   44: getfield 150	com/tencent/beaconimsdk/event/i$a:a	I
    //   47: aload_0
    //   48: getfield 20	com/tencent/beaconimsdk/event/i$a:e	Ljava/util/List;
    //   51: invokestatic 152	com/tencent/beaconimsdk/event/i$a:a	(ILjava/util/List;)Lcom/tencent/beaconimsdk/b/a/b;
    //   54: astore_2
    //   55: aload_2
    //   56: astore_1
    //   57: aload_2
    //   58: ifnonnull -24 -> 34
    //   61: aconst_null
    //   62: astore_1
    //   63: goto -29 -> 34
    //   66: astore_1
    //   67: aload_1
    //   68: invokestatic 105	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   71: ldc -102
    //   73: iconst_0
    //   74: anewarray 63	java/lang/Object
    //   77: invokestatic 109	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: goto -19 -> 61
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	a
    //   33	30	1	localObject1	Object
    //   66	2	1	localThrowable	Throwable
    //   83	4	1	localObject2	Object
    //   54	4	2	localb	com.tencent.beaconimsdk.b.a.b
    //   27	2	3	i	int
    // Exception table:
    //   from	to	target	type
    //   38	55	66	java/lang/Throwable
    //   2	28	83	finally
    //   38	55	83	finally
    //   67	80	83	finally
  }
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      com.tencent.beaconimsdk.c.a.b(" TimeUpUploadDatas.done(), result:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      if ((this.e != null) && (!paramBoolean))
      {
        com.tencent.beaconimsdk.c.a.f(" upload failed, save to db", new Object[0]);
        if (!this.h)
        {
          this.g = e.a(this.f, this.e);
          this.e = null;
        }
      }
      if ((paramBoolean) && (this.h))
      {
        Context localContext = this.f;
        com.tencent.beaconimsdk.a.b.a().a(108);
        com.tencent.beaconimsdk.a.a.a(localContext, "HEART_DENGTA", e.e());
        com.tencent.beaconimsdk.c.a.a("heartbeat uploaded sucess!", new Object[0]);
      }
      if ((paramBoolean) && (this.g != null)) {
        e.a(this.f, this.g);
      }
      if ((paramBoolean) && (this.g == null) && (this.e != null)) {
        this.e = null;
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\i$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */