package com.android.thinkive.framework;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import com.android.thinkive.framework.compatible.TaskScheduler;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

public class CoreApplication
  extends Application
{
  private static CoreApplication sInstance;
  
  public static CoreApplication getInstance()
  {
    return sInstance;
  }
  
  @Deprecated
  public <T> void addToRequestQueue(Request<T> paramRequest)
  {
    ThinkiveInitializer.getInstance().addToRequestQueue(paramRequest);
  }
  
  @Deprecated
  public <T> void addToRequestQueue(Request<T> paramRequest, String paramString)
  {
    ThinkiveInitializer.getInstance().addToRequestQueue(paramRequest, paramString);
  }
  
  @Deprecated
  public void cancelPendingRequests(Object paramObject)
  {
    ThinkiveInitializer.getInstance().cancelPendingRequests(paramObject);
  }
  
  @Deprecated
  public void clearActivityStack()
  {
    ThinkiveInitializer.getInstance().clearActivityStack();
  }
  
  public void exit()
  {
    ThinkiveInitializer.getInstance().exit();
  }
  
  @Deprecated
  public Activity getActivity(String paramString)
  {
    return ThinkiveInitializer.getInstance().getActivity(paramString);
  }
  
  @Deprecated
  public Handler getHandler()
  {
    return ThinkiveInitializer.getInstance().getHandler();
  }
  
  @Deprecated
  public RequestQueue getRequestQueue()
  {
    try
    {
      RequestQueue localRequestQueue = ThinkiveInitializer.getInstance().getRequestQueue();
      return localRequestQueue;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Deprecated
  public TaskScheduler getScheduler()
  {
    return ThinkiveInitializer.getInstance().getScheduler();
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (sInstance == null) {
      sInstance = this;
    }
    ThinkiveInitializer.getInstance().initialze(this);
  }
  
  @Deprecated
  public void popActivity(String paramString)
  {
    ThinkiveInitializer.getInstance().popActivity(paramString);
  }
  
  @Deprecated
  public void pushActivity(String paramString, Activity paramActivity)
  {
    ThinkiveInitializer.getInstance().pushActivity(paramString, paramActivity);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\CoreApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */