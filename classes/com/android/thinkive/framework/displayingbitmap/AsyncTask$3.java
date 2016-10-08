package com.android.thinkive.framework.displayingbitmap;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class AsyncTask$3
  extends FutureTask<Result>
{
  AsyncTask$3(AsyncTask paramAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      AsyncTask.access$3(this.this$0, get());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.w("AsyncTask", localInterruptedException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      throw new RuntimeException("An error occured while executing doInBackground()", localExecutionException.getCause());
    }
    catch (CancellationException localCancellationException)
    {
      AsyncTask.access$3(this.this$0, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */