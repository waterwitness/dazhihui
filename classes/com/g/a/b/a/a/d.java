package com.g.a.b.a.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class d<E>
  extends AbstractQueue<E>
  implements a<E>, Serializable
{
  transient h<E> a;
  transient h<E> b;
  final ReentrantLock c = new ReentrantLock();
  private transient int d;
  private final int e;
  private final Condition f = this.c.newCondition();
  private final Condition g = this.c.newCondition();
  
  public d()
  {
    this(Integer.MAX_VALUE);
  }
  
  public d(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException();
    }
    this.e = paramInt;
  }
  
  private boolean b(h<E> paramh)
  {
    if (this.d >= this.e) {
      return false;
    }
    h localh = this.a;
    paramh.c = localh;
    this.a = paramh;
    if (this.b == null) {
      this.b = paramh;
    }
    for (;;)
    {
      this.d += 1;
      this.f.signal();
      return true;
      localh.b = paramh;
    }
  }
  
  private boolean c(h<E> paramh)
  {
    if (this.d >= this.e) {
      return false;
    }
    h localh = this.b;
    paramh.b = localh;
    this.b = paramh;
    if (this.a == null) {
      this.a = paramh;
    }
    for (;;)
    {
      this.d += 1;
      this.f.signal();
      return true;
      localh.c = paramh;
    }
  }
  
  private E f()
  {
    h localh1 = this.a;
    if (localh1 == null) {
      return null;
    }
    h localh2 = localh1.c;
    Object localObject = localh1.a;
    localh1.a = null;
    localh1.c = localh1;
    this.a = localh2;
    if (localh2 == null) {
      this.b = null;
    }
    for (;;)
    {
      this.d -= 1;
      this.g.signal();
      return (E)localObject;
      localh2.b = null;
    }
  }
  
  private E g()
  {
    h localh1 = this.b;
    if (localh1 == null) {
      return null;
    }
    h localh2 = localh1.b;
    Object localObject = localh1.a;
    localh1.a = null;
    localh1.b = localh1;
    this.b = localh2;
    if (localh2 == null) {
      this.a = null;
    }
    for (;;)
    {
      this.d -= 1;
      this.g.signal();
      return (E)localObject;
      localh2.c = null;
    }
  }
  
  public E a()
  {
    Object localObject = b();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public E a(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = f();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.f.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  void a(h<E> paramh)
  {
    h localh1 = paramh.b;
    h localh2 = paramh.c;
    if (localh1 == null)
    {
      f();
      return;
    }
    if (localh2 == null)
    {
      g();
      return;
    }
    localh1.c = localh2;
    localh2.b = localh1;
    paramh.a = null;
    this.d -= 1;
    this.g.signal();
  }
  
  public void a(E paramE)
  {
    if (!c(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public boolean a(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new h(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = c(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.g.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public boolean add(E paramE)
  {
    a(paramE);
    return true;
  }
  
  public E b()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = f();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public boolean b(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    h localh = new h(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = b(localh);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public E c()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = f();
        if (localObject != null) {
          break;
        }
        this.f.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  public boolean c(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    h localh = new h(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = c(localh);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public void clear()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      h localh;
      for (Object localObject1 = this.a; localObject1 != null; localObject1 = localh)
      {
        ((h)localObject1).a = null;
        localh = ((h)localObject1).c;
        ((h)localObject1).b = null;
        ((h)localObject1).c = null;
      }
      this.b = null;
      this.a = null;
      this.d = 0;
      this.g.signalAll();
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public boolean contains(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (h localh = this.a; localh != null; localh = localh.c)
      {
        boolean bool = paramObject.equals(localh.a);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E d()
  {
    Object localObject = e();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  /* Error */
  public void d(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 115	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 116	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 55	com/g/a/b/a/a/h
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 118	com/g/a/b/a/a/h:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 35	com/g/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 120	com/g/a/b/a/a/d:c	(Lcom/g/a/b/a/a/h;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 43	com/g/a/b/a/a/d:g	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 133 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	d
    //   0	62	1	paramE	E
    //   20	12	2	localh	h
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public int drainTo(Collection<? super E> paramCollection)
  {
    return drainTo(paramCollection, Integer.MAX_VALUE);
  }
  
  public int drainTo(Collection<? super E> paramCollection, int paramInt)
  {
    if (paramCollection == null) {
      throw new NullPointerException();
    }
    if (paramCollection == this) {
      throw new IllegalArgumentException();
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = Math.min(paramInt, this.d);
      paramInt = 0;
      while (paramInt < i)
      {
        paramCollection.add(this.a.a);
        f();
        paramInt += 1;
      }
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public E e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/g/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 53	com/g/a/b/a/a/d:a	Lcom/g/a/b/a/a/h;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 53	com/g/a/b/a/a/d:a	Lcom/g/a/b/a/a/h;
    //   30: getfield 71	com/g/a/b/a/a/h:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	d
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public boolean e(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (h localh = this.a; localh != null; localh = localh.c) {
        if (paramObject.equals(localh.a))
        {
          a(localh);
          return true;
        }
      }
      return false;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E element()
  {
    return (E)d();
  }
  
  public Iterator<E> iterator()
  {
    return new g(this, null);
  }
  
  public boolean offer(E paramE)
  {
    return c(paramE);
  }
  
  public boolean offer(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    return a(paramE, paramLong, paramTimeUnit);
  }
  
  public E peek()
  {
    return (E)e();
  }
  
  public E poll()
  {
    return (E)b();
  }
  
  public E poll(long paramLong, TimeUnit paramTimeUnit)
  {
    return (E)a(paramLong, paramTimeUnit);
  }
  
  public void put(E paramE)
  {
    d(paramE);
  }
  
  public int remainingCapacity()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.e;
      int j = this.d;
      return i - j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E remove()
  {
    return (E)a();
  }
  
  public boolean remove(Object paramObject)
  {
    return e(paramObject);
  }
  
  public int size()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E take()
  {
    return (E)c();
  }
  
  public Object[] toArray()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object[] arrayOfObject = new Object[this.d];
      int i = 0;
      h localh = this.a;
      while (localh != null)
      {
        arrayOfObject[i] = localh.a;
        localh = localh.c;
        i += 1;
      }
      return arrayOfObject;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    Object localObject = paramArrayOfT;
    try
    {
      if (paramArrayOfT.length < this.d) {
        localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.d);
      }
      int i = 0;
      paramArrayOfT = this.a;
      while (paramArrayOfT != null)
      {
        localObject[i] = paramArrayOfT.a;
        paramArrayOfT = paramArrayOfT.c;
        i += 1;
      }
      if (localObject.length > i) {
        localObject[i] = null;
      }
      return (T[])localObject;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  /* Error */
  public String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/g/a/b/a/a/d:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   11: aload_0
    //   12: getfield 53	com/g/a/b/a/a/d:a	Lcom/g/a/b/a/a/h;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +11 -> 28
    //   20: aload 4
    //   22: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   25: ldc -35
    //   27: areturn
    //   28: new 223	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 224	java/lang/StringBuilder:<init>	()V
    //   35: astore 5
    //   37: aload 5
    //   39: bipush 91
    //   41: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_1
    //   46: getfield 71	com/g/a/b/a/a/h:a	Ljava/lang/Object;
    //   49: astore_3
    //   50: aload_3
    //   51: astore_2
    //   52: aload_3
    //   53: aload_0
    //   54: if_acmpne +6 -> 60
    //   57: ldc -26
    //   59: astore_2
    //   60: aload 5
    //   62: aload_2
    //   63: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_1
    //   68: getfield 57	com/g/a/b/a/a/h:c	Lcom/g/a/b/a/a/h;
    //   71: astore_1
    //   72: aload_1
    //   73: ifnonnull +21 -> 94
    //   76: aload 5
    //   78: bipush 93
    //   80: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   83: invokevirtual 235	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: astore_1
    //   87: aload 4
    //   89: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   92: aload_1
    //   93: areturn
    //   94: aload 5
    //   96: bipush 44
    //   98: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   101: bipush 32
    //   103: invokevirtual 228	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: goto -62 -> 45
    //   110: astore_1
    //   111: aload 4
    //   113: invokevirtual 92	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   116: aload_1
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	d
    //   15	78	1	localObject1	Object
    //   110	7	1	localObject2	Object
    //   51	12	2	localObject3	Object
    //   49	4	3	localObject4	Object
    //   4	108	4	localReentrantLock	ReentrantLock
    //   35	60	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   11	16	110	finally
    //   28	45	110	finally
    //   45	50	110	finally
    //   60	72	110	finally
    //   76	87	110	finally
    //   94	107	110	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */