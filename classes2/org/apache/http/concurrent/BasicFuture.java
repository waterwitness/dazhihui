package org.apache.http.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

public class BasicFuture<T>
  implements Future<T>, Cancellable
{
  private final FutureCallback<T> callback;
  private volatile boolean cancelled;
  private volatile boolean completed;
  private volatile Exception ex;
  private volatile T result;
  
  public BasicFuture(FutureCallback<T> paramFutureCallback)
  {
    this.callback = paramFutureCallback;
  }
  
  private T getResult()
  {
    if (this.ex != null) {
      throw new ExecutionException(this.ex);
    }
    return (T)this.result;
  }
  
  public boolean cancel()
  {
    return cancel(true);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    try
    {
      if (this.completed) {
        return false;
      }
      this.completed = true;
      this.cancelled = true;
      notifyAll();
      if (this.callback != null)
      {
        this.callback.cancelled();
        return true;
      }
    }
    finally {}
    return true;
  }
  
  public boolean completed(T paramT)
  {
    try
    {
      if (this.completed) {
        return false;
      }
      this.completed = true;
      this.result = paramT;
      notifyAll();
      if (this.callback != null)
      {
        this.callback.completed(paramT);
        return true;
      }
    }
    finally {}
    return true;
  }
  
  public boolean failed(Exception paramException)
  {
    try
    {
      if (this.completed) {
        return false;
      }
      this.completed = true;
      this.ex = paramException;
      notifyAll();
      if (this.callback != null)
      {
        this.callback.failed(paramException);
        return true;
      }
    }
    finally {}
    return true;
  }
  
  public T get()
  {
    try
    {
      while (!this.completed) {
        wait();
      }
      localObject2 = getResult();
    }
    finally {}
    Object localObject2;
    return (T)localObject2;
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l2;
    try
    {
      Args.notNull(paramTimeUnit, "Time unit");
      l2 = paramTimeUnit.toMillis(paramLong);
      if (l2 <= 0L) {}
      for (paramLong = 0L; this.completed; paramLong = System.currentTimeMillis())
      {
        paramTimeUnit = getResult();
        return paramTimeUnit;
      }
      if (l2 <= 0L) {
        throw new TimeoutException();
      }
    }
    finally {}
    long l1 = l2;
    long l3;
    do
    {
      wait(l1);
      if (this.completed)
      {
        paramTimeUnit = getResult();
        break;
      }
      l3 = l2 - (System.currentTimeMillis() - paramLong);
      l1 = l3;
    } while (l3 > 0L);
    throw new TimeoutException();
  }
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public boolean isDone()
  {
    return this.completed;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\concurrent\BasicFuture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */