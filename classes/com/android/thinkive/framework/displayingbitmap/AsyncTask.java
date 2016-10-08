package com.android.thinkive.framework.displayingbitmap;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask<Params, Progress, Result>
{
  private static final int CORE_POOL_SIZE = 5;
  public static final Executor DUAL_THREAD_EXECUTOR;
  private static final int KEEP_ALIVE = 1;
  private static final String LOG_TAG = "AsyncTask";
  private static final int MAXIMUM_POOL_SIZE = 128;
  private static final int MESSAGE_POST_PROGRESS = 2;
  private static final int MESSAGE_POST_RESULT = 1;
  public static final Executor SERIAL_EXECUTOR;
  public static final Executor THREAD_POOL_EXECUTOR;
  private static volatile Executor sDefaultExecutor;
  private static final AsyncTask.InternalHandler sHandler;
  private static final BlockingQueue<Runnable> sPoolWorkQueue;
  private static final ThreadFactory sThreadFactory = new AsyncTask.1();
  private final AtomicBoolean mCancelled = new AtomicBoolean();
  private final FutureTask<Result> mFuture = new AsyncTask.3(this, this.mWorker);
  private volatile AsyncTask.Status mStatus = AsyncTask.Status.PENDING;
  private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
  private final AsyncTask.WorkerRunnable<Params, Result> mWorker = new AsyncTask.2(this);
  
  static
  {
    sPoolWorkQueue = new LinkedBlockingQueue(10);
    THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
    if (Utils.hasHoneycomb()) {}
    for (Object localObject = new AsyncTask.SerialExecutor(null);; localObject = Executors.newSingleThreadExecutor(sThreadFactory))
    {
      SERIAL_EXECUTOR = (Executor)localObject;
      DUAL_THREAD_EXECUTOR = Executors.newFixedThreadPool(2, sThreadFactory);
      sHandler = new AsyncTask.InternalHandler(null);
      sDefaultExecutor = SERIAL_EXECUTOR;
      return;
    }
  }
  
  public static void execute(Runnable paramRunnable)
  {
    sDefaultExecutor.execute(paramRunnable);
  }
  
  private void finish(Result paramResult)
  {
    if (isCancelled()) {
      onCancelled(paramResult);
    }
    for (;;)
    {
      this.mStatus = AsyncTask.Status.FINISHED;
      return;
      onPostExecute(paramResult);
    }
  }
  
  public static void init()
  {
    sHandler.getLooper();
  }
  
  private Result postResult(Result paramResult)
  {
    sHandler.obtainMessage(1, new AsyncTask.AsyncTaskResult(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  private void postResultIfNotInvoked(Result paramResult)
  {
    if (!this.mTaskInvoked.get()) {
      postResult(paramResult);
    }
  }
  
  public static void setDefaultExecutor(Executor paramExecutor)
  {
    sDefaultExecutor = paramExecutor;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    this.mCancelled.set(true);
    return this.mFuture.cancel(paramBoolean);
  }
  
  protected abstract Result doInBackground(Params... paramVarArgs);
  
  public final AsyncTask<Params, Progress, Result> execute(Params... paramVarArgs)
  {
    return executeOnExecutor(sDefaultExecutor, paramVarArgs);
  }
  
  public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.mStatus != AsyncTask.Status.PENDING) {}
    switch (this.mStatus)
    {
    default: 
      this.mStatus = AsyncTask.Status.RUNNING;
      onPreExecute();
      this.mWorker.mParams = paramVarArgs;
      paramExecutor.execute(this.mFuture);
      return this;
    case PENDING: 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }
  
  public final Result get()
  {
    return (Result)this.mFuture.get();
  }
  
  public final Result get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (Result)this.mFuture.get(paramLong, paramTimeUnit);
  }
  
  public final AsyncTask.Status getStatus()
  {
    return this.mStatus;
  }
  
  public final boolean isCancelled()
  {
    return this.mCancelled.get();
  }
  
  protected void onCancelled() {}
  
  protected void onCancelled(Result paramResult)
  {
    onCancelled();
  }
  
  protected void onPostExecute(Result paramResult) {}
  
  protected void onPreExecute() {}
  
  protected void onProgressUpdate(Progress... paramVarArgs) {}
  
  protected final void publishProgress(Progress... paramVarArgs)
  {
    if (!isCancelled()) {
      sHandler.obtainMessage(2, new AsyncTask.AsyncTaskResult(this, paramVarArgs)).sendToTarget();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */