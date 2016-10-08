package com.android.thinkive.framework.compatible;

import android.os.Handler;
import java.util.concurrent.Future;

public class TaskScheduler
{
  private Handler mHandler = null;
  int sTaskSerialNo = 0;
  
  public TaskScheduler(Handler paramHandler)
  {
    this.mHandler = paramHandler;
  }
  
  public Future<Integer> start(CallBack.SchedulerCallBack paramSchedulerCallBack)
  {
    try
    {
      Handler localHandler = this.mHandler;
      int i = this.sTaskSerialNo + 1;
      this.sTaskSerialNo = i;
      paramSchedulerCallBack.handler(new MessageAction(localHandler, i));
      return null;
    }
    finally
    {
      paramSchedulerCallBack = finally;
      throw paramSchedulerCallBack;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\TaskScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */