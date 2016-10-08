package com.android.thinkive.framework;

import com.android.thinkive.framework.config.AddressConfigBean;

class MultiAddressManager$SocketConnectThread
  extends Thread
{
  private AddressConfigBean addressConfigBean;
  private String urlAddress;
  private String urlName;
  
  public MultiAddressManager$SocketConnectThread(MultiAddressManager paramMultiAddressManager, AddressConfigBean paramAddressConfigBean, String paramString)
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
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 7
    //   5: aconst_null
    //   6: astore_1
    //   7: aconst_null
    //   8: astore 9
    //   10: aconst_null
    //   11: astore 8
    //   13: aconst_null
    //   14: astore 6
    //   16: aload_0
    //   17: getfield 20	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlAddress	Ljava/lang/String;
    //   20: invokestatic 43	com/android/thinkive/framework/util/FormatUtil:formatUrlToHost	(Ljava/lang/String;)Ljava/lang/String;
    //   23: astore 4
    //   25: aload_0
    //   26: getfield 20	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlAddress	Ljava/lang/String;
    //   29: invokestatic 47	com/android/thinkive/framework/util/FormatUtil:formatUrlToPort	(Ljava/lang/String;)I
    //   32: istore 11
    //   34: new 49	java/net/Socket
    //   37: dup
    //   38: invokespecial 50	java/net/Socket:<init>	()V
    //   41: astore_2
    //   42: aload_2
    //   43: sipush 2000
    //   46: invokevirtual 54	java/net/Socket:setSoTimeout	(I)V
    //   49: new 56	java/lang/StringBuilder
    //   52: dup
    //   53: ldc 58
    //   55: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: getfield 20	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlAddress	Ljava/lang/String;
    //   62: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc 67
    //   67: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload 4
    //   72: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc 69
    //   77: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: iload 11
    //   82: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 80	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   91: aload_2
    //   92: new 82	java/net/InetSocketAddress
    //   95: dup
    //   96: aload 4
    //   98: iload 11
    //   100: invokespecial 85	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   103: invokevirtual 89	java/net/Socket:connect	(Ljava/net/SocketAddress;)V
    //   106: aload_2
    //   107: invokevirtual 93	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   110: astore 5
    //   112: aload_2
    //   113: astore 4
    //   115: aload 9
    //   117: astore_1
    //   118: aload 5
    //   120: astore_3
    //   121: aload 8
    //   123: astore 7
    //   125: aload_2
    //   126: invokevirtual 97	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   129: astore 8
    //   131: aload 8
    //   133: astore 6
    //   135: aload_2
    //   136: astore 4
    //   138: aload 8
    //   140: astore_1
    //   141: aload 5
    //   143: astore_3
    //   144: aload 8
    //   146: astore 7
    //   148: new 99	com/android/thinkive/framework/network/packet/SpeedPacket
    //   151: dup
    //   152: invokespecial 100	com/android/thinkive/framework/network/packet/SpeedPacket:<init>	()V
    //   155: aload 8
    //   157: invokeinterface 106 2 0
    //   162: aload 8
    //   164: astore 6
    //   166: aload_2
    //   167: astore 4
    //   169: aload 8
    //   171: astore_1
    //   172: aload 5
    //   174: astore_3
    //   175: aload 8
    //   177: astore 7
    //   179: aload 5
    //   181: sipush 1024
    //   184: newarray <illegal type>
    //   186: invokevirtual 112	java/io/InputStream:read	([B)I
    //   189: istore 11
    //   191: iload 11
    //   193: iconst_m1
    //   194: if_icmpeq +151 -> 345
    //   197: iload 11
    //   199: ifle +146 -> 345
    //   202: aload 8
    //   204: astore 6
    //   206: aload_2
    //   207: astore 4
    //   209: aload 8
    //   211: astore_1
    //   212: aload 5
    //   214: astore_3
    //   215: aload 8
    //   217: astore 7
    //   219: aload_0
    //   220: getfield 15	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   223: astore 9
    //   225: aload 8
    //   227: astore 6
    //   229: aload_2
    //   230: astore 4
    //   232: aload 8
    //   234: astore_1
    //   235: aload 5
    //   237: astore_3
    //   238: aload 8
    //   240: astore 7
    //   242: aload 9
    //   244: monitorenter
    //   245: new 56	java/lang/StringBuilder
    //   248: dup
    //   249: ldc 114
    //   251: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   254: aload_0
    //   255: getfield 20	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlAddress	Ljava/lang/String;
    //   258: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc 116
    //   263: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: iload 11
    //   268: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   271: ldc 118
    //   273: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: aload_0
    //   277: getfield 30	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   280: invokevirtual 122	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   283: invokevirtual 128	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   286: invokevirtual 131	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   289: invokevirtual 75	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: invokestatic 134	com/android/thinkive/framework/util/Log:i	(Ljava/lang/String;)V
    //   295: aload_0
    //   296: getfield 30	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   299: invokevirtual 122	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   302: invokevirtual 128	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   305: ifne +37 -> 342
    //   308: aload_0
    //   309: getfield 30	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   312: invokevirtual 122	com/android/thinkive/framework/config/AddressConfigBean:getIsSpeeded	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   315: iconst_1
    //   316: invokevirtual 138	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   319: pop
    //   320: aload_0
    //   321: getfield 30	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:addressConfigBean	Lcom/android/thinkive/framework/config/AddressConfigBean;
    //   324: aload_0
    //   325: getfield 20	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlAddress	Ljava/lang/String;
    //   328: invokevirtual 141	com/android/thinkive/framework/config/AddressConfigBean:setPriorityValue	(Ljava/lang/String;)V
    //   331: aload_0
    //   332: getfield 15	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:this$0	Lcom/android/thinkive/framework/MultiAddressManager;
    //   335: aload_0
    //   336: getfield 28	com/android/thinkive/framework/MultiAddressManager$SocketConnectThread:urlName	Ljava/lang/String;
    //   339: invokestatic 147	com/android/thinkive/framework/MultiAddressManager:access$1	(Lcom/android/thinkive/framework/MultiAddressManager;Ljava/lang/String;)V
    //   342: aload 9
    //   344: monitorexit
    //   345: aload 5
    //   347: ifnull +8 -> 355
    //   350: aload 5
    //   352: invokevirtual 150	java/io/InputStream:close	()V
    //   355: aload 8
    //   357: ifnull +8 -> 365
    //   360: aload 8
    //   362: invokevirtual 153	java/io/OutputStream:close	()V
    //   365: aload_2
    //   366: ifnull +7 -> 373
    //   369: aload_2
    //   370: invokevirtual 154	java/net/Socket:close	()V
    //   373: return
    //   374: astore 10
    //   376: aload 9
    //   378: monitorexit
    //   379: aload 8
    //   381: astore 6
    //   383: aload_2
    //   384: astore 4
    //   386: aload 8
    //   388: astore_1
    //   389: aload 5
    //   391: astore_3
    //   392: aload 8
    //   394: astore 7
    //   396: aload 10
    //   398: athrow
    //   399: astore_1
    //   400: aload 6
    //   402: astore 7
    //   404: aload_1
    //   405: astore 6
    //   407: aload_2
    //   408: astore 4
    //   410: aload 7
    //   412: astore_1
    //   413: aload 5
    //   415: astore_3
    //   416: aload 6
    //   418: invokevirtual 157	java/net/SocketException:printStackTrace	()V
    //   421: aload 5
    //   423: ifnull +8 -> 431
    //   426: aload 5
    //   428: invokevirtual 150	java/io/InputStream:close	()V
    //   431: aload 7
    //   433: ifnull +8 -> 441
    //   436: aload 7
    //   438: invokevirtual 153	java/io/OutputStream:close	()V
    //   441: aload_2
    //   442: ifnull -69 -> 373
    //   445: aload_2
    //   446: invokevirtual 154	java/net/Socket:close	()V
    //   449: return
    //   450: astore_1
    //   451: aload_1
    //   452: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   455: return
    //   456: astore 6
    //   458: aconst_null
    //   459: astore_2
    //   460: aconst_null
    //   461: astore 5
    //   463: aload_2
    //   464: astore 4
    //   466: aload 7
    //   468: astore_1
    //   469: aload 5
    //   471: astore_3
    //   472: aload 6
    //   474: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   477: aload 5
    //   479: ifnull +8 -> 487
    //   482: aload 5
    //   484: invokevirtual 150	java/io/InputStream:close	()V
    //   487: aload 7
    //   489: ifnull +8 -> 497
    //   492: aload 7
    //   494: invokevirtual 153	java/io/OutputStream:close	()V
    //   497: aload_2
    //   498: ifnull -125 -> 373
    //   501: aload_2
    //   502: invokevirtual 154	java/net/Socket:close	()V
    //   505: return
    //   506: astore_1
    //   507: aload_1
    //   508: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   511: return
    //   512: astore 5
    //   514: aconst_null
    //   515: astore_2
    //   516: aconst_null
    //   517: astore_3
    //   518: aload_3
    //   519: ifnull +7 -> 526
    //   522: aload_3
    //   523: invokevirtual 150	java/io/InputStream:close	()V
    //   526: aload_1
    //   527: ifnull +7 -> 534
    //   530: aload_1
    //   531: invokevirtual 153	java/io/OutputStream:close	()V
    //   534: aload_2
    //   535: ifnull +7 -> 542
    //   538: aload_2
    //   539: invokevirtual 154	java/net/Socket:close	()V
    //   542: aload 5
    //   544: athrow
    //   545: astore_1
    //   546: aload_1
    //   547: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   550: goto -8 -> 542
    //   553: astore_1
    //   554: aload_1
    //   555: invokevirtual 158	java/io/IOException:printStackTrace	()V
    //   558: return
    //   559: astore 5
    //   561: aconst_null
    //   562: astore_3
    //   563: goto -45 -> 518
    //   566: astore 5
    //   568: aload 4
    //   570: astore_2
    //   571: goto -53 -> 518
    //   574: astore 6
    //   576: aconst_null
    //   577: astore 5
    //   579: goto -116 -> 463
    //   582: astore 6
    //   584: goto -121 -> 463
    //   587: astore 6
    //   589: aconst_null
    //   590: astore_2
    //   591: aconst_null
    //   592: astore 5
    //   594: aload_3
    //   595: astore 7
    //   597: goto -190 -> 407
    //   600: astore 6
    //   602: aconst_null
    //   603: astore 5
    //   605: aload_3
    //   606: astore 7
    //   608: goto -201 -> 407
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	611	0	this	SocketConnectThread
    //   6	383	1	localObject1	Object
    //   399	6	1	localSocketException1	java.net.SocketException
    //   412	1	1	localObject2	Object
    //   450	2	1	localIOException1	java.io.IOException
    //   468	1	1	localObject3	Object
    //   506	25	1	localIOException2	java.io.IOException
    //   545	2	1	localIOException3	java.io.IOException
    //   553	2	1	localIOException4	java.io.IOException
    //   41	550	2	localObject4	Object
    //   1	605	3	localObject5	Object
    //   23	546	4	localObject6	Object
    //   110	373	5	localInputStream	java.io.InputStream
    //   512	31	5	localObject7	Object
    //   559	1	5	localObject8	Object
    //   566	1	5	localObject9	Object
    //   577	27	5	localObject10	Object
    //   14	403	6	localObject11	Object
    //   456	17	6	localIOException5	java.io.IOException
    //   574	1	6	localIOException6	java.io.IOException
    //   582	1	6	localIOException7	java.io.IOException
    //   587	1	6	localSocketException2	java.net.SocketException
    //   600	1	6	localSocketException3	java.net.SocketException
    //   3	604	7	localObject12	Object
    //   11	382	8	localOutputStream	java.io.OutputStream
    //   8	369	9	localMultiAddressManager	MultiAddressManager
    //   374	23	10	localObject13	Object
    //   32	235	11	i	int
    // Exception table:
    //   from	to	target	type
    //   245	342	374	finally
    //   342	345	374	finally
    //   376	379	374	finally
    //   125	131	399	java/net/SocketException
    //   148	162	399	java/net/SocketException
    //   179	191	399	java/net/SocketException
    //   219	225	399	java/net/SocketException
    //   242	245	399	java/net/SocketException
    //   396	399	399	java/net/SocketException
    //   426	431	450	java/io/IOException
    //   436	441	450	java/io/IOException
    //   445	449	450	java/io/IOException
    //   16	42	456	java/io/IOException
    //   482	487	506	java/io/IOException
    //   492	497	506	java/io/IOException
    //   501	505	506	java/io/IOException
    //   16	42	512	finally
    //   522	526	545	java/io/IOException
    //   530	534	545	java/io/IOException
    //   538	542	545	java/io/IOException
    //   350	355	553	java/io/IOException
    //   360	365	553	java/io/IOException
    //   369	373	553	java/io/IOException
    //   42	112	559	finally
    //   125	131	566	finally
    //   148	162	566	finally
    //   179	191	566	finally
    //   219	225	566	finally
    //   242	245	566	finally
    //   396	399	566	finally
    //   416	421	566	finally
    //   472	477	566	finally
    //   42	112	574	java/io/IOException
    //   125	131	582	java/io/IOException
    //   148	162	582	java/io/IOException
    //   179	191	582	java/io/IOException
    //   219	225	582	java/io/IOException
    //   242	245	582	java/io/IOException
    //   396	399	582	java/io/IOException
    //   16	42	587	java/net/SocketException
    //   42	112	600	java/net/SocketException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\MultiAddressManager$SocketConnectThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */