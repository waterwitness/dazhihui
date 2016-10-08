package com.alipay.d.a.a.b;

import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.alipay.d.a.a.a.a;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  private static b a = new b();
  
  public static b a()
  {
    return a;
  }
  
  public static String a(Context paramContext)
  {
    Object localObject;
    if (a(paramContext, "android.permission.READ_PHONE_STATE"))
    {
      localObject = "";
      return (String)localObject;
    }
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getDeviceId();
          localObject = paramContext;
          if (paramContext != null) {
            break;
          }
          return "";
        }
      }
      catch (Exception paramContext) {}
      paramContext = null;
    }
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    if (paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName()) == 0) {}
    for (int i = 1; i == 0; i = 0) {
      return true;
    }
    return false;
  }
  
  public static String b()
  {
    long l1 = 0L;
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      long l2 = localStatFs.getBlockSize();
      int i = localStatFs.getAvailableBlocks();
      l1 = i * l2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return String.valueOf(l1);
  }
  
  public static String b(Context paramContext)
  {
    Object localObject;
    if (a(paramContext, "android.permission.READ_PHONE_STATE"))
    {
      localObject = "";
      return (String)localObject;
    }
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getSubscriberId();
          localObject = paramContext;
          if (paramContext != null) {
            break;
          }
          return "";
        }
      }
      catch (Exception paramContext) {}
      paramContext = "";
    }
  }
  
  public static String c()
  {
    l2 = 0L;
    l1 = l2;
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        StatFs localStatFs = new StatFs(a.a().getPath());
        l1 = localStatFs.getBlockSize();
        int i = localStatFs.getAvailableBlocks();
        l1 = i * l1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l1 = l2;
      }
    }
    return String.valueOf(l1);
  }
  
  public static String c(Context paramContext)
  {
    int i = 0;
    try
    {
      int j = Settings.System.getInt(paramContext.getContentResolver(), "airplane_mode_on", 0);
      i = j;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    if (i == 1) {
      return "1";
    }
    return "0";
  }
  
  /* Error */
  public static String d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 119	java/io/FileInputStream
    //   8: dup
    //   9: new 64	java/io/File
    //   12: dup
    //   13: ldc 121
    //   15: invokespecial 122	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: invokespecial 125	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: astore_0
    //   22: new 127	java/io/InputStreamReader
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 130	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   30: astore_2
    //   31: new 132	java/io/LineNumberReader
    //   34: dup
    //   35: aload_2
    //   36: invokespecial 135	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   39: astore_3
    //   40: iconst_1
    //   41: istore 5
    //   43: iload 5
    //   45: bipush 100
    //   47: if_icmpge +243 -> 290
    //   50: aload_3
    //   51: invokevirtual 138	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull +234 -> 290
    //   59: aload_1
    //   60: ldc -116
    //   62: invokevirtual 144	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   65: iflt +48 -> 113
    //   68: aload_1
    //   69: aload_1
    //   70: ldc -110
    //   72: invokevirtual 144	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   75: iconst_1
    //   76: iadd
    //   77: aload_1
    //   78: invokevirtual 149	java/lang/String:length	()I
    //   81: invokevirtual 153	java/lang/String:substring	(II)Ljava/lang/String;
    //   84: invokevirtual 156	java/lang/String:trim	()Ljava/lang/String;
    //   87: astore_1
    //   88: aload_3
    //   89: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   92: aload_2
    //   93: invokevirtual 160	java/io/InputStreamReader:close	()V
    //   96: aload_0
    //   97: invokevirtual 161	java/io/FileInputStream:close	()V
    //   100: aload_1
    //   101: astore_0
    //   102: aload_0
    //   103: astore_1
    //   104: aload_0
    //   105: ifnonnull +6 -> 111
    //   108: ldc 26
    //   110: astore_1
    //   111: aload_1
    //   112: areturn
    //   113: iload 5
    //   115: iconst_1
    //   116: iadd
    //   117: istore 5
    //   119: goto -76 -> 43
    //   122: astore_0
    //   123: aload_1
    //   124: astore_0
    //   125: goto -23 -> 102
    //   128: astore_0
    //   129: aconst_null
    //   130: astore_0
    //   131: aconst_null
    //   132: astore_1
    //   133: aload_3
    //   134: astore_2
    //   135: aload_0
    //   136: ifnull +7 -> 143
    //   139: aload_0
    //   140: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   143: aload_2
    //   144: ifnull +7 -> 151
    //   147: aload_2
    //   148: invokevirtual 160	java/io/InputStreamReader:close	()V
    //   151: aload_1
    //   152: ifnull +132 -> 284
    //   155: aload_1
    //   156: invokevirtual 161	java/io/FileInputStream:close	()V
    //   159: ldc -93
    //   161: astore_0
    //   162: goto -60 -> 102
    //   165: astore_0
    //   166: ldc -93
    //   168: astore_0
    //   169: goto -67 -> 102
    //   172: astore_1
    //   173: aconst_null
    //   174: astore_2
    //   175: aconst_null
    //   176: astore_0
    //   177: aload 4
    //   179: astore_3
    //   180: aload_3
    //   181: ifnull +7 -> 188
    //   184: aload_3
    //   185: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   188: aload_2
    //   189: ifnull +7 -> 196
    //   192: aload_2
    //   193: invokevirtual 160	java/io/InputStreamReader:close	()V
    //   196: aload_0
    //   197: ifnull +7 -> 204
    //   200: aload_0
    //   201: invokevirtual 161	java/io/FileInputStream:close	()V
    //   204: aload_1
    //   205: athrow
    //   206: astore_3
    //   207: goto -115 -> 92
    //   210: astore_2
    //   211: goto -115 -> 96
    //   214: astore_0
    //   215: goto -72 -> 143
    //   218: astore_0
    //   219: goto -68 -> 151
    //   222: astore_3
    //   223: goto -35 -> 188
    //   226: astore_2
    //   227: goto -31 -> 196
    //   230: astore_0
    //   231: goto -27 -> 204
    //   234: astore_1
    //   235: aconst_null
    //   236: astore_2
    //   237: aload 4
    //   239: astore_3
    //   240: goto -60 -> 180
    //   243: astore_1
    //   244: aload 4
    //   246: astore_3
    //   247: goto -67 -> 180
    //   250: astore_1
    //   251: goto -71 -> 180
    //   254: astore_1
    //   255: aconst_null
    //   256: astore_2
    //   257: aload_0
    //   258: astore_1
    //   259: aload_2
    //   260: astore_0
    //   261: aload_3
    //   262: astore_2
    //   263: goto -128 -> 135
    //   266: astore_1
    //   267: aconst_null
    //   268: astore_3
    //   269: aload_0
    //   270: astore_1
    //   271: aload_3
    //   272: astore_0
    //   273: goto -138 -> 135
    //   276: astore_1
    //   277: aload_0
    //   278: astore_1
    //   279: aload_3
    //   280: astore_0
    //   281: goto -146 -> 135
    //   284: ldc -93
    //   286: astore_0
    //   287: goto -185 -> 102
    //   290: ldc -93
    //   292: astore_1
    //   293: goto -205 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	84	0	localObject1	Object
    //   122	1	0	localException1	Exception
    //   124	1	0	localObject2	Object
    //   128	1	0	localException2	Exception
    //   130	32	0	str1	String
    //   165	1	0	localException3	Exception
    //   168	33	0	str2	String
    //   214	1	0	localException4	Exception
    //   218	1	0	localException5	Exception
    //   230	28	0	localException6	Exception
    //   260	27	0	localObject3	Object
    //   54	102	1	localObject4	Object
    //   172	33	1	localObject5	Object
    //   234	1	1	localObject6	Object
    //   243	1	1	localObject7	Object
    //   250	1	1	localObject8	Object
    //   254	1	1	localException7	Exception
    //   258	1	1	localException8	Exception
    //   266	1	1	localException9	Exception
    //   270	1	1	localObject9	Object
    //   276	1	1	localException10	Exception
    //   278	15	1	localObject10	Object
    //   30	163	2	localObject11	Object
    //   210	1	2	localException11	Exception
    //   226	1	2	localException12	Exception
    //   236	27	2	localObject12	Object
    //   4	181	3	localObject13	Object
    //   206	1	3	localException13	Exception
    //   222	1	3	localException14	Exception
    //   239	41	3	localObject14	Object
    //   1	244	4	localObject15	Object
    //   41	77	5	i	int
    // Exception table:
    //   from	to	target	type
    //   96	100	122	java/lang/Exception
    //   5	22	128	java/lang/Exception
    //   155	159	165	java/lang/Exception
    //   5	22	172	finally
    //   88	92	206	java/lang/Exception
    //   92	96	210	java/lang/Exception
    //   139	143	214	java/lang/Exception
    //   147	151	218	java/lang/Exception
    //   184	188	222	java/lang/Exception
    //   192	196	226	java/lang/Exception
    //   200	204	230	java/lang/Exception
    //   22	31	234	finally
    //   31	40	243	finally
    //   50	55	250	finally
    //   59	88	250	finally
    //   22	31	254	java/lang/Exception
    //   31	40	266	java/lang/Exception
    //   50	55	276	java/lang/Exception
    //   59	88	276	java/lang/Exception
  }
  
  public static String d(Context paramContext)
  {
    int i = 1;
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        paramContext = (AudioManager)paramContext.getSystemService("audio");
        if (paramContext.getRingerMode() != 0) {
          continue;
        }
        int j = paramContext.getStreamVolume(0);
        int k = paramContext.getStreamVolume(1);
        int m = paramContext.getStreamVolume(2);
        int n = paramContext.getStreamVolume(3);
        int i1 = paramContext.getStreamVolume(4);
        localJSONObject.put("ringermode", String.valueOf(i));
        localJSONObject.put("call", String.valueOf(j));
        localJSONObject.put("system", String.valueOf(k));
        localJSONObject.put("ring", String.valueOf(m));
        localJSONObject.put("music", String.valueOf(n));
        localJSONObject.put("alarm", String.valueOf(i1));
      }
      catch (Exception paramContext)
      {
        continue;
      }
      return localJSONObject.toString();
      i = 0;
    }
  }
  
  public static String e(Context paramContext)
  {
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getNetworkOperatorName();
          Object localObject;
          if (paramContext != null)
          {
            localObject = paramContext;
            if (!"null".equals(paramContext)) {}
          }
          else
          {
            localObject = "";
          }
          return (String)localObject;
        }
      }
      catch (Exception paramContext) {}
      paramContext = null;
    }
  }
  
  public static String f()
  {
    String str = w();
    if (!a.a(str)) {
      return str;
    }
    return x();
  }
  
  public static String f(Context paramContext)
  {
    Object localObject;
    if (a(paramContext, "android.permission.READ_PHONE_STATE"))
    {
      localObject = "";
      return (String)localObject;
    }
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null)
        {
          paramContext = paramContext.getLine1Number();
          localObject = paramContext;
          if (paramContext != null) {
            break;
          }
          return "";
        }
      }
      catch (Exception paramContext) {}
      paramContext = "";
    }
  }
  
  /* Error */
  public static String g()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 221	java/io/FileReader
    //   5: dup
    //   6: ldc 121
    //   8: invokespecial 222	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   11: astore_0
    //   12: new 224	java/io/BufferedReader
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 225	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   25: ldc -28
    //   27: iconst_2
    //   28: invokevirtual 232	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +23 -> 56
    //   36: aload_1
    //   37: arraylength
    //   38: iconst_1
    //   39: if_icmple +17 -> 56
    //   42: aload_1
    //   43: iconst_1
    //   44: aaload
    //   45: astore_1
    //   46: aload_0
    //   47: invokevirtual 233	java/io/FileReader:close	()V
    //   50: aload_2
    //   51: invokevirtual 234	java/io/BufferedReader:close	()V
    //   54: aload_1
    //   55: areturn
    //   56: aload_0
    //   57: invokevirtual 233	java/io/FileReader:close	()V
    //   60: aload_2
    //   61: invokevirtual 234	java/io/BufferedReader:close	()V
    //   64: ldc 26
    //   66: areturn
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_0
    //   70: aload_0
    //   71: ifnull +7 -> 78
    //   74: aload_0
    //   75: invokevirtual 233	java/io/FileReader:close	()V
    //   78: aload_1
    //   79: ifnull -15 -> 64
    //   82: aload_1
    //   83: invokevirtual 234	java/io/BufferedReader:close	()V
    //   86: goto -22 -> 64
    //   89: astore_0
    //   90: goto -26 -> 64
    //   93: astore_1
    //   94: aconst_null
    //   95: astore_0
    //   96: aconst_null
    //   97: astore_2
    //   98: aload_0
    //   99: ifnull +7 -> 106
    //   102: aload_0
    //   103: invokevirtual 233	java/io/FileReader:close	()V
    //   106: aload_2
    //   107: ifnull +7 -> 114
    //   110: aload_2
    //   111: invokevirtual 234	java/io/BufferedReader:close	()V
    //   114: aload_1
    //   115: athrow
    //   116: astore_0
    //   117: goto -67 -> 50
    //   120: astore_0
    //   121: aload_1
    //   122: areturn
    //   123: astore_0
    //   124: goto -64 -> 60
    //   127: astore_0
    //   128: goto -64 -> 64
    //   131: astore_0
    //   132: goto -54 -> 78
    //   135: astore_0
    //   136: goto -30 -> 106
    //   139: astore_0
    //   140: goto -26 -> 114
    //   143: astore_1
    //   144: aconst_null
    //   145: astore_2
    //   146: goto -48 -> 98
    //   149: astore_1
    //   150: goto -52 -> 98
    //   153: astore_2
    //   154: goto -84 -> 70
    //   157: astore_1
    //   158: aload_2
    //   159: astore_1
    //   160: goto -90 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	46	0	localFileReader	java.io.FileReader
    //   67	1	0	localException1	Exception
    //   69	6	0	localObject1	Object
    //   89	1	0	localException2	Exception
    //   95	8	0	localObject2	Object
    //   116	1	0	localException3	Exception
    //   120	1	0	localException4	Exception
    //   123	1	0	localException5	Exception
    //   127	1	0	localException6	Exception
    //   131	1	0	localException7	Exception
    //   135	1	0	localException8	Exception
    //   139	1	0	localException9	Exception
    //   1	82	1	localObject3	Object
    //   93	29	1	str	String
    //   143	1	1	localObject4	Object
    //   149	1	1	localObject5	Object
    //   157	1	1	localException10	Exception
    //   159	1	1	localObject6	Object
    //   20	126	2	localBufferedReader	java.io.BufferedReader
    //   153	6	2	localException11	Exception
    // Exception table:
    //   from	to	target	type
    //   2	12	67	java/lang/Exception
    //   82	86	89	java/lang/Exception
    //   2	12	93	finally
    //   46	50	116	java/lang/Exception
    //   50	54	120	java/lang/Exception
    //   56	60	123	java/lang/Exception
    //   60	64	127	java/lang/Exception
    //   74	78	131	java/lang/Exception
    //   102	106	135	java/lang/Exception
    //   110	114	139	java/lang/Exception
    //   12	21	143	finally
    //   21	32	149	finally
    //   36	42	149	finally
    //   12	21	153	java/lang/Exception
    //   21	32	157	java/lang/Exception
    //   36	42	157	java/lang/Exception
  }
  
  public static String g(Context paramContext)
  {
    Object localObject;
    if (paramContext != null) {
      try
      {
        paramContext = (SensorManager)paramContext.getSystemService("sensor");
        if (paramContext != null)
        {
          localObject = paramContext.getSensorList(-1);
          if ((localObject != null) && (((List)localObject).size() > 0))
          {
            paramContext = new StringBuilder();
            localObject = ((List)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              Sensor localSensor = (Sensor)((Iterator)localObject).next();
              paramContext.append(localSensor.getName());
              paramContext.append(localSensor.getVersion());
              paramContext.append(localSensor.getVendor());
            }
          }
        }
        paramContext = null;
      }
      catch (Exception paramContext) {}
    }
    for (;;)
    {
      localObject = paramContext;
      if (paramContext == null) {
        localObject = "";
      }
      return (String)localObject;
      paramContext = a.d(paramContext.toString());
    }
  }
  
  /* Error */
  public static String h()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: lconst_0
    //   3: lstore 7
    //   5: new 221	java/io/FileReader
    //   8: dup
    //   9: ldc_w 289
    //   12: invokespecial 222	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   15: astore_1
    //   16: new 224	java/io/BufferedReader
    //   19: dup
    //   20: aload_1
    //   21: sipush 8192
    //   24: invokespecial 292	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   27: astore_2
    //   28: aload_2
    //   29: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   32: astore_0
    //   33: lload 7
    //   35: lstore 5
    //   37: aload_0
    //   38: ifnull +22 -> 60
    //   41: aload_0
    //   42: ldc_w 294
    //   45: invokevirtual 297	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   48: iconst_1
    //   49: aaload
    //   50: invokestatic 302	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   53: istore 4
    //   55: iload 4
    //   57: i2l
    //   58: lstore 5
    //   60: aload_1
    //   61: invokevirtual 233	java/io/FileReader:close	()V
    //   64: aload_2
    //   65: invokevirtual 234	java/io/BufferedReader:close	()V
    //   68: lload 5
    //   70: invokestatic 83	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   73: areturn
    //   74: astore_1
    //   75: aconst_null
    //   76: astore_1
    //   77: aload_1
    //   78: ifnull +7 -> 85
    //   81: aload_1
    //   82: invokevirtual 233	java/io/FileReader:close	()V
    //   85: lload 7
    //   87: lstore 5
    //   89: aload_0
    //   90: ifnull -22 -> 68
    //   93: aload_0
    //   94: invokevirtual 234	java/io/BufferedReader:close	()V
    //   97: lload 7
    //   99: lstore 5
    //   101: goto -33 -> 68
    //   104: astore_0
    //   105: lload 7
    //   107: lstore 5
    //   109: goto -41 -> 68
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_3
    //   115: aconst_null
    //   116: astore_1
    //   117: aload_3
    //   118: ifnull +7 -> 125
    //   121: aload_3
    //   122: invokevirtual 233	java/io/FileReader:close	()V
    //   125: aload_1
    //   126: ifnull +7 -> 133
    //   129: aload_1
    //   130: invokevirtual 234	java/io/BufferedReader:close	()V
    //   133: aload_0
    //   134: athrow
    //   135: astore_0
    //   136: goto -72 -> 64
    //   139: astore_0
    //   140: goto -72 -> 68
    //   143: astore_1
    //   144: goto -59 -> 85
    //   147: astore_2
    //   148: goto -23 -> 125
    //   151: astore_1
    //   152: goto -19 -> 133
    //   155: astore_0
    //   156: aconst_null
    //   157: astore_2
    //   158: aload_1
    //   159: astore_3
    //   160: aload_2
    //   161: astore_1
    //   162: goto -45 -> 117
    //   165: astore_0
    //   166: aload_1
    //   167: astore_3
    //   168: aload_2
    //   169: astore_1
    //   170: goto -53 -> 117
    //   173: astore_2
    //   174: goto -97 -> 77
    //   177: astore_0
    //   178: aload_2
    //   179: astore_0
    //   180: goto -103 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	93	0	str	String
    //   104	1	0	localException1	Exception
    //   112	22	0	localObject1	Object
    //   135	1	0	localException2	Exception
    //   139	1	0	localException3	Exception
    //   155	1	0	localObject2	Object
    //   165	1	0	localObject3	Object
    //   177	1	0	localException4	Exception
    //   179	1	0	localObject4	Object
    //   15	46	1	localFileReader	java.io.FileReader
    //   74	1	1	localException5	Exception
    //   76	54	1	localObject5	Object
    //   143	1	1	localException6	Exception
    //   151	8	1	localException7	Exception
    //   161	9	1	localObject6	Object
    //   27	38	2	localBufferedReader	java.io.BufferedReader
    //   147	1	2	localException8	Exception
    //   157	12	2	localObject7	Object
    //   173	6	2	localException9	Exception
    //   114	54	3	localObject8	Object
    //   53	3	4	i	int
    //   35	73	5	l1	long
    //   3	103	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   5	16	74	java/lang/Exception
    //   93	97	104	java/lang/Exception
    //   5	16	112	finally
    //   60	64	135	java/lang/Exception
    //   64	68	139	java/lang/Exception
    //   81	85	143	java/lang/Exception
    //   121	125	147	java/lang/Exception
    //   129	133	151	java/lang/Exception
    //   16	28	155	finally
    //   28	33	165	finally
    //   41	55	165	finally
    //   16	28	173	java/lang/Exception
    //   28	33	177	java/lang/Exception
    //   41	55	177	java/lang/Exception
  }
  
  public static String h(Context paramContext)
  {
    localJSONArray = new JSONArray();
    if (paramContext != null) {
      try
      {
        paramContext = (SensorManager)paramContext.getSystemService("sensor");
        if (paramContext != null)
        {
          paramContext = paramContext.getSensorList(-1);
          if ((paramContext != null) && (paramContext.size() > 0))
          {
            paramContext = paramContext.iterator();
            while (paramContext.hasNext())
            {
              Sensor localSensor = (Sensor)paramContext.next();
              if (localSensor != null)
              {
                JSONObject localJSONObject = new JSONObject();
                localJSONObject.put("name", localSensor.getName());
                localJSONObject.put("version", localSensor.getVersion());
                localJSONObject.put("vendor", localSensor.getVendor());
                localJSONArray.put(localJSONObject);
              }
            }
          }
        }
        return localJSONArray.toString();
      }
      catch (Exception paramContext) {}
    }
  }
  
  public static String i()
  {
    long l1 = 0L;
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      long l2 = localStatFs.getBlockSize();
      int i = localStatFs.getBlockCount();
      l1 = i * l2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return String.valueOf(l1);
  }
  
  public static String i(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getResources().getDisplayMetrics();
      paramContext = Integer.toString(paramContext.widthPixels) + "*" + Integer.toString(paramContext.heightPixels);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String j()
  {
    l2 = 0L;
    l1 = l2;
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        l1 = localStatFs.getBlockSize();
        int i = localStatFs.getBlockCount();
        l1 = i * l1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l1 = l2;
      }
    }
    return String.valueOf(l1);
  }
  
  public static String j(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getResources().getDisplayMetrics();
      paramContext = paramContext.widthPixels;
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String k()
  {
    try
    {
      Object localObject1 = Class.forName("android.os.SystemProperties");
      Object localObject2 = ((Class)localObject1).newInstance();
      localObject1 = (String)((Class)localObject1).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject2, new Object[] { "gsm.version.baseband", "no message" });
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "";
      }
      return (String)localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "";
      }
    }
  }
  
  public static String k(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getResources().getDisplayMetrics();
      paramContext = paramContext.heightPixels;
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String l()
  {
    Object localObject1 = "";
    try
    {
      localObject2 = Build.SERIAL;
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      Object localObject2;
      for (;;) {}
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    return (String)localObject2;
  }
  
  public static String l(Context paramContext)
  {
    Object localObject;
    if (a(paramContext, "android.permission.ACCESS_WIFI_STATE")) {
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        if (paramContext == null) {}
      }
      catch (Exception paramContext)
      {
        try
        {
          if (paramContext.length() != 0)
          {
            localObject = paramContext;
            if (!"02:00:00:00:00:00".equals(paramContext)) {
              continue;
            }
          }
          localObject = v();
          return (String)localObject;
        }
        catch (Exception localException) {}
        paramContext = paramContext;
        return "";
      }
    }
    return paramContext;
  }
  
  public static String m()
  {
    Object localObject1 = "";
    try
    {
      localObject2 = Locale.getDefault().toString();
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      Object localObject2;
      for (;;) {}
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    return (String)localObject2;
  }
  
  /* Error */
  public static String m(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 21
    //   3: invokestatic 24	com/alipay/d/a/a/b/b:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   6: ifeq +8 -> 14
    //   9: ldc 26
    //   11: astore_1
    //   12: aload_1
    //   13: areturn
    //   14: aload_0
    //   15: ldc 28
    //   17: invokevirtual 34	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   20: checkcast 36	android/telephony/TelephonyManager
    //   23: invokevirtual 415	android/telephony/TelephonyManager:getSimSerialNumber	()Ljava/lang/String;
    //   26: astore_0
    //   27: aload_0
    //   28: ifnull +18 -> 46
    //   31: aload_0
    //   32: astore_1
    //   33: aload_0
    //   34: ifnull -22 -> 12
    //   37: aload_0
    //   38: astore_1
    //   39: aload_0
    //   40: invokevirtual 149	java/lang/String:length	()I
    //   43: ifne -31 -> 12
    //   46: ldc 26
    //   48: areturn
    //   49: astore_0
    //   50: ldc 26
    //   52: areturn
    //   53: astore_1
    //   54: aload_0
    //   55: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	paramContext	Context
    //   11	28	1	localObject	Object
    //   53	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   14	27	49	java/lang/Exception
    //   39	46	53	java/lang/Exception
  }
  
  public static String n()
  {
    Object localObject1 = "";
    try
    {
      localObject2 = TimeZone.getDefault().getDisplayName(false, 0);
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      Object localObject2;
      for (;;) {}
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    return (String)localObject2;
  }
  
  public static String n(Context paramContext)
  {
    Object localObject = "";
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      localObject = paramContext;
      if (paramContext == null) {
        localObject = "";
      }
      return (String)localObject;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static String o()
  {
    try
    {
      long l = System.currentTimeMillis() - SystemClock.elapsedRealtime();
      String str = l - l % 1000L;
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String o(Context paramContext)
  {
    if (a(paramContext, "android.permission.BLUETOOTH")) {
      paramContext = "";
    }
    String str2;
    for (;;)
    {
      return paramContext;
      str2 = y();
      if (str2 != null) {}
      try
      {
        String str1;
        if (str2.length() != 0)
        {
          str1 = str2;
          if (!"02:00:00:00:00:00".equals(str2)) {}
        }
        else
        {
          str1 = Settings.Secure.getString(paramContext.getContentResolver(), "bluetooth_address");
        }
        paramContext = str1;
        if (str1 == null) {
          return "";
        }
      }
      catch (Exception paramContext) {}
    }
    return str2;
  }
  
  public static String p()
  {
    try
    {
      String str = SystemClock.elapsedRealtime();
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String p(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        int i = paramContext.getNetworkType();
        return String.valueOf(i);
      }
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static String q()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("00" + ":");
        if (i < 7) {
          if (new File(new String[] { "/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd" }[i]).exists()) {
            localStringBuilder.append("1");
          } else {
            localStringBuilder.append("0");
          }
        }
      }
      catch (Exception localException)
      {
        return "";
      }
      String str = localException.toString();
      return str;
      i += 1;
    }
  }
  
  public static String q(Context paramContext)
  {
    Object localObject;
    if (a(paramContext, "android.permission.ACCESS_WIFI_STATE")) {
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        paramContext = (WifiManager)paramContext.getSystemService("wifi");
        if (paramContext.isWifiEnabled())
        {
          paramContext = paramContext.getConnectionInfo().getBSSID();
          localObject = paramContext;
          if (paramContext != null) {
            continue;
          }
          return "";
        }
      }
      catch (Throwable paramContext)
      {
        for (;;)
        {
          paramContext = "";
        }
      }
    }
  }
  
  public static String r()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("00");
    localStringBuilder.append(":");
    int i = 0;
    for (;;)
    {
      if (i <= 0)
      {
        String str = new String[] { "dalvik.system.Taint" }[0];
        try
        {
          Class.forName(str);
          localStringBuilder.append("1");
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localStringBuilder.append("0");
          }
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String r(Context paramContext)
  {
    for (;;)
    {
      int i;
      try
      {
        if (a(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
        {
          paramContext = "";
          String str = z();
          if ((!a.b(paramContext)) || (!a.b(str))) {
            break label145;
          }
          return paramContext + ":" + z();
        }
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (paramContext == null)
        {
          paramContext = null;
          continue;
        }
        if (paramContext.getType() == 1)
        {
          paramContext = "WIFI";
          continue;
        }
        if (paramContext.getType() != 0) {
          break label148;
        }
        i = paramContext.getSubtype();
        if ((i == 4) || (i == 1) || (i == 2) || (i == 7)) {
          break label153;
        }
        if (i != 11) {
          break label160;
        }
      }
      catch (Exception paramContext) {}
      paramContext = "UNKNOW";
      continue;
      label145:
      return "";
      label148:
      paramContext = null;
      continue;
      label153:
      paramContext = "2G";
      continue;
      label160:
      if ((i == 3) || (i == 5) || (i == 6) || (i == 8) || (i == 9) || (i == 10) || (i == 12) || (i == 14) || (i == 15)) {
        paramContext = "3G";
      } else if (i == 13) {
        paramContext = "4G";
      }
    }
  }
  
  /* Error */
  public static String s()
  {
    // Byte code:
    //   0: new 249	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: new 528	java/util/LinkedHashMap
    //   12: dup
    //   13: invokespecial 529	java/util/LinkedHashMap:<init>	()V
    //   16: astore_3
    //   17: aload_3
    //   18: ldc_w 531
    //   21: ldc_w 533
    //   24: invokeinterface 538 3 0
    //   29: pop
    //   30: aload_3
    //   31: ldc_w 540
    //   34: ldc_w 542
    //   37: invokeinterface 538 3 0
    //   42: pop
    //   43: aload_3
    //   44: ldc 121
    //   46: ldc_w 542
    //   49: invokeinterface 538 3 0
    //   54: pop
    //   55: aload 4
    //   57: new 249	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   64: ldc_w 464
    //   67: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc -110
    //   72: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_3
    //   83: invokeinterface 546 1 0
    //   88: invokeinterface 549 1 0
    //   93: astore 5
    //   95: aload 5
    //   97: invokeinterface 260 1 0
    //   102: ifeq +141 -> 243
    //   105: aload 5
    //   107: invokeinterface 264 1 0
    //   112: checkcast 79	java/lang/String
    //   115: astore 6
    //   117: aconst_null
    //   118: astore_2
    //   119: new 132	java/io/LineNumberReader
    //   122: dup
    //   123: new 127	java/io/InputStreamReader
    //   126: dup
    //   127: new 119	java/io/FileInputStream
    //   130: dup
    //   131: aload 6
    //   133: invokespecial 550	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   136: invokespecial 130	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   139: invokespecial 135	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   142: astore_1
    //   143: aload_1
    //   144: invokevirtual 138	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   147: astore_2
    //   148: aload_2
    //   149: ifnull +116 -> 265
    //   152: aload_2
    //   153: invokevirtual 553	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   156: aload_3
    //   157: aload 6
    //   159: invokeinterface 556 2 0
    //   164: checkcast 558	java/lang/CharSequence
    //   167: invokevirtual 562	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   170: istore 7
    //   172: iload 7
    //   174: ifeq -31 -> 143
    //   177: bipush 49
    //   179: istore_0
    //   180: aload 4
    //   182: iload_0
    //   183: invokevirtual 565	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_1
    //   188: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   191: goto -96 -> 95
    //   194: astore_1
    //   195: goto -100 -> 95
    //   198: astore_1
    //   199: aconst_null
    //   200: astore_1
    //   201: aload 4
    //   203: bipush 48
    //   205: invokevirtual 565	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: ifnull -115 -> 95
    //   213: aload_1
    //   214: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   217: goto -122 -> 95
    //   220: astore_1
    //   221: goto -126 -> 95
    //   224: astore_1
    //   225: aload 4
    //   227: bipush 48
    //   229: invokevirtual 565	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload_2
    //   234: ifnull +7 -> 241
    //   237: aload_2
    //   238: invokevirtual 159	java/io/LineNumberReader:close	()V
    //   241: aload_1
    //   242: athrow
    //   243: aload 4
    //   245: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   248: areturn
    //   249: astore_2
    //   250: goto -9 -> 241
    //   253: astore_3
    //   254: aload_1
    //   255: astore_2
    //   256: aload_3
    //   257: astore_1
    //   258: goto -33 -> 225
    //   261: astore_2
    //   262: goto -61 -> 201
    //   265: bipush 48
    //   267: istore_0
    //   268: goto -88 -> 180
    // Local variable table:
    //   start	length	slot	name	signature
    //   179	89	0	c	char
    //   142	46	1	localLineNumberReader	java.io.LineNumberReader
    //   194	1	1	localException1	Exception
    //   198	1	1	localException2	Exception
    //   200	14	1	localObject1	Object
    //   220	1	1	localException3	Exception
    //   224	31	1	localObject2	Object
    //   257	1	1	localObject3	Object
    //   118	120	2	str1	String
    //   249	1	2	localException4	Exception
    //   255	1	2	localObject4	Object
    //   261	1	2	localException5	Exception
    //   16	141	3	localLinkedHashMap	LinkedHashMap
    //   253	4	3	localObject5	Object
    //   7	237	4	localStringBuilder	StringBuilder
    //   93	13	5	localIterator	Iterator
    //   115	43	6	str2	String
    //   170	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   187	191	194	java/lang/Exception
    //   119	143	198	java/lang/Exception
    //   213	217	220	java/lang/Exception
    //   119	143	224	finally
    //   237	241	249	java/lang/Exception
    //   143	148	253	finally
    //   152	172	253	finally
    //   143	148	261	java/lang/Exception
    //   152	172	261	java/lang/Exception
  }
  
  public static String s(Context paramContext)
  {
    if (!((KeyguardManager)paramContext.getSystemService("keyguard")).isKeyguardSecure()) {
      return "0:0";
    }
    int i = 0;
    long l1 = 0L;
    while (i < 5)
    {
      paramContext = new String[] { "/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key" }[i];
      long l2 = -1L;
      try
      {
        long l3 = new File(paramContext).lastModified();
        l2 = l3;
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
      l1 = Math.max(l2, l1);
      i += 1;
    }
    return "1:" + l1;
  }
  
  public static String t()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("00" + ":");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("BRAND", "generic");
    localLinkedHashMap.put("BOARD", "unknown");
    localLinkedHashMap.put("DEVICE", "generic");
    localLinkedHashMap.put("HARDWARE", "goldfish");
    localLinkedHashMap.put("PRODUCT", "sdk");
    localLinkedHashMap.put("MODEL", "sdk");
    Iterator localIterator = localLinkedHashMap.keySet().iterator();
    String str2;
    if (localIterator.hasNext()) {
      str2 = (String)localIterator.next();
    }
    for (;;)
    {
      try
      {
        String str1 = (String)Build.class.getField(str2).get(null);
        str2 = (String)localLinkedHashMap.get(str2);
        if (str1 == null) {
          break label254;
        }
        str1 = str1.toLowerCase();
        if (str1 == null) {
          break label248;
        }
        boolean bool = str1.contains(str2);
        if (!bool) {
          break label248;
        }
        c = '1';
        localStringBuilder.append(c);
        break;
      }
      catch (Exception localException)
      {
        localStringBuilder.append('0');
        break;
      }
      finally
      {
        localStringBuilder.append('0');
      }
      return localStringBuilder.toString();
      label248:
      char c = '0';
      continue;
      label254:
      Object localObject2 = null;
    }
  }
  
  public static String t(Context paramContext)
  {
    for (;;)
    {
      try
      {
        paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        j = paramContext.getIntExtra("level", -1);
        i = paramContext.getIntExtra("status", -1);
        if (i == 2) {
          break label90;
        }
        if (i != 5) {
          break label95;
        }
      }
      catch (Exception paramContext)
      {
        int j;
        StringBuilder localStringBuilder;
        return "";
      }
      localStringBuilder = new StringBuilder();
      if (i != 0)
      {
        paramContext = "1";
        return paramContext + ":" + j;
      }
      paramContext = "0";
      continue;
      label90:
      int i = 1;
      continue;
      label95:
      i = 0;
    }
  }
  
  public static String u()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("00" + ":");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("ro.hardware", "goldfish");
    localLinkedHashMap.put("ro.kernel.qemu", "1");
    localLinkedHashMap.put("ro.product.device", "generic");
    localLinkedHashMap.put("ro.product.model", "sdk");
    localLinkedHashMap.put("ro.product.brand", "generic");
    localLinkedHashMap.put("ro.product.name", "sdk");
    localLinkedHashMap.put("ro.build.fingerprint", "test-keys");
    localLinkedHashMap.put("ro.product.manufacturer", "unknow");
    Iterator localIterator = localLinkedHashMap.keySet().iterator();
    if (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      String str1 = (String)localLinkedHashMap.get(str2);
      str2 = a.b(str2, "");
      if ((str2 == null) || (!str2.contains(str1))) {
        break label231;
      }
    }
    label231:
    for (char c = '1';; c = '0')
    {
      localStringBuilder.append(c);
      break;
      return localStringBuilder.toString();
    }
  }
  
  private static String v()
  {
    try
    {
      Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces());
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (NetworkInterface)((Iterator)localObject1).next();
          if ((localObject2 != null) && (((NetworkInterface)localObject2).getName() != null) && (((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0")))
          {
            localObject1 = ((NetworkInterface)localObject2).getHardwareAddress();
            if (localObject1 == null) {
              return "02:00:00:00:00:00";
            }
            localObject2 = new StringBuilder();
            int j = localObject1.length;
            int i = 0;
            while (i < j)
            {
              ((StringBuilder)localObject2).append(String.format("%02X:", new Object[] { Integer.valueOf(localObject1[i] & 0xFF) }));
              i += 1;
            }
            if (((StringBuilder)localObject2).length() > 0) {
              ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
            }
            localObject1 = ((StringBuilder)localObject2).toString();
            return (String)localObject1;
          }
        }
      }
    }
    catch (Exception localException) {}
    return "02:00:00:00:00:00";
  }
  
  /* Error */
  private static String w()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 221	java/io/FileReader
    //   5: dup
    //   6: ldc_w 704
    //   9: invokespecial 222	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   12: astore_0
    //   13: new 224	java/io/BufferedReader
    //   16: dup
    //   17: aload_0
    //   18: sipush 8192
    //   21: invokespecial 292	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   24: astore_2
    //   25: aload_2
    //   26: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_1
    //   31: invokestatic 212	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   34: ifne +18 -> 52
    //   37: aload_1
    //   38: invokevirtual 156	java/lang/String:trim	()Ljava/lang/String;
    //   41: astore_1
    //   42: aload_2
    //   43: invokevirtual 234	java/io/BufferedReader:close	()V
    //   46: aload_0
    //   47: invokevirtual 233	java/io/FileReader:close	()V
    //   50: aload_1
    //   51: areturn
    //   52: aload_2
    //   53: invokevirtual 234	java/io/BufferedReader:close	()V
    //   56: aload_0
    //   57: invokevirtual 233	java/io/FileReader:close	()V
    //   60: ldc 26
    //   62: areturn
    //   63: astore_0
    //   64: aconst_null
    //   65: astore_0
    //   66: aload_1
    //   67: ifnull +7 -> 74
    //   70: aload_1
    //   71: invokevirtual 234	java/io/BufferedReader:close	()V
    //   74: aload_0
    //   75: ifnull -15 -> 60
    //   78: aload_0
    //   79: invokevirtual 233	java/io/FileReader:close	()V
    //   82: goto -22 -> 60
    //   85: astore_0
    //   86: goto -26 -> 60
    //   89: astore_1
    //   90: aconst_null
    //   91: astore_0
    //   92: aconst_null
    //   93: astore_2
    //   94: aload_2
    //   95: ifnull +7 -> 102
    //   98: aload_2
    //   99: invokevirtual 234	java/io/BufferedReader:close	()V
    //   102: aload_0
    //   103: ifnull +7 -> 110
    //   106: aload_0
    //   107: invokevirtual 233	java/io/FileReader:close	()V
    //   110: aload_1
    //   111: athrow
    //   112: astore_2
    //   113: goto -67 -> 46
    //   116: astore_0
    //   117: aload_1
    //   118: areturn
    //   119: astore_1
    //   120: goto -64 -> 56
    //   123: astore_0
    //   124: goto -64 -> 60
    //   127: astore_1
    //   128: goto -54 -> 74
    //   131: astore_2
    //   132: goto -30 -> 102
    //   135: astore_0
    //   136: goto -26 -> 110
    //   139: astore_1
    //   140: aconst_null
    //   141: astore_2
    //   142: goto -48 -> 94
    //   145: astore_1
    //   146: goto -52 -> 94
    //   149: astore_2
    //   150: goto -84 -> 66
    //   153: astore_1
    //   154: aload_2
    //   155: astore_1
    //   156: goto -90 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	45	0	localFileReader	java.io.FileReader
    //   63	1	0	localException1	Exception
    //   65	14	0	localObject1	Object
    //   85	1	0	localException2	Exception
    //   91	16	0	localObject2	Object
    //   116	1	0	localException3	Exception
    //   123	1	0	localException4	Exception
    //   135	1	0	localException5	Exception
    //   1	70	1	str1	String
    //   89	29	1	str2	String
    //   119	1	1	localException6	Exception
    //   127	1	1	localException7	Exception
    //   139	1	1	localObject3	Object
    //   145	1	1	localObject4	Object
    //   153	1	1	localException8	Exception
    //   155	1	1	localObject5	Object
    //   24	75	2	localBufferedReader	java.io.BufferedReader
    //   112	1	2	localException9	Exception
    //   131	1	2	localException10	Exception
    //   141	1	2	localObject6	Object
    //   149	6	2	localException11	Exception
    // Exception table:
    //   from	to	target	type
    //   2	13	63	java/lang/Exception
    //   78	82	85	java/lang/Exception
    //   2	13	89	finally
    //   42	46	112	java/lang/Exception
    //   46	50	116	java/lang/Exception
    //   52	56	119	java/lang/Exception
    //   56	60	123	java/lang/Exception
    //   70	74	127	java/lang/Exception
    //   98	102	131	java/lang/Exception
    //   106	110	135	java/lang/Exception
    //   13	25	139	finally
    //   25	42	145	finally
    //   13	25	149	java/lang/Exception
    //   25	42	153	java/lang/Exception
  }
  
  /* Error */
  private static String x()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 26
    //   4: astore_2
    //   5: new 221	java/io/FileReader
    //   8: dup
    //   9: ldc 121
    //   11: invokespecial 222	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   14: astore_0
    //   15: new 224	java/io/BufferedReader
    //   18: dup
    //   19: aload_0
    //   20: sipush 8192
    //   23: invokespecial 292	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_2
    //   34: astore_1
    //   35: aload 4
    //   37: ifnull +48 -> 85
    //   40: aload 4
    //   42: invokestatic 212	com/alipay/d/a/a/a/a:a	(Ljava/lang/String;)Z
    //   45: ifne -18 -> 27
    //   48: aload 4
    //   50: ldc -110
    //   52: invokevirtual 297	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   55: astore_1
    //   56: aload_1
    //   57: ifnull -30 -> 27
    //   60: aload_1
    //   61: arraylength
    //   62: iconst_1
    //   63: if_icmple -36 -> 27
    //   66: aload_1
    //   67: iconst_0
    //   68: aaload
    //   69: ldc_w 706
    //   72: invokevirtual 562	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   75: ifeq -48 -> 27
    //   78: aload_1
    //   79: iconst_1
    //   80: aaload
    //   81: invokevirtual 156	java/lang/String:trim	()Ljava/lang/String;
    //   84: astore_1
    //   85: aload_0
    //   86: invokevirtual 233	java/io/FileReader:close	()V
    //   89: aload_3
    //   90: invokevirtual 234	java/io/BufferedReader:close	()V
    //   93: aload_1
    //   94: areturn
    //   95: astore_0
    //   96: aconst_null
    //   97: astore_0
    //   98: aload_1
    //   99: ifnull +7 -> 106
    //   102: aload_1
    //   103: invokevirtual 233	java/io/FileReader:close	()V
    //   106: aload_2
    //   107: astore_1
    //   108: aload_0
    //   109: ifnull -16 -> 93
    //   112: aload_0
    //   113: invokevirtual 234	java/io/BufferedReader:close	()V
    //   116: ldc 26
    //   118: areturn
    //   119: astore_0
    //   120: ldc 26
    //   122: areturn
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_2
    //   126: aconst_null
    //   127: astore_0
    //   128: aload_0
    //   129: ifnull +7 -> 136
    //   132: aload_0
    //   133: invokevirtual 233	java/io/FileReader:close	()V
    //   136: aload_2
    //   137: ifnull +7 -> 144
    //   140: aload_2
    //   141: invokevirtual 234	java/io/BufferedReader:close	()V
    //   144: aload_1
    //   145: athrow
    //   146: astore_0
    //   147: goto -58 -> 89
    //   150: astore_0
    //   151: aload_1
    //   152: areturn
    //   153: astore_1
    //   154: goto -48 -> 106
    //   157: astore_0
    //   158: goto -22 -> 136
    //   161: astore_0
    //   162: goto -18 -> 144
    //   165: astore_1
    //   166: aconst_null
    //   167: astore_2
    //   168: goto -40 -> 128
    //   171: astore_1
    //   172: aload_3
    //   173: astore_2
    //   174: goto -46 -> 128
    //   177: astore_1
    //   178: aconst_null
    //   179: astore_3
    //   180: aload_0
    //   181: astore_1
    //   182: aload_3
    //   183: astore_0
    //   184: goto -86 -> 98
    //   187: astore_1
    //   188: aload_0
    //   189: astore_1
    //   190: aload_3
    //   191: astore_0
    //   192: goto -94 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   14	72	0	localFileReader	java.io.FileReader
    //   95	1	0	localException1	Exception
    //   97	16	0	localObject1	Object
    //   119	1	0	localException2	Exception
    //   127	6	0	localObject2	Object
    //   146	1	0	localException3	Exception
    //   150	1	0	localException4	Exception
    //   157	1	0	localException5	Exception
    //   161	20	0	localException6	Exception
    //   183	9	0	localObject3	Object
    //   1	107	1	localObject4	Object
    //   123	29	1	str1	String
    //   153	1	1	localException7	Exception
    //   165	1	1	localObject5	Object
    //   171	1	1	localObject6	Object
    //   177	1	1	localException8	Exception
    //   181	1	1	localObject7	Object
    //   187	1	1	localException9	Exception
    //   189	1	1	localObject8	Object
    //   4	170	2	localObject9	Object
    //   26	165	3	localBufferedReader	java.io.BufferedReader
    //   31	18	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   5	15	95	java/lang/Exception
    //   112	116	119	java/lang/Exception
    //   5	15	123	finally
    //   85	89	146	java/lang/Exception
    //   89	93	150	java/lang/Exception
    //   102	106	153	java/lang/Exception
    //   132	136	157	java/lang/Exception
    //   140	144	161	java/lang/Exception
    //   15	27	165	finally
    //   27	33	171	finally
    //   40	56	171	finally
    //   60	85	171	finally
    //   15	27	177	java/lang/Exception
    //   27	33	187	java/lang/Exception
    //   40	56	187	java/lang/Exception
    //   60	85	187	java/lang/Exception
  }
  
  private static String y()
  {
    Object localObject1 = "";
    try
    {
      Object localObject2 = BluetoothAdapter.getDefaultAdapter();
      if ((localObject2 != null) && (!((BluetoothAdapter)localObject2).isEnabled())) {
        return "";
      }
      localObject2 = ((BluetoothAdapter)localObject2).getAddress();
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (localObject1 == null) {
      return "";
    }
    return (String)localObject1;
  }
  
  private static String z()
  {
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject).hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while ((localInetAddress.isLoopbackAddress()) || (!(localInetAddress instanceof Inet4Address)));
      Object localObject = localInetAddress.getHostAddress().toString();
      return (String)localObject;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public final String e()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new c(this)).length;
      return String.valueOf(i);
    }
    catch (Exception localException) {}
    return "1";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */