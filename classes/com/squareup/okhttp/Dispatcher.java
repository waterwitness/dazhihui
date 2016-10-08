package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class Dispatcher
{
  private final Map<Object, List<Job>> enqueuedJobs = new LinkedHashMap();
  private final ThreadPoolExecutor executorService = new ThreadPoolExecutor(8, 8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  
  /* Error */
  public void cancel(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/squareup/okhttp/Dispatcher:enqueuedJobs	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 45 2 0
    //   12: checkcast 47	java/util/List
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_1
    //   24: invokeinterface 51 1 0
    //   29: astore_1
    //   30: aload_1
    //   31: invokeinterface 57 1 0
    //   36: ifeq -16 -> 20
    //   39: aload_1
    //   40: invokeinterface 61 1 0
    //   45: checkcast 63	com/squareup/okhttp/Job
    //   48: astore_2
    //   49: aload_0
    //   50: getfield 31	com/squareup/okhttp/Dispatcher:executorService	Ljava/util/concurrent/ThreadPoolExecutor;
    //   53: aload_2
    //   54: invokevirtual 66	java/util/concurrent/ThreadPoolExecutor:remove	(Ljava/lang/Runnable;)Z
    //   57: pop
    //   58: goto -28 -> 30
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	Dispatcher
    //   0	66	1	paramObject	Object
    //   48	6	2	localJob	Job
    // Exception table:
    //   from	to	target	type
    //   2	16	61	finally
    //   23	30	61	finally
    //   30	58	61	finally
  }
  
  public void enqueue(OkHttpClient paramOkHttpClient, Request paramRequest, Response.Receiver paramReceiver)
  {
    try
    {
      Job localJob = new Job(this, paramOkHttpClient, paramRequest, paramReceiver);
      paramReceiver = (List)this.enqueuedJobs.get(paramRequest.tag());
      paramOkHttpClient = paramReceiver;
      if (paramReceiver == null)
      {
        paramOkHttpClient = new ArrayList(2);
        this.enqueuedJobs.put(paramRequest.tag(), paramOkHttpClient);
      }
      paramOkHttpClient.add(localJob);
      this.executorService.execute(localJob);
      return;
    }
    finally {}
  }
  
  void finished(Job paramJob)
  {
    try
    {
      List localList = (List)this.enqueuedJobs.get(paramJob.tag());
      if (localList != null) {
        localList.remove(paramJob);
      }
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Dispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */