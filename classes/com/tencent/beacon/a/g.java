package com.tencent.beacon.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.tencent.beacon.a.b.c;
import com.tencent.beacon.e.b;
import com.tencent.beacon.event.p;

public final class g
  extends BroadcastReceiver
{
  protected Context a;
  private boolean b = false;
  private Runnable c = new g.1(this);
  private Runnable d = new g.2(this);
  
  public final void a(Context paramContext)
  {
    if (paramContext == null) {
      b.c(" Context is null!", new Object[0]);
    }
    while (this.b) {
      return;
    }
    this.b = true;
    paramContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null) {}
    try
    {
      b.c(" onReceive context is null!", new Object[0]);
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    if (this.a == null) {
      this.a = paramContext;
    }
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localObject == null)
    {
      b.c(" onReceive ConnectivityManager is null!", new Object[0]);
      return;
    }
    paramIntent = ((ConnectivityManager)localObject).getNetworkInfo(1);
    localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getState();
      if (localObject != null)
      {
        localObject = ((NetworkInfo)localObject).getState();
        break label177;
        label88:
        break label176;
        label89:
        paramContext = c.a(paramContext);
        if ((paramContext.a()) || (p.d().j() == 0) || (paramContext.h() == 2)) {
          break label188;
        }
        e.a().a(paramContext.c());
        break label188;
      }
    }
    for (;;)
    {
      if ((NetworkInfo.State.CONNECTED == localObject) || (NetworkInfo.State.CONNECTED == paramIntent))
      {
        e.a().a(this.d);
        e.a().a(this.c);
        return;
        localObject = null;
        break label177;
        paramIntent = null;
        break;
      }
      label176:
      return;
      label177:
      if ((paramIntent != null) || (localObject != null)) {
        break label89;
      }
      label188:
      if (paramIntent == null) {
        if (localObject == null) {
          break label88;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */