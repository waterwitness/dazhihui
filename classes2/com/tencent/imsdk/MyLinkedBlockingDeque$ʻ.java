package com.tencent.imsdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

abstract class MyLinkedBlockingDeque$ʻ
  implements Iterator<E>
{
  private ᵎ<E> a;
  private E b;
  private ᵎ<E> c;
  
  /* Error */
  MyLinkedBlockingDeque$ʻ(MyLinkedBlockingDeque paramMyLinkedBlockingDeque)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 20	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:d	Lcom/tencent/imsdk/MyLinkedBlockingDeque;
    //   5: aload_0
    //   6: invokespecial 23	java/lang/Object:<init>	()V
    //   9: aload_1
    //   10: getfield 29	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 33	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual 36	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:a	()Lcom/tencent/imsdk/ᵎ;
    //   23: putfield 38	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:a	Lcom/tencent/imsdk/ᵎ;
    //   26: aload_0
    //   27: getfield 38	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:a	Lcom/tencent/imsdk/ᵎ;
    //   30: ifnonnull +15 -> 45
    //   33: aconst_null
    //   34: astore_1
    //   35: aload_0
    //   36: aload_1
    //   37: putfield 40	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:b	Ljava/lang/Object;
    //   40: aload_2
    //   41: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   44: return
    //   45: aload_0
    //   46: getfield 38	com/tencent/imsdk/MyLinkedBlockingDeque$ʻ:a	Lcom/tencent/imsdk/ᵎ;
    //   49: getfield 47	com/tencent/imsdk/ᵎ:a	Ljava/lang/Object;
    //   52: astore_1
    //   53: goto -18 -> 35
    //   56: astore_1
    //   57: aload_2
    //   58: invokevirtual 43	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	ʻ
    //   0	63	1	paramMyLinkedBlockingDeque	MyLinkedBlockingDeque
    //   13	45	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   18	33	56	finally
    //   35	40	56	finally
    //   45	53	56	finally
  }
  
  private void b()
  {
    Object localObject4 = null;
    ReentrantLock localReentrantLock = this.d.lock;
    localReentrantLock.lock();
    label101:
    for (;;)
    {
      try
      {
        Object localObject3 = this.a;
        ᵎ localᵎ = a((ᵎ)localObject3);
        if (localᵎ == null)
        {
          localObject1 = null;
          this.a = ((ᵎ)localObject1);
          if (this.a == null)
          {
            localObject1 = localObject4;
            this.b = localObject1;
          }
        }
        else
        {
          localObject1 = localᵎ;
          if (localᵎ.a != null) {
            continue;
          }
          if (localᵎ != localObject3) {
            break label101;
          }
          localObject1 = a();
          continue;
        }
        Object localObject1 = this.a.a;
        continue;
        localObject3 = localᵎ;
      }
      finally
      {
        localReentrantLock.unlock();
      }
    }
  }
  
  abstract ᵎ<E> a();
  
  abstract ᵎ<E> a(ᵎ<E> paramᵎ);
  
  public boolean hasNext()
  {
    return this.a != null;
  }
  
  public E next()
  {
    if (this.a == null) {
      throw new NoSuchElementException();
    }
    this.c = this.a;
    Object localObject = this.b;
    b();
    return (E)localObject;
  }
  
  public void remove()
  {
    ᵎ localᵎ = this.c;
    if (localᵎ == null) {
      throw new IllegalStateException();
    }
    this.c = null;
    ReentrantLock localReentrantLock = this.d.lock;
    localReentrantLock.lock();
    try
    {
      if (localᵎ.a != null) {
        this.d.unlink$3d2f4473(localᵎ);
      }
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\MyLinkedBlockingDeque$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */