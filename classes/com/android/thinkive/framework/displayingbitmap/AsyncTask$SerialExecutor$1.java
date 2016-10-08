package com.android.thinkive.framework.displayingbitmap;

class AsyncTask$SerialExecutor$1
  implements Runnable
{
  AsyncTask$SerialExecutor$1(AsyncTask.SerialExecutor paramSerialExecutor, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      this.val$r.run();
      return;
    }
    finally
    {
      this.this$1.scheduleNext();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\AsyncTask$SerialExecutor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */