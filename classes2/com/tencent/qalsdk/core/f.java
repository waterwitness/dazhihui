package com.tencent.qalsdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.qalsdk.base.a;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.atomic.AtomicBoolean;

final class f
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (TextUtils.isEmpty(paramContext)) {
      if (QLog.isColorLevel()) {
        QLog.d(e.a, 2, "onReceive broadcastreceiver.action null");
      }
    }
    do
    {
      do
      {
        return;
        QLog.d(e.a, 1, "onReceive broadcastreceiver.action = " + paramContext);
        if (!paramContext.equals("android.intent.action.SCREEN_OFF")) {
          break;
        }
        e.b = false;
        o.z = -1;
        o.B.set(false);
        e.c += 1;
      } while (e.c != a.al);
      e.b();
      return;
    } while (!paramContext.equals("android.intent.action.SCREEN_ON"));
    e.b = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */