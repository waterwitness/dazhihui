package com.baidu.location.c;

import java.util.concurrent.Callable;

class r
  implements Callable
{
  r(i parami, String[] paramArrayOfString) {}
  
  /* Error */
  public com.baidu.location.BDLocation a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 4
    //   9: new 25	com/baidu/location/BDLocation
    //   12: dup
    //   13: invokespecial 26	com/baidu/location/BDLocation:<init>	()V
    //   16: astore_1
    //   17: aload_1
    //   18: astore_3
    //   19: aload_0
    //   20: getfield 16	com/baidu/location/c/r:a	[Ljava/lang/String;
    //   23: arraylength
    //   24: ifle +95 -> 119
    //   27: invokestatic 32	com/baidu/location/c/i:p	()Landroid/content/Context;
    //   30: invokevirtual 38	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   33: getstatic 41	com/baidu/location/c/i:b	Ljava/lang/String;
    //   36: iconst_0
    //   37: invokevirtual 47	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnull +79 -> 121
    //   45: aload_2
    //   46: ifnull +167 -> 213
    //   49: invokestatic 32	com/baidu/location/c/i:p	()Landroid/content/Context;
    //   52: invokevirtual 51	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   55: aload_2
    //   56: getfield 56	android/content/pm/ProviderInfo:authority	Ljava/lang/String;
    //   59: invokestatic 59	com/baidu/location/c/i:b	(Ljava/lang/String;)Landroid/net/Uri;
    //   62: aload_0
    //   63: getfield 16	com/baidu/location/c/r:a	[Ljava/lang/String;
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: invokevirtual 65	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore_2
    //   73: aload_2
    //   74: invokestatic 70	com/baidu/location/c/p:a	(Landroid/database/Cursor;)Lcom/baidu/location/BDLocation;
    //   77: astore_3
    //   78: aload_3
    //   79: astore_1
    //   80: aload_2
    //   81: ifnull +11 -> 92
    //   84: aload_2
    //   85: invokeinterface 75 1 0
    //   90: aload_3
    //   91: astore_1
    //   92: aload_1
    //   93: astore_2
    //   94: aload_2
    //   95: astore_3
    //   96: aload_2
    //   97: ifnull +22 -> 119
    //   100: aload_2
    //   101: astore_3
    //   102: aload_2
    //   103: invokevirtual 79	com/baidu/location/BDLocation:h	()I
    //   106: bipush 67
    //   108: if_icmpeq +11 -> 119
    //   111: aload_2
    //   112: bipush 66
    //   114: invokevirtual 82	com/baidu/location/BDLocation:a	(I)V
    //   117: aload_2
    //   118: astore_3
    //   119: aload_3
    //   120: areturn
    //   121: aload_0
    //   122: getfield 14	com/baidu/location/c/r:b	Lcom/baidu/location/c/i;
    //   125: invokestatic 85	com/baidu/location/c/i:a	(Lcom/baidu/location/c/i;)Lcom/baidu/location/c/s;
    //   128: invokevirtual 91	com/baidu/location/c/s:o	()[Ljava/lang/String;
    //   131: astore 7
    //   133: iconst_0
    //   134: istore 8
    //   136: iload 8
    //   138: aload 7
    //   140: arraylength
    //   141: if_icmpge -96 -> 45
    //   144: invokestatic 32	com/baidu/location/c/i:p	()Landroid/content/Context;
    //   147: invokevirtual 38	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   150: aload 7
    //   152: iload 8
    //   154: aaload
    //   155: iconst_0
    //   156: invokevirtual 47	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   159: astore_3
    //   160: aload_3
    //   161: astore_2
    //   162: aload_3
    //   163: ifnonnull -118 -> 45
    //   166: iload 8
    //   168: iconst_1
    //   169: iadd
    //   170: istore 8
    //   172: aload_3
    //   173: astore_2
    //   174: goto -38 -> 136
    //   177: astore_2
    //   178: aconst_null
    //   179: astore_2
    //   180: aload_2
    //   181: ifnull +165 -> 346
    //   184: aload_2
    //   185: invokeinterface 75 1 0
    //   190: goto -98 -> 92
    //   193: astore_2
    //   194: goto -102 -> 92
    //   197: astore_1
    //   198: aload 4
    //   200: astore_2
    //   201: aload_2
    //   202: ifnull +9 -> 211
    //   205: aload_2
    //   206: invokeinterface 75 1 0
    //   211: aload_1
    //   212: athrow
    //   213: new 93	com/baidu/location/c/q
    //   216: dup
    //   217: aload_0
    //   218: getfield 16	com/baidu/location/c/r:a	[Ljava/lang/String;
    //   221: invokespecial 96	com/baidu/location/c/q:<init>	([Ljava/lang/String;)V
    //   224: astore 4
    //   226: aload 6
    //   228: astore_3
    //   229: aload 5
    //   231: astore_2
    //   232: aload_0
    //   233: getfield 14	com/baidu/location/c/r:b	Lcom/baidu/location/c/i;
    //   236: invokestatic 99	com/baidu/location/c/i:b	(Lcom/baidu/location/c/i;)Lcom/baidu/location/c/a;
    //   239: aload 4
    //   241: invokevirtual 104	com/baidu/location/c/a:a	(Lcom/baidu/location/c/q;)Landroid/database/Cursor;
    //   244: astore 4
    //   246: aload 4
    //   248: astore_3
    //   249: aload 4
    //   251: astore_2
    //   252: aload 4
    //   254: invokestatic 70	com/baidu/location/c/p:a	(Landroid/database/Cursor;)Lcom/baidu/location/BDLocation;
    //   257: astore 5
    //   259: aload 5
    //   261: astore_1
    //   262: aload_1
    //   263: astore_2
    //   264: aload 4
    //   266: ifnull -172 -> 94
    //   269: aload 4
    //   271: invokeinterface 75 1 0
    //   276: aload_1
    //   277: astore_2
    //   278: goto -184 -> 94
    //   281: astore_2
    //   282: aload_1
    //   283: astore_2
    //   284: goto -190 -> 94
    //   287: astore_2
    //   288: aload_1
    //   289: astore_2
    //   290: aload_3
    //   291: ifnull -197 -> 94
    //   294: aload_3
    //   295: invokeinterface 75 1 0
    //   300: aload_1
    //   301: astore_2
    //   302: goto -208 -> 94
    //   305: astore_2
    //   306: aload_1
    //   307: astore_2
    //   308: goto -214 -> 94
    //   311: astore_1
    //   312: aload_2
    //   313: ifnull +9 -> 322
    //   316: aload_2
    //   317: invokeinterface 75 1 0
    //   322: aload_1
    //   323: athrow
    //   324: astore_1
    //   325: aload_3
    //   326: astore_1
    //   327: goto -235 -> 92
    //   330: astore_2
    //   331: goto -120 -> 211
    //   334: astore_2
    //   335: goto -13 -> 322
    //   338: astore_1
    //   339: goto -138 -> 201
    //   342: astore_3
    //   343: goto -163 -> 180
    //   346: goto -254 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	this	r
    //   16	77	1	localObject1	Object
    //   197	15	1	localObject2	Object
    //   261	46	1	localBDLocation1	com.baidu.location.BDLocation
    //   311	12	1	localObject3	Object
    //   324	1	1	localException1	Exception
    //   326	1	1	localObject4	Object
    //   338	1	1	localObject5	Object
    //   40	134	2	localObject6	Object
    //   177	1	2	localException2	Exception
    //   179	6	2	localObject7	Object
    //   193	1	2	localException3	Exception
    //   200	78	2	localObject8	Object
    //   281	1	2	localException4	Exception
    //   283	1	2	localBDLocation2	com.baidu.location.BDLocation
    //   287	1	2	localException5	Exception
    //   289	13	2	localBDLocation3	com.baidu.location.BDLocation
    //   305	1	2	localException6	Exception
    //   307	10	2	localBDLocation4	com.baidu.location.BDLocation
    //   330	1	2	localException7	Exception
    //   334	1	2	localException8	Exception
    //   18	308	3	localObject9	Object
    //   342	1	3	localException9	Exception
    //   7	263	4	localObject10	Object
    //   4	256	5	localBDLocation5	com.baidu.location.BDLocation
    //   1	226	6	localObject11	Object
    //   131	20	7	arrayOfString	String[]
    //   134	37	8	i	int
    // Exception table:
    //   from	to	target	type
    //   49	73	177	java/lang/Exception
    //   184	190	193	java/lang/Exception
    //   49	73	197	finally
    //   269	276	281	java/lang/Exception
    //   232	246	287	java/lang/Exception
    //   252	259	287	java/lang/Exception
    //   294	300	305	java/lang/Exception
    //   232	246	311	finally
    //   252	259	311	finally
    //   84	90	324	java/lang/Exception
    //   205	211	330	java/lang/Exception
    //   316	322	334	java/lang/Exception
    //   73	78	338	finally
    //   73	78	342	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */