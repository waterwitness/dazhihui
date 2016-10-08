package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.e;
import com.tencent.beacon.a.h;
import java.util.List;

final class l$a
  extends com.tencent.beacon.upload.a
{
  private List<k> f = null;
  private Context g;
  private Long[] h = null;
  private boolean i = false;
  
  public l$a(Context paramContext, List<k> paramList)
  {
    super(paramContext, 1, 2);
    this.f = paramList;
    this.g = paramContext;
    this.e = this.f.size();
    if ((this.f.size() == 1) && ("rqd_heartbeat".equals(((k)this.f.get(0)).d()))) {
      this.i = true;
    }
    this.d = com.tencent.beacon.b.a.a(paramContext, 2);
    com.tencent.beacon.e.b.a("real rid:%s", new Object[] { this.d });
  }
  
  /* Error */
  public final com.tencent.beacon.c.a.b a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 80
    //   4: iconst_0
    //   5: anewarray 67	java/lang/Object
    //   8: invokestatic 83	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   11: aload_0
    //   12: getfield 20	com/tencent/beacon/event/l$a:f	Ljava/util/List;
    //   15: ifnull +17 -> 32
    //   18: aload_0
    //   19: getfield 20	com/tencent/beacon/event/l$a:f	Ljava/util/List;
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
    //   39: getfield 26	com/tencent/beacon/event/l$a:g	Landroid/content/Context;
    //   42: aload_0
    //   43: getfield 85	com/tencent/beacon/event/l$a:a	I
    //   46: aload_0
    //   47: getfield 20	com/tencent/beacon/event/l$a:f	Ljava/util/List;
    //   50: invokestatic 90	com/tencent/beacon/event/m:a	(Landroid/content/Context;ILjava/util/List;)Lcom/tencent/beacon/c/a/b;
    //   53: astore_2
    //   54: aload_2
    //   55: astore_1
    //   56: aload_2
    //   57: ifnonnull -23 -> 34
    //   60: aconst_null
    //   61: astore_1
    //   62: goto -28 -> 34
    //   65: astore_1
    //   66: aload_1
    //   67: invokevirtual 94	java/lang/Throwable:printStackTrace	()V
    //   70: ldc 96
    //   72: iconst_0
    //   73: anewarray 67	java/lang/Object
    //   76: invokestatic 98	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: goto -19 -> 60
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	a
    //   33	29	1	localObject1	Object
    //   65	2	1	localThrowable	Throwable
    //   82	4	1	localObject2	Object
    //   53	4	2	localb	com.tencent.beacon.c.a.b
    //   27	2	3	j	int
    // Exception table:
    //   from	to	target	type
    //   38	54	65	java/lang/Throwable
    //   2	28	82	finally
    //   38	54	82	finally
    //   66	79	82	finally
  }
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      com.tencent.beacon.e.b.b(" TimeUpUploadDatas.done(), result:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      if ((this.f != null) && (!paramBoolean))
      {
        com.tencent.beacon.e.b.f(" upload failed, save to db", new Object[0]);
        if (!this.i)
        {
          this.h = h.a(this.g, this.f);
          this.f = null;
        }
      }
      if ((paramBoolean) && (this.i))
      {
        Context localContext = this.g;
        e.a().a(108, true);
        com.tencent.beacon.a.b.a(localContext, "HEART_DENGTA", com.tencent.beacon.b.a.t());
        com.tencent.beacon.e.b.a("heartbeat uploaded sucess!", new Object[0]);
      }
      if ((paramBoolean) && (this.h != null)) {
        h.a(this.g, this.h);
      }
      if ((paramBoolean) && (this.h == null) && (this.f != null)) {
        this.f = null;
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\l$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */