package com.android.thinkive.framework;

import com.android.thinkive.framework.config.AddressConfigBean;

class MultiAddressManager$HttpConnectThread
  extends Thread
{
  private AddressConfigBean addressConfigBean;
  private String urlAddress;
  private String urlName;
  
  public MultiAddressManager$HttpConnectThread(MultiAddressManager paramMultiAddressManager, AddressConfigBean paramAddressConfigBean, String paramString)
  {
    this.urlAddress = paramString;
    this.urlName = paramAddressConfigBean.getName();
    this.addressConfigBean = paramAddressConfigBean;
  }
  
  public String getUrlName()
  {
    return this.urlName;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 4
    //   6: new 39	java/lang/StringBuffer
    //   9: dup
    //   10: invokespecial 40	java/lang/StringBuffer:<init>	()V
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 20	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:urlAddress	Ljava/lang/String;
    //   18: invokestatic 46	com/android/thinkive/framework/util/FormatUtil:formatUrlToHost	(Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_1
    //   22: aload_0
    //   23: getfield 20	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:urlAddress	Ljava/lang/String;
    //   26: invokestatic 50	com/android/thinkive/framework/util/FormatUtil:formatUrlToPort	(Ljava/lang/String;)I
    //   29: istore 7
    //   31: new 52	java/lang/StringBuilder
    //   34: dup
    //   35: ldc 54
    //   37: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_1
    //   41: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: ldc 63
    //   46: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: iload 7
    //   51: invokevirtual 66	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield 30	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   58: invokevirtual 69	com/android/thinkive/framework/config/AddressConfigBean:getSpeedPath	()Ljava/lang/String;
    //   61: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore_1
    //   68: new 74	java/net/URL
    //   71: dup
    //   72: aload_1
    //   73: invokespecial 75	java/net/URL:<init>	(Ljava/lang/String;)V
    //   76: invokevirtual 79	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   79: checkcast 81	java/net/HttpURLConnection
    //   82: astore_3
    //   83: aload_3
    //   84: sipush 2000
    //   87: invokevirtual 85	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   90: aload_3
    //   91: sipush 2000
    //   94: invokevirtual 88	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   97: aload_3
    //   98: iconst_0
    //   99: invokevirtual 92	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   102: aload_3
    //   103: iconst_1
    //   104: invokevirtual 95	java/net/HttpURLConnection:setDoInput	(Z)V
    //   107: aload_3
    //   108: ldc 97
    //   110: invokevirtual 100	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   113: aload_3
    //   114: invokevirtual 104	java/net/HttpURLConnection:getResponseCode	()I
    //   117: istore 7
    //   119: new 52	java/lang/StringBuilder
    //   122: dup
    //   123: ldc 106
    //   125: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_1
    //   129: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 111	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   138: iload 7
    //   140: sipush 200
    //   143: if_icmpne +283 -> 426
    //   146: aload_3
    //   147: invokevirtual 115	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   150: astore_1
    //   151: new 117	java/io/InputStreamReader
    //   154: dup
    //   155: aload_1
    //   156: invokespecial 120	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   159: astore_3
    //   160: new 122	java/io/BufferedReader
    //   163: dup
    //   164: aload_3
    //   165: invokespecial 125	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   168: astore 5
    //   170: aload 5
    //   172: invokevirtual 128	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   175: astore 4
    //   177: aload 4
    //   179: ifnonnull +148 -> 327
    //   182: aload_2
    //   183: invokevirtual 131	java/lang/StringBuffer:length	()I
    //   186: ifle +114 -> 300
    //   189: aload_0
    //   190: getfield 15	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   193: astore 4
    //   195: aload 4
    //   197: monitorenter
    //   198: new 52	java/lang/StringBuilder
    //   201: dup
    //   202: ldc -123
    //   204: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   207: aload_0
    //   208: getfield 20	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:urlAddress	Ljava/lang/String;
    //   211: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: ldc -121
    //   216: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: aload_2
    //   220: invokevirtual 136	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   223: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc -118
    //   228: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_0
    //   232: getfield 30	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   235: invokevirtual 142	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   238: invokevirtual 148	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   241: invokevirtual 151	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   244: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: invokestatic 154	com/android/thinkive/framework/util/Log:i	(Ljava/lang/String;)V
    //   250: aload_0
    //   251: getfield 30	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   254: invokevirtual 142	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   257: invokevirtual 148	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   260: ifne +37 -> 297
    //   263: aload_0
    //   264: getfield 30	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   267: invokevirtual 142	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   270: iconst_1
    //   271: invokevirtual 158	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   274: pop
    //   275: aload_0
    //   276: getfield 30	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   279: aload_0
    //   280: getfield 20	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:urlAddress	Ljava/lang/String;
    //   283: invokevirtual 161	com/android/thinkive/framework/config/AddressConfigBean:setPriorityValue	(Ljava/lang/String;)V
    //   286: aload_0
    //   287: getfield 15	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   290: aload_0
    //   291: getfield 28	com/android/thinkive/framework/MultiAddressManager$HttpConnectThread:urlName	Ljava/lang/String;
    //   294: invokestatic 167	com/android/thinkive/framework/MultiAddressManager:access$2	(Lcom/android/thinkive/framework/MultiAddressManager;Ljava/lang/String;)V
    //   297: aload 4
    //   299: monitorexit
    //   300: aload 5
    //   302: ifnull +8 -> 310
    //   305: aload 5
    //   307: invokevirtual 170	java/io/BufferedReader:close	()V
    //   310: aload_3
    //   311: ifnull +7 -> 318
    //   314: aload_3
    //   315: invokevirtual 171	java/io/InputStreamReader:close	()V
    //   318: aload_1
    //   319: ifnull +7 -> 326
    //   322: aload_1
    //   323: invokevirtual 174	java/io/InputStream:close	()V
    //   326: return
    //   327: aload_2
    //   328: aload 4
    //   330: invokevirtual 177	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   333: pop
    //   334: goto -164 -> 170
    //   337: astore 6
    //   339: aload_1
    //   340: astore_2
    //   341: aload_3
    //   342: astore 4
    //   344: aload 5
    //   346: astore_1
    //   347: aload 6
    //   349: astore_3
    //   350: aload_3
    //   351: invokevirtual 180	java/lang/Exception:printStackTrace	()V
    //   354: aload_1
    //   355: ifnull +7 -> 362
    //   358: aload_1
    //   359: invokevirtual 170	java/io/BufferedReader:close	()V
    //   362: aload 4
    //   364: ifnull +8 -> 372
    //   367: aload 4
    //   369: invokevirtual 171	java/io/InputStreamReader:close	()V
    //   372: aload_2
    //   373: ifnull -47 -> 326
    //   376: aload_2
    //   377: invokevirtual 174	java/io/InputStream:close	()V
    //   380: return
    //   381: astore_1
    //   382: aload_1
    //   383: invokevirtual 181	java/io/IOException:printStackTrace	()V
    //   386: return
    //   387: astore_2
    //   388: aload 4
    //   390: monitorexit
    //   391: aload_2
    //   392: athrow
    //   393: astore_2
    //   394: aload 5
    //   396: astore 4
    //   398: aload 4
    //   400: ifnull +8 -> 408
    //   403: aload 4
    //   405: invokevirtual 170	java/io/BufferedReader:close	()V
    //   408: aload_3
    //   409: ifnull +7 -> 416
    //   412: aload_3
    //   413: invokevirtual 171	java/io/InputStreamReader:close	()V
    //   416: aload_1
    //   417: ifnull +7 -> 424
    //   420: aload_1
    //   421: invokevirtual 174	java/io/InputStream:close	()V
    //   424: aload_2
    //   425: athrow
    //   426: new 37	java/io/IOException
    //   429: dup
    //   430: ldc -73
    //   432: invokespecial 184	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   435: athrow
    //   436: astore_3
    //   437: aconst_null
    //   438: astore_1
    //   439: aconst_null
    //   440: astore_2
    //   441: goto -91 -> 350
    //   444: astore_1
    //   445: aload_1
    //   446: invokevirtual 181	java/io/IOException:printStackTrace	()V
    //   449: goto -25 -> 424
    //   452: astore_1
    //   453: aload_1
    //   454: invokevirtual 181	java/io/IOException:printStackTrace	()V
    //   457: return
    //   458: astore_2
    //   459: aconst_null
    //   460: astore_3
    //   461: aconst_null
    //   462: astore_1
    //   463: aload 6
    //   465: astore 4
    //   467: goto -69 -> 398
    //   470: astore_2
    //   471: aconst_null
    //   472: astore_3
    //   473: aload 6
    //   475: astore 4
    //   477: goto -79 -> 398
    //   480: astore_2
    //   481: aload 6
    //   483: astore 4
    //   485: goto -87 -> 398
    //   488: astore 6
    //   490: aload_2
    //   491: astore 5
    //   493: aload 4
    //   495: astore_3
    //   496: aload 6
    //   498: astore_2
    //   499: aload_1
    //   500: astore 4
    //   502: aload 5
    //   504: astore_1
    //   505: goto -107 -> 398
    //   508: astore_3
    //   509: aconst_null
    //   510: astore 5
    //   512: aload_1
    //   513: astore_2
    //   514: aload 5
    //   516: astore_1
    //   517: goto -167 -> 350
    //   520: astore 6
    //   522: aconst_null
    //   523: astore 5
    //   525: aload_3
    //   526: astore 4
    //   528: aload_1
    //   529: astore_2
    //   530: aload 6
    //   532: astore_3
    //   533: aload 5
    //   535: astore_1
    //   536: goto -186 -> 350
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	539	0	this	HttpConnectThread
    //   21	338	1	localObject1	Object
    //   381	40	1	localIOException1	java.io.IOException
    //   438	1	1	localObject2	Object
    //   444	2	1	localIOException2	java.io.IOException
    //   452	2	1	localIOException3	java.io.IOException
    //   462	74	1	localObject3	Object
    //   13	364	2	localObject4	Object
    //   387	5	2	localObject5	Object
    //   393	32	2	localObject6	Object
    //   440	1	2	localObject7	Object
    //   458	1	2	localObject8	Object
    //   470	1	2	localObject9	Object
    //   480	11	2	localObject10	Object
    //   498	32	2	localObject11	Object
    //   82	331	3	localObject12	Object
    //   436	1	3	localException1	Exception
    //   460	36	3	localObject13	Object
    //   508	18	3	localException2	Exception
    //   532	1	3	localException3	Exception
    //   4	523	4	localObject14	Object
    //   168	366	5	localObject15	Object
    //   1	1	6	localObject16	Object
    //   337	145	6	localException4	Exception
    //   488	9	6	localObject17	Object
    //   520	11	6	localException5	Exception
    //   29	115	7	i	int
    // Exception table:
    //   from	to	target	type
    //   170	177	337	java/lang/Exception
    //   182	198	337	java/lang/Exception
    //   327	334	337	java/lang/Exception
    //   391	393	337	java/lang/Exception
    //   358	362	381	java/io/IOException
    //   367	372	381	java/io/IOException
    //   376	380	381	java/io/IOException
    //   198	297	387	finally
    //   297	300	387	finally
    //   388	391	387	finally
    //   170	177	393	finally
    //   182	198	393	finally
    //   327	334	393	finally
    //   391	393	393	finally
    //   14	138	436	java/lang/Exception
    //   146	151	436	java/lang/Exception
    //   426	436	436	java/lang/Exception
    //   403	408	444	java/io/IOException
    //   412	416	444	java/io/IOException
    //   420	424	444	java/io/IOException
    //   305	310	452	java/io/IOException
    //   314	318	452	java/io/IOException
    //   322	326	452	java/io/IOException
    //   14	138	458	finally
    //   146	151	458	finally
    //   426	436	458	finally
    //   151	160	470	finally
    //   160	170	480	finally
    //   350	354	488	finally
    //   151	160	508	java/lang/Exception
    //   160	170	520	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\MultiAddressManager$HttpConnectThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */