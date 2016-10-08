package com.tencent.beacon.a;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.beacon.a.a.e;
import com.tencent.beacon.a.a.f;
import com.tencent.beacon.event.k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class h
{
  private static h a;
  private Context b;
  
  private h(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static int a(Context paramContext, e[] paramArrayOfe)
  {
    int j = 0;
    int i;
    if ((paramContext == null) || (paramArrayOfe == null) || (paramArrayOfe.length <= 0)) {
      i = -1;
    }
    ArrayList localArrayList;
    do
    {
      return i;
      localArrayList = new ArrayList(paramArrayOfe.length);
      int k = paramArrayOfe.length;
      i = 0;
      while (i < k)
      {
        e locale = paramArrayOfe[i];
        Object localObject = com.tencent.beacon.b.a.a(locale);
        if (localObject != null)
        {
          localObject = new com.tencent.beacon.a.a.a(6, 0, 0L, (byte[])localObject);
          ((com.tencent.beacon.a.a.a)localObject).a(locale.a());
          localArrayList.add(localObject);
        }
        i += 1;
      }
      i = j;
    } while (localArrayList.size() <= 0);
    if (com.tencent.beacon.a.a.a.b(paramContext, localArrayList)) {
      return localArrayList.size();
    }
    return -1;
  }
  
  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    com.tencent.beacon.e.b.a(" RecordDAO.deleteRecordList() start", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d(" deleteRecordList() have null args!", new Object[0]);
      return -1;
    }
    com.tencent.beacon.e.b.a(" RecordDAO.deleteRecordList() end", new Object[0]);
    return com.tencent.beacon.a.a.a.a(paramContext, paramArrayOfLong);
  }
  
  public static long a(String paramString)
  {
    if (paramString == null) {
      return 0L;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return 0L;
  }
  
  /* Error */
  public static com.tencent.beacon.a.b.h a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 6
    //   9: aload_0
    //   10: ifnonnull +16 -> 26
    //   13: ldc 84
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 87	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_2
    //   25: areturn
    //   26: aload_0
    //   27: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   30: astore_0
    //   31: aload_0
    //   32: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore_2
    //   36: aload_2
    //   37: ifnonnull +37 -> 74
    //   40: ldc 98
    //   42: iconst_0
    //   43: anewarray 4	java/lang/Object
    //   46: invokestatic 87	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aload_2
    //   50: ifnull +14 -> 64
    //   53: aload_2
    //   54: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   57: ifeq +7 -> 64
    //   60: aload_2
    //   61: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   64: aload_0
    //   65: ifnull +7 -> 72
    //   68: aload_0
    //   69: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   72: aconst_null
    //   73: areturn
    //   74: aload_2
    //   75: ldc 110
    //   77: aconst_null
    //   78: getstatic 116	java/util/Locale:US	Ljava/util/Locale;
    //   81: ldc 118
    //   83: iconst_2
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: ldc 120
    //   91: aastore
    //   92: dup
    //   93: iconst_1
    //   94: bipush 101
    //   96: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: aastore
    //   100: invokestatic 132	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   103: aconst_null
    //   104: aconst_null
    //   105: aconst_null
    //   106: aconst_null
    //   107: invokevirtual 136	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   110: astore_3
    //   111: aload_3
    //   112: ifnull +426 -> 538
    //   115: aload_3
    //   116: invokeinterface 141 1 0
    //   121: ifeq +417 -> 538
    //   124: aload 6
    //   126: astore 4
    //   128: aload_3
    //   129: ifnull +33 -> 162
    //   132: aload 6
    //   134: astore 4
    //   136: aload_3
    //   137: invokeinterface 144 1 0
    //   142: ifne +20 -> 162
    //   145: aload_3
    //   146: invokeinterface 147 1 0
    //   151: istore 8
    //   153: iload 8
    //   155: ifeq +77 -> 232
    //   158: aload 6
    //   160: astore 4
    //   162: aload 4
    //   164: ifnull +23 -> 187
    //   167: ldc -107
    //   169: iconst_1
    //   170: anewarray 4	java/lang/Object
    //   173: dup
    //   174: iconst_0
    //   175: aload 4
    //   177: invokevirtual 153	com/tencent/beacon/a/b/h:b	()I
    //   180: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   183: aastore
    //   184: invokestatic 156	com/tencent/beacon/e/b:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_3
    //   188: ifnull +18 -> 206
    //   191: aload_3
    //   192: invokeinterface 159 1 0
    //   197: ifne +9 -> 206
    //   200: aload_3
    //   201: invokeinterface 160 1 0
    //   206: aload_2
    //   207: ifnull +14 -> 221
    //   210: aload_2
    //   211: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   214: ifeq +7 -> 221
    //   217: aload_2
    //   218: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   221: aload_0
    //   222: ifnull +313 -> 535
    //   225: aload_0
    //   226: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   229: aload 4
    //   231: areturn
    //   232: ldc -94
    //   234: iconst_0
    //   235: anewarray 4	java/lang/Object
    //   238: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: new 151	com/tencent/beacon/a/b/h
    //   244: dup
    //   245: invokespecial 165	com/tencent/beacon/a/b/h:<init>	()V
    //   248: astore 4
    //   250: aload 4
    //   252: aload_3
    //   253: aload_3
    //   254: ldc -89
    //   256: invokeinterface 171 2 0
    //   261: invokeinterface 175 2 0
    //   266: invokevirtual 178	com/tencent/beacon/a/b/h:a	(J)V
    //   269: aload 4
    //   271: aload_3
    //   272: aload_3
    //   273: ldc 120
    //   275: invokeinterface 171 2 0
    //   280: invokeinterface 182 2 0
    //   285: invokevirtual 184	com/tencent/beacon/a/b/h:a	(I)V
    //   288: aload 4
    //   290: aload_3
    //   291: aload_3
    //   292: ldc -70
    //   294: invokeinterface 171 2 0
    //   299: invokeinterface 190 2 0
    //   304: invokevirtual 193	com/tencent/beacon/a/b/h:a	([B)V
    //   307: goto -145 -> 162
    //   310: astore 4
    //   312: aconst_null
    //   313: astore_2
    //   314: aconst_null
    //   315: astore_3
    //   316: aconst_null
    //   317: astore_0
    //   318: aload 4
    //   320: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   323: aload 5
    //   325: ifnull +20 -> 345
    //   328: aload 5
    //   330: invokeinterface 159 1 0
    //   335: ifne +10 -> 345
    //   338: aload 5
    //   340: invokeinterface 160 1 0
    //   345: aload_2
    //   346: ifnull +14 -> 360
    //   349: aload_2
    //   350: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   353: ifeq +7 -> 360
    //   356: aload_2
    //   357: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   360: aload_0
    //   361: astore_2
    //   362: aload_3
    //   363: ifnull -339 -> 24
    //   366: aload_3
    //   367: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   370: aload_0
    //   371: areturn
    //   372: astore_2
    //   373: aconst_null
    //   374: astore_3
    //   375: aconst_null
    //   376: astore_0
    //   377: aload_3
    //   378: ifnull +18 -> 396
    //   381: aload_3
    //   382: invokeinterface 159 1 0
    //   387: ifne +9 -> 396
    //   390: aload_3
    //   391: invokeinterface 160 1 0
    //   396: aload 4
    //   398: ifnull +16 -> 414
    //   401: aload 4
    //   403: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   406: ifeq +8 -> 414
    //   409: aload 4
    //   411: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   414: aload_0
    //   415: ifnull +7 -> 422
    //   418: aload_0
    //   419: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   422: aload_2
    //   423: athrow
    //   424: astore_2
    //   425: aconst_null
    //   426: astore_3
    //   427: goto -50 -> 377
    //   430: astore 5
    //   432: aconst_null
    //   433: astore_3
    //   434: aload_2
    //   435: astore 4
    //   437: aload 5
    //   439: astore_2
    //   440: goto -63 -> 377
    //   443: astore 5
    //   445: aload_2
    //   446: astore 4
    //   448: aload 5
    //   450: astore_2
    //   451: goto -74 -> 377
    //   454: astore 6
    //   456: aload_3
    //   457: astore_0
    //   458: aload 5
    //   460: astore_3
    //   461: aload_2
    //   462: astore 4
    //   464: aload 6
    //   466: astore_2
    //   467: goto -90 -> 377
    //   470: astore 4
    //   472: aconst_null
    //   473: astore_2
    //   474: aload_0
    //   475: astore_3
    //   476: aconst_null
    //   477: astore_0
    //   478: goto -160 -> 318
    //   481: astore 4
    //   483: aload_0
    //   484: astore_3
    //   485: aconst_null
    //   486: astore_0
    //   487: goto -169 -> 318
    //   490: astore 4
    //   492: aload_0
    //   493: astore 5
    //   495: aconst_null
    //   496: astore_0
    //   497: aload_3
    //   498: astore 6
    //   500: aload 5
    //   502: astore_3
    //   503: aload 6
    //   505: astore 5
    //   507: goto -189 -> 318
    //   510: astore 7
    //   512: aload_0
    //   513: astore 5
    //   515: aload 4
    //   517: astore_0
    //   518: aload_3
    //   519: astore 6
    //   521: aload 7
    //   523: astore 4
    //   525: aload 5
    //   527: astore_3
    //   528: aload 6
    //   530: astore 5
    //   532: goto -214 -> 318
    //   535: aload 4
    //   537: areturn
    //   538: aconst_null
    //   539: astore 4
    //   541: goto -354 -> 187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	544	0	paramContext	Context
    //   0	544	1	paramInt	int
    //   23	339	2	localObject1	Object
    //   372	51	2	localObject2	Object
    //   424	11	2	localObject3	Object
    //   439	35	2	localObject4	Object
    //   110	418	3	localObject5	Object
    //   4	285	4	localObject6	Object
    //   310	100	4	localThrowable1	Throwable
    //   435	28	4	localObject7	Object
    //   470	1	4	localThrowable2	Throwable
    //   481	1	4	localThrowable3	Throwable
    //   490	26	4	localThrowable4	Throwable
    //   523	17	4	localObject8	Object
    //   1	338	5	localObject9	Object
    //   430	8	5	localObject10	Object
    //   443	16	5	localObject11	Object
    //   493	38	5	localObject12	Object
    //   7	152	6	localObject13	Object
    //   454	11	6	localObject14	Object
    //   498	31	6	localObject15	Object
    //   510	12	7	localThrowable5	Throwable
    //   151	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   26	31	310	java/lang/Throwable
    //   26	31	372	finally
    //   31	36	424	finally
    //   40	49	430	finally
    //   74	111	430	finally
    //   115	124	443	finally
    //   136	153	443	finally
    //   167	187	443	finally
    //   232	307	443	finally
    //   318	323	454	finally
    //   31	36	470	java/lang/Throwable
    //   40	49	481	java/lang/Throwable
    //   74	111	481	java/lang/Throwable
    //   115	124	490	java/lang/Throwable
    //   136	153	490	java/lang/Throwable
    //   232	307	490	java/lang/Throwable
    //   167	187	510	java/lang/Throwable
  }
  
  public static h a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new h(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static String a(Map<String, String> paramMap)
  {
    com.tencent.beacon.e.b.b("map 2 str", new Object[0]);
    if (paramMap == null) {
      return "";
    }
    Object localObject = paramMap.keySet();
    if (localObject == null) {
      return "";
    }
    if (((Set)localObject).size() > 50) {
      com.tencent.beacon.e.b.c("The Map<String, String> params size is more than 50, effective size is <= 50!", new Object[0]);
    }
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = ((Set)localObject).iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      int i = str2.trim().length();
      String str1;
      if ((i > 0) && (e(str2)))
      {
        str1 = str2.trim();
        localObject = str1;
        if (i > 64) {
          localObject = str1.substring(0, 64);
        }
        localStringBuffer.append("&");
        localStringBuffer.append(((String)localObject).replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
        localStringBuffer.append("=");
        localObject = (String)paramMap.get(str2);
        if (localObject == null) {
          continue;
        }
        str1 = ((String)localObject).trim();
        if (!str1.contains(";")) {
          break label321;
        }
        localObject = str1;
        if (str1.length() > 10240)
        {
          localObject = str1.substring(0, 10240);
          localObject = ((String)localObject).substring(0, ((String)localObject).lastIndexOf(";"));
        }
      }
      for (;;)
      {
        localStringBuffer.append(((String)localObject).replace('\n', ' ').replace('\r', ' ').replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
        break;
        com.tencent.beacon.e.b.c("The Map<String, String> params key is invalid!! key should be ASCII code in 32-126! key:" + str2, new Object[0]);
        break;
        label321:
        localObject = str1;
        if (str1.length() > 1024) {
          localObject = str1.substring(0, 1024);
        }
      }
    }
    paramMap = localStringBuffer.substring(1);
    localStringBuffer.setLength(0);
    return paramMap;
  }
  
  /* Error */
  public static List<com.tencent.beacon.a.a.b> a(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: ldc_w 306
    //   9: iconst_0
    //   10: anewarray 4	java/lang/Object
    //   13: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aload_0
    //   17: ifnonnull +15 -> 32
    //   20: ldc_w 308
    //   23: iconst_0
    //   24: anewarray 4	java/lang/Object
    //   27: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aconst_null
    //   31: areturn
    //   32: aload_0
    //   33: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   36: astore_0
    //   37: aload_0
    //   38: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore_2
    //   42: aload_2
    //   43: ldc_w 310
    //   46: aconst_null
    //   47: ldc_w 312
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokevirtual 136	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_3
    //   58: new 19	java/util/ArrayList
    //   61: dup
    //   62: invokespecial 313	java/util/ArrayList:<init>	()V
    //   65: astore 4
    //   67: aload_3
    //   68: invokeinterface 141 1 0
    //   73: ifeq +188 -> 261
    //   76: new 315	com/tencent/beacon/a/a/b
    //   79: dup
    //   80: invokespecial 316	com/tencent/beacon/a/a/b:<init>	()V
    //   83: astore 5
    //   85: aload 5
    //   87: aload_3
    //   88: aload_3
    //   89: ldc -89
    //   91: invokeinterface 171 2 0
    //   96: invokeinterface 182 2 0
    //   101: i2l
    //   102: putfield 319	com/tencent/beacon/a/a/b:a	J
    //   105: aload 5
    //   107: aload_3
    //   108: aload_3
    //   109: ldc_w 321
    //   112: invokeinterface 171 2 0
    //   117: invokeinterface 324 2 0
    //   122: putfield 327	com/tencent/beacon/a/a/b:b	Ljava/lang/String;
    //   125: aload 5
    //   127: aload_3
    //   128: aload_3
    //   129: ldc_w 329
    //   132: invokeinterface 171 2 0
    //   137: invokeinterface 182 2 0
    //   142: putfield 332	com/tencent/beacon/a/a/b:c	I
    //   145: aload_3
    //   146: aload_3
    //   147: ldc_w 334
    //   150: invokeinterface 171 2 0
    //   155: invokeinterface 182 2 0
    //   160: iconst_1
    //   161: if_icmpne +95 -> 256
    //   164: iconst_1
    //   165: istore_1
    //   166: aload 5
    //   168: iload_1
    //   169: putfield 337	com/tencent/beacon/a/a/b:d	Z
    //   172: aload 4
    //   174: aload 5
    //   176: invokeinterface 340 2 0
    //   181: pop
    //   182: goto -115 -> 67
    //   185: astore 5
    //   187: aload_0
    //   188: astore 5
    //   190: aload 4
    //   192: astore_0
    //   193: aload_3
    //   194: astore 4
    //   196: aload 5
    //   198: astore_3
    //   199: aload 4
    //   201: ifnull +20 -> 221
    //   204: aload 4
    //   206: invokeinterface 159 1 0
    //   211: ifne +10 -> 221
    //   214: aload 4
    //   216: invokeinterface 160 1 0
    //   221: aload_2
    //   222: ifnull +14 -> 236
    //   225: aload_2
    //   226: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   229: ifeq +7 -> 236
    //   232: aload_2
    //   233: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   236: aload_3
    //   237: ifnull +7 -> 244
    //   240: aload_3
    //   241: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   244: ldc_w 342
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aload_0
    //   255: areturn
    //   256: iconst_0
    //   257: istore_1
    //   258: goto -92 -> 166
    //   261: new 284	java/lang/StringBuilder
    //   264: dup
    //   265: ldc_w 344
    //   268: invokespecial 289	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   271: aload 4
    //   273: invokeinterface 345 1 0
    //   278: invokevirtual 348	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   281: invokevirtual 295	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: iconst_0
    //   285: anewarray 4	java/lang/Object
    //   288: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: aload_3
    //   292: ifnull +18 -> 310
    //   295: aload_3
    //   296: invokeinterface 159 1 0
    //   301: ifne +9 -> 310
    //   304: aload_3
    //   305: invokeinterface 160 1 0
    //   310: aload_2
    //   311: ifnull +14 -> 325
    //   314: aload_2
    //   315: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   318: ifeq +7 -> 325
    //   321: aload_2
    //   322: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   325: aload_0
    //   326: ifnull +7 -> 333
    //   329: aload_0
    //   330: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   333: ldc_w 342
    //   336: iconst_0
    //   337: anewarray 4	java/lang/Object
    //   340: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: aload 4
    //   345: areturn
    //   346: astore_2
    //   347: aconst_null
    //   348: astore_3
    //   349: aconst_null
    //   350: astore_0
    //   351: aload 5
    //   353: astore 4
    //   355: aload_3
    //   356: ifnull +18 -> 374
    //   359: aload_3
    //   360: invokeinterface 159 1 0
    //   365: ifne +9 -> 374
    //   368: aload_3
    //   369: invokeinterface 160 1 0
    //   374: aload 4
    //   376: ifnull +16 -> 392
    //   379: aload 4
    //   381: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   384: ifeq +8 -> 392
    //   387: aload 4
    //   389: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   392: aload_0
    //   393: ifnull +7 -> 400
    //   396: aload_0
    //   397: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   400: ldc_w 342
    //   403: iconst_0
    //   404: anewarray 4	java/lang/Object
    //   407: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: aload_2
    //   411: athrow
    //   412: astore_2
    //   413: aconst_null
    //   414: astore_3
    //   415: aload 5
    //   417: astore 4
    //   419: goto -64 -> 355
    //   422: astore 5
    //   424: aconst_null
    //   425: astore_3
    //   426: aload_2
    //   427: astore 4
    //   429: aload 5
    //   431: astore_2
    //   432: goto -77 -> 355
    //   435: astore 5
    //   437: aload_2
    //   438: astore 4
    //   440: aload 5
    //   442: astore_2
    //   443: goto -88 -> 355
    //   446: astore_0
    //   447: aconst_null
    //   448: astore_0
    //   449: aconst_null
    //   450: astore_2
    //   451: aconst_null
    //   452: astore_3
    //   453: goto -254 -> 199
    //   456: astore_2
    //   457: aconst_null
    //   458: astore 5
    //   460: aconst_null
    //   461: astore_2
    //   462: aload_0
    //   463: astore_3
    //   464: aload 5
    //   466: astore_0
    //   467: goto -268 -> 199
    //   470: astore_3
    //   471: aload_0
    //   472: astore_3
    //   473: aconst_null
    //   474: astore_0
    //   475: goto -276 -> 199
    //   478: astore 4
    //   480: aconst_null
    //   481: astore 5
    //   483: aload_3
    //   484: astore 4
    //   486: aload_0
    //   487: astore_3
    //   488: aload 5
    //   490: astore_0
    //   491: goto -292 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	paramContext	Context
    //   0	494	1	paramBoolean	boolean
    //   41	281	2	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   346	65	2	localObject1	Object
    //   412	15	2	localObject2	Object
    //   431	20	2	localObject3	Object
    //   456	1	2	localException1	Exception
    //   461	1	2	localObject4	Object
    //   57	407	3	localObject5	Object
    //   470	1	3	localException2	Exception
    //   472	16	3	localContext1	Context
    //   4	435	4	localObject6	Object
    //   478	1	4	localException3	Exception
    //   484	1	4	localObject7	Object
    //   1	174	5	localb	com.tencent.beacon.a.a.b
    //   185	1	5	localException4	Exception
    //   188	228	5	localContext2	Context
    //   422	8	5	localObject8	Object
    //   435	6	5	localObject9	Object
    //   458	31	5	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   67	164	185	java/lang/Exception
    //   166	182	185	java/lang/Exception
    //   261	291	185	java/lang/Exception
    //   32	37	346	finally
    //   37	42	412	finally
    //   42	58	422	finally
    //   58	67	435	finally
    //   67	164	435	finally
    //   166	182	435	finally
    //   261	291	435	finally
    //   32	37	446	java/lang/Exception
    //   37	42	456	java/lang/Exception
    //   42	58	470	java/lang/Exception
    //   58	67	478	java/lang/Exception
  }
  
  public static List<k> a(Context paramContext, String[] paramArrayOfString, int paramInt)
  {
    com.tencent.beacon.e.b.a(" RecordDAO.queryRecentRecord() start", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d(" queryRecentRecord() have null args!", new Object[0]);
      return null;
    }
    paramArrayOfString = com.tencent.beacon.a.a.a.a(paramContext, new int[] { 1, 2, 3, 4 }, 1, 2, paramInt, -1, -1, -1, -1, -1L, -1L);
    if ((paramArrayOfString == null) || (paramArrayOfString.size() <= 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramArrayOfString.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      com.tencent.beacon.a.a.a locala = (com.tencent.beacon.a.a.a)((Iterator)localObject1).next();
      try
      {
        Object localObject2 = com.tencent.beacon.b.a.a(locala.b());
        if ((localObject2 != null) && (k.class.isInstance(localObject2)))
        {
          localObject2 = (k)k.class.cast(localObject2);
          ((k)localObject2).a(locala.a());
          localArrayList.add(localObject2);
          ((Iterator)localObject1).remove();
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        com.tencent.beacon.e.b.d(" query have error!", new Object[0]);
      }
    }
    if (paramArrayOfString.size() > 0)
    {
      com.tencent.beacon.e.b.a(" there are error datas ,should be remove " + paramArrayOfString.size(), new Object[0]);
      localObject1 = new Long[paramArrayOfString.size()];
      paramInt = 0;
      while (paramInt < paramArrayOfString.size())
      {
        localObject1[paramInt] = Long.valueOf(((com.tencent.beacon.a.a.a)paramArrayOfString.get(paramInt)).a());
        paramInt += 1;
      }
      com.tencent.beacon.a.a.a.a(paramContext, (Long[])localObject1);
    }
    com.tencent.beacon.e.b.a(" RecordDAO.queryRecentRecord() end", new Object[0]);
    return localArrayList;
  }
  
  public static void a(Map<String, String> paramMap, String paramString, long paramLong)
  {
    if ((paramMap == null) || (paramString == null))
    {
      com.tencent.beacon.e.b.c(" err addVMap, pls check!}", new Object[0]);
      return;
    }
    paramMap.put(paramString, Long.toString(a((String)paramMap.get(paramString)) + paramLong));
  }
  
  /* Error */
  public static boolean a(Context paramContext, com.tencent.beacon.a.b.h paramh)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 7
    //   5: iconst_0
    //   6: istore 8
    //   8: aload_0
    //   9: ifnull +7 -> 16
    //   12: aload_1
    //   13: ifnonnull +20 -> 33
    //   16: ldc_w 410
    //   19: iconst_0
    //   20: anewarray 4	java/lang/Object
    //   23: invokestatic 87	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: iload 8
    //   28: istore 7
    //   30: iload 7
    //   32: ireturn
    //   33: aload_0
    //   34: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   37: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnonnull +40 -> 82
    //   45: aload_2
    //   46: astore_0
    //   47: ldc_w 412
    //   50: iconst_0
    //   51: anewarray 4	java/lang/Object
    //   54: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: iload 8
    //   59: istore 7
    //   61: aload_2
    //   62: ifnull -32 -> 30
    //   65: iload 8
    //   67: istore 7
    //   69: aload_2
    //   70: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   73: ifeq -43 -> 30
    //   76: aload_2
    //   77: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   80: iconst_0
    //   81: ireturn
    //   82: aload_1
    //   83: ifnonnull +73 -> 156
    //   86: iload 7
    //   88: istore 6
    //   90: aload_3
    //   91: ifnull +39 -> 130
    //   94: aload_2
    //   95: astore_0
    //   96: aload_2
    //   97: ldc 110
    //   99: ldc -89
    //   101: aload_3
    //   102: invokevirtual 415	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   105: lstore 4
    //   107: lload 4
    //   109: lconst_0
    //   110: lcmp
    //   111: ifge +156 -> 267
    //   114: aload_2
    //   115: astore_0
    //   116: ldc_w 417
    //   119: iconst_0
    //   120: anewarray 4	java/lang/Object
    //   123: invokestatic 87	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: iload 7
    //   128: istore 6
    //   130: iload 6
    //   132: istore 7
    //   134: aload_2
    //   135: ifnull -105 -> 30
    //   138: iload 6
    //   140: istore 7
    //   142: aload_2
    //   143: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   146: ifeq -116 -> 30
    //   149: aload_2
    //   150: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   153: iload 6
    //   155: ireturn
    //   156: aload_2
    //   157: astore_0
    //   158: new 419	android/content/ContentValues
    //   161: dup
    //   162: invokespecial 420	android/content/ContentValues:<init>	()V
    //   165: astore_3
    //   166: aload_2
    //   167: astore_0
    //   168: aload_1
    //   169: invokevirtual 421	com/tencent/beacon/a/b/h:a	()J
    //   172: lconst_0
    //   173: lcmp
    //   174: iflt +18 -> 192
    //   177: aload_2
    //   178: astore_0
    //   179: aload_3
    //   180: ldc -89
    //   182: aload_1
    //   183: invokevirtual 421	com/tencent/beacon/a/b/h:a	()J
    //   186: invokestatic 391	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   189: invokevirtual 424	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   192: aload_2
    //   193: astore_0
    //   194: aload_3
    //   195: ldc 120
    //   197: aload_1
    //   198: invokevirtual 153	com/tencent/beacon/a/b/h:b	()I
    //   201: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   204: invokevirtual 427	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   207: aload_2
    //   208: astore_0
    //   209: aload_3
    //   210: ldc -70
    //   212: aload_1
    //   213: invokevirtual 429	com/tencent/beacon/a/b/h:c	()[B
    //   216: invokevirtual 432	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   219: goto -133 -> 86
    //   222: astore_1
    //   223: aload_2
    //   224: astore_0
    //   225: ldc_w 434
    //   228: iconst_1
    //   229: anewarray 4	java/lang/Object
    //   232: dup
    //   233: iconst_0
    //   234: aload_1
    //   235: invokevirtual 435	java/lang/Throwable:toString	()Ljava/lang/String;
    //   238: aastore
    //   239: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: iload 8
    //   244: istore 7
    //   246: aload_2
    //   247: ifnull -217 -> 30
    //   250: iload 8
    //   252: istore 7
    //   254: aload_2
    //   255: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   258: ifeq -228 -> 30
    //   261: aload_2
    //   262: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   265: iconst_0
    //   266: ireturn
    //   267: aload_2
    //   268: astore_0
    //   269: aload_1
    //   270: lload 4
    //   272: invokevirtual 178	com/tencent/beacon/a/b/h:a	(J)V
    //   275: aload_2
    //   276: astore_0
    //   277: ldc_w 437
    //   280: iconst_1
    //   281: anewarray 4	java/lang/Object
    //   284: dup
    //   285: iconst_0
    //   286: aload_1
    //   287: invokevirtual 153	com/tencent/beacon/a/b/h:b	()I
    //   290: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   293: aastore
    //   294: invokestatic 439	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   297: iconst_1
    //   298: istore 6
    //   300: goto -170 -> 130
    //   303: astore_1
    //   304: aconst_null
    //   305: astore_0
    //   306: aload_0
    //   307: ifnull +14 -> 321
    //   310: aload_0
    //   311: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   314: ifeq +7 -> 321
    //   317: aload_0
    //   318: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   321: aload_1
    //   322: athrow
    //   323: astore_1
    //   324: goto -18 -> 306
    //   327: astore_1
    //   328: aconst_null
    //   329: astore_2
    //   330: goto -107 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	paramContext	Context
    //   0	333	1	paramh	com.tencent.beacon.a.b.h
    //   40	290	2	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   1	209	3	localContentValues	android.content.ContentValues
    //   105	166	4	l	long
    //   88	211	6	bool1	boolean
    //   3	250	7	bool2	boolean
    //   6	245	8	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   47	57	222	java/lang/Throwable
    //   96	107	222	java/lang/Throwable
    //   116	126	222	java/lang/Throwable
    //   158	166	222	java/lang/Throwable
    //   168	177	222	java/lang/Throwable
    //   179	192	222	java/lang/Throwable
    //   194	207	222	java/lang/Throwable
    //   209	219	222	java/lang/Throwable
    //   269	275	222	java/lang/Throwable
    //   277	297	222	java/lang/Throwable
    //   33	41	303	finally
    //   47	57	323	finally
    //   96	107	323	finally
    //   116	126	323	finally
    //   158	166	323	finally
    //   168	177	323	finally
    //   179	192	323	finally
    //   194	207	323	finally
    //   209	219	323	finally
    //   225	242	323	finally
    //   269	275	323	finally
    //   277	297	323	finally
    //   33	41	327	java/lang/Throwable
  }
  
  /* Error */
  public static boolean a(Context paramContext, k paramk)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore 5
    //   3: ldc_w 442
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: aload_0
    //   14: ifnull +14 -> 28
    //   17: aload_1
    //   18: ifnull +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 444	com/tencent/beacon/event/k:b	()Ljava/lang/String;
    //   25: ifnonnull +15 -> 40
    //   28: ldc_w 446
    //   31: iconst_0
    //   32: anewarray 4	java/lang/Object
    //   35: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: iconst_0
    //   39: ireturn
    //   40: aload_1
    //   41: invokevirtual 444	com/tencent/beacon/event/k:b	()Ljava/lang/String;
    //   44: ldc_w 448
    //   47: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   50: ifeq +73 -> 123
    //   53: iconst_1
    //   54: istore 4
    //   56: new 29	com/tencent/beacon/a/a/a
    //   59: dup
    //   60: iload 4
    //   62: iload 5
    //   64: aload_1
    //   65: invokevirtual 453	com/tencent/beacon/event/k:c	()J
    //   68: aload_1
    //   69: invokestatic 27	com/tencent/beacon/b/a:a	(Ljava/lang/Object;)[B
    //   72: invokespecial 32	com/tencent/beacon/a/a/a:<init>	(IIJ[B)V
    //   75: astore_2
    //   76: aload_0
    //   77: ifnull +7 -> 84
    //   80: aload_2
    //   81: ifnonnull +120 -> 201
    //   84: ldc_w 455
    //   87: iconst_0
    //   88: anewarray 4	java/lang/Object
    //   91: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: iconst_0
    //   95: istore 6
    //   97: iload 6
    //   99: ifeq +11 -> 110
    //   102: aload_1
    //   103: aload_2
    //   104: invokevirtual 377	com/tencent/beacon/a/a/a:a	()J
    //   107: invokevirtual 378	com/tencent/beacon/event/k:a	(J)V
    //   110: ldc_w 457
    //   113: iconst_0
    //   114: anewarray 4	java/lang/Object
    //   117: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: iload 6
    //   122: ireturn
    //   123: aload_1
    //   124: invokevirtual 444	com/tencent/beacon/event/k:b	()Ljava/lang/String;
    //   127: ldc_w 459
    //   130: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   133: ifeq +12 -> 145
    //   136: iconst_2
    //   137: istore 4
    //   139: iconst_0
    //   140: istore 5
    //   142: goto -86 -> 56
    //   145: aload_1
    //   146: invokevirtual 444	com/tencent/beacon/event/k:b	()Ljava/lang/String;
    //   149: ldc_w 461
    //   152: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifeq +12 -> 167
    //   158: iconst_3
    //   159: istore 4
    //   161: iconst_0
    //   162: istore 5
    //   164: goto -108 -> 56
    //   167: aload_1
    //   168: invokevirtual 444	com/tencent/beacon/event/k:b	()Ljava/lang/String;
    //   171: ldc_w 463
    //   174: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   177: ifeq +12 -> 189
    //   180: iconst_4
    //   181: istore 4
    //   183: iconst_0
    //   184: istore 5
    //   186: goto -130 -> 56
    //   189: ldc_w 465
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: iconst_0
    //   200: ireturn
    //   201: new 19	java/util/ArrayList
    //   204: dup
    //   205: invokespecial 313	java/util/ArrayList:<init>	()V
    //   208: astore_3
    //   209: aload_3
    //   210: aload_2
    //   211: invokevirtual 44	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   214: pop
    //   215: aload_0
    //   216: aload_3
    //   217: invokestatic 467	com/tencent/beacon/a/a/a:a	(Landroid/content/Context;Ljava/util/List;)Z
    //   220: istore 6
    //   222: goto -125 -> 97
    //   225: astore_0
    //   226: aload_0
    //   227: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   230: ldc_w 469
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: ldc_w 457
    //   243: iconst_0
    //   244: anewarray 4	java/lang/Object
    //   247: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: iconst_0
    //   251: ireturn
    //   252: astore_0
    //   253: ldc_w 457
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_0
    //   264: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	paramContext	Context
    //   0	265	1	paramk	k
    //   75	136	2	locala	com.tencent.beacon.a.a.a
    //   208	9	3	localArrayList	ArrayList
    //   54	128	4	i	int
    //   1	184	5	j	int
    //   95	126	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   56	76	225	java/lang/Throwable
    //   84	94	225	java/lang/Throwable
    //   102	110	225	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   56	76	252	finally
    //   84	94	252	finally
    //   102	110	252	finally
    //   201	222	252	finally
    //   226	240	252	finally
  }
  
  /* Error */
  public static boolean a(Context paramContext, List<com.tencent.beacon.a.a.b> paramList, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 472
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: ifnull +16 -> 29
    //   16: aload_1
    //   17: ifnull +12 -> 29
    //   20: aload_1
    //   21: invokeinterface 345 1 0
    //   26: ifne +5 -> 31
    //   29: iconst_0
    //   30: ireturn
    //   31: aload_0
    //   32: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   35: astore_0
    //   36: aload_0
    //   37: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   40: astore 4
    //   42: aload 4
    //   44: astore_3
    //   45: aload_3
    //   46: invokevirtual 475	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   49: aload_1
    //   50: invokeinterface 360 1 0
    //   55: astore_1
    //   56: aload_1
    //   57: invokeinterface 227 1 0
    //   62: ifeq +174 -> 236
    //   65: aload_1
    //   66: invokeinterface 231 1 0
    //   71: checkcast 315	com/tencent/beacon/a/a/b
    //   74: astore 4
    //   76: new 419	android/content/ContentValues
    //   79: dup
    //   80: invokespecial 420	android/content/ContentValues:<init>	()V
    //   83: astore 5
    //   85: aload 5
    //   87: ldc_w 321
    //   90: aload 4
    //   92: getfield 327	com/tencent/beacon/a/a/b:b	Ljava/lang/String;
    //   95: invokevirtual 478	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: aload 5
    //   100: ldc_w 329
    //   103: aload 4
    //   105: getfield 332	com/tencent/beacon/a/a/b:c	I
    //   108: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: invokevirtual 427	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   114: aload 4
    //   116: getfield 337	com/tencent/beacon/a/a/b:d	Z
    //   119: ifeq +105 -> 224
    //   122: iconst_1
    //   123: istore 6
    //   125: aload 5
    //   127: ldc_w 334
    //   130: iload 6
    //   132: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: invokevirtual 427	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   138: iload_2
    //   139: ifeq +91 -> 230
    //   142: iconst_1
    //   143: istore 6
    //   145: aload 5
    //   147: ldc_w 480
    //   150: iload 6
    //   152: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   155: invokevirtual 427	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   158: aload_3
    //   159: ldc_w 310
    //   162: aconst_null
    //   163: aload 5
    //   165: invokevirtual 483	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   168: pop2
    //   169: goto -113 -> 56
    //   172: astore_1
    //   173: aload_3
    //   174: astore_1
    //   175: ldc_w 485
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload_1
    //   186: ifnull +18 -> 204
    //   189: aload_1
    //   190: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   193: ifeq +11 -> 204
    //   196: aload_1
    //   197: invokevirtual 488	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   200: aload_1
    //   201: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   204: aload_0
    //   205: ifnull +7 -> 212
    //   208: aload_0
    //   209: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   212: ldc_w 490
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: iconst_0
    //   223: ireturn
    //   224: iconst_0
    //   225: istore 6
    //   227: goto -102 -> 125
    //   230: iconst_0
    //   231: istore 6
    //   233: goto -88 -> 145
    //   236: aload_3
    //   237: invokevirtual 493	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   240: aload_3
    //   241: ifnull +18 -> 259
    //   244: aload_3
    //   245: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   248: ifeq +11 -> 259
    //   251: aload_3
    //   252: invokevirtual 488	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   255: aload_3
    //   256: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   259: aload_0
    //   260: ifnull +7 -> 267
    //   263: aload_0
    //   264: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   267: ldc_w 490
    //   270: iconst_0
    //   271: anewarray 4	java/lang/Object
    //   274: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: iconst_1
    //   278: ireturn
    //   279: astore_1
    //   280: aconst_null
    //   281: astore_3
    //   282: aconst_null
    //   283: astore_0
    //   284: aload_3
    //   285: ifnull +18 -> 303
    //   288: aload_3
    //   289: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   292: ifeq +11 -> 303
    //   295: aload_3
    //   296: invokevirtual 488	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   299: aload_3
    //   300: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   303: aload_0
    //   304: ifnull +7 -> 311
    //   307: aload_0
    //   308: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   311: ldc_w 490
    //   314: iconst_0
    //   315: anewarray 4	java/lang/Object
    //   318: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   321: aload_1
    //   322: athrow
    //   323: astore_1
    //   324: aconst_null
    //   325: astore_3
    //   326: goto -42 -> 284
    //   329: astore_1
    //   330: goto -46 -> 284
    //   333: astore_3
    //   334: aload_1
    //   335: astore 4
    //   337: aload_3
    //   338: astore_1
    //   339: aload 4
    //   341: astore_3
    //   342: goto -58 -> 284
    //   345: astore_0
    //   346: aconst_null
    //   347: astore_0
    //   348: aload_3
    //   349: astore_1
    //   350: goto -175 -> 175
    //   353: astore_1
    //   354: aload_3
    //   355: astore_1
    //   356: goto -181 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	359	0	paramContext	Context
    //   0	359	1	paramList	List<com.tencent.beacon.a.a.b>
    //   0	359	2	paramBoolean	boolean
    //   1	325	3	localObject1	Object
    //   333	5	3	localObject2	Object
    //   341	14	3	localObject3	Object
    //   40	300	4	localObject4	Object
    //   83	81	5	localContentValues	android.content.ContentValues
    //   123	109	6	i	int
    // Exception table:
    //   from	to	target	type
    //   45	56	172	java/lang/Throwable
    //   56	122	172	java/lang/Throwable
    //   125	138	172	java/lang/Throwable
    //   145	169	172	java/lang/Throwable
    //   236	240	172	java/lang/Throwable
    //   31	36	279	finally
    //   36	42	323	finally
    //   45	56	329	finally
    //   56	122	329	finally
    //   125	138	329	finally
    //   145	169	329	finally
    //   236	240	329	finally
    //   175	185	333	finally
    //   31	36	345	java/lang/Throwable
    //   36	42	353	java/lang/Throwable
  }
  
  public static byte[] a(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    if (paramInt == 1) {
      if ((paramString != null) && (paramArrayOfByte != null)) {}
    }
    while (paramInt != 3)
    {
      return null;
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      DESKeySpec localDESKeySpec = new DESKeySpec(paramString.getBytes("UTF-8"));
      localCipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(localDESKeySpec), new IvParameterSpec(paramString.getBytes("UTF-8")));
      return localCipher.doFinal(paramArrayOfByte);
    }
    return a(paramString, paramArrayOfByte);
  }
  
  public static byte[] a(int paramInt, byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream;
    Object localObject;
    if (paramInt == 1)
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject = new ZipOutputStream(localByteArrayOutputStream);
      ZipEntry localZipEntry = new ZipEntry("zip");
      localZipEntry.setSize(paramArrayOfByte.length);
      ((ZipOutputStream)localObject).putNextEntry(localZipEntry);
      ((ZipOutputStream)localObject).write(paramArrayOfByte);
      ((ZipOutputStream)localObject).closeEntry();
      ((ZipOutputStream)localObject).close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return paramArrayOfByte;
    }
    if (paramInt == 2)
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject = new GZIPOutputStream(localByteArrayOutputStream);
      ((GZIPOutputStream)localObject).write(paramArrayOfByte);
      ((GZIPOutputStream)localObject).finish();
      ((GZIPOutputStream)localObject).close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return paramArrayOfByte;
    }
    return null;
  }
  
  private static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    int j = 0;
    if ((paramString == null) || (paramArrayOfByte == null))
    {
      paramString = null;
      return paramString;
    }
    int i = paramString.length();
    while (i < 16)
    {
      paramString = paramString + "0";
      i += 1;
    }
    paramString = paramString.substring(0, 16);
    Object localObject = new StringBuffer();
    int k = paramArrayOfByte.length;
    i = 0;
    while (i < k)
    {
      int m = paramArrayOfByte[i];
      ((StringBuffer)localObject).append(m + " ");
      i += 1;
    }
    localObject = new SecretKeySpec(paramString.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, (Key)localObject, new IvParameterSpec(paramString.getBytes()));
    paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
    localObject = new StringBuffer();
    k = paramArrayOfByte.length;
    i = j;
    for (;;)
    {
      paramString = paramArrayOfByte;
      if (i >= k) {
        break;
      }
      j = paramArrayOfByte[i];
      ((StringBuffer)localObject).append(j + " ");
      i += 1;
    }
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
    GZIPInputStream localGZIPInputStream = new GZIPInputStream(paramArrayOfByte);
    byte[] arrayOfByte = new byte['Ѐ'];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i = localGZIPInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.flush();
    localByteArrayOutputStream.close();
    localGZIPInputStream.close();
    paramArrayOfByte.close();
    return arrayOfByte;
  }
  
  public static Long[] a(Context paramContext, List<k> paramList)
  {
    com.tencent.beacon.e.b.a(" RecordDAO.insertList() start", new Object[0]);
    if ((paramContext == null) || (paramList == null))
    {
      com.tencent.beacon.e.b.d(" insertList() have null args!", new Object[0]);
      return null;
    }
    int m = paramList.size();
    if (m == 0)
    {
      com.tencent.beacon.e.b.b(" list siez == 0 , return true!", new Object[0]);
      return null;
    }
    Long[] arrayOfLong = new Long[m];
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    for (;;)
    {
      if (k < m)
      {
        k localk = (k)paramList.get(k);
        int j;
        if (localk.b().equals("UA"))
        {
          i = 1;
          j = 3;
        }
        try
        {
          label112:
          localArrayList.add(new com.tencent.beacon.a.a.a(i, j, localk.c(), com.tencent.beacon.b.a.a(localk)));
          for (;;)
          {
            k += 1;
            break;
            if (localk.b().equals("IP"))
            {
              i = 2;
              j = 0;
              break label112;
            }
            if (localk.b().equals("DN"))
            {
              j = 0;
              i = 3;
              break label112;
            }
            if (localk.b().equals("HO"))
            {
              i = 4;
              j = 0;
              break label112;
            }
            com.tencent.beacon.e.b.d(" bean's type is error!", new Object[0]);
          }
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            localThrowable.printStackTrace();
          }
        }
      }
    }
    if (!com.tencent.beacon.a.a.a.a(paramContext, localArrayList)) {
      return null;
    }
    paramContext = localArrayList.iterator();
    int i = 0;
    while (paramContext.hasNext())
    {
      paramList = (com.tencent.beacon.a.a.a)paramContext.next();
      if (i < m) {
        arrayOfLong[i] = Long.valueOf(paramList.a());
      }
      i += 1;
    }
    return arrayOfLong;
  }
  
  /* Error */
  public static int b(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore 5
    //   7: aconst_null
    //   8: astore 4
    //   10: iconst_0
    //   11: istore_1
    //   12: iconst_0
    //   13: istore 7
    //   15: iconst_0
    //   16: istore 6
    //   18: aload_0
    //   19: ifnonnull +18 -> 37
    //   22: ldc_w 625
    //   25: iconst_0
    //   26: anewarray 4	java/lang/Object
    //   29: invokestatic 87	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: iload 6
    //   34: istore_1
    //   35: iload_1
    //   36: ireturn
    //   37: aload_0
    //   38: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   41: astore_0
    //   42: aload_0
    //   43: astore_3
    //   44: aload_2
    //   45: astore_0
    //   46: aload_3
    //   47: astore_2
    //   48: iload 7
    //   50: istore_1
    //   51: aload 5
    //   53: astore 4
    //   55: aload_3
    //   56: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   59: astore 5
    //   61: aload 5
    //   63: ifnonnull +56 -> 119
    //   66: aload 5
    //   68: astore_0
    //   69: aload_3
    //   70: astore_2
    //   71: iload 7
    //   73: istore_1
    //   74: aload 5
    //   76: astore 4
    //   78: ldc_w 627
    //   81: iconst_0
    //   82: anewarray 4	java/lang/Object
    //   85: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload 5
    //   90: ifnull +16 -> 106
    //   93: aload 5
    //   95: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   98: ifeq +8 -> 106
    //   101: aload 5
    //   103: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   106: iload 6
    //   108: istore_1
    //   109: aload_3
    //   110: ifnull -75 -> 35
    //   113: aload_3
    //   114: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   117: iconst_0
    //   118: ireturn
    //   119: aload 5
    //   121: astore_0
    //   122: aload_3
    //   123: astore_2
    //   124: iload 7
    //   126: istore_1
    //   127: aload 5
    //   129: astore 4
    //   131: aload 5
    //   133: ldc 110
    //   135: ldc_w 629
    //   138: iconst_2
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: ldc 120
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: bipush 101
    //   151: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: aastore
    //   155: invokestatic 632	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   158: aconst_null
    //   159: invokevirtual 636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   162: istore 6
    //   164: aload 5
    //   166: astore_0
    //   167: aload_3
    //   168: astore_2
    //   169: iload 6
    //   171: istore_1
    //   172: aload 5
    //   174: astore 4
    //   176: ldc_w 638
    //   179: iconst_2
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: bipush 101
    //   187: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: iload 6
    //   195: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   198: aastore
    //   199: invokestatic 156	com/tencent/beacon/e/b:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: aload 5
    //   204: ifnull +16 -> 220
    //   207: aload 5
    //   209: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   212: ifeq +8 -> 220
    //   215: aload 5
    //   217: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   220: iload 6
    //   222: istore_1
    //   223: aload_3
    //   224: ifnull -189 -> 35
    //   227: aload_3
    //   228: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   231: iload 6
    //   233: ireturn
    //   234: astore 5
    //   236: aconst_null
    //   237: astore_3
    //   238: iload_1
    //   239: istore 6
    //   241: aload 4
    //   243: astore_0
    //   244: aload_3
    //   245: astore_2
    //   246: aload 5
    //   248: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   251: aload 4
    //   253: ifnull +16 -> 269
    //   256: aload 4
    //   258: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   261: ifeq +8 -> 269
    //   264: aload 4
    //   266: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   269: iload 6
    //   271: istore_1
    //   272: aload_3
    //   273: ifnull -238 -> 35
    //   276: aload_3
    //   277: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   280: iload 6
    //   282: ireturn
    //   283: astore 4
    //   285: aconst_null
    //   286: astore_2
    //   287: aload_3
    //   288: astore_0
    //   289: aload 4
    //   291: astore_3
    //   292: aload_0
    //   293: ifnull +14 -> 307
    //   296: aload_0
    //   297: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   300: ifeq +7 -> 307
    //   303: aload_0
    //   304: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   307: aload_2
    //   308: ifnull +7 -> 315
    //   311: aload_2
    //   312: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   315: aload_3
    //   316: athrow
    //   317: astore_3
    //   318: goto -26 -> 292
    //   321: astore 5
    //   323: iload_1
    //   324: istore 6
    //   326: goto -85 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	paramContext	Context
    //   0	329	1	paramInt	int
    //   3	309	2	localObject1	Object
    //   1	315	3	localObject2	Object
    //   317	1	3	localObject3	Object
    //   8	257	4	localSQLiteDatabase1	android.database.sqlite.SQLiteDatabase
    //   283	7	4	localObject4	Object
    //   5	211	5	localSQLiteDatabase2	android.database.sqlite.SQLiteDatabase
    //   234	13	5	localThrowable1	Throwable
    //   321	1	5	localThrowable2	Throwable
    //   16	309	6	i	int
    //   13	112	7	j	int
    // Exception table:
    //   from	to	target	type
    //   37	42	234	java/lang/Throwable
    //   37	42	283	finally
    //   55	61	317	finally
    //   78	88	317	finally
    //   131	164	317	finally
    //   176	202	317	finally
    //   246	251	317	finally
    //   55	61	321	java/lang/Throwable
    //   78	88	321	java/lang/Throwable
    //   131	164	321	java/lang/Throwable
    //   176	202	321	java/lang/Throwable
  }
  
  public static int b(Context paramContext, e[] paramArrayOfe)
  {
    int j = 0;
    int i;
    if (paramContext == null) {
      i = -1;
    }
    ArrayList localArrayList;
    do
    {
      return i;
      if (paramArrayOfe == null) {
        return com.tencent.beacon.a.a.a.a(paramContext, new int[] { 6 }, -1L, Long.MAX_VALUE);
      }
      localArrayList = new ArrayList();
      int k = paramArrayOfe.length;
      i = 0;
      while (i < k)
      {
        e locale = paramArrayOfe[i];
        if (locale.a() >= 0L) {
          localArrayList.add(Long.valueOf(locale.a()));
        }
        i += 1;
      }
      i = j;
    } while (localArrayList.size() <= 0);
    return com.tencent.beacon.a.a.a.a(paramContext, (Long[])localArrayList.toArray(new Long[0]));
  }
  
  public static String b()
  {
    try
    {
      String str = Build.MODEL;
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getDeviceName error", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "";
  }
  
  public static String b(Context paramContext)
  {
    String str = "";
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getImei but context == null!", new Object[0]);
      return "";
    }
    for (;;)
    {
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
        if (paramContext != null) {
          continue;
        }
        paramContext = "";
        try
        {
          com.tencent.beacon.e.b.a("IMEI:" + paramContext, new Object[0]);
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
      com.tencent.beacon.e.b.d("getImei error!", new Object[0]);
      localThrowable1.printStackTrace();
      return paramContext;
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
    }
  }
  
  public static String b(String paramString)
  {
    String str2 = paramString.replace('|', '_').trim();
    String str1;
    if (str2.length() == 0)
    {
      com.tencent.beacon.e.b.c("eventName is invalid!! eventName length == 0!", new Object[0]);
      str1 = null;
    }
    do
    {
      return str1;
      if (!e(str2)) {
        break;
      }
      str1 = str2;
    } while (str2.length() <= 128);
    com.tencent.beacon.e.b.c("eventName is invalid!! eventName length should be less than 128! eventName:" + paramString, new Object[0]);
    return str2.substring(0, 128);
    com.tencent.beacon.e.b.c("eventName is invalid!! eventName should be ASCII code in 32-126! eventName:" + paramString, new Object[0]);
    return null;
  }
  
  public static byte[] b(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    if (paramInt == 1) {
      if ((paramString != null) && (paramArrayOfByte != null)) {}
    }
    while (paramInt != 3)
    {
      return null;
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      DESKeySpec localDESKeySpec = new DESKeySpec(paramString.getBytes("UTF-8"));
      localCipher.init(1, SecretKeyFactory.getInstance("DES").generateSecret(localDESKeySpec), new IvParameterSpec(paramString.getBytes("UTF-8")));
      return localCipher.doFinal(paramArrayOfByte);
    }
    return b(paramString, paramArrayOfByte);
  }
  
  public static byte[] b(int paramInt, byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = null;
    Object localObject = null;
    if (paramInt == 1)
    {
      localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
      ZipInputStream localZipInputStream = new ZipInputStream(localByteArrayInputStream);
      paramArrayOfByte = (byte[])localObject;
      while (localZipInputStream.getNextEntry() != null)
      {
        paramArrayOfByte = new byte['Ѐ'];
        localObject = new ByteArrayOutputStream();
        for (;;)
        {
          paramInt = localZipInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length);
          if (paramInt == -1) {
            break;
          }
          ((ByteArrayOutputStream)localObject).write(paramArrayOfByte, 0, paramInt);
        }
        paramArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
        ((ByteArrayOutputStream)localObject).flush();
        ((ByteArrayOutputStream)localObject).close();
      }
      localZipInputStream.close();
      localByteArrayInputStream.close();
      localObject = paramArrayOfByte;
    }
    do
    {
      return (byte[])localObject;
      localObject = localByteArrayInputStream;
    } while (paramInt != 2);
    return a(paramArrayOfByte);
  }
  
  private static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    int j = 0;
    if ((paramString == null) || (paramArrayOfByte == null))
    {
      paramString = null;
      return paramString;
    }
    int i = paramString.length();
    while (i < 16)
    {
      paramString = paramString + "0";
      i += 1;
    }
    paramString = paramString.substring(0, 16);
    Object localObject = new StringBuffer();
    int k = paramArrayOfByte.length;
    i = 0;
    while (i < k)
    {
      int m = paramArrayOfByte[i];
      ((StringBuffer)localObject).append(m + " ");
      i += 1;
    }
    localObject = new SecretKeySpec(paramString.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, (Key)localObject, new IvParameterSpec(paramString.getBytes()));
    paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
    localObject = new StringBuffer();
    k = paramArrayOfByte.length;
    i = j;
    for (;;)
    {
      paramString = paramArrayOfByte;
      if (i >= k) {
        break;
      }
      j = paramArrayOfByte[i];
      ((StringBuffer)localObject).append(j + " ");
      i += 1;
    }
  }
  
  public static int c(Context paramContext, e[] paramArrayOfe)
  {
    int j = 0;
    int i;
    if ((paramContext == null) || (paramArrayOfe == null) || (paramArrayOfe.length <= 0)) {
      i = -1;
    }
    ArrayList localArrayList;
    do
    {
      return i;
      localArrayList = new ArrayList(paramArrayOfe.length);
      int k = paramArrayOfe.length;
      i = 0;
      while (i < k)
      {
        e locale = paramArrayOfe[i];
        Object localObject = com.tencent.beacon.b.a.a(locale);
        if (localObject != null)
        {
          localObject = new com.tencent.beacon.a.a.a(7, 0, 0L, (byte[])localObject);
          ((com.tencent.beacon.a.a.a)localObject).a(locale.a());
          localArrayList.add(localObject);
        }
        i += 1;
      }
      i = j;
    } while (localArrayList.size() <= 0);
    if (com.tencent.beacon.a.a.a.b(paramContext, localArrayList)) {
      return localArrayList.size();
    }
    return -1;
  }
  
  public static String c()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getVersion error", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "";
  }
  
  public static String c(Context paramContext)
  {
    Object localObject = "";
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getImsi but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      if (paramContext == null) {
        return "";
      }
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      com.tencent.beacon.e.b.d("getImsi error!", new Object[0]);
      paramContext.printStackTrace();
    }
    return (String)localObject;
  }
  
  public static String c(String paramString)
  {
    String str = paramString.replace('|', '_').trim();
    if (e(str))
    {
      if (str.length() < 5) {
        com.tencent.beacon.e.b.c(" userID is invalid!! userID is too short, length < 5!", new Object[0]);
      }
      paramString = str;
      if (str.length() > 128) {
        paramString = str.substring(0, 128);
      }
      return paramString;
    }
    com.tencent.beacon.e.b.c("userID is invalid!! userID should be ASCII code in 32-126! userID:" + paramString, new Object[0]);
    return "10000";
  }
  
  public static String d()
  {
    try
    {
      String str = Build.VERSION.SDK;
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getApiLevel error", new Object[0]);
      localThrowable.printStackTrace();
    }
    return "";
  }
  
  public static String d(Context paramContext)
  {
    String str2 = "";
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getAndroidId but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (paramContext == null) {
        return "";
      }
      String str1;
      com.tencent.beacon.e.b.d("getAndroidId error!", new Object[0]);
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
  
  public static String d(String paramString)
  {
    String str2 = "unknown";
    String str1 = str2;
    if (paramString != null)
    {
      if (paramString.trim().length() == 0) {
        str1 = str2;
      }
    }
    else {
      return str1;
    }
    str1 = paramString.trim();
    int i = str1.length();
    int j;
    do
    {
      i -= 1;
      if (i < 0) {
        break;
      }
      j = str1.charAt(i);
    } while ((j >= 48) && (j <= 57));
    for (i = 0;; i = 1)
    {
      if (i == 0) {
        break label98;
      }
      paramString = paramString.trim();
      str1 = paramString;
      if (paramString.length() <= 16) {
        break;
      }
      return paramString.substring(0, 16);
    }
    label98:
    com.tencent.beacon.e.b.c("channelID is invalid!! channelID should be Numeric! channelID:" + paramString, new Object[0]);
    return "unknown";
  }
  
  public static String e()
  {
    String str = null;
    try
    {
      Object localObject = Build.class.getField("HARDWARE").get(null);
      if (localObject != null) {
        str = localObject.toString();
      }
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.c("getCpuProductorName error!", new Object[0]);
    }
    return null;
  }
  
  public static String e(Context paramContext)
  {
    Object localObject = "";
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getMacAddress but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
      if (paramContext == null) {
        return "";
      }
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      com.tencent.beacon.e.b.d("getMacAddress error!", new Object[0]);
    }
    return (String)localObject;
  }
  
  public static boolean e(String paramString)
  {
    int i = paramString.length();
    boolean bool = true;
    for (;;)
    {
      int j = i - 1;
      if (j < 0) {
        break;
      }
      int k = paramString.charAt(j);
      if (k >= 32)
      {
        i = j;
        if (k < 127) {}
      }
      else
      {
        bool = false;
        i = j;
      }
    }
    return bool;
  }
  
  public static String f()
  {
    try
    {
      Object localObject = new StatFs(Environment.getDataDirectory().getPath());
      long l1 = ((StatFs)localObject).getBlockSize();
      long l2 = ((StatFs)localObject).getBlockCount();
      localObject = l2 * l1 / 1024L / 1024L;
      return (String)localObject;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getDisplayMetrics error!", new Object[0]);
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String f(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getMacAddress but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getBSSID();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        com.tencent.beacon.e.b.d("getMacAddress error!", new Object[0]);
        paramContext = "";
      }
    }
  }
  
  public static String g(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getWifiSSID but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
      if (paramContext.getBSSID() != null)
      {
        paramContext = paramContext.getSSID();
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        com.tencent.beacon.e.b.d("getWifiSSID error!", new Object[0]);
        paramContext = "";
      }
    }
  }
  
  public static DisplayMetrics h(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getDisplayMetrics but context == null!", new Object[0]);
      return null;
    }
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      return localDisplayMetrics;
    }
    catch (Throwable paramContext)
    {
      com.tencent.beacon.e.b.d("getDisplayMetrics error!", new Object[0]);
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static String h()
  {
    long l5 = 0L;
    for (;;)
    {
      try
      {
        Object localObject1 = "/proc/" + b.a + "/stat";
        Object localObject2 = com.tencent.beacon.b.a.c("/proc/stat");
        if (localObject2 == null) {
          break label667;
        }
        localObject2 = ((String)localObject2).split(" ");
        if (localObject2.length < 11) {
          break label667;
        }
        int i = Integer.valueOf(localObject2[2]).intValue();
        int j = Integer.valueOf(localObject2[3]).intValue();
        int k = Integer.valueOf(localObject2[4]).intValue();
        int m = Integer.valueOf(localObject2[5]).intValue();
        int n = Integer.valueOf(localObject2[6]).intValue();
        int i1 = Integer.valueOf(localObject2[7]).intValue();
        int i2 = Integer.valueOf(localObject2[8]).intValue();
        int i3 = Integer.valueOf(localObject2[9]).intValue();
        l1 = Integer.valueOf(localObject2[10]).intValue() + (i + j + k + m + n + i1 + i2 + i3);
        com.tencent.beacon.e.b.b("totalCpuTime1:" + l1, new Object[0]);
        localObject2 = com.tencent.beacon.b.a.c((String)localObject1);
        if (localObject2 == null) {
          break label661;
        }
        localObject2 = ((String)localObject2).split(" ");
        if (localObject2.length < 18) {
          break label661;
        }
        i = Integer.valueOf(localObject2[13]).intValue();
        j = Integer.valueOf(localObject2[14]).intValue();
        k = Integer.valueOf(localObject2[15]).intValue();
        l2 = Integer.valueOf(localObject2[16]).intValue() + (i + j + k);
        com.tencent.beacon.e.b.b("proCpuTime1:" + l2, new Object[0]);
        try
        {
          Thread.sleep(500L);
          localObject2 = com.tencent.beacon.b.a.c("/proc/stat");
          if (localObject2 == null) {
            break label655;
          }
          localObject2 = ((String)localObject2).split(" ");
          if (localObject2.length < 10) {
            break label655;
          }
          i = Integer.valueOf(localObject2[2]).intValue();
          j = Integer.valueOf(localObject2[3]).intValue();
          k = Integer.valueOf(localObject2[4]).intValue();
          m = Integer.valueOf(localObject2[5]).intValue();
          n = Integer.valueOf(localObject2[6]).intValue();
          i1 = Integer.valueOf(localObject2[7]).intValue();
          i2 = Integer.valueOf(localObject2[8]).intValue();
          i3 = Integer.valueOf(localObject2[9]).intValue();
          l3 = Integer.valueOf(localObject2[10]).intValue() + (i + j + k + m + n + i1 + i2 + i3);
          com.tencent.beacon.e.b.b("totalCpuTime2:" + l3, new Object[0]);
          localObject1 = com.tencent.beacon.b.a.c((String)localObject1);
          long l4 = l5;
          if (localObject1 != null)
          {
            localObject1 = ((String)localObject1).split(" ");
            l4 = l5;
            if (localObject1.length >= 18)
            {
              l4 = Integer.valueOf(localObject1[13]).intValue() + Integer.valueOf(localObject1[14]).intValue() + Integer.valueOf(localObject1[15]).intValue() + Integer.valueOf(localObject1[16]).intValue();
              com.tencent.beacon.e.b.b("proCpuTime2:" + l4, new Object[0]);
            }
          }
          float f = (float)(l3 - l1);
          if (f > 0.0F) {
            return String.format("%.2f", new Object[] { Double.valueOf((float)(l4 - l2) / f) });
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          continue;
        }
        return "0";
      }
      catch (Exception localException)
      {
        return "0";
      }
      label655:
      long l3 = 0L;
      continue;
      label661:
      long l2 = 0L;
      continue;
      label667:
      long l1 = 0L;
    }
  }
  
  public static long i(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getFreeMem but context == null!", new Object[0]);
      return -1L;
    }
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      paramContext.getMemoryInfo(localMemoryInfo);
      long l = localMemoryInfo.availMem;
      return l;
    }
    catch (Throwable paramContext)
    {
      com.tencent.beacon.e.b.d("getFreeMem error!", new Object[0]);
      paramContext.printStackTrace();
    }
    return -1L;
  }
  
  /* Error */
  public static String i()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 904	java/io/FileReader
    //   6: dup
    //   7: ldc_w 906
    //   10: invokespecial 907	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: new 909	java/io/BufferedReader
    //   17: dup
    //   18: aload_1
    //   19: sipush 8192
    //   22: invokespecial 912	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   25: astore_0
    //   26: aload_0
    //   27: astore_3
    //   28: aload_1
    //   29: astore_2
    //   30: aload_0
    //   31: invokevirtual 915	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   34: ldc_w 917
    //   37: iconst_2
    //   38: invokevirtual 920	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   41: iconst_1
    //   42: aaload
    //   43: invokevirtual 679	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   46: ldc_w 922
    //   49: ldc -52
    //   51: invokevirtual 260	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   54: invokevirtual 235	java/lang/String:trim	()Ljava/lang/String;
    //   57: invokestatic 76	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   60: ldc2_w 798
    //   63: ldiv
    //   64: lstore 6
    //   66: aload_0
    //   67: astore_3
    //   68: aload_1
    //   69: astore_2
    //   70: new 284	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 579	java/lang/StringBuilder:<init>	()V
    //   77: lload 6
    //   79: invokevirtual 802	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   82: invokevirtual 295	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: astore 4
    //   87: aload 4
    //   89: astore_2
    //   90: aload_0
    //   91: invokevirtual 923	java/io/BufferedReader:close	()V
    //   94: aload_1
    //   95: invokevirtual 924	java/io/FileReader:close	()V
    //   98: aload_2
    //   99: areturn
    //   100: astore_0
    //   101: ldc_w 902
    //   104: iconst_0
    //   105: anewarray 4	java/lang/Object
    //   108: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: aload_0
    //   112: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   115: aload_2
    //   116: areturn
    //   117: astore 4
    //   119: aconst_null
    //   120: astore_0
    //   121: aconst_null
    //   122: astore_1
    //   123: aload_0
    //   124: astore_3
    //   125: aload_1
    //   126: astore_2
    //   127: ldc_w 902
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_0
    //   138: astore_3
    //   139: aload_1
    //   140: astore_2
    //   141: aload 4
    //   143: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   146: aload_0
    //   147: ifnull +7 -> 154
    //   150: aload_0
    //   151: invokevirtual 923	java/io/BufferedReader:close	()V
    //   154: aload 5
    //   156: astore_2
    //   157: aload_1
    //   158: ifnull -60 -> 98
    //   161: aload_1
    //   162: invokevirtual 924	java/io/FileReader:close	()V
    //   165: aconst_null
    //   166: areturn
    //   167: astore_0
    //   168: ldc_w 902
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_0
    //   179: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   182: aconst_null
    //   183: areturn
    //   184: astore_0
    //   185: aconst_null
    //   186: astore_3
    //   187: aconst_null
    //   188: astore_1
    //   189: aload_3
    //   190: ifnull +7 -> 197
    //   193: aload_3
    //   194: invokevirtual 923	java/io/BufferedReader:close	()V
    //   197: aload_1
    //   198: ifnull +7 -> 205
    //   201: aload_1
    //   202: invokevirtual 924	java/io/FileReader:close	()V
    //   205: aload_0
    //   206: athrow
    //   207: astore_1
    //   208: ldc_w 902
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 64	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload_1
    //   219: invokevirtual 194	java/lang/Throwable:printStackTrace	()V
    //   222: goto -17 -> 205
    //   225: astore_0
    //   226: aconst_null
    //   227: astore_3
    //   228: goto -39 -> 189
    //   231: astore_0
    //   232: aload_2
    //   233: astore_1
    //   234: goto -45 -> 189
    //   237: astore 4
    //   239: aconst_null
    //   240: astore_0
    //   241: goto -118 -> 123
    //   244: astore 4
    //   246: goto -123 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   25	66	0	localBufferedReader	java.io.BufferedReader
    //   100	12	0	localThrowable1	Throwable
    //   120	31	0	localObject1	Object
    //   167	12	0	localThrowable2	Throwable
    //   184	22	0	localObject2	Object
    //   225	1	0	localObject3	Object
    //   231	1	0	localObject4	Object
    //   240	1	0	localObject5	Object
    //   13	189	1	localFileReader	java.io.FileReader
    //   207	12	1	localThrowable3	Throwable
    //   233	1	1	localObject6	Object
    //   29	204	2	localObject7	Object
    //   27	201	3	localObject8	Object
    //   85	3	4	str	String
    //   117	25	4	localThrowable4	Throwable
    //   237	1	4	localThrowable5	Throwable
    //   244	1	4	localThrowable6	Throwable
    //   1	154	5	localObject9	Object
    //   64	14	6	l	long
    // Exception table:
    //   from	to	target	type
    //   90	98	100	java/lang/Throwable
    //   3	14	117	java/lang/Throwable
    //   150	154	167	java/lang/Throwable
    //   161	165	167	java/lang/Throwable
    //   3	14	184	finally
    //   193	197	207	java/lang/Throwable
    //   201	205	207	java/lang/Throwable
    //   14	26	225	finally
    //   30	66	231	finally
    //   70	87	231	finally
    //   127	137	231	finally
    //   141	146	231	finally
    //   14	26	237	java/lang/Throwable
    //   30	66	244	java/lang/Throwable
    //   70	87	244	java/lang/Throwable
  }
  
  public static String j(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getSensor but context == null!", new Object[0]);
      return null;
    }
    com.tencent.beacon.e.b.a("getSensor start", new Object[0]);
    Object localObject2 = "X";
    StringBuffer localStringBuffer = new StringBuffer();
    if (Integer.parseInt(Build.VERSION.SDK) >= 10) {}
    for (;;)
    {
      int i;
      try
      {
        localClass = Class.forName("android.hardware.Camera");
        j = ((Integer)localClass.getMethod("getNumberOfCameras", new Class[0]).invoke(localClass, new Object[0])).intValue();
        if (j == 0)
        {
          localObject1 = "N";
          localObject2 = "N";
        }
      }
      catch (Throwable localThrowable1)
      {
        Class localClass;
        int j;
        Object localObject3;
        Object localObject6;
        Object localObject7;
        int k;
        Field localField1;
        Field localField2;
        Field localField3;
        int m;
        int n;
        localObject1 = "X";
        paramContext = "X";
        com.tencent.beacon.e.b.d("getSensor error!", new Object[0]);
        localThrowable1.printStackTrace();
        Object localObject5 = localObject1;
        localObject1 = "X";
        Context localContext = paramContext;
        continue;
        continue;
        localObject1 = "X";
        localObject2 = "X";
        continue;
      }
      try
      {
        localObject3 = (SensorManager)paramContext.getSystemService("sensor");
        if (((SensorManager)localObject3).getDefaultSensor(9) != null) {
          paramContext = "Y";
        }
      }
      catch (Throwable localThrowable3)
      {
        localObject5 = "X";
        paramContext = (Context)localObject1;
        localObject1 = localObject5;
        continue;
      }
      try
      {
        if (((SensorManager)localObject3).getDefaultSensor(4) != null)
        {
          localObject6 = "Y";
          localObject3 = localObject1;
          localObject5 = paramContext;
          localObject1 = localObject6;
          localStringBuffer.append((String)localObject3).append((String)localObject2).append((String)localObject5).append((String)localObject1);
          return localStringBuffer.toString();
          localObject3 = Class.forName("android.hardware.Camera$CameraInfo");
          localObject7 = ((Class)localObject3).newInstance();
          localObject6 = localClass.getMethods();
          localObject1 = null;
          k = localObject6.length;
          i = 0;
          localObject5 = localObject1;
          if (i < k)
          {
            localObject5 = localObject6[i];
            if (!((Method)localObject5).getName().equals("getCameraInfo")) {
              break label538;
            }
          }
          localField1 = ((Class)localObject3).getField("facing");
          localField2 = ((Class)localObject3).getField("CAMERA_FACING_BACK");
          localField3 = ((Class)localObject3).getField("CAMERA_FACING_FRONT");
          if (localObject5 == null) {
            continue;
          }
          localObject2 = "X";
          localObject1 = "X";
          i = 0;
          if (i >= j) {
            continue;
          }
        }
      }
      catch (Throwable localThrowable4)
      {
        localObject4 = localObject1;
        localObject1 = paramContext;
        paramContext = (Context)localObject4;
        localObject4 = localThrowable4;
        continue;
      }
      try
      {
        ((Method)localObject5).invoke(localClass, new Object[] { Integer.valueOf(i), localObject7 });
        k = localField1.getInt(localObject7);
        m = localField2.getInt(localObject7);
        n = localField3.getInt(localObject7);
        if (k == m)
        {
          localObject1 = "Y";
          localObject3 = localObject1;
          if (j == 1)
          {
            localObject2 = "N";
            localObject3 = localObject1;
          }
        }
        else
        {
          localObject3 = localObject1;
          if (k == n)
          {
            localObject6 = "Y";
            localObject2 = localObject6;
            localObject3 = localObject1;
            if (j == 1)
            {
              localObject3 = "N";
              localObject2 = localObject6;
            }
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        paramContext = (Context)localObject1;
        localObject1 = "X";
        continue;
      }
      paramContext = "N";
      continue;
      localObject5 = "N";
      localObject3 = localObject1;
      Object localObject1 = localObject5;
      localObject5 = paramContext;
      continue;
      localObject1 = "X";
      localObject2 = "X";
      String str = "X";
      Object localObject4 = "X";
      continue;
      i += 1;
      localObject1 = localObject4;
      continue;
      label538:
      i += 1;
    }
  }
  
  public static String k()
  {
    try
    {
      String str = Locale.getDefault().getCountry();
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getCountry error!", new Object[0]);
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String k(Context paramContext)
  {
    if (a != null)
    {
      h localh = a;
      return l(paramContext);
    }
    return "unknown";
  }
  
  public static String l()
  {
    try
    {
      String str = Locale.getDefault().getLanguage();
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beacon.e.b.d("getLanguage error!", new Object[0]);
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String l(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo == null) {
        return "unknown";
      }
      if (localNetworkInfo.getType() == 1)
      {
        paramContext = "wifi";
      }
      else if (localNetworkInfo.getType() == 0)
      {
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext != null) {
          switch (paramContext.getNetworkType())
          {
          case 15: 
            paramContext = "HSPA+";
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      paramContext = "unknown";
    }
    for (;;)
    {
      return paramContext;
      paramContext = "unknown";
      continue;
      paramContext = "GPRS";
      continue;
      paramContext = "EDGE";
      continue;
      paramContext = "UMTS";
      continue;
      paramContext = "HSDPA";
      continue;
      paramContext = "HSUPA";
      continue;
      paramContext = "HSPA";
      continue;
      paramContext = "CDMA";
      continue;
      paramContext = "EVDO_0";
      continue;
      paramContext = "EVDO_A";
      continue;
      paramContext = "1xRTT";
      continue;
      paramContext = "iDen";
      continue;
      paramContext = "EVDO_B";
      continue;
      paramContext = "LTE";
      continue;
      paramContext = "eHRPD";
    }
  }
  
  public static int m(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d("getWifiSignalLevel but context == null!", new Object[0]);
      return 0;
    }
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
      if (paramContext.getBSSID() != null)
      {
        i = WifiManager.calculateSignalLevel(paramContext.getRssi(), 5);
        return i;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        int i = 0;
      }
    }
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
      com.tencent.beacon.e.b.d("getBrand error!", new Object[0]);
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String n()
  {
    try
    {
      String str = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
      return str;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return "";
  }
  
  /* Error */
  public static boolean n(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 1087
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: ifnonnull +5 -> 18
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_0
    //   19: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   22: astore_0
    //   23: aload_0
    //   24: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_2
    //   28: aload_2
    //   29: ldc_w 1089
    //   32: invokevirtual 1092	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   35: iconst_1
    //   36: istore 4
    //   38: aload_2
    //   39: ifnull +14 -> 53
    //   42: aload_2
    //   43: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   46: ifeq +7 -> 53
    //   49: aload_2
    //   50: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   53: aload_0
    //   54: ifnull +7 -> 61
    //   57: aload_0
    //   58: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   61: ldc_w 1094
    //   64: iconst_0
    //   65: anewarray 4	java/lang/Object
    //   68: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: iload 4
    //   73: ireturn
    //   74: astore_0
    //   75: aconst_null
    //   76: astore_0
    //   77: ldc_w 1096
    //   80: iconst_0
    //   81: anewarray 4	java/lang/Object
    //   84: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_1
    //   88: ifnull +14 -> 102
    //   91: aload_1
    //   92: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   95: ifeq +7 -> 102
    //   98: aload_1
    //   99: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   102: aload_0
    //   103: ifnull +7 -> 110
    //   106: aload_0
    //   107: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   110: ldc_w 1094
    //   113: iconst_0
    //   114: anewarray 4	java/lang/Object
    //   117: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: iconst_0
    //   121: istore 4
    //   123: goto -52 -> 71
    //   126: astore_1
    //   127: aconst_null
    //   128: astore_0
    //   129: aconst_null
    //   130: astore_2
    //   131: aload_2
    //   132: ifnull +14 -> 146
    //   135: aload_2
    //   136: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   139: ifeq +7 -> 146
    //   142: aload_2
    //   143: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   146: aload_0
    //   147: ifnull +7 -> 154
    //   150: aload_0
    //   151: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   154: ldc_w 1094
    //   157: iconst_0
    //   158: anewarray 4	java/lang/Object
    //   161: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: aconst_null
    //   168: astore_2
    //   169: goto -38 -> 131
    //   172: astore_1
    //   173: goto -42 -> 131
    //   176: astore_3
    //   177: aload_1
    //   178: astore_2
    //   179: aload_3
    //   180: astore_1
    //   181: goto -50 -> 131
    //   184: astore_2
    //   185: goto -108 -> 77
    //   188: astore_1
    //   189: aload_2
    //   190: astore_1
    //   191: goto -114 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	paramContext	Context
    //   1	98	1	localObject1	Object
    //   126	39	1	localObject2	Object
    //   166	1	1	localObject3	Object
    //   172	6	1	localObject4	Object
    //   180	1	1	localObject5	Object
    //   188	1	1	localThrowable1	Throwable
    //   190	1	1	localObject6	Object
    //   27	152	2	localObject7	Object
    //   184	6	2	localThrowable2	Throwable
    //   176	4	3	localObject8	Object
    //   36	86	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   18	23	74	java/lang/Throwable
    //   18	23	126	finally
    //   23	28	166	finally
    //   28	35	172	finally
    //   77	87	176	finally
    //   23	28	184	java/lang/Throwable
    //   28	35	188	java/lang/Throwable
  }
  
  /* Error */
  public static boolean o(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: aconst_null
    //   5: astore 4
    //   7: aconst_null
    //   8: astore_3
    //   9: ldc_w 1099
    //   12: iconst_0
    //   13: anewarray 4	java/lang/Object
    //   16: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: aload_0
    //   20: ifnonnull +15 -> 35
    //   23: ldc_w 1101
    //   26: iconst_0
    //   27: anewarray 4	java/lang/Object
    //   30: invokestatic 59	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: iconst_0
    //   34: ireturn
    //   35: aload_0
    //   36: invokestatic 92	com/tencent/beacon/a/a/d:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/a/d;
    //   39: astore_0
    //   40: aload_0
    //   41: astore_2
    //   42: aload_1
    //   43: astore_0
    //   44: aload_2
    //   45: astore_1
    //   46: aload 4
    //   48: astore_3
    //   49: aload_2
    //   50: invokevirtual 96	com/tencent/beacon/a/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   53: astore 4
    //   55: aload 4
    //   57: astore_0
    //   58: aload_2
    //   59: astore_1
    //   60: aload 4
    //   62: astore_3
    //   63: aload 4
    //   65: ldc_w 310
    //   68: aconst_null
    //   69: aconst_null
    //   70: invokevirtual 636	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   73: istore 5
    //   75: aload 4
    //   77: astore_0
    //   78: aload_2
    //   79: astore_1
    //   80: aload 4
    //   82: astore_3
    //   83: new 284	java/lang/StringBuilder
    //   86: dup
    //   87: ldc_w 1103
    //   90: invokespecial 289	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: iload 5
    //   95: invokevirtual 348	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: invokevirtual 295	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: iconst_0
    //   102: anewarray 4	java/lang/Object
    //   105: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: iload 5
    //   110: ifle +155 -> 265
    //   113: iconst_1
    //   114: istore 6
    //   116: aload 4
    //   118: ifnull +16 -> 134
    //   121: aload 4
    //   123: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   126: ifeq +8 -> 134
    //   129: aload 4
    //   131: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   134: aload_2
    //   135: ifnull +7 -> 142
    //   138: aload_2
    //   139: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   142: ldc_w 1105
    //   145: iconst_0
    //   146: anewarray 4	java/lang/Object
    //   149: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: iload 6
    //   154: ireturn
    //   155: astore 4
    //   157: aconst_null
    //   158: astore_2
    //   159: aload_3
    //   160: astore_0
    //   161: aload_2
    //   162: astore_1
    //   163: aload 4
    //   165: invokevirtual 1108	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   168: iconst_0
    //   169: anewarray 4	java/lang/Object
    //   172: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload_3
    //   176: ifnull +14 -> 190
    //   179: aload_3
    //   180: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   183: ifeq +7 -> 190
    //   186: aload_3
    //   187: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   190: aload_2
    //   191: ifnull +7 -> 198
    //   194: aload_2
    //   195: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   198: ldc_w 1105
    //   201: iconst_0
    //   202: anewarray 4	java/lang/Object
    //   205: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: iconst_0
    //   209: istore 6
    //   211: goto -59 -> 152
    //   214: astore_3
    //   215: aconst_null
    //   216: astore_1
    //   217: aload_2
    //   218: astore_0
    //   219: aload_3
    //   220: astore_2
    //   221: aload_0
    //   222: ifnull +14 -> 236
    //   225: aload_0
    //   226: invokevirtual 104	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   229: ifeq +7 -> 236
    //   232: aload_0
    //   233: invokevirtual 107	android/database/sqlite/SQLiteDatabase:close	()V
    //   236: aload_1
    //   237: ifnull +7 -> 244
    //   240: aload_1
    //   241: invokevirtual 108	com/tencent/beacon/a/a/d:close	()V
    //   244: ldc_w 1105
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 164	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aload_2
    //   255: athrow
    //   256: astore_2
    //   257: goto -36 -> 221
    //   260: astore 4
    //   262: goto -103 -> 159
    //   265: iconst_0
    //   266: istore 6
    //   268: goto -152 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	paramContext	Context
    //   3	238	1	localObject1	Object
    //   1	254	2	localObject2	Object
    //   256	1	2	localObject3	Object
    //   8	179	3	localSQLiteDatabase1	android.database.sqlite.SQLiteDatabase
    //   214	6	3	localObject4	Object
    //   5	125	4	localSQLiteDatabase2	android.database.sqlite.SQLiteDatabase
    //   155	9	4	localThrowable1	Throwable
    //   260	1	4	localThrowable2	Throwable
    //   73	36	5	i	int
    //   114	153	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   35	40	155	java/lang/Throwable
    //   35	40	214	finally
    //   49	55	256	finally
    //   63	75	256	finally
    //   83	108	256	finally
    //   163	175	256	finally
    //   49	55	260	java/lang/Throwable
    //   63	75	260	java/lang/Throwable
    //   83	108	260	java/lang/Throwable
  }
  
  public static List<e> p(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    Object localObject = com.tencent.beacon.a.a.a.a(paramContext, new int[] { 6 }, -1, -1, 5, -1, -1, -1, -1, -1L, 0L);
    if ((localObject == null) || (((List)localObject).size() <= 0)) {
      return null;
    }
    paramContext = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.beacon.a.a.a locala = (com.tencent.beacon.a.a.a)((Iterator)localObject).next();
      try
      {
        e locale = (e)e.class.cast(com.tencent.beacon.b.a.a(locala.b()));
        if (locale != null)
        {
          locale.a(locala.a());
          paramContext.add(locale);
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        com.tencent.beacon.e.b.d("netconsume error %s", new Object[] { localThrowable.toString() });
      }
    }
    return paramContext;
  }
  
  public static List<e> q(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    Object localObject = com.tencent.beacon.a.a.a.a(paramContext, new int[] { 7 }, -1, -1, 5, -1, -1, -1, -1, -1L, 0L);
    if ((localObject == null) || (((List)localObject).size() <= 0)) {
      return null;
    }
    paramContext = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.beacon.a.a.a locala = (com.tencent.beacon.a.a.a)((Iterator)localObject).next();
      try
      {
        e locale = (e)e.class.cast(com.tencent.beacon.b.a.a(locala.b()));
        locale.a(locala.a());
        paramContext.add(locale);
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        com.tencent.beacon.e.b.d(" netconsume error:%s", new Object[] { localThrowable.toString() });
      }
    }
    return paramContext;
  }
  
  public static f r(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = null;
    }
    com.tencent.beacon.a.a.a locala;
    f localf;
    do
    {
      return paramContext;
      paramContext = com.tencent.beacon.a.a.a.a(paramContext, new int[] { 8 }, -1, -1, 1, -1, -1, -1, -1, -1L, -1L);
      if ((paramContext == null) || (paramContext.size() <= 0)) {
        return null;
      }
      locala = (com.tencent.beacon.a.a.a)paramContext.get(0);
      if (locala == null) {
        break;
      }
      paramContext = com.tencent.beacon.b.a.a(locala.b());
      if ((paramContext == null) || (!f.class.isInstance(paramContext))) {
        break;
      }
      localf = (f)f.class.cast(paramContext);
      paramContext = localf;
    } while (localf == null);
    localf.e(locala.a());
    return localf;
    return null;
  }
  
  public static int s(Context paramContext)
  {
    com.tencent.beacon.e.b.a(" RecordDAO.countRecordNum() start", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.beacon.e.b.d(" countRecordNum() have null args!", new Object[0]);
      return -1;
    }
    return com.tencent.beacon.a.a.a.b(paramContext, new int[] { 1, 2, 3, 4 }, -1L, Long.MAX_VALUE);
  }
  
  public final String a()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("Android ");
    localStringBuffer.append(c());
    localStringBuffer.append(",level ");
    localStringBuffer.append(d());
    return localStringBuffer.toString();
  }
  
  public final String g()
  {
    if (this.b == null)
    {
      com.tencent.beacon.e.b.d("getFreeMem but context == null!", new Object[0]);
      return "";
    }
    try
    {
      localObject = (ActivityManager)this.b.getSystemService("activity");
      if (b.a == 0) {
        b.a = Process.myPid();
      }
      localObject = ((ActivityManager)localObject).getProcessMemoryInfo(new int[] { b.a });
      if ((localObject == null) || (localObject.length != 1)) {
        break label216;
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(localObject[0].getTotalPrivateDirty()).append(",").append(localObject[0].dalvikPrivateDirty).append(",").append(localObject[0].nativePrivateDirty).append(",").append(localObject[0].otherPrivateDirty).append(",").append(localObject[0].getTotalPss()).append(",").append(localObject[0].dalvikPss).append(",").append(localObject[0].nativePss).append(",").append(localObject[0].otherPss);
      localObject = localStringBuffer.toString();
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject;
        com.tencent.beacon.e.b.d("getFreeMem error!", new Object[0]);
        localThrowable.printStackTrace();
        String str = "";
      }
    }
    return (String)localObject;
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
      long l = localStatFs.getBlockCount();
      l = i * l / 1024L / 1024L;
      return l;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return 0L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */