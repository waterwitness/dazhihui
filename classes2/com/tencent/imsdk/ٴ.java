package com.tencent.imsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

final class ٴ
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (TextUtils.isEmpty(paramContext)) {
      if (QLog.isColorLevel()) {
        QLog.d(LogManager.tag, 2, "onReceive broadcastreceiver.action null");
      }
    }
    do
    {
      int i;
      do
      {
        return;
        QLog.d(LogManager.tag, 1, "onReceive broadcastreceiver.action = " + paramContext);
        if (!paramContext.equals("android.intent.action.SCREEN_OFF")) {
          break;
        }
        LogManager.isScreenOn = false;
        i = LogManager.screenOffCount + 1;
        LogManager.screenOffCount = i;
      } while (i != BaseConstants.checkExpiresLogScreenOffCount);
      LogManager.access$000();
      return;
    } while (!paramContext.equals("android.intent.action.SCREEN_ON"));
    LogManager.isScreenOn = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ٴ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */