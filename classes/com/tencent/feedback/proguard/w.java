package com.tencent.feedback.proguard;

import android.util.SparseArray;

public final class w
{
  private SparseArray<w.a> a = null;
  private String b = "http://monitor.uu.qq.com/analytics/upload";
  private int c = -1;
  private int d = 6;
  private String e = "*^@K#K@!";
  private String f = "S(@L@L@)";
  private int g = 1;
  private int h = 1;
  private boolean i = true;
  private boolean j = false;
  
  public w()
  {
    this.a.append(3, new w.a(3));
    this.a = this.a;
  }
  
  public final String a()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.c = paramInt;
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
      this.b = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
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
  
  public final int b()
  {
    try
    {
      int k = this.c;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(int paramInt)
  {
    if (paramInt > 0) {}
    try
    {
      this.d = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(String paramString)
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
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int c()
  {
    try
    {
      int k = this.d;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(int paramInt)
  {
    try
    {
      this.g = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(String paramString)
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
  
  public final String d()
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
  
  public final void d(int paramInt)
  {
    try
    {
      this.h = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final w.a e(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 25	com/tencent/feedback/proguard/w:a	Landroid/util/SparseArray;
    //   6: ifnull +19 -> 25
    //   9: aload_0
    //   10: getfield 25	com/tencent/feedback/proguard/w:a	Landroid/util/SparseArray;
    //   13: iload_1
    //   14: invokevirtual 71	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   17: checkcast 56	com/tencent/feedback/proguard/w$a
    //   20: astore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_2
    //   24: areturn
    //   25: aconst_null
    //   26: astore_2
    //   27: goto -6 -> 21
    //   30: astore_2
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_2
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	w
    //   0	35	1	paramInt	int
    //   20	7	2	locala	w.a
    //   30	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	30	finally
  }
  
  public final String e()
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
  
  public final int f()
  {
    try
    {
      int k = this.g;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int g()
  {
    try
    {
      int k = this.h;
      return k;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean h()
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
  
  /* Error */
  public final SparseArray<w.a> i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 25	com/tencent/feedback/proguard/w:a	Landroid/util/SparseArray;
    //   6: ifnull +23 -> 29
    //   9: new 75	com/tencent/feedback/common/j
    //   12: dup
    //   13: invokespecial 76	com/tencent/feedback/common/j:<init>	()V
    //   16: pop
    //   17: aload_0
    //   18: getfield 25	com/tencent/feedback/proguard/w:a	Landroid/util/SparseArray;
    //   21: invokestatic 79	com/tencent/feedback/common/j:a	(Landroid/util/SparseArray;)Landroid/util/SparseArray;
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: areturn
    //   29: aconst_null
    //   30: astore_1
    //   31: goto -6 -> 25
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	w
    //   24	7	1	localSparseArray	SparseArray
    //   34	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	25	34	finally
  }
  
  public final boolean j()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */