package org.apache.http.pool;

public abstract interface PoolEntryCallback<T, C>
{
  public abstract void process(PoolEntry<T, C> paramPoolEntry);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\PoolEntryCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */