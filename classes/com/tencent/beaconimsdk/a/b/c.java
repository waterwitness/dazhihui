package com.tencent.beaconimsdk.a.b;

import android.content.Context;
import com.tencent.beaconimsdk.a.e;

public final class c
  implements Runnable
{
  private static long a = 0L;
  private Context b = null;
  
  public c(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private static long a()
  {
    try
    {
      long l = a;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void a(long paramLong)
  {
    try
    {
      a = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static boolean a(Context paramContext)
  {
    try
    {
      int i = Integer.parseInt(com.tencent.beaconimsdk.a.a.b(paramContext, "querytimes", "0"));
      String str = com.tencent.beaconimsdk.a.a.b(paramContext, "initsdkdate", "");
      if (!e.e().equals(str))
      {
        com.tencent.beaconimsdk.a.a.b(paramContext, e.e());
        i = 0;
      }
      if (i <= d.a().f())
      {
        com.tencent.beaconimsdk.a.a.a(paramContext, String.valueOf(i + 1));
        return false;
      }
      bool = true;
      com.tencent.beaconimsdk.c.a.c(" set init times failed! ", new Object[0]);
    }
    catch (Exception paramContext)
    {
      try
      {
        com.tencent.beaconimsdk.c.a.e(" sdk init max times", new Object[0]);
        return true;
      }
      catch (Exception paramContext)
      {
        boolean bool;
        for (;;) {}
      }
      paramContext = paramContext;
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   4: invokestatic 96	com/tencent/beaconimsdk/a/e:h	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/g;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull +54 -> 63
    //   12: aload_1
    //   13: invokevirtual 100	com/tencent/beaconimsdk/a/b/g:b	()I
    //   16: bipush 101
    //   18: if_icmpne +45 -> 63
    //   21: aload_1
    //   22: invokevirtual 103	com/tencent/beaconimsdk/a/b/g:c	()[B
    //   25: ifnull +38 -> 63
    //   28: aload_0
    //   29: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   32: invokestatic 108	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   35: invokevirtual 111	com/tencent/beaconimsdk/a/b/b:f	()Lcom/tencent/beaconimsdk/upload/e;
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +23 -> 63
    //   43: aload_2
    //   44: bipush 101
    //   46: aload_1
    //   47: invokevirtual 103	com/tencent/beaconimsdk/a/b/g:c	()[B
    //   50: iconst_0
    //   51: invokevirtual 116	com/tencent/beaconimsdk/upload/e:a	(I[BZ)V
    //   54: ldc 118
    //   56: iconst_0
    //   57: anewarray 4	java/lang/Object
    //   60: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: aload_0
    //   64: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   67: invokestatic 108	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   70: astore_2
    //   71: aload_2
    //   72: invokevirtual 121	com/tencent/beaconimsdk/a/b/b:j	()I
    //   75: ifne +180 -> 255
    //   78: ldc 123
    //   80: iconst_0
    //   81: anewarray 4	java/lang/Object
    //   84: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_2
    //   88: iconst_1
    //   89: invokevirtual 126	com/tencent/beaconimsdk/a/b/b:a	(I)V
    //   92: aload_0
    //   93: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   96: invokestatic 128	com/tencent/beaconimsdk/a/a:c	(Landroid/content/Context;)Z
    //   99: istore 7
    //   101: ldc -126
    //   103: iconst_1
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: iload 7
    //   111: invokestatic 135	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   114: aastore
    //   115: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: iload 7
    //   120: ifeq +101 -> 221
    //   123: ldc -119
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload_0
    //   132: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   135: aconst_null
    //   136: invokestatic 142	com/tencent/beaconimsdk/a/a/a:a	(Landroid/content/Context;[I)I
    //   139: invokestatic 145	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   142: aastore
    //   143: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: aload_2
    //   147: monitorenter
    //   148: ldc -109
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_2
    //   158: invokevirtual 151	com/tencent/beaconimsdk/a/b/b:i	()[Lcom/tencent/beaconimsdk/a/b/a;
    //   161: astore_1
    //   162: aload_2
    //   163: invokevirtual 153	com/tencent/beaconimsdk/a/b/b:h	()V
    //   166: aload_2
    //   167: monitorexit
    //   168: aload_1
    //   169: ifnull +86 -> 255
    //   172: ldc -101
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_1
    //   182: arraylength
    //   183: istore 4
    //   185: iconst_0
    //   186: istore_3
    //   187: iload_3
    //   188: iload 4
    //   190: if_icmpge +65 -> 255
    //   193: aload_1
    //   194: iload_3
    //   195: aaload
    //   196: invokeinterface 159 1 0
    //   201: iload_3
    //   202: iconst_1
    //   203: iadd
    //   204: istore_3
    //   205: goto -18 -> 187
    //   208: astore_1
    //   209: aload_1
    //   210: invokestatic 162	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   213: goto -150 -> 63
    //   216: astore_1
    //   217: aload_2
    //   218: monitorexit
    //   219: aload_1
    //   220: athrow
    //   221: invokestatic 164	com/tencent/beaconimsdk/a/b/c:a	()J
    //   224: lstore 5
    //   226: lload 5
    //   228: lconst_0
    //   229: lcmp
    //   230: ifle +25 -> 255
    //   233: ldc -90
    //   235: iconst_1
    //   236: anewarray 4	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: lload 5
    //   243: invokestatic 171	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   246: aastore
    //   247: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: lload 5
    //   252: invokestatic 176	java/lang/Thread:sleep	(J)V
    //   255: aload_2
    //   256: monitorenter
    //   257: ldc -78
    //   259: iconst_0
    //   260: anewarray 4	java/lang/Object
    //   263: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: aload_2
    //   267: invokevirtual 151	com/tencent/beaconimsdk/a/b/b:i	()[Lcom/tencent/beaconimsdk/a/b/a;
    //   270: astore_1
    //   271: aload_2
    //   272: iconst_2
    //   273: invokevirtual 126	com/tencent/beaconimsdk/a/b/b:a	(I)V
    //   276: aload_2
    //   277: monitorexit
    //   278: aload_1
    //   279: ifnull +52 -> 331
    //   282: ldc -76
    //   284: iconst_0
    //   285: anewarray 4	java/lang/Object
    //   288: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: aload_1
    //   292: arraylength
    //   293: istore 4
    //   295: iconst_0
    //   296: istore_3
    //   297: iload_3
    //   298: iload 4
    //   300: if_icmpge +31 -> 331
    //   303: aload_1
    //   304: iload_3
    //   305: aaload
    //   306: invokeinterface 182 1 0
    //   311: iload_3
    //   312: iconst_1
    //   313: iadd
    //   314: istore_3
    //   315: goto -18 -> 297
    //   318: astore_1
    //   319: aload_1
    //   320: invokestatic 162	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   323: goto -68 -> 255
    //   326: astore_1
    //   327: aload_2
    //   328: monitorexit
    //   329: aload_1
    //   330: athrow
    //   331: invokestatic 65	com/tencent/beaconimsdk/a/b/d:a	()Lcom/tencent/beaconimsdk/a/b/d;
    //   334: invokevirtual 186	com/tencent/beaconimsdk/a/b/d:g	()Z
    //   337: ifne +76 -> 413
    //   340: invokestatic 189	com/tencent/beaconimsdk/a/b/b:c	()Lcom/tencent/beaconimsdk/upload/f;
    //   343: astore_1
    //   344: iconst_0
    //   345: istore_3
    //   346: aload_1
    //   347: ifnonnull +33 -> 380
    //   350: iload_3
    //   351: iconst_1
    //   352: iadd
    //   353: istore_3
    //   354: iload_3
    //   355: iconst_5
    //   356: if_icmpge +24 -> 380
    //   359: ldc2_w 190
    //   362: invokestatic 176	java/lang/Thread:sleep	(J)V
    //   365: invokestatic 189	com/tencent/beaconimsdk/a/b/b:c	()Lcom/tencent/beaconimsdk/upload/f;
    //   368: astore_1
    //   369: goto -23 -> 346
    //   372: astore_1
    //   373: aload_1
    //   374: invokestatic 162	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   377: goto -12 -> 365
    //   380: aload_1
    //   381: ifnull +115 -> 496
    //   384: aload_0
    //   385: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   388: invokestatic 193	com/tencent/beaconimsdk/a/b/c:a	(Landroid/content/Context;)Z
    //   391: ifeq +85 -> 476
    //   394: ldc -61
    //   396: iconst_0
    //   397: anewarray 4	java/lang/Object
    //   400: invokestatic 87	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: aload_0
    //   404: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   407: invokestatic 108	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   410: invokevirtual 197	com/tencent/beaconimsdk/a/b/b:b	()V
    //   413: ldc -57
    //   415: iconst_0
    //   416: anewarray 4	java/lang/Object
    //   419: invokestatic 201	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   422: aload_2
    //   423: monitorenter
    //   424: aload_2
    //   425: invokevirtual 151	com/tencent/beaconimsdk/a/b/b:i	()[Lcom/tencent/beaconimsdk/a/b/a;
    //   428: astore_1
    //   429: aload_2
    //   430: iconst_3
    //   431: invokevirtual 126	com/tencent/beaconimsdk/a/b/b:a	(I)V
    //   434: aload_2
    //   435: monitorexit
    //   436: aload_1
    //   437: ifnull +76 -> 513
    //   440: ldc -53
    //   442: iconst_0
    //   443: anewarray 4	java/lang/Object
    //   446: invokestatic 82	com/tencent/beaconimsdk/c/a:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: aload_1
    //   450: arraylength
    //   451: istore 4
    //   453: iconst_0
    //   454: istore_3
    //   455: iload_3
    //   456: iload 4
    //   458: if_icmpge +55 -> 513
    //   461: aload_1
    //   462: iload_3
    //   463: aaload
    //   464: invokeinterface 204 1 0
    //   469: iload_3
    //   470: iconst_1
    //   471: iadd
    //   472: istore_3
    //   473: goto -18 -> 455
    //   476: aload_1
    //   477: new 206	com/tencent/beaconimsdk/upload/c
    //   480: dup
    //   481: aload_0
    //   482: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   485: invokespecial 208	com/tencent/beaconimsdk/upload/c:<init>	(Landroid/content/Context;)V
    //   488: invokeinterface 213 2 0
    //   493: goto -80 -> 413
    //   496: ldc -41
    //   498: iconst_0
    //   499: anewarray 4	java/lang/Object
    //   502: invokestatic 201	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   505: goto -92 -> 413
    //   508: astore_1
    //   509: aload_2
    //   510: monitorexit
    //   511: aload_1
    //   512: athrow
    //   513: aload_0
    //   514: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   517: invokestatic 108	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   520: invokevirtual 217	com/tencent/beaconimsdk/a/b/b:e	()Lcom/tencent/beaconimsdk/a/b/d;
    //   523: astore_1
    //   524: aload_1
    //   525: ifnonnull +13 -> 538
    //   528: ldc -37
    //   530: iconst_0
    //   531: anewarray 4	java/lang/Object
    //   534: invokestatic 222	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   537: return
    //   538: aload_1
    //   539: invokevirtual 224	com/tencent/beaconimsdk/a/b/d:c	()I
    //   542: ldc -31
    //   544: imul
    //   545: i2l
    //   546: lstore 5
    //   548: lload 5
    //   550: lconst_0
    //   551: lcmp
    //   552: ifle +41 -> 593
    //   555: invokestatic 230	com/tencent/beaconimsdk/a/b:a	()Lcom/tencent/beaconimsdk/a/b;
    //   558: aload_0
    //   559: lload 5
    //   561: invokevirtual 233	com/tencent/beaconimsdk/a/b:a	(Ljava/lang/Runnable;J)V
    //   564: ldc -21
    //   566: iconst_1
    //   567: anewarray 4	java/lang/Object
    //   570: dup
    //   571: iconst_0
    //   572: lload 5
    //   574: invokestatic 171	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   577: aastore
    //   578: invokestatic 201	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   581: aload_0
    //   582: getfield 21	com/tencent/beaconimsdk/a/b/c:b	Landroid/content/Context;
    //   585: invokestatic 108	com/tencent/beaconimsdk/a/b/b:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/b/b;
    //   588: iconst_4
    //   589: invokevirtual 126	com/tencent/beaconimsdk/a/b/b:a	(I)V
    //   592: return
    //   593: ldc -19
    //   595: iconst_0
    //   596: anewarray 4	java/lang/Object
    //   599: invokestatic 201	com/tencent/beaconimsdk/c/a:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   602: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	603	0	this	c
    //   7	187	1	localObject1	Object
    //   208	2	1	localThrowable	Throwable
    //   216	4	1	localObject2	Object
    //   270	34	1	arrayOfa1	a[]
    //   318	2	1	localInterruptedException1	InterruptedException
    //   326	4	1	localObject3	Object
    //   343	26	1	localf	com.tencent.beaconimsdk.upload.f
    //   372	9	1	localInterruptedException2	InterruptedException
    //   428	49	1	arrayOfa2	a[]
    //   508	4	1	localObject4	Object
    //   523	16	1	locald	d
    //   38	472	2	localObject5	Object
    //   186	287	3	i	int
    //   183	276	4	j	int
    //   224	349	5	l	long
    //   99	20	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   28	39	208	java/lang/Throwable
    //   43	63	208	java/lang/Throwable
    //   148	168	216	finally
    //   250	255	318	java/lang/InterruptedException
    //   257	278	326	finally
    //   359	365	372	java/lang/InterruptedException
    //   424	436	508	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */