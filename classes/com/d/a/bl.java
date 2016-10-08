package com.d.a;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class bl
{
  boolean a;
  Semaphore b = new Semaphore(0);
  private Selector c;
  
  public bl(Selector paramSelector)
  {
    this.c = paramSelector;
  }
  
  public Selector a()
  {
    return this.c;
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.b.drainPermits();
      this.c.select(paramLong);
      return;
    }
    finally
    {
      this.b.release(Integer.MAX_VALUE);
    }
  }
  
  public int b()
  {
    return this.c.selectNow();
  }
  
  public void c()
  {
    a(0L);
  }
  
  public Set<SelectionKey> d()
  {
    return this.c.keys();
  }
  
  public Set<SelectionKey> e()
  {
    return this.c.selectedKeys();
  }
  
  public void f()
  {
    this.c.close();
  }
  
  public boolean g()
  {
    return this.c.isOpen();
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_0
    //   5: getfield 22	com/d/a/bl:b	Ljava/util/concurrent/Semaphore;
    //   8: invokevirtual 72	java/util/concurrent/Semaphore:tryAcquire	()Z
    //   11: ifeq +5 -> 16
    //   14: iconst_0
    //   15: istore_2
    //   16: aload_0
    //   17: getfield 24	com/d/a/bl:c	Ljava/nio/channels/Selector;
    //   20: invokevirtual 75	java/nio/channels/Selector:wakeup	()Ljava/nio/channels/Selector;
    //   23: pop
    //   24: iload_2
    //   25: ifeq +4 -> 29
    //   28: return
    //   29: aload_0
    //   30: monitorenter
    //   31: aload_0
    //   32: getfield 77	com/d/a/bl:a	Z
    //   35: ifeq +11 -> 46
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield 77	com/d/a/bl:a	Z
    //   51: aload_0
    //   52: monitorexit
    //   53: iload_3
    //   54: istore_2
    //   55: iload_2
    //   56: bipush 100
    //   58: if_icmplt +18 -> 76
    //   61: aload_0
    //   62: monitorenter
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 77	com/d/a/bl:a	Z
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    //   76: aload_0
    //   77: getfield 22	com/d/a/bl:b	Ljava/util/concurrent/Semaphore;
    //   80: ldc2_w 78
    //   83: getstatic 85	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   86: invokevirtual 88	java/util/concurrent/Semaphore:tryAcquire	(JLjava/util/concurrent/TimeUnit;)Z
    //   89: istore 4
    //   91: iload 4
    //   93: ifeq +19 -> 112
    //   96: aload_0
    //   97: monitorenter
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield 77	com/d/a/bl:a	Z
    //   103: aload_0
    //   104: monitorexit
    //   105: return
    //   106: astore_1
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_1
    //   110: athrow
    //   111: astore_1
    //   112: aload_0
    //   113: getfield 24	com/d/a/bl:c	Ljava/nio/channels/Selector;
    //   116: invokevirtual 75	java/nio/channels/Selector:wakeup	()Ljava/nio/channels/Selector;
    //   119: pop
    //   120: iload_2
    //   121: iconst_1
    //   122: iadd
    //   123: istore_2
    //   124: goto -69 -> 55
    //   127: astore_1
    //   128: aload_0
    //   129: monitorenter
    //   130: aload_0
    //   131: iconst_0
    //   132: putfield 77	com/d/a/bl:a	Z
    //   135: aload_0
    //   136: monitorexit
    //   137: aload_1
    //   138: athrow
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	bl
    //   41	4	1	localObject1	Object
    //   71	4	1	localObject2	Object
    //   106	4	1	localObject3	Object
    //   111	1	1	localInterruptedException	InterruptedException
    //   127	11	1	localObject4	Object
    //   139	4	1	localObject5	Object
    //   1	123	2	i	int
    //   3	51	3	j	int
    //   89	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   31	40	41	finally
    //   42	44	41	finally
    //   46	53	41	finally
    //   63	70	71	finally
    //   72	74	71	finally
    //   98	105	106	finally
    //   107	109	106	finally
    //   76	91	111	java/lang/InterruptedException
    //   76	91	127	finally
    //   112	120	127	finally
    //   130	137	139	finally
    //   140	142	139	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */