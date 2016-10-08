package com.android.thinkive.framework.displayingbitmap;

import android.annotation.TargetApi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@TargetApi(11)
class AsyncTask$SerialExecutor
  implements Executor
{
  Runnable mActive;
  final ArrayDeque<Runnable> mTasks = new ArrayDeque();
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      this.mTasks.offer(new AsyncTask.SerialExecutor.1(this, paramRunnable));
      if (this.mActive == null) {
        scheduleNext();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  protected void scheduleNext()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.mTasks.poll();
      this.mActive = localRunnable;
      if (localRunnable != null) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(this.mActive);
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$SerialExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */