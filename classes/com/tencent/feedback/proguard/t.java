package com.tencent.feedback.proguard;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.feedback.common.b;
import com.tencent.feedback.upload.d;
import java.util.ArrayList;
import java.util.List;

public final class t
{
  private static t a = null;
  private w b = null;
  private boolean c = false;
  private int d = 0;
  private d e = null;
  private Runnable f = null;
  private List<s> g = new ArrayList(5);
  private SparseArray<com.tencent.feedback.upload.e> h = new SparseArray(5);
  private List<x> i = new ArrayList(5);
  
  private t(Context paramContext)
  {
    this.e = new r(paramContext);
    this.f = new u(paramContext);
    b.b().a(this.f);
  }
  
  public static t a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new t(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public static com.tencent.feedback.upload.e a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 28	com/tencent/feedback/proguard/t:a	Lcom/tencent/feedback/proguard/t;
    //   6: ifnull +15 -> 21
    //   9: getstatic 28	com/tencent/feedback/proguard/t:a	Lcom/tencent/feedback/proguard/t;
    //   12: invokespecial 80	com/tencent/feedback/proguard/t:f	()Lcom/tencent/feedback/upload/e;
    //   15: astore_0
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: aconst_null
    //   22: astore_0
    //   23: goto -7 -> 16
    //   26: astore_0
    //   27: ldc 2
    //   29: monitorexit
    //   30: aload_0
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	8	0	locale	com.tencent.feedback.upload.e
    //   26	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	16	26	finally
  }
  
  /* Error */
  private com.tencent.feedback.upload.e f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   6: ifnull +29 -> 35
    //   9: aload_0
    //   10: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   13: invokevirtual 84	android/util/SparseArray:size	()I
    //   16: ifle +19 -> 35
    //   19: aload_0
    //   20: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   23: iconst_0
    //   24: invokevirtual 88	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   27: checkcast 90	com/tencent/feedback/upload/e
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: aconst_null
    //   36: astore_1
    //   37: goto -6 -> 31
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	t
    //   30	7	1	locale	com.tencent.feedback.upload.e
    //   40	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	40	finally
  }
  
  private boolean g()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private x[] h()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 57	com/tencent/feedback/proguard/t:i	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 57	com/tencent/feedback/proguard/t:i	Ljava/util/List;
    //   13: invokeinterface 95 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 57	com/tencent/feedback/proguard/t:i	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 97	com/tencent/feedback/proguard/x
    //   29: invokeinterface 101 2 0
    //   34: checkcast 103	[Lcom/tencent/feedback/proguard/x;
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: aconst_null
    //   43: astore_1
    //   44: goto -6 -> 38
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	t
    //   37	7	1	arrayOfx	x[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.d = paramInt;
      com.tencent.feedback.common.e.f("rqdp{  step }%d", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void a(int paramInt, com.tencent.feedback.upload.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   6: ifnull +15 -> 21
    //   9: aload_2
    //   10: ifnonnull +14 -> 24
    //   13: aload_0
    //   14: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   17: iload_1
    //   18: invokevirtual 120	android/util/SparseArray:remove	(I)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 55	com/tencent/feedback/proguard/t:h	Landroid/util/SparseArray;
    //   28: iload_1
    //   29: aload_2
    //   30: invokevirtual 124	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   33: aload_2
    //   34: sipush 300
    //   37: aload_0
    //   38: invokevirtual 127	com/tencent/feedback/proguard/t:c	()Lcom/tencent/feedback/upload/d;
    //   41: invokeinterface 130 3 0
    //   46: pop
    //   47: goto -26 -> 21
    //   50: astore_2
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	t
    //   0	55	1	paramInt	int
    //   0	55	2	parame	com.tencent.feedback.upload.e
    // Exception table:
    //   from	to	target	type
    //   2	9	50	finally
    //   13	21	50	finally
    //   24	47	50	finally
  }
  
  public final void a(s params)
  {
    if (params == null) {}
    for (;;)
    {
      return;
      try
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        if (this.g.contains(params)) {
          continue;
        }
        this.g.add(params);
        int j = e();
        if (g())
        {
          com.tencent.feedback.common.e.e("rqdp{  add listener should notify app first run! }%s", new Object[] { params.toString() });
          b.b().a(new t.1(this, params));
        }
        if (j < 2) {
          continue;
        }
        com.tencent.feedback.common.e.e("rqdp{  add listener should notify app start query!} %s", new Object[] { params.toString() });
        b.b().a(new t.2(this, params, j));
      }
      finally {}
    }
  }
  
  public final void a(w paramw)
  {
    x[] arrayOfx = h();
    if (arrayOfx != null)
    {
      int k = arrayOfx.length;
      int j = 0;
      for (;;)
      {
        if (j < k)
        {
          x localx = arrayOfx[j];
          try
          {
            localx.a(paramw);
            j += 1;
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              localThrowable.printStackTrace();
              com.tencent.feedback.common.e.d("rqdp{  com strategy changed error }%s", new Object[] { localThrowable.toString() });
            }
          }
        }
      }
    }
  }
  
  public final void a(x paramx)
  {
    if (paramx != null) {}
    try
    {
      if ((this.i != null) && (!this.i.contains(paramx))) {
        this.i.add(paramx);
      }
      return;
    }
    finally
    {
      paramx = finally;
      throw paramx;
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    try
    {
      this.c = true;
      com.tencent.feedback.common.e.f("rqdp{  isFirst }%b", new Object[] { Boolean.valueOf(true) });
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final w b()
  {
    try
    {
      w localw = this.b;
      return localw;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final d c()
  {
    try
    {
      d locald = this.e;
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final s[] d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	com/tencent/feedback/proguard/t:g	Ljava/util/List;
    //   6: ifnull +36 -> 42
    //   9: aload_0
    //   10: getfield 50	com/tencent/feedback/proguard/t:g	Ljava/util/List;
    //   13: invokeinterface 95 1 0
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: getfield 50	com/tencent/feedback/proguard/t:g	Ljava/util/List;
    //   25: iconst_0
    //   26: anewarray 191	com/tencent/feedback/proguard/s
    //   29: invokeinterface 101 2 0
    //   34: checkcast 193	[Lcom/tencent/feedback/proguard/s;
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: areturn
    //   42: aconst_null
    //   43: astore_1
    //   44: goto -6 -> 38
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	t
    //   37	7	1	arrayOfs	s[]
    //   47	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	38	47	finally
  }
  
  public final int e()
  {
    try
    {
      int j = this.d;
      return j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */