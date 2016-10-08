package com.tencent.wxop.stat.b;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.wxop.stat.c;
import com.tencent.wxop.stat.f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHost;
import org.json.JSONObject;

public final class l
{
  private static int U;
  private static String W;
  private static String a = null;
  private static String aR;
  private static String b = null;
  private static int bG;
  private static volatile int bn;
  private static String bq;
  private static String br;
  private static String bs;
  private static String c = null;
  private static String cC;
  private static String cE;
  private static Random cR;
  private static DisplayMetrics cS;
  private static b cT;
  private static String cU;
  private static String cV;
  private static long cW;
  private static o cX;
  private static String cY;
  private static long cZ;
  private static String da = "";
  private static int w;
  
  static
  {
    W = null;
    cR = null;
    cS = null;
    bq = null;
    br = "";
    bs = "";
    bG = -1;
    cT = null;
    cU = null;
    aR = null;
    bn = -1;
    cV = null;
    cC = null;
    cW = -1L;
    cE = "";
    cX = null;
    cY = "__MTA_FIRST_ACTIVATE__";
    U = -1;
    cZ = -1L;
    w = 0;
  }
  
  public static String A(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (paramContext != null)
      {
        paramContext = paramContext.metaData.get("InstallChannel");
        if (paramContext != null) {
          return paramContext.toString();
        }
        cT.c("Could not read InstallChannel meta-data from AndroidManifest.xml");
      }
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        cT.d("Could not read InstallChannel meta-data from AndroidManifest.xml");
      }
    }
    return null;
  }
  
  public static String B(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    return paramContext.getClass().getName();
  }
  
  public static String C(Context paramContext)
  {
    if (bq != null) {
      return bq;
    }
    for (;;)
    {
      try
      {
        if (!r.a(paramContext, "android.permission.READ_PHONE_STATE")) {
          continue;
        }
        if (paramContext.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", paramContext.getPackageName()) == 0) {
          continue;
        }
        i = 0;
        if (i != 0)
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          if (paramContext != null) {
            bq = paramContext.getSimOperator();
          }
        }
      }
      catch (Throwable paramContext)
      {
        int i;
        cT.b(paramContext);
        continue;
      }
      return bq;
      i = 1;
      continue;
      cT.d("Could not get permission of android.permission.READ_PHONE_STATE");
    }
  }
  
  public static String D(Context paramContext)
  {
    if (e(br)) {
      return br;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      br = paramContext;
      if (paramContext == null) {
        return "";
      }
    }
    catch (Throwable paramContext)
    {
      cT.b(paramContext);
    }
    return br;
  }
  
  public static String E(Context paramContext)
  {
    Object localObject;
    try
    {
      if ((r.a(paramContext, "android.permission.INTERNET")) && (r.a(paramContext, "android.permission.ACCESS_NETWORK_STATE")))
      {
        localObject = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((localObject == null) || (!((NetworkInfo)localObject).isConnected())) {
          break label114;
        }
        paramContext = ((NetworkInfo)localObject).getTypeName();
        localObject = ((NetworkInfo)localObject).getExtraInfo();
        if (paramContext == null) {
          break label114;
        }
        if (paramContext.equalsIgnoreCase("WIFI")) {
          return "WIFI";
        }
        if (!paramContext.equalsIgnoreCase("MOBILE")) {
          break label108;
        }
        if (localObject != null) {
          return (String)localObject;
        }
      }
      else
      {
        cT.d("can not get the permission of android.permission.ACCESS_WIFI_STATE");
        return "";
      }
    }
    catch (Throwable paramContext)
    {
      cT.b(paramContext);
      return "";
    }
    return "MOBILE";
    label108:
    if (localObject != null)
    {
      return (String)localObject;
      label114:
      paramContext = "";
    }
    return paramContext;
  }
  
  public static Integer F(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        int i = paramContext.getNetworkType();
        return Integer.valueOf(i);
      }
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static String G(Context paramContext)
  {
    if (e(bs)) {
      return bs;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      bs = paramContext;
      if ((paramContext == null) || (bs.length() == 0)) {
        return "unknown";
      }
    }
    catch (Throwable paramContext)
    {
      cT.b(paramContext);
    }
    return bs;
  }
  
  public static String H(Context paramContext)
  {
    if (e(cU)) {
      return cU;
    }
    try
    {
      if (!r.a(paramContext, "android.permission.WRITE_EXTERNAL_STORAGE")) {
        break label140;
      }
      paramContext = Environment.getExternalStorageState();
      if ((paramContext != null) && (paramContext.equals("mounted")))
      {
        paramContext = Environment.getExternalStorageDirectory().getPath();
        if (paramContext != null)
        {
          paramContext = new StatFs(paramContext);
          long l1 = paramContext.getBlockCount() * paramContext.getBlockSize() / 1000000L;
          long l2 = paramContext.getAvailableBlocks();
          l2 = paramContext.getBlockSize() * l2 / 1000000L;
          paramContext = String.valueOf(l2) + "/" + String.valueOf(l1);
          cU = paramContext;
          return paramContext;
        }
      }
    }
    catch (Throwable paramContext)
    {
      cT.b(paramContext);
    }
    return null;
    label140:
    cT.warn("can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
    return null;
  }
  
  static String I(Context paramContext)
  {
    try
    {
      if (aR != null) {
        return aR;
      }
      int i = Process.myPid();
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (localRunningAppProcessInfo.pid == i) {
          aR = localRunningAppProcessInfo.processName;
        }
      }
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    return aR;
  }
  
  public static String J(Context paramContext)
  {
    return e(paramContext, a.ct);
  }
  
  public static Integer K(Context paramContext)
  {
    int i = 0;
    for (;;)
    {
      int j;
      try
      {
        if (bn > 0)
        {
          j = bn;
          if (j % 1000 == 0) {}
          try
          {
            j = bn;
            if (bn < 2147383647) {
              break label107;
            }
            q.b(paramContext, "MTA_EVENT_INDEX", i);
          }
          catch (Throwable paramContext)
          {
            cT.c(paramContext);
            continue;
          }
          i = bn + 1;
          bn = i;
          return Integer.valueOf(i);
        }
      }
      finally {}
      bn = q.a(paramContext, "MTA_EVENT_INDEX", 0);
      q.b(paramContext, "MTA_EVENT_INDEX", bn + 1000);
      continue;
      label107:
      i = j + 1000;
    }
  }
  
  public static String L(Context paramContext)
  {
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      paramContext.getMemoryInfo(localMemoryInfo);
      long l1 = localMemoryInfo.availMem / 1000000L;
      long l2 = ay() / 1000000L;
      paramContext = String.valueOf(l1) + "/" + String.valueOf(l2);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static String M(Context paramContext)
  {
    if (e(cE)) {
      return cE;
    }
    try
    {
      paramContext = (SensorManager)paramContext.getSystemService("sensor");
      if (paramContext == null) {
        break label115;
      }
      paramContext = paramContext.getSensorList(-1);
      if (paramContext == null) {
        break label115;
      }
      localStringBuilder = new StringBuilder(paramContext.size() * 10);
      i = 0;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        int i;
        label115:
        cT.b(paramContext);
        continue;
        i += 1;
      }
    }
    if (i < paramContext.size())
    {
      localStringBuilder.append(((Sensor)paramContext.get(i)).getType());
      if (i != paramContext.size() - 1) {
        localStringBuilder.append(",");
      }
    }
    else
    {
      cE = localStringBuilder.toString();
      return cE;
    }
  }
  
  /* Error */
  public static int N(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 85	com/tencent/wxop/stat/b/l:U	I
    //   6: iconst_m1
    //   7: if_icmpeq +12 -> 19
    //   10: getstatic 85	com/tencent/wxop/stat/b/l:U	I
    //   13: istore_1
    //   14: ldc 2
    //   16: monitorexit
    //   17: iload_1
    //   18: ireturn
    //   19: aload_0
    //   20: invokestatic 412	com/tencent/wxop/stat/b/l:O	(Landroid/content/Context;)V
    //   23: getstatic 85	com/tencent/wxop/stat/b/l:U	I
    //   26: istore_1
    //   27: goto -13 -> 14
    //   30: astore_0
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	paramContext	Context
    //   13	14	1	i	int
    // Exception table:
    //   from	to	target	type
    //   3	14	30	finally
    //   19	27	30	finally
  }
  
  public static void O(Context paramContext)
  {
    int i = q.a(paramContext, cY, 1);
    U = i;
    if (i == 1) {
      q.b(paramContext, cY, 0);
    }
  }
  
  public static boolean P(Context paramContext)
  {
    if (cZ < 0L) {
      cZ = q.f(paramContext, "mta.qq.com.checktime");
    }
    return Math.abs(System.currentTimeMillis() - cZ) > 86400000L;
  }
  
  public static void Q(Context paramContext)
  {
    cZ = System.currentTimeMillis();
    q.a(paramContext, "mta.qq.com.checktime", cZ);
  }
  
  public static String R(Context paramContext)
  {
    if (paramContext == null) {}
    do
    {
      return null;
      Intent localIntent = new Intent("android.intent.action.MAIN");
      localIntent.addCategory("android.intent.category.HOME");
      paramContext = paramContext.getPackageManager().resolveActivity(localIntent, 0);
    } while ((paramContext.activityInfo == null) || (paramContext.activityInfo.packageName.equals("android")));
    return paramContext.activityInfo.packageName;
  }
  
  public static int a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      w = q.a(paramContext, "mta.qq.com.difftime", 0);
    }
    return w;
  }
  
  private static Long a(String paramString1, String paramString2, Long paramLong)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    do
    {
      return paramLong;
      String str;
      if (!paramString2.equalsIgnoreCase("."))
      {
        str = paramString2;
        if (!paramString2.equalsIgnoreCase("|")) {}
      }
      else
      {
        str = "\\" + paramString2;
      }
      paramString2 = paramString1.split(str);
    } while (paramString2.length != 3);
    try
    {
      paramString1 = Long.valueOf(0L);
      int i = 0;
      while (i < paramString2.length)
      {
        long l1 = paramString1.longValue();
        long l2 = Long.valueOf(paramString2[i]).longValue();
        i += 1;
        paramString1 = Long.valueOf(100L * (l1 + l2));
      }
      return paramString1;
    }
    catch (NumberFormatException paramString1) {}
    return paramLong;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    w = paramInt;
    q.b(paramContext, "mta.qq.com.difftime", paramInt);
  }
  
  public static boolean a(f paramf)
  {
    if (paramf == null) {
      return false;
    }
    return e(paramf.S());
  }
  
  public static long ad()
  {
    try
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      localCalendar.set(14, 0);
      long l = localCalendar.getTimeInMillis();
      return l + 86400000L;
    }
    catch (Throwable localThrowable)
    {
      cT.b(localThrowable);
    }
    return System.currentTimeMillis() + 86400000L;
  }
  
  private static Random at()
  {
    try
    {
      if (cR == null) {
        cR = new Random();
      }
      Random localRandom = cR;
      return localRandom;
    }
    finally {}
  }
  
  public static int au()
  {
    if (bG != -1) {
      return bG;
    }
    try
    {
      if (p.a()) {
        bG = 1;
      }
      bG = 0;
      return 0;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        cT.b(localThrowable);
      }
    }
  }
  
  public static b av()
  {
    try
    {
      if (cT == null)
      {
        localb = new b("MtaSDK");
        cT = localb;
        localb.ap();
      }
      b localb = cT;
      return localb;
    }
    finally {}
  }
  
  public static String aw()
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.roll(6, 0);
    return new SimpleDateFormat("yyyyMMdd").format(localCalendar.getTime());
  }
  
  public static String ax()
  {
    if (e(cC)) {
      return cC;
    }
    Object localObject = new StatFs(Environment.getDataDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    l1 = ((StatFs)localObject).getBlockCount() * l1 / 1000000L;
    localObject = new StatFs(Environment.getDataDirectory().getPath());
    long l2 = ((StatFs)localObject).getBlockSize();
    l2 = ((StatFs)localObject).getAvailableBlocks() * l2 / 1000000L;
    localObject = String.valueOf(l2) + "/" + String.valueOf(l1);
    cC = (String)localObject;
    return (String)localObject;
  }
  
  private static long ay()
  {
    if (cW > 0L) {
      return cW;
    }
    long l2 = 1L;
    long l1 = l2;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
      l1 = l2;
      l2 = Integer.valueOf(localBufferedReader.readLine().split("\\s+")[1]).intValue() * 1024;
      l1 = l2;
      localBufferedReader.close();
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    cW = l1;
    return l1;
  }
  
  public static JSONObject az()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("n", m.r());
      String str = m.ax();
      if ((str != null) && (str.length() > 0)) {
        localJSONObject.put("na", str);
      }
      int i = m.aA();
      if (i > 0) {
        localJSONObject.put("fx", i / 1000000);
      }
      i = m.D();
      if (i > 0) {
        localJSONObject.put("fn", i / 1000000);
      }
      return localJSONObject;
    }
    catch (Throwable localThrowable)
    {
      Log.w("MtaSDK", "get cpu error", localThrowable);
    }
    return localJSONObject;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    GZIPInputStream localGZIPInputStream = new GZIPInputStream(localByteArrayInputStream);
    byte[] arrayOfByte = new byte['က'];
    paramArrayOfByte = new ByteArrayOutputStream(paramArrayOfByte.length * 2);
    for (;;)
    {
      int i = localGZIPInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramArrayOfByte.write(arrayOfByte, 0, i);
    }
    arrayOfByte = paramArrayOfByte.toByteArray();
    localByteArrayInputStream.close();
    localGZIPInputStream.close();
    paramArrayOfByte.close();
    return arrayOfByte;
  }
  
  /* Error */
  public static String c(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   6: ifnull +24 -> 30
    //   9: getstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   12: invokevirtual 653	java/lang/String:trim	()Ljava/lang/String;
    //   15: invokevirtual 242	java/lang/String:length	()I
    //   18: ifeq +12 -> 30
    //   21: getstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   24: astore_0
    //   25: ldc 2
    //   27: monitorexit
    //   28: aload_0
    //   29: areturn
    //   30: aload_0
    //   31: invokestatic 655	com/tencent/wxop/stat/b/r:b	(Landroid/content/Context;)Ljava/lang/String;
    //   34: astore_0
    //   35: aload_0
    //   36: putstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   39: aload_0
    //   40: ifnull +15 -> 55
    //   43: getstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   46: invokevirtual 653	java/lang/String:trim	()Ljava/lang/String;
    //   49: invokevirtual 242	java/lang/String:length	()I
    //   52: ifne +18 -> 70
    //   55: invokestatic 657	com/tencent/wxop/stat/b/l:at	()Ljava/util/Random;
    //   58: ldc_w 658
    //   61: invokevirtual 662	java/util/Random:nextInt	(I)I
    //   64: invokestatic 665	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   67: putstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   70: getstatic 39	com/tencent/wxop/stat/b/l:a	Ljava/lang/String;
    //   73: astore_0
    //   74: goto -49 -> 25
    //   77: astore_0
    //   78: ldc 2
    //   80: monitorexit
    //   81: aload_0
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	25	77	finally
    //   30	39	77	finally
    //   43	55	77	finally
    //   55	70	77	finally
    //   70	74	77	finally
  }
  
  public static String d(long paramLong)
  {
    return new SimpleDateFormat("yyyyMMdd").format(new Date(paramLong));
  }
  
  public static String e(Context paramContext, String paramString)
  {
    String str = paramString;
    if (c.E() == true)
    {
      if (aR == null) {
        aR = I(paramContext);
      }
      str = paramString;
      if (aR != null) {
        str = paramString + "_" + aR;
      }
    }
    return str;
  }
  
  public static boolean e(String paramString)
  {
    return (paramString != null) && (paramString.trim().length() != 0);
  }
  
  public static int r()
  {
    return at().nextInt(Integer.MAX_VALUE);
  }
  
  public static String t(String paramString)
  {
    if (paramString == null) {
      return "0";
    }
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      paramString = ((MessageDigest)localObject).digest();
      localObject = new StringBuffer();
      int i = 0;
      while (i < paramString.length)
      {
        int j = paramString[i] & 0xFF;
        if (j < 16) {
          ((StringBuffer)localObject).append("0");
        }
        ((StringBuffer)localObject).append(Integer.toHexString(j));
        i += 1;
      }
      paramString = ((StringBuffer)localObject).toString();
      return paramString;
    }
    catch (Throwable paramString) {}
    return "0";
  }
  
  public static long u(String paramString)
  {
    return a(paramString, ".", Long.valueOf(0L)).longValue();
  }
  
  public static HttpHost v(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    do
    {
      try
      {
        if (paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) != 0) {
          return null;
        }
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (paramContext == null) {
          return null;
        }
        if ((paramContext.getTypeName() != null) && (paramContext.getTypeName().equalsIgnoreCase("WIFI"))) {
          return null;
        }
        paramContext = paramContext.getExtraInfo();
        if (paramContext == null) {
          return null;
        }
        if ((paramContext.equals("cmwap")) || (paramContext.equals("3gwap")) || (paramContext.equals("uniwap")))
        {
          paramContext = new HttpHost("10.0.0.172", 80);
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        cT.b(paramContext);
        return null;
      }
      if (paramContext.equals("ctwap")) {
        return new HttpHost("10.0.0.200", 80);
      }
      paramContext = Proxy.getDefaultHost();
    } while ((paramContext == null) || (paramContext.trim().length() <= 0));
    paramContext = new HttpHost(paramContext, Proxy.getDefaultPort());
    return paramContext;
  }
  
  public static String w(Context paramContext)
  {
    try
    {
      if ((c == null) || (c.trim().length() == 0)) {
        c = r.c(paramContext);
      }
      paramContext = c;
      return paramContext;
    }
    finally {}
  }
  
  public static DisplayMetrics x(Context paramContext)
  {
    if (cS == null)
    {
      cS = new DisplayMetrics();
      ((WindowManager)paramContext.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(cS);
    }
    return cS;
  }
  
  public static boolean y(Context paramContext)
  {
    try
    {
      if (!r.a(paramContext, "android.permission.ACCESS_WIFI_STATE")) {
        break label69;
      }
      paramContext = (ConnectivityManager)paramContext.getApplicationContext().getSystemService("connectivity");
      if (paramContext == null) {
        break label97;
      }
      paramContext = paramContext.getAllNetworkInfo();
      if (paramContext == null) {
        break label97;
      }
      i = 0;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        int i;
        label69:
        cT.b(paramContext);
        continue;
        i += 1;
      }
    }
    if (i < paramContext.length) {
      if ((paramContext[i].getTypeName().equalsIgnoreCase("WIFI")) && (paramContext[i].isConnected()))
      {
        return true;
        cT.warn("can not get the permission of android.permission.ACCESS_WIFI_STATE");
        return false;
      }
    }
    label97:
    return false;
  }
  
  public static String z(Context paramContext)
  {
    if (b != null) {
      return b;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (paramContext != null)
      {
        paramContext = paramContext.metaData.getString("TA_APPKEY");
        if (paramContext == null) {
          break label62;
        }
        b = paramContext;
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      cT.b("Could not read APPKEY meta-data from AndroidManifest.xml");
    }
    for (;;)
    {
      return null;
      label62:
      cT.b("Could not read APPKEY meta-data from AndroidManifest.xml");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */