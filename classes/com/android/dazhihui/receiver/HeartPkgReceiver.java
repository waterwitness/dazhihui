package com.android.dazhihui.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.ui.a.m;

public class HeartPkgReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, HeartPkgReceiver.class), 0);
    paramIntent.set(0, System.currentTimeMillis() + 60000L, paramContext);
    m.a().G();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\receiver\HeartPkgReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */