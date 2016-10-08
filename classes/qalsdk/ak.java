package qalsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.l;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ak
{
  CopyOnWriteArrayList<c> a;
  CopyOnWriteArrayList<c> b;
  CopyOnWriteArrayList<c> c;
  CopyOnWriteArrayList<c> d;
  CopyOnWriteArrayList<c> e;
  CopyOnWriteArrayList<c> f;
  j g;
  private CopyOnWriteArrayList<c> h = new CopyOnWriteArrayList();
  private CopyOnWriteArrayList<c> i = new CopyOnWriteArrayList();
  private ConcurrentHashMap<String, Object> j = new ConcurrentHashMap();
  
  public ak(j paramj)
  {
    this.g = paramj;
  }
  
  private void a(String paramString, ArrayList<c> paramArrayList)
  {
    int k = 0;
    Object localObject;
    if (paramString != null) {
      localObject = paramString;
    }
    for (;;)
    {
      try
      {
        if (paramString.length() == 0) {
          break label150;
        }
        paramString = ((String)localObject).split(";");
        int m = paramString.length;
        if (k >= m) {
          break label147;
        }
        localObject = paramString[k];
        if (((String)localObject).length() <= 0) {
          break label156;
        }
        localObject = c.a((String)localObject);
        if ((localObject != null) && (!TextUtils.isEmpty(((c)localObject).c())) && (!"null".equals(((c)localObject).c())))
        {
          ((c)localObject).a(false);
          paramArrayList.add(localObject);
        }
        else if (localObject == null)
        {
          QLog.d("MSF.C.SsoListManager", 1, "found invalid endpoint: null");
        }
      }
      finally {}
      QLog.d("MSF.C.SsoListManager", 1, "found invalid endpoint: " + ((c)localObject).toString());
      break label156;
      label147:
      return;
      label150:
      localObject = "";
      continue;
      label156:
      k += 1;
    }
  }
  
  /* Error */
  public static String b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 111	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   6: getfield 115	com/tencent/qalsdk/core/j:r	Landroid/content/Context;
    //   9: ldc 117
    //   11: invokevirtual 123	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: checkcast 125	android/net/ConnectivityManager
    //   17: astore_0
    //   18: aload_0
    //   19: ifnull +103 -> 122
    //   22: aload_0
    //   23: invokevirtual 129	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   26: astore_0
    //   27: aload_0
    //   28: ifnull +89 -> 117
    //   31: aload_0
    //   32: invokevirtual 134	android/net/NetworkInfo:getType	()I
    //   35: ifne +82 -> 117
    //   38: invokestatic 138	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   41: ifeq +31 -> 72
    //   44: ldc 82
    //   46: iconst_2
    //   47: new 91	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   54: ldc -116
    //   56: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_0
    //   60: invokevirtual 143	android/net/NetworkInfo:getSubtypeName	()Ljava/lang/String;
    //   63: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: invokestatic 89	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   72: aload_0
    //   73: invokevirtual 146	android/net/NetworkInfo:getExtraInfo	()Ljava/lang/String;
    //   76: astore_1
    //   77: aload_1
    //   78: astore_0
    //   79: invokestatic 138	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   82: ifeq +30 -> 112
    //   85: ldc 82
    //   87: iconst_2
    //   88: new 91	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   95: ldc -108
    //   97: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_1
    //   101: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 89	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   110: aload_1
    //   111: astore_0
    //   112: ldc 2
    //   114: monitorexit
    //   115: aload_0
    //   116: areturn
    //   117: aconst_null
    //   118: astore_0
    //   119: goto -7 -> 112
    //   122: aconst_null
    //   123: astore_0
    //   124: goto -12 -> 112
    //   127: astore_0
    //   128: ldc 2
    //   130: monitorexit
    //   131: aload_0
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   17	107	0	localObject1	Object
    //   127	5	0	localObject2	Object
    //   76	35	1	str	String
    // Exception table:
    //   from	to	target	type
    //   3	18	127	finally
    //   22	27	127	finally
    //   31	72	127	finally
    //   72	77	127	finally
    //   79	110	127	finally
  }
  
  private boolean b(c paramc)
  {
    if (this.h.remove(paramc))
    {
      this.h.add(paramc);
      QLog.d("MSF.C.SsoListManager", 1, " set " + paramc + " at wifiList last.");
      return true;
    }
    QLog.d("MSF.C.SsoListManager", 1, " not found " + paramc + " at wifiList.");
    return false;
  }
  
  public static int c()
  {
    for (;;)
    {
      try
      {
        NetworkInfo localNetworkInfo = ((ConnectivityManager)j.a().r.getSystemService("connectivity")).getActiveNetworkInfo();
        if (localNetworkInfo == null)
        {
          k = 100;
          return k;
        }
        if (localNetworkInfo.getType() == 0)
        {
          k = localNetworkInfo.getSubtype();
          if (k == 7)
          {
            k = 107;
            continue;
          }
          if (k == 4)
          {
            k = 104;
            continue;
          }
          if (k == 2)
          {
            k = 102;
            continue;
          }
          if (k == 14)
          {
            k = 114;
            continue;
          }
          if (k == 5)
          {
            k = 105;
            continue;
          }
          if (k == 6)
          {
            k = 106;
            continue;
          }
          if (k == 12)
          {
            k = 112;
            continue;
          }
          if (k == 1)
          {
            k = 101;
            continue;
          }
          if (k == 8)
          {
            k = 108;
            continue;
          }
          if (k == 10)
          {
            k = 110;
            continue;
          }
          if (k == 15)
          {
            k = 115;
            continue;
          }
          if (k == 9)
          {
            k = 109;
            continue;
          }
          if (k == 11)
          {
            k = 111;
            continue;
          }
          if (k == 13)
          {
            k = 113;
            continue;
          }
          if (k == 3)
          {
            k = 103;
            continue;
          }
        }
        int k = 100;
      }
      finally {}
    }
  }
  
  private boolean c(c paramc)
  {
    if (this.i.remove(paramc))
    {
      this.i.add(paramc);
      QLog.d("MSF.C.SsoListManager", 1, " set " + paramc + " at mobileList last.");
      return true;
    }
    QLog.d("MSF.C.SsoListManager", 1, " not found " + paramc + " at mobileList.");
    return false;
  }
  
  /* Error */
  public static String d()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 111	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   6: getfield 115	com/tencent/qalsdk/core/j:r	Landroid/content/Context;
    //   9: ldc -83
    //   11: invokevirtual 123	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: checkcast 175	android/net/wifi/WifiManager
    //   17: invokevirtual 179	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   20: astore_0
    //   21: aload_0
    //   22: invokevirtual 184	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: ifnonnull +10 -> 37
    //   30: aconst_null
    //   31: astore_0
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: areturn
    //   37: aload_0
    //   38: invokevirtual 184	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   41: ldc -70
    //   43: ldc 104
    //   45: invokevirtual 190	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore_0
    //   49: aload_0
    //   50: ldc -64
    //   52: invokevirtual 72	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: istore_2
    //   56: iload_2
    //   57: ifeq -25 -> 32
    //   60: aconst_null
    //   61: astore_0
    //   62: goto -30 -> 32
    //   65: astore_0
    //   66: ldc 2
    //   68: monitorexit
    //   69: aload_0
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   20	42	0	localObject1	Object
    //   65	5	0	localObject2	Object
    //   25	2	1	str	String
    //   55	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	26	65	finally
    //   37	56	65	finally
  }
  
  /* Error */
  public static s e()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 195	qalsdk/s
    //   6: dup
    //   7: invokespecial 196	qalsdk/s:<init>	()V
    //   10: astore_0
    //   11: aload_0
    //   12: ldc -83
    //   14: putfield 199	qalsdk/s:a	Ljava/lang/String;
    //   17: invokestatic 111	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   20: getfield 115	com/tencent/qalsdk/core/j:r	Landroid/content/Context;
    //   23: ldc -83
    //   25: invokevirtual 123	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   28: checkcast 175	android/net/wifi/WifiManager
    //   31: invokevirtual 179	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnonnull +8 -> 44
    //   39: ldc 2
    //   41: monitorexit
    //   42: aload_0
    //   43: areturn
    //   44: aload_1
    //   45: invokevirtual 203	android/net/wifi/WifiInfo:getSupplicantState	()Landroid/net/wifi/SupplicantState;
    //   48: ifnull +24 -> 72
    //   51: aload_1
    //   52: invokevirtual 203	android/net/wifi/WifiInfo:getSupplicantState	()Landroid/net/wifi/SupplicantState;
    //   55: invokevirtual 206	android/net/wifi/SupplicantState:toString	()Ljava/lang/String;
    //   58: ifnull +14 -> 72
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual 203	android/net/wifi/WifiInfo:getSupplicantState	()Landroid/net/wifi/SupplicantState;
    //   66: invokevirtual 206	android/net/wifi/SupplicantState:toString	()Ljava/lang/String;
    //   69: putfield 208	qalsdk/s:b	Ljava/lang/String;
    //   72: aload_1
    //   73: invokevirtual 184	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   76: ifnull +18 -> 94
    //   79: aload_0
    //   80: aload_1
    //   81: invokevirtual 184	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   84: ldc -70
    //   86: ldc 104
    //   88: invokevirtual 190	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   91: putfield 210	qalsdk/s:c	Ljava/lang/String;
    //   94: aload_1
    //   95: invokevirtual 213	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   98: ifnull +11 -> 109
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual 213	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   106: putfield 215	qalsdk/s:d	Ljava/lang/String;
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 218	android/net/wifi/WifiInfo:getRssi	()I
    //   114: putfield 221	qalsdk/s:e	I
    //   117: goto -78 -> 39
    //   120: astore_0
    //   121: ldc 2
    //   123: monitorexit
    //   124: aload_0
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	100	0	locals	s
    //   120	5	0	localObject	Object
    //   34	77	1	localWifiInfo	android.net.wifi.WifiInfo
    // Exception table:
    //   from	to	target	type
    //   3	35	120	finally
    //   44	72	120	finally
    //   72	94	120	finally
    //   94	109	120	finally
    //   109	117	120	finally
  }
  
  public void a()
  {
    this.a = new CopyOnWriteArrayList();
    this.b = new CopyOnWriteArrayList();
    this.a.add(c.a("socket://openmsf.3g.qq.com:443#00000:0:1"));
    this.a.add(c.a("socket://59.37.116.121:8080#00000:0:1"));
    this.a.add(c.a("socket://111.30.131.47:14000#00000:0:1"));
    this.a.add(c.a("socket://140.207.69.75:80#00000:0:1"));
    this.a.add(c.a("socket://123.151.152.102:80#00000:0:1"));
    this.a.add(c.a("socket://183.232.126.117:443#00000:0:1"));
    this.c = new CopyOnWriteArrayList();
    this.d = new CopyOnWriteArrayList();
    this.e = new CopyOnWriteArrayList();
    this.f = new CopyOnWriteArrayList();
    this.c.add(c.a("socket://183.232.126.117:14000#46000_46002:0:1"));
    this.c.add(c.a("socket://111.30.131.47:80#46000_46002:0:1"));
    this.c.add(c.a("socket://openmsf.3g.qq.com:8080#46000_46002:0:1"));
    this.c.add(c.a("socket://117.135.172.198:443#46000_46002:0:1"));
    this.c.add(c.a("socket://59.37.116.121:14000#46000_46002:0:1"));
    this.d.add(c.a("socket://163.177.56.123:14000#46001:0:1"));
    this.d.add(c.a("socket://61.135.157.230:80#46001:0:1"));
    this.d.add(c.a("socket://openmsf.3g.qq.com:8080#46001:0:1"));
    this.d.add(c.a("socket://140.207.69.75:443#46001:0:1"));
    this.d.add(c.a("socket://59.37.116.121:14000#46001:0:1"));
    this.e.add(c.a("socket://59.37.116.121:14000#46003:0:1"));
    this.e.add(c.a("socket://123.151.152.102:80#46003:0:1"));
    this.e.add(c.a("socket://openmsf.3g.qq.com:8080#46003:0:1"));
    this.e.add(c.a("socket://101.226.68.116:443#46003:0:1"));
    this.e.add(c.a("socket://163.177.56.123:14000#46003:0:1"));
    this.f.add(c.a("socket://203.205.151.207:14000#00000:0:1"));
    this.f.add(c.a("socket://openmsf.3g.qq.com:8080#00000:0:1"));
    this.f.add(c.a("socket://59.37.116.121:80#00000:0:1"));
    j();
    f();
    i();
    a(d());
  }
  
  public void a(c paramc)
  {
    for (;;)
    {
      try
      {
        if (m.e())
        {
          if (!b(paramc)) {
            c(paramc);
          }
          return;
        }
        if (m.f())
        {
          if (c(paramc)) {
            continue;
          }
          b(paramc);
          continue;
        }
        b(paramc);
      }
      finally {}
      c(paramc);
    }
  }
  
  public void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    label482:
    label485:
    label488:
    label491:
    for (;;)
    {
      try
      {
        Object localObject2 = this.g.r.getSharedPreferences("wifiused", 0);
        long l1 = System.currentTimeMillis();
        Object localObject1;
        int k;
        if (this.j.containsKey(paramString))
        {
          this.j.put(paramString, Long.valueOf(l1));
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.SsoListManager", 2, "find ssid: " + paramString + " update time = " + l1);
          }
          paramString = this.j.entrySet().iterator();
          localObject1 = ((SharedPreferences)localObject2).edit();
          ((SharedPreferences.Editor)localObject1).putInt("wifiUsedCount", this.j.size());
          k = 0;
          if (paramString.hasNext())
          {
            localObject2 = (Map.Entry)paramString.next();
            if (localObject2 == null) {
              continue;
            }
            l1 = ((Long)((Map.Entry)localObject2).getValue()).longValue();
            localObject2 = (String)((Map.Entry)localObject2).getKey();
            if (localObject2 == null) {
              break label482;
            }
            ((SharedPreferences.Editor)localObject1).putString("wifiname" + k, (String)localObject2);
            ((SharedPreferences.Editor)localObject1).putLong("wifitime" + k, l1);
            k += 1;
            break label488;
          }
        }
        else
        {
          k = this.j.size();
          l1 = System.currentTimeMillis();
          localObject1 = null;
          if (k >= 10)
          {
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.SsoListManager", 2, "too much ssid need to delete one find Least Recently Used now...");
            }
            Iterator localIterator = this.j.entrySet().iterator();
            if (localIterator.hasNext())
            {
              Map.Entry localEntry = (Map.Entry)localIterator.next();
              if (localEntry == null) {
                continue;
              }
              long l2 = ((Long)localEntry.getValue()).longValue();
              if (l2 >= l1) {
                break label485;
              }
              localObject1 = (String)localEntry.getKey();
              l1 = l2;
              break label491;
            }
            if (localObject1 != null)
            {
              if (QLog.isColorLevel()) {
                QLog.d("MSF.C.SsoListManager", 2, "Least Recently Used ssid find delete now: " + (String)localObject1);
              }
              this.j.remove(localObject1);
              localObject1 = "__loginSdk_ssoWifilist_" + (String)localObject1;
              l.a().n_removeConfig((String)localObject1);
            }
          }
          this.j.put(paramString, Long.valueOf(System.currentTimeMillis()));
          continue;
        }
        ((SharedPreferences.Editor)localObject1).commit();
      }
      finally {}
      break;
      break label488;
      break label491;
    }
  }
  
  public void a(ArrayList<c> paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      c localc;
      try
      {
        if ((!this.g.c.a.n().equals("")) || (com.tencent.qalsdk.base.a.ao))
        {
          if (QLog.isDevelopLevel()) {
            QLog.d("MSF.C.SsoListManager", 4, "debug mode, skip store sso ");
          }
          return;
        }
        this.h.clear();
        localObject = new StringBuffer();
        paramArrayList = paramArrayList.iterator();
        if (!paramArrayList.hasNext()) {
          break label214;
        }
        localc = (c)paramArrayList.next();
        if ((localc != null) && (!TextUtils.isEmpty(localc.c())) && (!"null".equals(localc.c())))
        {
          ((StringBuffer)localObject).append(localc.toString() + ";");
          this.h.add(localc);
          continue;
        }
        if (localc != null) {
          break label181;
        }
      }
      finally {}
      QLog.d("MSF.C.SsoListManager", 1, "found invalid wifi endpoint: null");
      continue;
      label181:
      QLog.d("MSF.C.SsoListManager", 1, "found invalid wifi endpoint: " + localc.toString());
      continue;
      label214:
      paramArrayList = ((StringBuffer)localObject).toString();
      Object localObject = d();
      if (localObject != null)
      {
        localObject = "__loginSdk_ssoWifilist_" + (String)localObject;
        l.a().n_setConfig((String)localObject, paramArrayList);
      }
    }
  }
  
  public void b(ArrayList<c> paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      c localc;
      try
      {
        if ((!this.g.c.a.n().equals("")) || (com.tencent.qalsdk.base.a.ao))
        {
          if (QLog.isDevelopLevel()) {
            QLog.d("MSF.C.SsoListManager", 4, "debug mode, skip store sso ");
          }
          return;
        }
        this.i.clear();
        localObject = new StringBuffer();
        paramArrayList = paramArrayList.iterator();
        if (!paramArrayList.hasNext()) {
          break label220;
        }
        localc = (c)paramArrayList.next();
        if ((localc != null) && (!TextUtils.isEmpty(localc.c())) && (!"null".equals(localc.c())))
        {
          localc.a(false);
          ((StringBuffer)localObject).append(localc.toString() + ";");
          this.i.add(localc);
          continue;
        }
        if (localc != null) {
          break label187;
        }
      }
      finally {}
      QLog.d("MSF.C.SsoListManager", 1, "found invalid mobile endpoint: null");
      continue;
      label187:
      QLog.d("MSF.C.SsoListManager", 1, "found invalid mobile endpoint: " + localc.toString());
      continue;
      label220:
      paramArrayList = ((StringBuffer)localObject).toString();
      Object localObject = b();
      if (localObject != null)
      {
        localObject = "__loginSdk_ssoMobilelist_" + (String)localObject;
        l.a().n_setConfig((String)localObject, paramArrayList);
        if (paramBoolean2) {
          QLog.d("MSF.C.SsoListManager", 1, "save push mobilesso for " + (String)localObject + " " + paramArrayList);
        } else {
          QLog.d("MSF.C.SsoListManager", 1, "save http mobilesso for " + (String)localObject + " " + paramArrayList);
        }
      }
    }
  }
  
  public void f()
  {
    int k = 0;
    try
    {
      SharedPreferences localSharedPreferences = this.g.r.getSharedPreferences("wifiused", 0);
      int m = localSharedPreferences.getInt("wifiUsedCount", 0);
      while (k < m)
      {
        String str = localSharedPreferences.getString("wifiname" + k, "");
        long l = localSharedPreferences.getLong("wifitime" + k, 0L);
        if ((str != null) && (l > 0L))
        {
          this.j.put(str, Long.valueOf(l));
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.SsoListManager", 2, "get a ssid " + str + " time = " + l);
          }
        }
        k += 1;
      }
      return;
    }
    finally {}
  }
  
  public void g()
  {
    Object localObject1;
    Object localObject2;
    int m;
    Object localObject3;
    for (;;)
    {
      try
      {
        localObject1 = new ArrayList();
        String str1 = b();
        if (str1 == null) {
          return;
        }
        str1 = "__loginSdk_ssoMobilelist_" + str1;
        localObject2 = l.a().getConfig(str1);
        m = 0;
        if ((localObject2 != null) && (((String)localObject2).length() != 0)) {
          break label350;
        }
        localObject2 = l.a().getConfig("__loginSdk_ssolist");
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.SsoListManager", 2, "loadSsoStoreForCurrentAPN get a new apn, ssoStore from __loginSdk_ssolist " + (String)localObject2);
        }
        if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
          break;
        }
        localObject3 = new ArrayList();
        a((String)localObject2, (ArrayList)localObject3);
        localObject2 = ((ArrayList)localObject3).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break label444;
        }
        localObject3 = (c)((Iterator)localObject2).next();
        if (((c)localObject3).h.indexOf("00000") <= -1) {
          ((ArrayList)localObject1).add(localObject3);
        } else {
          ((c)localObject3).a(true);
        }
      }
      finally {}
    }
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.SsoListManager", 2, "loadSsoStoreForCurrentAPN a new apn get from defaultMobileSso mobile: " + str2 + " " + this.b);
    }
    ((ArrayList)localObject1).addAll(this.b);
    for (;;)
    {
      if (((ArrayList)localObject1).size() > 0)
      {
        this.i.clear();
        this.i.addAll((Collection)localObject1);
      }
      if (k != 0)
      {
        localObject1 = new StringBuffer();
        localObject2 = this.i.iterator();
        for (;;)
        {
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (c)((Iterator)localObject2).next();
            ((StringBuffer)localObject1).append(((c)localObject3).toString() + ";");
            continue;
            label350:
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.SsoListManager", 2, "a old apn loadSsoStoreForCurrentAPN mobile: " + str2 + " " + (String)localObject2);
            }
            k = m;
            if (localObject2 == null) {
              break;
            }
            k = m;
            if (((String)localObject2).length() <= 0) {
              break;
            }
            a((String)localObject2, (ArrayList)localObject1);
            k = m;
            break;
          }
        }
        localObject1 = ((StringBuffer)localObject1).toString();
        l.a().n_setConfig(str2, (String)localObject1);
      }
      j();
      break;
      label444:
      int k = 1;
    }
  }
  
  public void h()
  {
    int m = 0;
    Object localObject1;
    String str3;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      try
      {
        localObject1 = new ArrayList();
        String str1 = d();
        if (str1 == null) {
          return;
        }
        str3 = "__loginSdk_ssoWifilist_" + str1;
        localObject2 = l.a().getConfig(str3);
        if ((localObject2 != null) && (((String)localObject2).length() != 0)) {
          break label358;
        }
        localObject2 = l.a().getConfig("__loginSdk_ssolist");
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.SsoListManager", 2, "loadSsoStoreForCurrentSSID get a new ssid, ssoStore from __loginSdk_ssolist" + (String)localObject2);
        }
        if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
          break;
        }
        localObject3 = new ArrayList();
        a((String)localObject2, (ArrayList)localObject3);
        localObject2 = ((ArrayList)localObject3).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break label451;
        }
        localObject3 = (c)((Iterator)localObject2).next();
        if (((c)localObject3).h.indexOf("00000") > -1) {
          ((ArrayList)localObject1).add(localObject3);
        } else {
          ((c)localObject3).a(false);
        }
      }
      finally {}
    }
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.SsoListManager", 2, "loadSsoStoreForCurrentSSID a new ssid get from defaultWifiSso wifi: " + str3 + this.a);
    }
    ((ArrayList)localObject1).addAll(this.a);
    for (;;)
    {
      if (((ArrayList)localObject1).size() > 0)
      {
        this.h.clear();
        this.h.addAll((Collection)localObject1);
      }
      if (k != 0)
      {
        localObject1 = new StringBuffer();
        localObject2 = this.h.iterator();
        for (;;)
        {
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (c)((Iterator)localObject2).next();
            ((StringBuffer)localObject1).append(((c)localObject3).toString() + ";");
            continue;
            label358:
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.SsoListManager", 2, "a old ssid loadSsoStoreForCurrentSSID wifi: " + str3 + (String)localObject2);
            }
            k = m;
            if (localObject2 == null) {
              break;
            }
            k = m;
            if (((String)localObject2).length() <= 0) {
              break;
            }
            a((String)localObject2, (ArrayList)localObject1);
            k = m;
            break;
          }
        }
        localObject1 = ((StringBuffer)localObject1).toString();
        l.a().n_setConfig(str3, (String)localObject1);
      }
      a(str2);
      break;
      label451:
      int k = 1;
    }
  }
  
  public void i()
  {
    for (;;)
    {
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      Object localObject2;
      String str3;
      String str4;
      try
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        Object localObject1 = d();
        if (localObject1 == null) {
          break label437;
        }
        localObject2 = "__loginSdk_ssoWifilist" + "_";
        localObject1 = (String)localObject2 + (String)localObject1;
        str3 = l.a().getConfig((String)localObject1);
        localObject2 = "__loginSdk_ssoMobilelist";
        str4 = b();
        if (str4 != null) {
          localObject2 = "__loginSdk_ssoMobilelist" + "_" + str4;
        }
        str4 = l.a().getConfig((String)localObject2);
        if (((str3 != null) && (str3.length() != 0)) || ((str4 != null) && (str4.length() != 0))) {
          break label294;
        }
        localObject1 = l.a().getConfig("__loginSdk_ssolist");
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.SsoListManager", 2, "load ssoStore " + (String)localObject1);
        }
        if ((localObject1 == null) || (((String)localObject1).length() <= 0)) {
          break label415;
        }
        localObject2 = new ArrayList();
        a((String)localObject1, (ArrayList)localObject2);
        localObject1 = ((ArrayList)localObject2).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label415;
        }
        localObject2 = (c)((Iterator)localObject1).next();
        if (((c)localObject2).h.indexOf("00000") > -1)
        {
          ((c)localObject2).a(true);
          localArrayList1.add(localObject2);
          continue;
        }
        ((c)localObject2).a(false);
      }
      finally {}
      localArrayList2.add(localObject2);
      continue;
      label294:
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.SsoListManager", 2, "load wifiStore wifi: " + str1 + ":" + str3);
        QLog.d("MSF.C.SsoListManager", 2, "load mobileStore " + (String)localObject2 + ":" + str4);
      }
      if ((str3 != null) && (str3.length() > 0)) {
        a(str3, localArrayList1);
      }
      if ((str4 != null) && (str4.length() > 0)) {
        a(str4, localArrayList2);
      }
      label415:
      this.h.addAll(localArrayList1);
      this.i.addAll(localArrayList2);
      return;
      label437:
      String str2 = "__loginSdk_ssoWifilist";
    }
  }
  
  public void j()
  {
    for (;;)
    {
      try
      {
        if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.content.a.a(QalService.context, "android.permission.READ_PHONE_STATE") != 0)) {
          break label256;
        }
        String str1 = ((TelephonyManager)this.g.r.getSystemService("phone")).getSubscriberId();
        if ((str1 == null) || (str1.length() < 5))
        {
          this.b.addAll(this.a);
          return;
        }
        this.b.clear();
        int k = str1.length();
        if (k >= 3)
        {
          str3 = str1.substring(0, 3);
          boolean bool = str3.equals("460");
          if (k < 5) {
            break label261;
          }
          str1 = str1.substring(0, 5);
          if (!Boolean.valueOf(bool).booleanValue()) {
            break label241;
          }
          if ((!str1.equals("46001")) && (!str1.equals("46006")) && (!str1.equals("46010"))) {
            break label181;
          }
          this.b.addAll(this.d);
          continue;
        }
        String str3 = "";
      }
      finally {}
      continue;
      label181:
      if ((((String)localObject).equals("46003")) || (((String)localObject).equals("46005")) || (((String)localObject).equals("46011")))
      {
        this.b.addAll(this.e);
      }
      else
      {
        this.b.addAll(this.c);
        continue;
        label241:
        this.b.addAll(this.f);
        continue;
        label256:
        String str2 = null;
        continue;
        label261:
        str2 = "";
      }
    }
  }
  
  public CopyOnWriteArrayList<c> k()
  {
    if (this.h.size() == 0) {
      return this.a;
    }
    return this.h;
  }
  
  public CopyOnWriteArrayList<c> l()
  {
    if (this.i.size() == 0) {
      return this.b;
    }
    return this.i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */