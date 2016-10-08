package com.iflytek.thirdparty;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  public static boolean a = false;
  private static String b = "lxd";
  private static int c = 1;
  private static boolean d = true;
  private static boolean e = false;
  private static boolean f = true;
  private static int g = 1;
  private static int h = 0;
  private static final String i = "act" + b;
  private static final String j = "evn" + b;
  private static final String k = "esp" + b;
  private static final String l = "err" + b;
  private static final String m = "sys" + b;
  private static String n = "";
  private static long o = 0L;
  private static String p = "";
  private static Object q = new Object();
  private static Object r = new Object();
  private static Object s = new Object();
  private static boolean t = false;
  private static boolean u = false;
  private static String v = "";
  private static ExecutorService w = Executors.newSingleThreadExecutor();
  
  /* Error */
  private static int a(Context paramContext, String paramString, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 14
    //   3: iconst_0
    //   4: istore 15
    //   6: iconst_0
    //   7: istore 16
    //   9: iconst_0
    //   10: istore 11
    //   12: iconst_0
    //   13: istore 17
    //   15: iconst_0
    //   16: istore 18
    //   18: iconst_0
    //   19: istore 19
    //   21: iconst_0
    //   22: istore 12
    //   24: iconst_2
    //   25: istore 13
    //   27: getstatic 43	com/iflytek/thirdparty/b:c	I
    //   30: iconst_1
    //   31: if_icmpeq +5 -> 36
    //   34: iconst_2
    //   35: ireturn
    //   36: ldc -127
    //   38: new 55	java/lang/StringBuilder
    //   41: dup
    //   42: ldc -125
    //   44: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: aload_1
    //   48: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc -123
    //   53: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_0
    //   57: invokevirtual 137	java/lang/Object:getClass	()Ljava/lang/Class;
    //   60: invokevirtual 142	java/lang/Class:getName	()Ljava/lang/String;
    //   63: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc -112
    //   68: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload_2
    //   72: invokevirtual 147	org/json/JSONObject:toString	()Ljava/lang/String;
    //   75: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: aconst_null
    //   85: astore 5
    //   87: aconst_null
    //   88: astore 6
    //   90: aconst_null
    //   91: astore 7
    //   93: aconst_null
    //   94: astore 8
    //   96: aconst_null
    //   97: astore 4
    //   99: aload 8
    //   101: astore_3
    //   102: aload_0
    //   103: invokestatic 157	com/iflytek/thirdparty/h:h	(Landroid/content/Context;)Ljava/lang/String;
    //   106: astore 9
    //   108: aload 8
    //   110: astore_3
    //   111: aload_0
    //   112: invokestatic 159	com/iflytek/thirdparty/h:i	(Landroid/content/Context;)Ljava/lang/String;
    //   115: ldc -95
    //   117: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   120: astore 10
    //   122: aload 8
    //   124: astore_3
    //   125: new 55	java/lang/StringBuilder
    //   128: dup
    //   129: aload_1
    //   130: invokestatic 173	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   133: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   136: ldc -81
    //   138: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 9
    //   143: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: ldc -79
    //   148: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 10
    //   153: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc -77
    //   158: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: bipush 106
    //   163: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: astore_1
    //   170: aload 8
    //   172: astore_3
    //   173: ldc -127
    //   175: aload_2
    //   176: invokevirtual 147	org/json/JSONObject:toString	()Ljava/lang/String;
    //   179: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: aload 8
    //   184: astore_3
    //   185: ldc -127
    //   187: ldc -72
    //   189: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: aload 8
    //   194: astore_3
    //   195: new 186	java/net/URL
    //   198: dup
    //   199: aload_1
    //   200: invokespecial 187	java/net/URL:<init>	(Ljava/lang/String;)V
    //   203: invokevirtual 191	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   206: checkcast 193	java/net/HttpURLConnection
    //   209: astore_1
    //   210: iload 11
    //   212: istore 12
    //   214: iload 17
    //   216: istore 14
    //   218: iload 18
    //   220: istore 15
    //   222: iload 19
    //   224: istore 16
    //   226: aload_1
    //   227: sipush 10000
    //   230: invokevirtual 197	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   233: iload 11
    //   235: istore 12
    //   237: iload 17
    //   239: istore 14
    //   241: iload 18
    //   243: istore 15
    //   245: iload 19
    //   247: istore 16
    //   249: aload_1
    //   250: iconst_1
    //   251: invokevirtual 201	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   254: iload 11
    //   256: istore 12
    //   258: iload 17
    //   260: istore 14
    //   262: iload 18
    //   264: istore 15
    //   266: iload 19
    //   268: istore 16
    //   270: aload_1
    //   271: iconst_1
    //   272: invokevirtual 204	java/net/HttpURLConnection:setDoInput	(Z)V
    //   275: iload 11
    //   277: istore 12
    //   279: iload 17
    //   281: istore 14
    //   283: iload 18
    //   285: istore 15
    //   287: iload 19
    //   289: istore 16
    //   291: aload_1
    //   292: iconst_0
    //   293: invokevirtual 207	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   296: iload 11
    //   298: istore 12
    //   300: iload 17
    //   302: istore 14
    //   304: iload 18
    //   306: istore 15
    //   308: iload 19
    //   310: istore 16
    //   312: aload_1
    //   313: ldc -47
    //   315: invokevirtual 212	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   318: iload 11
    //   320: istore 12
    //   322: iload 17
    //   324: istore 14
    //   326: iload 18
    //   328: istore 15
    //   330: iload 19
    //   332: istore 16
    //   334: invokestatic 217	com/iflytek/thirdparty/g:a	()Lcom/iflytek/thirdparty/g;
    //   337: aload_2
    //   338: invokevirtual 147	org/json/JSONObject:toString	()Ljava/lang/String;
    //   341: invokevirtual 220	com/iflytek/thirdparty/g:a	(Ljava/lang/String;)[B
    //   344: astore_3
    //   345: iload 11
    //   347: istore 12
    //   349: iload 17
    //   351: istore 14
    //   353: iload 18
    //   355: istore 15
    //   357: iload 19
    //   359: istore 16
    //   361: aload_1
    //   362: ldc -34
    //   364: new 55	java/lang/StringBuilder
    //   367: dup
    //   368: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   371: aload_3
    //   372: arraylength
    //   373: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   376: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: invokevirtual 226	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   382: iload 11
    //   384: istore 12
    //   386: iload 17
    //   388: istore 14
    //   390: iload 18
    //   392: istore 15
    //   394: iload 19
    //   396: istore 16
    //   398: aload_1
    //   399: ldc -28
    //   401: ldc -26
    //   403: invokevirtual 226	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   406: iload 11
    //   408: istore 12
    //   410: iload 17
    //   412: istore 14
    //   414: iload 18
    //   416: istore 15
    //   418: iload 19
    //   420: istore 16
    //   422: aload_1
    //   423: ldc -24
    //   425: ldc -95
    //   427: invokevirtual 226	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   430: iload 11
    //   432: istore 12
    //   434: iload 17
    //   436: istore 14
    //   438: iload 18
    //   440: istore 15
    //   442: iload 19
    //   444: istore 16
    //   446: aload_1
    //   447: invokevirtual 236	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   450: astore 4
    //   452: iload 11
    //   454: istore 12
    //   456: iload 17
    //   458: istore 14
    //   460: iload 18
    //   462: istore 15
    //   464: iload 19
    //   466: istore 16
    //   468: aload 4
    //   470: aload_3
    //   471: invokevirtual 242	java/io/OutputStream:write	([B)V
    //   474: iload 11
    //   476: istore 12
    //   478: iload 17
    //   480: istore 14
    //   482: iload 18
    //   484: istore 15
    //   486: iload 19
    //   488: istore 16
    //   490: aload 4
    //   492: invokevirtual 245	java/io/OutputStream:close	()V
    //   495: iload 11
    //   497: istore 12
    //   499: iload 17
    //   501: istore 14
    //   503: iload 18
    //   505: istore 15
    //   507: iload 19
    //   509: istore 16
    //   511: aload_1
    //   512: invokevirtual 249	java/net/HttpURLConnection:getResponseCode	()I
    //   515: istore 11
    //   517: iload 11
    //   519: istore 12
    //   521: iload 11
    //   523: istore 14
    //   525: iload 11
    //   527: istore 15
    //   529: iload 11
    //   531: istore 16
    //   533: ldc -127
    //   535: ldc -5
    //   537: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   540: iload 13
    //   542: istore 14
    //   544: sipush 200
    //   547: iload 11
    //   549: if_icmpne +25 -> 574
    //   552: iload 11
    //   554: istore 14
    //   556: iload 11
    //   558: istore 15
    //   560: iload 11
    //   562: istore 16
    //   564: ldc -3
    //   566: ldc -1
    //   568: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   571: iconst_1
    //   572: istore 14
    //   574: iload 14
    //   576: istore 13
    //   578: iload 11
    //   580: istore 12
    //   582: aload_1
    //   583: ifnull +15 -> 598
    //   586: aload_1
    //   587: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   590: iload 11
    //   592: istore 12
    //   594: iload 14
    //   596: istore 13
    //   598: iload 12
    //   600: istore 11
    //   602: iload 13
    //   604: istore 12
    //   606: ldc_w 260
    //   609: new 55	java/lang/StringBuilder
    //   612: dup
    //   613: ldc_w 262
    //   616: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   619: iload 11
    //   621: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   624: ldc_w 264
    //   627: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   630: iload 12
    //   632: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   635: ldc_w 266
    //   638: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: aload_2
    //   642: ldc_w 268
    //   645: invokevirtual 272	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   648: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   651: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   654: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   657: ldc -127
    //   659: new 55	java/lang/StringBuilder
    //   662: dup
    //   663: ldc_w 274
    //   666: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   669: aload_0
    //   670: invokevirtual 137	java/lang/Object:getClass	()Ljava/lang/Class;
    //   673: invokevirtual 142	java/lang/Class:getName	()Ljava/lang/String;
    //   676: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: ldc_w 276
    //   682: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: iload 12
    //   687: invokevirtual 182	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   690: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   693: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   696: iload 12
    //   698: ireturn
    //   699: astore_3
    //   700: iload 12
    //   702: istore 11
    //   704: aload 4
    //   706: astore_1
    //   707: aload_3
    //   708: astore 4
    //   710: aload_1
    //   711: astore_3
    //   712: ldc -127
    //   714: aload 4
    //   716: invokevirtual 277	org/apache/http/client/ClientProtocolException:toString	()Ljava/lang/String;
    //   719: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   722: aload_1
    //   723: astore_3
    //   724: aload 4
    //   726: invokevirtual 280	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   729: iload 11
    //   731: istore 12
    //   733: aload_1
    //   734: ifnull -136 -> 598
    //   737: aload_1
    //   738: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   741: iconst_2
    //   742: istore 12
    //   744: goto -138 -> 606
    //   747: astore 4
    //   749: iload 14
    //   751: istore 11
    //   753: aload 5
    //   755: astore_1
    //   756: aload_1
    //   757: astore_3
    //   758: ldc -127
    //   760: aload 4
    //   762: invokevirtual 281	java/io/IOException:toString	()Ljava/lang/String;
    //   765: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   768: aload_1
    //   769: astore_3
    //   770: aload 4
    //   772: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   775: iload 11
    //   777: istore 12
    //   779: aload_1
    //   780: ifnull -182 -> 598
    //   783: aload_1
    //   784: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   787: iconst_2
    //   788: istore 12
    //   790: goto -184 -> 606
    //   793: astore 4
    //   795: iload 15
    //   797: istore 11
    //   799: aload 6
    //   801: astore_1
    //   802: aload_1
    //   803: astore_3
    //   804: ldc -127
    //   806: aload 4
    //   808: invokevirtual 283	org/json/JSONException:toString	()Ljava/lang/String;
    //   811: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   814: aload_1
    //   815: astore_3
    //   816: aload 4
    //   818: invokevirtual 284	org/json/JSONException:printStackTrace	()V
    //   821: iconst_3
    //   822: istore 13
    //   824: iload 11
    //   826: istore 12
    //   828: aload_1
    //   829: ifnull -231 -> 598
    //   832: aload_1
    //   833: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   836: iconst_3
    //   837: istore 12
    //   839: goto -233 -> 606
    //   842: astore 4
    //   844: iload 16
    //   846: istore 11
    //   848: aload 7
    //   850: astore_1
    //   851: iload 13
    //   853: istore 14
    //   855: aload_1
    //   856: astore_3
    //   857: ldc -127
    //   859: aload 4
    //   861: invokevirtual 285	java/lang/Exception:toString	()Ljava/lang/String;
    //   864: invokestatic 152	com/iflytek/thirdparty/c:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   867: aload_1
    //   868: astore_3
    //   869: aload 4
    //   871: invokevirtual 286	java/lang/Exception:printStackTrace	()V
    //   874: iload 14
    //   876: istore 13
    //   878: iload 11
    //   880: istore 12
    //   882: aload_1
    //   883: ifnull -285 -> 598
    //   886: aload_1
    //   887: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   890: iload 14
    //   892: istore 12
    //   894: goto -288 -> 606
    //   897: astore_0
    //   898: aload_3
    //   899: astore_1
    //   900: aload_1
    //   901: ifnull +7 -> 908
    //   904: aload_1
    //   905: invokevirtual 258	java/net/HttpURLConnection:disconnect	()V
    //   908: aload_0
    //   909: athrow
    //   910: astore_1
    //   911: goto -254 -> 657
    //   914: astore_0
    //   915: goto -15 -> 900
    //   918: astore 4
    //   920: iload 13
    //   922: istore 14
    //   924: iload 12
    //   926: istore 11
    //   928: goto -73 -> 855
    //   931: astore 4
    //   933: iconst_1
    //   934: istore 14
    //   936: goto -81 -> 855
    //   939: astore 4
    //   941: iload 14
    //   943: istore 11
    //   945: goto -143 -> 802
    //   948: astore 4
    //   950: iload 15
    //   952: istore 11
    //   954: goto -198 -> 756
    //   957: astore 4
    //   959: iload 16
    //   961: istore 11
    //   963: goto -253 -> 710
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	966	0	paramContext	Context
    //   0	966	1	paramString	String
    //   0	966	2	paramJSONObject	JSONObject
    //   101	370	3	localObject1	Object
    //   699	9	3	localClientProtocolException1	org.apache.http.client.ClientProtocolException
    //   711	188	3	str1	String
    //   97	628	4	localObject2	Object
    //   747	24	4	localIOException1	java.io.IOException
    //   793	24	4	localJSONException1	JSONException
    //   842	28	4	localException1	Exception
    //   918	1	4	localException2	Exception
    //   931	1	4	localException3	Exception
    //   939	1	4	localJSONException2	JSONException
    //   948	1	4	localIOException2	java.io.IOException
    //   957	1	4	localClientProtocolException2	org.apache.http.client.ClientProtocolException
    //   85	669	5	localObject3	Object
    //   88	712	6	localObject4	Object
    //   91	758	7	localObject5	Object
    //   94	99	8	localObject6	Object
    //   106	36	9	str2	String
    //   120	32	10	str3	String
    //   10	952	11	i1	int
    //   22	903	12	i2	int
    //   25	896	13	i3	int
    //   1	941	14	i4	int
    //   4	947	15	i5	int
    //   7	953	16	i6	int
    //   13	487	17	i7	int
    //   16	488	18	i8	int
    //   19	489	19	i9	int
    // Exception table:
    //   from	to	target	type
    //   102	108	699	org/apache/http/client/ClientProtocolException
    //   111	122	699	org/apache/http/client/ClientProtocolException
    //   125	170	699	org/apache/http/client/ClientProtocolException
    //   173	182	699	org/apache/http/client/ClientProtocolException
    //   185	192	699	org/apache/http/client/ClientProtocolException
    //   195	210	699	org/apache/http/client/ClientProtocolException
    //   102	108	747	java/io/IOException
    //   111	122	747	java/io/IOException
    //   125	170	747	java/io/IOException
    //   173	182	747	java/io/IOException
    //   185	192	747	java/io/IOException
    //   195	210	747	java/io/IOException
    //   102	108	793	org/json/JSONException
    //   111	122	793	org/json/JSONException
    //   125	170	793	org/json/JSONException
    //   173	182	793	org/json/JSONException
    //   185	192	793	org/json/JSONException
    //   195	210	793	org/json/JSONException
    //   102	108	842	java/lang/Exception
    //   111	122	842	java/lang/Exception
    //   125	170	842	java/lang/Exception
    //   173	182	842	java/lang/Exception
    //   185	192	842	java/lang/Exception
    //   195	210	842	java/lang/Exception
    //   102	108	897	finally
    //   111	122	897	finally
    //   125	170	897	finally
    //   173	182	897	finally
    //   185	192	897	finally
    //   195	210	897	finally
    //   712	722	897	finally
    //   724	729	897	finally
    //   758	768	897	finally
    //   770	775	897	finally
    //   804	814	897	finally
    //   816	821	897	finally
    //   857	867	897	finally
    //   869	874	897	finally
    //   606	657	910	java/lang/Exception
    //   226	233	914	finally
    //   249	254	914	finally
    //   270	275	914	finally
    //   291	296	914	finally
    //   312	318	914	finally
    //   334	345	914	finally
    //   361	382	914	finally
    //   398	406	914	finally
    //   422	430	914	finally
    //   446	452	914	finally
    //   468	474	914	finally
    //   490	495	914	finally
    //   511	517	914	finally
    //   533	540	914	finally
    //   564	571	914	finally
    //   226	233	918	java/lang/Exception
    //   249	254	918	java/lang/Exception
    //   270	275	918	java/lang/Exception
    //   291	296	918	java/lang/Exception
    //   312	318	918	java/lang/Exception
    //   334	345	918	java/lang/Exception
    //   361	382	918	java/lang/Exception
    //   398	406	918	java/lang/Exception
    //   422	430	918	java/lang/Exception
    //   446	452	918	java/lang/Exception
    //   468	474	918	java/lang/Exception
    //   490	495	918	java/lang/Exception
    //   511	517	918	java/lang/Exception
    //   533	540	918	java/lang/Exception
    //   564	571	931	java/lang/Exception
    //   226	233	939	org/json/JSONException
    //   249	254	939	org/json/JSONException
    //   270	275	939	org/json/JSONException
    //   291	296	939	org/json/JSONException
    //   312	318	939	org/json/JSONException
    //   334	345	939	org/json/JSONException
    //   361	382	939	org/json/JSONException
    //   398	406	939	org/json/JSONException
    //   422	430	939	org/json/JSONException
    //   446	452	939	org/json/JSONException
    //   468	474	939	org/json/JSONException
    //   490	495	939	org/json/JSONException
    //   511	517	939	org/json/JSONException
    //   533	540	939	org/json/JSONException
    //   564	571	939	org/json/JSONException
    //   226	233	948	java/io/IOException
    //   249	254	948	java/io/IOException
    //   270	275	948	java/io/IOException
    //   291	296	948	java/io/IOException
    //   312	318	948	java/io/IOException
    //   334	345	948	java/io/IOException
    //   361	382	948	java/io/IOException
    //   398	406	948	java/io/IOException
    //   422	430	948	java/io/IOException
    //   446	452	948	java/io/IOException
    //   468	474	948	java/io/IOException
    //   490	495	948	java/io/IOException
    //   511	517	948	java/io/IOException
    //   533	540	948	java/io/IOException
    //   564	571	948	java/io/IOException
    //   226	233	957	org/apache/http/client/ClientProtocolException
    //   249	254	957	org/apache/http/client/ClientProtocolException
    //   270	275	957	org/apache/http/client/ClientProtocolException
    //   291	296	957	org/apache/http/client/ClientProtocolException
    //   312	318	957	org/apache/http/client/ClientProtocolException
    //   334	345	957	org/apache/http/client/ClientProtocolException
    //   361	382	957	org/apache/http/client/ClientProtocolException
    //   398	406	957	org/apache/http/client/ClientProtocolException
    //   422	430	957	org/apache/http/client/ClientProtocolException
    //   446	452	957	org/apache/http/client/ClientProtocolException
    //   468	474	957	org/apache/http/client/ClientProtocolException
    //   490	495	957	org/apache/http/client/ClientProtocolException
    //   511	517	957	org/apache/http/client/ClientProtocolException
    //   533	540	957	org/apache/http/client/ClientProtocolException
    //   564	571	957	org/apache/http/client/ClientProtocolException
  }
  
  protected static SharedPreferences a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return paramContext.getSharedPreferences(b + "MoblieAgent_event_" + str, 0);
  }
  
  private static String a(Context paramContext, String paramString, SharedPreferences paramSharedPreferences)
  {
    long l2 = 0L;
    n = "";
    String str = h.a(paramContext, paramString);
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    localEditor.putString("appKey", paramString);
    localEditor.putString("sessionId", str);
    localEditor.putLong("lastResumeTime", System.currentTimeMillis());
    localEditor.putString("activities", i(paramContext, "onResume", null));
    long l1 = paramSharedPreferences.getLong("readFlowRev", 0L);
    paramContext = h.o(paramContext);
    localEditor.putLong("readFlowRev", paramContext[0]);
    long l3 = paramContext[0] - l1;
    l1 = l3;
    if (l3 < 0L) {
      l1 = 0L;
    }
    localEditor.putLong("consumeFlowRev", l1);
    l1 = paramSharedPreferences.getLong("readFlowSnd", 0L);
    localEditor.putLong("readFlowSnd", paramContext[1]);
    l1 = paramContext[1] - l1;
    if (l1 < 0L) {
      l1 = l2;
    }
    for (;;)
    {
      localEditor.putLong("consumeFlowSnd", l1);
      localEditor.commit();
      p = str;
      return str;
    }
  }
  
  private static void a(Context paramContext, String paramString, long paramLong)
  {
    synchronized (q)
    {
      SharedPreferences localSharedPreferences = c(paramContext);
      int i1 = localSharedPreferences.getInt("uploadcount", 0);
      paramString = localSharedPreferences.getString("uploadList", "") + paramString + "|";
      long l1 = paramLong;
      if (paramLong > 10000L) {
        l1 = 1L;
      }
      localSharedPreferences.edit().putString("uploadList", paramString).commit();
      localSharedPreferences.edit().putLong("uploadpopindex", l1).commit();
      if (paramString.split("\\|").length > 30000)
      {
        paramString = n(paramContext);
        paramContext.deleteFile(paramString);
        j(paramContext, paramString);
        return;
      }
      localSharedPreferences.edit().putInt("uploadcount", i1 + 1).commit();
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    if (c == 0)
    {
      Log.i("MobileAgent", "Du have not permission to collect data");
      return;
    }
    if (paramString1.contains("#"))
    {
      Log.w("MobileAgent", "the eventId contain illegal char");
      return;
    }
    h(paramContext, paramString1, paramString2);
  }
  
  protected static void a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      c.a("MobileAgentRun", "run into pageact onresumep");
      h(paramContext);
    }
    for (;;)
    {
      c.a("MobileAgentRun", "run out pageact");
      return;
      c.a("MobileAgentRun", "run into pageact onpausep");
      i(paramContext);
    }
  }
  
  protected static boolean a(Context paramContext, int paramInt)
  {
    paramContext = k(paramContext);
    int i1;
    if (paramInt == 3)
    {
      paramInt = paramContext.getInt("actionmonth", 0);
      i1 = paramContext.getInt("actionday", 0);
    }
    for (;;)
    {
      paramContext = new Date();
      String str = new SimpleDateFormat("dd").format(paramContext);
      if ((Integer.valueOf(new SimpleDateFormat("M").format(paramContext)).intValue() == paramInt) && (Integer.valueOf(str).intValue() == i1)) {
        break;
      }
      return true;
      if (paramInt == 2)
      {
        paramInt = paramContext.getInt("eventmonth", 0);
        i1 = paramContext.getInt("eventday", 0);
      }
      else
      {
        paramInt = paramContext.getInt("sysmonth", 0);
        i1 = paramContext.getInt("sysday", 0);
      }
    }
    return false;
  }
  
  private static boolean a(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = a(paramContext);
    String str1 = paramSharedPreferences.getString("eventlogs", "");
    if (!str1.equals(""))
    {
      String str2 = l(paramContext).getString("sessionId", null);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("sid", str2);
        localJSONObject.put("logJsonAry", str1);
        if (a(paramContext, localJSONObject.toString(), 2)) {
          paramSharedPreferences.edit().putString("eventlogs", "").commit();
        }
        return true;
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          paramContext.printStackTrace();
        }
      }
    }
    return false;
  }
  
  private static boolean a(Context paramContext, SharedPreferences paramSharedPreferences, boolean paramBoolean)
  {
    String str1 = paramSharedPreferences.getString("sessionId", "");
    String str2 = paramSharedPreferences.getString("activities", "");
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("sid", str1);
      localJSONObject.put("logs", str2);
      if (paramBoolean)
      {
        localJSONObject.put("flowConsumpRev", paramSharedPreferences.getLong("consumeFlowRev", 0L));
        localJSONObject.put("flowConsumpSnd", paramSharedPreferences.getLong("consumeFlowSnd", 0L));
      }
      while (a(paramContext, localJSONObject.toString(), 3))
      {
        paramSharedPreferences.edit().putString("activities", "").commit();
        break;
        localJSONObject.put("flowConsumpRev", 0);
        localJSONObject.put("flowConsumpSnd", 0);
      }
      return true;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  /* Error */
  protected static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: aload_1
    //   5: invokestatic 502	com/iflytek/thirdparty/b:h	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   8: astore_2
    //   9: aload_2
    //   10: ldc 89
    //   12: invokevirtual 472	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   15: ifne +378 -> 393
    //   18: aload_0
    //   19: invokestatic 505	com/iflytek/thirdparty/b:d	(Landroid/content/Context;)Lorg/json/JSONObject;
    //   22: astore_3
    //   23: new 146	org/json/JSONObject
    //   26: dup
    //   27: aload_2
    //   28: invokespecial 506	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   31: astore 4
    //   33: aload_3
    //   34: ldc_w 477
    //   37: aload 4
    //   39: ldc_w 477
    //   42: invokevirtual 510	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   45: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   48: pop
    //   49: aload_3
    //   50: ldc_w 512
    //   53: aload_0
    //   54: invokestatic 514	com/iflytek/thirdparty/h:g	(Landroid/content/Context;)Ljava/lang/String;
    //   57: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   60: pop
    //   61: aload_3
    //   62: ldc_w 516
    //   65: invokestatic 518	com/iflytek/thirdparty/h:a	()Ljava/lang/String;
    //   68: ldc -95
    //   70: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   76: pop
    //   77: aload_3
    //   78: ldc_w 520
    //   81: invokestatic 522	com/iflytek/thirdparty/h:b	()Ljava/lang/String;
    //   84: ldc -95
    //   86: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   89: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   92: pop
    //   93: aload_3
    //   94: ldc_w 524
    //   97: invokestatic 526	com/iflytek/thirdparty/h:c	()Ljava/lang/String;
    //   100: ldc -95
    //   102: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   105: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   108: pop
    //   109: aload_3
    //   110: ldc_w 528
    //   113: aload_0
    //   114: invokestatic 530	com/iflytek/thirdparty/h:l	(Landroid/content/Context;)Ljava/lang/String;
    //   117: ldc -95
    //   119: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   122: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   125: pop
    //   126: aload_3
    //   127: ldc_w 532
    //   130: aload_0
    //   131: invokestatic 534	com/iflytek/thirdparty/h:p	(Landroid/content/Context;)Ljava/lang/String;
    //   134: ldc -95
    //   136: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   142: pop
    //   143: aload_3
    //   144: ldc_w 536
    //   147: getstatic 109	com/iflytek/thirdparty/b:v	Ljava/lang/String;
    //   150: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   153: pop
    //   154: aload_3
    //   155: ldc_w 538
    //   158: aload_0
    //   159: invokestatic 540	com/iflytek/thirdparty/h:a	(Landroid/content/Context;)Ljava/lang/String;
    //   162: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   165: pop
    //   166: aload_3
    //   167: ldc_w 542
    //   170: invokestatic 544	com/iflytek/thirdparty/h:f	()Ljava/lang/String;
    //   173: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   176: pop
    //   177: aload_3
    //   178: ldc_w 546
    //   181: invokestatic 548	com/iflytek/thirdparty/h:g	()Ljava/lang/String;
    //   184: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   187: pop
    //   188: aload_3
    //   189: ldc_w 550
    //   192: invokestatic 552	com/iflytek/thirdparty/h:h	()Ljava/lang/String;
    //   195: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   198: pop
    //   199: aload_3
    //   200: ldc_w 268
    //   203: new 554	org/json/JSONArray
    //   206: dup
    //   207: new 55	java/lang/StringBuilder
    //   210: dup
    //   211: ldc_w 556
    //   214: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   217: aload_2
    //   218: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: ldc_w 558
    //   224: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokespecial 559	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   233: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   236: pop
    //   237: aload_0
    //   238: ldc_w 561
    //   241: aload_3
    //   242: invokestatic 563	com/iflytek/thirdparty/b:a	(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)I
    //   245: istore 5
    //   247: iload 5
    //   249: iconst_1
    //   250: if_icmpeq +9 -> 259
    //   253: iload 5
    //   255: iconst_3
    //   256: if_icmpne +129 -> 385
    //   259: aload_0
    //   260: iconst_3
    //   261: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   264: aload_0
    //   265: aload_1
    //   266: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   269: ldc -3
    //   271: ldc_w 570
    //   274: invokestatic 402	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   277: pop
    //   278: iconst_1
    //   279: istore 6
    //   281: iload 6
    //   283: ireturn
    //   284: astore 4
    //   286: aload_3
    //   287: ldc_w 477
    //   290: ldc 89
    //   292: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   295: pop
    //   296: goto -247 -> 49
    //   299: astore_2
    //   300: aload_2
    //   301: invokevirtual 284	org/json/JSONException:printStackTrace	()V
    //   304: iconst_3
    //   305: istore 5
    //   307: goto -60 -> 247
    //   310: astore 4
    //   312: aload_3
    //   313: ldc_w 516
    //   316: ldc 89
    //   318: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   321: pop
    //   322: goto -245 -> 77
    //   325: astore 4
    //   327: aload_3
    //   328: ldc_w 520
    //   331: ldc 89
    //   333: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   336: pop
    //   337: goto -244 -> 93
    //   340: astore 4
    //   342: aload_3
    //   343: ldc_w 524
    //   346: ldc 89
    //   348: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   351: pop
    //   352: goto -243 -> 109
    //   355: astore 4
    //   357: aload_3
    //   358: ldc_w 528
    //   361: ldc 89
    //   363: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   366: pop
    //   367: goto -241 -> 126
    //   370: astore 4
    //   372: aload_3
    //   373: ldc_w 532
    //   376: ldc 89
    //   378: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   381: pop
    //   382: goto -239 -> 143
    //   385: iload 5
    //   387: iconst_2
    //   388: if_icmpne -107 -> 281
    //   391: iconst_0
    //   392: ireturn
    //   393: aload_0
    //   394: iconst_3
    //   395: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   398: aload_0
    //   399: aload_1
    //   400: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   403: iconst_1
    //   404: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	405	0	paramContext	Context
    //   0	405	1	paramString	String
    //   8	210	2	str	String
    //   299	2	2	localJSONException1	JSONException
    //   22	351	3	localJSONObject1	JSONObject
    //   31	7	4	localJSONObject2	JSONObject
    //   284	1	4	localJSONException2	JSONException
    //   310	1	4	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   325	1	4	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   340	1	4	localUnsupportedEncodingException3	UnsupportedEncodingException
    //   355	1	4	localUnsupportedEncodingException4	UnsupportedEncodingException
    //   370	1	4	localUnsupportedEncodingException5	UnsupportedEncodingException
    //   245	144	5	i1	int
    //   1	281	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   33	49	284	org/json/JSONException
    //   23	33	299	org/json/JSONException
    //   49	61	299	org/json/JSONException
    //   61	77	299	org/json/JSONException
    //   77	93	299	org/json/JSONException
    //   93	109	299	org/json/JSONException
    //   109	126	299	org/json/JSONException
    //   126	143	299	org/json/JSONException
    //   143	247	299	org/json/JSONException
    //   286	296	299	org/json/JSONException
    //   312	322	299	org/json/JSONException
    //   327	337	299	org/json/JSONException
    //   342	352	299	org/json/JSONException
    //   357	367	299	org/json/JSONException
    //   372	382	299	org/json/JSONException
    //   61	77	310	java/io/UnsupportedEncodingException
    //   77	93	325	java/io/UnsupportedEncodingException
    //   93	109	340	java/io/UnsupportedEncodingException
    //   109	126	355	java/io/UnsupportedEncodingException
    //   126	143	370	java/io/UnsupportedEncodingException
  }
  
  /* Error */
  private static boolean a(Context paramContext, String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 10
    //   3: ldc 2
    //   5: monitorenter
    //   6: iload_2
    //   7: iconst_3
    //   8: if_icmpne +116 -> 124
    //   11: getstatic 71	com/iflytek/thirdparty/b:i	Ljava/lang/String;
    //   14: astore_3
    //   15: iload 10
    //   17: istore 9
    //   19: aload_1
    //   20: invokevirtual 575	java/lang/String:trim	()Ljava/lang/String;
    //   23: ldc 89
    //   25: invokevirtual 472	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifne +90 -> 118
    //   31: aload_0
    //   32: invokestatic 578	com/iflytek/thirdparty/b:m	(Landroid/content/Context;)J
    //   35: lstore 7
    //   37: new 55	java/lang/StringBuilder
    //   40: dup
    //   41: aload_3
    //   42: invokestatic 173	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   45: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: lload 7
    //   50: invokevirtual 581	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   53: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: astore 6
    //   58: aconst_null
    //   59: astore_3
    //   60: aconst_null
    //   61: astore 5
    //   63: aload_0
    //   64: aload 6
    //   66: iconst_1
    //   67: invokevirtual 585	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   70: astore 4
    //   72: aload 4
    //   74: astore 5
    //   76: aload 4
    //   78: astore_3
    //   79: aload_0
    //   80: aload 6
    //   82: lconst_1
    //   83: lload 7
    //   85: ladd
    //   86: invokestatic 587	com/iflytek/thirdparty/b:a	(Landroid/content/Context;Ljava/lang/String;J)V
    //   89: aload 4
    //   91: astore 5
    //   93: aload 4
    //   95: astore_3
    //   96: aload 4
    //   98: aload_1
    //   99: invokevirtual 591	java/lang/String:getBytes	()[B
    //   102: invokevirtual 594	java/io/FileOutputStream:write	([B)V
    //   105: aload 4
    //   107: ifnull +8 -> 115
    //   110: aload 4
    //   112: invokevirtual 595	java/io/FileOutputStream:close	()V
    //   115: iconst_1
    //   116: istore 9
    //   118: ldc 2
    //   120: monitorexit
    //   121: iload 9
    //   123: ireturn
    //   124: iload_2
    //   125: iconst_2
    //   126: if_icmpne +10 -> 136
    //   129: getstatic 75	com/iflytek/thirdparty/b:j	Ljava/lang/String;
    //   132: astore_3
    //   133: goto -118 -> 15
    //   136: iload_2
    //   137: iconst_4
    //   138: if_icmpne +10 -> 148
    //   141: getstatic 83	com/iflytek/thirdparty/b:l	Ljava/lang/String;
    //   144: astore_3
    //   145: goto -130 -> 15
    //   148: iload_2
    //   149: iconst_1
    //   150: if_icmpne +10 -> 160
    //   153: getstatic 87	com/iflytek/thirdparty/b:m	Ljava/lang/String;
    //   156: astore_3
    //   157: goto -142 -> 15
    //   160: iload 10
    //   162: istore 9
    //   164: iload_2
    //   165: iconst_5
    //   166: if_icmpne -48 -> 118
    //   169: getstatic 79	com/iflytek/thirdparty/b:k	Ljava/lang/String;
    //   172: astore_3
    //   173: goto -158 -> 15
    //   176: astore_0
    //   177: aconst_null
    //   178: astore_0
    //   179: ldc -127
    //   181: ldc_w 597
    //   184: invokestatic 412	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   187: pop
    //   188: iload 10
    //   190: istore 9
    //   192: aload_0
    //   193: ifnull -75 -> 118
    //   196: aload_0
    //   197: invokevirtual 595	java/io/FileOutputStream:close	()V
    //   200: iload 10
    //   202: istore 9
    //   204: goto -86 -> 118
    //   207: astore_0
    //   208: aload_0
    //   209: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   212: iload 10
    //   214: istore 9
    //   216: goto -98 -> 118
    //   219: astore_0
    //   220: ldc 2
    //   222: monitorexit
    //   223: aload_0
    //   224: athrow
    //   225: astore_0
    //   226: aload 5
    //   228: astore_3
    //   229: ldc -127
    //   231: ldc_w 599
    //   234: invokestatic 412	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   237: pop
    //   238: aload 5
    //   240: ifnull -125 -> 115
    //   243: aload 5
    //   245: invokevirtual 595	java/io/FileOutputStream:close	()V
    //   248: goto -133 -> 115
    //   251: astore_0
    //   252: aload_0
    //   253: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   256: goto -141 -> 115
    //   259: astore_0
    //   260: aload_3
    //   261: ifnull +7 -> 268
    //   264: aload_3
    //   265: invokevirtual 595	java/io/FileOutputStream:close	()V
    //   268: aload_0
    //   269: athrow
    //   270: astore_1
    //   271: aload_1
    //   272: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   275: goto -7 -> 268
    //   278: astore_0
    //   279: aload_0
    //   280: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   283: goto -168 -> 115
    //   286: astore_1
    //   287: aload_0
    //   288: astore_3
    //   289: aload_1
    //   290: astore_0
    //   291: goto -31 -> 260
    //   294: astore_0
    //   295: aload 4
    //   297: astore_0
    //   298: goto -119 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	301	0	paramContext	Context
    //   0	301	1	paramString	String
    //   0	301	2	paramInt	int
    //   14	275	3	localObject1	Object
    //   70	226	4	localFileOutputStream	java.io.FileOutputStream
    //   61	183	5	localObject2	Object
    //   56	25	6	str	String
    //   35	49	7	l1	long
    //   17	198	9	bool1	boolean
    //   1	212	10	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   63	72	176	java/io/FileNotFoundException
    //   196	200	207	java/io/IOException
    //   11	15	219	finally
    //   19	58	219	finally
    //   110	115	219	finally
    //   129	133	219	finally
    //   141	145	219	finally
    //   153	157	219	finally
    //   169	173	219	finally
    //   196	200	219	finally
    //   208	212	219	finally
    //   243	248	219	finally
    //   252	256	219	finally
    //   264	268	219	finally
    //   268	270	219	finally
    //   271	275	219	finally
    //   279	283	219	finally
    //   63	72	225	java/io/IOException
    //   79	89	225	java/io/IOException
    //   96	105	225	java/io/IOException
    //   243	248	251	java/io/IOException
    //   63	72	259	finally
    //   79	89	259	finally
    //   96	105	259	finally
    //   229	238	259	finally
    //   264	268	270	java/io/IOException
    //   110	115	278	java/io/IOException
    //   179	188	286	finally
    //   79	89	294	java/io/FileNotFoundException
    //   96	105	294	java/io/FileNotFoundException
  }
  
  private static boolean a(SharedPreferences paramSharedPreferences)
  {
    long l1 = paramSharedPreferences.getLong("endTime", -1L);
    return System.currentTimeMillis() - l1 > 30000L;
  }
  
  protected static SharedPreferences b(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return paramContext.getSharedPreferences(b + "MoblieAgent_event_sp" + str, 0);
  }
  
  protected static void b(Context paramContext, int paramInt)
  {
    Date localDate = new Date();
    int i1 = Integer.parseInt(new SimpleDateFormat("dd").format(localDate));
    int i2 = Integer.parseInt(new SimpleDateFormat("M").format(localDate));
    paramContext = k(paramContext).edit();
    if (paramInt == 3)
    {
      paramContext.putInt("actionmonth", i2);
      paramContext.putInt("actionday", i1);
    }
    for (;;)
    {
      paramContext.commit();
      return;
      if (paramInt == 2)
      {
        paramContext.putInt("eventmonth", i2);
        paramContext.putInt("eventday", i1);
      }
      else
      {
        paramContext.putInt("sysmonth", i2);
        paramContext.putInt("sysday", i1);
      }
    }
  }
  
  protected static void b(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (r)
    {
      paramString1 = h.a(paramString1);
      paramString2 = h.a(paramString2);
      SharedPreferences localSharedPreferences = a(paramContext);
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(localSharedPreferences.getString("eventlogs", ""));
      try
      {
        localStringBuffer.append(URLEncoder.encode(paramString1, "UTF-8"));
        localStringBuffer.append("|");
        localStringBuffer.append(URLEncoder.encode(paramString2, "UTF-8"));
        localStringBuffer.append("|");
        localStringBuffer.append(1);
        localStringBuffer.append("|");
        localStringBuffer.append(System.currentTimeMillis());
        localStringBuffer.append("\n");
        localSharedPreferences.edit().putString("eventlogs", localStringBuffer.toString()).commit();
        a(paramContext, null);
        b(paramContext, false);
        return;
      }
      catch (UnsupportedEncodingException paramContext)
      {
        c.a("MobileAgentRun", "unsupport utf-8,can't onEvent()");
        return;
      }
    }
  }
  
  protected static void b(Context paramContext, boolean paramBoolean)
  {
    if (c != 1) {
      return;
    }
    c.a("MobileAgentRun", "run into strategy");
    f(paramContext);
    if ((!e) || ((e) && (o(paramContext)))) {
      switch (g)
      {
      }
    }
    for (;;)
    {
      f = false;
      c.a("MobileAgentRun", "run out strategy");
      return;
      new d(paramContext, 6).start();
      continue;
      if (paramBoolean)
      {
        new d(paramContext, 6).start();
        f = false;
        continue;
        if (a(paramContext, 3)) {
          new d(paramContext, 6).start();
        }
      }
    }
  }
  
  private static boolean b(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = b(paramContext);
    String str1 = paramSharedPreferences.getString("eventlogs", "");
    if (!str1.equals(""))
    {
      String str2 = l(paramContext).getString("sessionId", null);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("sid", str2);
        localJSONObject.put("logJsonAry", str1);
        if (a(paramContext, localJSONObject.toString(), 5)) {
          paramSharedPreferences.edit().putString("eventlogs", "").commit();
        }
        return true;
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          paramContext.printStackTrace();
        }
      }
    }
    return false;
  }
  
  protected static boolean b(Context paramContext, String paramString)
  {
    String str = h(paramContext, paramString);
    try
    {
      if (a(paramContext, "http://da.mmarket.com/mmsdk/mmsdk?func=mmsdk:postsyslog", new JSONObject(str)) == 1)
      {
        i(paramContext, paramString);
        return true;
      }
    }
    catch (JSONException localJSONException)
    {
      i(paramContext, paramString);
      Log.i("MobileAgent", "SDK del a dirty data");
    }
    return false;
  }
  
  protected static SharedPreferences c(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return paramContext.getSharedPreferences(b + "MoblieAgent_upload_" + str, 0);
  }
  
  protected static void c(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (s)
    {
      paramString1 = h.a(paramString1);
      paramString2 = h.a(paramString2);
      SharedPreferences localSharedPreferences = b(paramContext);
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(localSharedPreferences.getString("eventlogs", ""));
      try
      {
        localStringBuffer.append(URLEncoder.encode(paramString1, "UTF-8"));
        localStringBuffer.append("|");
        localStringBuffer.append(URLEncoder.encode(paramString2, "UTF-8"));
        localStringBuffer.append("|");
        localStringBuffer.append(1);
        localStringBuffer.append("|");
        localStringBuffer.append(System.currentTimeMillis());
        localStringBuffer.append("\n");
        localSharedPreferences.edit().putString("eventlogs", localStringBuffer.toString()).commit();
        if ((g == 1) || (localStringBuffer.toString().getBytes().length > 10000)) {
          b(paramContext, null);
        }
        b(paramContext, false);
        return;
      }
      catch (UnsupportedEncodingException paramContext)
      {
        c.a("MobileAgent", "unsupport utf-8,can't onEvent()");
        return;
      }
    }
  }
  
  protected static boolean c(Context paramContext, String paramString)
  {
    boolean bool = false;
    String str = h(paramContext, paramString);
    try
    {
      JSONObject localJSONObject = new JSONObject(str);
      localJSONObject.put("pid", 1);
      localJSONObject.put("protocolVersion", "3.1.4");
      localJSONObject.put("sdkVersion", "3.2.0.2");
      localJSONObject.put("cid", h.b(paramContext));
      localJSONObject.put("deviceId", h.a(paramContext));
      localJSONObject.put("appKey", h.h(paramContext));
      localJSONObject.put("packageName", h.j(paramContext));
      localJSONObject.put("versionCode", h.m(paramContext));
      localJSONObject.put("versionName", h.n(paramContext));
      localJSONObject.put("sendTime", System.currentTimeMillis());
      int i1 = a(paramContext, "http://da.mmarket.com/mmsdk/mmsdk?func=mmsdk:posterrlog", localJSONObject);
      if ((i1 == 1) || (i1 == 3))
      {
        b(paramContext, 3);
        i(paramContext, paramString);
        Log.i("MobileAgent", "erLog sd");
        c.a("MobileAgent", "send errlog success \n" + str);
        bool = true;
      }
      while (i1 != 2) {
        return bool;
      }
      return false;
    }
    catch (JSONException localJSONException)
    {
      i(paramContext, paramString);
      Log.i("MobileAgent", "SDK del a dirty data");
    }
    return false;
  }
  
  protected static JSONObject d(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("pid", 1);
      localJSONObject.put("protocolVersion", "3.1.4");
      localJSONObject.put("sdkVersion", "3.2.0.2");
      localJSONObject.put("cid", h.b(paramContext));
      localJSONObject.put("appKey", h.h(paramContext));
      localJSONObject.put("packageName", paramContext.getPackageName());
      localJSONObject.put("versionCode", h.m(paramContext));
      localJSONObject.put("versionName", h.n(paramContext));
      localJSONObject.put("sendTime", System.currentTimeMillis());
      localJSONObject.put("deviceId", h.a(paramContext));
      localJSONObject.put("channel", h.i(paramContext));
      return localJSONObject;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return localJSONObject;
  }
  
  protected static void d(Context paramContext, String paramString)
  {
    k(paramContext).edit().putString(paramString, "record").commit();
  }
  
  public static void d(Context paramContext, String paramString1, String paramString2)
  {
    if (t)
    {
      Log.i("MobileAgent", "already init");
      return;
    }
    for (;;)
    {
      try
      {
        if (!a)
        {
          if (!paramContext.getSharedPreferences("MoblieAgent_debug", 0).getString("debug", "").equals("")) {
            continue;
          }
          bool = false;
          a = bool;
        }
      }
      catch (Exception localException)
      {
        boolean bool;
        String str;
        continue;
      }
      c.a("MobileAgentAPI", "run in init[" + paramString1 + "," + paramString2 + "]");
      if (paramContext != null) {
        continue;
      }
      Log.e("MobileAgent", "Exception occurent in joinDu ,context cann't be null");
      return;
      bool = true;
    }
    if ((TextUtils.isEmpty(paramString1)) || (h.a(paramString1, 50)))
    {
      Log.e("MobileAgent", "Exception occurent in joinDu ,appID cann't be null or empty");
      return;
    }
    if (TextUtils.isEmpty(paramString2)) {
      str = "0";
    }
    for (;;)
    {
      paramString2 = paramContext.getSharedPreferences(b + "MoblieAgent_sys_config", 0);
      paramString2.edit().putString("MOBILE_APPKEY", paramString1).commit();
      paramString2.edit().putString("MOBILE_CHANNEL", str).commit();
      if (!e(paramContext, "#lxapkmd5")) {
        new Thread(new f(paramContext)).start();
      }
      t = true;
      Log.i("MobileAgent", "finish init SUCCESS " + a);
      return;
      str = paramString2;
      if (h.a(paramString2, 100))
      {
        str = paramString2.substring(0, 99);
        Log.e("MobileAgent", "Exception occurent in joinDu ,channelID cann't be null or empty");
      }
    }
  }
  
  protected static void e(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("pid", 1);
      localJSONObject.put("protocolVersion", "3.1.4");
      localJSONObject.put("sdkVersion", "3.2.0.2");
      localJSONObject.put("cid", h.b(paramContext));
      localJSONObject.put("deviceId", h.a(paramContext));
      localJSONObject.put("appKey", h.h(paramContext));
      localJSONObject.put("packageName", paramContext.getPackageName());
      localJSONObject.put("versionCode", h.m(paramContext));
      localJSONObject.put("versionName", h.n(paramContext));
      localJSONObject.put("sendTime", System.currentTimeMillis());
      localJSONObject.put("imsi", h.c(paramContext));
      localJSONObject.put("mac", h.g(paramContext));
      localJSONObject.put("deviceDetail", URLEncoder.encode(h.a(), "UTF-8"));
      localJSONObject.put("manufacturer", URLEncoder.encode(h.b(), "UTF-8"));
      localJSONObject.put("phoneOS", URLEncoder.encode(h.c(), "UTF-8"));
      localJSONObject.put("screenWidth", h.d(paramContext));
      localJSONObject.put("screenHeight", h.e(paramContext));
      localJSONObject.put("screenDensity", h.f(paramContext));
      localJSONObject.put("carrierName", URLEncoder.encode(h.k(paramContext), "UTF-8"));
      localJSONObject.put("accessPoint", h.l(paramContext));
      localJSONObject.put("countryCode", h.d());
      localJSONObject.put("languageCode", h.e());
      localJSONObject.put("channel", URLEncoder.encode(h.i(paramContext), "UTF-8"));
      if (a(paramContext, localJSONObject.toString(), 1)) {
        b(paramContext, 1);
      }
      return;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (UnsupportedEncodingException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  protected static boolean e(Context paramContext, String paramString)
  {
    return !k(paramContext).getString(paramString, "").equals("");
  }
  
  /* Error */
  protected static boolean e(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +405 -> 406
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic 502	com/iflytek/thirdparty/b:h	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 89
    //   13: invokevirtual 472	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   16: ifne +370 -> 386
    //   19: new 146	org/json/JSONObject
    //   22: dup
    //   23: aload_3
    //   24: invokespecial 506	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   27: astore_3
    //   28: aload_0
    //   29: invokestatic 677	com/iflytek/thirdparty/h:b	(Landroid/content/Context;)Ljava/lang/String;
    //   32: astore 4
    //   34: aload_3
    //   35: ldc_w 665
    //   38: iconst_1
    //   39: invokevirtual 497	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   42: pop
    //   43: aload_3
    //   44: ldc_w 667
    //   47: ldc_w 669
    //   50: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   53: pop
    //   54: aload_3
    //   55: ldc_w 671
    //   58: ldc_w 673
    //   61: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   64: pop
    //   65: aload_3
    //   66: ldc_w 675
    //   69: aload 4
    //   71: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   74: pop
    //   75: aload_3
    //   76: ldc_w 310
    //   79: aload_0
    //   80: invokestatic 157	com/iflytek/thirdparty/h:h	(Landroid/content/Context;)Ljava/lang/String;
    //   83: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   86: pop
    //   87: aload_3
    //   88: ldc_w 679
    //   91: aload_0
    //   92: invokestatic 681	com/iflytek/thirdparty/h:j	(Landroid/content/Context;)Ljava/lang/String;
    //   95: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: aload_3
    //   100: ldc_w 683
    //   103: aload_0
    //   104: invokestatic 686	com/iflytek/thirdparty/h:m	(Landroid/content/Context;)I
    //   107: invokevirtual 497	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   110: pop
    //   111: aload_3
    //   112: ldc_w 688
    //   115: aload_0
    //   116: invokestatic 689	com/iflytek/thirdparty/h:n	(Landroid/content/Context;)Ljava/lang/String;
    //   119: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   122: pop
    //   123: aload_3
    //   124: ldc_w 691
    //   127: invokestatic 326	java/lang/System:currentTimeMillis	()J
    //   130: invokevirtual 492	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   133: pop
    //   134: aload_3
    //   135: ldc_w 512
    //   138: aload_0
    //   139: invokestatic 514	com/iflytek/thirdparty/h:g	(Landroid/content/Context;)Ljava/lang/String;
    //   142: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   145: pop
    //   146: aload_3
    //   147: ldc_w 516
    //   150: invokestatic 518	com/iflytek/thirdparty/h:a	()Ljava/lang/String;
    //   153: ldc -95
    //   155: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   158: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   161: pop
    //   162: aload_3
    //   163: ldc_w 520
    //   166: invokestatic 522	com/iflytek/thirdparty/h:b	()Ljava/lang/String;
    //   169: ldc -95
    //   171: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   174: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   177: pop
    //   178: aload_3
    //   179: ldc_w 524
    //   182: invokestatic 526	com/iflytek/thirdparty/h:c	()Ljava/lang/String;
    //   185: ldc -95
    //   187: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   190: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   193: pop
    //   194: aload_3
    //   195: ldc_w 528
    //   198: aload_0
    //   199: invokestatic 530	com/iflytek/thirdparty/h:l	(Landroid/content/Context;)Ljava/lang/String;
    //   202: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   205: pop
    //   206: aload_3
    //   207: ldc_w 538
    //   210: aload_0
    //   211: invokestatic 540	com/iflytek/thirdparty/h:a	(Landroid/content/Context;)Ljava/lang/String;
    //   214: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   217: pop
    //   218: aload_3
    //   219: ldc_w 699
    //   222: aload_0
    //   223: invokestatic 159	com/iflytek/thirdparty/h:i	(Landroid/content/Context;)Ljava/lang/String;
    //   226: ldc -95
    //   228: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   231: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   234: pop
    //   235: aload_0
    //   236: ldc_w 794
    //   239: aload_3
    //   240: invokestatic 563	com/iflytek/thirdparty/b:a	(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)I
    //   243: istore 5
    //   245: iload 5
    //   247: iconst_1
    //   248: if_icmpeq +9 -> 257
    //   251: iload 5
    //   253: iconst_3
    //   254: if_icmpne +113 -> 367
    //   257: aload_2
    //   258: ifnonnull +97 -> 355
    //   261: aload_0
    //   262: iconst_3
    //   263: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   266: aload_0
    //   267: aload_1
    //   268: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   271: ldc -3
    //   273: ldc_w 796
    //   276: invokestatic 402	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   279: pop
    //   280: goto +124 -> 404
    //   283: astore 4
    //   285: aload_3
    //   286: ldc_w 516
    //   289: ldc 89
    //   291: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   294: pop
    //   295: goto -133 -> 162
    //   298: astore_2
    //   299: aload_0
    //   300: aload_1
    //   301: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   304: aload_2
    //   305: invokevirtual 284	org/json/JSONException:printStackTrace	()V
    //   308: iconst_1
    //   309: ireturn
    //   310: astore 4
    //   312: aload_3
    //   313: ldc_w 520
    //   316: ldc 89
    //   318: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   321: pop
    //   322: goto -144 -> 178
    //   325: astore 4
    //   327: aload_3
    //   328: ldc_w 524
    //   331: ldc 89
    //   333: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   336: pop
    //   337: goto -143 -> 194
    //   340: astore 4
    //   342: aload_3
    //   343: ldc_w 699
    //   346: ldc 89
    //   348: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   351: pop
    //   352: goto -117 -> 235
    //   355: ldc -3
    //   357: ldc_w 798
    //   360: invokestatic 402	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   363: pop
    //   364: goto +40 -> 404
    //   367: iload 5
    //   369: iconst_2
    //   370: if_icmpne +14 -> 384
    //   373: ldc -3
    //   375: ldc_w 800
    //   378: invokestatic 412	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   381: pop
    //   382: iconst_0
    //   383: ireturn
    //   384: iconst_0
    //   385: ireturn
    //   386: aload_2
    //   387: ifnonnull +15 -> 402
    //   390: aload_0
    //   391: iconst_3
    //   392: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   395: aload_0
    //   396: aload_1
    //   397: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   400: iconst_1
    //   401: ireturn
    //   402: iconst_0
    //   403: ireturn
    //   404: iconst_1
    //   405: ireturn
    //   406: aload_2
    //   407: astore_3
    //   408: goto -398 -> 10
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	411	0	paramContext	Context
    //   0	411	1	paramString1	String
    //   0	411	2	paramString2	String
    //   9	399	3	localObject	Object
    //   32	38	4	str	String
    //   283	1	4	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   310	1	4	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   325	1	4	localUnsupportedEncodingException3	UnsupportedEncodingException
    //   340	1	4	localUnsupportedEncodingException4	UnsupportedEncodingException
    //   243	128	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   146	162	283	java/io/UnsupportedEncodingException
    //   19	146	298	org/json/JSONException
    //   146	162	298	org/json/JSONException
    //   162	178	298	org/json/JSONException
    //   178	194	298	org/json/JSONException
    //   194	218	298	org/json/JSONException
    //   218	235	298	org/json/JSONException
    //   235	245	298	org/json/JSONException
    //   261	280	298	org/json/JSONException
    //   285	295	298	org/json/JSONException
    //   312	322	298	org/json/JSONException
    //   327	337	298	org/json/JSONException
    //   342	352	298	org/json/JSONException
    //   355	364	298	org/json/JSONException
    //   373	382	298	org/json/JSONException
    //   162	178	310	java/io/UnsupportedEncodingException
    //   178	194	325	java/io/UnsupportedEncodingException
    //   218	235	340	java/io/UnsupportedEncodingException
  }
  
  protected static void f(Context paramContext)
  {
    if (f) {
      if (!g(paramContext, "updateonlyonwifi").equals("1")) {
        break label79;
      }
    }
    label79:
    for (e = true;; e = false)
    {
      String str = g(paramContext, "updatedelay");
      if (!str.equals("0")) {
        h = Integer.parseInt(str) * 1000;
      }
      int i1 = Integer.parseInt(g(paramContext, "send_policy"));
      g = i1;
      if (i1 == 0) {
        g = 1;
      }
      return;
    }
  }
  
  protected static void f(Context paramContext, String paramString)
  {
    if (!paramString.trim().equals("")) {}
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      JSONArray localJSONArray = new JSONArray();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("occurtime", System.currentTimeMillis());
      localJSONObject2.put("errmsg", URLEncoder.encode(paramString, "UTF-8"));
      localJSONArray.put(localJSONObject2);
      localJSONObject1.put("sid", p);
      localJSONObject1.put("errjsonary", localJSONArray);
      c.a("MobileAgentRun", "errJso" + localJSONObject1.toString());
      a(paramContext, localJSONObject1.toString(), 4);
      return;
    }
    catch (JSONException paramContext)
    {
      c.a("MobileAgentRun", "json exception,lost catch Exception");
      return;
    }
    catch (UnsupportedEncodingException paramContext)
    {
      c.a("MobileAgentRun", "unsupport utf-8,lost catch Exception");
    }
  }
  
  /* Error */
  protected static boolean f(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +442 -> 443
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic 502	com/iflytek/thirdparty/b:h	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 89
    //   13: invokevirtual 472	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   16: ifne +401 -> 417
    //   19: aload_3
    //   20: ldc_w 828
    //   23: invokevirtual 408	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   26: ifeq +409 -> 435
    //   29: iconst_1
    //   30: istore 5
    //   32: new 146	org/json/JSONObject
    //   35: dup
    //   36: aload_3
    //   37: invokespecial 506	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   40: astore_3
    //   41: aload_0
    //   42: invokestatic 677	com/iflytek/thirdparty/h:b	(Landroid/content/Context;)Ljava/lang/String;
    //   45: astore 4
    //   47: aload_3
    //   48: ldc_w 665
    //   51: iconst_1
    //   52: invokevirtual 497	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_3
    //   57: ldc_w 667
    //   60: ldc_w 669
    //   63: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   66: pop
    //   67: aload_3
    //   68: ldc_w 671
    //   71: ldc_w 673
    //   74: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   77: pop
    //   78: aload_3
    //   79: ldc_w 675
    //   82: aload 4
    //   84: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   87: pop
    //   88: aload_3
    //   89: ldc_w 310
    //   92: aload_0
    //   93: invokestatic 157	com/iflytek/thirdparty/h:h	(Landroid/content/Context;)Ljava/lang/String;
    //   96: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   99: pop
    //   100: aload_3
    //   101: ldc_w 679
    //   104: aload_0
    //   105: invokestatic 681	com/iflytek/thirdparty/h:j	(Landroid/content/Context;)Ljava/lang/String;
    //   108: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   111: pop
    //   112: aload_3
    //   113: ldc_w 683
    //   116: aload_0
    //   117: invokestatic 686	com/iflytek/thirdparty/h:m	(Landroid/content/Context;)I
    //   120: invokevirtual 497	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   123: pop
    //   124: aload_3
    //   125: ldc_w 688
    //   128: aload_0
    //   129: invokestatic 689	com/iflytek/thirdparty/h:n	(Landroid/content/Context;)Ljava/lang/String;
    //   132: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   135: pop
    //   136: aload_3
    //   137: ldc_w 691
    //   140: invokestatic 326	java/lang/System:currentTimeMillis	()J
    //   143: invokevirtual 492	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   146: pop
    //   147: aload_3
    //   148: ldc_w 512
    //   151: aload_0
    //   152: invokestatic 514	com/iflytek/thirdparty/h:g	(Landroid/content/Context;)Ljava/lang/String;
    //   155: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   158: pop
    //   159: aload_3
    //   160: ldc_w 516
    //   163: invokestatic 518	com/iflytek/thirdparty/h:a	()Ljava/lang/String;
    //   166: ldc -95
    //   168: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   174: pop
    //   175: aload_3
    //   176: ldc_w 520
    //   179: invokestatic 522	com/iflytek/thirdparty/h:b	()Ljava/lang/String;
    //   182: ldc -95
    //   184: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   190: pop
    //   191: aload_3
    //   192: ldc_w 524
    //   195: invokestatic 526	com/iflytek/thirdparty/h:c	()Ljava/lang/String;
    //   198: ldc -95
    //   200: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   203: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   206: pop
    //   207: aload_3
    //   208: ldc_w 528
    //   211: aload_0
    //   212: invokestatic 530	com/iflytek/thirdparty/h:l	(Landroid/content/Context;)Ljava/lang/String;
    //   215: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   218: pop
    //   219: aload_3
    //   220: ldc_w 538
    //   223: aload_0
    //   224: invokestatic 540	com/iflytek/thirdparty/h:a	(Landroid/content/Context;)Ljava/lang/String;
    //   227: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   230: pop
    //   231: aload_3
    //   232: ldc_w 699
    //   235: aload_0
    //   236: invokestatic 159	com/iflytek/thirdparty/h:i	(Landroid/content/Context;)Ljava/lang/String;
    //   239: ldc -95
    //   241: invokestatic 167	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   244: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   247: pop
    //   248: aload_0
    //   249: ldc_w 830
    //   252: aload_3
    //   253: invokestatic 563	com/iflytek/thirdparty/b:a	(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)I
    //   256: istore 6
    //   258: iload 6
    //   260: iconst_1
    //   261: if_icmpeq +9 -> 270
    //   264: iload 6
    //   266: iconst_3
    //   267: if_icmpne +131 -> 398
    //   270: aload_2
    //   271: ifnonnull +115 -> 386
    //   274: aload_0
    //   275: iconst_3
    //   276: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   279: aload_0
    //   280: aload_1
    //   281: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   284: ldc -3
    //   286: ldc_w 796
    //   289: invokestatic 402	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   292: pop
    //   293: iload 5
    //   295: ifeq +146 -> 441
    //   298: iload 6
    //   300: iconst_1
    //   301: if_icmpne +140 -> 441
    //   304: aload_0
    //   305: ldc_w 737
    //   308: invokestatic 832	com/iflytek/thirdparty/b:d	(Landroid/content/Context;Ljava/lang/String;)V
    //   311: goto +130 -> 441
    //   314: astore 4
    //   316: aload_3
    //   317: ldc_w 516
    //   320: ldc 89
    //   322: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   325: pop
    //   326: goto -151 -> 175
    //   329: astore_2
    //   330: aload_0
    //   331: aload_1
    //   332: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   335: aload_2
    //   336: invokevirtual 284	org/json/JSONException:printStackTrace	()V
    //   339: iconst_1
    //   340: ireturn
    //   341: astore 4
    //   343: aload_3
    //   344: ldc_w 520
    //   347: ldc 89
    //   349: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   352: pop
    //   353: goto -162 -> 191
    //   356: astore 4
    //   358: aload_3
    //   359: ldc_w 524
    //   362: ldc 89
    //   364: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   367: pop
    //   368: goto -161 -> 207
    //   371: astore 4
    //   373: aload_3
    //   374: ldc_w 699
    //   377: ldc 89
    //   379: invokevirtual 481	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   382: pop
    //   383: goto -135 -> 248
    //   386: ldc -3
    //   388: ldc_w 798
    //   391: invokestatic 402	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   394: pop
    //   395: goto -102 -> 293
    //   398: iload 6
    //   400: iconst_2
    //   401: if_icmpne +14 -> 415
    //   404: ldc -3
    //   406: ldc_w 800
    //   409: invokestatic 412	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   412: pop
    //   413: iconst_0
    //   414: ireturn
    //   415: iconst_0
    //   416: ireturn
    //   417: aload_2
    //   418: ifnonnull +15 -> 433
    //   421: aload_0
    //   422: iconst_3
    //   423: invokestatic 566	com/iflytek/thirdparty/b:b	(Landroid/content/Context;I)V
    //   426: aload_0
    //   427: aload_1
    //   428: invokestatic 568	com/iflytek/thirdparty/b:i	(Landroid/content/Context;Ljava/lang/String;)V
    //   431: iconst_1
    //   432: ireturn
    //   433: iconst_0
    //   434: ireturn
    //   435: iconst_0
    //   436: istore 5
    //   438: goto -406 -> 32
    //   441: iconst_1
    //   442: ireturn
    //   443: aload_2
    //   444: astore_3
    //   445: goto -435 -> 10
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	448	0	paramContext	Context
    //   0	448	1	paramString1	String
    //   0	448	2	paramString2	String
    //   9	436	3	localObject	Object
    //   45	38	4	str	String
    //   314	1	4	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   341	1	4	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   356	1	4	localUnsupportedEncodingException3	UnsupportedEncodingException
    //   371	1	4	localUnsupportedEncodingException4	UnsupportedEncodingException
    //   30	407	5	i1	int
    //   256	146	6	i2	int
    // Exception table:
    //   from	to	target	type
    //   159	175	314	java/io/UnsupportedEncodingException
    //   32	159	329	org/json/JSONException
    //   159	175	329	org/json/JSONException
    //   175	191	329	org/json/JSONException
    //   191	207	329	org/json/JSONException
    //   207	231	329	org/json/JSONException
    //   231	248	329	org/json/JSONException
    //   248	258	329	org/json/JSONException
    //   274	293	329	org/json/JSONException
    //   304	311	329	org/json/JSONException
    //   316	326	329	org/json/JSONException
    //   343	353	329	org/json/JSONException
    //   358	368	329	org/json/JSONException
    //   373	383	329	org/json/JSONException
    //   386	395	329	org/json/JSONException
    //   404	413	329	org/json/JSONException
    //   175	191	341	java/io/UnsupportedEncodingException
    //   191	207	356	java/io/UnsupportedEncodingException
    //   231	248	371	java/io/UnsupportedEncodingException
  }
  
  private static String g(Context paramContext, String paramString)
  {
    return k(paramContext).getString(paramString, "0");
  }
  
  static void g(Context paramContext)
  {
    for (;;)
    {
      try
      {
        c.a("MobileAgentRun", "run into uploadlist :" + paramContext.getClass().getName());
        int i1 = g;
        if (i1 == 2) {}
        try
        {
          Thread.sleep(h);
          bool = true;
          System.currentTimeMillis();
          String str = n(paramContext);
          if ((str.equals("")) || (!bool))
          {
            c.a("MobileAgentRun", " finish uploadlist ");
            c.a("MobileAgentRun", "run out uploadlist :" + paramContext.getClass().getName());
            return;
          }
        }
        catch (InterruptedException localInterruptedException1)
        {
          localInterruptedException1.printStackTrace();
          continue;
        }
        if (!localInterruptedException1.substring(0, 6).equals(i)) {
          break label184;
        }
      }
      finally {}
      boolean bool = a(paramContext, localInterruptedException1);
      label150:
      if (bool) {}
      try
      {
        Thread.sleep(0L);
        c.a("MobileAgentRun", "finish a task : " + localInterruptedException1);
        continue;
        label184:
        if (localInterruptedException1.substring(0, 6).equals(j))
        {
          bool = e(paramContext, localInterruptedException1, null);
          break label150;
        }
        if (localInterruptedException1.substring(0, 6).equals(l))
        {
          bool = c(paramContext, localInterruptedException1);
          break label150;
        }
        if (localInterruptedException1.substring(0, 6).equals(m))
        {
          bool = b(paramContext, localInterruptedException1);
          break label150;
        }
        if (!localInterruptedException1.substring(0, 6).equals(k)) {
          break label150;
        }
        bool = f(paramContext, localInterruptedException1, null);
      }
      catch (InterruptedException localInterruptedException2)
      {
        for (;;)
        {
          localInterruptedException2.printStackTrace();
        }
      }
    }
  }
  
  /* Error */
  private static String h(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: aload_1
    //   5: invokevirtual 861	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   8: astore_1
    //   9: aload_1
    //   10: astore_2
    //   11: sipush 10000
    //   14: newarray <illegal type>
    //   16: astore 4
    //   18: ldc 89
    //   20: astore_0
    //   21: aload_1
    //   22: astore_2
    //   23: aload_1
    //   24: aload 4
    //   26: invokevirtual 867	java/io/FileInputStream:read	([B)I
    //   29: istore 5
    //   31: iload 5
    //   33: iconst_m1
    //   34: if_icmpne +20 -> 54
    //   37: aload_0
    //   38: astore_2
    //   39: aload_1
    //   40: ifnull +9 -> 49
    //   43: aload_1
    //   44: invokevirtual 868	java/io/FileInputStream:close	()V
    //   47: aload_0
    //   48: astore_2
    //   49: ldc 2
    //   51: monitorexit
    //   52: aload_2
    //   53: areturn
    //   54: aload_1
    //   55: astore_2
    //   56: new 55	java/lang/StringBuilder
    //   59: dup
    //   60: aload_0
    //   61: invokestatic 173	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: new 169	java/lang/String
    //   70: dup
    //   71: aload 4
    //   73: iconst_0
    //   74: iload 5
    //   76: invokespecial 871	java/lang/String:<init>	([BII)V
    //   79: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: astore_3
    //   86: aload_3
    //   87: astore_0
    //   88: goto -67 -> 21
    //   91: astore_3
    //   92: aconst_null
    //   93: astore_1
    //   94: ldc 89
    //   96: astore_0
    //   97: aload_1
    //   98: astore_2
    //   99: aload_3
    //   100: invokevirtual 872	java/io/FileNotFoundException:printStackTrace	()V
    //   103: aload_0
    //   104: astore_2
    //   105: aload_1
    //   106: ifnull -57 -> 49
    //   109: aload_1
    //   110: invokevirtual 868	java/io/FileInputStream:close	()V
    //   113: aload_0
    //   114: astore_2
    //   115: goto -66 -> 49
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   123: aload_0
    //   124: astore_2
    //   125: goto -76 -> 49
    //   128: astore_0
    //   129: ldc 2
    //   131: monitorexit
    //   132: aload_0
    //   133: athrow
    //   134: astore_3
    //   135: aconst_null
    //   136: astore_1
    //   137: ldc 89
    //   139: astore_0
    //   140: aload_1
    //   141: astore_2
    //   142: aload_3
    //   143: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   146: aload_0
    //   147: astore_2
    //   148: aload_1
    //   149: ifnull -100 -> 49
    //   152: aload_1
    //   153: invokevirtual 868	java/io/FileInputStream:close	()V
    //   156: aload_0
    //   157: astore_2
    //   158: goto -109 -> 49
    //   161: astore_1
    //   162: aload_1
    //   163: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   166: aload_0
    //   167: astore_2
    //   168: goto -119 -> 49
    //   171: astore_0
    //   172: aconst_null
    //   173: astore_2
    //   174: aload_2
    //   175: ifnull +7 -> 182
    //   178: aload_2
    //   179: invokevirtual 868	java/io/FileInputStream:close	()V
    //   182: aload_0
    //   183: athrow
    //   184: astore_1
    //   185: aload_1
    //   186: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   189: goto -7 -> 182
    //   192: astore_1
    //   193: aload_1
    //   194: invokevirtual 282	java/io/IOException:printStackTrace	()V
    //   197: aload_0
    //   198: astore_2
    //   199: goto -150 -> 49
    //   202: astore_0
    //   203: goto -29 -> 174
    //   206: astore_3
    //   207: ldc 89
    //   209: astore_0
    //   210: goto -70 -> 140
    //   213: astore_3
    //   214: goto -74 -> 140
    //   217: astore_3
    //   218: ldc 89
    //   220: astore_0
    //   221: goto -124 -> 97
    //   224: astore_3
    //   225: goto -128 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	paramContext	Context
    //   0	228	1	paramString	String
    //   10	189	2	localObject	Object
    //   85	2	3	str	String
    //   91	9	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   134	9	3	localIOException1	java.io.IOException
    //   206	1	3	localIOException2	java.io.IOException
    //   213	1	3	localIOException3	java.io.IOException
    //   217	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    //   224	1	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   16	56	4	arrayOfByte	byte[]
    //   29	46	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   3	9	91	java/io/FileNotFoundException
    //   109	113	118	java/io/IOException
    //   43	47	128	finally
    //   109	113	128	finally
    //   119	123	128	finally
    //   152	156	128	finally
    //   162	166	128	finally
    //   178	182	128	finally
    //   182	184	128	finally
    //   185	189	128	finally
    //   193	197	128	finally
    //   3	9	134	java/io/IOException
    //   152	156	161	java/io/IOException
    //   3	9	171	finally
    //   178	182	184	java/io/IOException
    //   43	47	192	java/io/IOException
    //   11	18	202	finally
    //   23	31	202	finally
    //   56	86	202	finally
    //   99	103	202	finally
    //   142	146	202	finally
    //   11	18	206	java/io/IOException
    //   23	31	213	java/io/IOException
    //   56	86	213	java/io/IOException
    //   11	18	217	java/io/FileNotFoundException
    //   23	31	224	java/io/FileNotFoundException
    //   56	86	224	java/io/FileNotFoundException
  }
  
  private static void h(Context paramContext)
  {
    c.a("MobileAgentRun", "run into onresumep :" + paramContext.getClass().getName());
    try
    {
      c.a("page pro", "do resume start: " + paramContext.getClass().getName());
      b(paramContext, j(paramContext));
      c.a("MobileAgentRun", "run out onresume :" + paramContext.getClass().getName());
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  private static void h(Context paramContext, String paramString1, String paramString2)
  {
    c.a("MobileAgentAPI", "run in onEvent [" + paramString1 + "," + paramString2 + "]");
    if (paramContext == null)
    {
      Log.e("MobileAgent", "Exception occurent in onEvent ,context cann't be null");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) || (h.a(paramString1, 100))) {
      Log.e("MobileAgent", "Exception occurent in onEvent ,channelID cann't be empty or length more than 100");
    }
    if (h.a(paramString2, 900)) {
      Log.e("MobileAgent", "Exception occurent in onEvent ,channelID cann't be empty or length more than 100");
    }
    new d(paramContext, 11, paramString1, paramString2).start();
  }
  
  private static String i(Context paramContext, String paramString1, String paramString2)
  {
    long l2 = 0L;
    long l4 = System.currentTimeMillis();
    long l1;
    if (paramString1.equals("onResume"))
    {
      o = l4;
      l1 = l2;
    }
    for (;;)
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "";
      }
      paramString2 = new StringBuffer();
      paramString2.append(str);
      paramString2.append(paramString1);
      paramString2.append("|");
      paramString2.append(paramContext.getClass().getName());
      paramString2.append("|");
      paramString2.append(l4);
      paramString2.append("|");
      paramString2.append(l1);
      paramString2.append("|");
      paramString2.append(n);
      paramString2.append("\n");
      n = paramContext.getClass().getName();
      return paramString2.toString();
      l1 = l2;
      if (paramString1.equals("onPause"))
      {
        l1 = l2;
        if (n.equals(paramContext.getClass().getName()))
        {
          long l3 = l4 - o;
          if (l3 > 12000000L)
          {
            l1 = 300000L;
          }
          else
          {
            l1 = l2;
            if (l3 >= 0L) {
              l1 = l3;
            }
          }
        }
      }
    }
  }
  
  private static void i(Context paramContext)
  {
    c.a("MobileAgentRun", "run into onpausep :" + paramContext.getClass().getName());
    Object localObject = l(paramContext);
    String str = ((SharedPreferences)localObject).getString("activities", null);
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putLong("endTime", System.currentTimeMillis());
    ((SharedPreferences.Editor)localObject).putString("activities", i(paramContext, "onPause", str));
    ((SharedPreferences.Editor)localObject).commit();
    c.a("MobileAgentRun", "run out onpausep :" + paramContext.getClass().getName());
  }
  
  private static void i(Context paramContext, String paramString)
  {
    if (paramString != null)
    {
      paramContext.deleteFile(paramString);
      j(paramContext, paramString);
    }
  }
  
  private static void j(Context paramContext, String paramString)
  {
    synchronized (q)
    {
      paramContext = c(paramContext);
      paramString = paramContext.getString("uploadList", "").replace(paramString + "|", "");
      paramContext.edit().putString("uploadList", paramString).commit();
      return;
    }
  }
  
  private static boolean j(Context paramContext)
  {
    boolean bool2 = true;
    c.a("MobileAgentRun", "run into sessionpolicy");
    String str = h.h(paramContext);
    SharedPreferences localSharedPreferences = l(paramContext);
    Object localObject = localSharedPreferences.getString("sessionId", null);
    if (a(localSharedPreferences))
    {
      if (localObject != null)
      {
        a(paramContext, localSharedPreferences, true);
        localObject = localSharedPreferences.edit();
        long l1 = localSharedPreferences.getLong("readFlowRev", 0L);
        long l2 = localSharedPreferences.getLong("readFlowSnd", 0L);
        ((SharedPreferences.Editor)localObject).clear();
        ((SharedPreferences.Editor)localObject).putLong("readFlowRev", Long.valueOf(l1).longValue()).commit();
        ((SharedPreferences.Editor)localObject).putLong("readFlowSnd", Long.valueOf(l2).longValue()).commit();
      }
      a(paramContext, str, localSharedPreferences);
      a(paramContext, localSharedPreferences, false);
      bool1 = bool2;
      if (a(paramContext, 1)) {
        e(paramContext);
      }
    }
    for (boolean bool1 = bool2;; bool1 = false)
    {
      c.a("MobileAgentRun", "run out sessionpolicy");
      return bool1;
      str = localSharedPreferences.getString("activities", null);
      localObject = localSharedPreferences.edit();
      ((SharedPreferences.Editor)localObject).putString("activities", i(paramContext, "onResume", str));
      ((SharedPreferences.Editor)localObject).putLong("lastResumeTime", System.currentTimeMillis());
      ((SharedPreferences.Editor)localObject).commit();
      if ((g == 1) || (str.getBytes().length > 10000)) {
        a(paramContext, localSharedPreferences, false);
      }
    }
  }
  
  private static SharedPreferences k(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return paramContext.getSharedPreferences(b + "MoblieAgent_config_" + str, 0);
  }
  
  private static SharedPreferences l(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return paramContext.getSharedPreferences(b + "MoblieAgent_state_" + str, 0);
  }
  
  private static long m(Context paramContext)
  {
    try
    {
      long l1 = c(paramContext).getLong("uploadpopindex", 0L);
      return l1;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static String n(Context paramContext)
  {
    Object localObject = q;
    String str1 = "";
    try
    {
      String str2 = c(paramContext).getString("uploadList", "");
      paramContext = str1;
      if (!str2.equals("")) {
        paramContext = str2.substring(0, str2.indexOf("|"));
      }
      return paramContext;
    }
    finally {}
  }
  
  private static boolean o(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getType() == 1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */