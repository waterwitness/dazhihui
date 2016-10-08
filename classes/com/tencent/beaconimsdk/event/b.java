package com.tencent.beaconimsdk.event;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
  extends com.tencent.beaconimsdk.upload.a
{
  private Context e = null;
  private Long[] f = null;
  private List<Long> g = null;
  private byte[] h = null;
  private boolean i = false;
  
  public b(Context paramContext)
  {
    super(paramContext, 1, 4);
    this.e = paramContext;
  }
  
  private com.tencent.beaconimsdk.b.a.a a(List<h> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      return null;
    }
    Object localObject1 = new ArrayList();
    int k = paramList.size();
    this.g = new ArrayList();
    int j = 0;
    for (;;)
    {
      if (j < k) {
        try
        {
          h localh = (h)paramList.get(j);
          Object localObject2 = localh.e();
          com.tencent.beaconimsdk.c.a.a(" bean.getTP: " + localh.b(), new Object[0]);
          if ((localObject2 == null) || (!"UA".equals(localh.b()))) {
            break label346;
          }
          com.tencent.beaconimsdk.c.a.f(" Pack2Upload eventName:}%s ", new Object[] { localh.d() });
          localObject2 = a.b(localh);
          if (localObject2 != null) {
            ((ArrayList)localObject1).add(localObject2);
          } else {
            this.g.add(Long.valueOf(localh.a()));
          }
        }
        catch (Throwable paramList)
        {
          com.tencent.beaconimsdk.c.a.a(paramList);
          com.tencent.beaconimsdk.c.a.d(" CommonRecordUploadDatas.encode2MixPackage() error1", new Object[0]);
        }
      }
      for (;;)
      {
        try
        {
          if (((ArrayList)localObject1).size() > 0)
          {
            paramList = new com.tencent.beaconimsdk.b.b.b();
            paramList.a = ((ArrayList)localObject1);
            if (paramList == null)
            {
              return null;
              if (this.g.size() > 0) {
                com.tencent.beaconimsdk.a.e.a(this.e, (Long[])this.g.toArray(new Long[this.g.size()]));
              }
              com.tencent.beaconimsdk.c.a.b(" up erList:" + ((ArrayList)localObject1).size(), new Object[0]);
              continue;
            }
            localObject1 = new HashMap();
            ((Map)localObject1).put(Integer.valueOf(1), paramList.a());
            paramList = new com.tencent.beaconimsdk.b.a.a();
            paramList.a = ((Map)localObject1);
            return paramList;
          }
        }
        catch (Exception paramList)
        {
          com.tencent.beaconimsdk.c.a.a(paramList);
          com.tencent.beaconimsdk.c.a.d(" CommonRecordUploadDatas.encode2MixPackage() error2", new Object[0]);
          b();
          return null;
        }
        paramList = null;
      }
      label346:
      j += 1;
    }
  }
  
  private boolean f()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.beaconimsdk.b.a.b a()
  {
    Object localObject9 = null;
    int k = 0;
    Object localObject6;
    try
    {
      Object localObject1 = j.d();
      if ((localObject1 == null) || (!((j)localObject1).e()))
      {
        com.tencent.beaconimsdk.c.a.c(" imposiable! ua not ready!", new Object[0]);
        localObject1 = localObject9;
      }
      for (;;)
      {
        return (com.tencent.beaconimsdk.b.a.b)localObject1;
        localObject6 = ((j)localObject1).g();
        if (localObject6 == null)
        {
          com.tencent.beaconimsdk.c.a.c(" imposiable! ua S not ready!", new Object[0]);
          localObject1 = localObject9;
        }
        else
        {
          try
          {
            if (f())
            {
              localObject7 = com.tencent.beaconimsdk.a.a.a.a(this.e);
              if ((localObject7 != null) && (((List)localObject7).size() > 0))
              {
                localObject3 = (byte[])((List)localObject7).get(3);
                this.d = String.valueOf(((List)localObject7).get(1));
                ((Integer)((List)localObject7).get(4)).intValue();
                if (localObject3 != null)
                {
                  localObject6 = this.c;
                  localObject3 = a(this.a, (byte[])localObject3);
                  continue;
                }
                m = ((e)localObject6).e();
                j = m;
                if (!com.tencent.beaconimsdk.a.e.l(this.e)) {
                  j = m / 2;
                }
                if (j >= 0)
                {
                  localObject6 = com.tencent.beaconimsdk.a.e.a(this.e, j);
                  if ((localObject6 == null) || (((List)localObject6).size() <= 0))
                  {
                    com.tencent.beaconimsdk.c.a.h(" no up datas", new Object[0]);
                    localObject3 = localObject9;
                  }
                }
              }
            }
          }
          catch (Throwable localThrowable)
          {
            com.tencent.beaconimsdk.c.a.a(localThrowable);
            com.tencent.beaconimsdk.c.a.d(" get req datas error: %s", new Object[] { localThrowable.toString() });
            localObject4 = localObject9;
          }
        }
      }
    }
    finally {}
    for (;;)
    {
      Object localObject7;
      Object localObject3;
      int m;
      break;
      int j = ((List)localObject6).size();
      com.tencent.beaconimsdk.c.a.h(" size:%d", new Object[] { Integer.valueOf(j) });
      Object localObject8;
      try
      {
        localObject7 = a((List)localObject6);
        this.f = new Long[j];
        j = k;
        while (j < this.f.length)
        {
          this.f[j] = Long.valueOf(((h)((List)localObject6).get(j)).a());
          j += 1;
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          b();
          localObject8 = null;
        }
        ((List)localObject6).clear();
        if (localObject8 == null) {
          break label440;
        }
      }
      Object localObject4 = ((com.tencent.beaconimsdk.b.a.a)localObject8).a();
      label440:
      for (;;)
      {
        this.h = new byte[localObject4.length];
        System.arraycopy(localObject4, 0, this.h, 0, localObject4.length);
        this.d = com.tencent.beaconimsdk.a.e.b(this.c, 4);
        com.tencent.beaconimsdk.c.a.a("comm rid:%s", new Object[] { this.d });
        try
        {
          localObject6 = this.c;
          localObject4 = a(this.a, (byte[])localObject4);
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            b();
            localObject5 = null;
          }
        }
      }
      localObject6 = null;
      continue;
      Object localObject5 = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.i = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b()
  {
    try
    {
      com.tencent.beaconimsdk.c.a.c(" encode failed, clear db data", new Object[0]);
      if ((this.f != null) && (this.f.length > 0))
      {
        int j = com.tencent.beaconimsdk.a.e.a(this.e, this.f);
        com.tencent.beaconimsdk.c.a.b(" remove num :" + j, new Object[0]);
        this.f = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 24	com/tencent/beaconimsdk/event/b:f	[Ljava/lang/Long;
    //   8: ifnull +9 -> 17
    //   11: aload_0
    //   12: getfield 24	com/tencent/beaconimsdk/event/b:f	[Ljava/lang/Long;
    //   15: arraylength
    //   16: istore_3
    //   17: iload_3
    //   18: ifle +41 -> 59
    //   21: aload_0
    //   22: getfield 22	com/tencent/beaconimsdk/event/b:e	Landroid/content/Context;
    //   25: aload_0
    //   26: getfield 24	com/tencent/beaconimsdk/event/b:f	[Ljava/lang/Long;
    //   29: invokestatic 139	com/tencent/beaconimsdk/a/e:a	(Landroid/content/Context;[Ljava/lang/Long;)I
    //   32: istore 4
    //   34: new 59	java/lang/StringBuilder
    //   37: dup
    //   38: ldc_w 263
    //   41: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: iload 4
    //   46: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   49: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: iconst_0
    //   53: anewarray 77	java/lang/Object
    //   56: invokestatic 146	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 24	com/tencent/beaconimsdk/event/b:f	[Ljava/lang/Long;
    //   64: iload_1
    //   65: ifeq +30 -> 95
    //   68: aload_0
    //   69: invokespecial 196	com/tencent/beaconimsdk/event/b:f	()Z
    //   72: ifeq +23 -> 95
    //   75: aload_0
    //   76: getfield 22	com/tencent/beaconimsdk/event/b:e	Landroid/content/Context;
    //   79: aload_0
    //   80: getfield 208	com/tencent/beaconimsdk/event/b:d	Ljava/lang/String;
    //   83: invokestatic 266	com/tencent/beaconimsdk/a/a/a:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   86: pop
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield 28	com/tencent/beaconimsdk/event/b:h	[B
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: iload_1
    //   96: ifne -9 -> 87
    //   99: aload_0
    //   100: getfield 28	com/tencent/beaconimsdk/event/b:h	[B
    //   103: ifnull -16 -> 87
    //   106: ldc_w 268
    //   109: iconst_1
    //   110: anewarray 77	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: getfield 208	com/tencent/beaconimsdk/event/b:d	Ljava/lang/String;
    //   119: aastore
    //   120: invokestatic 82	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_0
    //   124: getfield 22	com/tencent/beaconimsdk/event/b:e	Landroid/content/Context;
    //   127: aload_0
    //   128: getfield 28	com/tencent/beaconimsdk/event/b:h	[B
    //   131: aload_0
    //   132: getfield 208	com/tencent/beaconimsdk/event/b:d	Ljava/lang/String;
    //   135: iload_3
    //   136: invokestatic 271	com/tencent/beaconimsdk/a/a/a:a	(Landroid/content/Context;[BLjava/lang/String;I)Z
    //   139: pop
    //   140: goto -53 -> 87
    //   143: astore_2
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_2
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	b
    //   0	148	1	paramBoolean	boolean
    //   143	4	2	localObject	Object
    //   1	135	3	j	int
    //   32	13	4	k	int
    // Exception table:
    //   from	to	target	type
    //   4	17	143	finally
    //   21	59	143	finally
    //   59	64	143	finally
    //   68	87	143	finally
    //   87	92	143	finally
    //   99	140	143	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\event\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */