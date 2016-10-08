package com.tencent.beacon.a.b;

import android.util.SparseArray;
import java.util.Map;

public class e
{
  private static e a = null;
  private String b = "http://strategy.beacon.qq.com/analytics/upload";
  private int c = 360;
  private int d = 1;
  private int e = 100;
  private SparseArray<e.a> f = null;
  private Map<String, String> g = null;
  private byte h = 1;
  private byte i = 2;
  private String j = "*^@K#K@!";
  
  private e()
  {
    this.f.put(1, new e.a(1));
    this.f.put(2, new e.a(2));
    this.f.put(3, new e.a(3));
  }
  
  public static e a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new e();
      }
      return a;
    }
    finally {}
  }
  
  public final void a(byte paramByte)
  {
    try
    {
      this.h = paramByte;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public final void a(Map<String, String> paramMap)
  {
    this.g = paramMap;
  }
  
  /* Error */
  public final e.a b(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	com/tencent/beacon/a/b/e:f	Landroid/util/SparseArray;
    //   6: ifnull +19 -> 25
    //   9: aload_0
    //   10: getfield 42	com/tencent/beacon/a/b/e:f	Landroid/util/SparseArray;
    //   13: iload_1
    //   14: invokevirtual 76	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   17: checkcast 59	com/tencent/beacon/a/b/e$a
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
    //   0	35	0	this	e
    //   0	35	1	paramInt	int
    //   20	7	2	locala	e.a
    //   30	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	30	finally
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final void b(byte paramByte)
  {
    try
    {
      this.i = paramByte;
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
      this.j = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final boolean c(int paramInt)
  {
    boolean bool = false;
    try
    {
      if (this.f != null) {
        bool = e.a.a((e.a)this.f.get(2));
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Map<String, String> d()
  {
    return this.g;
  }
  
  /* Error */
  public final SparseArray<e.a> e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	com/tencent/beacon/a/b/e:f	Landroid/util/SparseArray;
    //   6: ifnull +23 -> 29
    //   9: new 87	com/tencent/beacon/e/f
    //   12: dup
    //   13: invokespecial 88	com/tencent/beacon/e/f:<init>	()V
    //   16: pop
    //   17: aload_0
    //   18: getfield 42	com/tencent/beacon/a/b/e:f	Landroid/util/SparseArray;
    //   21: invokestatic 91	com/tencent/beacon/e/f:a	(Landroid/util/SparseArray;)Landroid/util/SparseArray;
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
    //   0	39	0	this	e
    //   24	7	1	localSparseArray	SparseArray
    //   34	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	25	34	finally
  }
  
  public final boolean f()
  {
    if (this.g != null)
    {
      String str = (String)this.g.get("updateQimei");
      if ((str != null) && ("n".equalsIgnoreCase(str))) {
        return false;
      }
      if ((str != null) && ("y".equalsIgnoreCase(str))) {
        return true;
      }
    }
    return true;
  }
  
  public final int g()
  {
    if (this.g != null)
    {
      String str = (String)this.g.get("maxQIMEIQueryOneDay");
      if ((str != null) && (!str.trim().equals("")))
      {
        int k = this.d;
        try
        {
          int m = Integer.valueOf(str).intValue();
          return m;
        }
        catch (Exception localException)
        {
          return k;
        }
      }
    }
    return this.d;
  }
  
  public final int h()
  {
    if (this.g != null)
    {
      String str = (String)this.g.get("maxStrategyQueryOneDay");
      if ((str != null) && (!str.trim().equals("")))
      {
        int k = this.e;
        try
        {
          int m = Integer.valueOf(str).intValue();
          return m;
        }
        catch (Exception localException)
        {
          return k;
        }
      }
    }
    return this.e;
  }
  
  /* Error */
  public final boolean i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/tencent/beacon/a/b/e:g	Ljava/util/Map;
    //   6: ifnull +50 -> 56
    //   9: aload_0
    //   10: getfield 44	com/tencent/beacon/a/b/e:g	Ljava/util/Map;
    //   13: ldc -120
    //   15: invokeinterface 100 2 0
    //   20: checkcast 102	java/lang/String
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +31 -> 56
    //   28: ldc 110
    //   30: aload_1
    //   31: invokevirtual 108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   34: ifeq +22 -> 56
    //   37: invokestatic 142	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   40: bipush 11
    //   42: invokevirtual 145	java/util/Calendar:get	(I)I
    //   45: istore_2
    //   46: iload_2
    //   47: ifne +9 -> 56
    //   50: iconst_1
    //   51: istore_3
    //   52: aload_0
    //   53: monitorexit
    //   54: iload_3
    //   55: ireturn
    //   56: iconst_0
    //   57: istore_3
    //   58: goto -6 -> 52
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	e
    //   23	8	1	str	String
    //   61	4	1	localObject	Object
    //   45	2	2	k	int
    //   51	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	24	61	finally
    //   28	46	61	finally
  }
  
  /* Error */
  public final boolean j()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/tencent/beacon/a/b/e:g	Ljava/util/Map;
    //   6: ifnull +50 -> 56
    //   9: aload_0
    //   10: getfield 44	com/tencent/beacon/a/b/e:g	Ljava/util/Map;
    //   13: ldc -109
    //   15: invokeinterface 100 2 0
    //   20: checkcast 102	java/lang/String
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +31 -> 56
    //   28: ldc 110
    //   30: aload_1
    //   31: invokevirtual 108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   34: ifeq +22 -> 56
    //   37: invokestatic 142	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   40: bipush 11
    //   42: invokevirtual 145	java/util/Calendar:get	(I)I
    //   45: istore_2
    //   46: iload_2
    //   47: ifne +9 -> 56
    //   50: iconst_1
    //   51: istore_3
    //   52: aload_0
    //   53: monitorexit
    //   54: iload_3
    //   55: ireturn
    //   56: iconst_0
    //   57: istore_3
    //   58: goto -6 -> 52
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	e
    //   23	8	1	str	String
    //   61	4	1	localObject	Object
    //   45	2	2	k	int
    //   51	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	24	61	finally
    //   28	46	61	finally
  }
  
  public final byte k()
  {
    try
    {
      byte b1 = this.h;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final byte l()
  {
    try
    {
      byte b1 = this.i;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String m()
  {
    try
    {
      String str = this.j;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */