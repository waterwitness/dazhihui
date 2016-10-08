package com.iflytek.sunflower.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.TrafficStats;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.iflytek.sunflower.config.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e
{
  /* Error */
  public static String a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 10
    //   3: invokevirtual 16	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 18	android/net/wifi/WifiManager
    //   9: astore_1
    //   10: aload_0
    //   11: ldc 20
    //   13: invokestatic 23	com/iflytek/sunflower/c/e:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   16: ifeq +47 -> 63
    //   19: aload_1
    //   20: invokevirtual 27	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   23: invokevirtual 33	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 39	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   31: istore_2
    //   32: iload_2
    //   33: ifne +30 -> 63
    //   36: ldc 41
    //   38: ldc 43
    //   40: invokestatic 48	com/iflytek/sunflower/c/g:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: areturn
    //   45: astore_1
    //   46: ldc 50
    //   48: astore_0
    //   49: ldc 41
    //   51: ldc 52
    //   53: aload_1
    //   54: invokestatic 55	com/iflytek/sunflower/c/g:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   57: aload_0
    //   58: areturn
    //   59: astore_1
    //   60: goto -11 -> 49
    //   63: ldc 50
    //   65: astore_0
    //   66: goto -30 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	paramContext	Context
    //   9	11	1	localWifiManager	android.net.wifi.WifiManager
    //   45	9	1	localException1	Exception
    //   59	1	1	localException2	Exception
    //   31	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	32	45	java/lang/Exception
    //   36	43	59	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    try
    {
      paramString = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).replaceAll("").trim();
      return paramString;
    }
    catch (Exception paramString)
    {
      g.d("Collector", "string contains special characters");
    }
    return "";
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    return paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName()) == 0;
  }
  
  public static String b(Context paramContext)
  {
    localObject1 = "";
    Object localObject4 = (TelephonyManager)paramContext.getSystemService("phone");
    Object localObject2 = localObject1;
    if (localObject4 != null) {}
    try
    {
      if (!a(paramContext, "android.permission.READ_PHONE_STATE")) {
        break label154;
      }
      localObject2 = ((TelephonyManager)localObject4).getDeviceId();
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool) {
        break label154;
      }
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        g.a("Collector", "Get IMEI failed.", localException);
        Object localObject3 = localObject1;
        continue;
        localObject1 = "";
      }
    }
    localObject2 = localObject1;
    localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      g.a("Collector", "Get IMEI failed. Try to use mac.");
      localObject4 = a(paramContext);
      localObject1 = localObject2;
      if (!TextUtils.isEmpty((CharSequence)localObject4)) {
        localObject1 = localObject4;
      }
    }
    localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      g.a("Collector", "Get mac failed. Try to use Secure.ANDROID_ID.");
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (!TextUtils.isEmpty(paramContext)) {
        localObject1 = paramContext;
      }
      g.a("Collector", "getDeviceId: Secure.ANDROID_ID: " + (String)localObject1);
      localObject2 = localObject1;
    }
    return (String)localObject2;
  }
  
  public static String c(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      boolean bool = TextUtils.isEmpty(paramContext);
      if (!bool) {
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      g.a("Collector", "Get carrier failed. ", paramContext);
    }
    return "";
  }
  
  public static Location d(Context paramContext)
  {
    try
    {
      LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
      if (a(paramContext, "android.permission.ACCESS_FINE_LOCATION"))
      {
        Location localLocation = localLocationManager.getLastKnownLocation("gps");
        if (localLocation != null)
        {
          g.a("Collector", "Get location from gps:" + localLocation.getLatitude() + "," + localLocation.getLongitude());
          return localLocation;
        }
      }
      if (a(paramContext, "android.permission.ACCESS_COARSE_LOCATION"))
      {
        paramContext = localLocationManager.getLastKnownLocation("network");
        if (paramContext != null)
        {
          g.a("Collector", "Get location from network:" + paramContext.getLatitude() + "," + paramContext.getLongitude());
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      g.a("Collector", "Get location failed", paramContext);
      return null;
    }
    g.a("Collector", "Get location failed, please check permission: ACCESS_COARSE_LOCATION,ACCESS_COARSE_LOCATION");
    return null;
  }
  
  public static long[] e(Context paramContext)
  {
    int i = paramContext.getApplicationInfo().uid;
    if (i == -1) {
      return null;
    }
    return new long[] { TrafficStats.getUidRxBytes(i), TrafficStats.getUidTxBytes(i) };
  }
  
  public static String f(Context paramContext)
  {
    String str = "";
    Object localObject1;
    if (!TextUtils.isEmpty(a.b)) {
      localObject1 = a.b;
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = str;
      try
      {
        Object localObject2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        paramContext = str;
        if (localObject2 == null) {
          break label146;
        }
        localObject1 = str;
        paramContext = str;
        if (((ApplicationInfo)localObject2).metaData == null) {
          break label146;
        }
        localObject1 = str;
        localObject2 = ((ApplicationInfo)localObject2).metaData.get("IFLYTEK_APPKEY").toString();
        localObject1 = str;
        paramContext = str;
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label146;
        }
        localObject1 = str;
        str = ((String)localObject2).trim();
        localObject1 = str;
        paramContext = str;
        if (!str.contains("'")) {
          break label146;
        }
        localObject1 = str;
        paramContext = str.replace("'", "");
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          paramContext = localException1;
          Exception localException2 = localException3;
        }
      }
      localObject1 = paramContext;
      try
      {
        if (!TextUtils.isEmpty(paramContext)) {
          continue;
        }
        g.d("Collector", "Can not find IFLYTEK_APPKEY meta-data from AndroidManifest.xml.");
        return paramContext;
      }
      catch (Exception localException1)
      {
        g.d("Collector", "Can not find IFLYTEK_APPKEY meta-data from AndroidManifest.xml.", localException1);
        return paramContext;
      }
    }
  }
  
  public static String g(Context paramContext)
  {
    Object localObject;
    if (!TextUtils.isEmpty(a.e)) {
      localObject = a.e;
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if ((paramContext == null) || (paramContext.metaData == null)) {
          break label102;
        }
        paramContext = paramContext.metaData.get("IFLYTEK_CHANNEL").toString();
        if (TextUtils.isEmpty(paramContext)) {
          break label102;
        }
        paramContext = paramContext.trim();
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          paramContext = "";
          continue;
          paramContext = "";
        }
      }
      localObject = paramContext;
      try
      {
        if (TextUtils.isEmpty(paramContext))
        {
          g.b("Collector", "Can not find IFLYTEK_CHANNEL meta-data from AndroidManifest.xml.");
          return paramContext;
        }
      }
      catch (Exception localException1) {}
    }
    g.b("Collector", "Can not find IFLYTEK_CHANNEL meta-data from AndroidManifest.xml.", localException1);
    return paramContext;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */