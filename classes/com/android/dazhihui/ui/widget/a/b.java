package com.android.dazhihui.ui.widget.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class b
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, " xyf_ AsyncTask #" + this.a.getAndIncrement());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */