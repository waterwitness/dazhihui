package com.tencent.qalsdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.QLog;

public class e
{
  static String a = "MSF.C.LogManager";
  static boolean b = true;
  static int c = 0;
  static boolean d = false;
  static long e = 0L;
  static boolean f = false;
  private static final BroadcastReceiver g = new f();
  
  public static void a()
  {
    try
    {
      if (!f)
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.intent.action.SCREEN_ON");
        localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
        QalService.context.registerReceiver(g, localIntentFilter);
        if (QLog.isColorLevel()) {
          QLog.d(a, 2, "LogManager inited.");
        }
        f = true;
      }
      return;
    }
    finally {}
  }
  
  private static void c()
  {
    g localg = new g();
    localg.setName("delLogThread");
    localg.start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */