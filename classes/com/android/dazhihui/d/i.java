package com.android.dazhihui.d;

public class i
{
  public long a;
  public long b;
  private boolean c = false;
  private m d;
  
  /* Error */
  public k a(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_1
    //   9: ldc 25
    //   11: invokestatic 30	com/android/dazhihui/ui/widget/a/r:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   14: astore_1
    //   15: new 32	com/android/dazhihui/d/k
    //   18: dup
    //   19: invokespecial 33	com/android/dazhihui/d/k:<init>	()V
    //   22: astore 7
    //   24: aload_1
    //   25: invokevirtual 39	java/io/File:exists	()Z
    //   28: ifne +8 -> 36
    //   31: aload_1
    //   32: invokevirtual 42	java/io/File:mkdirs	()Z
    //   35: pop
    //   36: new 35	java/io/File
    //   39: dup
    //   40: aload_1
    //   41: aload_2
    //   42: invokestatic 47	com/android/dazhihui/ui/widget/a/x:c	(Ljava/lang/String;)Ljava/lang/String;
    //   45: invokespecial 50	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   48: astore 8
    //   50: aload 8
    //   52: invokevirtual 39	java/io/File:exists	()Z
    //   55: ifeq +19 -> 74
    //   58: aload 7
    //   60: iconst_1
    //   61: putfield 51	com/android/dazhihui/d/k:c	Z
    //   64: aload 7
    //   66: aload 8
    //   68: putfield 54	com/android/dazhihui/d/k:d	Ljava/io/File;
    //   71: aload 7
    //   73: areturn
    //   74: new 56	java/net/URL
    //   77: dup
    //   78: aload_2
    //   79: invokespecial 59	java/net/URL:<init>	(Ljava/lang/String;)V
    //   82: astore_2
    //   83: aload_2
    //   84: invokevirtual 63	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   87: checkcast 65	java/net/HttpURLConnection
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 69	java/net/URL:getProtocol	()Ljava/lang/String;
    //   95: ldc 71
    //   97: invokevirtual 77	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   100: ifeq +41 -> 141
    //   103: ldc 79
    //   105: invokestatic 85	javax/net/ssl/SSLContext:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   108: astore_2
    //   109: aload_2
    //   110: aconst_null
    //   111: iconst_1
    //   112: anewarray 87	javax/net/ssl/TrustManager
    //   115: dup
    //   116: iconst_0
    //   117: new 89	com/android/dazhihui/d/l
    //   120: dup
    //   121: aconst_null
    //   122: invokespecial 92	com/android/dazhihui/d/l:<init>	(Lcom/android/dazhihui/d/j;)V
    //   125: aastore
    //   126: aconst_null
    //   127: invokevirtual 96	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   130: aload_1
    //   131: checkcast 98	javax/net/ssl/HttpsURLConnection
    //   134: aload_2
    //   135: invokevirtual 102	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   138: invokevirtual 106	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   141: aload_1
    //   142: ldc 108
    //   144: invokevirtual 111	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   147: aload_1
    //   148: iconst_1
    //   149: invokevirtual 115	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   152: aload_1
    //   153: sipush 20000
    //   156: invokevirtual 119	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   159: aload_1
    //   160: sipush 10000
    //   163: invokevirtual 122	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   166: aload_1
    //   167: invokevirtual 126	java/net/HttpURLConnection:getResponseCode	()I
    //   170: sipush 200
    //   173: if_icmpne +458 -> 631
    //   176: aload_1
    //   177: invokevirtual 130	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   180: astore_3
    //   181: aload_0
    //   182: aload_1
    //   183: ldc -124
    //   185: invokevirtual 135	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   188: invokestatic 141	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   191: putfield 143	com/android/dazhihui/d/i:a	J
    //   194: aload_0
    //   195: getfield 145	com/android/dazhihui/d/i:d	Lcom/android/dazhihui/d/m;
    //   198: ifnull +17 -> 215
    //   201: aload_0
    //   202: getfield 145	com/android/dazhihui/d/i:d	Lcom/android/dazhihui/d/m;
    //   205: lconst_0
    //   206: aload_0
    //   207: getfield 143	com/android/dazhihui/d/i:a	J
    //   210: invokeinterface 150 5 0
    //   215: new 152	java/io/FileOutputStream
    //   218: dup
    //   219: aload 8
    //   221: invokespecial 155	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   224: astore_2
    //   225: sipush 4096
    //   228: newarray <illegal type>
    //   230: astore 4
    //   232: aload_3
    //   233: aload 4
    //   235: invokevirtual 161	java/io/InputStream:read	([B)I
    //   238: istore 9
    //   240: iconst_m1
    //   241: iload 9
    //   243: if_icmpeq +121 -> 364
    //   246: aload_0
    //   247: getfield 17	com/android/dazhihui/d/i:c	Z
    //   250: ifne +114 -> 364
    //   253: aload_0
    //   254: aload_0
    //   255: getfield 163	com/android/dazhihui/d/i:b	J
    //   258: iload 9
    //   260: i2l
    //   261: ladd
    //   262: putfield 163	com/android/dazhihui/d/i:b	J
    //   265: aload_0
    //   266: getfield 145	com/android/dazhihui/d/i:d	Lcom/android/dazhihui/d/m;
    //   269: ifnull +20 -> 289
    //   272: aload_0
    //   273: getfield 145	com/android/dazhihui/d/i:d	Lcom/android/dazhihui/d/m;
    //   276: aload_0
    //   277: getfield 163	com/android/dazhihui/d/i:b	J
    //   280: aload_0
    //   281: getfield 143	com/android/dazhihui/d/i:a	J
    //   284: invokeinterface 150 5 0
    //   289: aload_2
    //   290: aload 4
    //   292: iconst_0
    //   293: iload 9
    //   295: invokevirtual 167	java/io/FileOutputStream:write	([BII)V
    //   298: goto -66 -> 232
    //   301: astore 5
    //   303: aload_2
    //   304: astore 6
    //   306: aload_1
    //   307: astore_2
    //   308: aload_3
    //   309: astore 4
    //   311: aload 6
    //   313: astore_1
    //   314: aload 5
    //   316: astore_3
    //   317: aload 8
    //   319: invokevirtual 170	java/io/File:delete	()Z
    //   322: pop
    //   323: aload 7
    //   325: iconst_1
    //   326: putfield 172	com/android/dazhihui/d/k:a	Z
    //   329: aload 7
    //   331: aload_3
    //   332: putfield 176	com/android/dazhihui/d/k:e	Ljava/lang/Exception;
    //   335: aload 4
    //   337: ifnull +8 -> 345
    //   340: aload 4
    //   342: invokevirtual 179	java/io/InputStream:close	()V
    //   345: aload_1
    //   346: ifnull +7 -> 353
    //   349: aload_1
    //   350: invokevirtual 180	java/io/FileOutputStream:close	()V
    //   353: aload_2
    //   354: ifnull +7 -> 361
    //   357: aload_2
    //   358: invokevirtual 183	java/net/HttpURLConnection:disconnect	()V
    //   361: aload 7
    //   363: areturn
    //   364: aload_0
    //   365: getfield 17	com/android/dazhihui/d/i:c	Z
    //   368: ifeq +9 -> 377
    //   371: aload 8
    //   373: invokevirtual 170	java/io/File:delete	()Z
    //   376: pop
    //   377: aload_2
    //   378: invokevirtual 186	java/io/FileOutputStream:flush	()V
    //   381: aload_2
    //   382: invokevirtual 180	java/io/FileOutputStream:close	()V
    //   385: aload_2
    //   386: astore 4
    //   388: aload_3
    //   389: astore_2
    //   390: aload_0
    //   391: getfield 17	com/android/dazhihui/d/i:c	Z
    //   394: ifeq +38 -> 432
    //   397: aload 7
    //   399: iconst_1
    //   400: putfield 188	com/android/dazhihui/d/k:b	Z
    //   403: aload_2
    //   404: ifnull +7 -> 411
    //   407: aload_2
    //   408: invokevirtual 179	java/io/InputStream:close	()V
    //   411: aload 4
    //   413: ifnull +8 -> 421
    //   416: aload 4
    //   418: invokevirtual 180	java/io/FileOutputStream:close	()V
    //   421: aload_1
    //   422: ifnull +7 -> 429
    //   425: aload_1
    //   426: invokevirtual 183	java/net/HttpURLConnection:disconnect	()V
    //   429: aload 7
    //   431: areturn
    //   432: aload 7
    //   434: iconst_1
    //   435: putfield 51	com/android/dazhihui/d/k:c	Z
    //   438: aload 7
    //   440: aload 8
    //   442: putfield 54	com/android/dazhihui/d/k:d	Ljava/io/File;
    //   445: goto -42 -> 403
    //   448: astore_3
    //   449: aload_1
    //   450: astore 5
    //   452: aload 4
    //   454: astore_1
    //   455: aload_2
    //   456: astore 4
    //   458: aload 5
    //   460: astore_2
    //   461: goto -144 -> 317
    //   464: astore_1
    //   465: aconst_null
    //   466: astore_3
    //   467: aconst_null
    //   468: astore_2
    //   469: aload_3
    //   470: ifnull +7 -> 477
    //   473: aload_3
    //   474: invokevirtual 179	java/io/InputStream:close	()V
    //   477: aload 4
    //   479: ifnull +8 -> 487
    //   482: aload 4
    //   484: invokevirtual 180	java/io/FileOutputStream:close	()V
    //   487: aload_2
    //   488: ifnull +7 -> 495
    //   491: aload_2
    //   492: invokevirtual 183	java/net/HttpURLConnection:disconnect	()V
    //   495: aload_1
    //   496: athrow
    //   497: astore_2
    //   498: goto -87 -> 411
    //   501: astore_2
    //   502: goto -81 -> 421
    //   505: astore_3
    //   506: goto -161 -> 345
    //   509: astore_1
    //   510: goto -157 -> 353
    //   513: astore_3
    //   514: goto -37 -> 477
    //   517: astore_3
    //   518: goto -31 -> 487
    //   521: astore 5
    //   523: aconst_null
    //   524: astore_3
    //   525: aload_1
    //   526: astore_2
    //   527: aload 5
    //   529: astore_1
    //   530: goto -61 -> 469
    //   533: astore 5
    //   535: aload_1
    //   536: astore_2
    //   537: aload 5
    //   539: astore_1
    //   540: goto -71 -> 469
    //   543: astore 4
    //   545: aload_1
    //   546: astore 5
    //   548: aload 4
    //   550: astore_1
    //   551: aload_2
    //   552: astore 4
    //   554: aload 5
    //   556: astore_2
    //   557: goto -88 -> 469
    //   560: astore 5
    //   562: aload_2
    //   563: astore_3
    //   564: aload_1
    //   565: astore_2
    //   566: aload 5
    //   568: astore_1
    //   569: goto -100 -> 469
    //   572: astore 5
    //   574: aload 4
    //   576: astore_3
    //   577: aload_1
    //   578: astore 4
    //   580: aload 5
    //   582: astore_1
    //   583: goto -114 -> 469
    //   586: astore_3
    //   587: aconst_null
    //   588: astore_1
    //   589: aconst_null
    //   590: astore_2
    //   591: aload 5
    //   593: astore 4
    //   595: goto -278 -> 317
    //   598: astore_3
    //   599: aload_1
    //   600: astore_2
    //   601: aconst_null
    //   602: astore_1
    //   603: aload 5
    //   605: astore 4
    //   607: goto -290 -> 317
    //   610: astore 4
    //   612: aload_1
    //   613: astore_2
    //   614: aload 4
    //   616: astore_1
    //   617: aconst_null
    //   618: astore 5
    //   620: aload_3
    //   621: astore 4
    //   623: aload_1
    //   624: astore_3
    //   625: aload 5
    //   627: astore_1
    //   628: goto -311 -> 317
    //   631: aconst_null
    //   632: astore_2
    //   633: aload_3
    //   634: astore 4
    //   636: goto -246 -> 390
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	639	0	this	i
    //   0	639	1	paramContext	android.content.Context
    //   0	639	2	paramString	String
    //   1	388	3	localObject1	Object
    //   448	1	3	localException1	Exception
    //   466	8	3	localObject2	Object
    //   505	1	3	localIOException1	java.io.IOException
    //   513	1	3	localIOException2	java.io.IOException
    //   517	1	3	localIOException3	java.io.IOException
    //   524	53	3	localObject3	Object
    //   586	1	3	localException2	Exception
    //   598	23	3	localException3	Exception
    //   624	10	3	localContext1	android.content.Context
    //   3	480	4	localObject4	Object
    //   543	6	4	localObject5	Object
    //   552	54	4	localObject6	Object
    //   610	5	4	localException4	Exception
    //   621	14	4	localObject7	Object
    //   6	1	5	localObject8	Object
    //   301	14	5	localException5	Exception
    //   450	9	5	localContext2	android.content.Context
    //   521	7	5	localObject9	Object
    //   533	5	5	localObject10	Object
    //   546	9	5	localContext3	android.content.Context
    //   560	7	5	localObject11	Object
    //   572	32	5	localObject12	Object
    //   618	8	5	localObject13	Object
    //   304	8	6	str	String
    //   22	417	7	localk	k
    //   48	393	8	localFile	java.io.File
    //   238	56	9	i	int
    // Exception table:
    //   from	to	target	type
    //   225	232	301	java/lang/Exception
    //   232	240	301	java/lang/Exception
    //   246	289	301	java/lang/Exception
    //   289	298	301	java/lang/Exception
    //   364	377	301	java/lang/Exception
    //   377	385	301	java/lang/Exception
    //   390	403	448	java/lang/Exception
    //   432	445	448	java/lang/Exception
    //   74	91	464	finally
    //   407	411	497	java/io/IOException
    //   416	421	501	java/io/IOException
    //   340	345	505	java/io/IOException
    //   349	353	509	java/io/IOException
    //   473	477	513	java/io/IOException
    //   482	487	517	java/io/IOException
    //   91	141	521	finally
    //   141	181	521	finally
    //   181	215	533	finally
    //   215	225	533	finally
    //   225	232	543	finally
    //   232	240	543	finally
    //   246	289	543	finally
    //   289	298	543	finally
    //   364	377	543	finally
    //   377	385	543	finally
    //   390	403	560	finally
    //   432	445	560	finally
    //   317	335	572	finally
    //   74	91	586	java/lang/Exception
    //   91	141	598	java/lang/Exception
    //   141	181	598	java/lang/Exception
    //   181	215	610	java/lang/Exception
    //   215	225	610	java/lang/Exception
  }
  
  public void a()
  {
    this.c = true;
  }
  
  public void a(m paramm)
  {
    this.d = paramm;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */