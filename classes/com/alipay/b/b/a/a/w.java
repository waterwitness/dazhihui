package com.alipay.b.b.a.a;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class w
  extends FutureTask<ae>
{
  w(v paramv, Callable paramCallable, aa paramaa)
  {
    super(paramCallable);
  }
  
  protected final void done()
  {
    y localy = this.a.a();
    if (localy.f() == null) {
      super.done();
    }
    for (;;)
    {
      return;
      try
      {
        get();
        if ((!isCancelled()) && (!localy.h())) {
          continue;
        }
        localy.g();
        if ((isCancelled()) && (isDone())) {
          continue;
        }
        cancel(false);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        new StringBuilder().append(localInterruptedException);
        return;
      }
      catch (ExecutionException localExecutionException)
      {
        if ((localExecutionException.getCause() != null) && ((localExecutionException.getCause() instanceof a)))
        {
          locala = (a)localExecutionException.getCause();
          locala.a();
          locala.b();
          return;
        }
        new StringBuilder().append(locala);
        return;
      }
      catch (CancellationException localCancellationException)
      {
        a locala;
        locala.g();
        return;
      }
      catch (Throwable localThrowable)
      {
        throw new RuntimeException("An error occured while executing http request", localThrowable);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */