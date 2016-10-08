package com.baidu.location.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class e$a
  extends BroadcastReceiver
{
  public e$a(e parame) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    int j;
    for (;;)
    {
      int i;
      try
      {
        if (!paramContext.equals("android.intent.action.BATTERY_CHANGED")) {
          return;
        }
        e.a(this.a, false);
        i = paramIntent.getIntExtra("status", 0);
        j = paramIntent.getIntExtra("plugged", 0);
        int k = paramIntent.getIntExtra("level", -1);
        int m = paramIntent.getIntExtra("scale", -1);
        if ((k > 0) && (m > 0))
        {
          e.a(this.a, k * 100 / m);
          break label188;
          e.a(this.a, null);
          break;
        }
        else
        {
          e.a(this.a, -1);
        }
      }
      catch (Exception paramContext)
      {
        e.a(this.a, null);
        return;
      }
      e.a(this.a, "4");
      break;
      e.a(this.a, "3");
      break;
      e.a(this.a, "6");
      e.a(this.a, true);
      return;
      e.a(this.a, "5");
      e.a(this.a, true);
      return;
      label188:
      switch (i)
      {
      }
    }
    switch (j)
    {
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */