package com.tencent.qalsdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.QLog;
import qalsdk.ah;

public class NetConnInfoCenter
  extends BroadcastReceiver
{
  public static String RDMREPORT_INTENT = "com.tencent.mobileqq.rdm.report";
  public static final String TAG;
  static m impl = new m();
  private static boolean sHasBooted = false;
  public static long servetTimeSecondInterv;
  public static volatile int socketConnState;
  
  static
  {
    TAG = NetConnInfoCenter.class.getSimpleName();
    servetTimeSecondInterv = 0L;
    socketConnState = 0;
  }
  
  public static void checkConnInfo(Context paramContext)
  {
    impl.a(paramContext, null);
  }
  
  public static void checkConnInfo(Context paramContext, boolean paramBoolean)
  {
    impl.a(paramContext, null, paramBoolean);
  }
  
  public static int getCdmaStrength()
  {
    return impl.i;
  }
  
  public static int getGsmStrength()
  {
    return impl.h;
  }
  
  public static long getServerTime()
  {
    return System.currentTimeMillis() / 1000L + servetTimeSecondInterv;
  }
  
  public static long getServerTimeMillis()
  {
    return System.currentTimeMillis() + servetTimeSecondInterv * 1000L;
  }
  
  public static String getSignalStrengthsLog()
  {
    return " SignalStrengths wifi:" + getWifiStrength() + " gsm:" + getGsmStrength() + " cdma:" + getCdmaStrength() + " net:" + m.n();
  }
  
  public static int getWifiStrength()
  {
    if ((impl.g == 0) && (m.e())) {
      impl.q();
    }
    return impl.g;
  }
  
  public static void handleGetServerTimeResp(long paramLong)
  {
    impl.a(paramLong);
  }
  
  public static void init(j paramj)
  {
    m.a(paramj);
    impl.a(paramj.r);
  }
  
  public static boolean isGSM()
  {
    return impl.j;
  }
  
  public static void onConnClosed(CloseConnReason paramCloseConnReason)
  {
    impl.a(paramCloseConnReason);
  }
  
  public static void onConnOpened(String paramString1, String paramString2)
  {
    impl.a(paramString1, paramString2);
  }
  
  public static void onOepnConnAllFailed()
  {
    impl.g();
  }
  
  public static void onRecvFirstResp()
  {
    impl.i();
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      if (QLog.isColorLevel()) {
        QLog.d(m.a, 2, "receive broadcast intent == null return");
      }
    }
    do
    {
      boolean bool1;
      do
      {
        do
        {
          do
          {
            return;
            if (QLog.isColorLevel()) {
              QLog.d(m.a, 2, "receive broadcast " + paramIntent);
            }
            if (paramIntent.getAction() != null) {
              break;
            }
          } while (!QLog.isColorLevel());
          QLog.d(m.a, 2, "receive broadcast intent.getAction() == null return");
          return;
          boolean bool2 = false;
          bool1 = bool2;
          if (!sHasBooted)
          {
            sHasBooted = true;
            bool1 = bool2;
            if (SystemClock.elapsedRealtime() < 300000L) {
              bool1 = true;
            }
          }
          if (!QalService.inited)
          {
            QLog.e(m.a, "receive broadcast, boot qalservice|" + bool1 + ":" + paramIntent.getAction());
            QalService.sIsCreatedByAutoBoot = bool1;
            paramContext.startService(new Intent(paramContext, QalService.class));
          }
          if (!paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            break;
          }
          try
          {
            paramIntent = (NetworkInfo)paramIntent.getParcelableExtra("networkInfo");
            impl.a(paramContext, paramIntent, true);
            return;
          }
          catch (Exception paramContext) {}
        } while (!QLog.isColorLevel());
        QLog.d(m.a, 2, paramContext.toString(), paramContext);
        return;
        if ((paramIntent.getAction().equals("android.intent.action.TIME_SET")) || (paramIntent.getAction().equals("android.intent.action.DATE_CHANGED")) || (paramIntent.getAction().equals("android.intent.action.TIMEZONE_CHANGED")))
        {
          if (QLog.isColorLevel()) {
            QLog.d(m.a, 2, "recv broadcast " + paramIntent.getAction());
          }
          impl.o();
          return;
        }
      } while (!bool1);
      ah.a(true);
    } while (!QLog.isColorLevel());
    QLog.d(m.a, 2, "set StatReporter.needReportBooting true");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\NetConnInfoCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */