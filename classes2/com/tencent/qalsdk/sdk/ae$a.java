package com.tencent.qalsdk.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

abstract class ae$a
  implements Iterator<E>
{
  ae.d<E> a;
  E b;
  private ae.d<E> d;
  
  /* Error */
  ae$a(ae paramae)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 20	com/tencent/qalsdk/sdk/ae$a:c	Lcom/tencent/qalsdk/sdk/ae;
    //   5: aload_0
    //   6: invokespecial 23	java/lang/Object:<init>	()V
    //   9: aload_1
    //   10: getfield 28	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 33	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual 36	com/tencent/qalsdk/sdk/ae$a:a	()Lcom/tencent/qalsdk/sdk/ae$d;
    //   23: putfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   26: aload_0
    //   27: getfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   30: ifnonnull +15 -> 45
    //   33: aconst_null
    //   34: astore_1
    //   35: aload_0
    //   36: aload_1
    //   37: putfield 40	com/tencent/qalsdk/sdk/ae$a:b	Ljava/lang/Object;
    //   40: aload_2
    //   41: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   44: return
    //   45: aload_0
    //   46: getfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   49: getfield 47	com/tencent/qalsdk/sdk/ae$d:a	Ljava/lang/Object;
    //   52: astore_1
    //   53: goto -18 -> 35
    //   56: astore_1
    //   57: aload_2
    //   58: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	a
    //   0	63	1	paramae	ae
    //   13	45	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   18	33	56	finally
    //   35	40	56	finally
    //   45	53	56	finally
  }
  
  private ae.d<E> b(ae.d<E> paramd)
  {
    for (;;)
    {
      ae.d locald = a(paramd);
      Object localObject;
      if (locald == null) {
        localObject = null;
      }
      do
      {
        return (ae.d<E>)localObject;
        localObject = locald;
      } while (locald.a != null);
      if (locald == paramd) {
        return a();
      }
      paramd = locald;
    }
  }
  
  abstract ae.d<E> a();
  
  abstract ae.d<E> a(ae.d<E> paramd);
  
  /* Error */
  void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/tencent/qalsdk/sdk/ae$a:c	Lcom/tencent/qalsdk/sdk/ae;
    //   4: getfield 28	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   7: astore_2
    //   8: aload_2
    //   9: invokevirtual 33	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   12: aload_0
    //   13: aload_0
    //   14: aload_0
    //   15: getfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   18: invokespecial 55	com/tencent/qalsdk/sdk/ae$a:b	(Lcom/tencent/qalsdk/sdk/ae$d;)Lcom/tencent/qalsdk/sdk/ae$d;
    //   21: putfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   24: aload_0
    //   25: getfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   28: ifnonnull +15 -> 43
    //   31: aconst_null
    //   32: astore_1
    //   33: aload_0
    //   34: aload_1
    //   35: putfield 40	com/tencent/qalsdk/sdk/ae$a:b	Ljava/lang/Object;
    //   38: aload_2
    //   39: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: return
    //   43: aload_0
    //   44: getfield 38	com/tencent/qalsdk/sdk/ae$a:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   47: getfield 47	com/tencent/qalsdk/sdk/ae$d:a	Ljava/lang/Object;
    //   50: astore_1
    //   51: goto -18 -> 33
    //   54: astore_1
    //   55: aload_2
    //   56: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	a
    //   32	19	1	localObject1	Object
    //   54	6	1	localObject2	Object
    //   7	49	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   12	31	54	finally
    //   33	38	54	finally
    //   43	51	54	finally
  }
  
  public boolean hasNext()
  {
    return this.a != null;
  }
  
  public E next()
  {
    if (this.a == null) {
      throw new NoSuchElementException();
    }
    this.d = this.a;
    Object localObject = this.b;
    b();
    return (E)localObject;
  }
  
  public void remove()
  {
    ae.d locald = this.d;
    if (locald == null) {
      throw new IllegalStateException();
    }
    this.d = null;
    ReentrantLock localReentrantLock = this.c.c;
    localReentrantLock.lock();
    try
    {
      if (locald.a != null) {
        this.c.a(locald);
      }
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ae$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */