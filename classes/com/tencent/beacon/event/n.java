package com.tencent.beacon.event;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.beacon.a.h;
import com.tencent.beacon.e.b;
import java.io.File;
import java.io.IOException;
import java.util.List;

public final class n
{
  private static n a = null;
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private String j = "";
  private String k = "";
  private String l = "";
  private String m = "";
  private String n = "";
  private String o = "";
  private String p = "";
  private String q = "";
  private String r = "";
  
  private n(Context paramContext)
  {
    if (paramContext == null) {
      b.d(" UADeviceInfo context == null? pls check!", new Object[0]);
    }
    b.b(" start to create UADeviceInfo", new Object[0]);
    long l1 = System.currentTimeMillis();
    h.a(paramContext);
    this.b = h.b();
    new StringBuilder().append(h.c()).toString();
    Object localObject = h.h(paramContext);
    label445:
    int i1;
    if (localObject == null)
    {
      localObject = "";
      this.c = ((String)localObject);
      this.d = h.e();
      this.e = "";
      this.f = (h.f() + "m");
      this.g = (h.i() + "m");
      this.h = h.k();
      this.i = h.l();
      this.j = h.j(paramContext);
      this.k = h.m();
      this.l = c(paramContext);
      this.m = (t() + "m");
      this.n = w();
      this.o = s();
      if (!u()) {
        break label548;
      }
      localObject = "Y";
      this.p = ((String)localObject);
      this.q = e(paramContext);
      if ((!d(paramContext)) || (!v())) {
        break label554;
      }
      i1 = 1;
      label474:
      if (i1 == 0) {
        break label559;
      }
    }
    label548:
    label554:
    label559:
    for (paramContext = "Y";; paramContext = "N")
    {
      this.r = paramContext;
      b.b(" detail create cost： %d  values:\n %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), toString() });
      return;
      localObject = ((DisplayMetrics)localObject).widthPixels + "*" + ((DisplayMetrics)localObject).heightPixels;
      break;
      localObject = "N";
      break label445;
      i1 = 0;
      break label474;
    }
  }
  
  public static n a()
  {
    try
    {
      n localn = a;
      return localn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static n a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new n(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  private static boolean a(String paramString, Context paramContext)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static String b(Context paramContext)
  {
    paramContext = (LocationManager)paramContext.getSystemService("location");
    if (paramContext == null) {
      return "N";
    }
    paramContext = paramContext.getAllProviders();
    if (paramContext == null) {
      return "N";
    }
    if (paramContext.contains("gps")) {
      return "Y";
    }
    return "N";
  }
  
  private static int c(Context paramContext)
  {
    if (paramContext == null) {
      return 160;
    }
    for (;;)
    {
      try
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        if (localDisplayMetrics.density == 1.0F) {
          break;
        }
        if (localDisplayMetrics.density <= 0.75D) {
          return 120;
        }
        if (localDisplayMetrics.density == 1.5D) {
          return 240;
        }
        if (localDisplayMetrics.density == 2.0D) {
          return 320;
        }
        float f1 = localDisplayMetrics.density;
        if (f1 == 3.0D)
        {
          i1 = 480;
          return i1;
        }
      }
      catch (Throwable paramContext)
      {
        paramContext.printStackTrace();
        return 160;
      }
      int i1 = 160;
    }
  }
  
  private static boolean d(Context paramContext)
  {
    bool2 = true;
    if (paramContext == null) {
      return false;
    }
    File localFile = new File("/data/data/root");
    try
    {
      localFile.createNewFile();
      bool1 = bool2;
      if (localFile.exists())
      {
        localFile.delete();
        bool1 = bool2;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String[] arrayOfString = new String[4];
        arrayOfString[0] = "com.noshufou.android.su";
        arrayOfString[1] = "com.miui.uac";
        arrayOfString[2] = "eu.chainfire.supersu";
        arrayOfString[3] = "com.lbe.security.miui";
        int i2 = arrayOfString.length;
        int i1 = 0;
        for (;;)
        {
          if (i1 >= i2) {
            break label109;
          }
          bool1 = bool2;
          if (a(arrayOfString[i1], paramContext)) {
            break;
          }
          i1 += 1;
        }
        boolean bool1 = false;
      }
    }
    return bool1;
  }
  
  private String e(Context paramContext)
  {
    if (paramContext == null)
    {
      b.d("getSensor2 but context == null!", new Object[0]);
      return null;
    }
    b.a("getSensor2 start", new Object[0]);
    Object localObject1 = "X";
    Object localObject2 = "X";
    Object localObject3 = "X";
    int i1;
    String str;
    label64:
    Object localObject4;
    Object localObject6;
    Object localObject5;
    if ((WifiManager)paramContext.getSystemService("wifi") == null)
    {
      i1 = 0;
      if (i1 == 0) {
        break label238;
      }
      str = "Y";
      if (Integer.parseInt(Build.VERSION.SDK) < 10) {
        break label295;
      }
      localObject4 = localObject3;
      localObject6 = localObject2;
      localObject5 = localObject1;
    }
    for (;;)
    {
      try
      {
        SensorManager localSensorManager = (SensorManager)paramContext.getSystemService("sensor");
        localObject4 = localObject3;
        localObject6 = localObject2;
        localObject5 = localObject1;
        if (localSensorManager.getDefaultSensor(1) == null) {
          continue;
        }
        localObject1 = "Y";
        localObject4 = localObject3;
        localObject6 = localObject2;
        localObject5 = localObject1;
        if (localSensorManager.getDefaultSensor(5) == null) {
          break label315;
        }
        localObject2 = "Y";
        localObject4 = localObject3;
        localObject6 = localObject2;
        localObject5 = localObject1;
        if (BluetoothAdapter.getDefaultAdapter() != null) {
          break label321;
        }
        localObject3 = "N";
        localObject4 = localObject3;
        localObject6 = localObject2;
        localObject5 = localObject1;
        if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
          continue;
        }
        localObject4 = "Y";
        paramContext = (Context)localObject3;
        localObject3 = localObject1;
        localObject1 = paramContext;
        paramContext = (Context)localObject4;
      }
      catch (Throwable paramContext)
      {
        label238:
        localObject2 = localObject6;
        localObject3 = localObject5;
        b.d("getSensor2 error!", new Object[0]);
        localObject1 = localObject4;
        paramContext = "X";
        continue;
      }
      return str + (String)localObject3 + (String)localObject2 + (String)localObject1 + paramContext;
      i1 = 1;
      break;
      str = "N";
      break label64;
      localObject1 = "N";
      continue;
      paramContext = "N";
      localObject4 = localObject1;
      localObject1 = localObject3;
      localObject3 = localObject4;
      continue;
      label295:
      paramContext = "X";
      localObject1 = "X";
      localObject2 = "X";
      localObject3 = "X";
      continue;
      label315:
      localObject2 = "N";
      continue;
      label321:
      localObject3 = "Y";
    }
  }
  
  /* Error */
  private static String s()
  {
    // Byte code:
    //   0: ldc 35
    //   2: astore_2
    //   3: new 328	java/io/BufferedReader
    //   6: dup
    //   7: new 330	java/io/InputStreamReader
    //   10: dup
    //   11: invokestatic 336	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   14: iconst_2
    //   15: anewarray 186	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc_w 338
    //   23: aastore
    //   24: dup
    //   25: iconst_1
    //   26: ldc_w 340
    //   29: aastore
    //   30: invokevirtual 344	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   33: invokevirtual 350	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   36: invokespecial 353	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   39: invokespecial 356	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   42: astore_1
    //   43: aload_1
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 359	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   49: astore_3
    //   50: aload_2
    //   51: astore_0
    //   52: aload_3
    //   53: ifnull +36 -> 89
    //   56: aload_1
    //   57: astore_0
    //   58: aload_3
    //   59: ldc_w 361
    //   62: invokevirtual 364	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   65: ifeq -22 -> 43
    //   68: aload_1
    //   69: astore_0
    //   70: aload_3
    //   71: aload_3
    //   72: ldc_w 366
    //   75: invokevirtual 369	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   78: iconst_1
    //   79: iadd
    //   80: invokevirtual 373	java/lang/String:substring	(I)Ljava/lang/String;
    //   83: invokevirtual 376	java/lang/String:trim	()Ljava/lang/String;
    //   86: astore_3
    //   87: aload_3
    //   88: astore_0
    //   89: aload_1
    //   90: invokevirtual 379	java/io/BufferedReader:close	()V
    //   93: aload_0
    //   94: areturn
    //   95: astore_1
    //   96: aload_1
    //   97: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   100: aload_0
    //   101: areturn
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_1
    //   105: aload_1
    //   106: astore_0
    //   107: aload_3
    //   108: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   111: aload_2
    //   112: astore_0
    //   113: aload_1
    //   114: ifnull -21 -> 93
    //   117: aload_1
    //   118: invokevirtual 379	java/io/BufferedReader:close	()V
    //   121: ldc 35
    //   123: areturn
    //   124: astore_0
    //   125: aload_0
    //   126: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   129: ldc 35
    //   131: areturn
    //   132: astore_3
    //   133: aconst_null
    //   134: astore_1
    //   135: aload_1
    //   136: astore_0
    //   137: aload_3
    //   138: invokevirtual 253	java/lang/Throwable:printStackTrace	()V
    //   141: aload_2
    //   142: astore_0
    //   143: aload_1
    //   144: ifnull -51 -> 93
    //   147: aload_1
    //   148: invokevirtual 379	java/io/BufferedReader:close	()V
    //   151: ldc 35
    //   153: areturn
    //   154: astore_0
    //   155: aload_0
    //   156: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   159: ldc 35
    //   161: areturn
    //   162: astore_1
    //   163: aconst_null
    //   164: astore_0
    //   165: aload_0
    //   166: ifnull +7 -> 173
    //   169: aload_0
    //   170: invokevirtual 379	java/io/BufferedReader:close	()V
    //   173: aload_1
    //   174: athrow
    //   175: astore_0
    //   176: aload_0
    //   177: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   180: goto -7 -> 173
    //   183: astore_1
    //   184: goto -19 -> 165
    //   187: astore_3
    //   188: goto -53 -> 135
    //   191: astore_3
    //   192: goto -87 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   44	69	0	localObject1	Object
    //   124	2	0	localIOException1	IOException
    //   136	7	0	localObject2	Object
    //   154	2	0	localIOException2	IOException
    //   164	6	0	localObject3	Object
    //   175	2	0	localIOException3	IOException
    //   42	48	1	localBufferedReader	java.io.BufferedReader
    //   95	2	1	localIOException4	IOException
    //   104	44	1	localObject4	Object
    //   162	12	1	localObject5	Object
    //   183	1	1	localObject6	Object
    //   2	140	2	str1	String
    //   49	39	3	str2	String
    //   102	6	3	localIOException5	IOException
    //   132	6	3	localThrowable1	Throwable
    //   187	1	3	localThrowable2	Throwable
    //   191	1	3	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   89	93	95	java/io/IOException
    //   3	43	102	java/io/IOException
    //   117	121	124	java/io/IOException
    //   3	43	132	java/lang/Throwable
    //   147	151	154	java/io/IOException
    //   3	43	162	finally
    //   169	173	175	java/io/IOException
    //   45	50	183	finally
    //   58	68	183	finally
    //   70	87	183	finally
    //   107	111	183	finally
    //   137	141	183	finally
    //   45	50	187	java/lang/Throwable
    //   58	68	187	java/lang/Throwable
    //   70	87	187	java/lang/Throwable
    //   45	50	191	java/io/IOException
    //   58	68	191	java/io/IOException
    //   70	87	191	java/io/IOException
  }
  
  /* Error */
  private static int t()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore_1
    //   7: aconst_null
    //   8: astore_2
    //   9: new 328	java/io/BufferedReader
    //   12: dup
    //   13: new 330	java/io/InputStreamReader
    //   16: dup
    //   17: invokestatic 336	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   20: iconst_2
    //   21: anewarray 186	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: ldc_w 338
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: ldc_w 382
    //   35: aastore
    //   36: invokevirtual 344	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   39: invokevirtual 350	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   42: invokespecial 353	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   45: invokespecial 356	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   48: astore_0
    //   49: aload_0
    //   50: astore_1
    //   51: aload_0
    //   52: invokevirtual 359	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   55: astore_2
    //   56: aload_2
    //   57: ifnull +17 -> 74
    //   60: aload_0
    //   61: astore_1
    //   62: aload_2
    //   63: invokevirtual 376	java/lang/String:trim	()Ljava/lang/String;
    //   66: invokestatic 304	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   69: sipush 1000
    //   72: idiv
    //   73: istore_3
    //   74: aload_0
    //   75: invokevirtual 379	java/io/BufferedReader:close	()V
    //   78: iload_3
    //   79: ireturn
    //   80: astore_0
    //   81: aload_0
    //   82: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   85: iload_3
    //   86: ireturn
    //   87: astore_2
    //   88: aconst_null
    //   89: astore_0
    //   90: aload_0
    //   91: astore_1
    //   92: aload_2
    //   93: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   96: iload 4
    //   98: istore_3
    //   99: aload_0
    //   100: ifnull -22 -> 78
    //   103: aload_0
    //   104: invokevirtual 379	java/io/BufferedReader:close	()V
    //   107: iconst_0
    //   108: ireturn
    //   109: astore_0
    //   110: aload_0
    //   111: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   114: iconst_0
    //   115: ireturn
    //   116: astore_1
    //   117: aload_2
    //   118: astore_0
    //   119: aload_1
    //   120: astore_2
    //   121: aload_0
    //   122: astore_1
    //   123: aload_2
    //   124: invokevirtual 253	java/lang/Throwable:printStackTrace	()V
    //   127: iload 4
    //   129: istore_3
    //   130: aload_0
    //   131: ifnull -53 -> 78
    //   134: aload_0
    //   135: invokevirtual 379	java/io/BufferedReader:close	()V
    //   138: iconst_0
    //   139: ireturn
    //   140: astore_0
    //   141: aload_0
    //   142: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   145: iconst_0
    //   146: ireturn
    //   147: astore_0
    //   148: aload_1
    //   149: ifnull +7 -> 156
    //   152: aload_1
    //   153: invokevirtual 379	java/io/BufferedReader:close	()V
    //   156: aload_0
    //   157: athrow
    //   158: astore_1
    //   159: aload_1
    //   160: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   163: goto -7 -> 156
    //   166: astore_0
    //   167: goto -19 -> 148
    //   170: astore_2
    //   171: goto -50 -> 121
    //   174: astore_2
    //   175: goto -85 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   48	27	0	localBufferedReader	java.io.BufferedReader
    //   80	2	0	localIOException1	IOException
    //   89	15	0	localObject1	Object
    //   109	2	0	localIOException2	IOException
    //   118	17	0	localIOException3	IOException
    //   140	2	0	localIOException4	IOException
    //   147	10	0	localObject2	Object
    //   166	1	0	localObject3	Object
    //   6	86	1	localObject4	Object
    //   116	4	1	localThrowable1	Throwable
    //   122	31	1	localObject5	Object
    //   158	2	1	localIOException5	IOException
    //   8	55	2	str	String
    //   87	31	2	localIOException6	IOException
    //   120	4	2	localThrowable2	Throwable
    //   170	1	2	localThrowable3	Throwable
    //   174	1	2	localIOException7	IOException
    //   4	126	3	i1	int
    //   1	127	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   74	78	80	java/io/IOException
    //   9	49	87	java/io/IOException
    //   103	107	109	java/io/IOException
    //   9	49	116	java/lang/Throwable
    //   134	138	140	java/io/IOException
    //   9	49	147	finally
    //   123	127	147	finally
    //   152	156	158	java/io/IOException
    //   51	56	166	finally
    //   62	74	166	finally
    //   92	96	166	finally
    //   51	56	170	java/lang/Throwable
    //   62	74	170	java/lang/Throwable
    //   51	56	174	java/io/IOException
    //   62	74	174	java/io/IOException
  }
  
  /* Error */
  private static boolean u()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 5
    //   6: aconst_null
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: new 328	java/io/BufferedReader
    //   13: dup
    //   14: new 330	java/io/InputStreamReader
    //   17: dup
    //   18: invokestatic 336	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   21: iconst_2
    //   22: anewarray 186	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc_w 338
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc_w 340
    //   36: aastore
    //   37: invokevirtual 344	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   40: invokevirtual 350	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   43: invokespecial 353	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   46: invokespecial 356	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: astore_0
    //   50: aload_0
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 359	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: astore_2
    //   57: iload 5
    //   59: istore 4
    //   61: aload_2
    //   62: ifnull +24 -> 86
    //   65: aload_0
    //   66: astore_1
    //   67: aload_2
    //   68: invokevirtual 385	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   71: ldc_w 387
    //   74: invokevirtual 369	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   77: istore_3
    //   78: iconst_m1
    //   79: iload_3
    //   80: if_icmpeq -30 -> 50
    //   83: iconst_1
    //   84: istore 4
    //   86: aload_0
    //   87: invokevirtual 379	java/io/BufferedReader:close	()V
    //   90: iload 4
    //   92: ireturn
    //   93: astore_0
    //   94: aload_0
    //   95: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   98: iload 4
    //   100: ireturn
    //   101: astore_2
    //   102: aconst_null
    //   103: astore_0
    //   104: aload_0
    //   105: astore_1
    //   106: aload_2
    //   107: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   110: iload 6
    //   112: istore 4
    //   114: aload_0
    //   115: ifnull -25 -> 90
    //   118: aload_0
    //   119: invokevirtual 379	java/io/BufferedReader:close	()V
    //   122: iconst_0
    //   123: ireturn
    //   124: astore_0
    //   125: aload_0
    //   126: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   129: iconst_0
    //   130: ireturn
    //   131: astore_1
    //   132: aload_2
    //   133: astore_0
    //   134: aload_1
    //   135: astore_2
    //   136: aload_0
    //   137: astore_1
    //   138: aload_2
    //   139: invokevirtual 253	java/lang/Throwable:printStackTrace	()V
    //   142: iload 6
    //   144: istore 4
    //   146: aload_0
    //   147: ifnull -57 -> 90
    //   150: aload_0
    //   151: invokevirtual 379	java/io/BufferedReader:close	()V
    //   154: iconst_0
    //   155: ireturn
    //   156: astore_0
    //   157: aload_0
    //   158: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   161: iconst_0
    //   162: ireturn
    //   163: astore_0
    //   164: aload_1
    //   165: ifnull +7 -> 172
    //   168: aload_1
    //   169: invokevirtual 379	java/io/BufferedReader:close	()V
    //   172: aload_0
    //   173: athrow
    //   174: astore_1
    //   175: aload_1
    //   176: invokevirtual 380	java/io/IOException:printStackTrace	()V
    //   179: goto -7 -> 172
    //   182: astore_0
    //   183: goto -19 -> 164
    //   186: astore_2
    //   187: goto -51 -> 136
    //   190: astore_2
    //   191: goto -87 -> 104
    // Local variable table:
    //   start	length	slot	name	signature
    //   49	38	0	localBufferedReader	java.io.BufferedReader
    //   93	2	0	localIOException1	IOException
    //   103	16	0	localObject1	Object
    //   124	2	0	localIOException2	IOException
    //   133	18	0	localIOException3	IOException
    //   156	2	0	localIOException4	IOException
    //   163	10	0	localObject2	Object
    //   182	1	0	localObject3	Object
    //   7	99	1	localObject4	Object
    //   131	4	1	localThrowable1	Throwable
    //   137	32	1	localObject5	Object
    //   174	2	1	localIOException5	IOException
    //   9	59	2	str	String
    //   101	32	2	localIOException6	IOException
    //   135	4	2	localThrowable2	Throwable
    //   186	1	2	localThrowable3	Throwable
    //   190	1	2	localIOException7	IOException
    //   77	4	3	i1	int
    //   59	86	4	bool1	boolean
    //   4	54	5	bool2	boolean
    //   1	142	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   86	90	93	java/io/IOException
    //   10	50	101	java/io/IOException
    //   118	122	124	java/io/IOException
    //   10	50	131	java/lang/Throwable
    //   150	154	156	java/io/IOException
    //   10	50	163	finally
    //   138	142	163	finally
    //   168	172	174	java/io/IOException
    //   52	57	182	finally
    //   67	78	182	finally
    //   106	110	182	finally
    //   52	57	186	java/lang/Throwable
    //   67	78	186	java/lang/Throwable
    //   52	57	190	java/io/IOException
    //   67	78	190	java/io/IOException
  }
  
  private static boolean v()
  {
    b.a("getIsRootByFile", new Object[0]);
    String[] arrayOfString = new String[5];
    arrayOfString[0] = "/system/bin/";
    arrayOfString[1] = "/system/xbin/";
    arrayOfString[2] = "/system/sbin/";
    arrayOfString[3] = "/sbin/";
    arrayOfString[4] = "/vendor/bin/";
    int i1 = 0;
    try
    {
      while (i1 < arrayOfString.length)
      {
        boolean bool = new File(arrayOfString[i1] + "su").exists();
        if (bool) {
          return true;
        }
        i1 += 1;
      }
      return false;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private int w()
  {
    try
    {
      File[] arrayOfFile = new File("/sys/devices/system/cpu/").listFiles(new n.a(this));
      if (arrayOfFile == null) {
        return 1;
      }
      int i1 = arrayOfFile.length;
      return i1;
    }
    catch (Exception localException)
    {
      b.d("CPU Count: Failed.", new Object[0]);
      localException.printStackTrace();
    }
    return 1;
  }
  
  public final String b()
  {
    try
    {
      String str = this.b;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String c()
  {
    try
    {
      String str = this.c;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String d()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String f()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String g()
  {
    try
    {
      String str = this.g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String h()
  {
    try
    {
      String str = this.h;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String i()
  {
    try
    {
      String str = this.i;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String j()
  {
    try
    {
      String str = this.j;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String k()
  {
    try
    {
      String str = this.k;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String l()
  {
    return this.l;
  }
  
  public final String m()
  {
    return this.m;
  }
  
  public final String n()
  {
    return this.n;
  }
  
  public final String o()
  {
    return this.o;
  }
  
  public final String p()
  {
    return this.p;
  }
  
  public final String q()
  {
    return this.q;
  }
  
  public final String r()
  {
    return this.r;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */