package com.tencent.open.utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

class ThreadManager$SerialExecutor
  implements Executor
{
  final Queue<Runnable> a = new LinkedList();
  Runnable b;
  
  protected void a()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null) {
        ThreadManager.NETWORK_EXECUTOR.execute(this.b);
      }
      return;
    }
    finally {}
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      this.a.offer(new ThreadManager.SerialExecutor.1(this, paramRunnable));
      if (this.b == null) {
        a();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\ThreadManager$SerialExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */