package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
public abstract class PoolEntry<T, C>
{
  private final C conn;
  private final long created;
  @GuardedBy("this")
  private long expiry;
  private final String id;
  private final T route;
  private volatile Object state;
  @GuardedBy("this")
  private long updated;
  private final long validUnit;
  
  public PoolEntry(String paramString, T paramT, C paramC)
  {
    this(paramString, paramT, paramC, 0L, TimeUnit.MILLISECONDS);
  }
  
  public PoolEntry(String paramString, T paramT, C paramC, long paramLong, TimeUnit paramTimeUnit)
  {
    Args.notNull(paramT, "Route");
    Args.notNull(paramC, "Connection");
    Args.notNull(paramTimeUnit, "Time unit");
    this.id = paramString;
    this.route = paramT;
    this.conn = paramC;
    this.created = System.currentTimeMillis();
    if (paramLong > 0L) {}
    for (this.validUnit = (this.created + paramTimeUnit.toMillis(paramLong));; this.validUnit = Long.MAX_VALUE)
    {
      this.expiry = this.validUnit;
      return;
    }
  }
  
  public abstract void close();
  
  public C getConnection()
  {
    return (C)this.conn;
  }
  
  public long getCreated()
  {
    return this.created;
  }
  
  public long getExpiry()
  {
    try
    {
      long l = this.expiry;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public T getRoute()
  {
    return (T)this.route;
  }
  
  public Object getState()
  {
    return this.state;
  }
  
  public long getUpdated()
  {
    try
    {
      long l = this.updated;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getValidUnit()
  {
    return this.validUnit;
  }
  
  public abstract boolean isClosed();
  
  /* Error */
  public boolean isExpired(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 73	org/apache/http/pool/PoolEntry:expiry	J
    //   6: lstore 4
    //   8: lload_1
    //   9: lload 4
    //   11: lcmp
    //   12: iflt +11 -> 23
    //   15: iconst_1
    //   16: istore 6
    //   18: aload_0
    //   19: monitorexit
    //   20: iload 6
    //   22: ireturn
    //   23: iconst_0
    //   24: istore 6
    //   26: goto -8 -> 18
    //   29: astore_3
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_3
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	PoolEntry
    //   0	34	1	paramLong	long
    //   29	4	3	localObject	Object
    //   6	4	4	l	long
    //   16	9	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	29	finally
  }
  
  public void setState(Object paramObject)
  {
    this.state = paramObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[id:");
    localStringBuilder.append(this.id);
    localStringBuilder.append("][route:");
    localStringBuilder.append(this.route);
    localStringBuilder.append("][state:");
    localStringBuilder.append(this.state);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  /* Error */
  public void updateExpiry(long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: ldc 51
    //   5: invokestatic 47	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: invokestatic 63	java/lang/System:currentTimeMillis	()J
    //   13: putfield 92	org/apache/http/pool/PoolEntry:updated	J
    //   16: lload_1
    //   17: lconst_0
    //   18: lcmp
    //   19: ifle +29 -> 48
    //   22: aload_0
    //   23: getfield 92	org/apache/http/pool/PoolEntry:updated	J
    //   26: aload_3
    //   27: lload_1
    //   28: invokevirtual 69	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   31: ladd
    //   32: lstore_1
    //   33: aload_0
    //   34: lload_1
    //   35: aload_0
    //   36: getfield 71	org/apache/http/pool/PoolEntry:validUnit	J
    //   39: invokestatic 128	java/lang/Math:min	(JJ)J
    //   42: putfield 73	org/apache/http/pool/PoolEntry:expiry	J
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: ldc2_w 74
    //   51: lstore_1
    //   52: goto -19 -> 33
    //   55: astore_3
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_3
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	PoolEntry
    //   0	60	1	paramLong	long
    //   0	60	3	paramTimeUnit	TimeUnit
    // Exception table:
    //   from	to	target	type
    //   2	16	55	finally
    //   22	33	55	finally
    //   33	45	55	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\PoolEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */