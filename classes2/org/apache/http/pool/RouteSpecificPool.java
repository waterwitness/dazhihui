package org.apache.http.pool;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@NotThreadSafe
abstract class RouteSpecificPool<T, C, E extends PoolEntry<T, C>>
{
  private final LinkedList<E> available;
  private final Set<E> leased;
  private final LinkedList<PoolEntryFuture<E>> pending;
  private final T route;
  
  RouteSpecificPool(T paramT)
  {
    this.route = paramT;
    this.leased = new HashSet();
    this.available = new LinkedList();
    this.pending = new LinkedList();
  }
  
  public E add(C paramC)
  {
    paramC = createEntry(paramC);
    this.leased.add(paramC);
    return paramC;
  }
  
  protected abstract E createEntry(C paramC);
  
  public void free(E paramE, boolean paramBoolean)
  {
    Args.notNull(paramE, "Pool entry");
    Asserts.check(this.leased.remove(paramE), "Entry %s has not been leased from this pool", new Object[] { paramE });
    if (paramBoolean) {
      this.available.addFirst(paramE);
    }
  }
  
  public int getAllocatedCount()
  {
    return this.available.size() + this.leased.size();
  }
  
  public int getAvailableCount()
  {
    return this.available.size();
  }
  
  public E getFree(Object paramObject)
  {
    if (!this.available.isEmpty())
    {
      Object localObject;
      if (paramObject != null)
      {
        localObject = this.available.iterator();
        while (((Iterator)localObject).hasNext())
        {
          PoolEntry localPoolEntry = (PoolEntry)((Iterator)localObject).next();
          if (paramObject.equals(localPoolEntry.getState()))
          {
            ((Iterator)localObject).remove();
            this.leased.add(localPoolEntry);
            return localPoolEntry;
          }
        }
      }
      paramObject = this.available.iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject = (PoolEntry)((Iterator)paramObject).next();
        if (((PoolEntry)localObject).getState() == null)
        {
          ((Iterator)paramObject).remove();
          this.leased.add(localObject);
          return (E)localObject;
        }
      }
    }
    return null;
  }
  
  public E getLastUsed()
  {
    if (!this.available.isEmpty()) {
      return (PoolEntry)this.available.getLast();
    }
    return null;
  }
  
  public int getLeasedCount()
  {
    return this.leased.size();
  }
  
  public int getPendingCount()
  {
    return this.pending.size();
  }
  
  public final T getRoute()
  {
    return (T)this.route;
  }
  
  public PoolEntryFuture<E> nextPending()
  {
    return (PoolEntryFuture)this.pending.poll();
  }
  
  public void queue(PoolEntryFuture<E> paramPoolEntryFuture)
  {
    if (paramPoolEntryFuture == null) {
      return;
    }
    this.pending.add(paramPoolEntryFuture);
  }
  
  public boolean remove(E paramE)
  {
    Args.notNull(paramE, "Pool entry");
    return (this.available.remove(paramE)) || (this.leased.remove(paramE));
  }
  
  public void shutdown()
  {
    Iterator localIterator = this.pending.iterator();
    while (localIterator.hasNext()) {
      ((PoolEntryFuture)localIterator.next()).cancel(true);
    }
    this.pending.clear();
    localIterator = this.available.iterator();
    while (localIterator.hasNext()) {
      ((PoolEntry)localIterator.next()).close();
    }
    this.available.clear();
    localIterator = this.leased.iterator();
    while (localIterator.hasNext()) {
      ((PoolEntry)localIterator.next()).close();
    }
    this.leased.clear();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[route: ");
    localStringBuilder.append(this.route);
    localStringBuilder.append("][leased: ");
    localStringBuilder.append(this.leased.size());
    localStringBuilder.append("][available: ");
    localStringBuilder.append(this.available.size());
    localStringBuilder.append("][pending: ");
    localStringBuilder.append(this.pending.size());
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void unqueue(PoolEntryFuture<E> paramPoolEntryFuture)
  {
    if (paramPoolEntryFuture == null) {
      return;
    }
    this.pending.remove(paramPoolEntryFuture);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\RouteSpecificPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */