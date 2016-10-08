package com.d.a;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class p
{
  Semaphore a = new Semaphore(0);
  
  public void a()
  {
    bn localbn = bn.a(Thread.currentThread());
    p localp = localbn.a;
    localbn.a = this;
    Semaphore localSemaphore = localbn.b;
    try
    {
      boolean bool = this.a.tryAcquire();
      Runnable localRunnable;
      if (bool)
      {
        return;
        localRunnable.run();
      }
      do
      {
        localRunnable = localbn.a();
        if (localRunnable != null) {
          break;
        }
        localSemaphore.acquire(Math.max(1, localSemaphore.availablePermits()));
        bool = this.a.tryAcquire();
      } while (!bool);
      return;
    }
    finally
    {
      localbn.a = localp;
    }
  }
  
  public boolean a(long paramLong, TimeUnit paramTimeUnit)
  {
    paramLong = TimeUnit.MILLISECONDS.convert(paramLong, paramTimeUnit);
    paramTimeUnit = bn.a(Thread.currentThread());
    p localp = paramTimeUnit.a;
    paramTimeUnit.a = this;
    Semaphore localSemaphore = paramTimeUnit.b;
    long l1;
    long l2;
    do
    {
      boolean bool;
      try
      {
        bool = this.a.tryAcquire();
        if (bool) {
          return true;
        }
        l1 = System.currentTimeMillis();
        for (;;)
        {
          Runnable localRunnable = paramTimeUnit.a();
          if (localRunnable == null)
          {
            bool = localSemaphore.tryAcquire(Math.max(1, localSemaphore.availablePermits()), paramLong, TimeUnit.MILLISECONDS);
            if (bool) {
              break;
            }
            return false;
          }
          localRunnable.run();
        }
        bool = this.a.tryAcquire();
      }
      finally
      {
        paramTimeUnit.a = localp;
      }
      if (bool)
      {
        paramTimeUnit.a = localp;
        return true;
      }
      l2 = System.currentTimeMillis();
    } while (l2 - l1 < paramLong);
    paramTimeUnit.a = localp;
    return false;
  }
  
  public void b()
  {
    this.a.release();
    bn.a(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */