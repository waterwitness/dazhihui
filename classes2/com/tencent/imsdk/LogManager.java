package com.tencent.imsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public class LogManager
{
  static boolean isInited = false;
  static boolean isScreenOn;
  private static final BroadcastReceiver mReceiver;
  static int screenOffCount;
  static String tag = "MSF.C.LogManager";
  
  static
  {
    isScreenOn = true;
    screenOffCount = 0;
    mReceiver = new ٴ();
  }
  
  private static void delExpiresLog()
  {
    ᐧ localᐧ = new ᐧ();
    localᐧ.setName("imsdkDelLogThread");
    localᐧ.start();
  }
  
  public static void init()
  {
    try
    {
      if (!isInited)
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.intent.action.SCREEN_ON");
        localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
        IMMsfCoreProxy.get().getContext().registerReceiver(mReceiver, localIntentFilter);
        QLog.i(tag, 1, "LogManager inited.");
        isInited = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\LogManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */