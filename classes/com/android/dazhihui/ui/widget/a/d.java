package com.android.dazhihui.ui.widget.a;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class d
  extends FutureTask<Result>
{
  d(a parama, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      a.b(this.a, get());
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
      a.b(this.a, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */