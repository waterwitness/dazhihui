package com.android.dazhihui.richscan.b;

import java.util.concurrent.ThreadFactory;

final class i
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    paramRunnable.setDaemon(true);
    return paramRunnable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */