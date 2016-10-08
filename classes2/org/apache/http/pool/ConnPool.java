package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;

public abstract interface ConnPool<T, E>
{
  public abstract Future<E> lease(T paramT, Object paramObject, FutureCallback<E> paramFutureCallback);
  
  public abstract void release(E paramE, boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\ConnPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */