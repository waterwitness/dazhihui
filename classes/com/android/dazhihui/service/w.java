package com.android.dazhihui.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.a.g;

class w
  extends BroadcastReceiver
{
  private w(DzhService paramDzhService) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if ("android.intent.action.SCREEN_ON".equals(paramContext)) {
      g.a().b(true);
    }
    while (!"android.intent.action.SCREEN_OFF".equals(paramContext)) {
      return;
    }
    g.a().b(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */