package com.android.thinkive.framework;

import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManager
{
  private static final String MAX_THREAD_COUNT = "maxThreadCount";
  private static ThreadManager sInstance = null;
  private final int THREAD_FIXED = 5;
  private ExecutorService mExecutorService;
  
  private ThreadManager()
  {
    String str = ConfigManager.getInstance().getSystemConfigValue("maxThreadCount");
    int i = j;
    if (!TextUtils.isEmpty(str))
    {
      i = j;
      if (Integer.parseInt(str) >= 1) {
        i = Integer.parseInt(str);
      }
    }
    this.mExecutorService = Executors.newFixedThreadPool(i);
    Log.d("config max thread count = " + i);
  }
  
  public static ThreadManager getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new ThreadManager();
      }
      ThreadManager localThreadManager = sInstance;
      return localThreadManager;
    }
    finally {}
  }
  
  public void shutdown()
  {
    if (this.mExecutorService != null) {
      this.mExecutorService.shutdownNow();
    }
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  public Future<Integer> submit(Callable<Integer> paramCallable)
  {
    return this.mExecutorService.submit(paramCallable);
  }
  
  public void submit(Runnable paramRunnable)
  {
    if (!this.mExecutorService.isShutdown()) {
      this.mExecutorService.submit(paramRunnable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\ThreadManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */