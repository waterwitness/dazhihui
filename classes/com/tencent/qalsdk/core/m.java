package com.tencent.qalsdk.core;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import qalsdk.ah;
import qalsdk.aj;
import qalsdk.ak;
import qalsdk.av;
import qalsdk.i;

public class m
{
  static String a = "MSF.C.NetConnInfoCenter";
  public static j b;
  public static final String c = "recordSysTimeKey";
  static boolean d = false;
  static String e = "";
  static String f = "";
  private static int l = 0;
  private static String m;
  private static String n;
  private static AtomicBoolean o = new AtomicBoolean(false);
  private static final String p = "servetTimeDiff";
  private static long q = -1L;
  private static long r = 0L;
  private static AtomicBoolean s = new AtomicBoolean();
  private static long t = 0L;
  private static final byte u = 0;
  private static final byte v = 1;
  private static int w = 0;
  int g;
  int h;
  int i;
  boolean j;
  boolean k = true;
  private long x = 0L;
  private int y = 0;
  private long z = 0L;
  
  public static void a()
  {
    t = System.currentTimeMillis();
    s.set(true);
  }
  
  static void a(j paramj)
  {
    b = paramj;
    NetConnInfoCenter.servetTimeSecondInterv = b.r.getSharedPreferences(a, 0).getLong("servetTimeDiff", 0L);
  }
  
  public static void a(String paramString)
  {
    try
    {
      if (aj.k)
      {
        Object localObject = new Intent(paramString);
        paramString = aj.l;
        int i1 = b.b(paramString);
        ((Intent)localObject).putExtra("uin", paramString);
        ((Intent)localObject).putExtra("istatus", i1);
        ((Intent)localObject).putExtra("gatewayip", o.m());
        localObject = PendingIntent.getBroadcast(b.r, 0, (Intent)localObject, 0);
        ((AlarmManager)b.r.getSystemService("alarm")).set(0, System.currentTimeMillis() + ah.s(), (PendingIntent)localObject);
        QLog.d(a, 1, "send bootAction for QQ " + paramString);
        aj.k = false;
        return;
      }
      QLog.d(a, 1, "not need send bootAction for QQ");
      return;
    }
    catch (Exception paramString)
    {
      QLog.d(a, 1, "send bootAction for QQ error " + paramString);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    o.set(paramBoolean);
    if (QLog.isColorLevel()) {
      QLog.d(a, 2, "setNetSupport " + o.get());
    }
  }
  
  public static boolean a(NetworkInfo paramNetworkInfo)
  {
    return (paramNetworkInfo.getType() == 0) || (50 == paramNetworkInfo.getType());
  }
  
  public static InetAddress b(int paramInt)
  {
    int i1 = (byte)(paramInt & 0xFF);
    int i2 = (byte)(paramInt >> 8 & 0xFF);
    int i3 = (byte)(paramInt >> 16 & 0xFF);
    int i4 = (byte)(paramInt >> 24 & 0xFF);
    try
    {
      InetAddress localInetAddress = InetAddress.getByAddress(new byte[] { i1, i2, i3, i4 });
      return localInetAddress;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      throw new AssertionError();
    }
  }
  
  private void b(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo != null) {
      w = paramNetworkInfo.getSubtype();
    }
    for (;;)
    {
      a(l | 0x1);
      return;
      try
      {
        w = ((TelephonyManager)b.r.getSystemService("phone")).getNetworkType();
      }
      catch (Exception paramNetworkInfo)
      {
        paramNetworkInfo.printStackTrace();
      }
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public static boolean b()
  {
    return o.get();
  }
  
  public static int c()
  {
    if (e()) {
      return 2;
    }
    if (f()) {
      return 1;
    }
    return 0;
  }
  
  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "NONE";
    case 1: 
      return "MOBILE";
    case 2: 
      return "WiFi";
    }
    return "WiFi";
  }
  
  public static boolean d()
  {
    return (e()) || (f());
  }
  
  public static boolean e()
  {
    return (l == 2) || (l == 3);
  }
  
  public static boolean f()
  {
    return l == 1;
  }
  
  public static String h()
  {
    return m;
  }
  
  public static int j()
  {
    return w;
  }
  
  public static boolean k()
  {
    return d;
  }
  
  public static String l()
  {
    return e;
  }
  
  public static String m()
  {
    return f;
  }
  
  public static int n()
  {
    int i1 = 0;
    if (e()) {
      i1 = l;
    }
    while (!f()) {
      return i1;
    }
    return j() + 10000;
  }
  
  private static void r()
  {
    s.set(false);
    t = 0L;
  }
  
  private void s()
  {
    if (e()) {
      if ((b != null) && (b.c != null)) {
        b.c.a.c.a(m);
      }
    }
    while ((b == null) || (b.c == null)) {
      return;
    }
    b.c.a.c.a();
  }
  
  private void t()
  {
    if ((b != null) && (b.c != null)) {
      b.c.a(CloseConnReason.netChange);
    }
  }
  
  private void u()
  {
    WifiInfo localWifiInfo = ((WifiManager)b.r.getSystemService("wifi")).getConnectionInfo();
    if (localWifiInfo != null)
    {
      int i1 = localWifiInfo.getIpAddress();
      if (QLog.isColorLevel()) {
        QLog.d(a, 2, "wifiConnected localAddress " + i1 + "(" + b(i1).getHostAddress() + "), " + localWifiInfo.toString());
      }
    }
    a(l | 0x2);
  }
  
  private void v()
  {
    a(l & 0xFFFFFFFE);
  }
  
  private void w()
  {
    a(l & 0xFFFFFFFD);
  }
  
  private void x()
  {
    if (b != null) {}
    while (!QLog.isDevelopLevel()) {
      return;
    }
    QLog.d(a, 4, "msfCore not inited. can not send checkServerTimeMsg.");
  }
  
  private void y()
  {
    if (b != null)
    {
      localToServiceMsg = new ToServiceMsg("", "0", "Client.CorrectTime");
      localToServiceMsg.setMsfCommand(MsfCommand.getServerTime);
      localToServiceMsg.setAppId(b.c.j());
      localToServiceMsg.setTimeout(15000L);
      localToServiceMsg.setRequestSsoSeq(j.f());
      localToServiceMsg.addAttribute("__base_tag_isAppMsg", Boolean.valueOf(true));
      localToServiceMsg.putWupBuffer(MsfSdkUtils.convertInt2Bytes(4));
      b.c.b(localToServiceMsg);
    }
    while (!QLog.isDevelopLevel())
    {
      ToServiceMsg localToServiceMsg;
      return;
    }
    QLog.d(a, 4, "msfCore not inited. can not send checkServerTimeMsg.");
  }
  
  public void a(int paramInt)
  {
    int i2 = 0;
    String str2;
    int i1;
    do
    {
      for (;;)
      {
        try
        {
          String str1 = ak.d();
          str2 = ak.b();
          if (l == paramInt)
          {
            if (QLog.isColorLevel()) {
              QLog.d(a, 2, "found repeat net event , now is " + b() + " now:" + paramInt + " last:" + l);
            }
            if ((str1 != null) && ((m == null) || (!m.equals(str1))))
            {
              if (QLog.isColorLevel()) {
                QLog.d(a, 2, "new ssid :  " + str1 + " old ssid: " + m);
              }
              m = str1;
              if (b != null)
              {
                b.f.h();
                s();
              }
            }
            if ((str2 != null) && ((n == null) || (!n.equals(str2))))
            {
              if (QLog.isColorLevel()) {
                QLog.d("MSF.C.SsoListManager", 2, "Mobile APN changed, load sso list new apn :  " + str2 + " old apn: " + n);
              }
              n = str2;
              if (b != null) {
                b.f.g();
              }
            }
            return;
          }
          if (paramInt > 0)
          {
            a(true);
            if (s.get()) {
              r();
            }
            QLog.d(a, 1, "netchange " + c(l) + " to " + c(paramInt));
            q();
            o.b("");
            o.b(0);
            if (paramInt != 1) {
              break label657;
            }
            i1 = i2;
            if (l != 0)
            {
              if (l != -2) {
                break;
              }
              i1 = i2;
            }
            l = paramInt;
            s();
            if (i1 != 0) {
              t();
            }
            if ((paramInt > 0) && (b != null) && (b.d != null)) {
              b.d.c();
            }
          }
          else
          {
            a(false);
          }
        }
        finally {}
      }
      if (l == 2) {
        break;
      }
      i1 = i2;
    } while (l != 3);
    if ((str2 != null) && ((n == null) || (!n.equals(str2))))
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.SsoListManager", 2, "WIFI to Mobile load mobile sso list new apn :  " + str2 + " old apn: " + n);
      }
      n = str2;
      if (b != null) {
        b.f.g();
      }
    }
    for (;;)
    {
      label522:
      i1 = i2;
      if (l == 0) {
        break;
      }
      i1 = i2;
      if (l == -2) {
        break;
      }
      i1 = i2;
      if (l != 1) {
        break;
      }
      if ((localObject != null) && ((m == null) || (!m.equals(localObject))))
      {
        if (QLog.isColorLevel()) {
          QLog.d(a, 2, "new ssid :  " + (String)localObject + " old ssid: " + m);
        }
        m = (String)localObject;
        if (b != null) {
          b.f.h();
        }
      }
      i1 = 1;
      break;
      label657:
      do
      {
        i1 = 1;
        break;
        i1 = 1;
        break;
        if (paramInt == 2) {
          break label522;
        }
      } while (paramInt != 3);
    }
  }
  
  public void a(long paramLong)
  {
    if (QLog.isDevelopLevel()) {
      QLog.e(a, 4, "handleGetServerTimeResp servertime is " + paramLong);
    }
    NetConnInfoCenter.servetTimeSecondInterv = paramLong - System.currentTimeMillis() / 1000L;
    SharedPreferences.Editor localEditor = b.r.getSharedPreferences(a, 0).edit();
    localEditor.putLong("servetTimeDiff", NetConnInfoCenter.servetTimeSecondInterv);
    localEditor.commit();
    if (QLog.isColorLevel()) {
      QLog.d(a, 2, "set serverTime is " + b.m.format(Long.valueOf(System.currentTimeMillis() + NetConnInfoCenter.servetTimeSecondInterv * 1000L)));
    }
    j.a("*", b.c.j());
  }
  
  public void a(Context paramContext)
  {
    Object localObject = new m.a(this, null);
    ((TelephonyManager)paramContext.getSystemService("phone")).listen((PhoneStateListener)localObject, 256);
    localObject = new m.b(this, null);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.RSSI_CHANGED");
    paramContext.registerReceiver((BroadcastReceiver)localObject, localIntentFilter);
  }
  
  public void a(Context paramContext, NetworkInfo paramNetworkInfo)
  {
    a(paramContext, paramNetworkInfo, false);
  }
  
  public void a(Context paramContext, NetworkInfo paramNetworkInfo, boolean paramBoolean)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    a(localConnectivityManager.getActiveNetworkInfo(), paramNetworkInfo);
    for (;;)
    {
      try
      {
        paramContext = localConnectivityManager.getNetworkInfo(0);
        if (paramContext == null)
        {
          paramContext = localConnectivityManager.getNetworkInfo(50);
          if (paramContext != null) {
            e = paramContext.getExtraInfo();
          }
          return;
        }
      }
      catch (Exception paramContext)
      {
        QLog.d(a, 1, "get currentAPN error " + paramContext);
        return;
      }
    }
  }
  
  public void a(NetworkInfo paramNetworkInfo1, NetworkInfo paramNetworkInfo2)
  {
    String str;
    if (paramNetworkInfo1 != null) {
      str = paramNetworkInfo1.getTypeName();
    }
    do
    {
      do
      {
        try
        {
          f = paramNetworkInfo1.getSubtypeName();
          if (str.toLowerCase().contains("mobile_mms")) {
            return;
          }
        }
        catch (Exception localException)
        {
          do
          {
            do
            {
              do
              {
                for (;;)
                {
                  QLog.d(a, 1, "get subtypeName error " + localException);
                }
                QLog.d(a, 1, "currentAPN:" + e + ". received networkInfo: " + paramNetworkInfo1.getDetailedState() + " :" + paramNetworkInfo1 + ". extra NetworkInfo: " + paramNetworkInfo2);
                if ((!paramNetworkInfo1.isAvailable()) || (paramNetworkInfo1.getDetailedState() != NetworkInfo.DetailedState.CONNECTED)) {
                  break;
                }
                if (1 == paramNetworkInfo1.getType())
                {
                  u();
                  return;
                }
              } while (!a(paramNetworkInfo1));
              w();
              b(paramNetworkInfo1);
              return;
            } while ((paramNetworkInfo1.getDetailedState() != NetworkInfo.DetailedState.DISCONNECTED) && (paramNetworkInfo1.getDetailedState() != NetworkInfo.DetailedState.FAILED) && (paramNetworkInfo1.getDetailedState() != NetworkInfo.DetailedState.IDLE) && (paramNetworkInfo1.getDetailedState() != NetworkInfo.DetailedState.SUSPENDED));
            if (1 == paramNetworkInfo1.getType())
            {
              w();
              return;
            }
          } while (!a(paramNetworkInfo1));
          v();
          return;
        }
        if (QLog.isColorLevel()) {
          QLog.d(a, 2, "currentAPN:" + e + ". active NetworkInfo: " + paramNetworkInfo1 + ". extra NetworkInfo: " + paramNetworkInfo2);
        }
      } while ((paramNetworkInfo2 == null) || ((paramNetworkInfo2.getDetailedState() != NetworkInfo.DetailedState.DISCONNECTED) && (paramNetworkInfo2.getDetailedState() != NetworkInfo.DetailedState.FAILED) && (paramNetworkInfo2.getDetailedState() != NetworkInfo.DetailedState.IDLE) && (paramNetworkInfo2.getDetailedState() != NetworkInfo.DetailedState.SUSPENDED)));
      if (1 == paramNetworkInfo2.getType())
      {
        w();
        return;
      }
    } while (!a(paramNetworkInfo2));
    v();
  }
  
  public void a(CloseConnReason paramCloseConnReason)
  {
    NetConnInfoCenter.socketConnState = 1;
    b.d.a(paramCloseConnReason);
    paramCloseConnReason = new FromServiceMsg(b.i(), j.f(), "0", "cmd_connClosed");
    paramCloseConnReason.setMsgSuccess();
    paramCloseConnReason.setMsfCommand(MsfCommand.onConnClosed);
    MsfSdkUtils.addFromMsgProcessName("*", paramCloseConnReason);
    b.a(null, paramCloseConnReason);
  }
  
  public void a(String paramString1, String paramString2)
  {
    NetConnInfoCenter.socketConnState = 2;
    b.d.d();
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(b.i(), j.f(), "0", "cmd_connOpened");
    localFromServiceMsg.setMsgSuccess();
    localFromServiceMsg.setRequestSsoSeq(j.f());
    localFromServiceMsg.setMsfCommand(MsfCommand.onConnOpened);
    localFromServiceMsg.addAttribute("resp_connopen_serverAdd", paramString1);
    localFromServiceMsg.addAttribute("resp_connopen_localAdd", paramString2);
    if (b.d.b()) {
      localFromServiceMsg.addAttribute("resp_needBootApp", Integer.valueOf(1));
    }
    MsfSdkUtils.addFromMsgProcessName("*", localFromServiceMsg);
    b.a(null, localFromServiceMsg);
  }
  
  public void g()
  {
    NetConnInfoCenter.socketConnState = 3;
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(b.i(), j.f(), "0", "cmd_connAllFailed");
    localFromServiceMsg.setMsgSuccess();
    localFromServiceMsg.setRequestSsoSeq(j.f());
    localFromServiceMsg.setMsfCommand(MsfCommand.onOepnConnAllFailed);
    if (b.d.b()) {
      localFromServiceMsg.addAttribute("resp_needBootApp", Integer.valueOf(1));
    }
    MsfSdkUtils.addFromMsgProcessName("*", localFromServiceMsg);
    b.a(null, localFromServiceMsg);
    b.c.a.c.b();
  }
  
  public void i()
  {
    if (e()) {
      b.c.a.c.b(m);
    }
    NetConnInfoCenter.socketConnState = 4;
    FromServiceMsg localFromServiceMsg = new FromServiceMsg(b.i(), j.f(), "0", "cmd_recvFirstResp");
    localFromServiceMsg.setMsgSuccess();
    localFromServiceMsg.setRequestSsoSeq(j.f());
    localFromServiceMsg.setMsfCommand(MsfCommand.onReceFirstResp);
    if (b.d.b()) {
      localFromServiceMsg.addAttribute("resp_needBootApp", Integer.valueOf(1));
    }
    MsfSdkUtils.addFromMsgProcessName("*", localFromServiceMsg);
    b.a(null, localFromServiceMsg);
  }
  
  public void o()
  {
    System.currentTimeMillis();
    long l1 = SystemClock.elapsedRealtime();
    if ((l1 - this.z > 0L) && (l1 - this.z <= ah.i()))
    {
      if (QLog.isColorLevel()) {
        QLog.d(a, 2, "quit to checkTimeMsg too frequency.");
      }
      return;
    }
    if (this.y < 10)
    {
      y();
      this.y += 1;
      this.z = l1;
    }
    for (;;)
    {
      long l2 = System.currentTimeMillis();
      if ((this.x == 0L) || (l1 - this.x > 600000L))
      {
        this.x = l1;
        this.y = 0;
      }
      q = l2;
      if (l.a() == null) {
        break;
      }
      l.a().n_setConfig("recordSysTimeKey", String.valueOf(l2));
      return;
      if (QLog.isColorLevel()) {
        QLog.d(a, 2, "also send checkTimeMsg " + this.y);
      }
    }
  }
  
  public void p()
  {
    try
    {
      long l1 = SystemClock.elapsedRealtime();
      if ((0L != r) && (l1 > r + ah.l()))
      {
        r = l1;
        String str;
        if ((-1L == q) && (l.a() != null))
        {
          str = l.a().getConfig("recordSysTimeKey");
          if (str == null) {}
        }
        try
        {
          q = Long.parseLong(str);
          l1 = System.currentTimeMillis();
          if (-1L != q)
          {
            if (l1 <= q + ah.j() + Math.random() * ah.k()) {
              return;
            }
            o();
          }
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            if (QLog.isColorLevel()) {
              QLog.d(a, 2, "get lastCheckTime catch Exception " + localException1);
            }
          }
        }
      }
      return;
    }
    catch (Exception localException2)
    {
      if (QLog.isColorLevel())
      {
        QLog.d(a, 2, "checkRecordTime catch Exception " + localException2);
        return;
        q = l1;
        if (l.a() != null)
        {
          l.a().n_setConfig("recordSysTimeKey", String.valueOf(q));
          return;
          if (0L == r) {
            r = l1;
          }
        }
      }
    }
  }
  
  void q()
  {
    for (;;)
    {
      try
      {
        boolean bool = this.k;
        if (!bool) {
          break label127;
        }
        try
        {
          Object localObject1 = (WifiManager)b.r.getSystemService("wifi");
          if (localObject1 != null)
          {
            localObject1 = ((WifiManager)localObject1).getConnectionInfo();
            if (localObject1 == null) {
              continue;
            }
            i1 = 1;
            if (((WifiInfo)localObject1).getBSSID() == null) {
              continue;
            }
            i2 = 1;
            if ((i2 & i1) != 0) {
              this.g = WifiManager.calculateSignalLevel(((WifiInfo)localObject1).getRssi(), 32);
            }
          }
        }
        catch (Exception localException)
        {
          int i1;
          int i2;
          QLog.d(a, 1, "check WifiState error " + localException, localException);
          this.k = false;
          continue;
        }
        return;
      }
      finally {}
      i1 = 0;
      continue;
      i2 = 0;
      continue;
      label127:
      this.g = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */