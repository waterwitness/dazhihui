package com.alipay.b.b.a.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class x
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.a.getAndIncrement());
    paramRunnable.setPriority(4);
    return paramRunnable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */