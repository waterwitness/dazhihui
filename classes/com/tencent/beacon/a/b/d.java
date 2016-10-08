package com.tencent.beacon.a.b;

import android.content.Context;
import com.tencent.beacon.b.a;

public final class d
  implements Runnable
{
  private static long b = 0L;
  Context a = null;
  
  public d(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static long a()
  {
    try
    {
      long l = b;
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
      b = paramLong;
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
      int i = Integer.parseInt(com.tencent.beacon.a.b.b(paramContext, "querytimes", "0"));
      String str = com.tencent.beacon.a.b.b(paramContext, "initsdkdate", "");
      if (!a.t().equals(str))
      {
        com.tencent.beacon.a.b.c(paramContext, a.t());
        i = 0;
      }
      if (i <= e.a().h())
      {
        com.tencent.beacon.a.b.b(paramContext, i + 1);
        return false;
      }
      bool = true;
      com.tencent.beacon.e.b.c(" set init times failed! ", new Object[0]);
    }
    catch (Exception paramContext)
    {
      try
      {
        com.tencent.beacon.e.b.e(" sdk init max times", new Object[0]);
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
    //   1: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   4: bipush 101
    //   6: invokestatic 104	com/tencent/beacon/a/h:a	(Landroid/content/Context;I)Lcom/tencent/beacon/a/b/h;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +56 -> 67
    //   14: aload_1
    //   15: invokevirtual 108	com/tencent/beacon/a/b/h:b	()I
    //   18: bipush 101
    //   20: if_icmpne +47 -> 67
    //   23: aload_1
    //   24: invokevirtual 111	com/tencent/beacon/a/b/h:c	()[B
    //   27: ifnull +40 -> 67
    //   30: aload_0
    //   31: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   34: invokestatic 116	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   37: invokevirtual 119	com/tencent/beacon/a/b/c:e	()Lcom/tencent/beacon/upload/g;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnull +25 -> 67
    //   45: aload_2
    //   46: bipush 101
    //   48: aload_1
    //   49: invokevirtual 111	com/tencent/beacon/a/b/h:c	()[B
    //   52: iconst_0
    //   53: invokeinterface 124 4 0
    //   58: ldc 126
    //   60: iconst_0
    //   61: anewarray 4	java/lang/Object
    //   64: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_0
    //   68: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   71: invokestatic 116	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   74: astore_2
    //   75: aload_2
    //   76: invokevirtual 127	com/tencent/beacon/a/b/c:h	()I
    //   79: ifne +192 -> 271
    //   82: ldc -127
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_2
    //   92: iconst_1
    //   93: invokevirtual 132	com/tencent/beacon/a/b/c:a	(I)V
    //   96: aload_0
    //   97: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   100: invokestatic 135	com/tencent/beacon/a/b:d	(Landroid/content/Context;)Z
    //   103: istore 8
    //   105: ldc -119
    //   107: iconst_1
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: iload 8
    //   115: invokestatic 143	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   118: aastore
    //   119: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: iload 8
    //   124: ifeq +113 -> 237
    //   127: ldc -111
    //   129: iconst_1
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_0
    //   136: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   139: aconst_null
    //   140: ldc2_w 146
    //   143: ldc2_w 148
    //   146: invokestatic 154	com/tencent/beacon/a/a/a:a	(Landroid/content/Context;[IJJ)I
    //   149: invokestatic 157	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   152: aastore
    //   153: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload_2
    //   157: monitorenter
    //   158: ldc -97
    //   160: iconst_0
    //   161: anewarray 4	java/lang/Object
    //   164: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: aload_2
    //   168: invokevirtual 163	com/tencent/beacon/a/b/c:g	()[Lcom/tencent/beacon/a/b/b;
    //   171: astore_1
    //   172: aload_2
    //   173: iconst_1
    //   174: invokevirtual 166	com/tencent/beacon/a/b/c:b	(Z)V
    //   177: aload_2
    //   178: monitorexit
    //   179: aload_1
    //   180: ifnull +91 -> 271
    //   183: ldc -88
    //   185: iconst_0
    //   186: anewarray 4	java/lang/Object
    //   189: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_1
    //   193: arraylength
    //   194: istore 5
    //   196: iconst_0
    //   197: istore 4
    //   199: iload 4
    //   201: iload 5
    //   203: if_icmpge +68 -> 271
    //   206: aload_1
    //   207: iload 4
    //   209: aaload
    //   210: invokeinterface 172 1 0
    //   215: iload 4
    //   217: iconst_1
    //   218: iadd
    //   219: istore 4
    //   221: goto -22 -> 199
    //   224: astore_1
    //   225: aload_1
    //   226: invokevirtual 175	java/lang/Throwable:printStackTrace	()V
    //   229: goto -162 -> 67
    //   232: astore_1
    //   233: aload_2
    //   234: monitorexit
    //   235: aload_1
    //   236: athrow
    //   237: invokestatic 177	com/tencent/beacon/a/b/d:a	()J
    //   240: lstore 6
    //   242: lload 6
    //   244: lconst_0
    //   245: lcmp
    //   246: ifle +25 -> 271
    //   249: ldc -77
    //   251: iconst_1
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: lload 6
    //   259: invokestatic 184	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   262: aastore
    //   263: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: lload 6
    //   268: invokestatic 189	java/lang/Thread:sleep	(J)V
    //   271: aload_2
    //   272: monitorenter
    //   273: ldc -65
    //   275: iconst_0
    //   276: anewarray 4	java/lang/Object
    //   279: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload_2
    //   283: invokevirtual 163	com/tencent/beacon/a/b/c:g	()[Lcom/tencent/beacon/a/b/b;
    //   286: astore_1
    //   287: aload_2
    //   288: iconst_2
    //   289: invokevirtual 132	com/tencent/beacon/a/b/c:a	(I)V
    //   292: aload_2
    //   293: monitorexit
    //   294: aload_1
    //   295: ifnull +57 -> 352
    //   298: ldc -63
    //   300: iconst_0
    //   301: anewarray 4	java/lang/Object
    //   304: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   307: aload_1
    //   308: arraylength
    //   309: istore 5
    //   311: iconst_0
    //   312: istore 4
    //   314: iload 4
    //   316: iload 5
    //   318: if_icmpge +34 -> 352
    //   321: aload_1
    //   322: iload 4
    //   324: aaload
    //   325: invokeinterface 195 1 0
    //   330: iload 4
    //   332: iconst_1
    //   333: iadd
    //   334: istore 4
    //   336: goto -22 -> 314
    //   339: astore_1
    //   340: aload_1
    //   341: invokevirtual 196	java/lang/InterruptedException:printStackTrace	()V
    //   344: goto -73 -> 271
    //   347: astore_1
    //   348: aload_2
    //   349: monitorexit
    //   350: aload_1
    //   351: athrow
    //   352: invokestatic 66	com/tencent/beacon/a/b/e:a	()Lcom/tencent/beacon/a/b/e;
    //   355: invokevirtual 200	com/tencent/beacon/a/b/e:i	()Z
    //   358: ifne +81 -> 439
    //   361: invokestatic 203	com/tencent/beacon/a/b/c:b	()Lcom/tencent/beacon/upload/h;
    //   364: astore_1
    //   365: iconst_0
    //   366: istore 4
    //   368: aload_1
    //   369: ifnonnull +36 -> 405
    //   372: iload 4
    //   374: iconst_1
    //   375: iadd
    //   376: istore 4
    //   378: iload 4
    //   380: iconst_5
    //   381: if_icmpge +24 -> 405
    //   384: ldc2_w 204
    //   387: invokestatic 189	java/lang/Thread:sleep	(J)V
    //   390: invokestatic 203	com/tencent/beacon/a/b/c:b	()Lcom/tencent/beacon/upload/h;
    //   393: astore_1
    //   394: goto -26 -> 368
    //   397: astore_1
    //   398: aload_1
    //   399: invokevirtual 196	java/lang/InterruptedException:printStackTrace	()V
    //   402: goto -12 -> 390
    //   405: aload_1
    //   406: ifnull +244 -> 650
    //   409: aload_0
    //   410: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   413: invokestatic 207	com/tencent/beacon/a/b/d:a	(Landroid/content/Context;)Z
    //   416: ifeq +91 -> 507
    //   419: ldc -47
    //   421: iconst_0
    //   422: anewarray 4	java/lang/Object
    //   425: invokestatic 94	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   428: aload_0
    //   429: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   432: invokestatic 116	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   435: iconst_1
    //   436: invokevirtual 211	com/tencent/beacon/a/b/c:a	(Z)V
    //   439: ldc -43
    //   441: iconst_0
    //   442: anewarray 4	java/lang/Object
    //   445: invokestatic 215	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   448: aload_2
    //   449: monitorenter
    //   450: aload_2
    //   451: invokevirtual 163	com/tencent/beacon/a/b/c:g	()[Lcom/tencent/beacon/a/b/b;
    //   454: astore_1
    //   455: aload_2
    //   456: iconst_3
    //   457: invokevirtual 132	com/tencent/beacon/a/b/c:a	(I)V
    //   460: aload_2
    //   461: monitorexit
    //   462: aload_1
    //   463: ifnull +205 -> 668
    //   466: ldc -39
    //   468: iconst_0
    //   469: anewarray 4	java/lang/Object
    //   472: invokestatic 90	com/tencent/beacon/e/b:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   475: aload_1
    //   476: arraylength
    //   477: istore 5
    //   479: iconst_0
    //   480: istore 4
    //   482: iload 4
    //   484: iload 5
    //   486: if_icmpge +182 -> 668
    //   489: aload_1
    //   490: iload 4
    //   492: aaload
    //   493: invokeinterface 219 1 0
    //   498: iload 4
    //   500: iconst_1
    //   501: iadd
    //   502: istore 4
    //   504: goto -22 -> 482
    //   507: aload_1
    //   508: new 221	com/tencent/beacon/upload/c
    //   511: dup
    //   512: aload_0
    //   513: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   516: iconst_0
    //   517: bipush 100
    //   519: invokespecial 224	com/tencent/beacon/upload/c:<init>	(Landroid/content/Context;II)V
    //   522: invokeinterface 229 2 0
    //   527: invokestatic 66	com/tencent/beacon/a/b/e:a	()Lcom/tencent/beacon/a/b/e;
    //   530: invokevirtual 232	com/tencent/beacon/a/b/e:f	()Z
    //   533: ifeq +111 -> 644
    //   536: iconst_1
    //   537: istore 4
    //   539: new 234	com/tencent/beacon/e/d
    //   542: dup
    //   543: aload_0
    //   544: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   547: invokespecial 236	com/tencent/beacon/e/d:<init>	(Landroid/content/Context;)V
    //   550: astore_3
    //   551: iload 4
    //   553: istore 5
    //   555: iload 4
    //   557: ifeq +17 -> 574
    //   560: iload 4
    //   562: istore 5
    //   564: aload_3
    //   565: invokevirtual 238	com/tencent/beacon/e/d:b	()Z
    //   568: ifeq +6 -> 574
    //   571: iconst_0
    //   572: istore 5
    //   574: ldc 45
    //   576: aload_0
    //   577: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   580: invokestatic 241	com/tencent/beacon/b/a:a	(Landroid/content/Context;)Lcom/tencent/beacon/b/a;
    //   583: invokevirtual 243	com/tencent/beacon/b/a:b	()Ljava/lang/String;
    //   586: invokevirtual 57	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   589: ifeq +6 -> 595
    //   592: iconst_1
    //   593: istore 5
    //   595: iload 5
    //   597: ifeq -158 -> 439
    //   600: invokestatic 66	com/tencent/beacon/a/b/e:a	()Lcom/tencent/beacon/a/b/e;
    //   603: invokevirtual 246	com/tencent/beacon/a/b/e:j	()Z
    //   606: ifne -167 -> 439
    //   609: new 248	com/tencent/beacon/a/b/d$1
    //   612: dup
    //   613: aload_0
    //   614: aload_1
    //   615: aload_3
    //   616: invokespecial 251	com/tencent/beacon/a/b/d$1:<init>	(Lcom/tencent/beacon/a/b/d;Lcom/tencent/beacon/upload/h;Lcom/tencent/beacon/e/d;)V
    //   619: astore_1
    //   620: invokestatic 256	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   623: aload_1
    //   624: invokevirtual 259	com/tencent/beacon/a/e:a	(Ljava/lang/Runnable;)V
    //   627: goto -188 -> 439
    //   630: astore_1
    //   631: ldc_w 261
    //   634: iconst_0
    //   635: anewarray 4	java/lang/Object
    //   638: invokestatic 94	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   641: goto -202 -> 439
    //   644: iconst_0
    //   645: istore 4
    //   647: goto -108 -> 539
    //   650: ldc_w 263
    //   653: iconst_0
    //   654: anewarray 4	java/lang/Object
    //   657: invokestatic 215	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   660: goto -221 -> 439
    //   663: astore_1
    //   664: aload_2
    //   665: monitorexit
    //   666: aload_1
    //   667: athrow
    //   668: aload_0
    //   669: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   672: invokestatic 116	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   675: invokevirtual 265	com/tencent/beacon/a/b/c:d	()Lcom/tencent/beacon/a/b/e;
    //   678: astore_1
    //   679: aload_1
    //   680: ifnonnull +14 -> 694
    //   683: ldc_w 267
    //   686: iconst_0
    //   687: anewarray 4	java/lang/Object
    //   690: invokestatic 269	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   693: return
    //   694: aload_1
    //   695: invokevirtual 271	com/tencent/beacon/a/b/e:c	()I
    //   698: ldc_w 272
    //   701: imul
    //   702: i2l
    //   703: lstore 6
    //   705: lload 6
    //   707: lconst_0
    //   708: lcmp
    //   709: ifle +42 -> 751
    //   712: invokestatic 256	com/tencent/beacon/a/e:a	()Lcom/tencent/beacon/a/e;
    //   715: aload_0
    //   716: lload 6
    //   718: invokevirtual 275	com/tencent/beacon/a/e:a	(Ljava/lang/Runnable;J)V
    //   721: ldc_w 277
    //   724: iconst_1
    //   725: anewarray 4	java/lang/Object
    //   728: dup
    //   729: iconst_0
    //   730: lload 6
    //   732: invokestatic 184	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   735: aastore
    //   736: invokestatic 215	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   739: aload_0
    //   740: getfield 21	com/tencent/beacon/a/b/d:a	Landroid/content/Context;
    //   743: invokestatic 116	com/tencent/beacon/a/b/c:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/b/c;
    //   746: iconst_4
    //   747: invokevirtual 132	com/tencent/beacon/a/b/c:a	(I)V
    //   750: return
    //   751: ldc_w 279
    //   754: iconst_0
    //   755: anewarray 4	java/lang/Object
    //   758: invokestatic 215	com/tencent/beacon/e/b:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   761: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	762	0	this	d
    //   9	198	1	localObject1	Object
    //   224	2	1	localThrowable	Throwable
    //   232	4	1	localObject2	Object
    //   286	36	1	arrayOfb	b[]
    //   339	2	1	localInterruptedException1	InterruptedException
    //   347	4	1	localObject3	Object
    //   364	30	1	localh	com.tencent.beacon.upload.h
    //   397	9	1	localInterruptedException2	InterruptedException
    //   454	170	1	localObject4	Object
    //   630	1	1	localException	Exception
    //   663	4	1	localObject5	Object
    //   678	17	1	locale	e
    //   40	625	2	localObject6	Object
    //   550	66	3	locald	com.tencent.beacon.e.d
    //   197	449	4	i	int
    //   194	402	5	j	int
    //   240	491	6	l	long
    //   103	20	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   30	41	224	java/lang/Throwable
    //   45	67	224	java/lang/Throwable
    //   158	179	232	finally
    //   266	271	339	java/lang/InterruptedException
    //   273	294	347	finally
    //   384	390	397	java/lang/InterruptedException
    //   527	536	630	java/lang/Exception
    //   539	551	630	java/lang/Exception
    //   564	571	630	java/lang/Exception
    //   574	592	630	java/lang/Exception
    //   600	627	630	java/lang/Exception
    //   450	462	663	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */