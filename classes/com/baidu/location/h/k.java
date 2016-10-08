package com.baidu.location.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.location.e.a;
import com.baidu.location.e.u;
import com.baidu.location.e.y;

class k
  extends BroadcastReceiver
{
  private k(i parami) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null) {}
    do
    {
      do
      {
        return;
      } while (!paramIntent.getAction().equals("android.net.wifi.SCAN_RESULTS"));
      i.a = System.currentTimeMillis() / 1000L;
      i.a(this.a);
      u.b().h();
    } while (System.currentTimeMillis() - a.b() > 5000L);
    y.a(a.c(), this.a.j(), a.d(), a.a());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */