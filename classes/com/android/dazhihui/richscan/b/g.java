package com.android.dazhihui.richscan.b;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g
{
  private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(new i(null));
  private final Activity b;
  private ScheduledFuture<?> c = null;
  
  public g(Activity paramActivity)
  {
    this.b = paramActivity;
    a();
  }
  
  private void cancel()
  {
    if (this.c != null)
    {
      this.c.cancel(true);
      this.c = null;
    }
  }
  
  public void a()
  {
    cancel();
    this.c = this.a.schedule(new f(this.b), 300L, TimeUnit.SECONDS);
  }
  
  public void b()
  {
    cancel();
    this.a.shutdown();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */