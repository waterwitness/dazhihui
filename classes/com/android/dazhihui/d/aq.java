package com.android.dazhihui.d;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Base64;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.LogVo;
import com.c.a.k;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class aq
{
  private static String a()
  {
    Date localDate = new Date();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT");
    localSimpleDateFormat.setTimeZone(localTimeZone);
    new GregorianCalendar(localTimeZone).setTimeInMillis(localDate.getTime());
    return localSimpleDateFormat.format(localDate);
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString1 + "\n");
    if (!TextUtils.isEmpty(paramString2))
    {
      localStringBuilder.append(paramString2 + "\n");
      if (TextUtils.isEmpty(paramString3)) {
        break label196;
      }
      localStringBuilder.append(paramString3 + "\n");
    }
    for (;;)
    {
      localStringBuilder.append(paramString4 + "\n");
      if (!TextUtils.isEmpty(paramString5)) {
        localStringBuilder.append(paramString5);
      }
      paramString1 = paramString6;
      if (TextUtils.isEmpty(paramString6)) {
        paramString1 = "/";
      }
      localStringBuilder.append(paramString1);
      paramString1 = b("56efiPDNf6HqizfM8518BtTahtz2K8", localStringBuilder.toString());
      return "OSS Cqh7y2s4Sl4AWkuC:" + paramString1;
      localStringBuilder.append("\n");
      break;
      label196:
      localStringBuilder.append("\n");
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (g.a().L()) {
      return;
    }
    paramContext = new LogVo(paramContext, paramString, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()), "adarrive");
    paramContext = new k().a(paramContext);
    paramString = new SimpleDateFormat("yyyyMMddHH").format(new Date());
    paramString = paramString + "/android_" + g.a().u() + "_" + paramString + ".json";
    new as().execute(new String[] { paramString, paramContext });
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, at paramat)
  {
    if (g.a().L()) {
      return;
    }
    Object localObject = new LogVo(paramContext, paramString1, paramString2, "bugmsg");
    paramContext = g.a().u();
    k localk = new k();
    paramString1 = new SimpleDateFormat("yyyyMMdd").format(new Date());
    paramString2 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    localObject = localk.a(localObject);
    paramContext = paramString1 + "/android_" + paramContext + "_" + paramString2 + ".json";
    new ar(paramat).execute(new String[] { localObject, paramContext });
  }
  
  /* Error */
  private static int b(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 7
    //   5: aconst_null
    //   6: astore 8
    //   8: aconst_null
    //   9: astore 5
    //   11: new 162	java/net/URL
    //   14: dup
    //   15: new 65	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   22: ldc -92
    //   24: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_1
    //   28: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: ldc -90
    //   33: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: iload_2
    //   37: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokespecial 170	java/net/URL:<init>	(Ljava/lang/String;)V
    //   46: invokevirtual 174	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   49: checkcast 176	java/net/HttpURLConnection
    //   52: astore 6
    //   54: aload 6
    //   56: astore 4
    //   58: aload 7
    //   60: astore_3
    //   61: aload 8
    //   63: astore 5
    //   65: invokestatic 178	com/android/dazhihui/d/aq:a	()Ljava/lang/String;
    //   68: astore 9
    //   70: aload 6
    //   72: astore 4
    //   74: aload 7
    //   76: astore_3
    //   77: aload 8
    //   79: astore 5
    //   81: aload 6
    //   83: ldc -76
    //   85: ldc -74
    //   87: ldc -72
    //   89: ldc -70
    //   91: aload 9
    //   93: ldc -72
    //   95: new 65	java/lang/StringBuilder
    //   98: dup
    //   99: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   102: ldc -68
    //   104: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_1
    //   108: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: ldc -90
    //   113: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: iload_2
    //   117: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   120: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 190	com/android/dazhihui/d/aq:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   126: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload 6
    //   131: astore 4
    //   133: aload 7
    //   135: astore_3
    //   136: aload 8
    //   138: astore 5
    //   140: aload 6
    //   142: ldc -60
    //   144: aload 9
    //   146: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   149: aload 6
    //   151: astore 4
    //   153: aload 7
    //   155: astore_3
    //   156: aload 8
    //   158: astore 5
    //   160: aload 6
    //   162: ldc -58
    //   164: ldc -56
    //   166: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload 6
    //   171: astore 4
    //   173: aload 7
    //   175: astore_3
    //   176: aload 8
    //   178: astore 5
    //   180: aload 6
    //   182: ldc -54
    //   184: ldc -70
    //   186: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload 6
    //   191: astore 4
    //   193: aload 7
    //   195: astore_3
    //   196: aload 8
    //   198: astore 5
    //   200: aload 6
    //   202: sipush 10000
    //   205: invokevirtual 206	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   208: aload 6
    //   210: astore 4
    //   212: aload 7
    //   214: astore_3
    //   215: aload 8
    //   217: astore 5
    //   219: aload 6
    //   221: sipush 10000
    //   224: invokevirtual 209	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   227: aload 6
    //   229: astore 4
    //   231: aload 7
    //   233: astore_3
    //   234: aload 8
    //   236: astore 5
    //   238: aload 6
    //   240: ldc -74
    //   242: invokevirtual 212	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   245: aload 6
    //   247: astore 4
    //   249: aload 7
    //   251: astore_3
    //   252: aload 8
    //   254: astore 5
    //   256: aload_0
    //   257: invokevirtual 216	java/lang/String:getBytes	()[B
    //   260: astore_1
    //   261: aload 6
    //   263: astore 4
    //   265: aload 7
    //   267: astore_3
    //   268: aload 8
    //   270: astore 5
    //   272: aload 6
    //   274: ldc -38
    //   276: aload_1
    //   277: arraylength
    //   278: invokestatic 222	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   281: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: aload 6
    //   286: astore 4
    //   288: aload 7
    //   290: astore_3
    //   291: aload 8
    //   293: astore 5
    //   295: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   298: new 65	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   305: ldc -26
    //   307: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: aload 6
    //   312: invokevirtual 234	java/net/HttpURLConnection:getRequestProperties	()Ljava/util/Map;
    //   315: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   318: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   321: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   324: aload 6
    //   326: astore 4
    //   328: aload 7
    //   330: astore_3
    //   331: aload 8
    //   333: astore 5
    //   335: aload 6
    //   337: invokevirtual 246	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   340: astore_0
    //   341: aload 6
    //   343: astore 4
    //   345: aload_0
    //   346: astore_3
    //   347: aload_0
    //   348: astore 5
    //   350: aload_0
    //   351: aload_1
    //   352: invokevirtual 252	java/io/OutputStream:write	([B)V
    //   355: aload 6
    //   357: astore 4
    //   359: aload_0
    //   360: astore_3
    //   361: aload_0
    //   362: astore 5
    //   364: aload 6
    //   366: invokevirtual 255	java/net/HttpURLConnection:connect	()V
    //   369: aload 6
    //   371: astore 4
    //   373: aload_0
    //   374: astore_3
    //   375: aload_0
    //   376: astore 5
    //   378: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   381: new 65	java/lang/StringBuilder
    //   384: dup
    //   385: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   388: ldc_w 257
    //   391: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: aload 6
    //   396: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   399: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   402: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   408: aload 6
    //   410: astore 4
    //   412: aload_0
    //   413: astore_3
    //   414: aload_0
    //   415: astore 5
    //   417: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   420: new 65	java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   427: ldc_w 263
    //   430: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: aload 6
    //   435: invokevirtual 266	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   438: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   447: aload 6
    //   449: astore 4
    //   451: aload_0
    //   452: astore_3
    //   453: aload_0
    //   454: astore 5
    //   456: aload 6
    //   458: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   461: sipush 200
    //   464: if_icmpne +140 -> 604
    //   467: aload 6
    //   469: astore 4
    //   471: aload_0
    //   472: astore_3
    //   473: aload_0
    //   474: astore 5
    //   476: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   479: ldc_w 268
    //   482: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   485: iconst_0
    //   486: istore_2
    //   487: aload_0
    //   488: ifnull +7 -> 495
    //   491: aload_0
    //   492: invokevirtual 271	java/io/OutputStream:close	()V
    //   495: aload 6
    //   497: ifnull +8 -> 505
    //   500: aload 6
    //   502: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   505: iload_2
    //   506: ireturn
    //   507: astore_1
    //   508: aconst_null
    //   509: astore_0
    //   510: aload_0
    //   511: astore 4
    //   513: aload 5
    //   515: astore_3
    //   516: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   519: ldc_w 276
    //   522: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   525: aload_0
    //   526: astore 4
    //   528: aload 5
    //   530: astore_3
    //   531: aload_1
    //   532: invokevirtual 279	java/lang/Exception:printStackTrace	()V
    //   535: aload 5
    //   537: ifnull +8 -> 545
    //   540: aload 5
    //   542: invokevirtual 271	java/io/OutputStream:close	()V
    //   545: aload_0
    //   546: ifnull +56 -> 602
    //   549: aload_0
    //   550: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   553: iconst_m1
    //   554: ireturn
    //   555: astore_0
    //   556: aconst_null
    //   557: astore 4
    //   559: aload_3
    //   560: ifnull +7 -> 567
    //   563: aload_3
    //   564: invokevirtual 271	java/io/OutputStream:close	()V
    //   567: aload 4
    //   569: ifnull +8 -> 577
    //   572: aload 4
    //   574: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   577: aload_0
    //   578: athrow
    //   579: astore_0
    //   580: goto -85 -> 495
    //   583: astore_1
    //   584: goto -39 -> 545
    //   587: astore_1
    //   588: goto -21 -> 567
    //   591: astore_0
    //   592: goto -33 -> 559
    //   595: astore_1
    //   596: aload 6
    //   598: astore_0
    //   599: goto -89 -> 510
    //   602: iconst_m1
    //   603: ireturn
    //   604: iconst_m1
    //   605: istore_2
    //   606: goto -119 -> 487
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	609	0	paramString1	String
    //   0	609	1	paramString2	String
    //   0	609	2	paramInt	int
    //   1	563	3	localObject1	Object
    //   56	517	4	localObject2	Object
    //   9	532	5	localObject3	Object
    //   52	545	6	localHttpURLConnection	java.net.HttpURLConnection
    //   3	326	7	localObject4	Object
    //   6	326	8	localObject5	Object
    //   68	77	9	str	String
    // Exception table:
    //   from	to	target	type
    //   11	54	507	java/lang/Exception
    //   11	54	555	finally
    //   491	495	579	java/io/IOException
    //   540	545	583	java/io/IOException
    //   563	567	587	java/io/IOException
    //   65	70	591	finally
    //   81	129	591	finally
    //   140	149	591	finally
    //   160	169	591	finally
    //   180	189	591	finally
    //   200	208	591	finally
    //   219	227	591	finally
    //   238	245	591	finally
    //   256	261	591	finally
    //   272	284	591	finally
    //   295	324	591	finally
    //   335	341	591	finally
    //   350	355	591	finally
    //   364	369	591	finally
    //   378	408	591	finally
    //   417	447	591	finally
    //   456	467	591	finally
    //   476	485	591	finally
    //   516	525	591	finally
    //   531	535	591	finally
    //   65	70	595	java/lang/Exception
    //   81	129	595	java/lang/Exception
    //   140	149	595	java/lang/Exception
    //   160	169	595	java/lang/Exception
    //   180	189	595	java/lang/Exception
    //   200	208	595	java/lang/Exception
    //   219	227	595	java/lang/Exception
    //   238	245	595	java/lang/Exception
    //   256	261	595	java/lang/Exception
    //   272	284	595	java/lang/Exception
    //   295	324	595	java/lang/Exception
    //   335	341	595	java/lang/Exception
    //   350	355	595	java/lang/Exception
    //   364	369	595	java/lang/Exception
    //   378	408	595	java/lang/Exception
    //   417	447	595	java/lang/Exception
    //   456	467	595	java/lang/Exception
    //   476	485	595	java/lang/Exception
  }
  
  private static String b(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new SecretKeySpec(paramString1.getBytes("UTF-8"), "HmacSHA1");
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(paramString1);
      paramString1 = Base64.encodeToString(localMac.doFinal(paramString2.getBytes("UTF-8")), 0).trim();
      return paramString1;
    }
    catch (Exception paramString1) {}
    return "";
  }
  
  /* Error */
  private static int[] b(String paramString)
  {
    // Byte code:
    //   0: iconst_2
    //   1: newarray <illegal type>
    //   3: astore_3
    //   4: aload_3
    //   5: iconst_0
    //   6: iconst_2
    //   7: iastore
    //   8: new 162	java/net/URL
    //   11: dup
    //   12: new 65	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   19: ldc -92
    //   21: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: aload_0
    //   25: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokespecial 170	java/net/URL:<init>	(Ljava/lang/String;)V
    //   34: invokevirtual 174	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   37: checkcast 176	java/net/HttpURLConnection
    //   40: astore_2
    //   41: aload_2
    //   42: astore_1
    //   43: invokestatic 178	com/android/dazhihui/d/aq:a	()Ljava/lang/String;
    //   46: astore 4
    //   48: aload_2
    //   49: astore_1
    //   50: aload_2
    //   51: ldc -76
    //   53: ldc_w 316
    //   56: ldc -72
    //   58: ldc -72
    //   60: aload 4
    //   62: ldc -72
    //   64: new 65	java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   71: ldc -68
    //   73: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_0
    //   77: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokestatic 190	com/android/dazhihui/d/aq:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload_2
    //   90: astore_1
    //   91: aload_2
    //   92: ldc -60
    //   94: aload 4
    //   96: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: aload_2
    //   100: astore_1
    //   101: aload_2
    //   102: ldc -58
    //   104: ldc -56
    //   106: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: aload_2
    //   110: astore_1
    //   111: aload_2
    //   112: sipush 10000
    //   115: invokevirtual 206	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   118: aload_2
    //   119: astore_1
    //   120: aload_2
    //   121: sipush 10000
    //   124: invokevirtual 209	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   127: aload_2
    //   128: astore_1
    //   129: aload_2
    //   130: ldc_w 316
    //   133: invokevirtual 212	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   136: aload_2
    //   137: astore_1
    //   138: aload_2
    //   139: invokevirtual 255	java/net/HttpURLConnection:connect	()V
    //   142: aload_2
    //   143: astore_1
    //   144: aload_2
    //   145: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   148: sipush 200
    //   151: if_icmpne +113 -> 264
    //   154: ldc_w 318
    //   157: astore_0
    //   158: aload_2
    //   159: astore_1
    //   160: aload_2
    //   161: invokevirtual 266	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   164: ldc -38
    //   166: invokeinterface 324 2 0
    //   171: ifeq +30 -> 201
    //   174: aload_2
    //   175: astore_1
    //   176: aload_2
    //   177: invokevirtual 266	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   180: ldc -38
    //   182: invokeinterface 328 2 0
    //   187: checkcast 330	java/util/List
    //   190: invokeinterface 334 1 0
    //   195: iconst_0
    //   196: aaload
    //   197: invokevirtual 335	java/lang/Object:toString	()Ljava/lang/String;
    //   200: astore_0
    //   201: aload_2
    //   202: astore_1
    //   203: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   206: new 65	java/lang/StringBuilder
    //   209: dup
    //   210: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   213: ldc_w 337
    //   216: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: aload_0
    //   220: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   229: aload_3
    //   230: iconst_0
    //   231: iconst_0
    //   232: iastore
    //   233: aload_2
    //   234: astore_1
    //   235: aload_3
    //   236: iconst_1
    //   237: aload_0
    //   238: invokestatic 343	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   241: iastore
    //   242: iconst_0
    //   243: ifeq +11 -> 254
    //   246: new 345	java/lang/NullPointerException
    //   249: dup
    //   250: invokespecial 346	java/lang/NullPointerException:<init>	()V
    //   253: athrow
    //   254: aload_2
    //   255: ifnull +7 -> 262
    //   258: aload_2
    //   259: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   262: aload_3
    //   263: areturn
    //   264: aload_2
    //   265: astore_1
    //   266: aload_2
    //   267: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   270: sipush 404
    //   273: if_icmpne -31 -> 242
    //   276: aload_3
    //   277: iconst_0
    //   278: iconst_1
    //   279: iastore
    //   280: goto -38 -> 242
    //   283: astore_1
    //   284: aload_2
    //   285: astore_0
    //   286: aload_1
    //   287: astore_2
    //   288: aload_0
    //   289: astore_1
    //   290: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   293: ldc_w 348
    //   296: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   299: aload_0
    //   300: astore_1
    //   301: aload_2
    //   302: invokevirtual 279	java/lang/Exception:printStackTrace	()V
    //   305: aload_3
    //   306: iconst_0
    //   307: iconst_2
    //   308: iastore
    //   309: iconst_0
    //   310: ifeq +11 -> 321
    //   313: new 345	java/lang/NullPointerException
    //   316: dup
    //   317: invokespecial 346	java/lang/NullPointerException:<init>	()V
    //   320: athrow
    //   321: aload_0
    //   322: ifnull -60 -> 262
    //   325: aload_0
    //   326: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   329: aload_3
    //   330: areturn
    //   331: astore_0
    //   332: aconst_null
    //   333: astore_1
    //   334: iconst_0
    //   335: ifeq +11 -> 346
    //   338: new 345	java/lang/NullPointerException
    //   341: dup
    //   342: invokespecial 346	java/lang/NullPointerException:<init>	()V
    //   345: athrow
    //   346: aload_1
    //   347: ifnull +7 -> 354
    //   350: aload_1
    //   351: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   354: aload_0
    //   355: athrow
    //   356: astore_0
    //   357: goto -103 -> 254
    //   360: astore_1
    //   361: goto -40 -> 321
    //   364: astore_2
    //   365: goto -19 -> 346
    //   368: astore_0
    //   369: goto -35 -> 334
    //   372: astore_2
    //   373: aconst_null
    //   374: astore_0
    //   375: goto -87 -> 288
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	paramString	String
    //   42	224	1	localObject1	Object
    //   283	4	1	localException1	Exception
    //   289	62	1	str1	String
    //   360	1	1	localIOException1	java.io.IOException
    //   40	262	2	localObject2	Object
    //   364	1	2	localIOException2	java.io.IOException
    //   372	1	2	localException2	Exception
    //   3	327	3	arrayOfInt	int[]
    //   46	49	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   43	48	283	java/lang/Exception
    //   50	89	283	java/lang/Exception
    //   91	99	283	java/lang/Exception
    //   101	109	283	java/lang/Exception
    //   111	118	283	java/lang/Exception
    //   120	127	283	java/lang/Exception
    //   129	136	283	java/lang/Exception
    //   138	142	283	java/lang/Exception
    //   144	154	283	java/lang/Exception
    //   160	174	283	java/lang/Exception
    //   176	201	283	java/lang/Exception
    //   203	229	283	java/lang/Exception
    //   235	242	283	java/lang/Exception
    //   266	276	283	java/lang/Exception
    //   8	41	331	finally
    //   246	254	356	java/io/IOException
    //   313	321	360	java/io/IOException
    //   338	346	364	java/io/IOException
    //   43	48	368	finally
    //   50	89	368	finally
    //   91	99	368	finally
    //   101	109	368	finally
    //   111	118	368	finally
    //   120	127	368	finally
    //   129	136	368	finally
    //   138	142	368	finally
    //   144	154	368	finally
    //   160	174	368	finally
    //   176	201	368	finally
    //   203	229	368	finally
    //   235	242	368	finally
    //   266	276	368	finally
    //   290	299	368	finally
    //   301	305	368	finally
    //   8	41	372	java/lang/Exception
  }
  
  /* Error */
  private static int c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 6
    //   5: aconst_null
    //   6: astore 7
    //   8: aconst_null
    //   9: astore 4
    //   11: new 162	java/net/URL
    //   14: dup
    //   15: new 65	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   22: ldc_w 350
    //   25: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_1
    //   29: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokespecial 170	java/net/URL:<init>	(Ljava/lang/String;)V
    //   38: invokevirtual 174	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   41: checkcast 176	java/net/HttpURLConnection
    //   44: astore 5
    //   46: aload 5
    //   48: astore_3
    //   49: aload 6
    //   51: astore_2
    //   52: aload 7
    //   54: astore 4
    //   56: invokestatic 178	com/android/dazhihui/d/aq:a	()Ljava/lang/String;
    //   59: astore 8
    //   61: aload 5
    //   63: astore_3
    //   64: aload 6
    //   66: astore_2
    //   67: aload 7
    //   69: astore 4
    //   71: aload 5
    //   73: ldc -76
    //   75: ldc_w 352
    //   78: ldc -72
    //   80: ldc -70
    //   82: aload 8
    //   84: ldc -72
    //   86: new 65	java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   93: ldc_w 354
    //   96: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload_1
    //   100: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 190	com/android/dazhihui/d/aq:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   109: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload 5
    //   114: astore_3
    //   115: aload 6
    //   117: astore_2
    //   118: aload 7
    //   120: astore 4
    //   122: aload 5
    //   124: ldc -60
    //   126: aload 8
    //   128: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aload 5
    //   133: astore_3
    //   134: aload 6
    //   136: astore_2
    //   137: aload 7
    //   139: astore 4
    //   141: aload 5
    //   143: ldc -58
    //   145: ldc_w 356
    //   148: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload 5
    //   153: astore_3
    //   154: aload 6
    //   156: astore_2
    //   157: aload 7
    //   159: astore 4
    //   161: aload 5
    //   163: ldc -54
    //   165: ldc -70
    //   167: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: aload 5
    //   172: astore_3
    //   173: aload 6
    //   175: astore_2
    //   176: aload 7
    //   178: astore 4
    //   180: aload 5
    //   182: sipush 10000
    //   185: invokevirtual 206	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   188: aload 5
    //   190: astore_3
    //   191: aload 6
    //   193: astore_2
    //   194: aload 7
    //   196: astore 4
    //   198: aload 5
    //   200: sipush 10000
    //   203: invokevirtual 209	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   206: aload 5
    //   208: astore_3
    //   209: aload 6
    //   211: astore_2
    //   212: aload 7
    //   214: astore 4
    //   216: aload 5
    //   218: ldc_w 352
    //   221: invokevirtual 212	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   224: aload 5
    //   226: astore_3
    //   227: aload 6
    //   229: astore_2
    //   230: aload 7
    //   232: astore 4
    //   234: aload_0
    //   235: invokevirtual 216	java/lang/String:getBytes	()[B
    //   238: astore_1
    //   239: aload 5
    //   241: astore_3
    //   242: aload 6
    //   244: astore_2
    //   245: aload 7
    //   247: astore 4
    //   249: aload 5
    //   251: ldc -38
    //   253: aload_1
    //   254: arraylength
    //   255: invokestatic 222	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   258: invokevirtual 194	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload 5
    //   263: astore_3
    //   264: aload 6
    //   266: astore_2
    //   267: aload 7
    //   269: astore 4
    //   271: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   274: new 65	java/lang/StringBuilder
    //   277: dup
    //   278: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   281: ldc -26
    //   283: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: aload 5
    //   288: invokevirtual 234	java/net/HttpURLConnection:getRequestProperties	()Ljava/util/Map;
    //   291: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   300: aload 5
    //   302: astore_3
    //   303: aload 6
    //   305: astore_2
    //   306: aload 7
    //   308: astore 4
    //   310: aload 5
    //   312: invokevirtual 246	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   315: astore_0
    //   316: aload 5
    //   318: astore_3
    //   319: aload_0
    //   320: astore_2
    //   321: aload_0
    //   322: astore 4
    //   324: aload_0
    //   325: aload_1
    //   326: invokevirtual 252	java/io/OutputStream:write	([B)V
    //   329: aload 5
    //   331: astore_3
    //   332: aload_0
    //   333: astore_2
    //   334: aload_0
    //   335: astore 4
    //   337: aload 5
    //   339: invokevirtual 255	java/net/HttpURLConnection:connect	()V
    //   342: aload 5
    //   344: astore_3
    //   345: aload_0
    //   346: astore_2
    //   347: aload_0
    //   348: astore 4
    //   350: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   353: new 65	java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   360: ldc_w 257
    //   363: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload 5
    //   368: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   371: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   374: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   377: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   380: aload 5
    //   382: astore_3
    //   383: aload_0
    //   384: astore_2
    //   385: aload_0
    //   386: astore 4
    //   388: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   391: new 65	java/lang/StringBuilder
    //   394: dup
    //   395: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   398: ldc_w 263
    //   401: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: aload 5
    //   406: invokevirtual 266	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   409: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   412: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   418: aload 5
    //   420: astore_3
    //   421: aload_0
    //   422: astore_2
    //   423: aload_0
    //   424: astore 4
    //   426: aload 5
    //   428: invokevirtual 261	java/net/HttpURLConnection:getResponseCode	()I
    //   431: sipush 200
    //   434: if_icmpne +136 -> 570
    //   437: aload 5
    //   439: astore_3
    //   440: aload_0
    //   441: astore_2
    //   442: aload_0
    //   443: astore 4
    //   445: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   448: ldc_w 268
    //   451: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   454: iconst_0
    //   455: istore 9
    //   457: aload_0
    //   458: ifnull +7 -> 465
    //   461: aload_0
    //   462: invokevirtual 271	java/io/OutputStream:close	()V
    //   465: aload 5
    //   467: ifnull +8 -> 475
    //   470: aload 5
    //   472: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   475: iload 9
    //   477: ireturn
    //   478: astore_1
    //   479: aconst_null
    //   480: astore_0
    //   481: aload_0
    //   482: astore_3
    //   483: aload 4
    //   485: astore_2
    //   486: getstatic 228	java/lang/System:out	Ljava/io/PrintStream;
    //   489: ldc_w 358
    //   492: invokevirtual 242	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   495: aload_0
    //   496: astore_3
    //   497: aload 4
    //   499: astore_2
    //   500: aload_1
    //   501: invokevirtual 279	java/lang/Exception:printStackTrace	()V
    //   504: aload 4
    //   506: ifnull +8 -> 514
    //   509: aload 4
    //   511: invokevirtual 271	java/io/OutputStream:close	()V
    //   514: aload_0
    //   515: ifnull +53 -> 568
    //   518: aload_0
    //   519: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   522: iconst_m1
    //   523: ireturn
    //   524: astore_0
    //   525: aconst_null
    //   526: astore_3
    //   527: aload_2
    //   528: ifnull +7 -> 535
    //   531: aload_2
    //   532: invokevirtual 271	java/io/OutputStream:close	()V
    //   535: aload_3
    //   536: ifnull +7 -> 543
    //   539: aload_3
    //   540: invokevirtual 274	java/net/HttpURLConnection:disconnect	()V
    //   543: aload_0
    //   544: athrow
    //   545: astore_0
    //   546: goto -81 -> 465
    //   549: astore_1
    //   550: goto -36 -> 514
    //   553: astore_1
    //   554: goto -19 -> 535
    //   557: astore_0
    //   558: goto -31 -> 527
    //   561: astore_1
    //   562: aload 5
    //   564: astore_0
    //   565: goto -84 -> 481
    //   568: iconst_m1
    //   569: ireturn
    //   570: iconst_m1
    //   571: istore 9
    //   573: goto -116 -> 457
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	576	0	paramString1	String
    //   0	576	1	paramString2	String
    //   1	531	2	localObject1	Object
    //   48	492	3	localObject2	Object
    //   9	501	4	localObject3	Object
    //   44	519	5	localHttpURLConnection	java.net.HttpURLConnection
    //   3	301	6	localObject4	Object
    //   6	301	7	localObject5	Object
    //   59	68	8	str	String
    //   455	117	9	i	int
    // Exception table:
    //   from	to	target	type
    //   11	46	478	java/lang/Exception
    //   11	46	524	finally
    //   461	465	545	java/io/IOException
    //   509	514	549	java/io/IOException
    //   531	535	553	java/io/IOException
    //   56	61	557	finally
    //   71	112	557	finally
    //   122	131	557	finally
    //   141	151	557	finally
    //   161	170	557	finally
    //   180	188	557	finally
    //   198	206	557	finally
    //   216	224	557	finally
    //   234	239	557	finally
    //   249	261	557	finally
    //   271	300	557	finally
    //   310	316	557	finally
    //   324	329	557	finally
    //   337	342	557	finally
    //   350	380	557	finally
    //   388	418	557	finally
    //   426	437	557	finally
    //   445	454	557	finally
    //   486	495	557	finally
    //   500	504	557	finally
    //   56	61	561	java/lang/Exception
    //   71	112	561	java/lang/Exception
    //   122	131	561	java/lang/Exception
    //   141	151	561	java/lang/Exception
    //   161	170	561	java/lang/Exception
    //   180	188	561	java/lang/Exception
    //   198	206	561	java/lang/Exception
    //   216	224	561	java/lang/Exception
    //   234	239	561	java/lang/Exception
    //   249	261	561	java/lang/Exception
    //   271	300	561	java/lang/Exception
    //   310	316	561	java/lang/Exception
    //   324	329	561	java/lang/Exception
    //   337	342	561	java/lang/Exception
    //   350	380	561	java/lang/Exception
    //   388	418	561	java/lang/Exception
    //   426	437	561	java/lang/Exception
    //   445	454	561	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */