package com.iflytek.thirdparty;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;

public final class h
{
  public static String a()
  {
    return a(Build.MODEL);
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return a(paramContext);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "";
      }
    }
  }
  
  public static String a(Context paramContext, String paramString)
  {
    try
    {
      int i = new Random().nextInt(10);
      paramContext = String.valueOf(b(System.currentTimeMillis() + paramString + a(paramContext) + g(paramContext) + i).toCharArray(), 8, 16);
      return c(paramContext);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "";
      }
    }
  }
  
  protected static String a(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    String str = paramString;
    if (paramString.length() > 901) {
      str = paramString.substring(0, 900);
    }
    return str.replace("\\", "").replace("|", "");
  }
  
  protected static boolean a(String paramString, int paramInt)
  {
    return (paramString != null) && (paramString.length() > paramInt);
  }
  
  public static String b()
  {
    return a(Build.MANUFACTURER);
  }
  
  public static String b(Context paramContext)
  {
    try
    {
      String str = a(paramContext);
      if ((str != null) && (str.length() > 6)) {
        return String.valueOf(b(str).toCharArray(), 7, 18);
      }
      str = g(paramContext);
      if ((str == null) || (str.length() < 9))
      {
        paramContext = c(paramContext);
        if ((paramContext == null) || (paramContext.length() == 0)) {
          return String.valueOf(b(a(Build.MODEL)).toCharArray(), 7, 18);
        }
        return String.valueOf(b(paramContext).toCharArray(), 7, 18);
      }
      paramContext = String.valueOf(b(str).toCharArray(), 7, 18);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  private static String b(String paramString)
  {
    int j = 0;
    for (;;)
    {
      int i;
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        paramString = paramString.toCharArray();
        byte[] arrayOfByte = new byte[paramString.length];
        i = 0;
        if (i >= paramString.length)
        {
          paramString = ((MessageDigest)localObject).digest(arrayOfByte);
          localObject = new StringBuffer();
          i = j;
          if (i >= paramString.length) {
            return ((StringBuffer)localObject).toString();
          }
          j = paramString[i] & 0xFF;
          if (j < 16) {
            ((StringBuffer)localObject).append("0");
          }
          ((StringBuffer)localObject).append(Integer.toHexString(j));
          i += 1;
          continue;
        }
        arrayOfByte[i] = ((byte)paramString[i]);
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return "";
      }
      i += 1;
    }
  }
  
  private static boolean b(Context paramContext, String paramString)
  {
    boolean bool = false;
    try
    {
      int i = paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName());
      if (i == 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static String c()
  {
    return a("android " + Build.VERSION.RELEASE);
  }
  
  public static String c(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        break label60;
      }
      paramContext = paramContext.getSubscriberId();
      if (paramContext == null) {
        break label54;
      }
      paramContext = paramContext.trim();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "";
        Log.i("MobileUtils", "can't not read imsi");
        continue;
        label54:
        paramContext = "";
        continue;
        label60:
        paramContext = "";
      }
    }
    c.a("MobileUtils", paramContext);
    return c(paramContext);
  }
  
  private static String c(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    return str;
  }
  
  public static int d(Context paramContext)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.widthPixels;
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return 0;
  }
  
  public static String d()
  {
    try
    {
      String str1 = Locale.getDefault().getCountry();
      return c(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2 = "";
      }
    }
  }
  
  public static int e(Context paramContext)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.heightPixels;
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return 0;
  }
  
  public static String e()
  {
    try
    {
      String str1 = Locale.getDefault().getLanguage();
      return c(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2 = "";
      }
    }
  }
  
  public static int f(Context paramContext)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.densityDpi;
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return 0;
  }
  
  /* Error */
  public static String f()
  {
    // Byte code:
    //   0: ldc 34
    //   2: astore_2
    //   3: aconst_null
    //   4: astore_1
    //   5: aconst_null
    //   6: astore_0
    //   7: new 234	java/lang/ProcessBuilder
    //   10: dup
    //   11: iconst_2
    //   12: anewarray 55	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: ldc -20
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: ldc -18
    //   24: aastore
    //   25: invokespecial 241	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   28: invokevirtual 245	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   31: invokevirtual 251	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   34: astore_3
    //   35: aload_3
    //   36: astore_0
    //   37: aload_3
    //   38: astore_1
    //   39: bipush 24
    //   41: newarray <illegal type>
    //   43: astore 4
    //   45: aload_3
    //   46: astore_0
    //   47: aload_3
    //   48: astore_1
    //   49: aload_3
    //   50: aload 4
    //   52: invokevirtual 257	java/io/InputStream:read	([B)I
    //   55: istore 5
    //   57: iload 5
    //   59: iconst_m1
    //   60: if_icmpne +12 -> 72
    //   63: aload_3
    //   64: invokevirtual 260	java/io/InputStream:close	()V
    //   67: aload_2
    //   68: invokevirtual 169	java/lang/String:trim	()Ljava/lang/String;
    //   71: areturn
    //   72: aload_3
    //   73: astore_0
    //   74: aload_3
    //   75: astore_1
    //   76: new 47	java/lang/StringBuilder
    //   79: dup
    //   80: aload_2
    //   81: invokestatic 263	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   84: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: new 55	java/lang/String
    //   90: dup
    //   91: aload 4
    //   93: invokespecial 266	java/lang/String:<init>	([B)V
    //   96: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: astore_2
    //   103: goto -58 -> 45
    //   106: astore_2
    //   107: aload_0
    //   108: astore_1
    //   109: aload_2
    //   110: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   113: ldc 34
    //   115: astore_2
    //   116: aload_0
    //   117: invokevirtual 260	java/io/InputStream:close	()V
    //   120: goto -53 -> 67
    //   123: astore_0
    //   124: aload_0
    //   125: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   128: goto -61 -> 67
    //   131: astore_0
    //   132: aload_1
    //   133: invokevirtual 260	java/io/InputStream:close	()V
    //   136: aload_0
    //   137: athrow
    //   138: astore_1
    //   139: aload_1
    //   140: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   143: goto -7 -> 136
    //   146: astore_0
    //   147: aload_0
    //   148: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   151: goto -84 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	111	0	localObject1	Object
    //   123	2	0	localException1	Exception
    //   131	6	0	localObject2	Object
    //   146	2	0	localException2	Exception
    //   4	129	1	localObject3	Object
    //   138	2	1	localException3	Exception
    //   2	101	2	str1	String
    //   106	4	2	localException4	Exception
    //   115	1	2	str2	String
    //   34	41	3	localInputStream	java.io.InputStream
    //   43	49	4	arrayOfByte	byte[]
    //   55	6	5	i	int
    // Exception table:
    //   from	to	target	type
    //   7	35	106	java/lang/Exception
    //   39	45	106	java/lang/Exception
    //   49	57	106	java/lang/Exception
    //   76	103	106	java/lang/Exception
    //   116	120	123	java/lang/Exception
    //   7	35	131	finally
    //   39	45	131	finally
    //   49	57	131	finally
    //   76	103	131	finally
    //   109	113	131	finally
    //   132	136	138	java/lang/Exception
    //   63	67	146	java/lang/Exception
  }
  
  /* Error */
  public static String g()
  {
    // Byte code:
    //   0: new 268	java/io/FileReader
    //   3: dup
    //   4: ldc_w 270
    //   7: invokespecial 271	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   10: astore_1
    //   11: aload_1
    //   12: astore_0
    //   13: new 273	java/io/BufferedReader
    //   16: dup
    //   17: aload_1
    //   18: invokespecial 276	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   21: invokevirtual 279	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   24: invokevirtual 169	java/lang/String:trim	()Ljava/lang/String;
    //   27: astore_2
    //   28: aload_1
    //   29: invokevirtual 280	java/io/FileReader:close	()V
    //   32: aload_2
    //   33: areturn
    //   34: astore_0
    //   35: aload_0
    //   36: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   39: aload_2
    //   40: areturn
    //   41: astore_2
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: aload_2
    //   47: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   50: aload_1
    //   51: invokevirtual 280	java/io/FileReader:close	()V
    //   54: ldc 34
    //   56: areturn
    //   57: astore_0
    //   58: aload_0
    //   59: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   62: goto -8 -> 54
    //   65: astore_1
    //   66: aconst_null
    //   67: astore_0
    //   68: aload_0
    //   69: invokevirtual 280	java/io/FileReader:close	()V
    //   72: aload_1
    //   73: athrow
    //   74: astore_0
    //   75: aload_0
    //   76: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   79: goto -7 -> 72
    //   82: astore_1
    //   83: goto -15 -> 68
    //   86: astore_2
    //   87: goto -43 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	1	0	localFileReader1	java.io.FileReader
    //   34	2	0	localException1	Exception
    //   45	1	0	localFileReader2	java.io.FileReader
    //   57	2	0	localException2	Exception
    //   67	2	0	localObject1	Object
    //   74	2	0	localException3	Exception
    //   10	41	1	localFileReader3	java.io.FileReader
    //   65	8	1	localObject2	Object
    //   82	1	1	localObject3	Object
    //   27	13	2	str	String
    //   41	6	2	localException4	Exception
    //   86	1	2	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   28	32	34	java/lang/Exception
    //   0	11	41	java/lang/Exception
    //   50	54	57	java/lang/Exception
    //   0	11	65	finally
    //   68	72	74	java/lang/Exception
    //   13	28	82	finally
    //   46	50	82	finally
    //   13	28	86	java/lang/Exception
  }
  
  public static String g(Context paramContext)
  {
    try
    {
      if (b(paramContext, "android.permission.ACCESS_WIFI_STATE"))
      {
        String str = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        if (str != null)
        {
          paramContext = str;
          if (!str.equals("")) {
            break label46;
          }
        }
      }
      for (paramContext = "unknown";; paramContext = "unknown")
      {
        label46:
        return c(paramContext);
        Log.w("MobileUtils", "Could not read MAC, forget to include ACCESS_WIFI_STATE permission?");
      }
      return "unknown";
    }
    catch (Exception paramContext)
    {
      Log.w("MobileUtils", "Could not read MAC, forget to include ACCESS_WIFI_STATE permission?", paramContext);
    }
  }
  
  /* Error */
  public static String h()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 268	java/io/FileReader
    //   5: dup
    //   6: ldc_w 314
    //   9: invokespecial 271	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   12: astore_2
    //   13: new 273	java/io/BufferedReader
    //   16: dup
    //   17: aload_2
    //   18: sipush 8192
    //   21: invokespecial 317	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   24: astore_0
    //   25: aload_0
    //   26: invokevirtual 279	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull +106 -> 137
    //   34: aload_1
    //   35: aload_1
    //   36: ldc_w 319
    //   39: invokevirtual 323	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   42: iconst_2
    //   43: iadd
    //   44: aload_1
    //   45: ldc_w 325
    //   48: invokevirtual 323	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   51: iconst_1
    //   52: isub
    //   53: invokevirtual 98	java/lang/String:substring	(II)Ljava/lang/String;
    //   56: invokevirtual 169	java/lang/String:trim	()Ljava/lang/String;
    //   59: astore_1
    //   60: ldc -85
    //   62: aload_1
    //   63: invokestatic 176	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_1
    //   67: invokestatic 90	com/iflytek/thirdparty/h:c	(Ljava/lang/String;)Ljava/lang/String;
    //   70: astore_1
    //   71: aload_2
    //   72: invokevirtual 280	java/io/FileReader:close	()V
    //   75: aload_0
    //   76: invokevirtual 326	java/io/BufferedReader:close	()V
    //   79: aload_1
    //   80: areturn
    //   81: astore_0
    //   82: aload_0
    //   83: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   86: aload_1
    //   87: areturn
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_0
    //   91: aload_2
    //   92: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   95: aload_1
    //   96: invokevirtual 280	java/io/FileReader:close	()V
    //   99: aload_0
    //   100: invokevirtual 326	java/io/BufferedReader:close	()V
    //   103: ldc 34
    //   105: areturn
    //   106: astore_0
    //   107: aload_0
    //   108: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   111: goto -8 -> 103
    //   114: astore_1
    //   115: aconst_null
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 280	java/io/FileReader:close	()V
    //   123: aload_0
    //   124: invokevirtual 326	java/io/BufferedReader:close	()V
    //   127: aload_1
    //   128: athrow
    //   129: astore_0
    //   130: aload_0
    //   131: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   134: goto -7 -> 127
    //   137: aload_2
    //   138: invokevirtual 280	java/io/FileReader:close	()V
    //   141: aload_0
    //   142: invokevirtual 326	java/io/BufferedReader:close	()V
    //   145: goto -42 -> 103
    //   148: astore_0
    //   149: aload_0
    //   150: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   153: goto -50 -> 103
    //   156: astore_1
    //   157: aconst_null
    //   158: astore_0
    //   159: goto -40 -> 119
    //   162: astore_1
    //   163: goto -44 -> 119
    //   166: astore_3
    //   167: aload_1
    //   168: astore_2
    //   169: aload_3
    //   170: astore_1
    //   171: goto -52 -> 119
    //   174: astore_3
    //   175: aconst_null
    //   176: astore_0
    //   177: aload_2
    //   178: astore_1
    //   179: aload_3
    //   180: astore_2
    //   181: goto -90 -> 91
    //   184: astore_3
    //   185: aload_2
    //   186: astore_1
    //   187: aload_3
    //   188: astore_2
    //   189: goto -98 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   24	52	0	localBufferedReader	java.io.BufferedReader
    //   81	2	0	localException1	Exception
    //   90	10	0	localObject1	Object
    //   106	2	0	localException2	Exception
    //   116	8	0	localObject2	Object
    //   129	13	0	localException3	Exception
    //   148	2	0	localException4	Exception
    //   158	19	0	localObject3	Object
    //   1	95	1	str	String
    //   114	14	1	localObject4	Object
    //   156	1	1	localObject5	Object
    //   162	6	1	localObject6	Object
    //   170	17	1	localObject7	Object
    //   12	60	2	localFileReader	java.io.FileReader
    //   88	4	2	localException5	Exception
    //   118	71	2	localObject8	Object
    //   166	4	3	localObject9	Object
    //   174	6	3	localException6	Exception
    //   184	4	3	localException7	Exception
    // Exception table:
    //   from	to	target	type
    //   71	79	81	java/lang/Exception
    //   2	13	88	java/lang/Exception
    //   95	103	106	java/lang/Exception
    //   2	13	114	finally
    //   119	127	129	java/lang/Exception
    //   137	145	148	java/lang/Exception
    //   13	25	156	finally
    //   25	30	162	finally
    //   34	71	162	finally
    //   91	95	166	finally
    //   13	25	174	java/lang/Exception
    //   25	30	184	java/lang/Exception
    //   34	71	184	java/lang/Exception
  }
  
  public static String h(Context paramContext)
  {
    try
    {
      String str = paramContext.getSharedPreferences("lxdMoblieAgent_sys_config", 0).getString("MOBILE_APPKEY", "");
      Object localObject = str;
      if (str.equals(""))
      {
        localObject = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        paramContext = str;
        if (localObject != null) {
          paramContext = ((ApplicationInfo)localObject).metaData.getString("MOBILE_APPKEY");
        }
        if (TextUtils.isEmpty(paramContext)) {
          Log.e("MobileUtils", "the appkey is empty,please init datau.sdk");
        }
        localObject = paramContext;
        if (TextUtils.isEmpty(paramContext)) {
          localObject = "00000";
        }
      }
      return (String)localObject;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "00000";
  }
  
  public static String i(Context paramContext)
  {
    try
    {
      String str = paramContext.getSharedPreferences("lxdMoblieAgent_sys_config", 0).getString("MOBILE_CHANNEL", "");
      if (str.equals(""))
      {
        ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        paramContext = str;
        if (localApplicationInfo != null)
        {
          str = localApplicationInfo.metaData.getString("MOBILE_CHANNEL");
          paramContext = str;
          if (str == null)
          {
            Log.w("MobileUtils", "Could not read MOBILE_CHANNEL meta-data from AndroidManifest.xml.");
            paramContext = "";
          }
        }
        return a(paramContext);
      }
      paramContext = a(str);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
  
  public static String j(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageName();
      return c(paramContext);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = "";
      }
    }
  }
  
  public static String k(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      return c(paramContext);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = "";
      }
    }
  }
  
  public static String l(Context paramContext)
  {
    try
    {
      if (b(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (paramContext == null) {
          return "unknown";
        }
        int i = paramContext.getType();
        if (i == 1) {
          return "wifi";
        }
        paramContext = paramContext.getExtraInfo();
        if (paramContext == null) {
          return "unknown";
        }
        c.a("MobileUtils", "net type:" + paramContext);
        paramContext = paramContext.trim();
        return paramContext;
      }
      return "unknown";
    }
    catch (Exception paramContext)
    {
      Log.w("MobileUtils", "Could not read ACCESSPOINT, forget to include ACCESS_NETSTATE_STATE permission?", paramContext);
    }
    return "unknown";
  }
  
  public static int m(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return -1;
  }
  
  public static String n(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return c(paramContext);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = "";
      }
    }
  }
  
  /* Error */
  public static long[] o(Context paramContext)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 12
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_0
    //   8: invokestatic 410	com/iflytek/thirdparty/h:q	(Landroid/content/Context;)I
    //   11: istore 5
    //   13: new 47	java/lang/StringBuilder
    //   16: dup
    //   17: ldc_w 412
    //   20: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: iload 5
    //   25: invokevirtual 74	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   28: ldc_w 414
    //   31: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: astore_0
    //   38: new 47	java/lang/StringBuilder
    //   41: dup
    //   42: ldc_w 412
    //   45: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: iload 5
    //   50: invokevirtual 74	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: ldc_w 416
    //   56: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: astore 4
    //   64: new 268	java/io/FileReader
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 271	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   72: astore_1
    //   73: new 273	java/io/BufferedReader
    //   76: dup
    //   77: aload_1
    //   78: sipush 500
    //   81: invokespecial 317	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   84: astore_0
    //   85: aload_0
    //   86: invokevirtual 279	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   89: invokevirtual 417	java/lang/String:toString	()Ljava/lang/String;
    //   92: invokevirtual 169	java/lang/String:trim	()Ljava/lang/String;
    //   95: invokestatic 423	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   98: lstore 6
    //   100: aload_1
    //   101: invokevirtual 280	java/io/FileReader:close	()V
    //   104: aload_0
    //   105: invokevirtual 326	java/io/BufferedReader:close	()V
    //   108: aconst_null
    //   109: astore_0
    //   110: aload_2
    //   111: astore_1
    //   112: new 268	java/io/FileReader
    //   115: dup
    //   116: aload 4
    //   118: invokespecial 271	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   121: astore_2
    //   122: new 273	java/io/BufferedReader
    //   125: dup
    //   126: aload_2
    //   127: sipush 500
    //   130: invokespecial 317	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   133: astore_1
    //   134: aload_1
    //   135: invokevirtual 279	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   138: invokevirtual 417	java/lang/String:toString	()Ljava/lang/String;
    //   141: invokevirtual 169	java/lang/String:trim	()Ljava/lang/String;
    //   144: invokestatic 423	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   147: lstore 8
    //   149: aload_2
    //   150: invokevirtual 280	java/io/FileReader:close	()V
    //   153: aload_1
    //   154: invokevirtual 326	java/io/BufferedReader:close	()V
    //   157: ldc -85
    //   159: new 47	java/lang/StringBuilder
    //   162: dup
    //   163: ldc_w 425
    //   166: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: lload 6
    //   171: invokevirtual 428	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   174: ldc_w 430
    //   177: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: lload 8
    //   182: invokevirtual 428	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   185: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: invokestatic 176	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: lload 6
    //   193: lstore 10
    //   195: lload 6
    //   197: lconst_0
    //   198: lcmp
    //   199: ifge +6 -> 205
    //   202: lconst_0
    //   203: lstore 10
    //   205: lload 8
    //   207: lconst_0
    //   208: lcmp
    //   209: ifge +161 -> 370
    //   212: lload 12
    //   214: lstore 6
    //   216: iconst_2
    //   217: newarray <illegal type>
    //   219: dup
    //   220: iconst_0
    //   221: lload 10
    //   223: lastore
    //   224: dup
    //   225: iconst_1
    //   226: lload 6
    //   228: lastore
    //   229: areturn
    //   230: astore_0
    //   231: aconst_null
    //   232: astore_0
    //   233: aconst_null
    //   234: astore_1
    //   235: aload_1
    //   236: ifnull +201 -> 437
    //   239: aload_1
    //   240: invokevirtual 280	java/io/FileReader:close	()V
    //   243: aload_0
    //   244: invokevirtual 326	java/io/BufferedReader:close	()V
    //   247: lconst_0
    //   248: lstore 6
    //   250: aconst_null
    //   251: astore_0
    //   252: aload_2
    //   253: astore_1
    //   254: goto -142 -> 112
    //   257: astore_2
    //   258: aload_2
    //   259: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   262: lconst_0
    //   263: lstore 6
    //   265: goto -153 -> 112
    //   268: astore_0
    //   269: aconst_null
    //   270: astore_1
    //   271: aload_3
    //   272: astore_2
    //   273: aload_1
    //   274: ifnull +11 -> 285
    //   277: aload_1
    //   278: invokevirtual 280	java/io/FileReader:close	()V
    //   281: aload_2
    //   282: invokevirtual 326	java/io/BufferedReader:close	()V
    //   285: aload_0
    //   286: athrow
    //   287: astore_1
    //   288: aload_1
    //   289: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   292: goto -7 -> 285
    //   295: astore_2
    //   296: aload_2
    //   297: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   300: goto -188 -> 112
    //   303: astore_2
    //   304: aload_1
    //   305: ifnull +126 -> 431
    //   308: aload_1
    //   309: invokevirtual 280	java/io/FileReader:close	()V
    //   312: aload_0
    //   313: invokevirtual 326	java/io/BufferedReader:close	()V
    //   316: lconst_0
    //   317: lstore 8
    //   319: goto -162 -> 157
    //   322: astore_0
    //   323: aload_0
    //   324: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   327: lconst_0
    //   328: lstore 8
    //   330: goto -173 -> 157
    //   333: astore_2
    //   334: aload_1
    //   335: astore_3
    //   336: aload_0
    //   337: astore_1
    //   338: aload_2
    //   339: astore_0
    //   340: aload_3
    //   341: ifnull +11 -> 352
    //   344: aload_3
    //   345: invokevirtual 280	java/io/FileReader:close	()V
    //   348: aload_1
    //   349: invokevirtual 326	java/io/BufferedReader:close	()V
    //   352: aload_0
    //   353: athrow
    //   354: astore_1
    //   355: aload_1
    //   356: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   359: goto -7 -> 352
    //   362: astore_0
    //   363: aload_0
    //   364: invokevirtual 142	java/lang/Exception:printStackTrace	()V
    //   367: goto -210 -> 157
    //   370: lload 8
    //   372: lstore 6
    //   374: goto -158 -> 216
    //   377: astore_3
    //   378: aload_0
    //   379: astore_1
    //   380: aload_3
    //   381: astore_0
    //   382: aload_2
    //   383: astore_3
    //   384: goto -44 -> 340
    //   387: astore_0
    //   388: aload_2
    //   389: astore_3
    //   390: goto -50 -> 340
    //   393: astore_1
    //   394: aload_2
    //   395: astore_1
    //   396: goto -92 -> 304
    //   399: astore_0
    //   400: aload_1
    //   401: astore_0
    //   402: aload_2
    //   403: astore_1
    //   404: goto -100 -> 304
    //   407: astore_0
    //   408: aload_3
    //   409: astore_2
    //   410: goto -137 -> 273
    //   413: astore_3
    //   414: aload_0
    //   415: astore_2
    //   416: aload_3
    //   417: astore_0
    //   418: goto -145 -> 273
    //   421: astore_0
    //   422: aconst_null
    //   423: astore_0
    //   424: goto -189 -> 235
    //   427: astore_3
    //   428: goto -193 -> 235
    //   431: lconst_0
    //   432: lstore 8
    //   434: goto -277 -> 157
    //   437: lconst_0
    //   438: lstore 6
    //   440: goto -328 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	443	0	paramContext	Context
    //   72	206	1	localObject1	Object
    //   287	48	1	localException1	Exception
    //   337	12	1	localContext1	Context
    //   354	2	1	localException2	Exception
    //   379	1	1	localContext2	Context
    //   393	1	1	localException3	Exception
    //   395	9	1	localObject2	Object
    //   6	247	2	localFileReader	java.io.FileReader
    //   257	2	2	localException4	Exception
    //   272	10	2	localObject3	Object
    //   295	2	2	localException5	Exception
    //   303	1	2	localException6	Exception
    //   333	70	2	localObject4	Object
    //   409	7	2	localObject5	Object
    //   4	341	3	localObject6	Object
    //   377	4	3	localObject7	Object
    //   383	26	3	localObject8	Object
    //   413	4	3	localObject9	Object
    //   427	1	3	localException7	Exception
    //   62	55	4	str	String
    //   11	38	5	i	int
    //   98	341	6	l1	long
    //   147	286	8	l2	long
    //   193	29	10	l3	long
    //   1	212	12	l4	long
    // Exception table:
    //   from	to	target	type
    //   64	73	230	java/lang/Exception
    //   239	247	257	java/lang/Exception
    //   64	73	268	finally
    //   277	285	287	java/lang/Exception
    //   100	108	295	java/lang/Exception
    //   112	122	303	java/lang/Exception
    //   308	316	322	java/lang/Exception
    //   112	122	333	finally
    //   344	352	354	java/lang/Exception
    //   149	157	362	java/lang/Exception
    //   122	134	377	finally
    //   134	149	387	finally
    //   122	134	393	java/lang/Exception
    //   134	149	399	java/lang/Exception
    //   73	85	407	finally
    //   85	100	413	finally
    //   73	85	421	java/lang/Exception
    //   85	100	427	java/lang/Exception
  }
  
  public static String p(Context paramContext)
  {
    try
    {
      Object localObject = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if ((localObject != null) && (((NetworkInfo)localObject).isConnected()))
      {
        localObject = ((NetworkInfo)localObject).getTypeName();
        if (((String)localObject).equalsIgnoreCase("WIFI")) {
          return "WIFI";
        }
        if (((String)localObject).equalsIgnoreCase("MOBILE")) {
          return ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkType();
        }
      }
      else
      {
        return "";
      }
    }
    catch (Exception paramContext)
    {
      return "";
    }
    return "";
  }
  
  private static int q(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 1).uid;
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */