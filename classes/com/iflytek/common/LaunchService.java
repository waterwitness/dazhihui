package com.iflytek.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Process;
import com.iflytek.thirdparty.aE;
import com.iflytek.thirdparty.aF;
import com.iflytek.thirdparty.aM;

public class LaunchService
  extends Service
{
  private aF a;
  private long b = 0L;
  private BroadcastReceiver c = new b(this);
  
  private void a()
  {
    try
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction(getPackageName() + "_LAUNCH_ALARM_LAUNCH");
      registerReceiver(this.c, localIntentFilter);
      return;
    }
    catch (Exception localException)
    {
      aM.b("LaunchService", "", localException);
    }
  }
  
  private void b()
  {
    label190:
    for (;;)
    {
      try
      {
        long l1 = this.a.c();
        long l2 = l1 + System.currentTimeMillis();
        long l3 = l2 - this.b;
        if ((l3 > 0L) && (l3 < l1))
        {
          aM.a(this, "reg next alarm too short:" + l3);
          return;
        }
        try
        {
          AlarmManager localAlarmManager = (AlarmManager)getSystemService("alarm");
          Object localObject2 = new Intent(getPackageName() + "_LAUNCH_ALARM_LAUNCH");
          localObject2 = PendingIntent.getBroadcast(getApplicationContext(), 0, (Intent)localObject2, 134217728);
          if (l1 <= 0L) {
            break label190;
          }
          this.b = l2;
          localAlarmManager.cancel((PendingIntent)localObject2);
          localAlarmManager.set(0, this.b, (PendingIntent)localObject2);
          aM.a(this, "reg next alarm: " + aM.a(this.b));
        }
        catch (Exception localException)
        {
          aM.b("LaunchService", "", localException);
        }
        continue;
        aM.a(this, "not reg alarm,periodrun = 0.");
      }
      finally {}
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    aM.a(this, "LaunchService onCreate pid=" + Process.myTid());
    this.a = aF.a(getApplicationContext());
    a();
    aE.a(this);
    b();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    aM.a(this, "LaunchService onDestroy");
    try
    {
      unregisterReceiver(this.c);
      return;
    }
    catch (Exception localException)
    {
      aM.b("LaunchService", "", localException);
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    super.onStart(paramIntent, paramInt);
    aM.a(this, "LaunchService onStart lastalarm=" + this.b + " periodrun=" + this.a.c());
    if ((this.b == 0L) && (this.a.c() > 0L)) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\common\LaunchService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */