package com.d.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class ac
  implements ThreadFactory
{
  private final ThreadGroup a;
  private final AtomicInteger b = new AtomicInteger(1);
  private final String c;
  
  ac(String paramString)
  {
    Object localObject = System.getSecurityManager();
    if (localObject != null) {}
    for (localObject = ((SecurityManager)localObject).getThreadGroup();; localObject = Thread.currentThread().getThreadGroup())
    {
      this.a = ((ThreadGroup)localObject);
      this.c = paramString;
      return;
    }
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(this.a, paramRunnable, this.c + this.b.getAndIncrement(), 0L);
    if (paramRunnable.isDaemon()) {
      paramRunnable.setDaemon(false);
    }
    if (paramRunnable.getPriority() != 5) {
      paramRunnable.setPriority(5);
    }
    return paramRunnable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */