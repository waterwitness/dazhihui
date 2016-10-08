package com.tencent.imsdk;

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

public class MyLinkedBlockingDeque<E>
  extends AbstractQueue<E>
  implements Serializable
{
  private static final long serialVersionUID = -387911632671998426L;
  private final int capacity;
  private transient int count;
  transient ᵎ<E> first$18f52982;
  transient ᵎ<E> last$18f52982;
  final ReentrantLock lock = new ReentrantLock();
  private final Condition notEmpty = this.lock.newCondition();
  private final Condition notFull = this.lock.newCondition();
  
  public MyLinkedBlockingDeque()
  {
    this(Integer.MAX_VALUE);
  }
  
  public MyLinkedBlockingDeque(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException();
    }
    this.capacity = paramInt;
  }
  
  public MyLinkedBlockingDeque(Collection<? extends E> paramCollection)
  {
    this(Integer.MAX_VALUE);
    ReentrantLock localReentrantLock = this.lock;
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
    } while (linkLast$3d2f4477(new ᵎ(localObject)));
    throw new IllegalStateException("Deque full");
    localReentrantLock.unlock();
  }
  
  private boolean linkFirst$3d2f4477(ᵎ<E> paramᵎ)
  {
    if (this.count >= this.capacity) {
      return false;
    }
    ᵎ localᵎ = this.first$18f52982;
    paramᵎ.c = localᵎ;
    this.first$18f52982 = paramᵎ;
    if (this.last$18f52982 == null) {
      this.last$18f52982 = paramᵎ;
    }
    for (;;)
    {
      this.count += 1;
      this.notEmpty.signal();
      return true;
      localᵎ.b = paramᵎ;
    }
  }
  
  private boolean linkLast$3d2f4477(ᵎ<E> paramᵎ)
  {
    if (this.count >= this.capacity) {
      return false;
    }
    ᵎ localᵎ = this.last$18f52982;
    paramᵎ.b = localᵎ;
    this.last$18f52982 = paramᵎ;
    if (this.first$18f52982 == null) {
      this.first$18f52982 = paramᵎ;
    }
    for (;;)
    {
      this.count += 1;
      this.notEmpty.signal();
      return true;
      localᵎ.c = paramᵎ;
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.count = 0;
    this.first$18f52982 = null;
    this.last$18f52982 = null;
    for (;;)
    {
      Object localObject = paramObjectInputStream.readObject();
      if (localObject == null) {
        break;
      }
      add(localObject);
    }
  }
  
  private E unlinkFirst()
  {
    ᵎ localᵎ1 = this.first$18f52982;
    if (localᵎ1 == null) {
      return null;
    }
    ᵎ localᵎ2 = localᵎ1.c;
    Object localObject = localᵎ1.a;
    localᵎ1.a = null;
    localᵎ1.c = localᵎ1;
    this.first$18f52982 = localᵎ2;
    if (localᵎ2 == null) {
      this.last$18f52982 = null;
    }
    for (;;)
    {
      this.count -= 1;
      this.notFull.signal();
      return (E)localObject;
      localᵎ2.b = null;
    }
  }
  
  private E unlinkLast()
  {
    ᵎ localᵎ1 = this.last$18f52982;
    if (localᵎ1 == null) {
      return null;
    }
    ᵎ localᵎ2 = localᵎ1.b;
    Object localObject = localᵎ1.a;
    localᵎ1.a = null;
    localᵎ1.b = localᵎ1;
    this.last$18f52982 = localᵎ2;
    if (localᵎ2 == null) {
      this.first$18f52982 = null;
    }
    for (;;)
    {
      this.count -= 1;
      this.notFull.signal();
      return (E)localObject;
      localᵎ2.c = null;
    }
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      paramObjectOutputStream.defaultWriteObject();
      for (ᵎ localᵎ = this.first$18f52982; localᵎ != null; localᵎ = localᵎ.c) {
        paramObjectOutputStream.writeObject(localᵎ.a);
      }
      paramObjectOutputStream.writeObject(null);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public boolean add(E paramE)
  {
    addLast(paramE);
    return true;
  }
  
  public void addFirst(E paramE)
  {
    if (!offerFirst(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public void addLast(E paramE)
  {
    if (!offerLast(paramE)) {
      throw new IllegalStateException("Deque full");
    }
  }
  
  public void clear()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      ᵎ localᵎ;
      for (Object localObject1 = this.first$18f52982; localObject1 != null; localObject1 = localᵎ)
      {
        ((ᵎ)localObject1).a = null;
        localᵎ = ((ᵎ)localObject1).c;
        ((ᵎ)localObject1).b = null;
        ((ᵎ)localObject1).c = null;
      }
      this.last$18f52982 = null;
      this.first$18f52982 = null;
      this.count = 0;
      this.notFull.signalAll();
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
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      for (ᵎ localᵎ = this.first$18f52982; localᵎ != null; localᵎ = localᵎ.c)
      {
        boolean bool = paramObject.equals(localᵎ.a);
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
  
  public Iterator<E> descendingIterator()
  {
    return new MyLinkedBlockingDeque.ʼ(this, (byte)0);
  }
  
  public int drainTo(Collection<? super E> paramCollection)
  {
    return drainTo(paramCollection, Integer.MAX_VALUE);
  }
  
  public int drainTo(Collection<? super E> paramCollection, int paramInt)
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
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      int j = Math.min(paramInt, this.count);
      paramInt = i;
      while (paramInt < j)
      {
        paramCollection.add(this.first$18f52982.a);
        unlinkFirst();
        paramInt += 1;
      }
      return j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E element()
  {
    return (E)getFirst();
  }
  
  public E getFirst()
  {
    Object localObject = peekFirst();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public E getLast()
  {
    Object localObject = peekLast();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public Iterator<E> iterator()
  {
    return new MyLinkedBlockingDeque.ʽ(this, (byte)0);
  }
  
  public boolean offer(E paramE)
  {
    return offerLast(paramE);
  }
  
  public boolean offer(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    return offerLast(paramE, paramLong, paramTimeUnit);
  }
  
  public boolean offerFirst(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    ᵎ localᵎ = new ᵎ(paramE);
    paramE = this.lock;
    paramE.lock();
    try
    {
      boolean bool = linkFirst$3d2f4477(localᵎ);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public boolean offerFirst(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new ᵎ(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.lock;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = linkFirst$3d2f4477(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.notFull.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public boolean offerLast(E paramE)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    ᵎ localᵎ = new ᵎ(paramE);
    paramE = this.lock;
    paramE.lock();
    try
    {
      boolean bool = linkLast$3d2f4477(localᵎ);
      return bool;
    }
    finally
    {
      paramE.unlock();
    }
  }
  
  public boolean offerLast(E paramE, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramE == null) {
      throw new NullPointerException();
    }
    paramE = new ᵎ(paramE);
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.lock;
    paramTimeUnit.lockInterruptibly();
    try
    {
      for (;;)
      {
        boolean bool = linkLast$3d2f4477(paramE);
        if (bool) {
          break;
        }
        if (paramLong <= 0L) {
          return false;
        }
        paramLong = this.notFull.awaitNanos(paramLong);
      }
      return true;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public E peek()
  {
    return (E)peekFirst();
  }
  
  /* Error */
  public E peekFirst()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 53	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 98	com/tencent/imsdk/MyLinkedBlockingDeque:first$18f52982	Lcom/tencent/imsdk/ᵎ;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 98	com/tencent/imsdk/MyLinkedBlockingDeque:first$18f52982	Lcom/tencent/imsdk/ᵎ;
    //   30: getfield 130	com/tencent/imsdk/ᵎ:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	MyLinkedBlockingDeque
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  /* Error */
  public E peekLast()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual 53	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   9: aload_0
    //   10: getfield 103	com/tencent/imsdk/MyLinkedBlockingDeque:last$18f52982	Lcom/tencent/imsdk/ᵎ;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore_1
    //   20: aload_2
    //   21: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 103	com/tencent/imsdk/MyLinkedBlockingDeque:last$18f52982	Lcom/tencent/imsdk/ᵎ;
    //   30: getfield 130	com/tencent/imsdk/ᵎ:a	Ljava/lang/Object;
    //   33: astore_1
    //   34: goto -14 -> 20
    //   37: astore_1
    //   38: aload_2
    //   39: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	MyLinkedBlockingDeque
    //   13	21	1	localObject1	Object
    //   37	6	1	localObject2	Object
    //   4	35	2	localReentrantLock	ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   9	14	37	finally
    //   26	34	37	finally
  }
  
  public E poll()
  {
    return (E)pollFirst();
  }
  
  public E poll(long paramLong, TimeUnit paramTimeUnit)
  {
    return (E)pollFirst(paramLong, paramTimeUnit);
  }
  
  public E pollFirst()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = unlinkFirst();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E pollFirst(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.lock;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = unlinkFirst();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.notEmpty.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public E pollLast()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = unlinkLast();
      return (E)localObject1;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E pollLast(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = paramTimeUnit.toNanos(paramLong);
    paramTimeUnit = this.lock;
    paramTimeUnit.lockInterruptibly();
    try
    {
      Object localObject1;
      for (;;)
      {
        localObject1 = unlinkLast();
        if (localObject1 != null) {
          break;
        }
        if (paramLong <= 0L) {
          return null;
        }
        paramLong = this.notEmpty.awaitNanos(paramLong);
      }
      return (E)localObject1;
    }
    finally
    {
      paramTimeUnit.unlock();
    }
  }
  
  public E pop()
  {
    return (E)removeFirst();
  }
  
  public void push(E paramE)
  {
    addFirst(paramE);
  }
  
  public void put(E paramE)
  {
    putLast(paramE);
  }
  
  /* Error */
  public void putFirst(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 71	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 72	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 77	com/tencent/imsdk/ᵎ
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 80	com/tencent/imsdk/ᵎ:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 37	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 53	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 210	com/tencent/imsdk/MyLinkedBlockingDeque:linkFirst$3d2f4477	(Lcom/tencent/imsdk/ᵎ;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 45	com/tencent/imsdk/MyLinkedBlockingDeque:notFull	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 249 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	MyLinkedBlockingDeque
    //   0	62	1	paramE	E
    //   20	12	2	localᵎ	ᵎ
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  /* Error */
  public void putLast(E paramE)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +11 -> 12
    //   4: new 71	java/lang/NullPointerException
    //   7: dup
    //   8: invokespecial 72	java/lang/NullPointerException:<init>	()V
    //   11: athrow
    //   12: new 77	com/tencent/imsdk/ᵎ
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 80	com/tencent/imsdk/ᵎ:<init>	(Ljava/lang/Object;)V
    //   20: astore_2
    //   21: aload_0
    //   22: getfield 37	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 53	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   30: aload_0
    //   31: aload_2
    //   32: invokespecial 84	com/tencent/imsdk/MyLinkedBlockingDeque:linkLast$3d2f4477	(Lcom/tencent/imsdk/ᵎ;)Z
    //   35: ifne +22 -> 57
    //   38: aload_0
    //   39: getfield 45	com/tencent/imsdk/MyLinkedBlockingDeque:notFull	Ljava/util/concurrent/locks/Condition;
    //   42: invokeinterface 249 1 0
    //   47: goto -17 -> 30
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   55: aload_2
    //   56: athrow
    //   57: aload_1
    //   58: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	MyLinkedBlockingDeque
    //   0	62	1	paramE	E
    //   20	12	2	localᵎ	ᵎ
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   30	47	50	finally
  }
  
  public int remainingCapacity()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      int i = this.capacity;
      int j = this.count;
      return i - j;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E remove()
  {
    return (E)removeFirst();
  }
  
  public boolean remove(Object paramObject)
  {
    return removeFirstOccurrence(paramObject);
  }
  
  public E removeFirst()
  {
    Object localObject = pollFirst();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean removeFirstOccurrence(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      for (ᵎ localᵎ = this.first$18f52982; localᵎ != null; localᵎ = localᵎ.c) {
        if (paramObject.equals(localᵎ.a))
        {
          unlink$3d2f4473(localᵎ);
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
  
  public E removeLast()
  {
    Object localObject = pollLast();
    if (localObject == null) {
      throw new NoSuchElementException();
    }
    return (E)localObject;
  }
  
  public boolean removeLastOccurrence(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      for (ᵎ localᵎ = this.last$18f52982; localᵎ != null; localᵎ = localᵎ.b) {
        if (paramObject.equals(localᵎ.a))
        {
          unlink$3d2f4473(localᵎ);
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
  
  public int size()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      int i = this.count;
      return i;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public E take()
  {
    return (E)takeFirst();
  }
  
  public E takeFirst()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = unlinkFirst();
        if (localObject != null) {
          break;
        }
        this.notEmpty.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  public E takeLast()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      for (;;)
      {
        Object localObject = unlinkLast();
        if (localObject != null) {
          break;
        }
        this.notEmpty.await();
      }
    }
    finally
    {
      localReentrantLock.unlock();
    }
    return ?;
  }
  
  public Object[] toArray()
  {
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    try
    {
      Object[] arrayOfObject = new Object[this.count];
      int i = 0;
      ᵎ localᵎ = this.first$18f52982;
      while (localᵎ != null)
      {
        arrayOfObject[i] = localᵎ.a;
        localᵎ = localᵎ.c;
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
    ReentrantLock localReentrantLock = this.lock;
    localReentrantLock.lock();
    Object localObject = paramArrayOfT;
    try
    {
      if (paramArrayOfT.length < this.count) {
        localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.count);
      }
      int i = 0;
      paramArrayOfT = this.first$18f52982;
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
    //   1: getfield 37	com/tencent/imsdk/MyLinkedBlockingDeque:lock	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: astore 4
    //   6: aload 4
    //   8: invokevirtual 53	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   11: aload_0
    //   12: getfield 98	com/tencent/imsdk/MyLinkedBlockingDeque:first$18f52982	Lcom/tencent/imsdk/ᵎ;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: aload 4
    //   22: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   25: ldc_w 294
    //   28: areturn
    //   29: new 296	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   36: astore 5
    //   38: aload 5
    //   40: bipush 91
    //   42: invokevirtual 301	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_1
    //   47: getfield 130	com/tencent/imsdk/ᵎ:a	Ljava/lang/Object;
    //   50: astore_3
    //   51: aload_3
    //   52: astore_2
    //   53: aload_3
    //   54: aload_0
    //   55: if_acmpne +7 -> 62
    //   58: ldc_w 303
    //   61: astore_2
    //   62: aload 5
    //   64: aload_2
    //   65: invokevirtual 306	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_1
    //   70: getfield 101	com/tencent/imsdk/ᵎ:c	Lcom/tencent/imsdk/ᵎ;
    //   73: astore_1
    //   74: aload_1
    //   75: ifnonnull +21 -> 96
    //   78: aload 5
    //   80: bipush 93
    //   82: invokevirtual 301	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   85: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: astore_1
    //   89: aload 4
    //   91: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   94: aload_1
    //   95: areturn
    //   96: aload 5
    //   98: bipush 44
    //   100: invokevirtual 301	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   103: bipush 32
    //   105: invokevirtual 301	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: goto -63 -> 46
    //   112: astore_1
    //   113: aload 4
    //   115: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	MyLinkedBlockingDeque
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
  
  void unlink$3d2f4473(ᵎ<E> paramᵎ)
  {
    ᵎ localᵎ1 = paramᵎ.b;
    ᵎ localᵎ2 = paramᵎ.c;
    if (localᵎ1 == null)
    {
      unlinkFirst();
      return;
    }
    if (localᵎ2 == null)
    {
      unlinkLast();
      return;
    }
    localᵎ1.c = localᵎ2;
    localᵎ2.b = localᵎ1;
    paramᵎ.a = null;
    this.count -= 1;
    this.notFull.signal();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\MyLinkedBlockingDeque.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */