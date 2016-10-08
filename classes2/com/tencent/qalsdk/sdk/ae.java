package com.tencent.qalsdk.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ae<E>
  extends AbstractQueue<E>
  implements Serializable
{
  private static final long d = -387911632671998426L;
  transient ae.d<E> a;
  transient ae.d<E> b;
  final ReentrantLock c = new ReentrantLock();
  private transient int e;
  private final int f;
  private final Condition g = this.c.newCondition();
  private final Condition h = this.c.newCondition();
  
  public ae()
  {
    this(Integer.MAX_VALUE);
  }
  
  public ae(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException();
    }
    this.f = paramInt;
  }
  
  public ae(Collection<? extends E> paramCollection)
  {
    this(Integer.MAX_VALUE);
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    Object localObject;
    do
    {
      try
      {
        paramCollection = paramCollection.iterator();
        if (!paramCollection.hasNext()) {
          break;
        }
        localObject = paramCollection.next();
        if (localObject == null) {
          throw new NullPointerException();
        }
      }
      finally
      {
        localReentrantLock.unlock();
      }
    } while (c(new ae.d(localObject)));
    throw new IllegalStateException("Deque full");
    localReentrantLock.unlock();
  }
  
  private void a(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.e = 0;
    this.a = null;
    this.b = null;
    for (;;)
    {
      Object localObject = paramObjectInputStream.readObject();
      if (localObject == null) {
        return;
      }
      add(localObject);
    }
  }
  
  private void a(ObjectOutputStream paramObjectOutputStream)
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      paramObjectOutputStream.defaultWriteObject();
      for (ae.d locald = this.a; locald != null; locald = locald.c) {
        paramObjectOutputStream.writeObject(locald.a);
      }
      paramObjectOutputStream.writeObject(null);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  private boolean b(ae.d<E> paramd)
  {
    if (this.e >= this.f) {
      return false;
    }
    ae.d locald = this.a;
    paramd.c = locald;
    this.a = paramd;
    if (this.b == null) {
      this.b = paramd;
    }
    for (;;)
    {
      this.e += 1;
      this.g.signal();
      return true;
      locald.b = paramd;
    }
  }
  
  private boolean c(ae.d<E> paramd)
  {
    if (this.e >= this.f) {
      return false;
    }
    ae.d locald = this.b;
    paramd.b = locald;
    this.b = paramd;
    if (this.a == null) {
      this.a = paramd;
    }
    for (;;)
    {
      this.e += 1;
      this.g.signal();
      return true;
      locald.c = paramd;
    }
  }
  
  private E o()
  {
    ae.d locald1 = this.a;
    if (locald1 == null) {
      return null;
    }
    ae.d locald2 = locald1.c;
    Object localObject = locald1.a;
    locald1.a = null;
    locald1.c = locald1;
    this.a = locald2;
    if (locald2 == null) {
      this.b = null;
    }
    for (;;)
    {
      this.e -= 1;
      this.h.signal();
      return (E)localObject;
      locald2.b = null;
    }
  }
  
  private E p()
  {
    ae.d locald1 = this.b;
    if (locald1 == null) {
      return null;
    }
    ae.d locald2 = locald1.b;
    Object localObject = locald1.a;
    locald1.a = null;
    locald1.b = locald1;
    this.b = locald2;
    if (locald2 == null) {
      this.a = null;
    }
    for (;;)
    {
      this.e -= 1;
      this.h.signal();
      return (E)localObject;
      locald2.c = null;
    }
  }
  
  public int a(Collection<? super E> paramCollection)
  {
    return a(paramCollection, Integer.MAX_VALUE);
  }
  
  public int a(Collection<? super E> paramCollection, int paramInt)
  {
    int i = 0;
    if (paramCollection == null) {
      throw new NullPointerException();
    }
    if (paramCollection == this) {
      throw new IllegalArgumentException();
    }
    if (paramInt <= 0) {
      return 0;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int j = Math.min(paramInt, this.e);
      paramInt = i;
      while (paramInt < j)
      {
        paramCollection.add(this.a.a);
        o();
        paramInt += 1;
      }
      return j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E a()
  {
    Object localObject = c();
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
        localObject1 = o();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.g.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  void a(ae.d<E> paramd)
  {
    ae.d locald1 = paramd.b;
    ae.d locald2 = paramd.c;
    if (locald1 == null)
    {
      o();
      return;
    }
    if (locald2 == null)
    {
      p();
      return;
    }
    locald1.c = locald2;
    locald2.b = locald1;
    paramd.a = null;
    this.e -= 1;
    this.h.signal();
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
    paramE = new ae.d(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = b(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.h.awaitNanos(paramLong);
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
    b(paramE);
    return true;
  }
  
  public E b()
  {
    Object localObject = d();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public E b(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.c;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = p();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.g.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public void b(E paramE)
  {
    if (!d(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public boolean b(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new ae.d(paramE);
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
        paramLong = this.h.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public E c()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = o();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E c(long paramLong, TimeUnit paramTimeUnit)
  {
    return (E)a(paramLong, paramTimeUnit);
  }
  
  public boolean c(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    ae.d locald = new ae.d(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = b(locald);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public boolean c(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    return b(paramE, paramLong, paramTimeUnit);
  }
  
  public void clear()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      ae.d locald;
      for (Object localObject1 = this.a; localObject1 != null; localObject1 = locald)
      {
        ((ae.d)localObject1).a = null;
        locald = ((ae.d)localObject1).c;
        ((ae.d)localObject1).b = null;
        ((ae.d)localObject1).c = null;
      }
      this.b = null;
      this.a = null;
      this.e = 0;
      this.h.signalAll();
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
      for (ae.d locald = this.a; locald != null; locald = locald.c)
      {
        boolean bool = paramObject.equals(locald.a);
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
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = p();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public boolean d(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    ae.d locald = new ae.d(paramE);
    paramE = this.c;
    paramE.lock();
    try
    {
      boolean bool = c(locald);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public E e()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = o();
        if (localObject != null) {
          break;
        }
        this.g.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  /* Error */
  public void e(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 72	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 73	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 78	com/tencent/qalsdk/sdk/ae$d
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 81	com/tencent/qalsdk/sdk/ae$d:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 37	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 180	com/tencent/qalsdk/sdk/ae:b	(Lcom/tencent/qalsdk/sdk/ae$d;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 45	com/tencent/qalsdk/sdk/ae:h	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 205 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	ae
    //   0	62	1	paramE	E
    //   20	12	2	locald	ae.d
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public E element()
  {
    return (E)g();
  }
  
  public E f()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = p();
        if (localObject != null) {
          break;
        }
        this.g.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  /* Error */
  public void f(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 72	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 73	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 78	com/tencent/qalsdk/sdk/ae$d
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 81	com/tencent/qalsdk/sdk/ae$d:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 37	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 84	com/tencent/qalsdk/sdk/ae:c	(Lcom/tencent/qalsdk/sdk/ae$d;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 45	com/tencent/qalsdk/sdk/ae:h	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 205 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	ae
    //   0	62	1	paramE	E
    //   20	12	2	locald	ae.d
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public E g()
  {
    Object localObject = i();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean g(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (ae.d locald = this.a; locald != null; locald = locald.c) {
        if (paramObject.equals(locald.a))
        {
          a(locald);
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
  
  public E h()
  {
    Object localObject = j();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean h(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      for (ae.d locald = this.b; locald != null; locald = locald.b) {
        if (paramObject.equals(locald.a))
        {
          a(locald);
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
  
  /* Error */
  public E i()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 103	com/tencent/qalsdk/sdk/ae:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 103	com/tencent/qalsdk/sdk/ae:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   30: getfield 121	com/tencent/qalsdk/sdk/ae$d:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	ae
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public void i(E paramE)
  {
    f(paramE);
  }
  
  public Iterator<E> iterator()
  {
    return new ae.c(this, null);
  }
  
  /* Error */
  public E j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 105	com/tencent/qalsdk/sdk/ae:b	Lcom/tencent/qalsdk/sdk/ae$d;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 105	com/tencent/qalsdk/sdk/ae:b	Lcom/tencent/qalsdk/sdk/ae$d;
    //   30: getfield 121	com/tencent/qalsdk/sdk/ae$d:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	ae
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public void j(E paramE)
  {
    a(paramE);
  }
  
  public E k()
  {
    return (E)e();
  }
  
  public int l()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.f;
      int j = this.e;
      return i - j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E m()
  {
    return (E)a();
  }
  
  public Iterator<E> n()
  {
    return new ae.b(this, null);
  }
  
  public boolean offer(E paramE)
  {
    return d(paramE);
  }
  
  public E peek()
  {
    return (E)i();
  }
  
  public E poll()
  {
    return (E)c();
  }
  
  public E remove()
  {
    return (E)a();
  }
  
  public boolean remove(Object paramObject)
  {
    return g(paramObject);
  }
  
  public int size()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      int i = this.e;
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public Object[] toArray()
  {
    ReentrantLock localReentrantLock = this.c;
    localReentrantLock.lock();
    try
    {
      Object[] arrayOfObject = new Object[this.e];
      int i = 0;
      ae.d locald = this.a;
      while (locald != null)
      {
        arrayOfObject[i] = locald.a;
        locald = locald.c;
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
      if (paramArrayOfT.length < this.e) {
        localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.e);
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
    //   1: getfield 37	com/tencent/qalsdk/sdk/ae:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   11: aload_0
    //   12: getfield 103	com/tencent/qalsdk/sdk/ae:a	Lcom/tencent/qalsdk/sdk/ae$d;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: aload 4
    //   22: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   25: ldc_w 270
    //   28: areturn
    //   29: new 272	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 273	java/lang/StringBuilder:<init>	()V
    //   36: astore 5
    //   38: aload 5
    //   40: bipush 91
    //   42: invokevirtual 277	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_1
    //   47: getfield 121	com/tencent/qalsdk/sdk/ae$d:a	Ljava/lang/Object;
    //   50: astore_3
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: aload_0
    //   55: if_acmpne +7 -> 62
    //   58: ldc_w 279
    //   61: astore_2
    //   62: aload 5
    //   64: aload_2
    //   65: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_1
    //   70: getfield 126	com/tencent/qalsdk/sdk/ae$d:c	Lcom/tencent/qalsdk/sdk/ae$d;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnonnull +21 -> 96
    //   78: aload 5
    //   80: bipush 93
    //   82: invokevirtual 277	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   85: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: astore_1
    //   89: aload 4
    //   91: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   94: aload_1
    //   95: areturn
    //   96: aload 5
    //   98: bipush 44
    //   100: invokevirtual 277	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   103: bipush 32
    //   105: invokevirtual 277	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: goto -63 -> 46
    //   112: astore_1
    //   113: aload 4
    //   115: invokevirtual 76	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	ae
    //   15	80	1	localObject1	Object
    //   112	7	1	localObject2	Object
    //   52	13	2	localObject3	Object
    //   50	4	3	localObject4	Object
    //   4	110	4	localReentrantLock	ReentrantLock
    //   36	61	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   11	16	112	finally
    //   29	46	112	finally
    //   46	51	112	finally
    //   62	74	112	finally
    //   78	89	112	finally
    //   96	109	112	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */