package com.tencent.beacon.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class a
  implements Runnable
{
  private final Context a;
  private final ActivityManager b;
  private final String c;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((ActivityManager)this.a.getSystemService("activity"));
    this.c = b.e(this.a);
  }
  
  public final void run()
  {
    com.tencent.beacon.e.b.a("Activity Monitor Task was started.", new Object[0]);
    int i = 0;
    for (;;)
    {
      int j = i + 1;
      if (i >= 10) {
        break;
      }
      Iterator localIterator = this.b.getRunningTasks(Integer.MAX_VALUE).iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)localIterator.next();
        if (localRunningTaskInfo.topActivity.getPackageName().equals(this.c))
        {
          b.b = true;
          com.tencent.beacon.e.b.a("Found activity %s.", new Object[] { localRunningTaskInfo.topActivity.getClassName() });
          com.tencent.beacon.e.b.a("Activity Monitor Task was exited.", new Object[0]);
          return;
        }
      }
      try
      {
        Thread.sleep(1000L);
        i = j;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        i = j;
      }
    }
    com.tencent.beacon.e.b.a("Activity Monitor Task was exited.", new Object[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */