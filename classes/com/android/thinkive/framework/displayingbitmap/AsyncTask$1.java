package com.android.thinkive.framework.displayingbitmap;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class AsyncTask$1
  implements ThreadFactory
{
  private final AtomicInteger mCount = new AtomicInteger(1);
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "AsyncTask #" + this.mCount.getAndIncrement());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */