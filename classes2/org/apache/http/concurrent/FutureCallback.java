package org.apache.http.concurrent;

public abstract interface FutureCallback<T>
{
  public abstract void cancelled();
  
  public abstract void completed(T paramT);
  
  public abstract void failed(Exception paramException);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\concurrent\FutureCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */