package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

class ExecutorDelivery$1
  implements Executor
{
  ExecutorDelivery$1(ExecutorDelivery paramExecutorDelivery, Handler paramHandler) {}
  
  public void execute(Runnable paramRunnable)
  {
    this.val$handler.post(paramRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\ExecutorDelivery$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */