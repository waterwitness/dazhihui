package com.android.dazhihui.ui.widget.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public class r
{
  private static r g;
  protected boolean a = false;
  protected Resources b;
  private x c;
  private final Object d = new Object();
  private boolean e = false;
  private boolean f = true;
  
  private r(Context paramContext)
  {
    this.c = new x(paramContext, "DzhCacheData");
    if ((paramContext != null) && (paramContext.getApplicationContext() != null)) {
      this.b = paramContext.getApplicationContext().getResources();
    }
  }
  
  private Bitmap a(byte[] paramArrayOfByte)
  {
    return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static r a(Context paramContext)
  {
    if (g == null) {
      g = new r(paramContext);
    }
    return g;
  }
  
  public static File a(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      return Environment.getExternalStoragePublicDirectory(paramString);
    }
    if ((("mounted".equals(Environment.getExternalStorageState())) || (!b())) && (b(paramContext) != null)) {}
    for (paramContext = b(paramContext).getPath();; paramContext = paramContext.getCacheDir().getPath()) {
      return new File(paramContext + File.separator + paramString);
    }
  }
  
  public static void a(Context paramContext, String paramString, ImageView paramImageView, boolean paramBoolean)
  {
    new t(paramString, paramBoolean, new WeakReference(paramImageView)).execute(new Context[] { paramContext });
  }
  
  private void a(ImageView paramImageView, v paramv)
  {
    if ((this.f) && (paramv.b() == 0))
    {
      paramv = new TransitionDrawable(new Drawable[] { new ColorDrawable(17170445), new BitmapDrawable(this.b, a(paramv.a())) });
      paramImageView.setImageDrawable(paramv);
      paramv.startTransition(200);
      return;
    }
    paramImageView.setImageBitmap(a(paramv.a()));
  }
  
  /* Error */
  public static byte[] a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: ldc -71
    //   9: invokestatic 187	com/android/dazhihui/ui/widget/a/r:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   12: astore_0
    //   13: aload_0
    //   14: invokevirtual 190	java/io/File:exists	()Z
    //   17: ifne +8 -> 25
    //   20: aload_0
    //   21: invokevirtual 193	java/io/File:mkdirs	()Z
    //   24: pop
    //   25: new 93	java/io/File
    //   28: dup
    //   29: aload_0
    //   30: aload_1
    //   31: invokestatic 196	com/android/dazhihui/ui/widget/a/x:c	(Ljava/lang/String;)Ljava/lang/String;
    //   34: invokespecial 199	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   37: astore 10
    //   39: aload 10
    //   41: invokevirtual 190	java/io/File:exists	()Z
    //   44: ifeq +713 -> 757
    //   47: iload_2
    //   48: ifne +709 -> 757
    //   51: aload 10
    //   53: invokevirtual 203	java/io/File:lastModified	()J
    //   56: lstore 12
    //   58: aload 10
    //   60: invokevirtual 190	java/io/File:exists	()Z
    //   63: ifeq +13 -> 76
    //   66: iload_2
    //   67: ifeq +9 -> 76
    //   70: aload 10
    //   72: invokevirtual 206	java/io/File:delete	()Z
    //   75: pop
    //   76: new 208	java/net/URL
    //   79: dup
    //   80: aload_1
    //   81: invokespecial 209	java/net/URL:<init>	(Ljava/lang/String;)V
    //   84: invokevirtual 213	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   87: checkcast 215	java/net/HttpURLConnection
    //   90: astore_1
    //   91: aload_1
    //   92: ldc -39
    //   94: invokevirtual 220	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: iconst_1
    //   99: invokevirtual 224	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   102: aload_1
    //   103: sipush 20000
    //   106: invokevirtual 227	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   109: aload_1
    //   110: sipush 10000
    //   113: invokevirtual 230	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   116: invokestatic 236	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   119: astore_0
    //   120: aload_0
    //   121: lload 12
    //   123: invokevirtual 240	java/util/Calendar:setTimeInMillis	(J)V
    //   126: new 242	java/text/SimpleDateFormat
    //   129: dup
    //   130: ldc -12
    //   132: getstatic 250	java/util/Locale:US	Ljava/util/Locale;
    //   135: invokespecial 253	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   138: astore_3
    //   139: aload_3
    //   140: ldc -1
    //   142: invokestatic 261	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   145: invokevirtual 265	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   148: aload_1
    //   149: ldc_w 267
    //   152: aload_3
    //   153: aload_0
    //   154: invokevirtual 271	java/util/Calendar:getTime	()Ljava/util/Date;
    //   157: invokevirtual 275	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   160: invokevirtual 279	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload_1
    //   164: invokevirtual 282	java/net/HttpURLConnection:getResponseCode	()I
    //   167: istore 11
    //   169: iload 11
    //   171: sipush 304
    //   174: if_icmpne +67 -> 241
    //   177: new 284	java/io/FileInputStream
    //   180: dup
    //   181: aload 10
    //   183: invokespecial 287	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   186: astore_0
    //   187: aload_0
    //   188: invokestatic 290	com/android/dazhihui/ui/widget/a/r:a	(Ljava/io/InputStream;)[B
    //   191: astore_3
    //   192: aconst_null
    //   193: astore 6
    //   195: aload_0
    //   196: astore 4
    //   198: aload_3
    //   199: astore_0
    //   200: aload 6
    //   202: astore_3
    //   203: aload 4
    //   205: ifnull +8 -> 213
    //   208: aload 4
    //   210: invokevirtual 295	java/io/InputStream:close	()V
    //   213: aload_3
    //   214: ifnull +7 -> 221
    //   217: aload_3
    //   218: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   221: aload 5
    //   223: ifnull +8 -> 231
    //   226: aload 5
    //   228: invokevirtual 301	java/io/FileOutputStream:close	()V
    //   231: aload_1
    //   232: ifnull +7 -> 239
    //   235: aload_1
    //   236: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   239: aload_0
    //   240: areturn
    //   241: iload 11
    //   243: sipush 200
    //   246: if_icmpne +501 -> 747
    //   249: aload_1
    //   250: invokevirtual 307	java/net/HttpURLConnection:getLastModified	()J
    //   253: lstore 12
    //   255: aload_1
    //   256: invokevirtual 310	java/net/HttpURLConnection:getExpiration	()J
    //   259: pop2
    //   260: aload_1
    //   261: invokevirtual 314	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   264: astore 4
    //   266: aload 10
    //   268: invokevirtual 190	java/io/File:exists	()Z
    //   271: ifeq +9 -> 280
    //   274: aload 10
    //   276: invokevirtual 206	java/io/File:delete	()Z
    //   279: pop
    //   280: new 300	java/io/FileOutputStream
    //   283: dup
    //   284: aload 10
    //   286: invokespecial 315	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   289: astore_3
    //   290: new 297	java/io/ByteArrayOutputStream
    //   293: dup
    //   294: invokespecial 316	java/io/ByteArrayOutputStream:<init>	()V
    //   297: astore_0
    //   298: aload_1
    //   299: astore 7
    //   301: aload_0
    //   302: astore 8
    //   304: aload_3
    //   305: astore 6
    //   307: aload 4
    //   309: astore 5
    //   311: sipush 4096
    //   314: newarray <illegal type>
    //   316: astore 9
    //   318: aload_1
    //   319: astore 7
    //   321: aload_0
    //   322: astore 8
    //   324: aload_3
    //   325: astore 6
    //   327: aload 4
    //   329: astore 5
    //   331: aload 4
    //   333: aload 9
    //   335: invokevirtual 320	java/io/InputStream:read	([B)I
    //   338: istore 11
    //   340: iconst_m1
    //   341: iload 11
    //   343: if_icmpeq +107 -> 450
    //   346: aload_1
    //   347: astore 7
    //   349: aload_0
    //   350: astore 8
    //   352: aload_3
    //   353: astore 6
    //   355: aload 4
    //   357: astore 5
    //   359: aload_3
    //   360: aload 9
    //   362: iconst_0
    //   363: iload 11
    //   365: invokevirtual 324	java/io/FileOutputStream:write	([BII)V
    //   368: aload_1
    //   369: astore 7
    //   371: aload_0
    //   372: astore 8
    //   374: aload_3
    //   375: astore 6
    //   377: aload 4
    //   379: astore 5
    //   381: aload_0
    //   382: aload 9
    //   384: iconst_0
    //   385: iload 11
    //   387: invokevirtual 325	java/io/ByteArrayOutputStream:write	([BII)V
    //   390: goto -72 -> 318
    //   393: astore 5
    //   395: aload_1
    //   396: astore 7
    //   398: aload_0
    //   399: astore 8
    //   401: aload_3
    //   402: astore 6
    //   404: aload 4
    //   406: astore 5
    //   408: aload 10
    //   410: invokevirtual 206	java/io/File:delete	()Z
    //   413: pop
    //   414: aload 4
    //   416: ifnull +8 -> 424
    //   419: aload 4
    //   421: invokevirtual 295	java/io/InputStream:close	()V
    //   424: aload_0
    //   425: ifnull +7 -> 432
    //   428: aload_0
    //   429: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   432: aload_3
    //   433: ifnull +7 -> 440
    //   436: aload_3
    //   437: invokevirtual 301	java/io/FileOutputStream:close	()V
    //   440: aload_1
    //   441: ifnull +7 -> 448
    //   444: aload_1
    //   445: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   448: aconst_null
    //   449: areturn
    //   450: aload_1
    //   451: astore 7
    //   453: aload_0
    //   454: astore 8
    //   456: aload_3
    //   457: astore 6
    //   459: aload 4
    //   461: astore 5
    //   463: aload_3
    //   464: invokevirtual 328	java/io/FileOutputStream:flush	()V
    //   467: aload_1
    //   468: astore 7
    //   470: aload_0
    //   471: astore 8
    //   473: aload_3
    //   474: astore 6
    //   476: aload 4
    //   478: astore 5
    //   480: aload_3
    //   481: invokevirtual 301	java/io/FileOutputStream:close	()V
    //   484: aload_1
    //   485: astore 7
    //   487: aload_0
    //   488: astore 8
    //   490: aload_3
    //   491: astore 6
    //   493: aload 4
    //   495: astore 5
    //   497: aload 10
    //   499: lload 12
    //   501: invokevirtual 332	java/io/File:setLastModified	(J)Z
    //   504: pop
    //   505: aload_1
    //   506: astore 7
    //   508: aload_0
    //   509: astore 8
    //   511: aload_3
    //   512: astore 6
    //   514: aload 4
    //   516: astore 5
    //   518: aload_0
    //   519: invokevirtual 335	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   522: astore 9
    //   524: aload_1
    //   525: astore 7
    //   527: aload_0
    //   528: astore 8
    //   530: aload_3
    //   531: astore 6
    //   533: aload 4
    //   535: astore 5
    //   537: aload_0
    //   538: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   541: aload_3
    //   542: astore 5
    //   544: aload 9
    //   546: astore 6
    //   548: aload_0
    //   549: astore_3
    //   550: aload 6
    //   552: astore_0
    //   553: goto -350 -> 203
    //   556: astore_0
    //   557: aconst_null
    //   558: astore_3
    //   559: aconst_null
    //   560: astore 4
    //   562: aconst_null
    //   563: astore_1
    //   564: aload 4
    //   566: ifnull +8 -> 574
    //   569: aload 4
    //   571: invokevirtual 295	java/io/InputStream:close	()V
    //   574: aload 6
    //   576: ifnull +8 -> 584
    //   579: aload 6
    //   581: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   584: aload_3
    //   585: ifnull +7 -> 592
    //   588: aload_3
    //   589: invokevirtual 301	java/io/FileOutputStream:close	()V
    //   592: aload_1
    //   593: ifnull +7 -> 600
    //   596: aload_1
    //   597: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   600: aload_0
    //   601: athrow
    //   602: astore 4
    //   604: goto -391 -> 213
    //   607: astore_3
    //   608: goto -387 -> 221
    //   611: astore_3
    //   612: goto -381 -> 231
    //   615: astore 4
    //   617: goto -193 -> 424
    //   620: astore_0
    //   621: goto -189 -> 432
    //   624: astore_0
    //   625: goto -185 -> 440
    //   628: astore 4
    //   630: goto -56 -> 574
    //   633: astore 4
    //   635: goto -51 -> 584
    //   638: astore_3
    //   639: goto -47 -> 592
    //   642: astore_0
    //   643: aconst_null
    //   644: astore_3
    //   645: aconst_null
    //   646: astore 4
    //   648: goto -84 -> 564
    //   651: astore 5
    //   653: aload_0
    //   654: astore 4
    //   656: aconst_null
    //   657: astore_3
    //   658: aload 5
    //   660: astore_0
    //   661: goto -97 -> 564
    //   664: astore_0
    //   665: aconst_null
    //   666: astore_3
    //   667: goto -103 -> 564
    //   670: astore_0
    //   671: goto -107 -> 564
    //   674: astore_0
    //   675: aload 7
    //   677: astore_1
    //   678: aload 6
    //   680: astore_3
    //   681: aload 8
    //   683: astore 6
    //   685: aload 5
    //   687: astore 4
    //   689: goto -125 -> 564
    //   692: astore_0
    //   693: aconst_null
    //   694: astore_0
    //   695: aconst_null
    //   696: astore_3
    //   697: aconst_null
    //   698: astore 4
    //   700: aconst_null
    //   701: astore_1
    //   702: goto -307 -> 395
    //   705: astore_0
    //   706: aconst_null
    //   707: astore_0
    //   708: aconst_null
    //   709: astore_3
    //   710: aconst_null
    //   711: astore 4
    //   713: goto -318 -> 395
    //   716: astore_3
    //   717: aconst_null
    //   718: astore_3
    //   719: aload_0
    //   720: astore 4
    //   722: aconst_null
    //   723: astore 5
    //   725: aload_3
    //   726: astore_0
    //   727: aload 5
    //   729: astore_3
    //   730: goto -335 -> 395
    //   733: astore_0
    //   734: aconst_null
    //   735: astore_0
    //   736: aconst_null
    //   737: astore_3
    //   738: goto -343 -> 395
    //   741: astore_0
    //   742: aconst_null
    //   743: astore_0
    //   744: goto -349 -> 395
    //   747: aconst_null
    //   748: astore_3
    //   749: aconst_null
    //   750: astore_0
    //   751: aconst_null
    //   752: astore 4
    //   754: goto -551 -> 203
    //   757: lconst_0
    //   758: lstore 12
    //   760: goto -702 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	763	0	paramContext	Context
    //   0	763	1	paramString	String
    //   0	763	2	paramBoolean	boolean
    //   138	451	3	localObject1	Object
    //   607	1	3	localIOException1	java.io.IOException
    //   611	1	3	localIOException2	java.io.IOException
    //   638	1	3	localIOException3	java.io.IOException
    //   644	66	3	localObject2	Object
    //   716	1	3	localException1	Exception
    //   718	31	3	localObject3	Object
    //   196	374	4	localObject4	Object
    //   602	1	4	localException2	Exception
    //   615	1	4	localException3	Exception
    //   628	1	4	localException4	Exception
    //   633	1	4	localIOException4	java.io.IOException
    //   646	107	4	localObject5	Object
    //   4	376	5	localObject6	Object
    //   393	1	5	localException5	Exception
    //   406	137	5	localObject7	Object
    //   651	35	5	localObject8	Object
    //   723	5	5	localObject9	Object
    //   1	683	6	localObject10	Object
    //   299	377	7	str	String
    //   302	380	8	localContext	Context
    //   316	229	9	arrayOfByte	byte[]
    //   37	461	10	localFile	File
    //   167	219	11	i	int
    //   56	703	12	l	long
    // Exception table:
    //   from	to	target	type
    //   311	318	393	java/lang/Exception
    //   331	340	393	java/lang/Exception
    //   359	368	393	java/lang/Exception
    //   381	390	393	java/lang/Exception
    //   463	467	393	java/lang/Exception
    //   480	484	393	java/lang/Exception
    //   497	505	393	java/lang/Exception
    //   518	524	393	java/lang/Exception
    //   537	541	393	java/lang/Exception
    //   76	91	556	finally
    //   208	213	602	java/lang/Exception
    //   217	221	607	java/io/IOException
    //   226	231	611	java/io/IOException
    //   419	424	615	java/lang/Exception
    //   428	432	620	java/io/IOException
    //   436	440	624	java/io/IOException
    //   569	574	628	java/lang/Exception
    //   579	584	633	java/io/IOException
    //   588	592	638	java/io/IOException
    //   91	169	642	finally
    //   177	187	642	finally
    //   249	266	642	finally
    //   187	192	651	finally
    //   266	280	664	finally
    //   280	290	664	finally
    //   290	298	670	finally
    //   311	318	674	finally
    //   331	340	674	finally
    //   359	368	674	finally
    //   381	390	674	finally
    //   408	414	674	finally
    //   463	467	674	finally
    //   480	484	674	finally
    //   497	505	674	finally
    //   518	524	674	finally
    //   537	541	674	finally
    //   76	91	692	java/lang/Exception
    //   91	169	705	java/lang/Exception
    //   177	187	705	java/lang/Exception
    //   249	266	705	java/lang/Exception
    //   187	192	716	java/lang/Exception
    //   266	280	733	java/lang/Exception
    //   280	290	733	java/lang/Exception
    //   290	298	741	java/lang/Exception
  }
  
  /* Error */
  public static byte[] a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: ifnonnull +7 -> 10
    //   6: aload_2
    //   7: astore_1
    //   8: aload_1
    //   9: areturn
    //   10: new 297	java/io/ByteArrayOutputStream
    //   13: dup
    //   14: invokespecial 316	java/io/ByteArrayOutputStream:<init>	()V
    //   17: astore_1
    //   18: sipush 4096
    //   21: newarray <illegal type>
    //   23: astore_3
    //   24: aload_0
    //   25: aload_3
    //   26: invokevirtual 320	java/io/InputStream:read	([B)I
    //   29: istore 4
    //   31: iconst_m1
    //   32: iload 4
    //   34: if_icmpeq +42 -> 76
    //   37: aload_1
    //   38: aload_3
    //   39: iconst_0
    //   40: iload 4
    //   42: invokevirtual 325	java/io/ByteArrayOutputStream:write	([BII)V
    //   45: goto -21 -> 24
    //   48: astore_3
    //   49: aload_1
    //   50: ifnull +7 -> 57
    //   53: aload_1
    //   54: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   57: aload_2
    //   58: astore_1
    //   59: aload_0
    //   60: ifnull -52 -> 8
    //   63: aload_0
    //   64: invokevirtual 295	java/io/InputStream:close	()V
    //   67: aconst_null
    //   68: areturn
    //   69: astore_0
    //   70: aload_0
    //   71: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   74: aconst_null
    //   75: areturn
    //   76: aload_1
    //   77: invokevirtual 335	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   80: astore_3
    //   81: aload_3
    //   82: astore_2
    //   83: aload_1
    //   84: ifnull +7 -> 91
    //   87: aload_1
    //   88: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   91: aload_2
    //   92: astore_1
    //   93: aload_0
    //   94: ifnull -86 -> 8
    //   97: aload_0
    //   98: invokevirtual 295	java/io/InputStream:close	()V
    //   101: aload_2
    //   102: areturn
    //   103: astore_0
    //   104: aload_0
    //   105: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   108: aload_2
    //   109: areturn
    //   110: astore_1
    //   111: aload_1
    //   112: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   115: goto -24 -> 91
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   123: goto -66 -> 57
    //   126: astore_2
    //   127: aconst_null
    //   128: astore_1
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 298	java/io/ByteArrayOutputStream:close	()V
    //   137: aload_0
    //   138: ifnull +7 -> 145
    //   141: aload_0
    //   142: invokevirtual 295	java/io/InputStream:close	()V
    //   145: aload_2
    //   146: athrow
    //   147: astore_1
    //   148: aload_1
    //   149: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   152: goto -15 -> 137
    //   155: astore_0
    //   156: aload_0
    //   157: invokevirtual 338	java/io/IOException:printStackTrace	()V
    //   160: goto -15 -> 145
    //   163: astore_2
    //   164: goto -35 -> 129
    //   167: astore_1
    //   168: aconst_null
    //   169: astore_1
    //   170: goto -121 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	paramInputStream	java.io.InputStream
    //   7	86	1	localObject1	Object
    //   110	2	1	localIOException1	java.io.IOException
    //   118	2	1	localIOException2	java.io.IOException
    //   128	6	1	localObject2	Object
    //   147	2	1	localIOException3	java.io.IOException
    //   167	1	1	localException1	Exception
    //   169	1	1	localObject3	Object
    //   1	108	2	localObject4	Object
    //   126	20	2	localObject5	Object
    //   163	1	2	localObject6	Object
    //   23	16	3	arrayOfByte1	byte[]
    //   48	1	3	localException2	Exception
    //   80	2	3	arrayOfByte2	byte[]
    //   29	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   18	24	48	java/lang/Exception
    //   24	31	48	java/lang/Exception
    //   37	45	48	java/lang/Exception
    //   76	81	48	java/lang/Exception
    //   63	67	69	java/io/IOException
    //   97	101	103	java/io/IOException
    //   87	91	110	java/io/IOException
    //   53	57	118	java/io/IOException
    //   10	18	126	finally
    //   133	137	147	java/io/IOException
    //   141	145	155	java/io/IOException
    //   18	24	163	finally
    //   24	31	163	finally
    //   37	45	163	finally
    //   76	81	163	finally
    //   10	18	167	java/lang/Exception
  }
  
  private static w b(ImageView paramImageView)
  {
    if (paramImageView != null)
    {
      paramImageView = paramImageView.getDrawable();
      if ((paramImageView instanceof u)) {
        return ((u)paramImageView).a();
      }
    }
    return null;
  }
  
  public static File b(Context paramContext)
  {
    if (d()) {
      return paramContext.getExternalCacheDir();
    }
    paramContext = "/Android/data/" + paramContext.getPackageName() + "/cache/";
    return new File(Environment.getExternalStorageDirectory().getPath() + paramContext);
  }
  
  public static boolean b()
  {
    if (e()) {
      return Environment.isExternalStorageRemovable();
    }
    return true;
  }
  
  private static boolean b(String paramString, ImageView paramImageView)
  {
    paramImageView = b(paramImageView);
    if (paramImageView != null)
    {
      String str = w.a(paramImageView);
      if ((str == null) || (!str.equals(paramString))) {
        paramImageView.cancel(true);
      }
    }
    else
    {
      return true;
    }
    return false;
  }
  
  /* Error */
  public static byte[] b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 208	java/net/URL
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 209	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 213	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   13: checkcast 215	java/net/HttpURLConnection
    //   16: astore_0
    //   17: aload_0
    //   18: sipush 20000
    //   21: invokevirtual 227	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   24: aload_0
    //   25: ldc -39
    //   27: invokevirtual 220	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   30: aload_0
    //   31: sipush 10000
    //   34: invokevirtual 230	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   37: aload_0
    //   38: invokevirtual 314	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   41: astore_1
    //   42: aload_1
    //   43: invokestatic 290	com/android/dazhihui/ui/widget/a/r:a	(Ljava/io/InputStream;)[B
    //   46: astore_2
    //   47: aload_1
    //   48: ifnull +7 -> 55
    //   51: aload_1
    //   52: invokevirtual 295	java/io/InputStream:close	()V
    //   55: aload_0
    //   56: ifnull +7 -> 63
    //   59: aload_0
    //   60: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   63: aload_2
    //   64: areturn
    //   65: astore_0
    //   66: aconst_null
    //   67: astore_0
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_0
    //   71: ifnull +7 -> 78
    //   74: aload_0
    //   75: invokevirtual 295	java/io/InputStream:close	()V
    //   78: aload_1
    //   79: ifnull +7 -> 86
    //   82: aload_1
    //   83: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   86: aconst_null
    //   87: areturn
    //   88: astore_0
    //   89: aconst_null
    //   90: astore_1
    //   91: aload_2
    //   92: ifnull +7 -> 99
    //   95: aload_2
    //   96: invokevirtual 295	java/io/InputStream:close	()V
    //   99: aload_1
    //   100: ifnull +7 -> 107
    //   103: aload_1
    //   104: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   107: aload_0
    //   108: athrow
    //   109: astore_1
    //   110: goto -55 -> 55
    //   113: astore_0
    //   114: goto -36 -> 78
    //   117: astore_2
    //   118: goto -19 -> 99
    //   121: astore_3
    //   122: aload_0
    //   123: astore_1
    //   124: aload_3
    //   125: astore_0
    //   126: goto -35 -> 91
    //   129: astore_2
    //   130: aload_0
    //   131: astore_3
    //   132: aload_2
    //   133: astore_0
    //   134: aload_1
    //   135: astore_2
    //   136: aload_3
    //   137: astore_1
    //   138: goto -47 -> 91
    //   141: astore_1
    //   142: aload_0
    //   143: astore_1
    //   144: aconst_null
    //   145: astore_0
    //   146: goto -76 -> 70
    //   149: astore_2
    //   150: aload_0
    //   151: astore_2
    //   152: aload_1
    //   153: astore_0
    //   154: aload_2
    //   155: astore_1
    //   156: goto -86 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	paramString	String
    //   41	63	1	localInputStream	java.io.InputStream
    //   109	1	1	localException1	Exception
    //   123	15	1	localObject1	Object
    //   141	1	1	localException2	Exception
    //   143	13	1	str1	String
    //   1	95	2	arrayOfByte	byte[]
    //   117	1	2	localException3	Exception
    //   129	4	2	localObject2	Object
    //   135	1	2	localObject3	Object
    //   149	1	2	localException4	Exception
    //   151	4	2	str2	String
    //   121	4	3	localObject4	Object
    //   131	6	3	str3	String
    // Exception table:
    //   from	to	target	type
    //   2	17	65	java/lang/Exception
    //   2	17	88	finally
    //   51	55	109	java/lang/Exception
    //   74	78	113	java/lang/Exception
    //   95	99	117	java/lang/Exception
    //   17	42	121	finally
    //   42	47	129	finally
    //   17	42	141	java/lang/Exception
    //   42	47	149	java/lang/Exception
  }
  
  private static boolean d()
  {
    return Build.VERSION.SDK_INT >= 8;
  }
  
  private static boolean e()
  {
    return Build.VERSION.SDK_INT >= 9;
  }
  
  public void a()
  {
    a(true);
    b(false);
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
    }
    g = null;
  }
  
  public void a(ab paramab, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramVarArgs.length)
    {
      a(paramVarArgs[i], new s(this, localHashMap, localArrayList, paramVarArgs, paramab));
      i += 1;
    }
  }
  
  public void a(String paramString, ImageView paramImageView)
  {
    a(paramString, paramImageView, null, null, 0, 0);
  }
  
  public void a(String paramString, ImageView paramImageView, int paramInt)
  {
    a(paramString, paramImageView, BitmapFactory.decodeResource(this.b, paramInt), null, 0, 0);
  }
  
  public void a(String paramString, ImageView paramImageView, Bitmap paramBitmap, aa paramaa, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString))
    {
      if (paramaa != null) {
        paramaa.loadOver(paramString, null);
      }
      return;
    }
    if (this.c != null) {}
    for (byte[] arrayOfByte = this.c.a(paramString);; arrayOfByte = null)
    {
      if (arrayOfByte != null)
      {
        if (paramImageView != null) {
          paramImageView.setImageBitmap(a(arrayOfByte));
        }
        if (paramaa == null) {
          break;
        }
        paramaa.loadOver(paramString, arrayOfByte);
        return;
      }
      if (b(paramString, paramImageView))
      {
        paramaa = new w(this, paramImageView, paramaa);
        paramBitmap = new u(this, this.b, paramBitmap, paramaa);
        if (paramImageView != null) {
          paramImageView.setImageDrawable(paramBitmap);
        }
        paramaa.a(a.d, new String[] { paramString });
        return;
      }
      if (paramaa == null) {
        break;
      }
      paramaa.loadOver(paramString, null);
      return;
    }
  }
  
  public void a(String paramString, aa paramaa)
  {
    a(paramString, null, null, paramaa, 0, 0);
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public byte[] a(String paramString)
  {
    Object localObject = null;
    if (this.c != null)
    {
      byte[] arrayOfByte = this.c.a(paramString);
      localObject = arrayOfByte;
      if (arrayOfByte == null) {
        localObject = this.c.b(paramString);
      }
    }
    return (byte[])localObject;
  }
  
  public void b(boolean paramBoolean)
  {
    synchronized (this.d)
    {
      this.a = paramBoolean;
      if (!this.a) {
        this.d.notifyAll();
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */