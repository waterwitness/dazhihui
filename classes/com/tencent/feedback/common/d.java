package com.tencent.feedback.common;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.io.File;
import java.util.Locale;

public final class d
{
  private static d a;
  
  private d(Context paramContext)
  {
    if (paramContext == null) {}
    while (paramContext.getApplicationContext() != null) {
      return;
    }
  }
  
  /* Error */
  public static d a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 21	com/tencent/feedback/common/d:a	Lcom/tencent/feedback/common/d;
    //   6: ifnonnull +22 -> 28
    //   9: aload_0
    //   10: ifnull +18 -> 28
    //   13: aload_0
    //   14: ifnonnull +23 -> 37
    //   17: new 2	com/tencent/feedback/common/d
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 23	com/tencent/feedback/common/d:<init>	(Landroid/content/Context;)V
    //   25: putstatic 21	com/tencent/feedback/common/d:a	Lcom/tencent/feedback/common/d;
    //   28: getstatic 21	com/tencent/feedback/common/d:a	Lcom/tencent/feedback/common/d;
    //   31: astore_0
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: areturn
    //   37: aload_0
    //   38: invokevirtual 17	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   41: astore_1
    //   42: aload_1
    //   43: ifnull -26 -> 17
    //   46: aload_1
    //   47: astore_0
    //   48: goto -31 -> 17
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramContext	Context
    //   41	6	1	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	9	51	finally
    //   17	28	51	finally
    //   28	32	51	finally
    //   37	42	51	finally
  }
  
  public static String a()
  {
    try
    {
      String str = Build.MODEL;
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getDeviceName error}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "fail";
  }
  
  public static String b()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getVersion error}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "fail";
  }
  
  public static String b(Context paramContext)
  {
    String str = "fail";
    if (paramContext == null)
    {
      e.d("rqdp{  getImei but context == null!}", new Object[0]);
      return "fail";
    }
    for (;;)
    {
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
        if (paramContext != null) {
          continue;
        }
        paramContext = "null";
        try
        {
          e.a("rqdp{  IMEI:}" + paramContext, new Object[0]);
          return paramContext;
        }
        catch (Throwable localThrowable1) {}
      }
      catch (Throwable localThrowable2)
      {
        paramContext = (Context)localObject;
        Object localObject = localThrowable2;
        continue;
      }
      e.d("rqdp{  getImei error!}", new Object[0]);
      localThrowable1.printStackTrace();
      return paramContext;
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
    }
  }
  
  public static String c()
  {
    try
    {
      String str = Build.VERSION.SDK;
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getApiLevel error}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "fail";
  }
  
  public static String c(Context paramContext)
  {
    Object localObject = "fail";
    if (paramContext == null)
    {
      e.d("rqdp{  getImsi but context == null!}", new Object[0]);
      return "fail";
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      if (paramContext == null) {
        return "null";
      }
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      e.d("rqdp{  getImsi error!}", new Object[0]);
      paramContext.printStackTrace();
    }
    return (String)localObject;
  }
  
  public static String d()
  {
    Object localObject2 = null;
    try
    {
      localObject1 = Build.CPU_ABI;
      localObject2 = localObject1;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject1;
        e.c("rqdp{  ge cuabi fa!}", new Object[0]);
        localThrowable.printStackTrace();
      }
    }
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).trim().length() != 0) {}
    }
    else
    {
      localObject1 = System.getProperty("os.arch");
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "fail";
    }
    return (String)localObject2;
  }
  
  public static String d(Context paramContext)
  {
    String str2 = "fail";
    if (paramContext == null)
    {
      e.d("rqdp{  getAndroidId but context == null!}", new Object[0]);
      return "fail";
    }
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (paramContext == null) {
        return "null";
      }
      String str1;
      e.d("rqdp{  getAndroidId error!}", new Object[0]);
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        str1 = paramContext.toLowerCase();
        return str1;
      }
      catch (Throwable localThrowable2)
      {
        for (;;) {}
      }
      localThrowable1 = localThrowable1;
      paramContext = str2;
    }
    localThrowable1.printStackTrace();
    return paramContext;
  }
  
  public static String e(Context paramContext)
  {
    Object localObject = "fail";
    if (paramContext == null)
    {
      e.d("rqdp{  getMacAddress but context == null!}", new Object[0]);
      return "fail";
    }
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
      if (paramContext == null) {
        return "null";
      }
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      e.d("rqdp{  getMacAddress error!}", new Object[0]);
    }
    return (String)localObject;
  }
  
  /* Error */
  public static byte[] e()
  {
    // Byte code:
    //   0: new 166	java/io/File
    //   3: dup
    //   4: ldc -88
    //   6: invokespecial 169	java/io/File:<init>	(Ljava/lang/String;)V
    //   9: astore_0
    //   10: aload_0
    //   11: invokevirtual 173	java/io/File:exists	()Z
    //   14: ifeq +157 -> 171
    //   17: aload_0
    //   18: invokevirtual 176	java/io/File:canRead	()Z
    //   21: ifeq +150 -> 171
    //   24: new 178	java/io/FileInputStream
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 181	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   32: astore_1
    //   33: aload_1
    //   34: astore_0
    //   35: new 183	java/io/ByteArrayOutputStream
    //   38: dup
    //   39: invokespecial 184	java/io/ByteArrayOutputStream:<init>	()V
    //   42: astore_2
    //   43: aload_1
    //   44: astore_0
    //   45: sipush 1000
    //   48: newarray <illegal type>
    //   50: astore_3
    //   51: lconst_0
    //   52: lstore 5
    //   54: aload_1
    //   55: astore_0
    //   56: aload_1
    //   57: aload_3
    //   58: invokevirtual 188	java/io/FileInputStream:read	([B)I
    //   61: istore 4
    //   63: iload 4
    //   65: ifle +30 -> 95
    //   68: aload_1
    //   69: astore_0
    //   70: aload_2
    //   71: aload_3
    //   72: iconst_0
    //   73: iload 4
    //   75: invokevirtual 192	java/io/ByteArrayOutputStream:write	([BII)V
    //   78: aload_1
    //   79: astore_0
    //   80: aload_2
    //   81: invokevirtual 195	java/io/ByteArrayOutputStream:flush	()V
    //   84: lload 5
    //   86: iload 4
    //   88: i2l
    //   89: ladd
    //   90: lstore 5
    //   92: goto -38 -> 54
    //   95: aload_1
    //   96: astore_0
    //   97: aload_2
    //   98: invokevirtual 198	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   101: astore_2
    //   102: aload_1
    //   103: astore_0
    //   104: ldc -56
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: lload 5
    //   114: invokestatic 206	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: aload_2
    //   121: arraylength
    //   122: i2l
    //   123: invokestatic 206	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   126: aastore
    //   127: invokestatic 85	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_1
    //   131: invokevirtual 209	java/io/FileInputStream:close	()V
    //   134: aload_2
    //   135: areturn
    //   136: astore_0
    //   137: aload_0
    //   138: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   141: aload_2
    //   142: areturn
    //   143: astore_2
    //   144: aconst_null
    //   145: astore_1
    //   146: aload_1
    //   147: astore_0
    //   148: ldc 125
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 127	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_1
    //   158: astore_0
    //   159: aload_2
    //   160: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
    //   163: aload_1
    //   164: ifnull +7 -> 171
    //   167: aload_1
    //   168: invokevirtual 209	java/io/FileInputStream:close	()V
    //   171: aconst_null
    //   172: areturn
    //   173: astore_0
    //   174: aload_0
    //   175: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   178: goto -7 -> 171
    //   181: astore_1
    //   182: aconst_null
    //   183: astore_0
    //   184: aload_0
    //   185: ifnull +7 -> 192
    //   188: aload_0
    //   189: invokevirtual 209	java/io/FileInputStream:close	()V
    //   192: aload_1
    //   193: athrow
    //   194: astore_0
    //   195: aload_0
    //   196: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   199: goto -7 -> 192
    //   202: astore_1
    //   203: goto -19 -> 184
    //   206: astore_2
    //   207: goto -61 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	95	0	localObject1	Object
    //   136	2	0	localIOException1	java.io.IOException
    //   147	12	0	localObject2	Object
    //   173	2	0	localIOException2	java.io.IOException
    //   183	6	0	localObject3	Object
    //   194	2	0	localIOException3	java.io.IOException
    //   32	136	1	localFileInputStream	java.io.FileInputStream
    //   181	12	1	localObject4	Object
    //   202	1	1	localObject5	Object
    //   42	100	2	localObject6	Object
    //   143	17	2	localThrowable1	Throwable
    //   206	1	2	localThrowable2	Throwable
    //   50	22	3	arrayOfByte	byte[]
    //   61	26	4	i	int
    //   52	61	5	l	long
    // Exception table:
    //   from	to	target	type
    //   130	134	136	java/io/IOException
    //   0	33	143	java/lang/Throwable
    //   167	171	173	java/io/IOException
    //   0	33	181	finally
    //   188	192	194	java/io/IOException
    //   35	43	202	finally
    //   45	51	202	finally
    //   56	63	202	finally
    //   70	78	202	finally
    //   80	84	202	finally
    //   97	102	202	finally
    //   104	130	202	finally
    //   148	157	202	finally
    //   159	163	202	finally
    //   35	43	206	java/lang/Throwable
    //   45	51	206	java/lang/Throwable
    //   56	63	206	java/lang/Throwable
    //   70	78	206	java/lang/Throwable
    //   80	84	206	java/lang/Throwable
    //   97	102	206	java/lang/Throwable
    //   104	130	206	java/lang/Throwable
  }
  
  public static long f()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      long l = localStatFs.getBlockSize();
      int i = localStatFs.getBlockCount();
      return i * l;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getDisplayMetrics error!}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return -1L;
  }
  
  public static long g()
  {
    try
    {
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      long l = localStatFs.getBlockSize();
      int i = localStatFs.getAvailableBlocks();
      return i * l;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getDisplayMetrics error!}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return -1L;
  }
  
  /* Error */
  public static long h()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 241	java/io/FileReader
    //   5: dup
    //   6: ldc -13
    //   8: invokespecial 244	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   11: astore_2
    //   12: new 246	java/io/BufferedReader
    //   15: dup
    //   16: aload_2
    //   17: sipush 2048
    //   20: invokespecial 249	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: ldc -2
    //   30: iconst_2
    //   31: invokevirtual 258	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   34: iconst_1
    //   35: aaload
    //   36: invokevirtual 92	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   39: ldc_w 260
    //   42: ldc_w 262
    //   45: invokevirtual 266	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   48: invokevirtual 111	java/lang/String:trim	()Ljava/lang/String;
    //   51: invokestatic 270	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   54: lstore 4
    //   56: lload 4
    //   58: ldc2_w 271
    //   61: lmul
    //   62: lstore 4
    //   64: aload_1
    //   65: invokevirtual 273	java/io/BufferedReader:close	()V
    //   68: aload_2
    //   69: invokevirtual 274	java/io/FileReader:close	()V
    //   72: lload 4
    //   74: lreturn
    //   75: astore_0
    //   76: aload_0
    //   77: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   80: goto -12 -> 68
    //   83: astore_0
    //   84: aload_0
    //   85: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   88: lload 4
    //   90: lreturn
    //   91: astore_2
    //   92: aconst_null
    //   93: astore_0
    //   94: aload_3
    //   95: astore_1
    //   96: ldc_w 276
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 40	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: aload_2
    //   107: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 273	java/io/BufferedReader:close	()V
    //   118: aload_0
    //   119: ifnull +7 -> 126
    //   122: aload_0
    //   123: invokevirtual 274	java/io/FileReader:close	()V
    //   126: ldc2_w 277
    //   129: lreturn
    //   130: astore_1
    //   131: aload_1
    //   132: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   135: goto -17 -> 118
    //   138: astore_0
    //   139: aload_0
    //   140: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   143: goto -17 -> 126
    //   146: astore_0
    //   147: aconst_null
    //   148: astore_1
    //   149: aconst_null
    //   150: astore_2
    //   151: aload_1
    //   152: ifnull +7 -> 159
    //   155: aload_1
    //   156: invokevirtual 273	java/io/BufferedReader:close	()V
    //   159: aload_2
    //   160: ifnull +7 -> 167
    //   163: aload_2
    //   164: invokevirtual 274	java/io/FileReader:close	()V
    //   167: aload_0
    //   168: athrow
    //   169: astore_1
    //   170: aload_1
    //   171: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   174: goto -15 -> 159
    //   177: astore_1
    //   178: aload_1
    //   179: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   182: goto -15 -> 167
    //   185: astore_0
    //   186: aconst_null
    //   187: astore_1
    //   188: goto -37 -> 151
    //   191: astore_0
    //   192: goto -41 -> 151
    //   195: astore_3
    //   196: aload_0
    //   197: astore_2
    //   198: aload_3
    //   199: astore_0
    //   200: goto -49 -> 151
    //   203: astore_1
    //   204: aload_2
    //   205: astore_0
    //   206: aload_1
    //   207: astore_2
    //   208: aload_3
    //   209: astore_1
    //   210: goto -114 -> 96
    //   213: astore_3
    //   214: aload_2
    //   215: astore_0
    //   216: aload_3
    //   217: astore_2
    //   218: goto -122 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   75	2	0	localIOException1	java.io.IOException
    //   83	2	0	localIOException2	java.io.IOException
    //   93	30	0	localObject1	Object
    //   138	2	0	localIOException3	java.io.IOException
    //   146	22	0	localObject2	Object
    //   185	1	0	localObject3	Object
    //   191	6	0	localObject4	Object
    //   199	17	0	localObject5	Object
    //   23	92	1	localObject6	Object
    //   130	2	1	localIOException4	java.io.IOException
    //   148	8	1	localObject7	Object
    //   169	2	1	localIOException5	java.io.IOException
    //   177	2	1	localIOException6	java.io.IOException
    //   187	1	1	localObject8	Object
    //   203	4	1	localThrowable1	Throwable
    //   209	1	1	localObject9	Object
    //   11	58	2	localFileReader	java.io.FileReader
    //   91	16	2	localThrowable2	Throwable
    //   150	68	2	localObject10	Object
    //   1	94	3	localObject11	Object
    //   195	14	3	localObject12	Object
    //   213	4	3	localThrowable3	Throwable
    //   54	35	4	l	long
    // Exception table:
    //   from	to	target	type
    //   64	68	75	java/io/IOException
    //   68	72	83	java/io/IOException
    //   2	12	91	java/lang/Throwable
    //   114	118	130	java/io/IOException
    //   122	126	138	java/io/IOException
    //   2	12	146	finally
    //   155	159	169	java/io/IOException
    //   163	167	177	java/io/IOException
    //   12	24	185	finally
    //   24	56	191	finally
    //   96	110	195	finally
    //   12	24	203	java/lang/Throwable
    //   24	56	213	java/lang/Throwable
  }
  
  /* Error */
  public static long i()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 241	java/io/FileReader
    //   5: dup
    //   6: ldc -13
    //   8: invokespecial 244	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   11: astore_2
    //   12: new 246	java/io/BufferedReader
    //   15: dup
    //   16: aload_2
    //   17: sipush 2048
    //   20: invokespecial 249	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   23: astore_1
    //   24: aload_1
    //   25: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: pop
    //   29: aload_1
    //   30: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   33: ldc -2
    //   35: iconst_2
    //   36: invokevirtual 258	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   39: iconst_1
    //   40: aaload
    //   41: invokevirtual 92	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   44: ldc_w 260
    //   47: ldc_w 262
    //   50: invokevirtual 266	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   53: invokevirtual 111	java/lang/String:trim	()Ljava/lang/String;
    //   56: invokestatic 270	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   59: lstore 4
    //   61: lload 4
    //   63: ldc2_w 271
    //   66: lmul
    //   67: lstore 4
    //   69: aload_1
    //   70: invokevirtual 273	java/io/BufferedReader:close	()V
    //   73: aload_2
    //   74: invokevirtual 274	java/io/FileReader:close	()V
    //   77: lload 4
    //   79: lreturn
    //   80: astore_0
    //   81: aload_0
    //   82: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   85: goto -12 -> 73
    //   88: astore_0
    //   89: aload_0
    //   90: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   93: lload 4
    //   95: lreturn
    //   96: astore_2
    //   97: aconst_null
    //   98: astore_0
    //   99: aload_3
    //   100: astore_1
    //   101: ldc_w 276
    //   104: iconst_0
    //   105: anewarray 4	java/lang/Object
    //   108: invokestatic 40	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: aload_2
    //   112: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
    //   115: aload_1
    //   116: ifnull +7 -> 123
    //   119: aload_1
    //   120: invokevirtual 273	java/io/BufferedReader:close	()V
    //   123: aload_0
    //   124: ifnull +7 -> 131
    //   127: aload_0
    //   128: invokevirtual 274	java/io/FileReader:close	()V
    //   131: ldc2_w 277
    //   134: lreturn
    //   135: astore_1
    //   136: aload_1
    //   137: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   140: goto -17 -> 123
    //   143: astore_0
    //   144: aload_0
    //   145: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   148: goto -17 -> 131
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_1
    //   157: ifnull +7 -> 164
    //   160: aload_1
    //   161: invokevirtual 273	java/io/BufferedReader:close	()V
    //   164: aload_2
    //   165: ifnull +7 -> 172
    //   168: aload_2
    //   169: invokevirtual 274	java/io/FileReader:close	()V
    //   172: aload_0
    //   173: athrow
    //   174: astore_1
    //   175: aload_1
    //   176: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   179: goto -15 -> 164
    //   182: astore_1
    //   183: aload_1
    //   184: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   187: goto -15 -> 172
    //   190: astore_0
    //   191: aconst_null
    //   192: astore_1
    //   193: goto -37 -> 156
    //   196: astore_0
    //   197: goto -41 -> 156
    //   200: astore_3
    //   201: aload_0
    //   202: astore_2
    //   203: aload_3
    //   204: astore_0
    //   205: goto -49 -> 156
    //   208: astore_1
    //   209: aload_2
    //   210: astore_0
    //   211: aload_1
    //   212: astore_2
    //   213: aload_3
    //   214: astore_1
    //   215: goto -114 -> 101
    //   218: astore_3
    //   219: aload_2
    //   220: astore_0
    //   221: aload_3
    //   222: astore_2
    //   223: goto -122 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   80	2	0	localIOException1	java.io.IOException
    //   88	2	0	localIOException2	java.io.IOException
    //   98	30	0	localObject1	Object
    //   143	2	0	localIOException3	java.io.IOException
    //   151	22	0	localObject2	Object
    //   190	1	0	localObject3	Object
    //   196	6	0	localObject4	Object
    //   204	17	0	localObject5	Object
    //   23	97	1	localObject6	Object
    //   135	2	1	localIOException4	java.io.IOException
    //   153	8	1	localObject7	Object
    //   174	2	1	localIOException5	java.io.IOException
    //   182	2	1	localIOException6	java.io.IOException
    //   192	1	1	localObject8	Object
    //   208	4	1	localThrowable1	Throwable
    //   214	1	1	localObject9	Object
    //   11	63	2	localFileReader	java.io.FileReader
    //   96	16	2	localThrowable2	Throwable
    //   155	68	2	localObject10	Object
    //   1	99	3	localObject11	Object
    //   200	14	3	localObject12	Object
    //   218	4	3	localThrowable3	Throwable
    //   59	35	4	l	long
    // Exception table:
    //   from	to	target	type
    //   69	73	80	java/io/IOException
    //   73	77	88	java/io/IOException
    //   2	12	96	java/lang/Throwable
    //   119	123	135	java/io/IOException
    //   127	131	143	java/io/IOException
    //   2	12	151	finally
    //   160	164	174	java/io/IOException
    //   168	172	182	java/io/IOException
    //   12	24	190	finally
    //   24	61	196	finally
    //   101	115	200	finally
    //   12	24	208	java/lang/Throwable
    //   24	61	218	java/lang/Throwable
  }
  
  public static String l()
  {
    try
    {
      String str = Locale.getDefault().getCountry();
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getCountry error!}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "fail";
  }
  
  public static String m()
  {
    try
    {
      String str = Build.BRAND;
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  getBrand error!}", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "fail";
  }
  
  /* Error */
  public static long n()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 71	java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 300
    //   12: invokespecial 76	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: invokestatic 305	android/os/Process:myPid	()I
    //   18: invokevirtual 308	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   21: ldc_w 310
    //   24: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: astore_0
    //   31: ldc_w 312
    //   34: invokestatic 318	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   37: invokevirtual 321	java/lang/Thread:getName	()Ljava/lang/String;
    //   40: invokevirtual 325	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   43: ifeq +171 -> 214
    //   46: ldc_w 327
    //   49: astore_2
    //   50: ldc_w 329
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: aload_2
    //   60: aastore
    //   61: invokestatic 331	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: new 241	java/io/FileReader
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 244	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   72: astore_1
    //   73: new 246	java/io/BufferedReader
    //   76: dup
    //   77: aload_1
    //   78: sipush 2048
    //   81: invokespecial 249	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   84: astore_0
    //   85: aload_0
    //   86: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull +176 -> 267
    //   94: aload_3
    //   95: aload_2
    //   96: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   99: ifeq -14 -> 85
    //   102: aload_3
    //   103: ldc_w 337
    //   106: invokevirtual 340	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   109: astore_3
    //   110: aload_3
    //   111: arraylength
    //   112: ifle -27 -> 85
    //   115: aload_3
    //   116: iconst_0
    //   117: aaload
    //   118: ldc_w 342
    //   121: invokevirtual 346	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   124: istore 5
    //   126: iload 5
    //   128: ifle -43 -> 85
    //   131: aload_3
    //   132: iconst_0
    //   133: aaload
    //   134: invokevirtual 115	java/lang/String:length	()I
    //   137: iload 5
    //   139: if_icmple -54 -> 85
    //   142: aload_3
    //   143: iconst_0
    //   144: aaload
    //   145: iconst_0
    //   146: iload 5
    //   148: invokevirtual 350	java/lang/String:substring	(II)Ljava/lang/String;
    //   151: bipush 16
    //   153: invokestatic 353	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   156: lstore 6
    //   158: aload_3
    //   159: iconst_0
    //   160: aaload
    //   161: iload 5
    //   163: iconst_1
    //   164: iadd
    //   165: invokevirtual 356	java/lang/String:substring	(I)Ljava/lang/String;
    //   168: bipush 16
    //   170: invokestatic 353	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   173: lload 6
    //   175: lsub
    //   176: lstore 6
    //   178: ldc_w 358
    //   181: iconst_1
    //   182: anewarray 4	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: lload 6
    //   189: invokestatic 206	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   192: aastore
    //   193: invokestatic 331	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: lload 6
    //   198: lconst_0
    //   199: lcmp
    //   200: ifle +43 -> 243
    //   203: aload_0
    //   204: invokevirtual 273	java/io/BufferedReader:close	()V
    //   207: aload_1
    //   208: invokevirtual 274	java/io/FileReader:close	()V
    //   211: lload 6
    //   213: lreturn
    //   214: new 71	java/lang/StringBuilder
    //   217: dup
    //   218: ldc_w 360
    //   221: invokespecial 76	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: invokestatic 363	android/os/Process:myTid	()I
    //   227: invokevirtual 308	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   230: ldc_w 365
    //   233: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: astore_2
    //   240: goto -190 -> 50
    //   243: lload 6
    //   245: lneg
    //   246: lstore 6
    //   248: goto -45 -> 203
    //   251: astore_0
    //   252: aload_0
    //   253: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   256: goto -49 -> 207
    //   259: astore_0
    //   260: aload_0
    //   261: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   264: lload 6
    //   266: lreturn
    //   267: aload_0
    //   268: invokevirtual 273	java/io/BufferedReader:close	()V
    //   271: aload_1
    //   272: invokevirtual 274	java/io/FileReader:close	()V
    //   275: ldc2_w 233
    //   278: lreturn
    //   279: astore_0
    //   280: aload_0
    //   281: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   284: goto -13 -> 271
    //   287: astore_0
    //   288: aload_0
    //   289: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   292: goto -17 -> 275
    //   295: astore_2
    //   296: aconst_null
    //   297: astore_0
    //   298: aload_3
    //   299: astore_1
    //   300: ldc_w 276
    //   303: iconst_0
    //   304: anewarray 4	java/lang/Object
    //   307: invokestatic 40	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   310: aload_2
    //   311: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
    //   314: aload_1
    //   315: ifnull +7 -> 322
    //   318: aload_1
    //   319: invokevirtual 273	java/io/BufferedReader:close	()V
    //   322: aload_0
    //   323: ifnull +7 -> 330
    //   326: aload_0
    //   327: invokevirtual 274	java/io/FileReader:close	()V
    //   330: ldc2_w 277
    //   333: lreturn
    //   334: astore_1
    //   335: aload_1
    //   336: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   339: goto -17 -> 322
    //   342: astore_0
    //   343: aload_0
    //   344: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   347: goto -17 -> 330
    //   350: astore_0
    //   351: aconst_null
    //   352: astore_1
    //   353: aload 4
    //   355: astore_2
    //   356: aload_2
    //   357: ifnull +7 -> 364
    //   360: aload_2
    //   361: invokevirtual 273	java/io/BufferedReader:close	()V
    //   364: aload_1
    //   365: ifnull +7 -> 372
    //   368: aload_1
    //   369: invokevirtual 274	java/io/FileReader:close	()V
    //   372: aload_0
    //   373: athrow
    //   374: astore_2
    //   375: aload_2
    //   376: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   379: goto -15 -> 364
    //   382: astore_1
    //   383: aload_1
    //   384: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   387: goto -15 -> 372
    //   390: astore_0
    //   391: aload 4
    //   393: astore_2
    //   394: goto -38 -> 356
    //   397: astore_3
    //   398: aload_0
    //   399: astore_2
    //   400: aload_3
    //   401: astore_0
    //   402: goto -46 -> 356
    //   405: astore_2
    //   406: aload_0
    //   407: astore_3
    //   408: aload_2
    //   409: astore_0
    //   410: aload_1
    //   411: astore_2
    //   412: aload_3
    //   413: astore_1
    //   414: goto -58 -> 356
    //   417: astore_2
    //   418: aload_1
    //   419: astore_0
    //   420: aload_3
    //   421: astore_1
    //   422: goto -122 -> 300
    //   425: astore_2
    //   426: aload_1
    //   427: astore_3
    //   428: aload_0
    //   429: astore_1
    //   430: aload_3
    //   431: astore_0
    //   432: goto -132 -> 300
    // Local variable table:
    //   start	length	slot	name	signature
    //   30	174	0	localObject1	Object
    //   251	2	0	localIOException1	java.io.IOException
    //   259	9	0	localIOException2	java.io.IOException
    //   279	2	0	localIOException3	java.io.IOException
    //   287	2	0	localIOException4	java.io.IOException
    //   297	30	0	localObject2	Object
    //   342	2	0	localIOException5	java.io.IOException
    //   350	23	0	localObject3	Object
    //   390	9	0	localObject4	Object
    //   401	31	0	localObject5	Object
    //   72	247	1	localObject6	Object
    //   334	2	1	localIOException6	java.io.IOException
    //   352	17	1	localObject7	Object
    //   382	29	1	localIOException7	java.io.IOException
    //   413	17	1	localObject8	Object
    //   49	191	2	str	String
    //   295	16	2	localThrowable1	Throwable
    //   355	6	2	localObject9	Object
    //   374	2	2	localIOException8	java.io.IOException
    //   393	7	2	localObject10	Object
    //   405	4	2	localObject11	Object
    //   411	1	2	localObject12	Object
    //   417	1	2	localThrowable2	Throwable
    //   425	1	2	localThrowable3	Throwable
    //   4	295	3	localObject13	Object
    //   397	4	3	localObject14	Object
    //   407	24	3	localObject15	Object
    //   1	391	4	localObject16	Object
    //   124	41	5	i	int
    //   156	109	6	l	long
    // Exception table:
    //   from	to	target	type
    //   203	207	251	java/io/IOException
    //   207	211	259	java/io/IOException
    //   267	271	279	java/io/IOException
    //   271	275	287	java/io/IOException
    //   31	46	295	java/lang/Throwable
    //   50	73	295	java/lang/Throwable
    //   214	240	295	java/lang/Throwable
    //   318	322	334	java/io/IOException
    //   326	330	342	java/io/IOException
    //   31	46	350	finally
    //   50	73	350	finally
    //   214	240	350	finally
    //   360	364	374	java/io/IOException
    //   368	372	382	java/io/IOException
    //   73	85	390	finally
    //   85	90	397	finally
    //   94	126	397	finally
    //   131	196	397	finally
    //   300	314	405	finally
    //   73	85	417	java/lang/Throwable
    //   85	90	425	java/lang/Throwable
    //   94	126	425	java/lang/Throwable
    //   131	196	425	java/lang/Throwable
  }
  
  /* Error */
  public static long o()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 71	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 300
    //   9: invokespecial 76	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: invokestatic 305	android/os/Process:myPid	()I
    //   15: invokevirtual 308	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   18: ldc_w 310
    //   21: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: astore_0
    //   28: new 241	java/io/FileReader
    //   31: dup
    //   32: aload_0
    //   33: invokespecial 244	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   36: astore_2
    //   37: new 246	java/io/BufferedReader
    //   40: dup
    //   41: aload_2
    //   42: sipush 2048
    //   45: invokespecial 249	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   48: astore_1
    //   49: lconst_0
    //   50: lstore 6
    //   52: aload_1
    //   53: invokevirtual 252	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: astore_0
    //   57: aload_0
    //   58: ifnull +132 -> 190
    //   61: aload_0
    //   62: ldc_w 368
    //   65: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   68: ifeq -16 -> 52
    //   71: aload_0
    //   72: ldc_w 337
    //   75: invokevirtual 340	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   78: astore_0
    //   79: aload_0
    //   80: arraylength
    //   81: ifle +274 -> 355
    //   84: aload_0
    //   85: iconst_0
    //   86: aaload
    //   87: ldc_w 342
    //   90: invokevirtual 346	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   93: istore 5
    //   95: iload 5
    //   97: ifle +258 -> 355
    //   100: aload_0
    //   101: iconst_0
    //   102: aaload
    //   103: invokevirtual 115	java/lang/String:length	()I
    //   106: iload 5
    //   108: if_icmple +247 -> 355
    //   111: aload_0
    //   112: iconst_0
    //   113: aaload
    //   114: iconst_0
    //   115: iload 5
    //   117: invokevirtual 350	java/lang/String:substring	(II)Ljava/lang/String;
    //   120: bipush 16
    //   122: invokestatic 353	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   125: lstore 8
    //   127: aload_0
    //   128: iconst_0
    //   129: aaload
    //   130: iload 5
    //   132: iconst_1
    //   133: iadd
    //   134: invokevirtual 356	java/lang/String:substring	(I)Ljava/lang/String;
    //   137: bipush 16
    //   139: invokestatic 353	java/lang/Long:parseLong	(Ljava/lang/String;I)J
    //   142: lload 8
    //   144: lsub
    //   145: lstore 8
    //   147: ldc_w 370
    //   150: iconst_1
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: lload 8
    //   158: invokestatic 206	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   161: aastore
    //   162: invokestatic 331	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: lload 8
    //   167: lconst_0
    //   168: lcmp
    //   169: ifle +13 -> 182
    //   172: lload 8
    //   174: lload 6
    //   176: ladd
    //   177: lstore 6
    //   179: goto -127 -> 52
    //   182: lload 8
    //   184: lneg
    //   185: lstore 8
    //   187: goto -15 -> 172
    //   190: aload_1
    //   191: invokevirtual 273	java/io/BufferedReader:close	()V
    //   194: aload_2
    //   195: invokevirtual 274	java/io/FileReader:close	()V
    //   198: lload 6
    //   200: lreturn
    //   201: astore_0
    //   202: aload_0
    //   203: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   206: goto -12 -> 194
    //   209: astore_0
    //   210: aload_0
    //   211: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   214: lload 6
    //   216: lreturn
    //   217: astore_1
    //   218: aconst_null
    //   219: astore_0
    //   220: aload_3
    //   221: astore_2
    //   222: ldc_w 276
    //   225: iconst_0
    //   226: anewarray 4	java/lang/Object
    //   229: invokestatic 40	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: aload_1
    //   233: invokevirtual 43	java/lang/Throwable:printStackTrace	()V
    //   236: aload_2
    //   237: ifnull +7 -> 244
    //   240: aload_2
    //   241: invokevirtual 273	java/io/BufferedReader:close	()V
    //   244: aload_0
    //   245: ifnull +7 -> 252
    //   248: aload_0
    //   249: invokevirtual 274	java/io/FileReader:close	()V
    //   252: ldc2_w 277
    //   255: lreturn
    //   256: astore_1
    //   257: aload_1
    //   258: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   261: goto -17 -> 244
    //   264: astore_0
    //   265: aload_0
    //   266: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   269: goto -17 -> 252
    //   272: astore_0
    //   273: aconst_null
    //   274: astore_1
    //   275: aconst_null
    //   276: astore_2
    //   277: aload_1
    //   278: ifnull +7 -> 285
    //   281: aload_1
    //   282: invokevirtual 273	java/io/BufferedReader:close	()V
    //   285: aload_2
    //   286: ifnull +7 -> 293
    //   289: aload_2
    //   290: invokevirtual 274	java/io/FileReader:close	()V
    //   293: aload_0
    //   294: athrow
    //   295: astore_1
    //   296: aload_1
    //   297: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   300: goto -15 -> 285
    //   303: astore_1
    //   304: aload_1
    //   305: invokevirtual 210	java/io/IOException:printStackTrace	()V
    //   308: goto -15 -> 293
    //   311: astore_0
    //   312: aconst_null
    //   313: astore_1
    //   314: goto -37 -> 277
    //   317: astore_0
    //   318: goto -41 -> 277
    //   321: astore_3
    //   322: aload_2
    //   323: astore_1
    //   324: aload_0
    //   325: astore_2
    //   326: aload_3
    //   327: astore_0
    //   328: goto -51 -> 277
    //   331: astore_1
    //   332: aload_2
    //   333: astore_0
    //   334: aload_3
    //   335: astore_2
    //   336: goto -114 -> 222
    //   339: astore 4
    //   341: aload_1
    //   342: astore_0
    //   343: aload_2
    //   344: astore_3
    //   345: aload 4
    //   347: astore_1
    //   348: aload_0
    //   349: astore_2
    //   350: aload_3
    //   351: astore_0
    //   352: goto -130 -> 222
    //   355: goto -176 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   27	101	0	localObject1	Object
    //   201	2	0	localIOException1	java.io.IOException
    //   209	2	0	localIOException2	java.io.IOException
    //   219	30	0	localObject2	Object
    //   264	2	0	localIOException3	java.io.IOException
    //   272	22	0	localObject3	Object
    //   311	1	0	localObject4	Object
    //   317	8	0	localObject5	Object
    //   327	25	0	localObject6	Object
    //   48	143	1	localBufferedReader	java.io.BufferedReader
    //   217	16	1	localThrowable1	Throwable
    //   256	2	1	localIOException4	java.io.IOException
    //   274	8	1	localObject7	Object
    //   295	2	1	localIOException5	java.io.IOException
    //   303	2	1	localIOException6	java.io.IOException
    //   313	11	1	localObject8	Object
    //   331	11	1	localThrowable2	Throwable
    //   347	1	1	localObject9	Object
    //   36	314	2	localObject10	Object
    //   1	220	3	localObject11	Object
    //   321	14	3	localObject12	Object
    //   344	7	3	localObject13	Object
    //   339	7	4	localThrowable3	Throwable
    //   93	41	5	i	int
    //   50	165	6	l1	long
    //   125	61	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   190	194	201	java/io/IOException
    //   194	198	209	java/io/IOException
    //   28	37	217	java/lang/Throwable
    //   240	244	256	java/io/IOException
    //   248	252	264	java/io/IOException
    //   28	37	272	finally
    //   281	285	295	java/io/IOException
    //   289	293	303	java/io/IOException
    //   37	49	311	finally
    //   52	57	317	finally
    //   61	95	317	finally
    //   100	165	317	finally
    //   222	236	321	finally
    //   37	49	331	java/lang/Throwable
    //   52	57	339	java/lang/Throwable
    //   61	95	339	java/lang/Throwable
    //   100	165	339	java/lang/Throwable
  }
  
  public final long j()
  {
    if (Environment.getExternalStorageState().equals("mounted")) {}
    for (int i = 1; i == 0; i = 0) {
      return 0L;
    }
    try
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      i = localStatFs.getBlockSize();
      int j = localStatFs.getBlockCount();
      return j * i;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  get total sd error %s}", new Object[] { localThrowable.toString() });
      localThrowable.printStackTrace();
    }
    return -2L;
  }
  
  public final long k()
  {
    if (Environment.getExternalStorageState().equals("mounted")) {}
    for (int i = 1; i == 0; i = 0) {
      return 0L;
    }
    try
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      i = localStatFs.getBlockSize();
      int j = localStatFs.getAvailableBlocks();
      return j * i;
    }
    catch (Throwable localThrowable)
    {
      e.d("rqdp{  get free sd error %s}", new Object[] { localThrowable.toString() });
      localThrowable.printStackTrace();
    }
    return -2L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */