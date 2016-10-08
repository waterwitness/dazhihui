package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.concurrent.FutureCallback;

class AbstractConnPool$2
  extends PoolEntryFuture<E>
{
  AbstractConnPool$2(AbstractConnPool paramAbstractConnPool, Lock paramLock, FutureCallback paramFutureCallback, Object paramObject1, Object paramObject2)
  {
    super(paramLock, paramFutureCallback);
  }
  
  public E getPoolEntry(long paramLong, TimeUnit paramTimeUnit)
  {
    paramTimeUnit = AbstractConnPool.access$000(this.this$0, this.val$route, this.val$state, paramLong, paramTimeUnit, this);
    this.this$0.onLease(paramTimeUnit);
    return paramTimeUnit;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\AbstractConnPool$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */