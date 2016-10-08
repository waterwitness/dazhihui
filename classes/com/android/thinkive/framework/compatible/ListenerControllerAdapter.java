package com.android.thinkive.framework.compatible;

import android.content.Context;

public abstract class ListenerControllerAdapter
  implements ListenerController
{
  private Context context = null;
  private TaskScheduler scheduler = null;
  
  public Context getContext()
  {
    return this.context;
  }
  
  public TaskScheduler getTaskScheduler()
  {
    return this.scheduler;
  }
  
  public void setContext(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public void setTaskScheduler(TaskScheduler paramTaskScheduler)
  {
    this.scheduler = paramTaskScheduler;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\ListenerControllerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */