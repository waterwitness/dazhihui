package com.tencent.beacon.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.beacon.e.b;
import com.tencent.beacon.event.a;
import com.tencent.beacon.event.p;

final class l$a
  extends BroadcastReceiver
{
  private String a = null;
  
  private l$a(l paraml) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    this.a = paramIntent.getAction();
    paramContext = p.d();
    if ("android.intent.action.SCREEN_ON".equals(this.a))
    {
      b.b("on screen", new Object[0]);
      if ((paramContext != null) && (paramContext.b != null)) {
        paramContext.b.a(true);
      }
      e.a().a(this.b.a);
    }
    do
    {
      do
      {
        return;
      } while (!"android.intent.action.SCREEN_OFF".equals(this.a));
      b.b("off screen", new Object[0]);
    } while ((paramContext == null) || (paramContext.b == null));
    paramContext.b.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\l$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */