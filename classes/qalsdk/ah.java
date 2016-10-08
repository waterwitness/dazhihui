package qalsdk;

import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.l;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.im_open.mobroute.MobRouteSSOList;
import com.tencent.qalsdk.im_open.mobroute.MobRouteSSOListInfo;
import com.tencent.qalsdk.util.QLog;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ah
{
  static ConcurrentHashMap<String, String> a = new ConcurrentHashMap();
  public static boolean b = true;
  static AtomicBoolean d = new AtomicBoolean();
  static long e = 0L;
  static long f = 0L;
  static long g = 0L;
  static long h = 0L;
  public static long i = 0L;
  public static long j = 0L;
  private static final byte[] k = { -16, 68, 31, 95, -12, 45, -91, -113, -36, -9, -108, -102, -70, 98, -44, 17 };
  j c;
  
  public ah(j paramj)
  {
    this.c = paramj;
  }
  
  public static void a(boolean paramBoolean)
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "msfCore setAutoStaring " + paramBoolean);
      }
      d.set(paramBoolean);
      if (l.a() != null) {
        l.a().setConfig("_msf_isBootingKey", String.valueOf(paramBoolean));
      }
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "storeAutoStaring " + paramBoolean);
      }
      return;
    }
    finally {}
  }
  
  public static boolean a(String paramString)
  {
    if (a.containsKey(paramString + "_isAutoBoot")) {
      try
      {
        boolean bool = Boolean.parseBoolean(((String)a.get(paramString + "_isAutoBoot")).trim());
        return bool;
      }
      catch (Exception localException)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, paramString + " set isAutoBoot error " + localException);
        }
        return false;
      }
    }
    return true;
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    boolean bool = m.e();
    if (paramArrayOfByte.length < 14)
    {
      QLog.e("MSF.C.ConfigManager", 1, "invalid rsp pkg.len");
      return false;
    }
    Object localObject1 = ByteBuffer.wrap(paramArrayOfByte);
    ((ByteBuffer)localObject1).get();
    int m = ((ByteBuffer)localObject1).getInt();
    if (m != paramArrayOfByte.length)
    {
      QLog.e("MSF.C.ConfigManager", 1, "invalid rsp pkg.len");
      return false;
    }
    Object localObject2 = new byte[m - 14];
    ((ByteBuffer)localObject1).getShort();
    ((ByteBuffer)localObject1).getShort();
    ((ByteBuffer)localObject1).getInt();
    ((ByteBuffer)localObject1).get((byte[])localObject2);
    ((ByteBuffer)localObject1).get();
    paramArrayOfByte = new mobroute.MobRouteSSOList();
    Iterator localIterator;
    Object localObject3;
    af localaf;
    try
    {
      paramArrayOfByte.mergeFrom((byte[])localObject2);
      if ((paramArrayOfByte.vec_tcplist.get() == null) || (paramArrayOfByte.vec_tcplist.get().size() <= 0)) {
        break label339;
      }
      localObject1 = new ArrayList();
      localObject2 = new StringBuffer();
      if (bool) {
        break label341;
      }
      localIterator = paramArrayOfByte.vec_tcplist.get().iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (mobroute.MobRouteSSOListInfo)localIterator.next();
        localaf = new af();
        localaf.e = 0;
        localaf.f = paramArrayOfByte.uint32_timeout.get();
        localaf.a = ((mobroute.MobRouteSSOListInfo)localObject3).string_ip.get();
        localaf.b = ((mobroute.MobRouteSSOListInfo)localObject3).uint32_port.get();
        localObject3 = c.a(localaf, 1);
        ((ArrayList)localObject1).add(localObject3);
        ((StringBuffer)localObject2).append(((c)localObject3).toString() + ";");
      }
      QLog.d("MSF.C.ConfigManager", 1, "recv xg sso list " + ((StringBuffer)localObject2).toString());
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      QLog.e("MSF.C.ConfigManager", 1, "ssolist pb parsing failed");
      paramArrayOfByte.printStackTrace();
      return false;
    }
    j.a().h().b((ArrayList)localObject1, false, false);
    for (;;)
    {
      label339:
      return true;
      label341:
      localIterator = paramArrayOfByte.vec_tcplist.get().iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (mobroute.MobRouteSSOListInfo)localIterator.next();
        localaf = new af();
        localaf.e = 0;
        localaf.f = paramArrayOfByte.uint32_timeout.get();
        localaf.a = ((mobroute.MobRouteSSOListInfo)localObject3).string_ip.get();
        localaf.b = ((mobroute.MobRouteSSOListInfo)localObject3).uint32_port.get();
        localObject3 = c.a(localaf, 0);
        ((c)localObject3).h = "00000";
        ((ArrayList)localObject1).add(localObject3);
        ((StringBuffer)localObject2).append(((c)localObject3).toString() + ";");
      }
      QLog.d("MSF.C.ConfigManager", 1, "recv wifi sso list " + ((StringBuffer)localObject2).toString());
      j.a().h().a((ArrayList)localObject1, false, false);
    }
  }
  
  public static String[] c()
  {
    if (a.containsKey("MultiPkgPara"))
    {
      String[] arrayOfString = ((String)a.get("MultiPkgPara")).replaceAll("\\|", ",").split(",");
      if (arrayOfString.length == 4) {
        return arrayOfString;
      }
    }
    else
    {
      QLog.d("MSF.C.ConfigManager", 1, "login merge configuration not be found.");
    }
    return null;
  }
  
  public static String d()
  {
    if (a.containsKey("msf_locallogtime")) {
      return (String)a.get("msf_locallogtime");
    }
    return "3";
  }
  
  public static String e()
  {
    if (a.containsKey("msf_checkSsoIntervtime")) {
      return (String)a.get("msf_checkSsoIntervtime");
    }
    return "300000";
  }
  
  public static long f()
  {
    try
    {
      if (a.containsKey("msf_heartBeatTimeout"))
      {
        int m = Integer.parseInt((String)a.get("msf_heartBeatTimeout"));
        return m;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getHeartBeatTimeout error" + localException);
      }
    }
    return 15000L;
  }
  
  public static int g()
  {
    try
    {
      if (a.containsKey("msf_heartBeatRetrycount"))
      {
        int m = Integer.parseInt((String)a.get("msf_heartBeatRetrycount"));
        return m;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getHeartBeatRetryCount error" + localException);
      }
    }
    return 1;
  }
  
  public static int h()
  {
    try
    {
      if (a.containsKey("msf_busPacketTimeoutMaxNum"))
      {
        int m = Integer.parseInt((String)a.get("msf_busPacketTimeoutMaxNum"));
        return m;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getBusPacketTimeoutMaxNum error" + localException);
      }
    }
    return 10;
  }
  
  public static long i()
  {
    try
    {
      if (a.containsKey("msf_busCheckServerTimeInterval"))
      {
        long l = Long.parseLong((String)a.get("msf_busCheckServerTimeInterval"));
        return l;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getBusPacketTimeoutMaxNum error" + localException);
      }
    }
    return 5000L;
  }
  
  public static long j()
  {
    try
    {
      if (a.containsKey("msf_checkUpdateServerTimeInterval"))
      {
        long l = Long.parseLong((String)a.get("msf_checkUpdateServerTimeInterval"));
        return l;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getUpdateServerTimePacketTimeoutMaxNum error" + localException);
      }
    }
    return 72000000L;
  }
  
  public static long k()
  {
    try
    {
      if (a.containsKey("msf_checkUpdateServerTimeExtraInterval"))
      {
        long l = Long.parseLong((String)a.get("msf_checkUpdateServerTimeExtraInterval"));
        return l;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getUpdateServerTimePacketTimeoutExtraInterval error" + localException);
      }
    }
    return 7200000L;
  }
  
  public static long l()
  {
    try
    {
      if (a.containsKey("msf_checkServerTimeCompareInterval"))
      {
        long l = Long.parseLong((String)a.get("msf_checkServerTimeCompareInterval"));
        return l;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getCheckServerTimeCompareInterval error" + localException);
      }
    }
    return 7200000L;
  }
  
  public static int m()
  {
    try
    {
      if (a.containsKey("msf_heartBeatTimeInterval"))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, "msf_heartBeatTimeInterval = " + (String)a.get("msf_heartBeatTimeInterval"));
        }
        int m = Integer.parseInt((String)a.get("msf_heartBeatTimeInterval"));
        return m * 60 * 1000;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.ConfigManager", 4, "getHeartBeatTimeInterval error" + localException);
      }
    }
    return 60000;
  }
  
  public static int n()
  {
    try
    {
      if (a.containsKey("msf_netIdleTimeInterval"))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, "msf_netIdleTimeInterval = " + (String)a.get("msf_netIdleTimeInterval"));
        }
        int m = Integer.parseInt((String)a.get("msf_netIdleTimeInterval"));
        return m * 60 * 1000;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.ConfigManager", 4, "getNetIdleTimeInterval error" + localException);
      }
    }
    return 1680000;
  }
  
  public static String o()
  {
    try
    {
      if (a.containsKey("TcpdumpSSOVip_new"))
      {
        String str = (String)a.get("TcpdumpSSOVip_new");
        return str;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.ConfigManager", 2, "getTcpdumpSSOVip error" + localException);
      }
    }
    return null;
  }
  
  public static int p()
  {
    try
    {
      if (a.containsKey("TcpdumpSSOTime"))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, "TcpdumpSSOTime = " + (String)a.get("TcpdumpSSOTime"));
        }
        int m = Integer.parseInt((String)a.get("TcpdumpSSOTime"));
        return m;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.ConfigManager", 4, "getTcpdumpSSOTime error" + localException);
      }
    }
    return 0;
  }
  
  public static int q()
  {
    try
    {
      if (a.containsKey("msf_netWeakTimeInterval"))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, "msf_netWeakTimeInterval = " + (String)a.get("msf_netWeakTimeInterval"));
        }
        int m = Integer.parseInt((String)a.get("msf_netWeakTimeInterval"));
        return m * 60 * 1000;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.ConfigManager", 4, "getNetWeakTimeInterval error" + localException);
      }
    }
    return 180000;
  }
  
  public static int r()
  {
    try
    {
      if (a.containsKey("msf_netWeakExceptionCount"))
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, "msf_netWeakExceptionCount = " + (String)a.get("msf_netWeakExceptionCount"));
        }
        int m = Integer.parseInt((String)a.get("msf_netWeakExceptionCount"));
        return m;
      }
    }
    catch (Exception localException)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.ConfigManager", 4, "getNetWeakExceptionCount error" + localException);
      }
    }
    return 3;
  }
  
  public static long s()
  {
    if (a.containsKey("msf_CallQQIntervTimeOnBoot")) {
      try
      {
        long l = Long.parseLong(((String)a.get("msf_CallQQIntervTimeOnBoot")).trim());
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.ConfigManager", 2, " get CallQQIntervTimeOnBoot error " + localNumberFormatException);
        }
      }
    }
    return 10000L;
  }
  
  public static boolean t()
  {
    return d.get();
  }
  
  private void y()
  {
    if (a.containsKey("msf_AnyPacketAsPushHB")) {}
    for (;;)
    {
      try
      {
        String str = (String)a.get("msf_AnyPacketAsPushHB");
        if (str.equals("0"))
        {
          bool = false;
          b = bool;
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.ConfigManager", 2, "config useAnyPacketAsPushHB " + str);
          }
          return;
        }
      }
      catch (Exception localException)
      {
        boolean bool;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.ConfigManager", 2, "set msf_noReportRdmEvent error " + localException);
      }
      bool = true;
    }
  }
  
  public void a()
  {
    b();
  }
  
  public void a(int paramInt, String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    paramString1 = new ai(this, paramString1, paramBoolean, paramString2);
    paramString1.setName("checkSsoByHttpThread");
    paramString1.start();
  }
  
  public void a(ToServiceMsg paramToServiceMsg, long paramLong)
  {
    if (u())
    {
      if (!m.f()) {
        break label68;
      }
      e = paramLong;
      l.a().n_setConfig("__loginSdk_checkmobilessotime", String.valueOf(e));
      g = e + 3600000L;
      v();
    }
    try
    {
      for (;;)
      {
        a(paramToServiceMsg.getAppId(), paramToServiceMsg.getUin(), 60000L, m.e(), "");
        return;
        label68:
        if (m.e())
        {
          f = paramLong;
          l.a().n_setConfig("__loginSdk_checkwifissotime", String.valueOf(f));
          h = f + 3600000L;
          w();
        }
      }
    }
    catch (Exception paramToServiceMsg)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("MSF.C.ConfigManager", 2, paramToServiceMsg.toString(), paramToServiceMsg);
    }
  }
  
  protected void b()
  {
    String str2 = l.a().getConfig("__loginSdk_checkmobilessotime");
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "0";
    }
    e = Long.parseLong(str1);
    str2 = l.a().getConfig("__loginSdk_checkwifissotime");
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "0";
    }
    f = Long.parseLong(str1);
    str2 = l.a().getConfig("__loginSdk_mobilessotime");
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "0";
    }
    g = Long.parseLong(str1);
    str2 = l.a().getConfig("__loginSdk_wifissotime");
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "0";
    }
    h = Long.parseLong(str1);
    str2 = l.a().getConfig("_msf_isBootingKey");
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = "false";
    }
    a(Boolean.parseBoolean(str1));
    y();
  }
  
  public boolean u()
  {
    long l = System.currentTimeMillis();
    if (m.f()) {
      if (e != 0L) {}
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return true;
              if (g != 0L) {
                break;
              }
            } while (l - e >= 43200000L);
            return false;
          } while (l >= g);
          return false;
          if (!m.e()) {
            break;
          }
        } while (f == 0L);
        if (h != 0L) {
          break;
        }
      } while (l - f >= 43200000L);
      return false;
    } while (l >= h);
    return false;
    return false;
  }
  
  public void v()
  {
    l.a().n_setConfig("__loginSdk_mobilessotime", String.valueOf(g));
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.ConfigManager", 2, "save next get mobile sso time is " + this.c.m.format(Long.valueOf(g)));
    }
  }
  
  public void w()
  {
    l.a().n_setConfig("__loginSdk_wifissotime", String.valueOf(h));
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.ConfigManager", 2, "save next get Wifi sso time is " + this.c.m.format(Long.valueOf(h)));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */