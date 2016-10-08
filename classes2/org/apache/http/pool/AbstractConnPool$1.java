package org.apache.http.pool;

class AbstractConnPool$1
  extends RouteSpecificPool<T, C, E>
{
  AbstractConnPool$1(AbstractConnPool paramAbstractConnPool, Object paramObject1, Object paramObject2)
  {
    super(paramObject1);
  }
  
  protected E createEntry(C paramC)
  {
    return this.this$0.createEntry(this.val$route, paramC);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\pool\AbstractConnPool$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */