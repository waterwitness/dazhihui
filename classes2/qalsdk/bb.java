package qalsdk;

class bb
  extends Thread
{
  bb(av paramav) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   4: iconst_0
    //   5: putfield 23	qalsdk/av:u	I
    //   8: aload_0
    //   9: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   12: iconst_0
    //   13: putfield 27	qalsdk/av:v	Z
    //   16: ldc 29
    //   18: invokevirtual 35	java/lang/String:getBytes	()[B
    //   21: pop
    //   22: sipush 128
    //   25: newarray <illegal type>
    //   27: astore_3
    //   28: aconst_null
    //   29: astore_2
    //   30: aconst_null
    //   31: astore 4
    //   33: aload_2
    //   34: astore_1
    //   35: new 37	java/net/URL
    //   38: dup
    //   39: ldc 39
    //   41: invokespecial 42	java/net/URL:<init>	(Ljava/lang/String;)V
    //   44: astore 5
    //   46: aload_2
    //   47: astore_1
    //   48: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   51: lstore 8
    //   53: aload_2
    //   54: astore_1
    //   55: invokestatic 54	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   58: ifeq +13 -> 71
    //   61: aload_2
    //   62: astore_1
    //   63: ldc 56
    //   65: iconst_2
    //   66: ldc 58
    //   68: invokestatic 62	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   71: aload_2
    //   72: astore_1
    //   73: aload 5
    //   75: invokevirtual 66	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   78: checkcast 68	java/net/HttpURLConnection
    //   81: astore_2
    //   82: aload_2
    //   83: ldc 70
    //   85: invokevirtual 73	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   88: aload_2
    //   89: sipush 10000
    //   92: invokevirtual 77	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   95: aload_2
    //   96: sipush 10000
    //   99: invokevirtual 80	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   102: aload_2
    //   103: iconst_1
    //   104: invokevirtual 84	java/net/HttpURLConnection:setDoInput	(Z)V
    //   107: aload_2
    //   108: invokevirtual 88	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   111: aload_3
    //   112: invokevirtual 94	java/io/InputStream:read	([B)I
    //   115: istore 6
    //   117: aload_2
    //   118: invokevirtual 98	java/net/HttpURLConnection:getResponseCode	()I
    //   121: istore 7
    //   123: iload 7
    //   125: sipush 200
    //   128: if_icmpne +107 -> 235
    //   131: aload 5
    //   133: invokevirtual 102	java/net/URL:getHost	()Ljava/lang/String;
    //   136: aload_2
    //   137: invokevirtual 106	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   140: invokevirtual 102	java/net/URL:getHost	()Ljava/lang/String;
    //   143: invokevirtual 110	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   146: ifeq +89 -> 235
    //   149: ldc 56
    //   151: iconst_1
    //   152: new 112	java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   159: ldc 115
    //   161: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: iload 7
    //   166: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   169: ldc 124
    //   171: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   177: lload 8
    //   179: lsub
    //   180: invokevirtual 127	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   183: ldc -127
    //   185: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: iload 6
    //   190: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   193: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   196: invokestatic 62	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   199: aload_0
    //   200: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   203: iload 7
    //   205: putfield 23	qalsdk/av:u	I
    //   208: aload_0
    //   209: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   212: iconst_1
    //   213: putfield 27	qalsdk/av:v	Z
    //   216: aload_2
    //   217: ifnull +7 -> 224
    //   220: aload_2
    //   221: invokevirtual 135	java/net/HttpURLConnection:disconnect	()V
    //   224: aload_0
    //   225: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   228: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   231: putfield 139	qalsdk/av:x	J
    //   234: return
    //   235: new 112	java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   242: ldc -115
    //   244: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: iload 7
    //   249: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   252: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   255: pop
    //   256: ldc 56
    //   258: iconst_1
    //   259: new 112	java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   266: ldc -113
    //   268: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: iload 7
    //   273: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   276: ldc -127
    //   278: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: iload 6
    //   283: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   289: invokestatic 62	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   292: goto -76 -> 216
    //   295: astore_3
    //   296: aload_2
    //   297: astore_1
    //   298: aload_3
    //   299: invokevirtual 144	java/lang/Throwable:toString	()Ljava/lang/String;
    //   302: astore 4
    //   304: aload_2
    //   305: astore_1
    //   306: aload_0
    //   307: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   310: iconst_0
    //   311: putfield 23	qalsdk/av:u	I
    //   314: aload_2
    //   315: astore_1
    //   316: aload_0
    //   317: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   320: iconst_0
    //   321: putfield 27	qalsdk/av:v	Z
    //   324: aload_2
    //   325: astore_1
    //   326: ldc 56
    //   328: iconst_1
    //   329: new 112	java/lang/StringBuilder
    //   332: dup
    //   333: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   336: ldc -110
    //   338: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: aload 4
    //   343: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 132	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: aload_3
    //   350: invokestatic 149	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   353: aload_2
    //   354: ifnull +7 -> 361
    //   357: aload_2
    //   358: invokevirtual 135	java/net/HttpURLConnection:disconnect	()V
    //   361: aload_0
    //   362: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   365: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   368: putfield 139	qalsdk/av:x	J
    //   371: return
    //   372: astore_3
    //   373: aload_1
    //   374: astore_2
    //   375: aload_3
    //   376: astore_1
    //   377: aload_2
    //   378: ifnull +7 -> 385
    //   381: aload_2
    //   382: invokevirtual 135	java/net/HttpURLConnection:disconnect	()V
    //   385: aload_0
    //   386: getfield 10	qalsdk/bb:a	Lqalsdk/av;
    //   389: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   392: putfield 139	qalsdk/av:x	J
    //   395: aload_1
    //   396: athrow
    //   397: astore_1
    //   398: goto -21 -> 377
    //   401: astore_3
    //   402: aload 4
    //   404: astore_2
    //   405: goto -109 -> 296
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	408	0	this	bb
    //   34	362	1	localObject1	Object
    //   397	1	1	localObject2	Object
    //   29	376	2	localObject3	Object
    //   27	85	3	arrayOfByte	byte[]
    //   295	55	3	localThrowable1	Throwable
    //   372	4	3	localObject4	Object
    //   401	1	3	localThrowable2	Throwable
    //   31	372	4	str	String
    //   44	88	5	localURL	java.net.URL
    //   115	167	6	i	int
    //   121	151	7	j	int
    //   51	127	8	l	long
    // Exception table:
    //   from	to	target	type
    //   82	123	295	java/lang/Throwable
    //   131	216	295	java/lang/Throwable
    //   235	292	295	java/lang/Throwable
    //   35	46	372	finally
    //   48	53	372	finally
    //   55	61	372	finally
    //   63	71	372	finally
    //   73	82	372	finally
    //   298	304	372	finally
    //   306	314	372	finally
    //   316	324	372	finally
    //   326	353	372	finally
    //   82	123	397	finally
    //   131	216	397	finally
    //   235	292	397	finally
    //   35	46	401	java/lang/Throwable
    //   48	53	401	java/lang/Throwable
    //   55	61	401	java/lang/Throwable
    //   63	71	401	java/lang/Throwable
    //   73	82	401	java/lang/Throwable
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */