package com.tencent.open.utils;

class ThreadManager$SerialExecutor$1
  implements Runnable
{
  ThreadManager$SerialExecutor$1(ThreadManager.SerialExecutor paramSerialExecutor, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      this.a.run();
      return;
    }
    finally
    {
      this.b.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\ThreadManager$SerialExecutor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */