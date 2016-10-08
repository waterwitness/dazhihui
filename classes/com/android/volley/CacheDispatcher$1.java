package com.android.volley;

import java.util.concurrent.BlockingQueue;

class CacheDispatcher$1
  implements Runnable
{
  CacheDispatcher$1(CacheDispatcher paramCacheDispatcher, Request paramRequest) {}
  
  public void run()
  {
    try
    {
      CacheDispatcher.access$0(this.this$0).put(this.val$request);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\CacheDispatcher$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */