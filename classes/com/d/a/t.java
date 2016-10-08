package com.d.a;

import java.util.concurrent.Semaphore;

class t
  implements Runnable
{
  t(q paramq, Runnable paramRunnable, Semaphore paramSemaphore) {}
  
  public void run()
  {
    this.b.run();
    this.c.release();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */