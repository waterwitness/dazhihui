package org.apache.http.pool;

class AbstractConnPool$3
  implements PoolEntryCallback<T, C>
{
  AbstractConnPool$3(AbstractConnPool paramAbstractConnPool, long paramLong) {}
  
  public void process(PoolEntry<T, C> paramPoolEntry)
  {
    if (paramPoolEntry.getUpdated() <= this.val$deadline) {
      paramPoolEntry.close();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\AbstractConnPool$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */