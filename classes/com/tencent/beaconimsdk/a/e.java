package com.tencent.beaconimsdk.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.tencent.beaconimsdk.a.b.g;
import com.tencent.beaconimsdk.event.h;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
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
import org.apache.http.util.EncodingUtils;

public final class e
{
  private static e a;
  
  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.deleteRecordList() start", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d(" deleteRecordList() have null args!", new Object[0]);
      return -1;
    }
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.deleteRecordList() end", new Object[0]);
    return com.tencent.beaconimsdk.a.a.a.a(paramContext, paramArrayOfLong);
  }
  
  public static e a(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null)) {
        a = new e();
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public static com.tencent.beaconimsdk.b.a.b a(int paramInt1, c paramc, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: ldc 39
    //   2: iconst_0
    //   3: anewarray 4	java/lang/Object
    //   6: invokestatic 42	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   9: aload_1
    //   10: ifnonnull +14 -> 24
    //   13: ldc 44
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 24	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aconst_null
    //   23: areturn
    //   24: new 46	com/tencent/beaconimsdk/b/a/b
    //   27: dup
    //   28: invokespecial 47	com/tencent/beaconimsdk/b/a/b:<init>	()V
    //   31: astore 6
    //   33: aload_1
    //   34: monitorenter
    //   35: aload 6
    //   37: aload_1
    //   38: invokevirtual 52	com/tencent/beaconimsdk/a/c:a	()Ljava/lang/String;
    //   41: putfield 56	com/tencent/beaconimsdk/b/a/b:j	Ljava/lang/String;
    //   44: aload 6
    //   46: aload_1
    //   47: invokevirtual 58	com/tencent/beaconimsdk/a/c:b	()Ljava/lang/String;
    //   50: putfield 61	com/tencent/beaconimsdk/b/a/b:k	Ljava/lang/String;
    //   53: aload 6
    //   55: aload_1
    //   56: invokevirtual 65	com/tencent/beaconimsdk/a/c:c	()B
    //   59: putfield 68	com/tencent/beaconimsdk/b/a/b:a	B
    //   62: aload 6
    //   64: aload_1
    //   65: invokevirtual 70	com/tencent/beaconimsdk/a/c:j	()Ljava/lang/String;
    //   68: putfield 72	com/tencent/beaconimsdk/b/a/b:b	Ljava/lang/String;
    //   71: aload 6
    //   73: aload_1
    //   74: invokevirtual 74	com/tencent/beaconimsdk/a/c:d	()Ljava/lang/String;
    //   77: putfield 76	com/tencent/beaconimsdk/b/a/b:c	Ljava/lang/String;
    //   80: aload 6
    //   82: aload_1
    //   83: invokevirtual 79	com/tencent/beaconimsdk/a/c:e	()Ljava/lang/String;
    //   86: putfield 81	com/tencent/beaconimsdk/b/a/b:d	Ljava/lang/String;
    //   89: aload 6
    //   91: aload_1
    //   92: invokevirtual 84	com/tencent/beaconimsdk/a/c:f	()Ljava/lang/String;
    //   95: putfield 86	com/tencent/beaconimsdk/b/a/b:e	Ljava/lang/String;
    //   98: aload 6
    //   100: ldc 88
    //   102: putfield 91	com/tencent/beaconimsdk/b/a/b:l	Ljava/lang/String;
    //   105: iload_0
    //   106: bipush 100
    //   108: if_icmpne +381 -> 489
    //   111: new 93	java/util/HashMap
    //   114: dup
    //   115: invokespecial 94	java/util/HashMap:<init>	()V
    //   118: astore 7
    //   120: aload 7
    //   122: ldc 96
    //   124: new 98	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   131: invokestatic 104	com/tencent/beaconimsdk/event/UserAction:getUserID	()Ljava/lang/String;
    //   134: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokeinterface 117 3 0
    //   145: pop
    //   146: aload 7
    //   148: ldc 119
    //   150: new 98	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   157: aload_1
    //   158: invokevirtual 122	com/tencent/beaconimsdk/a/c:i	()Ljava/lang/String;
    //   161: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokeinterface 117 3 0
    //   172: pop
    //   173: aload_1
    //   174: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   177: invokestatic 130	com/tencent/beaconimsdk/event/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/event/c;
    //   180: astore 5
    //   182: aload 7
    //   184: ldc -124
    //   186: new 98	java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   193: aload 5
    //   195: invokevirtual 134	com/tencent/beaconimsdk/event/c:c	()Ljava/lang/String;
    //   198: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokeinterface 117 3 0
    //   209: pop
    //   210: aload 7
    //   212: ldc -120
    //   214: new 98	java/lang/StringBuilder
    //   217: dup
    //   218: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   221: aload 5
    //   223: invokevirtual 137	com/tencent/beaconimsdk/event/c:b	()Ljava/lang/String;
    //   226: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokeinterface 117 3 0
    //   237: pop
    //   238: aload 7
    //   240: ldc -117
    //   242: new 98	java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   249: aload 5
    //   251: invokevirtual 140	com/tencent/beaconimsdk/event/c:d	()Ljava/lang/String;
    //   254: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokeinterface 117 3 0
    //   265: pop
    //   266: aload 7
    //   268: ldc -114
    //   270: new 98	java/lang/StringBuilder
    //   273: dup
    //   274: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   277: aload 5
    //   279: invokevirtual 143	com/tencent/beaconimsdk/event/c:f	()Ljava/lang/String;
    //   282: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: invokeinterface 117 3 0
    //   293: pop
    //   294: aload 7
    //   296: ldc -111
    //   298: new 98	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   305: aload 5
    //   307: invokevirtual 146	com/tencent/beaconimsdk/event/c:e	()Ljava/lang/String;
    //   310: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokeinterface 117 3 0
    //   321: pop
    //   322: aload 7
    //   324: ldc -108
    //   326: new 98	java/lang/StringBuilder
    //   329: dup
    //   330: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   333: aload 5
    //   335: invokevirtual 151	com/tencent/beaconimsdk/event/c:g	()Ljava/lang/String;
    //   338: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: invokeinterface 117 3 0
    //   349: pop
    //   350: aload_1
    //   351: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   354: invokestatic 153	com/tencent/beaconimsdk/a/e:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/e;
    //   357: pop
    //   358: aload 7
    //   360: ldc -101
    //   362: aload_1
    //   363: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   366: invokestatic 158	com/tencent/beaconimsdk/a/e:g	(Landroid/content/Context;)Ljava/lang/String;
    //   369: invokeinterface 117 3 0
    //   374: pop
    //   375: aload_1
    //   376: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   379: invokestatic 163	com/tencent/beaconimsdk/a/a:g	(Landroid/content/Context;)Z
    //   382: ifeq +151 -> 533
    //   385: aload 7
    //   387: ldc -91
    //   389: ldc -89
    //   391: invokeinterface 117 3 0
    //   396: pop
    //   397: aload 7
    //   399: ldc -87
    //   401: new 98	java/lang/StringBuilder
    //   404: dup
    //   405: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   408: aload_1
    //   409: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   412: invokestatic 171	com/tencent/beaconimsdk/a/a:i	(Landroid/content/Context;)Ljava/lang/String;
    //   415: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   421: invokeinterface 117 3 0
    //   426: pop
    //   427: aload 7
    //   429: ldc -83
    //   431: new 98	java/lang/StringBuilder
    //   434: dup
    //   435: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   438: aload_1
    //   439: invokevirtual 125	com/tencent/beaconimsdk/a/c:l	()Landroid/content/Context;
    //   442: invokestatic 177	com/tencent/beaconimsdk/a/a:h	(Landroid/content/Context;)I
    //   445: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   448: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   451: invokeinterface 117 3 0
    //   456: pop
    //   457: getstatic 183	com/tencent/beaconimsdk/a/a:b	Z
    //   460: ifeq +100 -> 560
    //   463: ldc -71
    //   465: astore 5
    //   467: aload 7
    //   469: ldc -69
    //   471: aload 5
    //   473: invokeinterface 117 3 0
    //   478: pop
    //   479: aload 6
    //   481: aload 7
    //   483: invokestatic 190	com/tencent/beaconimsdk/a/e:a	(Ljava/util/Map;)Ljava/lang/String;
    //   486: putfield 91	com/tencent/beaconimsdk/b/a/b:l	Ljava/lang/String;
    //   489: aload_1
    //   490: monitorexit
    //   491: aload 6
    //   493: iload_0
    //   494: putfield 193	com/tencent/beaconimsdk/b/a/b:f	I
    //   497: aload 6
    //   499: iload 4
    //   501: i2b
    //   502: putfield 195	com/tencent/beaconimsdk/b/a/b:h	B
    //   505: aload 6
    //   507: iload_3
    //   508: i2b
    //   509: putfield 197	com/tencent/beaconimsdk/b/a/b:i	B
    //   512: aload_2
    //   513: astore_1
    //   514: aload_2
    //   515: ifnonnull +9 -> 524
    //   518: ldc 88
    //   520: invokevirtual 203	java/lang/String:getBytes	()[B
    //   523: astore_1
    //   524: aload 6
    //   526: aload_1
    //   527: putfield 206	com/tencent/beaconimsdk/b/a/b:g	[B
    //   530: aload 6
    //   532: areturn
    //   533: aload 7
    //   535: ldc -91
    //   537: ldc -49
    //   539: invokeinterface 117 3 0
    //   544: pop
    //   545: goto -148 -> 397
    //   548: astore_2
    //   549: aload_1
    //   550: monitorexit
    //   551: aload_2
    //   552: athrow
    //   553: astore_1
    //   554: aload_1
    //   555: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   558: aconst_null
    //   559: areturn
    //   560: ldc -44
    //   562: astore 5
    //   564: goto -97 -> 467
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	567	0	paramInt1	int
    //   0	567	1	paramc	c
    //   0	567	2	paramArrayOfByte	byte[]
    //   0	567	3	paramInt2	int
    //   0	567	4	paramInt3	int
    //   180	383	5	localObject	Object
    //   31	500	6	localb	com.tencent.beaconimsdk.b.a.b
    //   118	416	7	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   35	105	548	finally
    //   111	397	548	finally
    //   397	463	548	finally
    //   467	489	548	finally
    //   489	491	548	finally
    //   533	545	548	finally
    //   24	35	553	java/lang/Throwable
    //   491	512	553	java/lang/Throwable
    //   518	524	553	java/lang/Throwable
    //   524	530	553	java/lang/Throwable
    //   549	553	553	java/lang/Throwable
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
      com.tencent.beaconimsdk.c.a.d("getDeviceName error", new Object[0]);
      com.tencent.beaconimsdk.c.a.a(localThrowable);
    }
    return "";
  }
  
  public static String a(Map<String, String> paramMap)
  {
    com.tencent.beaconimsdk.c.a.b("map 2 str", new Object[0]);
    if (paramMap == null) {
      return "";
    }
    Object localObject = paramMap.keySet();
    if (localObject == null) {
      return "";
    }
    if (((Set)localObject).size() > 50) {
      com.tencent.beaconimsdk.c.a.c("The Map<String, String> params size is more than 50, effective size is <= 50!", new Object[0]);
    }
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = ((Set)localObject).iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      int i = str2.trim().length();
      String str1;
      if ((i > 0) && (d(str2)))
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
          break label326;
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
        com.tencent.beaconimsdk.c.a.c("The Map<String, String> params key is invalid!! key should be ASCII code in 32-126! key:" + str2, new Object[0]);
        break;
        label326:
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
  
  public static HashSet<String> a(ArrayList<String> paramArrayList)
  {
    int i = paramArrayList.size();
    if ((paramArrayList != null) && (i > 0))
    {
      HashSet localHashSet = new HashSet(i);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localHashSet.add((String)paramArrayList.next());
      }
      return localHashSet;
    }
    return null;
  }
  
  public static List<h> a(Context paramContext, int paramInt)
  {
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.queryRecentRecord() start", new Object[0]);
    if (paramContext == null) {
      com.tencent.beaconimsdk.c.a.d(" queryRecentRecord() have null args!", new Object[0]);
    }
    List localList;
    do
    {
      return null;
      localList = com.tencent.beaconimsdk.a.a.a.a(paramContext, new int[] { 1 }, paramInt);
    } while ((localList == null) || (localList.size() <= 0));
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = localList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      com.tencent.beaconimsdk.a.a.a locala = (com.tencent.beaconimsdk.a.a.a)((Iterator)localObject1).next();
      try
      {
        Object localObject2 = b(locala.b);
        if ((localObject2 != null) && (h.class.isInstance(localObject2)))
        {
          localObject2 = (h)h.class.cast(localObject2);
          ((h)localObject2).a(locala.a);
          localArrayList.add(localObject2);
          ((Iterator)localObject1).remove();
        }
      }
      catch (Throwable localThrowable)
      {
        com.tencent.beaconimsdk.c.a.a(localThrowable);
        com.tencent.beaconimsdk.c.a.d(" query have error!", new Object[0]);
      }
    }
    if (localList.size() > 0)
    {
      com.tencent.beaconimsdk.c.a.a(" there are error datas ,should be remove " + localList.size(), new Object[0]);
      localObject1 = new Long[localList.size()];
      paramInt = 0;
      while (paramInt < localList.size())
      {
        localObject1[paramInt] = Long.valueOf(((com.tencent.beaconimsdk.a.a.a)localList.get(paramInt)).a);
        paramInt += 1;
      }
      com.tencent.beaconimsdk.a.a.a.a(paramContext, (Long[])localObject1);
    }
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.queryRecentRecord() end", new Object[0]);
    return localArrayList;
  }
  
  public static boolean a(Context paramContext, g paramg)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if ((paramContext == null) || (paramg == null)) {}
    SQLiteDatabase localSQLiteDatabase;
    for (;;)
    {
      try
      {
        com.tencent.beaconimsdk.c.a.c("context == null || bean == null}", new Object[0]);
        bool1 = bool2;
        return bool1;
      }
      finally {}
      try
      {
        localSQLiteDatabase = com.tencent.beaconimsdk.a.a.c.a(paramContext).getWritableDatabase();
        if (localSQLiteDatabase != null) {
          break;
        }
        com.tencent.beaconimsdk.c.a.d("get db fail!,return false ", new Object[0]);
        bool1 = bool2;
      }
      catch (Throwable paramContext)
      {
        com.tencent.beaconimsdk.c.a.d("Error strategy update!  %s", new Object[] { paramContext.toString() });
        bool1 = bool2;
      }
    }
    if (paramg == null) {
      paramContext = null;
    }
    for (;;)
    {
      if (paramContext != null)
      {
        long l = localSQLiteDatabase.replace("t_strategy", "_id", paramContext);
        if (l < 0L)
        {
          com.tencent.beaconimsdk.c.a.c("insert failure! return false ", new Object[0]);
          bool1 = bool2;
          break;
          paramContext = new ContentValues();
          if (paramg.a() >= 0L) {
            paramContext.put("_id", Long.valueOf(paramg.a()));
          }
          paramContext.put("_key", Integer.valueOf(paramg.b()));
          paramContext.put("_datas", paramg.c());
          continue;
        }
        paramg.a(l);
        com.tencent.beaconimsdk.c.a.e("update strategy  %d true ", new Object[] { Integer.valueOf(paramg.b()) });
      }
    }
    for (;;)
    {
      break;
      bool1 = false;
    }
  }
  
  public static boolean a(Context paramContext, String paramString, Object[] paramArrayOfObject)
  {
    Object localObject = com.tencent.beaconimsdk.a.a.c.a;
    if ((paramContext != null) && (paramString != null) && (paramArrayOfObject != null)) {}
    for (;;)
    {
      ContentValues localContentValues;
      try
      {
        if (paramArrayOfObject.length == 0) {
          return false;
        }
      }
      finally {}
      try
      {
        paramContext = com.tencent.beaconimsdk.a.a.c.a(paramContext).getWritableDatabase();
        paramContext.delete("t_conf", "_key = '" + paramString + "'", null);
        localContentValues = new ContentValues();
        localContentValues.put("_key", paramString);
        localContentValues.put("_value", (String)paramArrayOfObject[0]);
        localContentValues.put("_vdate", (Long)paramArrayOfObject[1]);
        localContentValues.put("_time", Long.valueOf(new Date().getTime()));
        if (paramContext.insert("t_conf", null, localContentValues) >= 0L) {
          break label172;
        }
        com.tencent.beaconimsdk.c.a.d(" insertOrUpdateByKey failure! return false!", new Object[0]);
        bool = false;
      }
      catch (Exception paramContext)
      {
        label172:
        bool = false;
        continue;
      }
      return bool;
      bool = true;
    }
  }
  
  /* Error */
  private static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: ldc_w 487
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 42	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +13 -> 24
    //   14: ldc_w 489
    //   17: aload_0
    //   18: invokevirtual 354	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   21: ifne +15 -> 36
    //   24: ldc_w 491
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aconst_null
    //   35: areturn
    //   36: new 493	java/io/ByteArrayOutputStream
    //   39: dup
    //   40: invokespecial 494	java/io/ByteArrayOutputStream:<init>	()V
    //   43: astore 4
    //   45: new 496	java/io/ObjectOutputStream
    //   48: dup
    //   49: aload 4
    //   51: invokespecial 499	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: astore_2
    //   55: aload_2
    //   56: astore_1
    //   57: aload_2
    //   58: aload_0
    //   59: invokevirtual 503	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: invokevirtual 506	java/io/ObjectOutputStream:flush	()V
    //   68: aload_2
    //   69: astore_1
    //   70: aload 4
    //   72: invokevirtual 509	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 512	java/io/ObjectOutputStream:close	()V
    //   80: aload 4
    //   82: invokevirtual 513	java/io/ByteArrayOutputStream:close	()V
    //   85: aload_0
    //   86: areturn
    //   87: astore_1
    //   88: aload_1
    //   89: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   92: aload_0
    //   93: areturn
    //   94: astore_1
    //   95: aload_1
    //   96: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   99: goto -19 -> 80
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_0
    //   105: aload_0
    //   106: astore_1
    //   107: aload_3
    //   108: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   111: aload_0
    //   112: astore_1
    //   113: aload_3
    //   114: invokevirtual 516	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 24	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_0
    //   125: ifnull +7 -> 132
    //   128: aload_0
    //   129: invokevirtual 512	java/io/ObjectOutputStream:close	()V
    //   132: aload 4
    //   134: invokevirtual 513	java/io/ByteArrayOutputStream:close	()V
    //   137: aconst_null
    //   138: areturn
    //   139: astore_0
    //   140: aload_0
    //   141: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   144: aconst_null
    //   145: areturn
    //   146: astore_0
    //   147: aload_0
    //   148: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   151: goto -19 -> 132
    //   154: astore_0
    //   155: aconst_null
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 512	java/io/ObjectOutputStream:close	()V
    //   165: aload 4
    //   167: invokevirtual 513	java/io/ByteArrayOutputStream:close	()V
    //   170: aload_0
    //   171: athrow
    //   172: astore_1
    //   173: aload_1
    //   174: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   177: goto -12 -> 165
    //   180: astore_1
    //   181: aload_1
    //   182: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   185: goto -15 -> 170
    //   188: astore_0
    //   189: goto -32 -> 157
    //   192: astore_3
    //   193: aload_2
    //   194: astore_0
    //   195: goto -90 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	paramObject	Object
    //   56	14	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   87	2	1	localIOException1	java.io.IOException
    //   94	2	1	localIOException2	java.io.IOException
    //   106	56	1	localObject	Object
    //   172	2	1	localIOException3	java.io.IOException
    //   180	2	1	localIOException4	java.io.IOException
    //   54	140	2	localObjectOutputStream2	java.io.ObjectOutputStream
    //   102	12	3	localThrowable1	Throwable
    //   192	1	3	localThrowable2	Throwable
    //   43	123	4	localByteArrayOutputStream	ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   80	85	87	java/io/IOException
    //   76	80	94	java/io/IOException
    //   45	55	102	java/lang/Throwable
    //   132	137	139	java/io/IOException
    //   128	132	146	java/io/IOException
    //   45	55	154	finally
    //   161	165	172	java/io/IOException
    //   165	170	180	java/io/IOException
    //   57	62	188	finally
    //   64	68	188	finally
    //   70	76	188	finally
    //   107	111	188	finally
    //   113	124	188	finally
    //   57	62	192	java/lang/Throwable
    //   64	68	192	java/lang/Throwable
    //   70	76	192	java/lang/Throwable
  }
  
  public static byte[] a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      Object localObject = new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCsAxNCSLyNUCOP1QqYStE8ZeiU\nv4afaMqEmoLCKb0mUZYvYOoVN7LPMi2IVY2MRaFJvuND3glVw1RDm2VJJtjQkwUd\n3kpR9TrHAf7UQOVTpNo3Vi7pXTOqZ6bh3ZA/fs56jDCCKV6+wT/pCeu8N6vVnPrD\nz3SdHIeNeWb/woazCwIDAQAB", 0));
      localObject = (RSAPublicKey)KeyFactory.getInstance("RSA", "BC").generatePublic((KeySpec)localObject);
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(1, (Key)localObject);
      paramString = localCipher.doFinal(paramString.getBytes());
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = null;
      }
    }
  }
  
  private static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramString == null) || (paramArrayOfByte == null)) {
      return null;
    }
    int i = paramString.length();
    while (i < 16)
    {
      paramString = paramString + "0";
      i += 1;
    }
    paramString = paramString.substring(0, 16);
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, localSecretKeySpec, new IvParameterSpec(paramString.getBytes()));
    return localCipher.doFinal(paramArrayOfByte);
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
  
  private static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    com.tencent.beaconimsdk.c.a.b("zp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    ByteArrayOutputStream localByteArrayOutputStream;
    Object localObject;
    if (paramInt == 1) {
      try
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
      catch (Throwable paramArrayOfByte)
      {
        com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
        com.tencent.beaconimsdk.c.a.d("err zp : %s", new Object[] { paramArrayOfByte.toString() });
        return null;
      }
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
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      paramArrayOfByte = a(a(paramArrayOfByte, paramInt1), paramInt2, paramString);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
    }
    return null;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    com.tencent.beaconimsdk.c.a.b("enD:} %d %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    if (paramInt == 1) {
      if ((paramString == null) || (paramArrayOfByte == null)) {
        return null;
      }
    }
    try
    {
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      DESKeySpec localDESKeySpec = new DESKeySpec(paramString.getBytes("UTF-8"));
      localCipher.init(1, SecretKeyFactory.getInstance("DES").generateSecret(localDESKeySpec), new IvParameterSpec(paramString.getBytes("UTF-8")));
      return localCipher.doFinal(paramArrayOfByte);
    }
    catch (Throwable paramArrayOfByte)
    {
      com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
      com.tencent.beaconimsdk.c.a.d("err enD: %s", new Object[] { paramArrayOfByte.toString() });
    }
    if (paramInt == 3)
    {
      paramArrayOfByte = b(paramString, paramArrayOfByte);
      return paramArrayOfByte;
    }
    return null;
    return null;
  }
  
  public static Long[] a(Context paramContext, List<h> paramList)
  {
    int j = 0;
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.insertList() start", new Object[0]);
    if ((paramContext == null) || (paramList == null))
    {
      com.tencent.beaconimsdk.c.a.d(" insertList() have null args!", new Object[0]);
      return null;
    }
    int k = paramList.size();
    if (k == 0)
    {
      com.tencent.beaconimsdk.c.a.b(" list siez == 0 , return true!", new Object[0]);
      return null;
    }
    Long[] arrayOfLong = new Long[k];
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < k)
    {
      h localh = (h)paramList.get(i);
      if (!localh.b().equals("UA")) {
        com.tencent.beaconimsdk.c.a.d(" bean's type is error!", new Object[0]);
      }
      for (;;)
      {
        i += 1;
        break;
        try
        {
          localArrayList.add(new com.tencent.beaconimsdk.a.a.a(localh.c(), a(localh)));
        }
        catch (Throwable localThrowable)
        {
          com.tencent.beaconimsdk.c.a.a(localThrowable);
        }
      }
    }
    if (!com.tencent.beaconimsdk.a.a.a.a(paramContext, localArrayList)) {
      return null;
    }
    paramContext = localArrayList.iterator();
    i = j;
    while (paramContext.hasNext())
    {
      paramList = (com.tencent.beaconimsdk.a.a.a)paramContext.next();
      if (i < k) {
        arrayOfLong[i] = Long.valueOf(paramList.a);
      }
      i += 1;
    }
    return arrayOfLong;
  }
  
  /* Error */
  public static Object[] a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 452	com/tencent/beaconimsdk/a/a/c:a	Ljava/lang/Object;
    //   5: astore_3
    //   6: aload_3
    //   7: monitorenter
    //   8: aload_0
    //   9: ifnonnull +17 -> 26
    //   12: ldc_w 697
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aload_3
    //   23: monitorexit
    //   24: aconst_null
    //   25: areturn
    //   26: aload_1
    //   27: ifnonnull +17 -> 44
    //   30: ldc_w 699
    //   33: iconst_0
    //   34: anewarray 4	java/lang/Object
    //   37: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: aload_3
    //   41: monitorexit
    //   42: aconst_null
    //   43: areturn
    //   44: aload_0
    //   45: invokestatic 391	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   48: invokevirtual 395	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   51: astore_0
    //   52: aload_0
    //   53: ifnonnull +17 -> 70
    //   56: ldc_w 701
    //   59: iconst_0
    //   60: anewarray 4	java/lang/Object
    //   63: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: aload_3
    //   67: monitorexit
    //   68: aconst_null
    //   69: areturn
    //   70: aload_0
    //   71: ldc_w 454
    //   74: aconst_null
    //   75: new 98	java/lang/StringBuilder
    //   78: dup
    //   79: ldc_w 456
    //   82: invokespecial 306	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload_1
    //   86: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: ldc_w 458
    //   92: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: aconst_null
    //   99: aconst_null
    //   100: aconst_null
    //   101: aconst_null
    //   102: invokevirtual 705	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   105: astore_0
    //   106: aload_0
    //   107: ifnull +92 -> 199
    //   110: aload_0
    //   111: invokeinterface 710 1 0
    //   116: ifeq +83 -> 199
    //   119: aload_0
    //   120: aload_0
    //   121: ldc_w 467
    //   124: invokeinterface 713 2 0
    //   129: invokeinterface 716 2 0
    //   134: astore_2
    //   135: aload_0
    //   136: aload_0
    //   137: ldc_w 469
    //   140: invokeinterface 713 2 0
    //   145: invokeinterface 720 2 0
    //   150: lstore 4
    //   152: aload_0
    //   153: ifnull +18 -> 171
    //   156: aload_0
    //   157: invokeinterface 723 1 0
    //   162: ifne +9 -> 171
    //   165: aload_0
    //   166: invokeinterface 724 1 0
    //   171: aload_3
    //   172: monitorexit
    //   173: iconst_3
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload_1
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: aload_2
    //   184: aastore
    //   185: dup
    //   186: iconst_2
    //   187: lload 4
    //   189: invokestatic 380	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   192: aastore
    //   193: areturn
    //   194: astore_0
    //   195: aload_3
    //   196: monitorexit
    //   197: aload_0
    //   198: athrow
    //   199: aload_0
    //   200: ifnull +18 -> 218
    //   203: aload_0
    //   204: invokeinterface 723 1 0
    //   209: ifne +9 -> 218
    //   212: aload_0
    //   213: invokeinterface 724 1 0
    //   218: aload_3
    //   219: monitorexit
    //   220: aconst_null
    //   221: areturn
    //   222: aload_0
    //   223: ifnull -5 -> 218
    //   226: aload_0
    //   227: invokeinterface 723 1 0
    //   232: ifne -14 -> 218
    //   235: aload_0
    //   236: invokeinterface 724 1 0
    //   241: goto -23 -> 218
    //   244: aload_1
    //   245: ifnull +18 -> 263
    //   248: aload_1
    //   249: invokeinterface 723 1 0
    //   254: ifne +9 -> 263
    //   257: aload_1
    //   258: invokeinterface 724 1 0
    //   263: aload_0
    //   264: athrow
    //   265: astore_2
    //   266: aload_0
    //   267: astore_1
    //   268: aload_2
    //   269: astore_0
    //   270: goto -26 -> 244
    //   273: astore_1
    //   274: goto -52 -> 222
    //   277: astore_0
    //   278: aconst_null
    //   279: astore_0
    //   280: goto -58 -> 222
    //   283: astore_0
    //   284: aload_2
    //   285: astore_1
    //   286: goto -42 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	paramContext	Context
    //   0	289	1	paramString	String
    //   1	183	2	str	String
    //   265	20	2	localObject1	Object
    //   5	214	3	localObject2	Object
    //   150	38	4	l	long
    // Exception table:
    //   from	to	target	type
    //   12	24	194	finally
    //   30	42	194	finally
    //   66	68	194	finally
    //   156	171	194	finally
    //   171	173	194	finally
    //   203	218	194	finally
    //   218	220	194	finally
    //   226	241	194	finally
    //   248	263	194	finally
    //   263	265	194	finally
    //   110	152	265	finally
    //   110	152	273	java/lang/Exception
    //   44	52	277	java/lang/Exception
    //   56	66	277	java/lang/Exception
    //   70	106	277	java/lang/Exception
    //   44	52	283	finally
    //   56	66	283	finally
    //   70	106	283	finally
  }
  
  /* Error */
  private static Object b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc_w 726
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 42	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +8 -> 19
    //   14: aload_0
    //   15: arraylength
    //   16: ifge +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: new 584	java/io/ByteArrayInputStream
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 585	java/io/ByteArrayInputStream:<init>	([B)V
    //   29: astore_3
    //   30: new 728	java/io/ObjectInputStream
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 729	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_1
    //   39: aload_1
    //   40: astore_0
    //   41: aload_1
    //   42: invokevirtual 732	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 733	java/io/ObjectInputStream:close	()V
    //   50: aload_3
    //   51: invokevirtual 601	java/io/ByteArrayInputStream:close	()V
    //   54: aload_2
    //   55: areturn
    //   56: astore_0
    //   57: aload_0
    //   58: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   61: aload_2
    //   62: areturn
    //   63: astore_0
    //   64: aload_0
    //   65: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   68: goto -18 -> 50
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_1
    //   74: aload_1
    //   75: astore_0
    //   76: aload_2
    //   77: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   80: aload_1
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 516	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 24	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_1
    //   94: ifnull +7 -> 101
    //   97: aload_1
    //   98: invokevirtual 733	java/io/ObjectInputStream:close	()V
    //   101: aload_3
    //   102: invokevirtual 601	java/io/ByteArrayInputStream:close	()V
    //   105: aconst_null
    //   106: areturn
    //   107: astore_0
    //   108: aload_0
    //   109: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   112: aconst_null
    //   113: areturn
    //   114: astore_0
    //   115: aload_0
    //   116: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   119: goto -18 -> 101
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_0
    //   125: aload_0
    //   126: ifnull +7 -> 133
    //   129: aload_0
    //   130: invokevirtual 733	java/io/ObjectInputStream:close	()V
    //   133: aload_3
    //   134: invokevirtual 601	java/io/ByteArrayInputStream:close	()V
    //   137: aload_1
    //   138: athrow
    //   139: astore_0
    //   140: aload_0
    //   141: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   144: goto -11 -> 133
    //   147: astore_0
    //   148: aload_0
    //   149: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   152: goto -15 -> 137
    //   155: astore_1
    //   156: goto -31 -> 125
    //   159: astore_2
    //   160: goto -86 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramArrayOfByte	byte[]
    //   38	60	1	localObjectInputStream	java.io.ObjectInputStream
    //   122	16	1	localObject1	Object
    //   155	1	1	localObject2	Object
    //   45	17	2	localObject3	Object
    //   71	12	2	localThrowable1	Throwable
    //   159	1	2	localThrowable2	Throwable
    //   29	105	3	localByteArrayInputStream	ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   50	54	56	java/io/IOException
    //   46	50	63	java/io/IOException
    //   30	39	71	java/lang/Throwable
    //   101	105	107	java/io/IOException
    //   97	101	114	java/io/IOException
    //   30	39	122	finally
    //   129	133	139	java/io/IOException
    //   133	137	147	java/io/IOException
    //   41	46	155	finally
    //   76	80	155	finally
    //   82	93	155	finally
    //   41	46	159	java/lang/Throwable
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
      com.tencent.beaconimsdk.c.a.d("getVersion error", new Object[0]);
      com.tencent.beaconimsdk.c.a.a(localThrowable);
    }
    return "";
  }
  
  public static String b(Context paramContext)
  {
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d("getImei but context == null!", new Object[0]);
      return "";
    }
    for (;;)
    {
      try
      {
        if (!a.f(paramContext)) {
          continue;
        }
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
        if (paramContext != null) {
          continue;
        }
        paramContext = "";
      }
      catch (Throwable paramContext)
      {
        Object localObject = "";
        continue;
        paramContext = "";
        continue;
      }
      localObject = paramContext;
      try
      {
        com.tencent.beaconimsdk.c.a.a("IMEI:" + paramContext, new Object[0]);
        return paramContext;
      }
      catch (Throwable paramContext) {}
      com.tencent.beaconimsdk.c.a.d("getImei error!", new Object[0]);
      return (String)localObject;
      localObject = paramContext;
      paramContext = paramContext.toLowerCase();
    }
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    try
    {
      Object localObject = com.tencent.beaconimsdk.event.c.a(paramContext);
      paramContext = ((com.tencent.beaconimsdk.event.c)localObject).a();
      localObject = ((com.tencent.beaconimsdk.event.c)localObject).b();
      paramContext = h(paramContext + "_" + (String)localObject + "_" + new Date().getTime() + "_" + paramInt);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static String b(String paramString)
  {
    String str = paramString.replace('|', '_').trim();
    if (d(str))
    {
      if (str.length() < 5) {
        com.tencent.beaconimsdk.c.a.c(" userID is invalid!! userID is too short, length < 5!", new Object[0]);
      }
      paramString = str;
      if (str.length() > 128) {
        paramString = str.substring(0, 128);
      }
      return paramString;
    }
    com.tencent.beaconimsdk.c.a.c("userID is invalid!! userID should be ASCII code in 32-126! userID:" + paramString, new Object[0]);
    return "10000";
  }
  
  private static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    if ((paramString == null) || (paramArrayOfByte == null)) {
      return null;
    }
    int i = paramString.length();
    while (i < 16)
    {
      paramString = paramString + "0";
      i += 1;
    }
    paramString = paramString.substring(0, 16);
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString.getBytes(), "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, localSecretKeySpec, new IvParameterSpec(paramString.getBytes()));
    return localCipher.doFinal(paramArrayOfByte);
  }
  
  private static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    com.tencent.beaconimsdk.c.a.b("unzp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    if (paramInt == 1)
    {
      ByteArrayInputStream localByteArrayInputStream;
      ZipInputStream localZipInputStream;
      for (;;)
      {
        ByteArrayOutputStream localByteArrayOutputStream;
        try
        {
          localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
          localZipInputStream = new ZipInputStream(localByteArrayInputStream);
          paramArrayOfByte = null;
          if (localZipInputStream.getNextEntry() == null) {
            break;
          }
          paramArrayOfByte = new byte['Ѐ'];
          localByteArrayOutputStream = new ByteArrayOutputStream();
          paramInt = localZipInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length);
          if (paramInt != -1)
          {
            localByteArrayOutputStream.write(paramArrayOfByte, 0, paramInt);
            continue;
          }
          paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        }
        catch (Throwable paramArrayOfByte)
        {
          com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
          com.tencent.beaconimsdk.c.a.d("err unzp}" + paramArrayOfByte.toString(), new Object[0]);
          return null;
        }
        localByteArrayOutputStream.flush();
        localByteArrayOutputStream.close();
      }
      localZipInputStream.close();
      localByteArrayInputStream.close();
      return paramArrayOfByte;
    }
    if (paramInt == 2)
    {
      paramArrayOfByte = a(paramArrayOfByte);
      return paramArrayOfByte;
    }
    return null;
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    try
    {
      paramArrayOfByte = b(b(paramArrayOfByte, paramInt2, paramString), paramInt1);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
    }
    return null;
  }
  
  private static byte[] b(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    if (paramInt == 1) {
      if ((paramString == null) || (paramArrayOfByte == null)) {
        return null;
      }
    }
    try
    {
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      DESKeySpec localDESKeySpec = new DESKeySpec(paramString.getBytes("UTF-8"));
      localCipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(localDESKeySpec), new IvParameterSpec(paramString.getBytes("UTF-8")));
      return localCipher.doFinal(paramArrayOfByte);
    }
    catch (Throwable paramArrayOfByte)
    {
      com.tencent.beaconimsdk.c.a.a(paramArrayOfByte);
      com.tencent.beaconimsdk.c.a.d("err unD: %s", new Object[] { paramArrayOfByte.toString() });
    }
    if (paramInt == 3)
    {
      paramArrayOfByte = a(paramString, paramArrayOfByte);
      return paramArrayOfByte;
    }
    return null;
    return null;
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
      com.tencent.beaconimsdk.c.a.d("getApiLevel error", new Object[0]);
      com.tencent.beaconimsdk.c.a.a(localThrowable);
    }
    return "";
  }
  
  public static String c(Context paramContext)
  {
    String str = "";
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d("getImsi but context == null!", new Object[0]);
      return "";
    }
    Object localObject = str;
    try
    {
      if (a.f(paramContext))
      {
        localObject = str;
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
        if (paramContext == null)
        {
          paramContext = "";
        }
        else
        {
          localObject = paramContext;
          paramContext = paramContext.toLowerCase();
        }
      }
    }
    catch (Throwable paramContext)
    {
      paramContext = (Context)localObject;
      com.tencent.beaconimsdk.c.a.d("getImsi error!", new Object[0]);
    }
    paramContext = "";
    return paramContext;
  }
  
  public static String c(String paramString)
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
    com.tencent.beaconimsdk.c.a.c("channelID is invalid!! channelID should be Numeric! channelID:" + paramString, new Object[0]);
    return "unknown";
  }
  
  public static String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/type")));
      String str = localBufferedReader.readLine();
      localBufferedReader.close();
      localStringBuilder.append(str).append(",");
      localBufferedReader = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/name")));
      str = localBufferedReader.readLine();
      localBufferedReader.close();
      localStringBuilder.append(str).append(",");
      localBufferedReader = new BufferedReader(new FileReader(new File("/sys/block/mmcblk0/device/cid")));
      str = localBufferedReader.readLine();
      localBufferedReader.close();
      localStringBuilder.append(str);
      return localStringBuilder.toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.beaconimsdk.c.a.a(localException);
      }
    }
  }
  
  public static String d(Context paramContext)
  {
    String str2 = "";
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d("getAndroidId but context == null!", new Object[0]);
      return "";
    }
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (paramContext == null) {
        return "";
      }
      String str1;
      com.tencent.beaconimsdk.c.a.d("getAndroidId error!", new Object[0]);
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
    com.tencent.beaconimsdk.c.a.a(localThrowable1);
    return paramContext;
  }
  
  public static boolean d(String paramString)
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
  
  public static String e()
  {
    try
    {
      String str = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
      return str;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.beaconimsdk.c.a.a(localThrowable);
    }
    return "";
  }
  
  public static String e(Context paramContext)
  {
    String str = "";
    Object localObject;
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d("getMacAddress but context == null!", new Object[0]);
      localObject = "";
    }
    do
    {
      return (String)localObject;
      localObject = str;
      try
      {
        if (Integer.valueOf(Build.VERSION.SDK).intValue() < 23)
        {
          localObject = str;
          paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
          if (paramContext == null) {
            return "";
          }
          localObject = paramContext;
          return paramContext.toLowerCase();
        }
        localObject = str;
        arrayOfString = new String[2];
        arrayOfString[0] = "/sys/class/net/wlan0/address";
        arrayOfString[1] = "/sys/devices/virtual/net/wlan0/address";
        localObject = str;
        j = arrayOfString.length;
        i = 0;
        paramContext = "";
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          String[] arrayOfString;
          int j;
          int i;
          localObject = f(arrayOfString[i]).toString().trim();
          paramContext = (Context)localObject;
          if (paramContext != null)
          {
            localObject = paramContext;
            if (paramContext.length() > 0)
            {
              localObject = paramContext;
              paramContext = paramContext.toLowerCase();
              return paramContext;
            }
          }
          i += 1;
        }
        catch (Throwable localThrowable2)
        {
          for (;;) {}
        }
        localThrowable1 = localThrowable1;
        paramContext = (Context)localObject;
      }
      localObject = paramContext;
    } while (i >= j);
    com.tencent.beaconimsdk.c.a.a(localThrowable1);
    return paramContext;
  }
  
  public static Date e(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() <= 0)) {
      return null;
    }
    try
    {
      paramString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(paramString);
      return paramString;
    }
    catch (ParseException paramString)
    {
      com.tencent.beaconimsdk.c.a.a(paramString);
    }
    return null;
  }
  
  public static String f(Context paramContext)
  {
    if (a != null)
    {
      e locale = a;
      return g(paramContext);
    }
    return "unknown";
  }
  
  public static String f(String paramString)
  {
    String str2 = "";
    String str1 = str2;
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString);
      str1 = str2;
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      str1 = str2;
      localFileInputStream.read(arrayOfByte);
      str1 = str2;
      str2 = EncodingUtils.getString(arrayOfByte, "UTF-8");
      str1 = str2;
      localFileInputStream.close();
      return str2;
    }
    catch (Exception localException)
    {
      com.tencent.beaconimsdk.c.a.d("Read file %s failed.", new Object[] { paramString });
    }
    return str1;
  }
  
  public static String g(Context paramContext)
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
      com.tencent.beaconimsdk.c.a.a(paramContext);
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
  
  private static String g(String paramString)
  {
    int i = 0;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      StringBuffer localStringBuffer = new StringBuffer();
      int j = localObject.length;
      while (i < j)
      {
        int k = localObject[i] & 0xFF;
        if (k < 16) {
          localStringBuffer.append(0);
        }
        localStringBuffer.append(Integer.toHexString(k));
        i += 1;
      }
      localObject = localStringBuffer.toString();
      return (String)localObject;
    }
    catch (Exception localException)
    {
      com.tencent.beaconimsdk.c.a.a(localException);
    }
    return paramString;
  }
  
  /* Error */
  public static g h(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 2
    //   6: monitorenter
    //   7: aload_0
    //   8: ifnonnull +20 -> 28
    //   11: ldc_w 999
    //   14: iconst_0
    //   15: anewarray 4	java/lang/Object
    //   18: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aconst_null
    //   22: astore_2
    //   23: ldc 2
    //   25: monitorexit
    //   26: aload_2
    //   27: areturn
    //   28: aload_0
    //   29: invokestatic 391	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   32: invokevirtual 395	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore_0
    //   36: aload_0
    //   37: ifnonnull +18 -> 55
    //   40: ldc_w 701
    //   43: iconst_0
    //   44: anewarray 4	java/lang/Object
    //   47: invokestatic 235	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aconst_null
    //   51: astore_2
    //   52: goto -29 -> 23
    //   55: aload_0
    //   56: ldc_w 402
    //   59: aconst_null
    //   60: getstatic 873	java/util/Locale:US	Ljava/util/Locale;
    //   63: ldc_w 1001
    //   66: iconst_2
    //   67: anewarray 4	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: ldc_w 424
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: bipush 101
    //   80: invokestatic 431	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: aastore
    //   84: invokestatic 1004	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: invokevirtual 705	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore_0
    //   95: aload_0
    //   96: ifnull +270 -> 366
    //   99: aload_0
    //   100: invokeinterface 710 1 0
    //   105: ifeq +261 -> 366
    //   108: aload_2
    //   109: astore_1
    //   110: aload_0
    //   111: ifnull +29 -> 140
    //   114: aload_2
    //   115: astore_1
    //   116: aload_0
    //   117: invokeinterface 1007 1 0
    //   122: ifne +18 -> 140
    //   125: aload_0
    //   126: invokeinterface 1010 1 0
    //   131: istore 4
    //   133: iload 4
    //   135: ifeq +63 -> 198
    //   138: aload_2
    //   139: astore_1
    //   140: aload_1
    //   141: ifnull +23 -> 164
    //   144: ldc_w 1012
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_1
    //   154: invokevirtual 426	com/tencent/beaconimsdk/a/b/g:b	()I
    //   157: invokestatic 431	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   160: aastore
    //   161: invokestatic 1014	com/tencent/beaconimsdk/c/a:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_1
    //   165: astore_2
    //   166: aload_0
    //   167: ifnull -144 -> 23
    //   170: aload_1
    //   171: astore_2
    //   172: aload_0
    //   173: invokeinterface 723 1 0
    //   178: ifne -155 -> 23
    //   181: aload_0
    //   182: invokeinterface 724 1 0
    //   187: aload_1
    //   188: astore_2
    //   189: goto -166 -> 23
    //   192: astore_0
    //   193: ldc 2
    //   195: monitorexit
    //   196: aload_0
    //   197: athrow
    //   198: ldc_w 1016
    //   201: iconst_0
    //   202: anewarray 4	java/lang/Object
    //   205: invokestatic 42	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: new 416	com/tencent/beaconimsdk/a/b/g
    //   211: dup
    //   212: invokespecial 1017	com/tencent/beaconimsdk/a/b/g:<init>	()V
    //   215: astore_1
    //   216: aload_1
    //   217: aload_0
    //   218: aload_0
    //   219: ldc_w 404
    //   222: invokeinterface 713 2 0
    //   227: invokeinterface 720 2 0
    //   232: invokevirtual 442	com/tencent/beaconimsdk/a/b/g:a	(J)V
    //   235: aload_1
    //   236: aload_0
    //   237: aload_0
    //   238: ldc_w 424
    //   241: invokeinterface 713 2 0
    //   246: invokeinterface 1021 2 0
    //   251: invokevirtual 1023	com/tencent/beaconimsdk/a/b/g:a	(I)V
    //   254: aload_1
    //   255: aload_0
    //   256: aload_0
    //   257: ldc_w 436
    //   260: invokeinterface 713 2 0
    //   265: invokeinterface 1027 2 0
    //   270: invokevirtual 1029	com/tencent/beaconimsdk/a/b/g:a	([B)V
    //   273: goto -133 -> 140
    //   276: astore_2
    //   277: aconst_null
    //   278: astore_0
    //   279: aload_2
    //   280: invokestatic 210	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   283: aload_0
    //   284: astore_2
    //   285: aload_1
    //   286: ifnull -263 -> 23
    //   289: aload_0
    //   290: astore_2
    //   291: aload_1
    //   292: invokeinterface 723 1 0
    //   297: ifne -274 -> 23
    //   300: aload_1
    //   301: invokeinterface 724 1 0
    //   306: aload_0
    //   307: astore_2
    //   308: goto -285 -> 23
    //   311: aload_0
    //   312: ifnull +18 -> 330
    //   315: aload_0
    //   316: invokeinterface 723 1 0
    //   321: ifne +9 -> 330
    //   324: aload_0
    //   325: invokeinterface 724 1 0
    //   330: aload_1
    //   331: athrow
    //   332: astore_1
    //   333: goto -22 -> 311
    //   336: astore_2
    //   337: aload_1
    //   338: astore_0
    //   339: aload_2
    //   340: astore_1
    //   341: goto -30 -> 311
    //   344: astore_2
    //   345: aconst_null
    //   346: astore_3
    //   347: aload_0
    //   348: astore_1
    //   349: aload_3
    //   350: astore_0
    //   351: goto -72 -> 279
    //   354: astore_3
    //   355: aload_1
    //   356: astore_2
    //   357: aload_0
    //   358: astore_1
    //   359: aload_2
    //   360: astore_0
    //   361: aload_3
    //   362: astore_2
    //   363: goto -84 -> 279
    //   366: aconst_null
    //   367: astore_1
    //   368: goto -204 -> 164
    //   371: astore_1
    //   372: aconst_null
    //   373: astore_0
    //   374: goto -63 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	377	0	paramContext	Context
    //   1	330	1	localObject1	Object
    //   332	6	1	localObject2	Object
    //   340	28	1	localObject3	Object
    //   371	1	1	localObject4	Object
    //   3	186	2	localObject5	Object
    //   276	4	2	localThrowable1	Throwable
    //   284	24	2	localContext	Context
    //   336	4	2	localObject6	Object
    //   344	1	2	localThrowable2	Throwable
    //   356	7	2	localObject7	Object
    //   346	4	3	localObject8	Object
    //   354	8	3	localThrowable3	Throwable
    //   131	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	21	192	finally
    //   172	187	192	finally
    //   291	306	192	finally
    //   315	330	192	finally
    //   330	332	192	finally
    //   28	36	276	java/lang/Throwable
    //   40	50	276	java/lang/Throwable
    //   55	95	276	java/lang/Throwable
    //   99	108	332	finally
    //   116	133	332	finally
    //   144	164	332	finally
    //   198	273	332	finally
    //   279	283	336	finally
    //   99	108	344	java/lang/Throwable
    //   116	133	344	java/lang/Throwable
    //   198	273	344	java/lang/Throwable
    //   144	164	354	java/lang/Throwable
    //   28	36	371	finally
    //   40	50	371	finally
    //   55	95	371	finally
  }
  
  private static String h(String paramString)
  {
    String str = g(paramString);
    paramString = str;
    if (str != null) {}
    try
    {
      paramString = str.substring(8, 24);
      return paramString;
    }
    catch (Exception paramString) {}
    return str;
  }
  
  public static int i(Context paramContext)
  {
    int k = 0;
    int j = 0;
    if (paramContext == null) {}
    for (;;)
    {
      try
      {
        com.tencent.beaconimsdk.c.a.c("context == null ||key < -1}", new Object[0]);
        i = j;
        return i;
      }
      finally {}
      int i = k;
      try
      {
        paramContext = com.tencent.beaconimsdk.a.a.c.a(paramContext).getWritableDatabase();
        if (paramContext != null) {
          break label73;
        }
        i = k;
        com.tencent.beaconimsdk.c.a.d("get db fail!,return ", new Object[0]);
        i = j;
      }
      catch (Throwable paramContext)
      {
        com.tencent.beaconimsdk.c.a.a(paramContext);
      }
      continue;
      label73:
      i = k;
      j = paramContext.delete("t_strategy", String.format("%s = %d", new Object[] { "_key", Integer.valueOf(101) }), null);
      i = j;
      com.tencent.beaconimsdk.c.a.g("delete Strategy key} %d , num} %d", new Object[] { Integer.valueOf(101), Integer.valueOf(j) });
      i = j;
    }
  }
  
  public static int j(Context paramContext)
  {
    com.tencent.beaconimsdk.c.a.a(" RecordDAO.countRecordNum() start", new Object[0]);
    if (paramContext == null)
    {
      com.tencent.beaconimsdk.c.a.d(" countRecordNum() have null args!", new Object[0]);
      return -1;
    }
    return com.tencent.beaconimsdk.a.a.a.b(paramContext, new int[] { 1 });
  }
  
  public static String k(Context paramContext)
  {
    try
    {
      String str = com.tencent.beaconimsdk.event.c.a(paramContext).d();
      paramContext = "";
      c localc = c.m();
      if (localc != null) {
        paramContext = localc.j();
      }
      int i = (int)(Math.random() * 2.147483647E9D);
      paramContext = h(paramContext + "_" + str + "_" + new Date().getTime() + "_" + i);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static boolean l(Context paramContext)
  {
    paramContext = o(paramContext);
    return (paramContext != null) && (paramContext.getType() == 1);
  }
  
  public static boolean m(Context paramContext)
  {
    paramContext = o(paramContext);
    return (paramContext != null) && (paramContext.isConnected());
  }
  
  public static String n(Context paramContext)
  {
    paramContext = o(paramContext);
    if (paramContext == null) {
      paramContext = "unknown";
    }
    String str;
    do
    {
      do
      {
        return paramContext;
        if (paramContext.getType() == 1) {
          return "wifi";
        }
        str = paramContext.getExtraInfo();
        paramContext = str;
      } while (str == null);
      paramContext = str;
    } while (str.length() <= 64);
    return str.substring(0, 64);
  }
  
  private static NetworkInfo o(Context paramContext)
  {
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      com.tencent.beaconimsdk.c.a.a(paramContext);
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */