package com.android.dazhihui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.service.DzhService;

public class WakeUpServiceReciver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getAction();
    if ((paramIntent != null) && (DzhPushService.C.equals(paramIntent)))
    {
      DzhPushService.a(paramContext);
      return;
    }
    DzhService.a(paramContext);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\receiver\WakeUpServiceReciver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */